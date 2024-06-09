grammar compiladores;

 @header {
 package compiladores;
 }

//tokens
fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9] ;
PA : '(' ;
PC : ')' ; 
CA : '[' ;
CC : ']' ;
LA : '{' ;
LC : '}' ; 
COMILLA : '"' ;
COMILLASIMPLE : '\'' ;
//simbolos
PYC : ';' ;
IGUAL : '=' ;
MAS : '+' ;
MENOS : '-' ;
MULTIPLICACION : '*' ;
DIVISION : '/' ;
MODULO : '%' ;
INCREMENTAR : '++' ;
DECREMENTAR : '--' ;
COMA : ',' ;
MAYOR : '>' ;
MENOR : '<' ;
MAYORIGUAL : '>=' ;
MENORIGUAL : '<=' ;
IGUALIGUAL : '==' ;
DIFERENTE : '!=' ;
AND : '&&' ;
OR : '||' ;
NOT : '!' ;

WS : [ \t\n\r]+ -> skip ;



//palabras reservadas

WHILE   : 'while' ;
FOR     : 'for' ; 
IF      : 'if' ;
ELSE    : 'else' ;
RETURN  : 'return' ;
PRINTF  : 'printf' ;
DT      : 'int' 
        | 'double';
TIPOSFUNCION: DT
            | 'void'
            | 'char'
            | 'string'
            | 'bool'
            ;
OPERADOR : MAS | MENOS | MULTIPLICACION | DIVISION | MODULO ;
LOGICO : AND | OR | NOT ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa: instrucciones EOF;

instrucciones : instruccion instrucciones
                |
              ;

instruccion : declaracion
            | asignacion
            | bloque
            | if
            | while
            | for
            | funcion
            | declaracion_funcion
            | llamada_funcion
            | comentario
            | escribir_consola
            | return
            ;

return  : RETURN factores_funcion PYC
        | RETURN PYC
        ;

declaracion: tipo ID inicializacion_variable lista_identificadores PYC;

tipo: DT;

inicializacion_variable: IGUAL NUMERO
                        |
                        ;

lista_identificadores: COMA ID inicializacion_variable lista_identificadores
                      |
                      ;

asignacion: ID IGUAL expresion PYC;

expresion: termino exp
         ;

termino : factor term 
        ;

exp     : MAS termino exp
        | MENOS termino exp
        | 
        ;

term: MULTIPLICACION factor term
    | DIVISION factor term
    | MODULO factor term
    | 
    ;

factor: ID
      | NUMERO
      | PA expresion PC
      ;

bloque : LA instrucciones LC ;

if      : IF condicion bloque else
        ;

else    : ELSE bloque
        | ELSE IF condicion bloque
        ;

while   : WHILE condicion bloque
        ;

condicion : PA comparacion listado_comparacion PC
          ;

comparacion : factor comparador factor
            ;

comparador      : MAYOR
                | MENOR
                | MAYORIGUAL
                | MENORIGUAL
                | IGUALIGUAL
                | DIFERENTE
                ;

listado_comparacion : LOGICO comparacion listado_comparacion
                    |
                    ;

for     : FOR ciclo bloque
        ;

ciclo   : PA declaracion comparacion PYC ID cambio_variable PC
        ;

cambio_variable : ID INCREMENTAR
                | ID DECREMENTAR
                ;

funcion : tipo_funcion ID PA variables_funcion PC bloque
        ;

declaracion_funcion : tipo_funcion ID PA variables_funcion PC bloque
                    ;

llamada_funcion : ID PA lista_variables_funcion PC PYC
                ;

tipo_funcion : TIPOSFUNCION
             ;

variables_funcion : tipo ID lista_variables_funcion
                  | tipo lista_variables_funcion
                  |
                  ;

lista_variables_funcion : COMA tipo ID lista_variables_funcion
                        | COMA tipo lista_variables_funcion
                        |
                        ;

factores_funcion: NUMERO listado_factores_funcion
                | ID listado_factores_funcion
                | PA expresion PC listado_factores_funcion
                ;

listado_factores_funcion: COMA factores_funcion listado_factores_funcion
                        | COMA ID listado_factores_funcion
                        | COMA PA expresion PC listado_factores_funcion
                        |
                        ;

comentario : '//' .*? 
           ;

escribir_consola : PRINTF PA (COMILLA .*? COMILLA | COMILLASIMPLE .*? COMILLASIMPLE) PYC
                 ;

