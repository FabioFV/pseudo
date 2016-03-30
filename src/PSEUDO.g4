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

QT      : '"';

ENT     : 'ENT';
DEC     : 'DEC';
STR     : 'STR';
BOOL    : 'BOOL';

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

dataType    : ENT | DEC | STR | BOOL;

bool_type   : TRUE | FALSE;

stringLit : QT nombre QT;

//CONDICION
condicional : IF LPAREN condicion RPAREN THEN conclusion;

condicion   : LPAREN condicion RPAREN AND LPAREN condicion RPAREN | LPAREN condicion RPAREN OR LPAREN condicion RPAREN
            | evaluacion;

comp_operator : GT | GE | LT | LE | EQ;

evaluacion  : (nombre | operacion) comp_operator (nombre | valor);

conclusion  : asignacion | funcion;

//EXPRESIONES
asignacion  : nombre EQ operacion;

operacion   : operacion DIV operacion
            | operacion MULT operacion
            | operacion MINUS operacion
            | operacion PLUS operacion
            | exp;

exp         : nombre | valor | bool_type | stringLit;

nombre      : NAMEDEF;

valor       : NUMDEF;

//VARIABLES & CONSTANTES
variable    : dataType varName=nombre | dataType varName=nombre EQ expr=operacion;

constante   : CONST dataType nombre EQ exp;

//FUNCIONES
imprime     : IMPRIME LPAREN (exp | operacion) RPAREN;

lee         : LEE LPAREN nombre RPAREN;