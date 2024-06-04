// Generated from /Users/manud/Desktop/TC/Parcial 2/src/main/python/compiladores.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class compiladoresParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, OTRO=2, ID=3;
	public static final int
		RULE_s = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"s"
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
			null, "NUMERO", "OTRO", "ID"
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
	public String getGrammarFileName() { return "compiladores.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public compiladoresParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public Token ID;
		public Token NUMERO;
		public Token OTRO;
		public TerminalNode ID() { return getToken(compiladoresParser.ID, 0); }
		public SContext s() {
			return getRuleContext(SContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(compiladoresParser.NUMERO, 0); }
		public TerminalNode OTRO() { return getToken(compiladoresParser.OTRO, 0); }
		public TerminalNode EOF() { return getToken(compiladoresParser.EOF, 0); }
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof compiladoresListener ) ((compiladoresListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof compiladoresVisitor ) return ((compiladoresVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		try {
			setState(12);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(2);
				((SContext)_localctx).ID = match(ID);
				print("ID ->" + (((SContext)_localctx).ID!=null?((SContext)_localctx).ID.getText():null) + "<--") 
				setState(4);
				s();
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(5);
				((SContext)_localctx).NUMERO = match(NUMERO);
				print("NUMERO ->" + (((SContext)_localctx).NUMERO!=null?((SContext)_localctx).NUMERO.getText():null) + "<--") 
				setState(7);
				s();
				}
				break;
			case OTRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(8);
				((SContext)_localctx).OTRO = match(OTRO);
				print("Otro ->" + (((SContext)_localctx).OTRO!=null?((SContext)_localctx).OTRO.getText():null) + "<--") 
				setState(10);
				s();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 4);
				{
				setState(11);
				match(EOF);
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
		"\u0004\u0001\u0003\u000f\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\r\b\u0000\u0001\u0000\u0000\u0000"+
		"\u0001\u0000\u0000\u0000\u0010\u0000\f\u0001\u0000\u0000\u0000\u0002\u0003"+
		"\u0005\u0003\u0000\u0000\u0003\u0004\u0006\u0000\uffff\uffff\u0000\u0004"+
		"\r\u0003\u0000\u0000\u0000\u0005\u0006\u0005\u0001\u0000\u0000\u0006\u0007"+
		"\u0006\u0000\uffff\uffff\u0000\u0007\r\u0003\u0000\u0000\u0000\b\t\u0005"+
		"\u0002\u0000\u0000\t\n\u0006\u0000\uffff\uffff\u0000\n\r\u0003\u0000\u0000"+
		"\u0000\u000b\r\u0005\u0000\u0000\u0001\f\u0002\u0001\u0000\u0000\u0000"+
		"\f\u0005\u0001\u0000\u0000\u0000\f\b\u0001\u0000\u0000\u0000\f\u000b\u0001"+
		"\u0000\u0000\u0000\r\u0001\u0001\u0000\u0000\u0000\u0001\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}