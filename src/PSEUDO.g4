grammar PSEUDO;

INICIO  : 'PROGRAMA';
FIN     : 'FIN';

IF      : 'SI' ;
THEN    : 'ENTONCES';
ELSE    : 'SINO';

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
POINT   : '.';

ENT     : 'ENT';
DEC     : 'DEC';
STR     : 'STR';
BOOL    : 'BOOL';

CONST   : 'CONST';

IMPRIME : 'IMPRIME';
LEE     : 'LEE';

MIENTRAS : 'MIENTRAS';

NAMEDEF     : [a-zA-Z]+;
NUMDEF      : [0-9]+;

WS          : [ \t\r\n]+ -> skip ;
COMMENT : '//' .+? ('\n'|EOF) -> skip ;

//LENGUAJE

programa    : INICIO cuerpo FIN;

cuerpo      : (declaracion | funcion | asignacion | mientras | condicional)*;

declaracion :  variable | constante;

funcion     : imprime | lee;

dataType    : ENT | DEC | STR | BOOL;

bool_type   : TRUE | FALSE;

stringLit : QT (nombre|valor)+ QT;

//CONDICION
condicional : IF LPAREN condicion RPAREN THEN conclusion #simpleConclusion
            | IF LPAREN condicion RPAREN THEN conclusion ELSE conclusion #elseConclusion;

condicion   : LPAREN condicion RPAREN AND LPAREN condicion RPAREN | LPAREN condicion RPAREN OR LPAREN condicion RPAREN
            | evaluacion | nombre;

comp_operator : GT | GE | LT | LE | EQ;

evaluacion  : (nombre | operacion) comp_operator (nombre | valor);

conclusion  : '{'cuerpo'}';

//EXPRESIONES
asignacion  : nombre EQ operacion;

operacion   : operacion DIV operacion
            | operacion MULT operacion
            | operacion MINUS operacion
            | operacion PLUS operacion
            | exp;

exp         : nombre | valor | bool_type | stringLit;

nombre      : NAMEDEF;

valor       : MINUS? NUMDEF + (POINT NUMDEF +)?;


//VARIABLES & CONSTANTES
variable    : dataType varName=nombre | dataType varName=nombre EQ expr=operacion;

constante   : CONST dataType nombre EQ exp;

//FUNCIONES
imprime     : IMPRIME LPAREN (exp | operacion) RPAREN;

lee         : LEE LPAREN nombre RPAREN;

//CICLO
mientras    : MIENTRAS LPAREN condicion RPAREN conclusion;