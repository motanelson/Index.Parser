// Generated from test.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		FORS=1, EXPRE=2, NUMBER=3, ID=4, VALUE=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"FORS", "EXPRE", "NUMBER", "ID", "VALUE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "FORS", "EXPRE", "NUMBER", "ID", "VALUE", "WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\u0084\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\7\2\60\n\2\f\2\16\2\63\13"+
		"\2\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\2\7\2B"+
		"\n\2\f\2\16\2E\13\2\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\3\3\3\3\3\3\3\7\3X\n\3\f\3\16\3[\13\3\3\3\3\3\3\3\3\3\7\3a"+
		"\n\3\f\3\16\3d\13\3\5\3f\n\3\3\4\6\4i\n\4\r\4\16\4j\3\4\3\4\7\4o\n\4\f"+
		"\4\16\4r\13\4\3\5\6\5u\n\5\r\5\16\5v\3\6\3\6\6\6{\n\6\r\6\16\6|\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\b\3\2\17\17\3\2"+
		"\f\f\3\2\62;\4\2C\\c|\4\2\13\f\17\17\5\2\13\f\17\17\"\"\2\u0093\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3"+
		"\17\3\2\2\2\5e\3\2\2\2\7h\3\2\2\2\tt\3\2\2\2\13x\3\2\2\2\r\u0080\3\2\2"+
		"\2\17\20\7h\2\2\20\21\7q\2\2\21\22\7t\2\2\22\23\7\"\2\2\23\24\3\2\2\2"+
		"\24\25\5\t\5\2\25\26\7.\2\2\26\27\5\7\4\2\27\30\7.\2\2\30\31\5\7\4\2\31"+
		"\32\7.\2\2\32\36\5\7\4\2\33\35\t\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2!#\t\3\2\2\"!\3\2\2\2#&"+
		"\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'+\7}\2\2(*\t\2\2\2"+
		")(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\61\3\2\2\2-+\3\2\2\2.\60\t\3"+
		"\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\67\3\2\2\2\63"+
		"\61\3\2\2\2\64\66\5\5\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678"+
		"\3\2\2\28=\3\2\2\29\67\3\2\2\2:<\t\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2"+
		"=>\3\2\2\2>C\3\2\2\2?=\3\2\2\2@B\t\3\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2FJ\7\177\2\2GI\t\2\2\2HG\3\2\2\2IL\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KP\3\2\2\2LJ\3\2\2\2MO\t\3\2\2NM\3\2\2\2OR\3\2\2"+
		"\2PN\3\2\2\2PQ\3\2\2\2Q\4\3\2\2\2RP\3\2\2\2ST\5\t\5\2TU\7?\2\2UY\5\13"+
		"\6\2VX\t\3\2\2WV\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Zf\3\2\2\2[Y\3\2"+
		"\2\2\\]\5\t\5\2]^\7?\2\2^b\5\7\4\2_a\t\3\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2eS\3\2\2\2e\\\3\2\2\2f\6\3\2\2\2gi\t"+
		"\4\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kp\3\2\2\2lm\7\60\2\2mo"+
		"\t\4\2\2nl\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\b\3\2\2\2rp\3\2\2\2"+
		"su\t\5\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\n\3\2\2\2xz\7$\2\2"+
		"y{\n\6\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7$\2"+
		"\2\177\f\3\2\2\2\u0080\u0081\t\7\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b"+
		"\7\2\2\u0083\16\3\2\2\2\23\2\36$+\61\67=CJPYbejpv|\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}