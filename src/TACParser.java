// Generated from C:/Users/cecim/OneDrive/Documentos/TEC/Noveno semestre/Compiladores/Proyectos/Midterm/src\TAC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TACParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, ID=22, INT=23, NEWLINE=24, WS=25;
	public static final int
		RULE_program = 0, RULE_stmts = 1, RULE_stmt = 2, RULE_assign = 3, RULE_ifCondition = 4, 
		RULE_condition = 5, RULE_goTo = 6, RULE_print = 7, RULE_array = 8, RULE_operation = 9, 
		RULE_numOrId = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "stmts", "stmt", "assign", "ifCondition", "condition", "goTo", 
			"print", "array", "operation", "numOrId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "'ifTrue'", "'ifFalse'", "'>'", "'>='", "'<'", "'<='", 
			"'=='", "'!='", "'goTo'", "'print'", "'('", "')'", "'['", "']'", "'+'", 
			"'-'", "'*'", "'/'", "'%'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "ID", "INT", 
			"NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TAC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TACParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<StmtsContext> stmts() {
			return getRuleContexts(StmtsContext.class);
		}
		public StmtsContext stmts(int i) {
			return getRuleContext(StmtsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0)) {
				{
				{
				setState(22);
				stmts();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
	 
		public StmtsContext() { }
		public void copyFrom(StmtsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SmtsContext extends StmtsContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TACParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public SmtsContext(StmtsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitSmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmts);
		try {
			_localctx = new SmtsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(28);
				match(ID);
				setState(29);
				match(T__0);
				}
				break;
			}
			setState(32);
			stmt();
			setState(33);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtGoToContext extends StmtContext {
		public GoToContext goTo() {
			return getRuleContext(GoToContext.class,0);
		}
		public StmtGoToContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStmtGoTo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfConditionContext extends StmtContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public StmtIfConditionContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStmtIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtPrintContext extends StmtContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStmtPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAssignContext extends StmtContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public StmtAssignContext(StmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				assign();
				}
				break;
			case T__2:
			case T__3:
				_localctx = new StmtIfConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				ifCondition();
				}
				break;
			case T__11:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				print();
				}
				break;
			case T__10:
				_localctx = new StmtGoToContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				goTo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignIdArrayContext extends AssignContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public AssignIdArrayContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignIdArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIdNumOrIdContext extends AssignContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public NumOrIdContext numOrId() {
			return getRuleContext(NumOrIdContext.class,0);
		}
		public AssignIdNumOrIdContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignIdNumOrId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignArrayNumOrIdContext extends AssignContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public NumOrIdContext numOrId() {
			return getRuleContext(NumOrIdContext.class,0);
		}
		public AssignArrayNumOrIdContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignArrayNumOrId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignIdOperationContext extends AssignContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public AssignIdOperationContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitAssignIdOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assign);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new AssignIdNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				match(ID);
				setState(42);
				match(T__1);
				setState(43);
				numOrId();
				}
				break;
			case 2:
				_localctx = new AssignIdOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(ID);
				setState(45);
				match(T__1);
				setState(46);
				operation();
				}
				break;
			case 3:
				_localctx = new AssignIdArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(ID);
				setState(48);
				match(T__1);
				setState(49);
				array();
				}
				break;
			case 4:
				_localctx = new AssignArrayNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				array();
				setState(51);
				match(T__1);
				setState(52);
				numOrId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfConditionContext extends ParserRuleContext {
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
	 
		public IfConditionContext() { }
		public void copyFrom(IfConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfConditionTrueContext extends IfConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public GoToContext goTo() {
			return getRuleContext(GoToContext.class,0);
		}
		public IfConditionTrueContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfConditionTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfConditionFalseContext extends IfConditionContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public GoToContext goTo() {
			return getRuleContext(GoToContext.class,0);
		}
		public IfConditionFalseContext(IfConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitIfConditionFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifCondition);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IfConditionTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__2);
				setState(57);
				condition();
				setState(58);
				goTo();
				}
				break;
			case T__3:
				_localctx = new IfConditionFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(T__3);
				setState(61);
				condition();
				setState(62);
				goTo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionEqualContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionDifferentContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionDifferentContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionDifferent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionLessEqualContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionLessEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionLessEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionGreaterEqualContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionGreaterEqualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionGreaterEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionGreaterContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionGreaterContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionGreater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionLessContext extends ConditionContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public ConditionLessContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitConditionLess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new ConditionGreaterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				numOrId();
				setState(67);
				match(T__4);
				setState(68);
				numOrId();
				}
				break;
			case 2:
				_localctx = new ConditionGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				numOrId();
				setState(71);
				match(T__5);
				setState(72);
				numOrId();
				}
				break;
			case 3:
				_localctx = new ConditionLessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				numOrId();
				setState(75);
				match(T__6);
				setState(76);
				numOrId();
				}
				break;
			case 4:
				_localctx = new ConditionLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				numOrId();
				setState(79);
				match(T__7);
				setState(80);
				numOrId();
				}
				break;
			case 5:
				_localctx = new ConditionEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				numOrId();
				setState(83);
				match(T__8);
				setState(84);
				numOrId();
				}
				break;
			case 6:
				_localctx = new ConditionDifferentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				numOrId();
				setState(87);
				match(T__9);
				setState(88);
				numOrId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GoToContext extends ParserRuleContext {
		public GoToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goTo; }
	 
		public GoToContext() { }
		public void copyFrom(GoToContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GoToNumOrIdContext extends GoToContext {
		public NumOrIdContext numOrId() {
			return getRuleContext(NumOrIdContext.class,0);
		}
		public GoToNumOrIdContext(GoToContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitGoToNumOrId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoToContext goTo() throws RecognitionException {
		GoToContext _localctx = new GoToContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_goTo);
		try {
			_localctx = new GoToNumOrIdContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__10);
			setState(93);
			numOrId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	 
		public PrintContext() { }
		public void copyFrom(PrintContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintOperationContext extends PrintContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public PrintOperationContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrintOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintNumOrIdContext extends PrintContext {
		public NumOrIdContext numOrId() {
			return getRuleContext(NumOrIdContext.class,0);
		}
		public PrintNumOrIdContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrintNumOrId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintArrayContext extends PrintContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public PrintArrayContext(PrintContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitPrintArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new PrintNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__11);
				setState(96);
				match(T__12);
				setState(97);
				numOrId();
				setState(98);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new PrintArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__11);
				setState(101);
				match(T__12);
				setState(102);
				array();
				setState(103);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PrintOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(T__11);
				setState(106);
				match(T__12);
				setState(107);
				operation();
				setState(108);
				match(T__13);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	 
		public ArrayContext() { }
		public void copyFrom(ArrayContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayNumContext extends ArrayContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public NumOrIdContext numOrId() {
			return getRuleContext(NumOrIdContext.class,0);
		}
		public ArrayNumContext(ArrayContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitArrayNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		try {
			_localctx = new ArrayNumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ID);
			setState(113);
			match(T__14);
			setState(114);
			numOrId();
			setState(115);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	 
		public OperationContext() { }
		public void copyFrom(OperationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationDivideContext extends OperationContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public OperationDivideContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperationDivide(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationSubstractContext extends OperationContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public OperationSubstractContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperationSubstract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationAddContext extends OperationContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public OperationAddContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperationAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationMultiplyContext extends OperationContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public OperationMultiplyContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperationMultiply(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationModuleContext extends OperationContext {
		public List<NumOrIdContext> numOrId() {
			return getRuleContexts(NumOrIdContext.class);
		}
		public NumOrIdContext numOrId(int i) {
			return getRuleContext(NumOrIdContext.class,i);
		}
		public OperationModuleContext(OperationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitOperationModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operation);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new OperationAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				numOrId();
				setState(118);
				match(T__16);
				setState(119);
				numOrId();
				}
				break;
			case 2:
				_localctx = new OperationSubstractContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				numOrId();
				setState(122);
				match(T__17);
				setState(123);
				numOrId();
				}
				break;
			case 3:
				_localctx = new OperationMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				numOrId();
				setState(126);
				match(T__18);
				setState(127);
				numOrId();
				}
				break;
			case 4:
				_localctx = new OperationDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				numOrId();
				setState(130);
				match(T__19);
				setState(131);
				numOrId();
				}
				break;
			case 5:
				_localctx = new OperationModuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				numOrId();
				setState(134);
				match(T__20);
				setState(135);
				numOrId();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumOrIdContext extends ParserRuleContext {
		public NumOrIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numOrId; }
	 
		public NumOrIdContext() { }
		public void copyFrom(NumOrIdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumberContext extends NumOrIdContext {
		public TerminalNode INT() { return getToken(TACParser.INT, 0); }
		public NumberContext(NumOrIdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends NumOrIdContext {
		public TerminalNode ID() { return getToken(TACParser.ID, 0); }
		public IdContext(NumOrIdContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TACVisitor ) return ((TACVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumOrIdContext numOrId() throws RecognitionException {
		NumOrIdContext _localctx = new NumOrIdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numOrId);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(INT);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0092\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\3\3\5\3!\n\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\5\4*\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\5\59\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6C\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7]\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u008c\n\13\3\f\3\f\5\f\u0090\n\f\3\f\2\2\r\2"+
		"\4\6\b\n\f\16\20\22\24\26\2\2\2\u009b\2\33\3\2\2\2\4 \3\2\2\2\6)\3\2\2"+
		"\2\b8\3\2\2\2\nB\3\2\2\2\f\\\3\2\2\2\16^\3\2\2\2\20p\3\2\2\2\22r\3\2\2"+
		"\2\24\u008b\3\2\2\2\26\u008f\3\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\35"+
		"\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35\33\3\2\2\2\36\37"+
		"\7\30\2\2\37!\7\3\2\2 \36\3\2\2\2 !\3\2\2\2!\"\3\2\2\2\"#\5\6\4\2#$\7"+
		"\32\2\2$\5\3\2\2\2%*\5\b\5\2&*\5\n\6\2\'*\5\20\t\2(*\5\16\b\2)%\3\2\2"+
		"\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\7\3\2\2\2+,\7\30\2\2,-\7\4\2\2-9\5"+
		"\26\f\2./\7\30\2\2/\60\7\4\2\2\609\5\24\13\2\61\62\7\30\2\2\62\63\7\4"+
		"\2\2\639\5\22\n\2\64\65\5\22\n\2\65\66\7\4\2\2\66\67\5\26\f\2\679\3\2"+
		"\2\28+\3\2\2\28.\3\2\2\28\61\3\2\2\28\64\3\2\2\29\t\3\2\2\2:;\7\5\2\2"+
		";<\5\f\7\2<=\5\16\b\2=C\3\2\2\2>?\7\6\2\2?@\5\f\7\2@A\5\16\b\2AC\3\2\2"+
		"\2B:\3\2\2\2B>\3\2\2\2C\13\3\2\2\2DE\5\26\f\2EF\7\7\2\2FG\5\26\f\2G]\3"+
		"\2\2\2HI\5\26\f\2IJ\7\b\2\2JK\5\26\f\2K]\3\2\2\2LM\5\26\f\2MN\7\t\2\2"+
		"NO\5\26\f\2O]\3\2\2\2PQ\5\26\f\2QR\7\n\2\2RS\5\26\f\2S]\3\2\2\2TU\5\26"+
		"\f\2UV\7\13\2\2VW\5\26\f\2W]\3\2\2\2XY\5\26\f\2YZ\7\f\2\2Z[\5\26\f\2["+
		"]\3\2\2\2\\D\3\2\2\2\\H\3\2\2\2\\L\3\2\2\2\\P\3\2\2\2\\T\3\2\2\2\\X\3"+
		"\2\2\2]\r\3\2\2\2^_\7\r\2\2_`\5\26\f\2`\17\3\2\2\2ab\7\16\2\2bc\7\17\2"+
		"\2cd\5\26\f\2de\7\20\2\2eq\3\2\2\2fg\7\16\2\2gh\7\17\2\2hi\5\22\n\2ij"+
		"\7\20\2\2jq\3\2\2\2kl\7\16\2\2lm\7\17\2\2mn\5\24\13\2no\7\20\2\2oq\3\2"+
		"\2\2pa\3\2\2\2pf\3\2\2\2pk\3\2\2\2q\21\3\2\2\2rs\7\30\2\2st\7\21\2\2t"+
		"u\5\26\f\2uv\7\22\2\2v\23\3\2\2\2wx\5\26\f\2xy\7\23\2\2yz\5\26\f\2z\u008c"+
		"\3\2\2\2{|\5\26\f\2|}\7\24\2\2}~\5\26\f\2~\u008c\3\2\2\2\177\u0080\5\26"+
		"\f\2\u0080\u0081\7\25\2\2\u0081\u0082\5\26\f\2\u0082\u008c\3\2\2\2\u0083"+
		"\u0084\5\26\f\2\u0084\u0085\7\26\2\2\u0085\u0086\5\26\f\2\u0086\u008c"+
		"\3\2\2\2\u0087\u0088\5\26\f\2\u0088\u0089\7\27\2\2\u0089\u008a\5\26\f"+
		"\2\u008a\u008c\3\2\2\2\u008bw\3\2\2\2\u008b{\3\2\2\2\u008b\177\3\2\2\2"+
		"\u008b\u0083\3\2\2\2\u008b\u0087\3\2\2\2\u008c\25\3\2\2\2\u008d\u0090"+
		"\7\31\2\2\u008e\u0090\7\30\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2"+
		"\u0090\27\3\2\2\2\13\33 )8B\\p\u008b\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}