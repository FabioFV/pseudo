package compiler;

import compiler.exceptions.VariableNoDeclaradaException;
import org.antlr.v4.runtime.Token;
import parser.PSEUDOBaseVisitor;
import parser.PSEUDOParser;

import java.util.HashMap;
import java.util.Map;

public class Visitor extends PSEUDOBaseVisitor<String>{

    @Override
    public String visitOperacion(PSEUDOParser.OperacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitVariable(PSEUDOParser.VariableContext ctx) {
        String type = null;
        String name = ctx.varName.getText();
        switch (ctx.var().getText())
        {
            case "ENT":
                type = "int";
                break;
            case "DEC":
                type = "float";
                break;
            case "STR":
                type = "String";
        }

        if(ctx.expr != null)
        {
            String value = visit(ctx.expr);
            return type + " " + name + " = " +value +";";
        }

        return type + " " + name + ";";
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
