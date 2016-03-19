grammar PSEUDO;

INICIO  : 'PROGRAMA';
FIN     : 'FIN';

IF      : 'SI' ;
THEN    : 'ENTONCES';

AND     : 'Y' ;
OR      : 'O' ;

TRUE    : 'VERDADERO' ;
FALSE   : 'FALSO' ;

MULT    : '*' ;
DIV     : '/' ;
PLUS    : '+' ;
MINUS   : '-' ;

GT      : '>' ;
GE      : '>=' ;
LT      : '<' ;
LE      : '<=' ;
EQ      : '=' ;

LPAREN  : '(' ;
RPAREN  : ')' ;

VAR     : 'VAR';
CONST   : 'CONST';
IMPRIME : 'IMPRIME';
LEE     : 'LEE';

NAMEDEF     : [a-zA-Z]+;
NUMDEF      : [0-9]+;

WS          : [ \t\r\n]+ -> skip ;
COMMENT : '//' .+? ('\n'|EOF) -> skip ;

//LENGUAJE

programa    : INICIO cuerpo FIN;

cuerpo      : (declaracion | funcion | asignacion | condicional)*;

declaracion :  variable | constante;

funcion     : imprime | lee;

condicional : IF LPAREN condicion RPAREN THEN conclusion;

condicion   : condicion AND condicion | condicion OR condicion | evaluacion;

comp_operator : GT | GE | LT | LE | EQ;

evaluacion   : nombre comp_operator (nombre | valor);

conclusion  : asignacion | funcion;

asignacion  : nombre EQ valor;

variable    : VAR nombre | VAR nombre EQ valor;

constante   : CONST nombre EQ valor;

nombre      : NAMEDEF;

valor       : NUMDEF;

imprime     : IMPRIME LPAREN nombre RPAREN;

lee         : LEE LPAREN nombre RPAREN;
