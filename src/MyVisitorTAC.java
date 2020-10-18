import java.util.HashMap;
import java.util.Map;

public class MyVisitorTAC extends TACBaseVisitor<Stmt>{
    Map<String, Double> memory = new HashMap<String, Double>();

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
            Number number = new Number(aux);
            return new Assign(identificador, number);

        } else if ( ctx.children.get(2) instanceof TACParser.IdContext ) {

            String aux =  ctx.children.get(2).getText();
            Id id1 = new Id(aux);
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
        System.out.println("assignOperation: " + ctx.children.get(0) );
        System.out.println("assignOperation: " + ctx.children.get(1) );
        System.out.println("assignOperation: " + ctx.children.get(2).getChild(0).getText() );

        if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(1) instanceof TACParser.NumberContext) {

            int left =  Integer.parseInt(ctx.children.get(2).getChild(0).getText());
            Number number1 = new Number(left);

            int right =  Integer.parseInt(ctx.children.get(2).getChild(1).getText());
            Number number2 = new Number(right);


        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(1) instanceof TACParser.NumberContext) {



        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.NumberContext &&
                ctx.children.get(2).getChild(1) instanceof TACParser.IdContext) {



        } else if ( ctx.children.get(2).getChild(0) instanceof TACParser.IdContext &&
                ctx.children.get(2).getChild(1) instanceof TACParser.IdContext) {


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
        System.out.println("visit ID: "+ctx.children.get(0));
        return visitChildren(ctx);
    }
}