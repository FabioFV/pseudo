// Generated from C:/Users/Programming/Documents/Programacion/Java/PSEUDO/src\PSEUDO.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSEUDOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, FIN=2, IF=3, THEN=4, AND=5, OR=6, TRUE=7, FALSE=8, MULT=9, DIV=10, 
		PLUS=11, MINUS=12, GT=13, GE=14, LT=15, LE=16, EQ=17, LPAREN=18, RPAREN=19, 
		ENT=20, DEC=21, STR=22, CONST=23, IMPRIME=24, LEE=25, NAMEDEF=26, NUMDEF=27, 
		WS=28, COMMENT=29;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INICIO", "FIN", "IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", "DIV", 
		"PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", "ENT", 
		"DEC", "STR", "CONST", "IMPRIME", "LEE", "NAMEDEF", "NUMDEF", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAMA'", "'FIN'", "'SI'", "'ENTONCES'", "'Y'", "'O'", "'VERDADERO'", 
		"'FALSO'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'='", 
		"'('", "')'", "'ENT'", "'DEC'", "'STR'", "'CONST'", "'IMPRIME'", "'LEE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "FIN", "IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", 
		"DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", 
		"ENT", "DEC", "STR", "CONST", "IMPRIME", "LEE", "NAMEDEF", "NUMDEF", "WS", 
		"COMMENT"
	};
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


	public PSEUDOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PSEUDO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\37\u00be\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\3\33\6\33\u00a2\n\33\r\33\16\33\u00a3\3\34\6\34\u00a7\n\34"+
		"\r\34\16\34\u00a8\3\35\6\35\u00ac\n\35\r\35\16\35\u00ad\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\6\36\u00b6\n\36\r\36\16\36\u00b7\3\36\5\36\u00bb\n\36"+
		"\3\36\3\36\3\u00b7\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37\3\2\6\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\3\3"+
		"\f\f\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\3=\3\2\2\2\5F\3\2\2\2\7J\3\2\2\2\tM\3\2\2\2\13V\3\2\2"+
		"\2\rX\3\2\2\2\17Z\3\2\2\2\21d\3\2\2\2\23j\3\2\2\2\25l\3\2\2\2\27n\3\2"+
		"\2\2\31p\3\2\2\2\33r\3\2\2\2\35t\3\2\2\2\37w\3\2\2\2!y\3\2\2\2#|\3\2\2"+
		"\2%~\3\2\2\2\'\u0080\3\2\2\2)\u0082\3\2\2\2+\u0086\3\2\2\2-\u008a\3\2"+
		"\2\2/\u008e\3\2\2\2\61\u0094\3\2\2\2\63\u009c\3\2\2\2\65\u00a1\3\2\2\2"+
		"\67\u00a6\3\2\2\29\u00ab\3\2\2\2;\u00b1\3\2\2\2=>\7R\2\2>?\7T\2\2?@\7"+
		"Q\2\2@A\7I\2\2AB\7T\2\2BC\7C\2\2CD\7O\2\2DE\7C\2\2E\4\3\2\2\2FG\7H\2\2"+
		"GH\7K\2\2HI\7P\2\2I\6\3\2\2\2JK\7U\2\2KL\7K\2\2L\b\3\2\2\2MN\7G\2\2NO"+
		"\7P\2\2OP\7V\2\2PQ\7Q\2\2QR\7P\2\2RS\7E\2\2ST\7G\2\2TU\7U\2\2U\n\3\2\2"+
		"\2VW\7[\2\2W\f\3\2\2\2XY\7Q\2\2Y\16\3\2\2\2Z[\7X\2\2[\\\7G\2\2\\]\7T\2"+
		"\2]^\7F\2\2^_\7C\2\2_`\7F\2\2`a\7G\2\2ab\7T\2\2bc\7Q\2\2c\20\3\2\2\2d"+
		"e\7H\2\2ef\7C\2\2fg\7N\2\2gh\7U\2\2hi\7Q\2\2i\22\3\2\2\2jk\7,\2\2k\24"+
		"\3\2\2\2lm\7\61\2\2m\26\3\2\2\2no\7-\2\2o\30\3\2\2\2pq\7/\2\2q\32\3\2"+
		"\2\2rs\7@\2\2s\34\3\2\2\2tu\7@\2\2uv\7?\2\2v\36\3\2\2\2wx\7>\2\2x \3\2"+
		"\2\2yz\7>\2\2z{\7?\2\2{\"\3\2\2\2|}\7?\2\2}$\3\2\2\2~\177\7*\2\2\177&"+
		"\3\2\2\2\u0080\u0081\7+\2\2\u0081(\3\2\2\2\u0082\u0083\7G\2\2\u0083\u0084"+
		"\7P\2\2\u0084\u0085\7V\2\2\u0085*\3\2\2\2\u0086\u0087\7F\2\2\u0087\u0088"+
		"\7G\2\2\u0088\u0089\7E\2\2\u0089,\3\2\2\2\u008a\u008b\7U\2\2\u008b\u008c"+
		"\7V\2\2\u008c\u008d\7T\2\2\u008d.\3\2\2\2\u008e\u008f\7E\2\2\u008f\u0090"+
		"\7Q\2\2\u0090\u0091\7P\2\2\u0091\u0092\7U\2\2\u0092\u0093\7V\2\2\u0093"+
		"\60\3\2\2\2\u0094\u0095\7K\2\2\u0095\u0096\7O\2\2\u0096\u0097\7R\2\2\u0097"+
		"\u0098\7T\2\2\u0098\u0099\7K\2\2\u0099\u009a\7O\2\2\u009a\u009b\7G\2\2"+
		"\u009b\62\3\2\2\2\u009c\u009d\7N\2\2\u009d\u009e\7G\2\2\u009e\u009f\7"+
		"G\2\2\u009f\64\3\2\2\2\u00a0\u00a2\t\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\66\3\2\2\2\u00a5"+
		"\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a8\u00a9\3\2\2\2\u00a98\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\b\35\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7\61\2"+
		"\2\u00b2\u00b3\7\61\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b6\13\2\2\2\u00b5"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\b\36\2\2\u00bd<\3\2\2\2\b\2\u00a3\u00a8\u00ad"+
		"\u00b7\u00ba\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}