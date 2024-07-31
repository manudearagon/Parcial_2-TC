grammar compiladores;

@header {
 package compiladores;
}

// Tokens
fragment LETRA: [A-Za-z];
fragment DIGITO: [0-9];
PA: '(';
PC: ')';
CA: '[';
CC: ']';
LA: '{';
LC: '}';
COMILLA: '"';
COMILLASIMPLE: '\'';
// Símbolos
PYC: ';';
IGUAL: '=';
MAS: '+';
MENOS: '-';
MULTIPLICACION: '*';
DIVISION: '/';
MODULO: '%';
INCREMENTAR: '++';
DECREMENTAR: '--';
COMA: ',';
MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
IGUALIGUAL: '==';
DIFERENTE: '!=';
AND: '&&';
OR: '||';
NOT: '!';

WS: [ \t\n\r]+ -> skip;

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Palabras reservadas
WHILE: 'while';
FOR: 'for';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
PRINTF: 'printf';
DT: 'int' | 'double';
TIPOSFUNCION: DT | 'void' | 'char' | 'string' | 'bool';
OPERADOR: MAS | MENOS | MULTIPLICACION | DIVISION | MODULO;
LOGICO: AND | OR | NOT;

NUMERO: '-'? DIGITO+;
ID: (LETRA | '_') (LETRA | DIGITO | '_')*;

// Reglas
programa: instrucciones EOF;

instrucciones: instruccion instrucciones |;

instruccion:
	declaracion
	| asignacion
	| bloque
	| if
	| while
	| for
	| funcion
	| declaracion_funcion
	| llamada_funcion
	| operacion
	| escribir_consola
	| return;

return: RETURN factores_funcion PYC | RETURN PYC;

operacion:
	NUMERO OPERADOR NUMERO PYC
	| ID OPERADOR ID PYC
	| ID OPERADOR NUMERO PYC
	| NUMERO OPERADOR ID PYC
	| ID cambio_variable PYC;

declaracion:
	tipo ID IGUAL inicializacion_variable lista_identificadores PYC;

tipo: DT;

inicializacion_variable:
	NUMERO
	| ID
	| PA expresion PC
	| expresion;

lista_identificadores:
	COMA ID IGUAL inicializacion_variable lista_identificadores
	|;

asignacion: ID IGUAL expresion PYC;

expresion: termino exp;

termino: factor term;

exp:
	MAS expresion
	| MENOS expresion
	| MULTIPLICACION expresion
	| DIVISION expresion
	| INCREMENTAR
	| DECREMENTAR
	|;

term:
	MULTIPLICACION factor term
	| DIVISION factor term
	| MODULO factor term
	|;

factor: ID | NUMERO | PA expresion PC;

bloque: LA instrucciones LC;

if: IF condicion bloque else;

else: ELSE bloque | ELSE IF condicion bloque |;

while: WHILE condicion bloque;

condicion: PA comparacion listado_comparacion PC;

comparacion: factor comparador factor;

comparador:
	MAYOR
	| MENOR
	| MAYORIGUAL
	| MENORIGUAL
	| IGUALIGUAL
	| DIFERENTE;

listado_comparacion: LOGICO comparacion listado_comparacion |;

for: FOR ciclo bloque;

ciclo: PA declaracion comparacion PYC cambio_variable PC;

cambio_variable: ID exp;

declaracion_funcion: tipo_funcion ID PA parametros PC bloque;

funcion: tipo_funcion ID PA parametros PC bloque_funcion;

bloque_funcion: LA instrucciones return LC;

llamada_funcion: ID PA lista_parametros PC PYC;

tipo_funcion: TIPOSFUNCION;

parametros: tipo ID lista_parametros |;

lista_parametros: COMA tipo ID lista_parametros |;

factores_funcion:
	NUMERO listado_factores_funcion
	| ID listado_factores_funcion
	| PA expresion PC listado_factores_funcion;

listado_factores_funcion:
	COMA factores_funcion listado_factores_funcion
	|;

escribir_consola:
	PRINTF PA (
		COMILLA .*? COMILLA
		| COMILLASIMPLE .*? COMILLASIMPLE
	) PC PYC;