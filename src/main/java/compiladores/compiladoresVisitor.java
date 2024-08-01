// Generated from /Users/manud/Documents/Final TC/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

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
	 * Visit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(compiladoresParser.TipoContext ctx);
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
	 * Visit a parse tree produced by {@link compiladoresParser#tipos_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_return(compiladoresParser.Tipos_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#calculo_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculo_return(compiladoresParser.Calculo_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(compiladoresParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(compiladoresParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(compiladoresParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#inicializacion_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion_variable(compiladoresParser.Inicializacion_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#lista_identificadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_identificadores(compiladoresParser.Lista_identificadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(compiladoresParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiladoresParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(compiladoresParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(compiladoresParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(compiladoresParser.BloqueContext ctx);
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
	 * Visit a parse tree produced by {@link compiladoresParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(compiladoresParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(compiladoresParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listado_comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListado_comparacion(compiladoresParser.Listado_comparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(compiladoresParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#ciclo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo(compiladoresParser.CicloContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#cambio_variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCambio_variable(compiladoresParser.Cambio_variableContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(compiladoresParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#bloque_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_funcion(compiladoresParser.Bloque_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#tipo_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_funcion(compiladoresParser.Tipo_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(compiladoresParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#lista_parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_parametros(compiladoresParser.Lista_parametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#factores_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactores_funcion(compiladoresParser.Factores_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#listado_factores_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListado_factores_funcion(compiladoresParser.Listado_factores_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiladoresParser#escribir_consola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscribir_consola(compiladoresParser.Escribir_consolaContext ctx);
}