package compiler;

import parser.PSEUDOBaseListener;
import parser.PSEUDOBaseVisitor;
import parser.PSEUDOParser;

public class Visitor extends PSEUDOBaseVisitor<String>{

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
    public String visitValor(PSEUDOParser.ValorContext ctx) {
        return "ldc " + ctx.getChild(0).getText();
    }

    @Override
    public String visitImprime(PSEUDOParser.ImprimeContext ctx) {
        return  "  getstatic java/lang/System/out Ljava/io/PrintStream;\n" +
                visit(ctx.getChild(2)) + "\n" +
                "  invokevirtual java/io/PrintStream/println(I)V\n";
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
