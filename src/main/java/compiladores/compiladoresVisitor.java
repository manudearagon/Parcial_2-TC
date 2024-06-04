// Generated from /Users/manud/Desktop/TC/Parcial 2/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

 package compiladores;
 
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiladoresParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiladoresVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(compiladoresParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(compiladoresParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(compiladoresParser.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condiciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondiciones(compiladoresParser.CondicionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(compiladoresParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(compiladoresParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(compiladoresParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(compiladoresParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(compiladoresParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_parametros(compiladoresParser.Declaracion_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#instanciar_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstanciar_funcion(compiladoresParser.Instanciar_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(compiladoresParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#escribir_consola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir_consola(compiladoresParser.Escribir_consolaContext ctx);
}