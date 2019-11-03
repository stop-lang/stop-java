// Generated from Stop.g4 by ANTLR 4.7.2
package org.stop_lang.stop.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StopLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, START=30, STOP=31, QUEUE=32, 
		TRANSITION_OP=33, RETURN_OP=34, ENQUEUE_OP=35, OPTIONAL=36, DOT=37, NUMBER=38, 
		MODEL_TYPE=39, ID=40, FILENAME=41, COMMENT=42, LINE_COMMENT=43, WS=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "START", "STOP", "QUEUE", "TRANSITION_OP", 
			"RETURN_OP", "ENQUEUE_OP", "OPTIONAL", "DOT", "NUMBER", "MODEL_TYPE", 
			"ID", "FILENAME", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "LETTER", "DIGIT", 
			"COMMENT", "LINE_COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'include'", "'{'", "';'", "'}'", "'double'", "'float'", 
			"'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", 
			"'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'bool'", "'string'", 
			"'bytes'", "'timestamp'", "'enum'", "'('", "','", "')'", "':'", "'['", 
			"']'", "'throws'", "'start'", "'stop'", "'queue'", "'->'", "'<-'", "'>>'", 
			"'optional'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "START", "STOP", "QUEUE", "TRANSITION_OP", 
			"RETURN_OP", "ENQUEUE_OP", "OPTIONAL", "DOT", "NUMBER", "MODEL_TYPE", 
			"ID", "FILENAME", "COMMENT", "LINE_COMMENT", "WS"
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


	public StopLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Stop.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u018a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\3!"+
		"\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%"+
		"\3&\3&\3\'\5\'\u012b\n\'\3\'\3\'\6\'\u012f\n\'\r\'\16\'\u0130\3\'\6\'"+
		"\u0134\n\'\r\'\16\'\u0135\3\'\3\'\7\'\u013a\n\'\f\'\16\'\u013d\13\'\5"+
		"\'\u013f\n\'\5\'\u0141\n\'\3(\3(\3(\7(\u0146\n(\f(\16(\u0149\13(\3)\3"+
		")\3)\7)\u014e\n)\f)\16)\u0151\13)\3*\3*\3*\3*\3*\6*\u0158\n*\r*\16*\u0159"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3/\7/\u016a\n/\f/\16/\u016d\13"+
		"/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\7\60\u0178\n\60\f\60\16\60\u017b"+
		"\13\60\3\60\5\60\u017e\n\60\3\60\3\60\3\60\3\60\3\61\6\61\u0185\n\61\r"+
		"\61\16\61\u0186\3\61\3\61\4\u016b\u0179\2\62\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S"+
		"+U\2W\2Y\2[\2],_-a.\3\2\b\6\2//\61\61^^aa\3\2C\\\3\2c|\5\2C\\aac|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u0197\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2"+
		"\2\2\5k\3\2\2\2\7s\3\2\2\2\tu\3\2\2\2\13w\3\2\2\2\ry\3\2\2\2\17\u0080"+
		"\3\2\2\2\21\u0086\3\2\2\2\23\u008c\3\2\2\2\25\u0092\3\2\2\2\27\u0099\3"+
		"\2\2\2\31\u00a0\3\2\2\2\33\u00a7\3\2\2\2\35\u00ae\3\2\2\2\37\u00b6\3\2"+
		"\2\2!\u00be\3\2\2\2#\u00c7\3\2\2\2%\u00d0\3\2\2\2\'\u00d5\3\2\2\2)\u00dc"+
		"\3\2\2\2+\u00e2\3\2\2\2-\u00ec\3\2\2\2/\u00f1\3\2\2\2\61\u00f3\3\2\2\2"+
		"\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb\3\2\2\2;\u00fd"+
		"\3\2\2\2=\u0104\3\2\2\2?\u010a\3\2\2\2A\u010f\3\2\2\2C\u0115\3\2\2\2E"+
		"\u0118\3\2\2\2G\u011b\3\2\2\2I\u011e\3\2\2\2K\u0127\3\2\2\2M\u012a\3\2"+
		"\2\2O\u0142\3\2\2\2Q\u014a\3\2\2\2S\u0152\3\2\2\2U\u015d\3\2\2\2W\u015f"+
		"\3\2\2\2Y\u0161\3\2\2\2[\u0163\3\2\2\2]\u0165\3\2\2\2_\u0173\3\2\2\2a"+
		"\u0184\3\2\2\2cd\7r\2\2de\7c\2\2ef\7e\2\2fg\7m\2\2gh\7c\2\2hi\7i\2\2i"+
		"j\7g\2\2j\4\3\2\2\2kl\7k\2\2lm\7p\2\2mn\7e\2\2no\7n\2\2op\7w\2\2pq\7f"+
		"\2\2qr\7g\2\2r\6\3\2\2\2st\7}\2\2t\b\3\2\2\2uv\7=\2\2v\n\3\2\2\2wx\7\177"+
		"\2\2x\f\3\2\2\2yz\7f\2\2z{\7q\2\2{|\7w\2\2|}\7d\2\2}~\7n\2\2~\177\7g\2"+
		"\2\177\16\3\2\2\2\u0080\u0081\7h\2\2\u0081\u0082\7n\2\2\u0082\u0083\7"+
		"q\2\2\u0083\u0084\7c\2\2\u0084\u0085\7v\2\2\u0085\20\3\2\2\2\u0086\u0087"+
		"\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089\7v\2\2\u0089\u008a\7\65\2\2\u008a"+
		"\u008b\7\64\2\2\u008b\22\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2"+
		"\u008e\u008f\7v\2\2\u008f\u0090\78\2\2\u0090\u0091\7\66\2\2\u0091\24\3"+
		"\2\2\2\u0092\u0093\7w\2\2\u0093\u0094\7k\2\2\u0094\u0095\7p\2\2\u0095"+
		"\u0096\7v\2\2\u0096\u0097\7\65\2\2\u0097\u0098\7\64\2\2\u0098\26\3\2\2"+
		"\2\u0099\u009a\7w\2\2\u009a\u009b\7k\2\2\u009b\u009c\7p\2\2\u009c\u009d"+
		"\7v\2\2\u009d\u009e\78\2\2\u009e\u009f\7\66\2\2\u009f\30\3\2\2\2\u00a0"+
		"\u00a1\7u\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7v\2\2"+
		"\u00a4\u00a5\7\65\2\2\u00a5\u00a6\7\64\2\2\u00a6\32\3\2\2\2\u00a7\u00a8"+
		"\7u\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\u00ac\78\2\2\u00ac\u00ad\7\66\2\2\u00ad\34\3\2\2\2\u00ae\u00af\7h\2\2"+
		"\u00af\u00b0\7k\2\2\u00b0\u00b1\7z\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7f\2\2\u00b3\u00b4\7\65\2\2\u00b4\u00b5\7\64\2\2\u00b5\36\3\2\2\2\u00b6"+
		"\u00b7\7h\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7z\2\2\u00b9\u00ba\7g\2\2"+
		"\u00ba\u00bb\7f\2\2\u00bb\u00bc\78\2\2\u00bc\u00bd\7\66\2\2\u00bd \3\2"+
		"\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7h\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2"+
		"\7z\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7f\2\2\u00c4\u00c5\7\65\2\2\u00c5"+
		"\u00c6\7\64\2\2\u00c6\"\3\2\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7h\2\2"+
		"\u00c9\u00ca\7k\2\2\u00ca\u00cb\7z\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd"+
		"\7f\2\2\u00cd\u00ce\78\2\2\u00ce\u00cf\7\66\2\2\u00cf$\3\2\2\2\u00d0\u00d1"+
		"\7d\2\2\u00d1\u00d2\7q\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7n\2\2\u00d4"+
		"&\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8"+
		"\u00d9\7k\2\2\u00d9\u00da\7p\2\2\u00da\u00db\7i\2\2\u00db(\3\2\2\2\u00dc"+
		"\u00dd\7d\2\2\u00dd\u00de\7{\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7g\2\2"+
		"\u00e0\u00e1\7u\2\2\u00e1*\3\2\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7k\2"+
		"\2\u00e4\u00e5\7o\2\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7u\2\2\u00e7\u00e8"+
		"\7v\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7o\2\2\u00ea\u00eb\7r\2\2\u00eb"+
		",\3\2\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef\7w\2\2\u00ef"+
		"\u00f0\7o\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7*\2\2\u00f2\60\3\2\2\2\u00f3"+
		"\u00f4\7.\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7+\2\2\u00f6\64\3\2\2\2\u00f7"+
		"\u00f8\7<\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7]\2\2\u00fa8\3\2\2\2\u00fb"+
		"\u00fc\7_\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7v\2\2\u00fe\u00ff\7j\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7q\2\2\u0101\u0102\7y\2\2\u0102\u0103\7u\2\2"+
		"\u0103<\3\2\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7c\2"+
		"\2\u0107\u0108\7t\2\2\u0108\u0109\7v\2\2\u0109>\3\2\2\2\u010a\u010b\7"+
		"u\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2\2\u010d\u010e\7r\2\2\u010e@"+
		"\3\2\2\2\u010f\u0110\7s\2\2\u0110\u0111\7w\2\2\u0111\u0112\7g\2\2\u0112"+
		"\u0113\7w\2\2\u0113\u0114\7g\2\2\u0114B\3\2\2\2\u0115\u0116\7/\2\2\u0116"+
		"\u0117\7@\2\2\u0117D\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a\7/\2\2\u011a"+
		"F\3\2\2\2\u011b\u011c\7@\2\2\u011c\u011d\7@\2\2\u011dH\3\2\2\2\u011e\u011f"+
		"\7q\2\2\u011f\u0120\7r\2\2\u0120\u0121\7v\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0123\7q\2\2\u0123\u0124\7p\2\2\u0124\u0125\7c\2\2\u0125\u0126\7n\2\2"+
		"\u0126J\3\2\2\2\u0127\u0128\7\60\2\2\u0128L\3\2\2\2\u0129\u012b\7/\2\2"+
		"\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0140\3\2\2\2\u012c\u012e"+
		"\5K&\2\u012d\u012f\5[.\2\u012e\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0141\3\2\2\2\u0132\u0134\5["+
		".\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u013e\3\2\2\2\u0137\u013b\5K&\2\u0138\u013a\5[.\2"+
		"\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0137\3\2\2\2\u013e"+
		"\u013f\3\2\2\2\u013f\u0141\3\2\2\2\u0140\u012c\3\2\2\2\u0140\u0133\3\2"+
		"\2\2\u0141N\3\2\2\2\u0142\u0147\5U+\2\u0143\u0146\5Y-\2\u0144\u0146\5"+
		"[.\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148P\3\2\2\2\u0149\u0147\3\2\2\2"+
		"\u014a\u014f\5W,\2\u014b\u014e\5Y-\2\u014c\u014e\5[.\2\u014d\u014b\3\2"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150R\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0157\7$\2\2\u0153"+
		"\u0158\5Y-\2\u0154\u0158\5[.\2\u0155\u0158\5K&\2\u0156\u0158\t\2\2\2\u0157"+
		"\u0153\3\2\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2"+
		"\2\2\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u015c\7$\2\2\u015cT\3\2\2\2\u015d\u015e\t\3\2\2\u015e"+
		"V\3\2\2\2\u015f\u0160\t\4\2\2\u0160X\3\2\2\2\u0161\u0162\t\5\2\2\u0162"+
		"Z\3\2\2\2\u0163\u0164\t\6\2\2\u0164\\\3\2\2\2\u0165\u0166\7\61\2\2\u0166"+
		"\u0167\7,\2\2\u0167\u016b\3\2\2\2\u0168\u016a\13\2\2\2\u0169\u0168\3\2"+
		"\2\2\u016a\u016d\3\2\2\2\u016b\u016c\3\2\2\2\u016b\u0169\3\2\2\2\u016c"+
		"\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7,\2\2\u016f\u0170\7\61"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\b/\2\2\u0172^\3\2\2\2\u0173\u0174"+
		"\7\61\2\2\u0174\u0175\7\61\2\2\u0175\u0179\3\2\2\2\u0176\u0178\13\2\2"+
		"\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u017a\3\2\2\2\u0179\u0177"+
		"\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u017e\7\17\2\2"+
		"\u017d\u017c\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\7\f\2\2\u0180\u0181\3\2\2\2\u0181\u0182\b\60\2\2\u0182`\3\2\2\2\u0183"+
		"\u0185\t\7\2\2\u0184\u0183\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\b\61\2\2\u0189"+
		"b\3\2\2\2\23\2\u012a\u0130\u0135\u013b\u013e\u0140\u0145\u0147\u014d\u014f"+
		"\u0157\u0159\u016b\u0179\u017d\u0186\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}