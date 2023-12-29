// Generated from Chat.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ChatLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SAYS=9, 
		SHOUTS=10, WORD=11, WHITESPACE=12, NEWLINE=13, TEXT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "A", 
			"S", "Y", "H", "O", "U", "T", "LOWERCASE", "UPPERCASE", "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SAYS", "SHOUTS", 
			"WORD", "WHITESPACE", "NEWLINE", "TEXT"
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


	public ChatLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Chat.g4"; }

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
		"\u0004\u0000\u000ew\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0004\u0013a\b\u0013\u000b\u0013\f\u0013b\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0003\u0015h\b\u0015\u0001\u0015\u0001\u0015\u0004"+
		"\u0015l\b\u0015\u000b\u0015\f\u0015m\u0001\u0016\u0001\u0016\u0004\u0016"+
		"r\b\u0016\u000b\u0016\f\u0016s\u0001\u0016\u0001\u0016\u0000\u0000\u0017"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\u0000\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000"+
		"\u001b\u0000\u001d\u0000\u001f\u0000!\u0000#\t%\n\'\u000b)\f+\r-\u000e"+
		"\u0001\u0000\f\u0002\u0000AAaa\u0002\u0000SSss\u0002\u0000YYyy\u0002\u0000"+
		"HHhh\u0002\u0000OOoo\u0002\u0000UUuu\u0002\u0000TTtt\u0001\u0000az\u0001"+
		"\u0000AZ\u0002\u0000\t\t  \u0002\u0000(([[\u0002\u0000))]]t\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-"+
		"\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00031\u0001\u0000"+
		"\u0000\u0000\u00053\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000"+
		"\t7\u0001\u0000\u0000\u0000\u000b9\u0001\u0000\u0000\u0000\r;\u0001\u0000"+
		"\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011?\u0001\u0000\u0000\u0000"+
		"\u0013A\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000\u0000\u0017E"+
		"\u0001\u0000\u0000\u0000\u0019G\u0001\u0000\u0000\u0000\u001bI\u0001\u0000"+
		"\u0000\u0000\u001dK\u0001\u0000\u0000\u0000\u001fM\u0001\u0000\u0000\u0000"+
		"!O\u0001\u0000\u0000\u0000#Q\u0001\u0000\u0000\u0000%V\u0001\u0000\u0000"+
		"\u0000\'`\u0001\u0000\u0000\u0000)d\u0001\u0000\u0000\u0000+k\u0001\u0000"+
		"\u0000\u0000-o\u0001\u0000\u0000\u0000/0\u0005:\u0000\u00000\u0002\u0001"+
		"\u0000\u0000\u000012\u0005-\u0000\u00002\u0004\u0001\u0000\u0000\u0000"+
		"34\u0005)\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005(\u0000\u0000"+
		"6\b\u0001\u0000\u0000\u000078\u0005[\u0000\u00008\n\u0001\u0000\u0000"+
		"\u00009:\u0005]\u0000\u0000:\f\u0001\u0000\u0000\u0000;<\u0005/\u0000"+
		"\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005@\u0000\u0000>\u0010\u0001"+
		"\u0000\u0000\u0000?@\u0007\u0000\u0000\u0000@\u0012\u0001\u0000\u0000"+
		"\u0000AB\u0007\u0001\u0000\u0000B\u0014\u0001\u0000\u0000\u0000CD\u0007"+
		"\u0002\u0000\u0000D\u0016\u0001\u0000\u0000\u0000EF\u0007\u0003\u0000"+
		"\u0000F\u0018\u0001\u0000\u0000\u0000GH\u0007\u0004\u0000\u0000H\u001a"+
		"\u0001\u0000\u0000\u0000IJ\u0007\u0005\u0000\u0000J\u001c\u0001\u0000"+
		"\u0000\u0000KL\u0007\u0006\u0000\u0000L\u001e\u0001\u0000\u0000\u0000"+
		"MN\u0007\u0007\u0000\u0000N \u0001\u0000\u0000\u0000OP\u0007\b\u0000\u0000"+
		"P\"\u0001\u0000\u0000\u0000QR\u0003\u0013\t\u0000RS\u0003\u0011\b\u0000"+
		"ST\u0003\u0015\n\u0000TU\u0003\u0013\t\u0000U$\u0001\u0000\u0000\u0000"+
		"VW\u0003\u0013\t\u0000WX\u0003\u0017\u000b\u0000XY\u0003\u0019\f\u0000"+
		"YZ\u0003\u001b\r\u0000Z[\u0003\u001d\u000e\u0000[\\\u0003\u0013\t\u0000"+
		"\\&\u0001\u0000\u0000\u0000]a\u0003\u001f\u000f\u0000^a\u0003!\u0010\u0000"+
		"_a\u0005_\u0000\u0000`]\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000c(\u0001\u0000\u0000\u0000de\u0007\t\u0000"+
		"\u0000e*\u0001\u0000\u0000\u0000fh\u0005\r\u0000\u0000gf\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000il\u0005\n\u0000"+
		"\u0000jl\u0005\r\u0000\u0000kg\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000"+
		"\u0000lm\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000"+
		"\u0000\u0000n,\u0001\u0000\u0000\u0000oq\u0007\n\u0000\u0000pr\b\u000b"+
		"\u0000\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0007\u000b\u0000\u0000v.\u0001\u0000\u0000\u0000\u0007\u0000`bgkm"+
		"s\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}