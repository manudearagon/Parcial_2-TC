grammar compiladores;

 @header {
 package compiladores;
 }

//tokens
PA : '(' ;
PC : ')' ; 
CA : '[' ;
CC : ']' ;
LA : '{' ;
LC : '}' ; 
fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9] ;
WS : [ \t\n\r]+ -> skip ;
COMILLA : '"' ;
COMILLASIMPLE : '\'' ;
//simbolos
PYC : ';' ;
IGUAL : '=' ;

MAS : '+' ;
MENOS : '-' ;
MULTIPLICACION : '*' ;
fragment DIVISION : '/' ;
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




//palabras reservadas

WHILE : 'while' ;
FOR : 'for' ; 
IF : 'if' ;
ELSE : 'else' ;
RETURN : 'return' ;
PRINTF : 'printf' ;
DT : 'int' | 'double'
    | 'char' | 'string'
    | 'bool' | 'void'
    | 'float' | 'long'
    ;
OPERADOR : MAS | MENOS | MULTIPLICACION | DIVISION | MODULO ;
LOGICO : AND | OR | NOT ;

NUMERO : DIGITO+ ;
ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;

programa : instrucciones EOF ;

instrucciones : instruccion*
              ;

instruccion :declaracion
            |asignacion
            |while
            |if
            |for
            |declaracion_funcion
            |instanciar_funcion
            |comentario
            |return
            ;

declaracion : DT ID PYC?
            | DT asignacion
            | DT ID COMA
            ;

asignacion : ID IGUAL expresiones
           | ID INCREMENTAR PYC?
           | ID DECREMENTAR PYC?
           ;

expresiones   : expr PYC expresiones?
              ;


expr  : term t;

term  : factor f;

t     : MAS term t
      | MENOS term t
      |
      ;

factor : NUMERO
       | ID
       | PA expr PC
       ;

f : OPERADOR factor f
  | INCREMENTAR
  | DECREMENTAR
  |
  ;



condicion   : (ID | NUMERO) MAYOR (ID | NUMERO)
            | (ID | NUMERO) MENOR (ID | NUMERO)
            | (ID | NUMERO) MAYORIGUAL (ID | NUMERO)
            | (ID | NUMERO) MENORIGUAL (ID | NUMERO)
            | (ID | NUMERO) IGUALIGUAL (ID | NUMERO)
            | (ID | NUMERO) DIFERENTE (ID | NUMERO)
            | (ID | NUMERO) LOGICO (ID | NUMERO)
            | NOT (ID | NUMERO)
            | PA condicion PC
            ;

condiciones : condicion LOGICO condiciones
            | condicion
            ;

return : RETURN (ID | NUMERO) PYC
        | RETURN expr PYC
        | RETURN PYC
       ;

bloque : LA instruccion* LC
       ;

while : WHILE PA condicion PC (bloque | instruccion)
      ;

if : IF PA condicion PC (bloque | instruccion) else?
   ;

else : ELSE (bloque | instruccion)
     ;

for : FOR PA ((declaracion|asignacion)|PYC) (condiciones) PYC asignacion? PC (bloque | instruccion)
    ;

declaracion_parametros :  declaracion (declaracion)*
            |
           ;

parametros : (ID | NUMERO) (COMA (ID | NUMERO))*
           |
           ;

declaracion_funcion : DT ID PA declaracion_parametros PC (bloque | instruccion)
        ;

instanciar_funcion : ID PA parametros PC PYC
        ;

comentario : '//' .*? '\n'
           ;



escribir_consola : PRINTF PA (COMILLA .*? COMILLA | COMILLASIMPLE .*? COMILLASIMPLE) PYC
                 ;

