// Generated from C:/Users/Programming/Documents/Programacion/Java/PSEUDO/src\PSEUDO.g4 by ANTLR 4.5.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PSEUDOParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INICIO=3, FIN=4, IF=5, THEN=6, ELSE=7, AND=8, OR=9, TRUE=10, 
		FALSE=11, MULT=12, DIV=13, PLUS=14, MINUS=15, GT=16, GE=17, LT=18, LE=19, 
		EQ=20, LPAREN=21, RPAREN=22, QT=23, POINT=24, ENT=25, DEC=26, STR=27, 
		BOOL=28, CONST=29, IMPRIME=30, LEE=31, MIENTRAS=32, NAMEDEF=33, NUMDEF=34, 
		WS=35, COMMENT=36;
	public static final int
		RULE_programa = 0, RULE_cuerpo = 1, RULE_declaracion = 2, RULE_funcion = 3, 
		RULE_dataType = 4, RULE_bool_type = 5, RULE_stringLit = 6, RULE_condicional = 7, 
		RULE_condicion = 8, RULE_comp_operator = 9, RULE_evaluacion = 10, RULE_conclusion = 11, 
		RULE_asignacion = 12, RULE_operacion = 13, RULE_exp = 14, RULE_nombre = 15, 
		RULE_valor = 16, RULE_variable = 17, RULE_constante = 18, RULE_imprime = 19, 
		RULE_lee = 20, RULE_mientras = 21;
	public static final String[] ruleNames = {
		"programa", "cuerpo", "declaracion", "funcion", "dataType", "bool_type", 
		"stringLit", "condicional", "condicion", "comp_operator", "evaluacion", 
		"conclusion", "asignacion", "operacion", "exp", "nombre", "valor", "variable", 
		"constante", "imprime", "lee", "mientras"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'PROGRAMA'", "'FIN'", "'SI'", "'ENTONCES'", "'SINO'", 
		"'Y'", "'O'", "'VERDADERO'", "'FALSO'", "'*'", "'/'", "'+'", "'-'", "'>'", 
		"'>='", "'<'", "'<='", "'='", "'('", "')'", "'\"'", "'.'", "'ENT'", "'DEC'", 
		"'STR'", "'BOOL'", "'CONST'", "'IMPRIME'", "'LEE'", "'MIENTRAS'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INICIO", "FIN", "IF", "THEN", "ELSE", "AND", "OR", 
		"TRUE", "FALSE", "MULT", "DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", 
		"EQ", "LPAREN", "RPAREN", "QT", "POINT", "ENT", "DEC", "STR", "BOOL", 
		"CONST", "IMPRIME", "LEE", "MIENTRAS", "NAMEDEF", "NUMDEF", "WS", "COMMENT"
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

	@Override
	public String getGrammarFileName() { return "PSEUDO.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PSEUDOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(PSEUDOParser.INICIO, 0); }
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public TerminalNode FIN() { return getToken(PSEUDOParser.FIN, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INICIO);
			setState(45);
			cuerpo();
			setState(46);
			match(FIN);
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

	public static class CuerpoContext extends ParserRuleContext {
		public List<DeclaracionContext> declaracion() {
			return getRuleContexts(DeclaracionContext.class);
		}
		public DeclaracionContext declaracion(int i) {
			return getRuleContext(DeclaracionContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<MientrasContext> mientras() {
			return getRuleContexts(MientrasContext.class);
		}
		public MientrasContext mientras(int i) {
			return getRuleContext(MientrasContext.class,i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public CuerpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cuerpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterCuerpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitCuerpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CuerpoContext cuerpo() throws RecognitionException {
		CuerpoContext _localctx = new CuerpoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cuerpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ENT) | (1L << DEC) | (1L << STR) | (1L << BOOL) | (1L << CONST) | (1L << IMPRIME) | (1L << LEE) | (1L << MIENTRAS) | (1L << NAMEDEF))) != 0)) {
				{
				setState(53);
				switch (_input.LA(1)) {
				case ENT:
				case DEC:
				case STR:
				case BOOL:
				case CONST:
					{
					setState(48);
					declaracion();
					}
					break;
				case IMPRIME:
				case LEE:
					{
					setState(49);
					funcion();
					}
					break;
				case NAMEDEF:
					{
					setState(50);
					asignacion();
					}
					break;
				case MIENTRAS:
					{
					setState(51);
					mientras();
					}
					break;
				case IF:
					{
					setState(52);
					condicional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
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

	public static class DeclaracionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConstanteContext constante() {
			return getRuleContext(ConstanteContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion);
		try {
			setState(60);
			switch (_input.LA(1)) {
			case ENT:
			case DEC:
			case STR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				variable();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				constante();
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

	public static class FuncionContext extends ParserRuleContext {
		public ImprimeContext imprime() {
			return getRuleContext(ImprimeContext.class,0);
		}
		public LeeContext lee() {
			return getRuleContext(LeeContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcion);
		try {
			setState(64);
			switch (_input.LA(1)) {
			case IMPRIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				imprime();
				}
				break;
			case LEE:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				lee();
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

	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(PSEUDOParser.ENT, 0); }
		public TerminalNode DEC() { return getToken(PSEUDOParser.DEC, 0); }
		public TerminalNode STR() { return getToken(PSEUDOParser.STR, 0); }
		public TerminalNode BOOL() { return getToken(PSEUDOParser.BOOL, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << DEC) | (1L << STR) | (1L << BOOL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class Bool_typeContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PSEUDOParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PSEUDOParser.FALSE, 0); }
		public Bool_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterBool_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitBool_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitBool_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_typeContext bool_type() throws RecognitionException {
		Bool_typeContext _localctx = new Bool_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bool_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class StringLitContext extends ParserRuleContext {
		public List<TerminalNode> QT() { return getTokens(PSEUDOParser.QT); }
		public TerminalNode QT(int i) {
			return getToken(PSEUDOParser.QT, i);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public StringLitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterStringLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitStringLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitStringLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLitContext stringLit() throws RecognitionException {
		StringLitContext _localctx = new StringLitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stringLit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(QT);
			setState(73); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(73);
				switch (_input.LA(1)) {
				case NAMEDEF:
					{
					setState(71);
					nombre();
					}
					break;
				case MINUS:
				case NUMDEF:
					{
					setState(72);
					valor();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NAMEDEF) | (1L << NUMDEF))) != 0) );
			setState(77);
			match(QT);
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

	public static class CondicionalContext extends ParserRuleContext {
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
	 
		public CondicionalContext() { }
		public void copyFrom(CondicionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleConclusionContext extends CondicionalContext {
		public TerminalNode IF() { return getToken(PSEUDOParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PSEUDOParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(PSEUDOParser.THEN, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public SimpleConclusionContext(CondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterSimpleConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitSimpleConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitSimpleConclusion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ElseConclusionContext extends CondicionalContext {
		public TerminalNode IF() { return getToken(PSEUDOParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(PSEUDOParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(PSEUDOParser.THEN, 0); }
		public List<ConclusionContext> conclusion() {
			return getRuleContexts(ConclusionContext.class);
		}
		public ConclusionContext conclusion(int i) {
			return getRuleContext(ConclusionContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PSEUDOParser.ELSE, 0); }
		public ElseConclusionContext(CondicionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterElseConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitElseConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitElseConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new SimpleConclusionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(IF);
				setState(80);
				match(LPAREN);
				setState(81);
				condicion();
				setState(82);
				match(RPAREN);
				setState(83);
				match(THEN);
				setState(84);
				conclusion();
				}
				break;
			case 2:
				_localctx = new ElseConclusionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(IF);
				setState(87);
				match(LPAREN);
				setState(88);
				condicion();
				setState(89);
				match(RPAREN);
				setState(90);
				match(THEN);
				setState(91);
				conclusion();
				setState(92);
				match(ELSE);
				setState(93);
				conclusion();
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(PSEUDOParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PSEUDOParser.LPAREN, i);
		}
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PSEUDOParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PSEUDOParser.RPAREN, i);
		}
		public TerminalNode AND() { return getToken(PSEUDOParser.AND, 0); }
		public TerminalNode OR() { return getToken(PSEUDOParser.OR, 0); }
		public EvaluacionContext evaluacion() {
			return getRuleContext(EvaluacionContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condicion);
		try {
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(LPAREN);
				setState(98);
				condicion();
				setState(99);
				match(RPAREN);
				setState(100);
				match(AND);
				setState(101);
				match(LPAREN);
				setState(102);
				condicion();
				setState(103);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(LPAREN);
				setState(106);
				condicion();
				setState(107);
				match(RPAREN);
				setState(108);
				match(OR);
				setState(109);
				match(LPAREN);
				setState(110);
				condicion();
				setState(111);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				evaluacion();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				nombre();
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

	public static class Comp_operatorContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(PSEUDOParser.GT, 0); }
		public TerminalNode GE() { return getToken(PSEUDOParser.GE, 0); }
		public TerminalNode LT() { return getToken(PSEUDOParser.LT, 0); }
		public TerminalNode LE() { return getToken(PSEUDOParser.LE, 0); }
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public Comp_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterComp_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitComp_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitComp_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comp_operatorContext comp_operator() throws RecognitionException {
		Comp_operatorContext _localctx = new Comp_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
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

	public static class EvaluacionContext extends ParserRuleContext {
		public Comp_operatorContext comp_operator() {
			return getRuleContext(Comp_operatorContext.class,0);
		}
		public List<NombreContext> nombre() {
			return getRuleContexts(NombreContext.class);
		}
		public NombreContext nombre(int i) {
			return getRuleContext(NombreContext.class,i);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public EvaluacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterEvaluacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitEvaluacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitEvaluacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EvaluacionContext evaluacion() throws RecognitionException {
		EvaluacionContext _localctx = new EvaluacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_evaluacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(119);
				nombre();
				}
				break;
			case 2:
				{
				setState(120);
				operacion(0);
				}
				break;
			}
			setState(123);
			comp_operator();
			setState(126);
			switch (_input.LA(1)) {
			case NAMEDEF:
				{
				setState(124);
				nombre();
				}
				break;
			case MINUS:
			case NUMDEF:
				{
				setState(125);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ConclusionContext extends ParserRuleContext {
		public CuerpoContext cuerpo() {
			return getRuleContext(CuerpoContext.class,0);
		}
		public ConclusionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conclusion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterConclusion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitConclusion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitConclusion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConclusionContext conclusion() throws RecognitionException {
		ConclusionContext _localctx = new ConclusionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conclusion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__0);
			setState(129);
			cuerpo();
			setState(130);
			match(T__1);
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

	public static class AsignacionContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			nombre();
			setState(133);
			match(EQ);
			setState(134);
			operacion(0);
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

	public static class OperacionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<OperacionContext> operacion() {
			return getRuleContexts(OperacionContext.class);
		}
		public OperacionContext operacion(int i) {
			return getRuleContext(OperacionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PSEUDOParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(PSEUDOParser.MULT, 0); }
		public TerminalNode MINUS() { return getToken(PSEUDOParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(PSEUDOParser.PLUS, 0); }
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitOperacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitOperacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		return operacion(0);
	}

	private OperacionContext operacion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OperacionContext _localctx = new OperacionContext(_ctx, _parentState);
		OperacionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_operacion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(151);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(139);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(140);
						match(DIV);
						setState(141);
						operacion(6);
						}
						break;
					case 2:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(142);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(143);
						match(MULT);
						setState(144);
						operacion(5);
						}
						break;
					case 3:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(145);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(146);
						match(MINUS);
						setState(147);
						operacion(4);
						}
						break;
					case 4:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(PLUS);
						setState(150);
						operacion(3);
						}
						break;
					}
					} 
				}
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Bool_typeContext bool_type() {
			return getRuleContext(Bool_typeContext.class,0);
		}
		public StringLitContext stringLit() {
			return getRuleContext(StringLitContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case NAMEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				nombre();
				}
				break;
			case MINUS:
			case NUMDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				valor();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(158);
				bool_type();
				}
				break;
			case QT:
				enterOuterAlt(_localctx, 4);
				{
				setState(159);
				stringLit();
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

	public static class NombreContext extends ParserRuleContext {
		public TerminalNode NAMEDEF() { return getToken(PSEUDOParser.NAMEDEF, 0); }
		public NombreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombre; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterNombre(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitNombre(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitNombre(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreContext nombre() throws RecognitionException {
		NombreContext _localctx = new NombreContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(NAMEDEF);
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

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(PSEUDOParser.MINUS, 0); }
		public List<TerminalNode> NUMDEF() { return getTokens(PSEUDOParser.NUMDEF); }
		public TerminalNode NUMDEF(int i) {
			return getToken(PSEUDOParser.NUMDEF, i);
		}
		public TerminalNode POINT() { return getToken(PSEUDOParser.POINT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(164);
				match(MINUS);
				}
			}

			setState(168); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(167);
					match(NUMDEF);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(170); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(178);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(172);
				match(POINT);
				setState(174); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(173);
						match(NUMDEF);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
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

	public static class VariableContext extends ParserRuleContext {
		public NombreContext varName;
		public OperacionContext expr;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variable);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				dataType();
				setState(181);
				((VariableContext)_localctx).varName = nombre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				dataType();
				setState(184);
				((VariableContext)_localctx).varName = nombre();
				setState(185);
				match(EQ);
				setState(186);
				((VariableContext)_localctx).expr = operacion(0);
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

	public static class ConstanteContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(PSEUDOParser.CONST, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ConstanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitConstante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitConstante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteContext constante() throws RecognitionException {
		ConstanteContext _localctx = new ConstanteContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONST);
			setState(191);
			dataType();
			setState(192);
			nombre();
			setState(193);
			match(EQ);
			setState(194);
			exp();
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

	public static class ImprimeContext extends ParserRuleContext {
		public TerminalNode IMPRIME() { return getToken(PSEUDOParser.IMPRIME, 0); }
		public TerminalNode LPAREN() { return getToken(PSEUDOParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public ImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitImprime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitImprime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimeContext imprime() throws RecognitionException {
		ImprimeContext _localctx = new ImprimeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IMPRIME);
			setState(197);
			match(LPAREN);
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(198);
				exp();
				}
				break;
			case 2:
				{
				setState(199);
				operacion(0);
				}
				break;
			}
			setState(202);
			match(RPAREN);
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

	public static class LeeContext extends ParserRuleContext {
		public TerminalNode LEE() { return getToken(PSEUDOParser.LEE, 0); }
		public TerminalNode LPAREN() { return getToken(PSEUDOParser.LPAREN, 0); }
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
		public LeeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterLee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitLee(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitLee(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeeContext lee() throws RecognitionException {
		LeeContext _localctx = new LeeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(LEE);
			setState(205);
			match(LPAREN);
			setState(206);
			nombre();
			setState(207);
			match(RPAREN);
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

	public static class MientrasContext extends ParserRuleContext {
		public TerminalNode MIENTRAS() { return getToken(PSEUDOParser.MIENTRAS, 0); }
		public TerminalNode LPAREN() { return getToken(PSEUDOParser.LPAREN, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
		public ConclusionContext conclusion() {
			return getRuleContext(ConclusionContext.class,0);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitMientras(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitMientras(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mientras);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(MIENTRAS);
			setState(210);
			match(LPAREN);
			setState(211);
			condicion();
			setState(212);
			match(RPAREN);
			setState(213);
			conclusion();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return operacion_sempred((OperacionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean operacion_sempred(OperacionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00da\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\5\4?\n\4\3\5\3\5\5\5"+
		"C\n\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\6\bL\n\b\r\b\16\bM\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tb\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"v\n\n\3\13\3\13\3\f\3\f\5\f|\n\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u009a\n\17\f\17\16\17\u009d\13\17"+
		"\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\22\5\22\u00a8\n\22\3"+
		"\22\6\22\u00ab\n\22\r\22\16\22\u00ac\3\22\3\22\6\22\u00b1\n\22\r\22\16"+
		"\22\u00b2\5\22\u00b5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u00bf\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00cb"+
		"\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\2\3\34\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\3\2"+
		"\33\36\3\2\f\r\3\2\22\26\u00df\2.\3\2\2\2\49\3\2\2\2\6>\3\2\2\2\bB\3\2"+
		"\2\2\nD\3\2\2\2\fF\3\2\2\2\16H\3\2\2\2\20a\3\2\2\2\22u\3\2\2\2\24w\3\2"+
		"\2\2\26{\3\2\2\2\30\u0082\3\2\2\2\32\u0086\3\2\2\2\34\u008a\3\2\2\2\36"+
		"\u00a2\3\2\2\2 \u00a4\3\2\2\2\"\u00a7\3\2\2\2$\u00be\3\2\2\2&\u00c0\3"+
		"\2\2\2(\u00c6\3\2\2\2*\u00ce\3\2\2\2,\u00d3\3\2\2\2./\7\5\2\2/\60\5\4"+
		"\3\2\60\61\7\6\2\2\61\3\3\2\2\2\628\5\6\4\2\638\5\b\5\2\648\5\32\16\2"+
		"\658\5,\27\2\668\5\20\t\2\67\62\3\2\2\2\67\63\3\2\2\2\67\64\3\2\2\2\67"+
		"\65\3\2\2\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;"+
		"9\3\2\2\2<?\5$\23\2=?\5&\24\2><\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@C\5(\25\2"+
		"AC\5*\26\2B@\3\2\2\2BA\3\2\2\2C\t\3\2\2\2DE\t\2\2\2E\13\3\2\2\2FG\t\3"+
		"\2\2G\r\3\2\2\2HK\7\31\2\2IL\5 \21\2JL\5\"\22\2KI\3\2\2\2KJ\3\2\2\2LM"+
		"\3\2\2\2MK\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\7\31\2\2P\17\3\2\2\2QR\7\7\2"+
		"\2RS\7\27\2\2ST\5\22\n\2TU\7\30\2\2UV\7\b\2\2VW\5\30\r\2Wb\3\2\2\2XY\7"+
		"\7\2\2YZ\7\27\2\2Z[\5\22\n\2[\\\7\30\2\2\\]\7\b\2\2]^\5\30\r\2^_\7\t\2"+
		"\2_`\5\30\r\2`b\3\2\2\2aQ\3\2\2\2aX\3\2\2\2b\21\3\2\2\2cd\7\27\2\2de\5"+
		"\22\n\2ef\7\30\2\2fg\7\n\2\2gh\7\27\2\2hi\5\22\n\2ij\7\30\2\2jv\3\2\2"+
		"\2kl\7\27\2\2lm\5\22\n\2mn\7\30\2\2no\7\13\2\2op\7\27\2\2pq\5\22\n\2q"+
		"r\7\30\2\2rv\3\2\2\2sv\5\26\f\2tv\5 \21\2uc\3\2\2\2uk\3\2\2\2us\3\2\2"+
		"\2ut\3\2\2\2v\23\3\2\2\2wx\t\4\2\2x\25\3\2\2\2y|\5 \21\2z|\5\34\17\2{"+
		"y\3\2\2\2{z\3\2\2\2|}\3\2\2\2}\u0080\5\24\13\2~\u0081\5 \21\2\177\u0081"+
		"\5\"\22\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\27\3\2\2\2\u0082\u0083"+
		"\7\3\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\4\2\2\u0085\31\3\2\2\2\u0086"+
		"\u0087\5 \21\2\u0087\u0088\7\26\2\2\u0088\u0089\5\34\17\2\u0089\33\3\2"+
		"\2\2\u008a\u008b\b\17\1\2\u008b\u008c\5\36\20\2\u008c\u009b\3\2\2\2\u008d"+
		"\u008e\f\7\2\2\u008e\u008f\7\17\2\2\u008f\u009a\5\34\17\b\u0090\u0091"+
		"\f\6\2\2\u0091\u0092\7\16\2\2\u0092\u009a\5\34\17\7\u0093\u0094\f\5\2"+
		"\2\u0094\u0095\7\21\2\2\u0095\u009a\5\34\17\6\u0096\u0097\f\4\2\2\u0097"+
		"\u0098\7\20\2\2\u0098\u009a\5\34\17\5\u0099\u008d\3\2\2\2\u0099\u0090"+
		"\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u0096\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\35\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a3\5 \21\2\u009f\u00a3\5\"\22\2\u00a0\u00a3\5\f\7\2\u00a1"+
		"\u00a3\5\16\b\2\u00a2\u009e\3\2\2\2\u00a2\u009f\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\37\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5!"+
		"\3\2\2\2\u00a6\u00a8\7\21\2\2\u00a7\u00a6\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00aa\3\2\2\2\u00a9\u00ab\7$\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b4\3\2\2\2\u00ae"+
		"\u00b0\7\32\2\2\u00af\u00b1\7$\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00ae\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\5\n\6\2"+
		"\u00b7\u00b8\5 \21\2\u00b8\u00bf\3\2\2\2\u00b9\u00ba\5\n\6\2\u00ba\u00bb"+
		"\5 \21\2\u00bb\u00bc\7\26\2\2\u00bc\u00bd\5\34\17\2\u00bd\u00bf\3\2\2"+
		"\2\u00be\u00b6\3\2\2\2\u00be\u00b9\3\2\2\2\u00bf%\3\2\2\2\u00c0\u00c1"+
		"\7\37\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\7\26\2\2"+
		"\u00c4\u00c5\5\36\20\2\u00c5\'\3\2\2\2\u00c6\u00c7\7 \2\2\u00c7\u00ca"+
		"\7\27\2\2\u00c8\u00cb\5\36\20\2\u00c9\u00cb\5\34\17\2\u00ca\u00c8\3\2"+
		"\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\30\2\2\u00cd"+
		")\3\2\2\2\u00ce\u00cf\7!\2\2\u00cf\u00d0\7\27\2\2\u00d0\u00d1\5 \21\2"+
		"\u00d1\u00d2\7\30\2\2\u00d2+\3\2\2\2\u00d3\u00d4\7\"\2\2\u00d4\u00d5\7"+
		"\27\2\2\u00d5\u00d6\5\22\n\2\u00d6\u00d7\7\30\2\2\u00d7\u00d8\5\30\r\2"+
		"\u00d8-\3\2\2\2\25\679>BKMau{\u0080\u0099\u009b\u00a2\u00a7\u00ac\u00b2"+
		"\u00b4\u00be\u00ca";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}