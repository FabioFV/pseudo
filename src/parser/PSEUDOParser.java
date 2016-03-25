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
		ENT=20, DEC=21, STR=22, CONST=23, IMPRIME=24, LEE=25, NAMEDEF=26, NUMDEF=27, 
		WS=28, COMMENT=29;
	public static final int
		RULE_programa = 0, RULE_cuerpo = 1, RULE_declaracion = 2, RULE_funcion = 3, 
		RULE_var = 4, RULE_condicional = 5, RULE_condicion = 6, RULE_comp_operator = 7, 
		RULE_evaluacion = 8, RULE_conclusion = 9, RULE_asignacion = 10, RULE_operacion = 11, 
		RULE_exp = 12, RULE_nombre = 13, RULE_valor = 14, RULE_variable = 15, 
		RULE_constante = 16, RULE_imprime = 17, RULE_lee = 18;
	public static final String[] ruleNames = {
		"programa", "cuerpo", "declaracion", "funcion", "var", "condicional", 
		"condicion", "comp_operator", "evaluacion", "conclusion", "asignacion", 
		"operacion", "exp", "nombre", "valor", "variable", "constante", "imprime", 
		"lee"
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
			setState(38);
			match(INICIO);
			setState(39);
			cuerpo();
			setState(40);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ENT) | (1L << DEC) | (1L << STR) | (1L << CONST) | (1L << IMPRIME) | (1L << LEE) | (1L << NAMEDEF))) != 0)) {
				{
				setState(46);
				switch (_input.LA(1)) {
				case ENT:
				case DEC:
				case STR:
				case CONST:
					{
					setState(42);
					declaracion();
					}
					break;
				case IMPRIME:
				case LEE:
					{
					setState(43);
					funcion();
					}
					break;
				case NAMEDEF:
					{
					setState(44);
					asignacion();
					}
					break;
				case IF:
					{
					setState(45);
					condicional();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(50);
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
			setState(53);
			switch (_input.LA(1)) {
			case ENT:
			case DEC:
			case STR:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				variable();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
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
			setState(57);
			switch (_input.LA(1)) {
			case IMPRIME:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				imprime();
				}
				break;
			case LEE:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ENT() { return getToken(PSEUDOParser.ENT, 0); }
		public TerminalNode DEC() { return getToken(PSEUDOParser.DEC, 0); }
		public TerminalNode STR() { return getToken(PSEUDOParser.STR, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PSEUDOListener ) ((PSEUDOListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PSEUDOVisitor ) return ((PSEUDOVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENT) | (1L << DEC) | (1L << STR))) != 0)) ) {
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
		enterRule(_localctx, 10, RULE_condicional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(IF);
			setState(62);
			match(LPAREN);
			setState(63);
			condicion();
			setState(64);
			match(RPAREN);
			setState(65);
			match(THEN);
			setState(66);
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
		enterRule(_localctx, 12, RULE_condicion);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(LPAREN);
				setState(69);
				condicion();
				setState(70);
				match(RPAREN);
				setState(71);
				match(AND);
				setState(72);
				match(LPAREN);
				setState(73);
				condicion();
				setState(74);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(LPAREN);
				setState(77);
				condicion();
				setState(78);
				match(RPAREN);
				setState(79);
				match(OR);
				setState(80);
				match(LPAREN);
				setState(81);
				condicion();
				setState(82);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
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
		enterRule(_localctx, 14, RULE_comp_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
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
		enterRule(_localctx, 16, RULE_evaluacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(89);
				nombre();
				}
				break;
			case 2:
				{
				setState(90);
				operacion();
				}
				break;
			}
			setState(93);
			comp_operator();
			setState(96);
			switch (_input.LA(1)) {
			case NAMEDEF:
				{
				setState(94);
				nombre();
				}
				break;
			case NUMDEF:
				{
				setState(95);
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
		enterRule(_localctx, 18, RULE_conclusion);
		try {
			setState(100);
			switch (_input.LA(1)) {
			case NAMEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				asignacion();
				}
				break;
			case IMPRIME:
			case LEE:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				nombre();
				setState(103);
				match(EQ);
				setState(104);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				nombre();
				setState(107);
				match(EQ);
				setState(108);
				operacion();
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

	public static class OperacionContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIV() { return getToken(PSEUDOParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(PSEUDOParser.MULT, 0); }
		public TerminalNode PLUS() { return getToken(PSEUDOParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PSEUDOParser.MINUS, 0); }
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
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operacion);
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				exp();
				setState(113);
				match(DIV);
				setState(114);
				exp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				exp();
				setState(117);
				match(MULT);
				setState(118);
				exp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(120);
				exp();
				setState(121);
				match(PLUS);
				setState(122);
				exp();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				exp();
				setState(125);
				match(MINUS);
				setState(126);
				exp();
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

	public static class ExpContext extends ParserRuleContext {
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 24, RULE_exp);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case NAMEDEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				nombre();
				}
				break;
			case NUMDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				valor();
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
		enterRule(_localctx, 26, RULE_nombre);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		enterRule(_localctx, 28, RULE_valor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			setState(146);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				var();
				setState(139);
				nombre();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				var();
				setState(142);
				nombre();
				setState(143);
				match(EQ);
				setState(144);
				valor();
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
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode EQ() { return getToken(PSEUDOParser.EQ, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
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
		enterRule(_localctx, 32, RULE_constante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(CONST);
			setState(149);
			nombre();
			setState(150);
			match(EQ);
			setState(151);
			valor();
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
		public NombreContext nombre() {
			return getRuleContext(NombreContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PSEUDOParser.RPAREN, 0); }
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
		enterRule(_localctx, 34, RULE_imprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IMPRIME);
			setState(154);
			match(LPAREN);
			setState(155);
			nombre();
			setState(156);
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
		enterRule(_localctx, 36, RULE_lee);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(LEE);
			setState(159);
			match(LPAREN);
			setState(160);
			nombre();
			setState(161);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37\u00a6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\3\4\3\4\5\48\n\4\3\5\3\5\5\5<\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\bX\n\b\3\t\3\t\3\n\3\n\5\n^\n\n\3\n\3\n\3\n\5\nc\n\n\3\13\3"+
		"\13\5\13g\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0083\n\r\3\16"+
		"\3\16\5\16\u0087\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0095\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&\2\4\3\2\26\30\3\2\17\23\u00a3\2(\3\2\2\2\4\62\3\2\2"+
		"\2\6\67\3\2\2\2\b;\3\2\2\2\n=\3\2\2\2\f?\3\2\2\2\16W\3\2\2\2\20Y\3\2\2"+
		"\2\22]\3\2\2\2\24f\3\2\2\2\26p\3\2\2\2\30\u0082\3\2\2\2\32\u0086\3\2\2"+
		"\2\34\u0088\3\2\2\2\36\u008a\3\2\2\2 \u0094\3\2\2\2\"\u0096\3\2\2\2$\u009b"+
		"\3\2\2\2&\u00a0\3\2\2\2()\7\3\2\2)*\5\4\3\2*+\7\4\2\2+\3\3\2\2\2,\61\5"+
		"\6\4\2-\61\5\b\5\2.\61\5\26\f\2/\61\5\f\7\2\60,\3\2\2\2\60-\3\2\2\2\60"+
		".\3\2\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\5\3"+
		"\2\2\2\64\62\3\2\2\2\658\5 \21\2\668\5\"\22\2\67\65\3\2\2\2\67\66\3\2"+
		"\2\28\7\3\2\2\29<\5$\23\2:<\5&\24\2;9\3\2\2\2;:\3\2\2\2<\t\3\2\2\2=>\t"+
		"\2\2\2>\13\3\2\2\2?@\7\5\2\2@A\7\24\2\2AB\5\16\b\2BC\7\25\2\2CD\7\6\2"+
		"\2DE\5\24\13\2E\r\3\2\2\2FG\7\24\2\2GH\5\16\b\2HI\7\25\2\2IJ\7\7\2\2J"+
		"K\7\24\2\2KL\5\16\b\2LM\7\25\2\2MX\3\2\2\2NO\7\24\2\2OP\5\16\b\2PQ\7\25"+
		"\2\2QR\7\b\2\2RS\7\24\2\2ST\5\16\b\2TU\7\25\2\2UX\3\2\2\2VX\5\22\n\2W"+
		"F\3\2\2\2WN\3\2\2\2WV\3\2\2\2X\17\3\2\2\2YZ\t\3\2\2Z\21\3\2\2\2[^\5\34"+
		"\17\2\\^\5\30\r\2][\3\2\2\2]\\\3\2\2\2^_\3\2\2\2_b\5\20\t\2`c\5\34\17"+
		"\2ac\5\36\20\2b`\3\2\2\2ba\3\2\2\2c\23\3\2\2\2dg\5\26\f\2eg\5\b\5\2fd"+
		"\3\2\2\2fe\3\2\2\2g\25\3\2\2\2hi\5\34\17\2ij\7\23\2\2jk\5\32\16\2kq\3"+
		"\2\2\2lm\5\34\17\2mn\7\23\2\2no\5\30\r\2oq\3\2\2\2ph\3\2\2\2pl\3\2\2\2"+
		"q\27\3\2\2\2rs\5\32\16\2st\7\f\2\2tu\5\32\16\2u\u0083\3\2\2\2vw\5\32\16"+
		"\2wx\7\13\2\2xy\5\32\16\2y\u0083\3\2\2\2z{\5\32\16\2{|\7\r\2\2|}\5\32"+
		"\16\2}\u0083\3\2\2\2~\177\5\32\16\2\177\u0080\7\16\2\2\u0080\u0081\5\32"+
		"\16\2\u0081\u0083\3\2\2\2\u0082r\3\2\2\2\u0082v\3\2\2\2\u0082z\3\2\2\2"+
		"\u0082~\3\2\2\2\u0083\31\3\2\2\2\u0084\u0087\5\34\17\2\u0085\u0087\5\36"+
		"\20\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\33\3\2\2\2\u0088\u0089"+
		"\7\34\2\2\u0089\35\3\2\2\2\u008a\u008b\7\35\2\2\u008b\37\3\2\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\u008e\5\34\17\2\u008e\u0095\3\2\2\2\u008f\u0090\5"+
		"\n\6\2\u0090\u0091\5\34\17\2\u0091\u0092\7\23\2\2\u0092\u0093\5\36\20"+
		"\2\u0093\u0095\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008f\3\2\2\2\u0095!"+
		"\3\2\2\2\u0096\u0097\7\31\2\2\u0097\u0098\5\34\17\2\u0098\u0099\7\23\2"+
		"\2\u0099\u009a\5\36\20\2\u009a#\3\2\2\2\u009b\u009c\7\32\2\2\u009c\u009d"+
		"\7\24\2\2\u009d\u009e\5\34\17\2\u009e\u009f\7\25\2\2\u009f%\3\2\2\2\u00a0"+
		"\u00a1\7\33\2\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\5\34\17\2\u00a3\u00a4"+
		"\7\25\2\2\u00a4\'\3\2\2\2\16\60\62\67;W]bfp\u0082\u0086\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}