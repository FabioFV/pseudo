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
		T__0=1, T__1=2, INICIO=3, FIN=4, IF=5, THEN=6, ELSE=7, AND=8, OR=9, TRUE=10, 
		FALSE=11, MULT=12, DIV=13, PLUS=14, MINUS=15, GT=16, GE=17, LT=18, LE=19, 
		EQ=20, LPAREN=21, RPAREN=22, QT=23, ENT=24, DEC=25, STR=26, BOOL=27, CONST=28, 
		IMPRIME=29, LEE=30, MIENTRAS=31, NAMEDEF=32, NUMDEF=33, WS=34, COMMENT=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INICIO", "FIN", "IF", "THEN", "ELSE", "AND", "OR", "TRUE", 
		"FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", 
		"LPAREN", "RPAREN", "QT", "ENT", "DEC", "STR", "BOOL", "CONST", "IMPRIME", 
		"LEE", "MIENTRAS", "NAMEDEF", "NUMDEF", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'PROGRAMA'", "'FIN'", "'SI'", "'ENTONCES'", "'SINO'", 
		"'Y'", "'O'", "'VERDADERO'", "'FALSO'", "'*'", "'/'", "'+'", "'-'", "'>'", 
		"'>='", "'<'", "'<='", "'='", "'('", "')'", "'\"'", "'ENT'", "'DEC'", 
		"'STR'", "'BOOL'", "'CONST'", "'IMPRIME'", "'LEE'", "'MIENTRAS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INICIO", "FIN", "IF", "THEN", "ELSE", "AND", "OR", 
		"TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", 
		"EQ", "LPAREN", "RPAREN", "QT", "ENT", "DEC", "STR", "BOOL", "CONST", 
		"IMPRIME", "LEE", "MIENTRAS", "NAMEDEF", "NUMDEF", "WS", "COMMENT"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00e3\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3!\6!\u00c7\n!\r!\16!\u00c8\3\"\6\"\u00cc\n\"\r"+
		"\"\16\"\u00cd\3#\6#\u00d1\n#\r#\16#\u00d2\3#\3#\3$\3$\3$\3$\6$\u00db\n"+
		"$\r$\16$\u00dc\3$\5$\u00e0\n$\3$\3$\3\u00dc\2%\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\4"+
		"\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\3\3\f\f\u00e6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3I\3\2\2\2\5K\3\2\2"+
		"\2\7M\3\2\2\2\tV\3\2\2\2\13Z\3\2\2\2\r]\3\2\2\2\17f\3\2\2\2\21k\3\2\2"+
		"\2\23m\3\2\2\2\25o\3\2\2\2\27y\3\2\2\2\31\177\3\2\2\2\33\u0081\3\2\2\2"+
		"\35\u0083\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0089\3\2\2\2%\u008c"+
		"\3\2\2\2\'\u008e\3\2\2\2)\u0091\3\2\2\2+\u0093\3\2\2\2-\u0095\3\2\2\2"+
		"/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u009d\3\2\2\2\65\u00a1\3\2\2\2\67"+
		"\u00a5\3\2\2\29\u00aa\3\2\2\2;\u00b0\3\2\2\2=\u00b8\3\2\2\2?\u00bc\3\2"+
		"\2\2A\u00c6\3\2\2\2C\u00cb\3\2\2\2E\u00d0\3\2\2\2G\u00d6\3\2\2\2IJ\7}"+
		"\2\2J\4\3\2\2\2KL\7\177\2\2L\6\3\2\2\2MN\7R\2\2NO\7T\2\2OP\7Q\2\2PQ\7"+
		"I\2\2QR\7T\2\2RS\7C\2\2ST\7O\2\2TU\7C\2\2U\b\3\2\2\2VW\7H\2\2WX\7K\2\2"+
		"XY\7P\2\2Y\n\3\2\2\2Z[\7U\2\2[\\\7K\2\2\\\f\3\2\2\2]^\7G\2\2^_\7P\2\2"+
		"_`\7V\2\2`a\7Q\2\2ab\7P\2\2bc\7E\2\2cd\7G\2\2de\7U\2\2e\16\3\2\2\2fg\7"+
		"U\2\2gh\7K\2\2hi\7P\2\2ij\7Q\2\2j\20\3\2\2\2kl\7[\2\2l\22\3\2\2\2mn\7"+
		"Q\2\2n\24\3\2\2\2op\7X\2\2pq\7G\2\2qr\7T\2\2rs\7F\2\2st\7C\2\2tu\7F\2"+
		"\2uv\7G\2\2vw\7T\2\2wx\7Q\2\2x\26\3\2\2\2yz\7H\2\2z{\7C\2\2{|\7N\2\2|"+
		"}\7U\2\2}~\7Q\2\2~\30\3\2\2\2\177\u0080\7,\2\2\u0080\32\3\2\2\2\u0081"+
		"\u0082\7\61\2\2\u0082\34\3\2\2\2\u0083\u0084\7-\2\2\u0084\36\3\2\2\2\u0085"+
		"\u0086\7/\2\2\u0086 \3\2\2\2\u0087\u0088\7@\2\2\u0088\"\3\2\2\2\u0089"+
		"\u008a\7@\2\2\u008a\u008b\7?\2\2\u008b$\3\2\2\2\u008c\u008d\7>\2\2\u008d"+
		"&\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090\7?\2\2\u0090(\3\2\2\2\u0091\u0092"+
		"\7?\2\2\u0092*\3\2\2\2\u0093\u0094\7*\2\2\u0094,\3\2\2\2\u0095\u0096\7"+
		"+\2\2\u0096.\3\2\2\2\u0097\u0098\7$\2\2\u0098\60\3\2\2\2\u0099\u009a\7"+
		"G\2\2\u009a\u009b\7P\2\2\u009b\u009c\7V\2\2\u009c\62\3\2\2\2\u009d\u009e"+
		"\7F\2\2\u009e\u009f\7G\2\2\u009f\u00a0\7E\2\2\u00a0\64\3\2\2\2\u00a1\u00a2"+
		"\7U\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7T\2\2\u00a4\66\3\2\2\2\u00a5\u00a6"+
		"\7D\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7Q\2\2\u00a8\u00a9\7N\2\2\u00a9"+
		"8\3\2\2\2\u00aa\u00ab\7E\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7P\2\2\u00ad"+
		"\u00ae\7U\2\2\u00ae\u00af\7V\2\2\u00af:\3\2\2\2\u00b0\u00b1\7K\2\2\u00b1"+
		"\u00b2\7O\2\2\u00b2\u00b3\7R\2\2\u00b3\u00b4\7T\2\2\u00b4\u00b5\7K\2\2"+
		"\u00b5\u00b6\7O\2\2\u00b6\u00b7\7G\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7N\2"+
		"\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7G\2\2\u00bb>\3\2\2\2\u00bc\u00bd\7"+
		"O\2\2\u00bd\u00be\7K\2\2\u00be\u00bf\7G\2\2\u00bf\u00c0\7P\2\2\u00c0\u00c1"+
		"\7V\2\2\u00c1\u00c2\7T\2\2\u00c2\u00c3\7C\2\2\u00c3\u00c4\7U\2\2\u00c4"+
		"@\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9B\3\2\2\2\u00ca\u00cc\t"+
		"\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ceD\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d5\b#\2\2\u00d5F\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7"+
		"\u00d8\7\61\2\2\u00d8\u00da\3\2\2\2\u00d9\u00db\13\2\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd"+
		"\u00df\3\2\2\2\u00de\u00e0\t\5\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e2\b$\2\2\u00e2H\3\2\2\2\b\2\u00c8\u00cd\u00d2\u00dc\u00df"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}