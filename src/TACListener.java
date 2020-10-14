// Generated from C:/Users/cecim/OneDrive/Documentos/TEC/Noveno semestre/Compiladores/Proyectos/Midterm/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TACParser}.
 */
public interface TACListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TACParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TACParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(TACParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(TACParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(TACParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(TACParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(TACParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(TACParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(TACParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(TACParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void enterAcc(TACParser.AccContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#acc}.
	 * @param ctx the parse tree
	 */
	void exitAcc(TACParser.AccContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#rel}.
	 * @param ctx the parse tree
	 */
	void enterRel(TACParser.RelContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#rel}.
	 * @param ctx the parse tree
	 */
	void exitRel(TACParser.RelContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(TACParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(TACParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(TACParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(TACParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(TACParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TACParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(TACParser.FactorContext ctx);
}