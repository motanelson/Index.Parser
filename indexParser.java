// Generated from index.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class indexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, ID=7, INT=8, WS=9;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_operacao = 2, RULE_variavel = 3, 
		RULE_subrotina = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "operacao", "variavel", "subrotina"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'mul'", "','", "'add'", "'sub'", "'div'", "'integer'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "ID", "INT", "WS"
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
	public String getGrammarFileName() { return "index.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public indexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(indexParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5))) != 0)) {
				{
				{
				setState(10);
				line();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(16);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public SubrotinaContext subrotina() {
			return getRuleContext(SubrotinaContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			setState(21);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				operacao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				variavel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				subrotina();
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

	public static class OperacaoContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(indexParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(indexParser.ID, i);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacao);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				match(T__0);
				setState(24);
				match(T__1);
				setState(25);
				match(ID);
				setState(26);
				match(T__1);
				setState(27);
				match(ID);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(T__2);
				setState(29);
				match(T__1);
				setState(30);
				match(ID);
				setState(31);
				match(T__1);
				setState(32);
				match(ID);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				match(T__3);
				setState(34);
				match(T__1);
				setState(35);
				match(ID);
				setState(36);
				match(T__1);
				setState(37);
				match(ID);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(T__4);
				setState(39);
				match(T__1);
				setState(40);
				match(ID);
				setState(41);
				match(T__1);
				setState(42);
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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(indexParser.ID, 0); }
		public TerminalNode INT() { return getToken(indexParser.INT, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__5);
			setState(46);
			match(T__1);
			setState(47);
			match(ID);
			setState(48);
			match(T__1);
			setState(49);
			match(INT);
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

	public static class SubrotinaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(indexParser.ID, 0); }
		public SubrotinaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrotina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).enterSubrotina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof indexListener ) ((indexListener)listener).exitSubrotina(this);
		}
	}

	public final SubrotinaContext subrotina() throws RecognitionException {
		SubrotinaContext _localctx = new SubrotinaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subrotina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__3);
			setState(52);
			match(T__1);
			setState(53);
			match(ID);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2:\2\17\3\2\2\2\4\27\3\2\2\2\6-\3\2"+
		"\2\2\b/\3\2\2\2\n\65\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17"+
		"\r\3\2\2\2\17\20\3\2\2\2\20\22\3\2\2\2\21\17\3\2\2\2\22\23\7\2\2\3\23"+
		"\3\3\2\2\2\24\30\5\6\4\2\25\30\5\b\5\2\26\30\5\n\6\2\27\24\3\2\2\2\27"+
		"\25\3\2\2\2\27\26\3\2\2\2\30\5\3\2\2\2\31\32\7\3\2\2\32\33\7\4\2\2\33"+
		"\34\7\t\2\2\34\35\7\4\2\2\35.\7\t\2\2\36\37\7\5\2\2\37 \7\4\2\2 !\7\t"+
		"\2\2!\"\7\4\2\2\".\7\t\2\2#$\7\6\2\2$%\7\4\2\2%&\7\t\2\2&\'\7\4\2\2\'"+
		".\7\t\2\2()\7\7\2\2)*\7\4\2\2*+\7\t\2\2+,\7\4\2\2,.\7\t\2\2-\31\3\2\2"+
		"\2-\36\3\2\2\2-#\3\2\2\2-(\3\2\2\2.\7\3\2\2\2/\60\7\b\2\2\60\61\7\4\2"+
		"\2\61\62\7\t\2\2\62\63\7\4\2\2\63\64\7\n\2\2\64\t\3\2\2\2\65\66\7\6\2"+
		"\2\66\67\7\4\2\2\678\7\t\2\28\13\3\2\2\2\5\17\27-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}