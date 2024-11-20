grammar test;

program: FORS * EOF;
FORS : 'for ' ID ',' NUMBER ',' NUMBER ',' NUMBER [\r]* [\n]* '{' [\r]* [\n]* (EXPRE)* [\r]* [\n]* '}'  [\r]* [\n]* ;
EXPRE : ID '=' VALUE [\n]* | ID '=' NUMBER [\n]*;
NUMBER : [0-9]+ ('.' [0-9])*;
ID: [a-zA-Z]+;
VALUE : '"'~[\t\r\n]+ '"' ;
WS : [ \t\r\n] ->skip;