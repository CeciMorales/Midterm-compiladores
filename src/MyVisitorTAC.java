import java.util.HashMap;
import java.util.Map;

public class MyVisitorTAC extends TACBaseVisitor<Stmt>{
    Map<String, Integer> memory = new HashMap<String, Integer>();

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
            memory.put(id, aux);

            return assign;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);
            System.out.println("id" + id1.id);
            if (memory.containsKey(aux)) {
                memory.put(id, memory.get(aux));
            }


            // stmt.memoryVariables.put(id, aux);
            return new Assign(identificador, id1);
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

            memory.put(idVar, result);

            return operation;

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(2).getChild(0).getText();

            if (memory.containsKey(left)) {

                NumOrId id = new NumOrId(memory.get(left));

                signo = ctx.children.get(2).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(2).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Operation operation = new Operation(id, signo, number2);
                result = operation.makeOperation();
                memory.put(idVar, result);

                System.out.println("memory" + memory);
                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(2).getChild(1).getText();

            String right =  ctx.children.get(2).getChild(2).getText();

            if (memory.containsKey(right)) {
                NumOrId id = new NumOrId(memory.get(right));

                Operation operation = new Operation(number, signo, id);
                result = operation.makeOperation();
                memory.put(idVar, result);

                System.out.println("memory" + memory);

                return operation;
            }

        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(2).getChild(0).getText();
            String right =  ctx.children.get(2).getChild(2).getText();

            if (memory.containsKey(left) && memory.containsKey(right)) {

                NumOrId id = new NumOrId(memory.get(left));
                signo = ctx.children.get(2).getChild(1).getText();
                NumOrId id2 = new NumOrId(memory.get(right));

                Operation operation = new Operation(id, signo, id2);
                result = operation.makeOperation();
                memory.put(idVar, result);

                System.out.println("memory" + memory);

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


            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (memory.containsKey(left)) {

                NumOrId id = new NumOrId(memory.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (memory.containsKey(right)) {
                NumOrId id = new NumOrId(memory.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();


                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (memory.containsKey(left) && memory.containsKey(right)) {

                NumOrId id = new NumOrId(memory.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(memory.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

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


            return condition;

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.NumberContext) {

            String left =  ctx.children.get(1).getChild(0).getText();

            if (memory.containsKey(left)) {

                NumOrId id = new NumOrId(memory.get(left));

                signo = ctx.children.get(1).getChild(1).getText();

                int right =  Integer.parseInt(ctx.children.get(1).getChild(2).getText());
                NumOrId number2 = new NumOrId(right);

                Condition condition = new Condition(id, signo, number2);
                result = condition.makeCondition();

                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {


            int left =  Integer.parseInt(ctx.children.get(1).getChild(0).getText());
            NumOrId number = new NumOrId(left);

            signo = ctx.children.get(1).getChild(1).getText();

            String right =  ctx.children.get(1).getChild(2).getText();

            if (memory.containsKey(right)) {
                NumOrId id = new NumOrId(memory.get(right));

                Condition condition = new Condition(number, signo, id);
                result = condition.makeCondition();


                return condition;
            }

        } else if ( ctx.children.get(1).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(1).getChild(2) instanceof TACParser.IdContext) {

            String left =  ctx.children.get(1).getChild(0).getText();
            String right =  ctx.children.get(1).getChild(2).getText();

            if (memory.containsKey(left) && memory.containsKey(right)) {

                NumOrId id = new NumOrId(memory.get(left));
                signo = ctx.children.get(1).getChild(1).getText();
                NumOrId id2 = new NumOrId(memory.get(right));

                Condition condition = new Condition(id, signo, id2);
                result = condition.makeCondition();

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

            return print;

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            NumOrId id1 = new NumOrId (aux);

            if (memory.containsKey(aux)) {
                Print print = new Print(memory.get(aux));
                System.out.println("print " +  memory.get(aux));

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