package compiler.exceptions;

import org.antlr.v4.runtime.Token;

/**
 * Created by Fabio Ferreras on 3/26/2016.
 */
public class VariableNoDeclaradaException extends RuntimeException
{
    private int line;
    private int column;
    private String varName;

    public VariableNoDeclaradaException(Token  varNameToken)
    {
        line = varNameToken.getLine();
        column = varNameToken.getCharPositionInLine();
        varName = varNameToken.getText();
    }

    @Override
    public String getMessage() {
        return line + ":" + column + " variable no declarada <" + varName + ">";
    }
}
