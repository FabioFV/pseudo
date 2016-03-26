package compiler;

import parser.PSEUDOBaseListener;
import parser.PSEUDOBaseVisitor;
import parser.PSEUDOParser;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends PSEUDOBaseVisitor<String>{

    Map<String, Integer> variables = new HashMap<>();

    @Override
    public String visitSuma(PSEUDOParser.SumaContext ctx) {
        return visitChildren(ctx) + "\n" +
                "iadd";
    }

    @Override
    public String visitResta(PSEUDOParser.RestaContext ctx) {
        return visitChildren(ctx) + "\n" +
                "isub";
    }

    @Override
    public String visitMultiplicacion(PSEUDOParser.MultiplicacionContext ctx) {
        return visitChildren(ctx) + "\n" +
                "imul";
    }

    @Override
    public String visitDivision(PSEUDOParser.DivisionContext ctx) {
        return visitChildren(ctx) + "\n" +
                "idiv";
    }

    @Override
    public String visitExp(PSEUDOParser.ExpContext ctx) {
        if(ctx.nombre() != null)
            return visit(ctx.nombre());
        else
            return visit(ctx.valor());
    }

    @Override
    public String visitValor(PSEUDOParser.ValorContext ctx) {
        return "ldc " + ctx.NUMDEF().getText();
    }

        @Override
    public String visitNombre(PSEUDOParser.NombreContext ctx) {
        return "iload " + variables.get(ctx.NAMEDEF().getText());
    }

    @Override
    public String visitImprime(PSEUDOParser.ImprimeContext ctx) {
        return  "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                visit(ctx.getChild(2)) + "\n" +
                "  invokevirtual java/io/PrintStream/println(I)V\n";
    }

    @Override
    public String visitConstante(PSEUDOParser.ConstanteContext ctx) {
        variables.put(ctx.nombre().getText(), variables.size());
        return visit(ctx.valor()) + "\n" +
                "istore " + variables.get(ctx.nombre().getText());
    }

    @Override
    public String visitVariable(PSEUDOParser.VariableContext ctx) {
        variables.put(ctx.varName.getText(), variables.size());

        if(ctx.expr != null)
        {
            return visit(ctx.expr) + "\n" +
                    "istore " + variables.get(ctx.varName.getText());
        }
        return "";
    }

    @Override
    public String visitAsignacion(PSEUDOParser.AsignacionContext ctx) {
        return visit(ctx.exp()) + "\n" +
                "istore " + variables.get(ctx.nombre().getText());
    }

    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }
}
