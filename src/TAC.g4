grammar TAC;

program : block  ;

block : '{' stmts  '}'
      ;

stmts : stmts stmt
      |
      ;

stmt :  expr
     | 'ifTrue' '(' expr ')' stmt
     | 'ifFalse' '(' expr ')' stmt
     | 'while' '(' expr ')' stmt
     | 'do' stmt 'while' '(' expr ')'
     | 'print' '(' expr ')'
     | block
     ;

expr : acc '=' expr
     | rel
     ;

acc  :  ID
     |  ID '[' expr ']'
     ;

rel  : rel '<' add
     | rel '<=' add
     | rel '!=' add
     | rel '==' add
     | add
     ;

add  : add '+' term
     | add '-' term
     | term
     ;

term : term '*' factor
     | term '/' factor
     | factor
     ;

factor : '(' expr ')'
       | acc
       | NUM
       ;

NUM : [0-9]+;
ID : [A-Za-z][0-9A-Za-z]*;
WS: [ \t\r\n]+ -> skip;
