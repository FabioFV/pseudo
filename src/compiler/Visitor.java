package compiler;

import compiler.exceptions.VariableNoDeclaradaException;
import org.antlr.v4.runtime.Token;
import parser.PSEUDOBaseVisitor;
import parser.PSEUDOParser;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends PSEUDOBaseVisitor<String> {

    Map<String, String> mVarTypes = new HashMap<>();

    @Override
    public String visitExp(PSEUDOParser.ExpContext ctx) {
        if (ctx.getChild(0).equals(ctx.bool_type()))
            return visit(ctx.bool_type());

        else if(ctx.getChild(0).equals(ctx.stringLit()))
            return visit(ctx.stringLit());

        else
            return ctx.getText();
    }

    @Override
    public String visitNombre(PSEUDOParser.NombreContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitValor(PSEUDOParser.ValorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStringLit(PSEUDOParser.StringLitContext ctx) {
        String result = "\"";
        for (int i = 1; i < ctx.getChildCount()-1; i++) {
            result += visit(ctx.getChild(i)) + " ";
        }
        result += "\"";
        return result;
    }

    @Override
    public String visitOperacion(PSEUDOParser.OperacionContext ctx) {
        if (ctx.getChildCount() == 3)
            return visit(ctx.getChild(0)) + ctx.getChild(1) + visit(ctx.getChild(2));
        else
            return visit(ctx.exp());
    }

    @Override
    public String visitBool_type(PSEUDOParser.Bool_typeContext ctx) {
        String type = null;
        switch (ctx.getText()) {
            case "VERDADERO":
                type = "true";
                break;
            case "FALSO":
                type = "false";
                break;
        }
        return type;
    }

    @Override
    public String visitVariable(PSEUDOParser.VariableContext ctx) {
            String type = getJavaDataType(ctx.dataType());
            String name = ctx.varName.getText();
            mVarTypes.put(name, type);

            if (ctx.expr != null) {
                String value = visit(ctx.expr);
                return type + " " + name + " = " + value + ";";
            }

            return type + " " + name + ";";
    }

    @Override
    public String visitConstante(PSEUDOParser.ConstanteContext ctx) {
        String type = getJavaDataType(ctx.dataType());
        String name = ctx.nombre().getText();
        String value = visit(ctx.exp());
        return "final " + type + " " + name + " = " + value + ";";
    }

    private String getJavaDataType(PSEUDOParser.DataTypeContext dataType) {
        String type = null;
        switch (dataType.getText()) {
            case "ENT":
                type = "int";
                break;
            case "DEC":
                type = "double";
                break;
            case "STR":
                type = "String";
                break;
            case "BOOL":
                type = "boolean";
                break;
        }
        return type;
    }

    @Override
    public String visitImprime(PSEUDOParser.ImprimeContext ctx) {
        String value = visit(ctx.getChild(2));

        if(mVarTypes.get(value) == null) throw new VariableNoDeclaradaException(ctx.exp().getStart());

        return "System.out.println(" + value + ");\n";
    }

    @Override
    public String visitLee(PSEUDOParser.LeeContext ctx) {
        String name = ctx.nombre().getText();
        String type = mVarTypes.get(name);

        if(mVarTypes.get(name) == null) throw new VariableNoDeclaradaException(ctx.nombre().getStart());

        switch (type) {
            case "int":
                return name + " = input.nextInt();";
            case "float":
                return name + " = input.nextDouble();";
            case "String":
                String dummy = "input.nextLine();\n";
                return dummy + name + " = input.nextLine();";
        }
        return super.visitLee(ctx);
    }

    @Override
    public String visitAsignacion(PSEUDOParser.AsignacionContext ctx) {
        String name = ctx.nombre().getText();
        if(mVarTypes.get(name) == null)
            throw new VariableNoDeclaradaException(ctx.nombre().getStart());
        String value = visit(ctx.operacion());
        return name + " = " + value + ";";
    }

    @Override
    public String visitCondicion(PSEUDOParser.CondicionContext ctx) {
        if (ctx.getChildCount() == 1) {
            if (mVarTypes.get(ctx.getText()) == null) throw new VariableNoDeclaradaException(ctx.getStart());
            return ctx.getText();
        }
        else {
            String signo;
            if (ctx.getChild(3).equals(ctx.AND()))
                signo = "&&";
            else
                signo = "||";
            return visit(ctx.getChild(1)) + signo + visit(ctx.getChild(5));
        }
    }

    @Override
    public String visitSimpleConclusion(PSEUDOParser.SimpleConclusionContext ctx) {
        return "if (" + visit(ctx.condicion()) + ')' +
                "{" + visit(ctx.conclusion()) + "}";
    }

    @Override
    public String visitElseConclusion(PSEUDOParser.ElseConclusionContext ctx) {
        return "if (" + visit(ctx.condicion()) + ')' +
                "{" + visit(ctx.conclusion(0)) + "}" +
                "else {" + visit(ctx.conclusion(1)) + "}";
    }

    @Override
    public String visitMientras(PSEUDOParser.MientrasContext ctx) {
        return "while(" + visit(ctx.condicion()) + ")" +
                "{" + visit(ctx.conclusion()) + "}";
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
