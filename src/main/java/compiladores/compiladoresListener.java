// Generated from /Users/manud/Desktop/TC/Parcial 2/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

 package compiladores;
 
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiladoresParser}.
 */
public interface compiladoresListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(compiladoresParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(compiladoresParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(compiladoresParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void enterExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresiones}.
	 * @param ctx the parse tree
	 */
	void exitExpresiones(compiladoresParser.ExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(compiladoresParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(compiladoresParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(compiladoresParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(compiladoresParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(compiladoresParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(compiladoresParser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(compiladoresParser.FContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void enterCondiciones(compiladoresParser.CondicionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#condiciones}.
	 * @param ctx the parse tree
	 */
	void exitCondiciones(compiladoresParser.CondicionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(compiladoresParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(compiladoresParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(compiladoresParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(compiladoresParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(compiladoresParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(compiladoresParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(compiladoresParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(compiladoresParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(compiladoresParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(compiladoresParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(compiladoresParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_parametros}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_parametros(compiladoresParser.Declaracion_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_parametros}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_parametros(compiladoresParser.Declaracion_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#instanciar_funcion}.
	 * @param ctx the parse tree
	 */
	void enterInstanciar_funcion(compiladoresParser.Instanciar_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#instanciar_funcion}.
	 * @param ctx the parse tree
	 */
	void exitInstanciar_funcion(compiladoresParser.Instanciar_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(compiladoresParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(compiladoresParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#escribir_consola}.
	 * @param ctx the parse tree
	 */
	void enterEscribir_consola(compiladoresParser.Escribir_consolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#escribir_consola}.
	 * @param ctx the parse tree
	 */
	void exitEscribir_consola(compiladoresParser.Escribir_consolaContext ctx);
}