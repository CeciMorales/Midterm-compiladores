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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__10) | (1L << T__11) | (1L << ID) | (1L << NEWLINE))) != 0)) {
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
		public List<TerminalNode> NEWLINE() { return getTokens(TACParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TACParser.NEWLINE, i);
		}
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
		int _la;
		try {
			_localctx = new SmtsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(28);
				match(NEWLINE);
				}
			}

			setState(33);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(31);
				match(ID);
				setState(32);
				match(T__0);
				}
				break;
			}
			setState(35);
			stmt();
			setState(36);
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
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				assign();
				}
				break;
			case T__2:
			case T__3:
				_localctx = new StmtIfConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				ifCondition();
				}
				break;
			case T__11:
				_localctx = new StmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				print();
				}
				break;
			case T__10:
				_localctx = new StmtGoToContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignIdNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(ID);
				setState(45);
				match(T__1);
				setState(46);
				numOrId();
				}
				break;
			case 2:
				_localctx = new AssignIdOperationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(ID);
				setState(48);
				match(T__1);
				setState(49);
				operation();
				}
				break;
			case 3:
				_localctx = new AssignIdArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(ID);
				setState(51);
				match(T__1);
				setState(52);
				array();
				}
				break;
			case 4:
				_localctx = new AssignArrayNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				array();
				setState(54);
				match(T__1);
				setState(55);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new IfConditionTrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__2);
				setState(60);
				condition();
				setState(61);
				goTo();
				}
				break;
			case T__3:
				_localctx = new IfConditionFalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(T__3);
				setState(64);
				condition();
				setState(65);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ConditionGreaterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				numOrId();
				setState(70);
				match(T__4);
				setState(71);
				numOrId();
				}
				break;
			case 2:
				_localctx = new ConditionGreaterEqualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				numOrId();
				setState(74);
				match(T__5);
				setState(75);
				numOrId();
				}
				break;
			case 3:
				_localctx = new ConditionLessContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				numOrId();
				setState(78);
				match(T__6);
				setState(79);
				numOrId();
				}
				break;
			case 4:
				_localctx = new ConditionLessEqualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				numOrId();
				setState(82);
				match(T__7);
				setState(83);
				numOrId();
				}
				break;
			case 5:
				_localctx = new ConditionEqualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				numOrId();
				setState(86);
				match(T__8);
				setState(87);
				numOrId();
				}
				break;
			case 6:
				_localctx = new ConditionDifferentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(89);
				numOrId();
				setState(90);
				match(T__9);
				setState(91);
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
			setState(95);
			match(T__10);
			setState(96);
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
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new PrintNumOrIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(T__11);
				setState(99);
				match(T__12);
				setState(100);
				numOrId();
				setState(101);
				match(T__13);
				}
				break;
			case 2:
				_localctx = new PrintArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__11);
				setState(104);
				match(T__12);
				setState(105);
				array();
				setState(106);
				match(T__13);
				}
				break;
			case 3:
				_localctx = new PrintOperationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__11);
				setState(109);
				match(T__12);
				setState(110);
				operation();
				setState(111);
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
			setState(115);
			match(ID);
			setState(116);
			match(T__14);
			setState(117);
			numOrId();
			setState(118);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new OperationAddContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				numOrId();
				setState(121);
				match(T__16);
				setState(122);
				numOrId();
				}
				break;
			case 2:
				_localctx = new OperationSubstractContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				numOrId();
				setState(125);
				match(T__17);
				setState(126);
				numOrId();
				}
				break;
			case 3:
				_localctx = new OperationMultiplyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				numOrId();
				setState(129);
				match(T__18);
				setState(130);
				numOrId();
				}
				break;
			case 4:
				_localctx = new OperationDivideContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				numOrId();
				setState(133);
				match(T__19);
				setState(134);
				numOrId();
				}
				break;
			case 5:
				_localctx = new OperationModuleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(136);
				numOrId();
				setState(137);
				match(T__20);
				setState(138);
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
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new NumberContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(INT);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0095\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\3\5\3 \n\3\3\3\3\3\5\3"+
		"$\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5<\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"F\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tt\n\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008f\n\13\3\f\3\f\5\f\u0093"+
		"\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u009f\2\33\3\2\2\2\4\37"+
		"\3\2\2\2\6,\3\2\2\2\b;\3\2\2\2\nE\3\2\2\2\f_\3\2\2\2\16a\3\2\2\2\20s\3"+
		"\2\2\2\22u\3\2\2\2\24\u008e\3\2\2\2\26\u0092\3\2\2\2\30\32\5\4\3\2\31"+
		"\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\3\3\2\2\2\35"+
		"\33\3\2\2\2\36 \7\32\2\2\37\36\3\2\2\2\37 \3\2\2\2 #\3\2\2\2!\"\7\30\2"+
		"\2\"$\7\3\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\5\6\4\2&\'\7\32\2\2\'\5"+
		"\3\2\2\2(-\5\b\5\2)-\5\n\6\2*-\5\20\t\2+-\5\16\b\2,(\3\2\2\2,)\3\2\2\2"+
		",*\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\7\30\2\2/\60\7\4\2\2\60<\5\26\f\2\61"+
		"\62\7\30\2\2\62\63\7\4\2\2\63<\5\24\13\2\64\65\7\30\2\2\65\66\7\4\2\2"+
		"\66<\5\22\n\2\678\5\22\n\289\7\4\2\29:\5\26\f\2:<\3\2\2\2;.\3\2\2\2;\61"+
		"\3\2\2\2;\64\3\2\2\2;\67\3\2\2\2<\t\3\2\2\2=>\7\5\2\2>?\5\f\7\2?@\5\16"+
		"\b\2@F\3\2\2\2AB\7\6\2\2BC\5\f\7\2CD\5\16\b\2DF\3\2\2\2E=\3\2\2\2EA\3"+
		"\2\2\2F\13\3\2\2\2GH\5\26\f\2HI\7\7\2\2IJ\5\26\f\2J`\3\2\2\2KL\5\26\f"+
		"\2LM\7\b\2\2MN\5\26\f\2N`\3\2\2\2OP\5\26\f\2PQ\7\t\2\2QR\5\26\f\2R`\3"+
		"\2\2\2ST\5\26\f\2TU\7\n\2\2UV\5\26\f\2V`\3\2\2\2WX\5\26\f\2XY\7\13\2\2"+
		"YZ\5\26\f\2Z`\3\2\2\2[\\\5\26\f\2\\]\7\f\2\2]^\5\26\f\2^`\3\2\2\2_G\3"+
		"\2\2\2_K\3\2\2\2_O\3\2\2\2_S\3\2\2\2_W\3\2\2\2_[\3\2\2\2`\r\3\2\2\2ab"+
		"\7\r\2\2bc\5\26\f\2c\17\3\2\2\2de\7\16\2\2ef\7\17\2\2fg\5\26\f\2gh\7\20"+
		"\2\2ht\3\2\2\2ij\7\16\2\2jk\7\17\2\2kl\5\22\n\2lm\7\20\2\2mt\3\2\2\2n"+
		"o\7\16\2\2op\7\17\2\2pq\5\24\13\2qr\7\20\2\2rt\3\2\2\2sd\3\2\2\2si\3\2"+
		"\2\2sn\3\2\2\2t\21\3\2\2\2uv\7\30\2\2vw\7\21\2\2wx\5\26\f\2xy\7\22\2\2"+
		"y\23\3\2\2\2z{\5\26\f\2{|\7\23\2\2|}\5\26\f\2}\u008f\3\2\2\2~\177\5\26"+
		"\f\2\177\u0080\7\24\2\2\u0080\u0081\5\26\f\2\u0081\u008f\3\2\2\2\u0082"+
		"\u0083\5\26\f\2\u0083\u0084\7\25\2\2\u0084\u0085\5\26\f\2\u0085\u008f"+
		"\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\26\2\2\u0088\u0089\5\26\f"+
		"\2\u0089\u008f\3\2\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\27\2\2\u008c"+
		"\u008d\5\26\f\2\u008d\u008f\3\2\2\2\u008ez\3\2\2\2\u008e~\3\2\2\2\u008e"+
		"\u0082\3\2\2\2\u008e\u0086\3\2\2\2\u008e\u008a\3\2\2\2\u008f\25\3\2\2"+
		"\2\u0090\u0093\7\31\2\2\u0091\u0093\7\30\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0091\3\2\2\2\u0093\27\3\2\2\2\f\33\37#,;E_s\u008e\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}