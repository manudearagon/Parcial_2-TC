// Generated from /Users/manud/Documents/Final TC/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

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
	 * Enter a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(compiladoresParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(compiladoresParser.OperacionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(compiladoresParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#inicializacion_variable}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion_variable(compiladoresParser.Inicializacion_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#inicializacion_variable}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion_variable(compiladoresParser.Inicializacion_variableContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void enterLista_identificadores(compiladoresParser.Lista_identificadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#lista_identificadores}.
	 * @param ctx the parse tree
	 */
	void exitLista_identificadores(compiladoresParser.Lista_identificadoresContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(compiladoresParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(compiladoresParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiladoresParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiladoresParser.ExpContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(compiladoresParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 */
	void enterComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#comparador}.
	 * @param ctx the parse tree
	 */
	void exitComparador(compiladoresParser.ComparadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listado_comparacion}.
	 * @param ctx the parse tree
	 */
	void enterListado_comparacion(compiladoresParser.Listado_comparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listado_comparacion}.
	 * @param ctx the parse tree
	 */
	void exitListado_comparacion(compiladoresParser.Listado_comparacionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void enterCiclo(compiladoresParser.CicloContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#ciclo}.
	 * @param ctx the parse tree
	 */
	void exitCiclo(compiladoresParser.CicloContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#cambio_variable}.
	 * @param ctx the parse tree
	 */
	void enterCambio_variable(compiladoresParser.Cambio_variableContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#cambio_variable}.
	 * @param ctx the parse tree
	 */
	void exitCambio_variable(compiladoresParser.Cambio_variableContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(compiladoresParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(compiladoresParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#tipo_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_funcion(compiladoresParser.Tipo_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#tipo_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_funcion(compiladoresParser.Tipo_funcionContext ctx);
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
	 * Enter a parse tree produced by {@link compiladoresParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void enterLista_parametros(compiladoresParser.Lista_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#lista_parametros}.
	 * @param ctx the parse tree
	 */
	void exitLista_parametros(compiladoresParser.Lista_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#factores_funcion}.
	 * @param ctx the parse tree
	 */
	void enterFactores_funcion(compiladoresParser.Factores_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#factores_funcion}.
	 * @param ctx the parse tree
	 */
	void exitFactores_funcion(compiladoresParser.Factores_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiladoresParser#listado_factores_funcion}.
	 * @param ctx the parse tree
	 */
	void enterListado_factores_funcion(compiladoresParser.Listado_factores_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiladoresParser#listado_factores_funcion}.
	 * @param ctx the parse tree
	 */
	void exitListado_factores_funcion(compiladoresParser.Listado_factores_funcionContext ctx);
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