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
		INICIO=1, FIN=2, IF=3, THEN=4, AND=5, OR=6, TRUE=7, FALSE=8, MULT=9, DIV=10, 
		PLUS=11, MINUS=12, GT=13, GE=14, LT=15, LE=16, EQ=17, LPAREN=18, RPAREN=19, 
		QT=20, ENT=21, DEC=22, STR=23, BOOL=24, CONST=25, IMPRIME=26, LEE=27, 
		NAMEDEF=28, NUMDEF=29, WS=30, COMMENT=31;
	public static final int
		RULE_programa = 0, RULE_cuerpo = 1, RULE_declaracion = 2, RULE_funcion = 3, 
		RULE_dataType = 4, RULE_bool_type = 5, RULE_stringLit = 6, RULE_condicional = 7, 
		RULE_condicion = 8, RULE_comp_operator = 9, RULE_evaluacion = 10, RULE_conclusion = 11, 
		RULE_asignacion = 12, RULE_operacion = 13, RULE_exp = 14, RULE_nombre = 15, 
		RULE_valor = 16, RULE_variable = 17, RULE_constante = 18, RULE_imprime = 19, 
		RULE_lee = 20;
	public static final String[] ruleNames = {
		"programa", "cuerpo", "declaracion", "funcion", "dataType", "bool_type", 
		"stringLit", "condicional", "condicion", "comp_operator", "evaluacion", 
		"conclusion", "asignacion", "operacion", "exp", "nombre", "valor", "variable", 
		"constante", "imprime", "lee"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAMA'", "'FIN'", "'SI'", "'ENTONCES'", "'Y'", "'O'", "'VERDADERO'", 
		"'FALSO'", "'*'", "'/'", "'+'", "'-'", "'>'", "'>='", "'<'", "'<='", "'='", 
		"'('", "')'", "'\"'", "'ENT'", "'DEC'", "'STR'", "'BOOL'", "'CONST'", 
		"'IMPRIME'", "'LEE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "FIN", "IF", "THEN", "AND", "OR", "TRUE", "FALSE", "MULT", 
		"DIV", "PLUS", "MINUS", "GT", "GE", "LT", "LE", "EQ", "LPAREN", "RPAREN", 
		"QT", "ENT", "DEC", "STR", "BOOL", "CONST", "IMPRIME", "LEE", "NAMEDEF", 
		"NUMDEF", "WS", "COMMENT"
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
			setState(42);
			match(INICIO);
			setState(43);
			cuerpo();
			setState(44);
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ENT) | (1L << DEC) | (1L << STR) | (1L << BOOL) | (1L << CONST) | (1L << IMPRIME) | (1L << LEE) | (1L << NAMEDEF))) != 0)) {
				{
				setState(50);
				switch (_input.LA(1)) {
				case ENT:
				case DEC:
				case STR:
				case BOOL:
				case CONST:
					{
					setState(46);
					declaracion();
					}
					break;
				case IMPRIME:
				case LEE:
					{
					setState(47);
					funcion();
					}
					break;
				case NAMEDEF:
					{
					setState(48);
					asignacion();
					}
					break;
				case IF:
					{
					setState(49);
					condicional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(54);
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
			setState(57);
			switch (_input.LA(1)) {
			case ENT:
			case DEC:
			case STR:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				variable();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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
			setState(61);
			switch (_input.LA(1)) {
			case IMPRIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				imprime();
				}
				break;
			case LEE:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
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
			setState(63);
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
			setState(65);
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
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(QT);
			setState(68);
			nombre();
			setState(69);
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
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(IF);
			setState(72);
			match(LPAREN);
			setState(73);
			condicion();
			setState(74);
			match(RPAREN);
			setState(75);
			match(THEN);
			setState(76);
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
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(LPAREN);
				setState(79);
				condicion();
				setState(80);
				match(RPAREN);
				setState(81);
				match(AND);
				setState(82);
				match(LPAREN);
				setState(83);
				condicion();
				setState(84);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(LPAREN);
				setState(87);
				condicion();
				setState(88);
				match(RPAREN);
				setState(89);
				match(OR);
				setState(90);
				match(LPAREN);
				setState(91);
				condicion();
				setState(92);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				evaluacion();
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
			setState(97);
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				nombre();
				}
				break;
			case 2:
				{
				setState(100);
				operacion(0);
				}
				break;
			}
			setState(103);
			comp_operator();
			setState(106);
			switch (_input.LA(1)) {
			case NAMEDEF:
				{
				setState(104);
				nombre();
				}
				break;
			case NUMDEF:
				{
				setState(105);
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
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
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
			setState(110);
			switch (_input.LA(1)) {
			case NAMEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				asignacion();
				}
				break;
			case IMPRIME:
			case LEE:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				funcion();
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
			setState(112);
			nombre();
			setState(113);
			match(EQ);
			setState(114);
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
			setState(117);
			exp();
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(119);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(120);
						match(DIV);
						setState(121);
						operacion(6);
						}
						break;
					case 2:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(122);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(123);
						match(MULT);
						setState(124);
						operacion(5);
						}
						break;
					case 3:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(125);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(126);
						match(MINUS);
						setState(127);
						operacion(4);
						}
						break;
					case 4:
						{
						_localctx = new OperacionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_operacion);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						match(PLUS);
						setState(130);
						operacion(3);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(140);
			switch (_input.LA(1)) {
			case NAMEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				nombre();
				}
				break;
			case NUMDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				valor();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				bool_type();
				}
				break;
			case QT:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
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
			setState(142);
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
		public TerminalNode NUMDEF() { return getToken(PSEUDOParser.NUMDEF, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(NUMDEF);
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
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				dataType();
				setState(147);
				((VariableContext)_localctx).varName = nombre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				dataType();
				setState(150);
				((VariableContext)_localctx).varName = nombre();
				setState(151);
				match(EQ);
				setState(152);
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
			setState(156);
			match(CONST);
			setState(157);
			dataType();
			setState(158);
			nombre();
			setState(159);
			match(EQ);
			setState(160);
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
			setState(162);
			match(IMPRIME);
			setState(163);
			match(LPAREN);
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(164);
				exp();
				}
				break;
			case 2:
				{
				setState(165);
				operacion(0);
				}
				break;
			}
			setState(168);
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
			setState(170);
			match(LEE);
			setState(171);
			match(LPAREN);
			setState(172);
			nombre();
			setState(173);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00b2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\7\3\65\n\3\f\3\16\38\13\3\3\4\3\4\5\4<\n\4\3\5\3\5\5\5@\n\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\3\13"+
		"\3\f\3\f\5\fh\n\f\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\5\rq\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\7\17\u0086\n\17\f\17\16\17\u0089\13\17\3\20\3\20\3\20\3\20"+
		"\5\20\u008f\n\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u009d\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\5\25\u00a9\n\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\2\3\34\27\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\5\3\2\27\32\3\2\t\n\3\2\17"+
		"\23\u00b0\2,\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\b?\3\2\2\2\nA\3\2\2\2\fC"+
		"\3\2\2\2\16E\3\2\2\2\20I\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26g\3\2\2\2\30"+
		"p\3\2\2\2\32r\3\2\2\2\34v\3\2\2\2\36\u008e\3\2\2\2 \u0090\3\2\2\2\"\u0092"+
		"\3\2\2\2$\u009c\3\2\2\2&\u009e\3\2\2\2(\u00a4\3\2\2\2*\u00ac\3\2\2\2,"+
		"-\7\3\2\2-.\5\4\3\2./\7\4\2\2/\3\3\2\2\2\60\65\5\6\4\2\61\65\5\b\5\2\62"+
		"\65\5\32\16\2\63\65\5\20\t\2\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2"+
		"\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\5\3\2\2\28\66"+
		"\3\2\2\29<\5$\23\2:<\5&\24\2;9\3\2\2\2;:\3\2\2\2<\7\3\2\2\2=@\5(\25\2"+
		">@\5*\26\2?=\3\2\2\2?>\3\2\2\2@\t\3\2\2\2AB\t\2\2\2B\13\3\2\2\2CD\t\3"+
		"\2\2D\r\3\2\2\2EF\7\26\2\2FG\5 \21\2GH\7\26\2\2H\17\3\2\2\2IJ\7\5\2\2"+
		"JK\7\24\2\2KL\5\22\n\2LM\7\25\2\2MN\7\6\2\2NO\5\30\r\2O\21\3\2\2\2PQ\7"+
		"\24\2\2QR\5\22\n\2RS\7\25\2\2ST\7\7\2\2TU\7\24\2\2UV\5\22\n\2VW\7\25\2"+
		"\2Wb\3\2\2\2XY\7\24\2\2YZ\5\22\n\2Z[\7\25\2\2[\\\7\b\2\2\\]\7\24\2\2]"+
		"^\5\22\n\2^_\7\25\2\2_b\3\2\2\2`b\5\26\f\2aP\3\2\2\2aX\3\2\2\2a`\3\2\2"+
		"\2b\23\3\2\2\2cd\t\4\2\2d\25\3\2\2\2eh\5 \21\2fh\5\34\17\2ge\3\2\2\2g"+
		"f\3\2\2\2hi\3\2\2\2il\5\24\13\2jm\5 \21\2km\5\"\22\2lj\3\2\2\2lk\3\2\2"+
		"\2m\27\3\2\2\2nq\5\32\16\2oq\5\b\5\2pn\3\2\2\2po\3\2\2\2q\31\3\2\2\2r"+
		"s\5 \21\2st\7\23\2\2tu\5\34\17\2u\33\3\2\2\2vw\b\17\1\2wx\5\36\20\2x\u0087"+
		"\3\2\2\2yz\f\7\2\2z{\7\f\2\2{\u0086\5\34\17\b|}\f\6\2\2}~\7\13\2\2~\u0086"+
		"\5\34\17\7\177\u0080\f\5\2\2\u0080\u0081\7\16\2\2\u0081\u0086\5\34\17"+
		"\6\u0082\u0083\f\4\2\2\u0083\u0084\7\r\2\2\u0084\u0086\5\34\17\5\u0085"+
		"y\3\2\2\2\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\35\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008f\5 \21\2\u008b\u008f\5\"\22\2\u008c\u008f\5"+
		"\f\7\2\u008d\u008f\5\16\b\2\u008e\u008a\3\2\2\2\u008e\u008b\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\37\3\2\2\2\u0090\u0091\7\36\2"+
		"\2\u0091!\3\2\2\2\u0092\u0093\7\37\2\2\u0093#\3\2\2\2\u0094\u0095\5\n"+
		"\6\2\u0095\u0096\5 \21\2\u0096\u009d\3\2\2\2\u0097\u0098\5\n\6\2\u0098"+
		"\u0099\5 \21\2\u0099\u009a\7\23\2\2\u009a\u009b\5\34\17\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0094\3\2\2\2\u009c\u0097\3\2\2\2\u009d%\3\2\2\2\u009e"+
		"\u009f\7\33\2\2\u009f\u00a0\5\n\6\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7"+
		"\23\2\2\u00a2\u00a3\5\36\20\2\u00a3\'\3\2\2\2\u00a4\u00a5\7\34\2\2\u00a5"+
		"\u00a8\7\24\2\2\u00a6\u00a9\5\36\20\2\u00a7\u00a9\5\34\17\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\25\2\2"+
		"\u00ab)\3\2\2\2\u00ac\u00ad\7\35\2\2\u00ad\u00ae\7\24\2\2\u00ae\u00af"+
		"\5 \21\2\u00af\u00b0\7\25\2\2\u00b0+\3\2\2\2\17\64\66;?aglp\u0085\u0087"+
		"\u008e\u009c\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}