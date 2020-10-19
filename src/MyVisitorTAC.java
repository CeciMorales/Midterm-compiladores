import java.util.HashMap;
import java.util.Map;

public class MyVisitorTAC extends TACBaseVisitor<Stmt>{

    int counter= 0;

    @Override
    public Stmt visitProgram(TACParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitSmts(TACParser.SmtsContext ctx) {
        counter += 1;

        if (ctx.ID() != null){
            String label =  ctx.children.get(0).getText();
            Stmt.memoryLabels.put(label, counter);

        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitStmtAssign(TACParser.StmtAssignContext ctx) {



        return visitChildren(ctx);
    }

    @Override
    public Stmt visitStmtIfCondition(TACParser.StmtIfConditionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitStmtPrint(TACParser.StmtPrintContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitStmtGoTo(TACParser.StmtGoToContext ctx) {
        String aux = ctx.children.get(0).getChild(1).getText();
        if (Stmt.memoryLabels.containsKey(aux)) {
            int line = Stmt.memoryLabels.get(aux);
            GoTo goTo = new GoTo(aux);

            Stmt.staments.add(goTo);
        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitAssignIdNumOrId(TACParser.AssignIdNumOrIdContext ctx) {
        String id = ctx.ID().getText();
        Id identificador = new Id(id);

        if ( ctx.children.get(2) instanceof TACParser.NumberContext ) {

            int aux =  Integer.parseInt(ctx.children.get(2).getText());
            NumOrId number = new NumOrId(aux);
            Assign assign = new Assign(identificador, number);
            Stmt.memoryVariables.put(id, aux);

            Stmt.staments.add(assign);

            return assign;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);

            if (Stmt.memoryVariables.containsKey(aux)) {
                Stmt.memoryVariables.put(id, Stmt.memoryVariables.get(aux));
            }

            Assign assign =  new Assign(identificador, id1);

            Stmt.staments.add(assign);

            return assign;
        }

        return visitChildren(ctx);

    }

    @Override
    public Stmt visitAssignIdOperation(TACParser.AssignIdOperationContext ctx) {
        String idVar = ctx.children.get(0).getText();
        String signo;
        int result;

        if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number1 = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
            NumOrId number2 = new NumOrId(right);

            Operation operation = new Operation(number1, signo, number2);
            result = operation.makeOperation();

            Stmt.memoryVariables.put(idVar, result);

            NumOrId resultNumberOrId = new NumOrId(result);
            Id auxId = new Id(idVar);

            Assign assign = new Assign(auxId, resultNumberOrId );

            Stmt.staments.add(assign);

            return operation;

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(2).getChild(0).getText();

            if (Stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));

                signo = ctx.children.get(2).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Operation operation = new Operation(id, signo, number2);
                result = operation.makeOperation();
                Stmt.memoryVariables.put(idVar, result);

                NumOrId resultNumberOrId = new NumOrId(result);
                Id auxId = new Id(idVar);

                Assign assign = new Assign(auxId, resultNumberOrId );

                Stmt.staments.add(assign);

                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {

            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            String right =  ctx.children.get(2).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(Stmt.memoryVariables.get(right));

                Operation operation = new Operation(number, signo, id);
                result = operation.makeOperation();
                Stmt.memoryVariables.put(idVar, result);

                NumOrId resultNumberOrId = new NumOrId(result);
                Id auxId = new Id(idVar);

                Assign assign = new Assign(auxId, resultNumberOrId );

                Stmt.staments.add(assign);

                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(2).getChild(0).getText();
            String right =  ctx.children.get(2).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(left) && Stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));
                signo = ctx.children.get(2).getChild(1).getText();
                NumOrId id2 = new NumOrId(Stmt.memoryVariables.get(right));

                Operation operation = new Operation(id, signo, id2);
                result = operation.makeOperation();
                Stmt.memoryVariables.put(idVar, result);

                NumOrId resultNumberOrId = new NumOrId(result);
                Id auxId = new Id(idVar);

                Assign assign = new Assign(auxId, resultNumberOrId );

                Stmt.staments.add(assign);

                return operation;

            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitAssignIdArray(TACParser.AssignIdArrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitAssignArrayNumOrId(TACParser.AssignArrayNumOrIdContext ctx) {
        return visitChildren(ctx);
    }


    @Override
    public Stmt visitIfConditionTrue(TACParser.IfConditionTrueContext ctx) {
        String signo;
        boolean result;

        if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number1 = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
            NumOrId number2 = new NumOrId(right);

            Condition condition = new Condition(number1, signo, number2);
            result = condition.makeCondition();

            String aux = ctx.children.get(2).getChild(1).getText();
            if (Stmt.memoryLabels.containsKey(aux)) {
                int line = Stmt.memoryLabels.get(aux);
                GoTo goTo = new GoTo(aux);

                IfTrue ifTrue = new IfTrue(condition, goTo, result, line);
                Stmt.staments.add(ifTrue);
            }

            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (Stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();


                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfTrue ifTrue = new IfTrue(condition, goTo, result, line);
                    Stmt.staments.add(ifTrue);
                }

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();


                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfTrue ifTrue = new IfTrue(condition, goTo, result, line);
                    Stmt.staments.add(ifTrue);
                }

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(left) && Stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfTrue ifTrue = new IfTrue(condition, goTo, result, line);
                    Stmt.staments.add(ifTrue);
                }

                return condition;

            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitIfConditionFalse(TACParser.IfConditionFalseContext ctx) {

        String signo;
        boolean result;

        if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number1 = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
            NumOrId number2 = new NumOrId(right);

            Condition condition = new Condition(number1, signo, number2);
            result = condition.makeCondition();

            String aux = ctx.children.get(2).getChild(1).getText();
            if (Stmt.memoryLabels.containsKey(aux)) {
                int line = Stmt.memoryLabels.get(aux);
                GoTo goTo = new GoTo(aux);

                IfFalse ifFalse = new IfFalse(condition, goTo, result, line);
                Stmt.staments.add(ifFalse);
            }


            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (Stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();

                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfFalse ifFalse = new IfFalse(condition, goTo, result, line);
                    Stmt.staments.add(ifFalse);
                }

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();

                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfFalse ifFalse = new IfFalse(condition, goTo, result, line);
                    Stmt.staments.add(ifFalse);
                }


                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(left) && Stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

                String aux = ctx.children.get(2).getChild(1).getText();
                if (Stmt.memoryLabels.containsKey(aux)) {
                    int line = Stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);

                    IfFalse ifFalse = new IfFalse(condition, goTo, result, line);
                    Stmt.staments.add(ifFalse);
                }

                return condition;

            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionGreater(TACParser.ConditionGreaterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionGreaterEqual(TACParser.ConditionGreaterEqualContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionLess(TACParser.ConditionLessContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionLessEqual(TACParser.ConditionLessEqualContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionEqual(TACParser.ConditionEqualContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitConditionDifferent(TACParser.ConditionDifferentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitGoToNumOrId(TACParser.GoToNumOrIdContext ctx) {
        System.out.println("Entrando a goto num or id ");
        String aux = ctx.children.get(1).getText();
        System.out.println("Entrando a goto num or id " + aux);

        GoTo goTo = new GoTo(aux);
        Stmt.staments.add(goTo);

        /*
        if (Stmt.memoryLabels.containsKey(aux)) {
            int line = Stmt.memoryLabels.get(aux);
            GoTo goTo = new GoTo(aux);

            Stmt.staments.add(goTo);
        }
        */


        return visitChildren(ctx);
    }

    @Override
    public Stmt visitPrintNumOrId(TACParser.PrintNumOrIdContext ctx) {

        if ( ctx.children.get(2) instanceof TACParser.NumberContext ) {

            int aux =  Integer.parseInt(ctx.children.get(2).getText());
            NumOrId number = new NumOrId(aux);

            Print print = new Print(aux);
            Stmt.staments.add(print);

            return print;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);

            if (Stmt.memoryVariables.containsKey(aux)) {
                Print print = new Print(Stmt.memoryVariables.get(aux));
                Stmt.staments.add(print);
            }
        }

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitPrintArray(TACParser.PrintArrayContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitPrintOperation(TACParser.PrintOperationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitArrayNum(TACParser.ArrayNumContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitOperationAdd(TACParser.OperationAddContext ctx) {

        return visitChildren(ctx);
    }

    @Override
    public Stmt visitOperationSubstract(TACParser.OperationSubstractContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitOperationMultiply(TACParser.OperationMultiplyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitOperationDivide(TACParser.OperationDivideContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitOperationModule(TACParser.OperationModuleContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Stmt visitNumber(TACParser.NumberContext ctx) {
        int number = Integer.parseInt(ctx.INT().getText());
        return new Number(number);
    }

    @Override
    public Stmt visitId(TACParser.IdContext ctx) {
        String id = ctx.children.get(0).getText();
        return visitChildren(ctx);
    }

    public int returnInt(Boolean bool) {
        if (bool == true) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Stmt visitAssignIdCondition(TACParser.AssignIdConditionContext ctx) {
        String idString = ctx.ID().getText();
        Id identificador = new Id(idString);
        String signo;
        int resultInt;
        boolean result;

        if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number1 = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
            NumOrId number2 = new NumOrId(right);

            Condition condition = new Condition(number1, signo, number2);
            result = condition.makeCondition();

            NumOrId conditionResult = new NumOrId(returnInt(result));
            Stmt.memoryVariables.put(idString, returnInt(result));

            Assign assign = new Assign(identificador, conditionResult );

            Stmt.staments.add(assign);


            return condition;

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(2).getChild(0).getText();

            if (Stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));

                signo = ctx.children.get(2).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();


                NumOrId conditionResult = new NumOrId(returnInt(result));
                Stmt.memoryVariables.put(idString, returnInt(result));

                Assign assign = new Assign(identificador, conditionResult );

                Stmt.staments.add(assign);

                return condition;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            String right =  ctx.children.get(2).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();


                NumOrId conditionResult = new NumOrId(returnInt(result));
                Stmt.memoryVariables.put(idString, returnInt(result));

                Assign assign = new Assign(identificador, conditionResult );

                Stmt.staments.add(assign);

                return condition;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(2).getChild(0).getText();
            String right =  ctx.children.get(2).getChild(2).getText();

            if (Stmt.memoryVariables.containsKey(left) && Stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(Stmt.memoryVariables.get(left));
                signo = ctx.children.get(2).getChild(1).getText();
                NumOrId id2 = new NumOrId(Stmt.memoryVariables.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

                NumOrId conditionResult = new NumOrId(returnInt(result));
                Stmt.memoryVariables.put(idString, returnInt(result));

                Assign assign = new Assign(identificador, conditionResult );

                Stmt.staments.add(assign);

                return condition;

            }
        }

        return visitChildren(ctx);

    }

    @Override public Stmt visitIfConditionIdTrue(TACParser.IfConditionIdTrueContext ctx) {

        String id = ctx.children.get(1).getText();
        String label = ctx.children.get(2).getChild(1).getText();

        if (Stmt.memoryVariables.containsKey(id) && Stmt.memoryLabels.containsKey(label)) {
            int line = Stmt.memoryLabels.get(label);
            int result = Stmt.memoryLabels.get(id);

            GoTo goTo = new GoTo(label);

            IfTrue ifTrue = new IfTrue(goTo, returnBool(result), line);
            Stmt.staments.add(ifTrue);

        }


        return visitChildren(ctx);


    }

    @Override public Stmt visitIfConditionIdFalse(TACParser.IfConditionIdFalseContext ctx) {

        String id = ctx.children.get(1).getText();
        String label = ctx.children.get(2).getChild(1).getText();
        System.out.println("entrando a if false label " + label + " id "+ id);

        //&& Stmt.memoryLabels.containsKey(label)
        System.out.println("Memory labels" + Stmt.memoryLabels);

        if (Stmt.memoryVariables.containsKey(id) && Stmt.memoryLabels.containsKey(label) ) {
            System.out.println(":(");
            int line = Stmt.memoryLabels.get(label);
            int result = Stmt.memoryLabels.get(id);

            GoTo goTo = new GoTo(label);

            IfFalse ifFalse = new IfFalse(goTo, returnBool(result), line);
            Stmt.staments.add(ifFalse);
            System.out.println("if false " + Stmt.staments.add(ifFalse));

        }
        return visitChildren(ctx);
    }

    public boolean returnBool (int result) {
        if (result == 0) {
            return false;
        } else {
            return true;
        }
    }

}