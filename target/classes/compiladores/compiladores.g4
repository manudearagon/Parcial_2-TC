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
fragment MAYOR : '>' ;
fragment MENOR : '<' ;
fragment MAYORIGUAL : '>=' ;
fragment MENORIGUAL : '<=' ;
fragment IGUALIGUAL : '==' ;
fragment DIFERENTE : '!=' ;
fragment AND : '&&' ;
fragment OR : '||' ;
fragment NOT : '!' ;




//palabras reservadas

WHILE : 'while' ;
FOR : 'for' ; 
IF : 'if' ;
ELSE : 'else' ;

DT : 'int' | 'double';
COMP : MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALIGUAL | DIFERENTE ;
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
            ;

declaracion : DT ID PYC
            | DT asignacion
            ;



asignacion : ID IGUAL expresiones
           | ID INCREMENTAR
           | ID DECREMENTAR 
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

  

condicion   : (ID | NUMERO) COMP (ID | NUMERO)
            ;

condiciones : condicion LOGICO condiciones
            | condicion
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
