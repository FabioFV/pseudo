// Generated from C:/Users/Programming/Documents/Programacion/Java/PSEUDO/src\PSEUDO.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PSEUDOParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PSEUDOVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(PSEUDOParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#cuerpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCuerpo(PSEUDOParser.CuerpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(PSEUDOParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(PSEUDOParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(PSEUDOParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#bool_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_type(PSEUDOParser.Bool_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#stringLit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLit(PSEUDOParser.StringLitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(PSEUDOParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(PSEUDOParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#comp_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_operator(PSEUDOParser.Comp_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#evaluacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluacion(PSEUDOParser.EvaluacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#conclusion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConclusion(PSEUDOParser.ConclusionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(PSEUDOParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(PSEUDOParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(PSEUDOParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#nombre}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombre(PSEUDOParser.NombreContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(PSEUDOParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(PSEUDOParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstante(PSEUDOParser.ConstanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#imprime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprime(PSEUDOParser.ImprimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PSEUDOParser#lee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLee(PSEUDOParser.LeeContext ctx);
}