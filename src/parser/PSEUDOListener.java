// Generated from C:/Users/Programming/Documents/Programacion/Java/PSEUDO/src\PSEUDO.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PSEUDOParser}.
 */
public interface PSEUDOListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(PSEUDOParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(PSEUDOParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void enterCuerpo(PSEUDOParser.CuerpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#cuerpo}.
	 * @param ctx the parse tree
	 */
	void exitCuerpo(PSEUDOParser.CuerpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(PSEUDOParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(PSEUDOParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(PSEUDOParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(PSEUDOParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(PSEUDOParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(PSEUDOParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#bool_type}.
	 * @param ctx the parse tree
	 */
	void enterBool_type(PSEUDOParser.Bool_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#bool_type}.
	 * @param ctx the parse tree
	 */
	void exitBool_type(PSEUDOParser.Bool_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void enterStringLit(PSEUDOParser.StringLitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#stringLit}.
	 * @param ctx the parse tree
	 */
	void exitStringLit(PSEUDOParser.StringLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleConclusion}
	 * labeled alternative in {@link PSEUDOParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterSimpleConclusion(PSEUDOParser.SimpleConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleConclusion}
	 * labeled alternative in {@link PSEUDOParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitSimpleConclusion(PSEUDOParser.SimpleConclusionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code elseConclusion}
	 * labeled alternative in {@link PSEUDOParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterElseConclusion(PSEUDOParser.ElseConclusionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code elseConclusion}
	 * labeled alternative in {@link PSEUDOParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitElseConclusion(PSEUDOParser.ElseConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(PSEUDOParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(PSEUDOParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(PSEUDOParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(PSEUDOParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#evaluacion}.
	 * @param ctx the parse tree
	 */
	void enterEvaluacion(PSEUDOParser.EvaluacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#evaluacion}.
	 * @param ctx the parse tree
	 */
	void exitEvaluacion(PSEUDOParser.EvaluacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void enterConclusion(PSEUDOParser.ConclusionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#conclusion}.
	 * @param ctx the parse tree
	 */
	void exitConclusion(PSEUDOParser.ConclusionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(PSEUDOParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(PSEUDOParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(PSEUDOParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(PSEUDOParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(PSEUDOParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(PSEUDOParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#nombre}.
	 * @param ctx the parse tree
	 */
	void enterNombre(PSEUDOParser.NombreContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#nombre}.
	 * @param ctx the parse tree
	 */
	void exitNombre(PSEUDOParser.NombreContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(PSEUDOParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(PSEUDOParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PSEUDOParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PSEUDOParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#constante}.
	 * @param ctx the parse tree
	 */
	void enterConstante(PSEUDOParser.ConstanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#constante}.
	 * @param ctx the parse tree
	 */
	void exitConstante(PSEUDOParser.ConstanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#imprime}.
	 * @param ctx the parse tree
	 */
	void enterImprime(PSEUDOParser.ImprimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#imprime}.
	 * @param ctx the parse tree
	 */
	void exitImprime(PSEUDOParser.ImprimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PSEUDOParser#lee}.
	 * @param ctx the parse tree
	 */
	void enterLee(PSEUDOParser.LeeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PSEUDOParser#lee}.
	 * @param ctx the parse tree
	 */
	void exitLee(PSEUDOParser.LeeContext ctx);
}