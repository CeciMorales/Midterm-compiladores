// Generated from C:/Users/moren/ITC/Noveno Semestre/Compiladores/Midterm-compiladores/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TACParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TACVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TACParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Smts}
	 * labeled alternative in {@link TACParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmts(TACParser.SmtsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(TACParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtIfCondition}
	 * labeled alternative in {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtIfCondition(TACParser.StmtIfConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtPrint}
	 * labeled alternative in {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtPrint(TACParser.StmtPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtGoTo}
	 * labeled alternative in {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtGoTo(TACParser.StmtGoToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIdNumOrId}
	 * labeled alternative in {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdNumOrId(TACParser.AssignIdNumOrIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIdOperation}
	 * labeled alternative in {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdOperation(TACParser.AssignIdOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIdArray}
	 * labeled alternative in {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdArray(TACParser.AssignIdArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIdCondition}
	 * labeled alternative in {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIdCondition(TACParser.AssignIdConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignArrayNumOrId}
	 * labeled alternative in {@link TACParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArrayNumOrId(TACParser.AssignArrayNumOrIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditionTrue}
	 * labeled alternative in {@link TACParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionTrue(TACParser.IfConditionTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditionFalse}
	 * labeled alternative in {@link TACParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionFalse(TACParser.IfConditionFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditionIdTrue}
	 * labeled alternative in {@link TACParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionIdTrue(TACParser.IfConditionIdTrueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfConditionIdFalse}
	 * labeled alternative in {@link TACParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfConditionIdFalse(TACParser.IfConditionIdFalseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionGreater}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionGreater(TACParser.ConditionGreaterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionGreaterEqual}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionGreaterEqual(TACParser.ConditionGreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionLess}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionLess(TACParser.ConditionLessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionLessEqual}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionLessEqual(TACParser.ConditionLessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionEqual}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionEqual(TACParser.ConditionEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConditionDifferent}
	 * labeled alternative in {@link TACParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionDifferent(TACParser.ConditionDifferentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GoToNumOrId}
	 * labeled alternative in {@link TACParser#goTo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoToNumOrId(TACParser.GoToNumOrIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintNumOrId}
	 * labeled alternative in {@link TACParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintNumOrId(TACParser.PrintNumOrIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintArray}
	 * labeled alternative in {@link TACParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintArray(TACParser.PrintArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintOperation}
	 * labeled alternative in {@link TACParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintOperation(TACParser.PrintOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayNum}
	 * labeled alternative in {@link TACParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayNum(TACParser.ArrayNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationAdd}
	 * labeled alternative in {@link TACParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationAdd(TACParser.OperationAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationSubstract}
	 * labeled alternative in {@link TACParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationSubstract(TACParser.OperationSubstractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationMultiply}
	 * labeled alternative in {@link TACParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationMultiply(TACParser.OperationMultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationDivide}
	 * labeled alternative in {@link TACParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationDivide(TACParser.OperationDivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationModule}
	 * labeled alternative in {@link TACParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationModule(TACParser.OperationModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link TACParser#numOrId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TACParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link TACParser#numOrId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TACParser.IdContext ctx);
}