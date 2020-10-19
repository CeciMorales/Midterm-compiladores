import java.util.HashMap;
import java.util.Map;

public class MyVisitorTAC extends TACBaseVisitor<Stmt>{

    Stmt stmt = new Stmt();


    @Override
    public Stmt visitProgram(TACParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitSmts(TACParser.SmtsContext ctx) {
        stmt.counter += 1;
        System.out.println("context " +  ctx.children.get(0).getText());
        System.out.println("counter: " + stmt.counter);


        if (ctx.ID() != null){
            System.out.println("Si hay label");
            String label =  ctx.children.get(0).getText();
            stmt.memoryLabels.put(label, stmt.counter);
            System.out.println("label map: " + stmt.memoryLabels);
            System.out.println("despues de los 2 puntos" + ctx.children.get(2).getText());


        }else{

        }

        System.out.println("lista staments" + stmt.staments);


        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitStmtAssign(TACParser.StmtAssignContext ctx) {



        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitStmtIfCondition(TACParser.StmtIfConditionContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitStmtPrint(TACParser.StmtPrintContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitStmtGoTo(TACParser.StmtGoToContext ctx) {
        System.out.println("goto -> " + ctx.children.get(0).getChild(1).getText());
        String aux = ctx.children.get(0).getChild(1).getText();
        if (stmt.memoryLabels.containsKey(aux)) {
            int line = stmt.memoryLabels.get(aux);
            GoTo goTo = new GoTo(aux);
            System.out.println("line ->" +  line);
        }



        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitAssignIdNumOrId(TACParser.AssignIdNumOrIdContext ctx) {
        String id = ctx.ID().getText();
        Id identificador = new Id(id);


        if ( ctx.children.get(2) instanceof TACParser.NumberContext ) {

            int aux =  Integer.parseInt(ctx.children.get(2).getText());
            NumOrId number = new NumOrId(aux);
            System.out.println("number" + number.number);
            Assign assign = new Assign(identificador, number);
            stmt.memoryVariables.put(id, aux);

            stmt.staments.add(assign);
            System.out.println("Lisa stmts" + stmt.staments);

            return assign;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);
            System.out.println("id" + id1.id);
            if (stmt.memoryVariables.containsKey(aux)) {
                stmt.memoryVariables.put(id, stmt.memoryVariables.get(aux));
            }

            Assign assign =  new Assign(identificador, id1);

            stmt.staments.add(assign);
            System.out.println("Lisa stmts" + stmt.staments);

            // stmt.memoryVariables.put(id, aux);
            return assign;
        }


        return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
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
            System.out.println("operation " + operation.makeOperation());
            result = operation.makeOperation();

            stmt.memoryVariables.put(idVar, result);

            return operation;

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(2).getChild(0).getText();

            if (stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));

                signo = ctx.children.get(2).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Operation operation = new Operation(id, signo, number2);
                result = operation.makeOperation();
                stmt.memoryVariables.put(idVar, result);

                System.out.println("memory" + stmt.memoryVariables);
                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            String right =  ctx.children.get(2).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(stmt.memoryVariables.get(right));

                Operation operation = new Operation(number, signo, id);
                result = operation.makeOperation();
                stmt.memoryVariables.put(idVar, result);

                System.out.println("memory" + stmt.memoryVariables);

                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(2).getChild(0).getText();
            String right =  ctx.children.get(2).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(left) && stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));
                signo = ctx.children.get(2).getChild(1).getText();
                NumOrId id2 = new NumOrId(stmt.memoryVariables.get(right));

                Operation operation = new Operation(id, signo, id2);
                result = operation.makeOperation();
                stmt.memoryVariables.put(idVar, result);

                System.out.println("memory" + stmt.memoryVariables);

                return operation;

            }
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitAssignIdArray(TACParser.AssignIdArrayContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitAssignArrayNumOrId(TACParser.AssignArrayNumOrIdContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

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
            System.out.println("condition " + condition.makeCondition());
            result = condition.makeCondition();


            // logica del goto
            System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

            String aux = ctx.children.get(2).getChild(1).getText();
            if (stmt.memoryLabels.containsKey(aux)) {
                int line = stmt.memoryLabels.get(aux);
                GoTo goTo = new GoTo(aux);
                System.out.println("line ->" +  line);

                IfTrue ifTrue = new IfTrue(condition, goTo);
                stmt.staments.add(ifTrue);
            }



            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfTrue ifTrue = new IfTrue(condition, goTo);
                    stmt.staments.add(ifTrue);
                }

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(stmt.memoryVariables.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfTrue ifTrue = new IfTrue(condition, goTo);
                    stmt.staments.add(ifTrue);
                }


                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(left) && stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(stmt.memoryVariables.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfTrue ifTrue = new IfTrue(condition, goTo);
                    stmt.staments.add(ifTrue);
                }

                return condition;

            }
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
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
            System.out.println("condition " + condition.makeCondition());
            result = condition.makeCondition();


            // logica del goto
            System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

            String aux = ctx.children.get(2).getChild(1).getText();
            if (stmt.memoryLabels.containsKey(aux)) {
                int line = stmt.memoryLabels.get(aux);
                GoTo goTo = new GoTo(aux);
                System.out.println("line ->" +  line);

                IfFalse ifFalse = new IfFalse(condition, goTo);
                stmt.staments.add(ifFalse);
            }


            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (stmt.memoryVariables.containsKey(left)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfFalse ifFalse = new IfFalse(condition, goTo);
                    stmt.staments.add(ifFalse);
                }

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(right)) {
                NumOrId id = new NumOrId(stmt.memoryVariables.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfFalse ifFalse = new IfFalse(condition, goTo);
                    stmt.staments.add(ifFalse);
                }


                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (stmt.memoryVariables.containsKey(left) && stmt.memoryVariables.containsKey(right)) {

                NumOrId id = new NumOrId(stmt.memoryVariables.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(stmt.memoryVariables.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

                // logica del goto
                System.out.println("goto -> " + ctx.children.get(2).getChild(1).getText());

                String aux = ctx.children.get(2).getChild(1).getText();
                if (stmt.memoryLabels.containsKey(aux)) {
                    int line = stmt.memoryLabels.get(aux);
                    GoTo goTo = new GoTo(aux);
                    System.out.println("line ->" +  line);

                    IfFalse ifFalse = new IfFalse(condition, goTo);
                    stmt.staments.add(ifFalse);
                }

                return condition;

            }
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionGreater(TACParser.ConditionGreaterContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionGreaterEqual(TACParser.ConditionGreaterEqualContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionLess(TACParser.ConditionLessContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionLessEqual(TACParser.ConditionLessEqualContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionEqual(TACParser.ConditionEqualContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitConditionDifferent(TACParser.ConditionDifferentContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitGoToNumOrId(TACParser.GoToNumOrIdContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitPrintNumOrId(TACParser.PrintNumOrIdContext ctx) {

        System.out.println("numero print: " + ctx.children.get(2).getText());

        if ( ctx.children.get(2) instanceof TACParser.NumberContext ) {

            int aux =  Integer.parseInt(ctx.children.get(2).getText());
            NumOrId number = new NumOrId(aux);


            Print print = new Print(aux);
            System.out.println("print " + aux);
            stmt.staments.add(print);

            return print;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);

            if (stmt.memoryVariables.containsKey(aux)) {
                Print print = new Print(stmt.memoryVariables.get(aux));
                System.out.println("print " +  stmt.memoryVariables.get(aux));
                stmt.staments.add(print);
            }
        }

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitPrintArray(TACParser.PrintArrayContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitPrintOperation(TACParser.PrintOperationContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitArrayNum(TACParser.ArrayNumContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitOperationAdd(TACParser.OperationAddContext ctx) {

        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitOperationSubstract(TACParser.OperationSubstractContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitOperationMultiply(TACParser.OperationMultiplyContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitOperationDivide(TACParser.OperationDivideContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitOperationModule(TACParser.OperationModuleContext ctx) {
        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitNumber(TACParser.NumberContext ctx) {
        System.out.println("get0 "+ctx.children.get(0));
        int number = Integer.parseInt(ctx.INT().getText());
        return new Number(number);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public Stmt visitId(TACParser.IdContext ctx) {
        String id = ctx.children.get(0).getText();
        System.out.println("visit ID: "+ id);
        return visitChildren(ctx);
    }
}