grammar TAC;

program : stmts*
        ;

stmts : (ID ':' )? stmt NEWLINE #Smts
      ;

stmt :  assign #StmtAssign
     |  ifCondition #StmtIfCondition
     |  print #StmtPrint
     |  goTo #StmtGoTo
     ;

assign : ID '=' numOrId #AssignIdNumOrId
       | ID '=' operation #AssignIdOperation
       | ID '=' array #AssignIdArray
       | ID '='  condition #AssignIdCondition
       | array '=' numOrId #AssignArrayNumOrId
       ;

ifCondition : 'ifTrue' condition goTo #IfConditionTrue
            | 'ifFalse' condition goTo #IfConditionFalse
            | 'ifTrue' ID goTo #IfConditionIdTrue
            | 'ifFalse' ID goTo #IfConditionIdFalse
            ;

condition : numOrId '>' numOrId #ConditionGreater
          | numOrId '>=' numOrId #ConditionGreaterEqual
          | numOrId '<' numOrId #ConditionLess
          | numOrId '<=' numOrId #ConditionLessEqual
          | numOrId '==' numOrId #ConditionEqual
          | numOrId '!=' numOrId #ConditionDifferent
          ;

goTo : 'goTo' numOrId #GoToNumOrId
     ;

print : 'print' '(' numOrId ')' #PrintNumOrId
      | 'print' '(' array ')' #PrintArray
      | 'print' '(' operation ')' #PrintOperation
      ;

array : ID '[' numOrId ']' #ArrayNum
      ;

operation : numOrId '+' numOrId #OperationAdd
          | numOrId '-' numOrId #OperationSubstract
          | numOrId '*' numOrId #OperationMultiply
          | numOrId '/' numOrId #OperationDivide
          | numOrId '%' numOrId #OperationModule
          ;

numOrId : INT #Number
        | ID #Id
        ;

ID:         [A-Za-z][0-9A-Za-z]*;
INT:        [0-9]+;
NEWLINE:    '\r'? '\n';
WS:         [ \t]+ -> skip;