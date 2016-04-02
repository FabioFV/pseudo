package compiler;

import compiler.exceptions.VariableNoDeclaradaException;
import org.antlr.v4.runtime.Token;
import parser.PSEUDOBaseVisitor;
import parser.PSEUDOParser;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends PSEUDOBaseVisitor<String>{

    @Override
    public String visitExp(PSEUDOParser.ExpContext ctx) {
        if(ctx.getChild(0).equals(ctx.bool_type()))
            return visit(ctx.bool_type());
        else
            return ctx.getText();
    }

    @Override
    public String visitOperacion(PSEUDOParser.OperacionContext ctx) {
        if(ctx.getChildCount() == 3)
            return visit(ctx.getChild(0)) + ctx.getChild(1) + visit(ctx.getChild(2));
        else
            return visit(ctx.exp());
    }

    @Override
    public String visitBool_type(PSEUDOParser.Bool_typeContext ctx) {
        String type =  null;
        switch (ctx.getText())
        {
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

        if(ctx.expr != null)
        {
            String value = visit(ctx.expr);
            return type + " " + name + " = " +value +";";
        }

        return type + " " + name + ";";
    }

    @Override
    public String visitConstante(PSEUDOParser.ConstanteContext ctx) {
        String type = getJavaDataType(ctx.dataType());
        String name = ctx.nombre().getText();
        String value = visit(ctx.exp());
        return "final " + type + " " + name + " = " +value +";";
    }

    private String getJavaDataType(PSEUDOParser.DataTypeContext dataType)
    {
        String type =  null;
        switch (dataType.getText())
        {
            case "ENT":
                type = "int";
                break;
            case "DEC":
                type = "float";
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
        return  "System.out.println(" + value + ");\n";
    }

    @Override
    public String visitAsignacion(PSEUDOParser.AsignacionContext ctx) {
        String name = ctx.nombre().getText();
        String value = visit(ctx.operacion());
        return name + " = " +value +";";
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
