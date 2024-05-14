// Generated from /Users/manud/Desktop/TC/Parcial 2/src/main/java/compiladores/compiladores.g4 by ANTLR 4.13.1

 package compiladores;
 
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PA=1, PC=2, CA=3, CC=4, LA=5, LC=6, WS=7, PYC=8, IGUAL=9, MAS=10, MENOS=11, 
		MULTIPLICACION=12, MODULO=13, INCREMENTAR=14, DECREMENTAR=15, COMA=16, 
		WHILE=17, FOR=18, IF=19, ELSE=20, DT=21, COMP=22, OPERADOR=23, LOGICO=24, 
		NUMERO=25, ID=26;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PA", "PC", "CA", "CC", "LA", "LC", "LETRA", "DIGITO", "WS", "PYC", "IGUAL", 
			"MAS", "MENOS", "MULTIPLICACION", "DIVISION", "MODULO", "INCREMENTAR", 
			"DECREMENTAR", "COMA", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", 
			"IGUALIGUAL", "DIFERENTE", "AND", "OR", "NOT", "WHILE", "FOR", "IF", 
			"ELSE", "DT", "COMP", "OPERADOR", "LOGICO", "NUMERO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'{'", "'}'", null, "';'", "'='", "'+'", 
			"'-'", "'*'", "'%'", "'++'", "'--'", "','", "'while'", "'for'", "'if'", 
			"'else'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PA", "PC", "CA", "CC", "LA", "LC", "WS", "PYC", "IGUAL", "MAS", 
			"MENOS", "MULTIPLICACION", "MODULO", "INCREMENTAR", "DECREMENTAR", "COMA", 
			"WHILE", "FOR", "IF", "ELSE", "DT", "COMP", "OPERADOR", "LOGICO", "NUMERO", 
			"ID"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\u001a\u00d4\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d"+
		"\u0002\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!"+
		"\u0007!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0004\b_\b\b\u000b"+
		"\b\f\b`\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u00ae\b \u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u00b6\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u00bd\b\"\u0001#\u0001#\u0001#\u0003#\u00c2\b#\u0001$\u0004"+
		"$\u00c5\b$\u000b$\f$\u00c6\u0001%\u0001%\u0003%\u00cb\b%\u0001%\u0001"+
		"%\u0001%\u0005%\u00d0\b%\n%\f%\u00d3\t%\u0000\u0000&\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0000\u000f\u0000"+
		"\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\u0000\u001f"+
		"\r!\u000e#\u000f%\u0010\'\u0000)\u0000+\u0000-\u0000/\u00001\u00003\u0000"+
		"5\u00007\u00009\u0011;\u0012=\u0013?\u0014A\u0015C\u0016E\u0017G\u0018"+
		"I\u0019K\u001a\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u00d9\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"9\u0001\u0000\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001"+
		"\u0000\u0000\u0000\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000"+
		"\u0000\u0000C\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000"+
		"G\u0001\u0000\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001"+
		"\u0000\u0000\u0000\u0001M\u0001\u0000\u0000\u0000\u0003O\u0001\u0000\u0000"+
		"\u0000\u0005Q\u0001\u0000\u0000\u0000\u0007S\u0001\u0000\u0000\u0000\t"+
		"U\u0001\u0000\u0000\u0000\u000bW\u0001\u0000\u0000\u0000\rY\u0001\u0000"+
		"\u0000\u0000\u000f[\u0001\u0000\u0000\u0000\u0011^\u0001\u0000\u0000\u0000"+
		"\u0013d\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017h"+
		"\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bl\u0001\u0000"+
		"\u0000\u0000\u001dn\u0001\u0000\u0000\u0000\u001fp\u0001\u0000\u0000\u0000"+
		"!r\u0001\u0000\u0000\u0000#u\u0001\u0000\u0000\u0000%x\u0001\u0000\u0000"+
		"\u0000\'z\u0001\u0000\u0000\u0000)|\u0001\u0000\u0000\u0000+~\u0001\u0000"+
		"\u0000\u0000-\u0081\u0001\u0000\u0000\u0000/\u0084\u0001\u0000\u0000\u0000"+
		"1\u0087\u0001\u0000\u0000\u00003\u008a\u0001\u0000\u0000\u00005\u008d"+
		"\u0001\u0000\u0000\u00007\u0090\u0001\u0000\u0000\u00009\u0092\u0001\u0000"+
		"\u0000\u0000;\u0098\u0001\u0000\u0000\u0000=\u009c\u0001\u0000\u0000\u0000"+
		"?\u009f\u0001\u0000\u0000\u0000A\u00ad\u0001\u0000\u0000\u0000C\u00b5"+
		"\u0001\u0000\u0000\u0000E\u00bc\u0001\u0000\u0000\u0000G\u00c1\u0001\u0000"+
		"\u0000\u0000I\u00c4\u0001\u0000\u0000\u0000K\u00ca\u0001\u0000\u0000\u0000"+
		"MN\u0005(\u0000\u0000N\u0002\u0001\u0000\u0000\u0000OP\u0005)\u0000\u0000"+
		"P\u0004\u0001\u0000\u0000\u0000QR\u0005[\u0000\u0000R\u0006\u0001\u0000"+
		"\u0000\u0000ST\u0005]\u0000\u0000T\b\u0001\u0000\u0000\u0000UV\u0005{"+
		"\u0000\u0000V\n\u0001\u0000\u0000\u0000WX\u0005}\u0000\u0000X\f\u0001"+
		"\u0000\u0000\u0000YZ\u0007\u0000\u0000\u0000Z\u000e\u0001\u0000\u0000"+
		"\u0000[\\\u0007\u0001\u0000\u0000\\\u0010\u0001\u0000\u0000\u0000]_\u0007"+
		"\u0002\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0006\b\u0000\u0000c\u0012\u0001\u0000\u0000\u0000de\u0005;\u0000"+
		"\u0000e\u0014\u0001\u0000\u0000\u0000fg\u0005=\u0000\u0000g\u0016\u0001"+
		"\u0000\u0000\u0000hi\u0005+\u0000\u0000i\u0018\u0001\u0000\u0000\u0000"+
		"jk\u0005-\u0000\u0000k\u001a\u0001\u0000\u0000\u0000lm\u0005*\u0000\u0000"+
		"m\u001c\u0001\u0000\u0000\u0000no\u0005/\u0000\u0000o\u001e\u0001\u0000"+
		"\u0000\u0000pq\u0005%\u0000\u0000q \u0001\u0000\u0000\u0000rs\u0005+\u0000"+
		"\u0000st\u0005+\u0000\u0000t\"\u0001\u0000\u0000\u0000uv\u0005-\u0000"+
		"\u0000vw\u0005-\u0000\u0000w$\u0001\u0000\u0000\u0000xy\u0005,\u0000\u0000"+
		"y&\u0001\u0000\u0000\u0000z{\u0005>\u0000\u0000{(\u0001\u0000\u0000\u0000"+
		"|}\u0005<\u0000\u0000}*\u0001\u0000\u0000\u0000~\u007f\u0005>\u0000\u0000"+
		"\u007f\u0080\u0005=\u0000\u0000\u0080,\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005<\u0000\u0000\u0082\u0083\u0005=\u0000\u0000\u0083.\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0005=\u0000\u0000\u0085\u0086\u0005=\u0000\u0000"+
		"\u00860\u0001\u0000\u0000\u0000\u0087\u0088\u0005!\u0000\u0000\u0088\u0089"+
		"\u0005=\u0000\u0000\u00892\u0001\u0000\u0000\u0000\u008a\u008b\u0005&"+
		"\u0000\u0000\u008b\u008c\u0005&\u0000\u0000\u008c4\u0001\u0000\u0000\u0000"+
		"\u008d\u008e\u0005|\u0000\u0000\u008e\u008f\u0005|\u0000\u0000\u008f6"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005!\u0000\u0000\u00918\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005w\u0000\u0000\u0093\u0094\u0005h\u0000\u0000"+
		"\u0094\u0095\u0005i\u0000\u0000\u0095\u0096\u0005l\u0000\u0000\u0096\u0097"+
		"\u0005e\u0000\u0000\u0097:\u0001\u0000\u0000\u0000\u0098\u0099\u0005f"+
		"\u0000\u0000\u0099\u009a\u0005o\u0000\u0000\u009a\u009b\u0005r\u0000\u0000"+
		"\u009b<\u0001\u0000\u0000\u0000\u009c\u009d\u0005i\u0000\u0000\u009d\u009e"+
		"\u0005f\u0000\u0000\u009e>\u0001\u0000\u0000\u0000\u009f\u00a0\u0005e"+
		"\u0000\u0000\u00a0\u00a1\u0005l\u0000\u0000\u00a1\u00a2\u0005s\u0000\u0000"+
		"\u00a2\u00a3\u0005e\u0000\u0000\u00a3@\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0005i\u0000\u0000\u00a5\u00a6\u0005n\u0000\u0000\u00a6\u00ae\u0005t"+
		"\u0000\u0000\u00a7\u00a8\u0005d\u0000\u0000\u00a8\u00a9\u0005o\u0000\u0000"+
		"\u00a9\u00aa\u0005u\u0000\u0000\u00aa\u00ab\u0005b\u0000\u0000\u00ab\u00ac"+
		"\u0005l\u0000\u0000\u00ac\u00ae\u0005e\u0000\u0000\u00ad\u00a4\u0001\u0000"+
		"\u0000\u0000\u00ad\u00a7\u0001\u0000\u0000\u0000\u00aeB\u0001\u0000\u0000"+
		"\u0000\u00af\u00b6\u0003\'\u0013\u0000\u00b0\u00b6\u0003)\u0014\u0000"+
		"\u00b1\u00b6\u0003+\u0015\u0000\u00b2\u00b6\u0003-\u0016\u0000\u00b3\u00b6"+
		"\u0003/\u0017\u0000\u00b4\u00b6\u00031\u0018\u0000\u00b5\u00af\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6D\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bd\u0003\u0017\u000b\u0000\u00b8\u00bd\u0003\u0019\f\u0000"+
		"\u00b9\u00bd\u0003\u001b\r\u0000\u00ba\u00bd\u0003\u001d\u000e\u0000\u00bb"+
		"\u00bd\u0003\u001f\u000f\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b8\u0001\u0000\u0000\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000\u0000\u00bd"+
		"F\u0001\u0000\u0000\u0000\u00be\u00c2\u00033\u0019\u0000\u00bf\u00c2\u0003"+
		"5\u001a\u0000\u00c0\u00c2\u00037\u001b\u0000\u00c1\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2H\u0001\u0000\u0000\u0000\u00c3\u00c5\u0003\u000f\u0007\u0000"+
		"\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c7J\u0001\u0000\u0000\u0000\u00c8\u00cb\u0003\r\u0006\u0000\u00c9"+
		"\u00cb\u0005_\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00d1\u0001\u0000\u0000\u0000\u00cc\u00d0"+
		"\u0003\r\u0006\u0000\u00cd\u00d0\u0003\u000f\u0007\u0000\u00ce\u00d0\u0005"+
		"_\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d2L\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\n\u0000`\u00ad\u00b5\u00bc\u00c1\u00c6\u00ca\u00cf\u00d1\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}