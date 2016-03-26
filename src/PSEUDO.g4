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

ENT     : 'ENT';
DEC     : 'DEC';
STR     : 'STR';
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

var         : ENT | DEC | STR;

//CONDICION
condicional : IF LPAREN condicion RPAREN THEN conclusion;

condicion   : LPAREN condicion RPAREN AND LPAREN condicion RPAREN | LPAREN condicion RPAREN OR LPAREN condicion RPAREN
            | evaluacion;

comp_operator : GT | GE | LT | LE | EQ;

evaluacion  : (nombre | operacion) comp_operator (nombre | valor);

conclusion  : asignacion | funcion;

//EXPRESIONES
asignacion  : nombre EQ exp | nombre EQ operacion;

operacion   : operacion DIV operacion #Division
            | operacion MULT operacion #Multiplicacion
            | operacion PLUS operacion #Suma
            | operacion MINUS operacion #Resta
            | exp #Numero;

exp         : nombre | valor;

nombre      : NAMEDEF;

valor       : NUMDEF;

//VARIABLES & CONSTANTES
variable    : var nombre | var nombre EQ valor;

constante   : CONST nombre EQ valor;

//FUNCIONES
imprime     : IMPRIME LPAREN (exp | operacion) RPAREN;

lee         : LEE LPAREN nombre RPAREN;
