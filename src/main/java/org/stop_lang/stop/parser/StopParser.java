// Generated from ../stop/Stop.g4 by ANTLR 4.7.2
package org.stop_lang.stop.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StopParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, START=31, 
		STOP=32, QUEUE=33, TRANSITION_OP=34, RETURN_OP=35, ENQUEUE_OP=36, OPTIONAL=37, 
		DOT=38, NUMBER=39, MODEL_TYPE=40, ID=41, STRING=42, COMMENT=43, LINE_COMMENT=44, 
		WS=45;
	public static final int
		RULE_file = 0, RULE_packageName = 1, RULE_packageDeclaration = 2, RULE_include = 3, 
		RULE_model_annotation = 4, RULE_model = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_return_block = 8, RULE_return_block_statement = 9, RULE_scalar_type = 10, 
		RULE_model_type = 11, RULE_enum_type = 12, RULE_enum_value = 13, RULE_enumeration = 14, 
		RULE_field = 15, RULE_dynamic_source = 16, RULE_dynamic_source_mapping = 17, 
		RULE_dynamic_source_mapping_parameter = 18, RULE_reference = 19, RULE_dynamic_source_mapping_parameter_rename = 20, 
		RULE_type = 21, RULE_collection = 22, RULE_return_type = 23, RULE_throw_type = 24, 
		RULE_throw_parameter = 25, RULE_transition = 26, RULE_enqueue = 27, RULE_annotation = 28, 
		RULE_annotation_type = 29, RULE_annotation_parameters = 30, RULE_annotation_parameter = 31, 
		RULE_annotation_parameter_value = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "packageName", "packageDeclaration", "include", "model_annotation", 
			"model", "block", "statement", "return_block", "return_block_statement", 
			"scalar_type", "model_type", "enum_type", "enum_value", "enumeration", 
			"field", "dynamic_source", "dynamic_source_mapping", "dynamic_source_mapping_parameter", 
			"reference", "dynamic_source_mapping_parameter_rename", "type", "collection", 
			"return_type", "throw_type", "throw_parameter", "transition", "enqueue", 
			"annotation", "annotation_type", "annotation_parameters", "annotation_parameter", 
			"annotation_parameter_value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'package'", "'include'", "'@'", "'{'", "';'", "'}'", "'double'", 
			"'float'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", 
			"'sint64'", "'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'bool'", 
			"'string'", "'bytes'", "'timestamp'", "'enum'", "'('", "','", "')'", 
			"':'", "'['", "']'", "'throws'", "'start'", "'stop'", "'queue'", "'->'", 
			"'<-'", "'>>'", "'optional'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "START", "STOP", "QUEUE", "TRANSITION_OP", 
			"RETURN_OP", "ENQUEUE_OP", "OPTIONAL", "DOT", "NUMBER", "MODEL_TYPE", 
			"ID", "STRING", "COMMENT", "LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "Stop.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StopParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class FileContext extends ParserRuleContext {
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<IncludeContext> include() {
			return getRuleContexts(IncludeContext.class);
		}
		public IncludeContext include(int i) {
			return getRuleContext(IncludeContext.class,i);
		}
		public List<ModelContext> model() {
			return getRuleContexts(ModelContext.class);
		}
		public ModelContext model(int i) {
			return getRuleContext(ModelContext.class,i);
		}
		public List<EnumerationContext> enumeration() {
			return getRuleContexts(EnumerationContext.class);
		}
		public EnumerationContext enumeration(int i) {
			return getRuleContext(EnumerationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(66);
				packageDeclaration();
				}
			}

			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(69);
					include();
					}
					break;
				case T__2:
				case START:
				case STOP:
				case QUEUE:
				case MODEL_TYPE:
					{
					setState(70);
					model();
					}
					break;
				case T__22:
					{
					setState(71);
					enumeration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__22) | (1L << START) | (1L << STOP) | (1L << QUEUE) | (1L << MODEL_TYPE))) != 0) );
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

	public static class PackageNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StopParser.ID, 0); }
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(StopParser.DOT, 0); }
		public PackageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterPackageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitPackageName(this);
		}
	}

	public final PackageNameContext packageName() throws RecognitionException {
		return packageName(0);
	}

	private PackageNameContext packageName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PackageNameContext _localctx = new PackageNameContext(_ctx, _parentState);
		PackageNameContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_packageName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PackageNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_packageName);
					setState(79);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(80);
					match(DOT);
					setState(81);
					match(ID);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class PackageDeclarationContext extends ParserRuleContext {
		public PackageNameContext packageName() {
			return getRuleContext(PackageNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__0);
			setState(88);
			packageName(0);
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

	public static class IncludeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StopParser.STRING, 0); }
		public IncludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterInclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitInclude(this);
		}
	}

	public final IncludeContext include() throws RecognitionException {
		IncludeContext _localctx = new IncludeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_include);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__1);
			setState(91);
			match(STRING);
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

	public static class Model_annotationContext extends ParserRuleContext {
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Model_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterModel_annotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitModel_annotation(this);
		}
	}

	public final Model_annotationContext model_annotation() throws RecognitionException {
		Model_annotationContext _localctx = new Model_annotationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_model_annotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(T__2);
			setState(94);
			model_type();
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

	public static class ModelContext extends ParserRuleContext {
		public TerminalNode MODEL_TYPE() { return getToken(StopParser.MODEL_TYPE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode START() { return getToken(StopParser.START, 0); }
		public Throw_typeContext throw_type() {
			return getRuleContext(Throw_typeContext.class,0);
		}
		public TerminalNode STOP() { return getToken(StopParser.STOP, 0); }
		public TerminalNode QUEUE() { return getToken(StopParser.QUEUE, 0); }
		public TerminalNode RETURN_OP() { return getToken(StopParser.RETURN_OP, 0); }
		public Return_typeContext return_type() {
			return getRuleContext(Return_typeContext.class,0);
		}
		public Return_blockContext return_block() {
			return getRuleContext(Return_blockContext.class,0);
		}
		public ModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitModel(this);
		}
	}

	public final ModelContext model() throws RecognitionException {
		ModelContext _localctx = new ModelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_model);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(96);
					annotation();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==START) {
					{
					setState(102);
					match(START);
					}
				}

				setState(105);
				match(MODEL_TYPE);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(106);
					throw_type();
					}
				}

				setState(109);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(110);
					annotation();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STOP) {
					{
					setState(116);
					match(STOP);
					}
				}

				setState(119);
				match(MODEL_TYPE);
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(120);
					throw_type();
					}
				}

				setState(123);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(124);
					annotation();
					}
					}
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUEUE) {
					{
					setState(130);
					match(QUEUE);
					}
				}

				setState(133);
				match(MODEL_TYPE);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(134);
					throw_type();
					}
				}

				setState(137);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(138);
					annotation();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(MODEL_TYPE);
				setState(145);
				match(RETURN_OP);
				setState(146);
				return_type();
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__29) {
					{
					setState(147);
					throw_type();
					}
				}

				setState(150);
				return_block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__3);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__27) | (1L << TRANSITION_OP) | (1L << ENQUEUE_OP) | (1L << OPTIONAL) | (1L << MODEL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(155);
				statement();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(156);
					match(T__4);
					}
				}

				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__5);
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

	public static class StatementContext extends ParserRuleContext {
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TransitionContext transition() {
			return getRuleContext(TransitionContext.class,0);
		}
		public EnqueueContext enqueue() {
			return getRuleContext(EnqueueContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				enumeration();
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case OPTIONAL:
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				field();
				}
				break;
			case TRANSITION_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				transition();
				}
				break;
			case ENQUEUE_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				enqueue();
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

	public static class Return_blockContext extends ParserRuleContext {
		public List<Return_block_statementContext> return_block_statement() {
			return getRuleContexts(Return_block_statementContext.class);
		}
		public Return_block_statementContext return_block_statement(int i) {
			return getRuleContext(Return_block_statementContext.class,i);
		}
		public Return_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterReturn_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitReturn_block(this);
		}
	}

	public final Return_blockContext return_block() throws RecognitionException {
		Return_blockContext _localctx = new Return_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_return_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__3);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__27) | (1L << OPTIONAL) | (1L << MODEL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(173);
				return_block_statement();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(174);
					match(T__4);
					}
				}

				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(T__5);
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

	public static class Return_block_statementContext extends ParserRuleContext {
		public EnumerationContext enumeration() {
			return getRuleContext(EnumerationContext.class,0);
		}
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public Return_block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterReturn_block_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitReturn_block_statement(this);
		}
	}

	public final Return_block_statementContext return_block_statement() throws RecognitionException {
		Return_block_statementContext _localctx = new Return_block_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_return_block_statement);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(184);
				enumeration();
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__27:
			case OPTIONAL:
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				field();
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

	public static class Scalar_typeContext extends ParserRuleContext {
		public Scalar_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalar_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterScalar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitScalar_type(this);
		}
	}

	public final Scalar_typeContext scalar_type() throws RecognitionException {
		Scalar_typeContext _localctx = new Scalar_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_scalar_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class Model_typeContext extends ParserRuleContext {
		public TerminalNode MODEL_TYPE() { return getToken(StopParser.MODEL_TYPE, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(StopParser.DOT, 0); }
		public Model_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_model_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterModel_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitModel_type(this);
		}
	}

	public final Model_typeContext model_type() throws RecognitionException {
		Model_typeContext _localctx = new Model_typeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_model_type);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODEL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(MODEL_TYPE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				reference(0);
				setState(192);
				match(DOT);
				setState(193);
				match(MODEL_TYPE);
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

	public static class Enum_typeContext extends ParserRuleContext {
		public TerminalNode MODEL_TYPE() { return getToken(StopParser.MODEL_TYPE, 0); }
		public Enum_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterEnum_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitEnum_type(this);
		}
	}

	public final Enum_typeContext enum_type() throws RecognitionException {
		Enum_typeContext _localctx = new Enum_typeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enum_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(MODEL_TYPE);
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

	public static class Enum_valueContext extends ParserRuleContext {
		public TerminalNode MODEL_TYPE() { return getToken(StopParser.MODEL_TYPE, 0); }
		public Enum_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterEnum_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitEnum_value(this);
		}
	}

	public final Enum_valueContext enum_value() throws RecognitionException {
		Enum_valueContext _localctx = new Enum_valueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enum_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(MODEL_TYPE);
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

	public static class EnumerationContext extends ParserRuleContext {
		public Enum_typeContext enum_type() {
			return getRuleContext(Enum_typeContext.class,0);
		}
		public List<Enum_valueContext> enum_value() {
			return getRuleContexts(Enum_valueContext.class);
		}
		public Enum_valueContext enum_value(int i) {
			return getRuleContext(Enum_valueContext.class,i);
		}
		public EnumerationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterEnumeration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitEnumeration(this);
		}
	}

	public final EnumerationContext enumeration() throws RecognitionException {
		EnumerationContext _localctx = new EnumerationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__22);
			setState(202);
			enum_type();
			setState(203);
			match(T__3);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				enum_value();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODEL_TYPE );
			setState(209);
			match(T__5);
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

	public static class FieldContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(StopParser.ID, 0); }
		public TerminalNode OPTIONAL() { return getToken(StopParser.OPTIONAL, 0); }
		public Dynamic_sourceContext dynamic_source() {
			return getRuleContext(Dynamic_sourceContext.class,0);
		}
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_field);
		int _la;
		try {
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(211);
					match(OPTIONAL);
					}
				}

				setState(214);
				type();
				setState(215);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN_OP) {
					{
					setState(216);
					dynamic_source();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(219);
					match(OPTIONAL);
					}
				}

				setState(222);
				collection();
				setState(223);
				match(ID);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN_OP) {
					{
					setState(224);
					dynamic_source();
					}
				}

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

	public static class Dynamic_sourceContext extends ParserRuleContext {
		public TerminalNode RETURN_OP() { return getToken(StopParser.RETURN_OP, 0); }
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Dynamic_source_mappingContext dynamic_source_mapping() {
			return getRuleContext(Dynamic_source_mappingContext.class,0);
		}
		public Dynamic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_source; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterDynamic_source(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitDynamic_source(this);
		}
	}

	public final Dynamic_sourceContext dynamic_source() throws RecognitionException {
		Dynamic_sourceContext _localctx = new Dynamic_sourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dynamic_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(RETURN_OP);
			setState(230);
			model_type();
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(231);
				dynamic_source_mapping();
				}
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

	public static class Dynamic_source_mappingContext extends ParserRuleContext {
		public List<Dynamic_source_mapping_parameterContext> dynamic_source_mapping_parameter() {
			return getRuleContexts(Dynamic_source_mapping_parameterContext.class);
		}
		public Dynamic_source_mapping_parameterContext dynamic_source_mapping_parameter(int i) {
			return getRuleContext(Dynamic_source_mapping_parameterContext.class,i);
		}
		public Dynamic_source_mappingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_source_mapping; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterDynamic_source_mapping(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitDynamic_source_mapping(this);
		}
	}

	public final Dynamic_source_mappingContext dynamic_source_mapping() throws RecognitionException {
		Dynamic_source_mappingContext _localctx = new Dynamic_source_mappingContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dynamic_source_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__23);
			setState(235);
			dynamic_source_mapping_parameter();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(236);
				match(T__24);
				setState(237);
				dynamic_source_mapping_parameter();
				}
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(243);
			match(T__25);
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

	public static class Dynamic_source_mapping_parameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StopParser.ID, 0); }
		public Dynamic_source_mapping_parameter_renameContext dynamic_source_mapping_parameter_rename() {
			return getRuleContext(Dynamic_source_mapping_parameter_renameContext.class,0);
		}
		public Dynamic_source_mapping_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_source_mapping_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterDynamic_source_mapping_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitDynamic_source_mapping_parameter(this);
		}
	}

	public final Dynamic_source_mapping_parameterContext dynamic_source_mapping_parameter() throws RecognitionException {
		Dynamic_source_mapping_parameterContext _localctx = new Dynamic_source_mapping_parameterContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dynamic_source_mapping_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(T__26);
			setState(247);
			dynamic_source_mapping_parameter_rename();
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

	public static class ReferenceContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StopParser.ID, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode DOT() { return getToken(StopParser.DOT, 0); }
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitReference(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_reference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReferenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_reference);
					setState(252);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(253);
					match(DOT);
					setState(254);
					match(ID);
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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

	public static class Dynamic_source_mapping_parameter_renameContext extends ParserRuleContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Dynamic_source_mapping_parameter_renameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dynamic_source_mapping_parameter_rename; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterDynamic_source_mapping_parameter_rename(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitDynamic_source_mapping_parameter_rename(this);
		}
	}

	public final Dynamic_source_mapping_parameter_renameContext dynamic_source_mapping_parameter_rename() throws RecognitionException {
		Dynamic_source_mapping_parameter_renameContext _localctx = new Dynamic_source_mapping_parameter_renameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dynamic_source_mapping_parameter_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			reference(0);
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

	public static class TypeContext extends ParserRuleContext {
		public Scalar_typeContext scalar_type() {
			return getRuleContext(Scalar_typeContext.class,0);
		}
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Model_annotationContext model_annotation() {
			return getRuleContext(Model_annotationContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_type);
		try {
			setState(265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				scalar_type();
				}
				break;
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				model_type();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				model_annotation();
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

	public static class CollectionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public CollectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterCollection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitCollection(this);
		}
	}

	public final CollectionContext collection() throws RecognitionException {
		CollectionContext _localctx = new CollectionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_collection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__27);
			setState(268);
			type();
			setState(269);
			match(T__28);
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

	public static class Return_typeContext extends ParserRuleContext {
		public CollectionContext collection() {
			return getRuleContext(CollectionContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterReturn_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitReturn_type(this);
		}
	}

	public final Return_typeContext return_type() throws RecognitionException {
		Return_typeContext _localctx = new Return_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_return_type);
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				collection();
				}
				break;
			case T__2:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				type();
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

	public static class Throw_typeContext extends ParserRuleContext {
		public List<Throw_parameterContext> throw_parameter() {
			return getRuleContexts(Throw_parameterContext.class);
		}
		public Throw_parameterContext throw_parameter(int i) {
			return getRuleContext(Throw_parameterContext.class,i);
		}
		public Throw_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterThrow_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitThrow_type(this);
		}
	}

	public final Throw_typeContext throw_type() throws RecognitionException {
		Throw_typeContext _localctx = new Throw_typeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_throw_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(T__29);
			setState(276);
			throw_parameter();
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(277);
				match(T__24);
				setState(278);
				throw_parameter();
				}
				}
				setState(283);
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

	public static class Throw_parameterContext extends ParserRuleContext {
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Model_annotationContext model_annotation() {
			return getRuleContext(Model_annotationContext.class,0);
		}
		public Throw_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throw_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterThrow_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitThrow_parameter(this);
		}
	}

	public final Throw_parameterContext throw_parameter() throws RecognitionException {
		Throw_parameterContext _localctx = new Throw_parameterContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_throw_parameter);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				model_type();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				model_annotation();
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode TRANSITION_OP() { return getToken(StopParser.TRANSITION_OP, 0); }
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Model_annotationContext model_annotation() {
			return getRuleContext(Model_annotationContext.class,0);
		}
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterTransition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitTransition(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_transition);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(TRANSITION_OP);
				setState(289);
				model_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(TRANSITION_OP);
				setState(291);
				model_annotation();
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

	public static class EnqueueContext extends ParserRuleContext {
		public TerminalNode ENQUEUE_OP() { return getToken(StopParser.ENQUEUE_OP, 0); }
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public Model_annotationContext model_annotation() {
			return getRuleContext(Model_annotationContext.class,0);
		}
		public EnqueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enqueue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterEnqueue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitEnqueue(this);
		}
	}

	public final EnqueueContext enqueue() throws RecognitionException {
		EnqueueContext _localctx = new EnqueueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_enqueue);
		try {
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(ENQUEUE_OP);
				setState(295);
				model_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				match(ENQUEUE_OP);
				setState(297);
				model_annotation();
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

	public static class AnnotationContext extends ParserRuleContext {
		public Annotation_typeContext annotation_type() {
			return getRuleContext(Annotation_typeContext.class,0);
		}
		public Annotation_parametersContext annotation_parameters() {
			return getRuleContext(Annotation_parametersContext.class,0);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitAnnotation(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(T__2);
			setState(301);
			annotation_type();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(302);
				annotation_parameters();
				}
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

	public static class Annotation_typeContext extends ParserRuleContext {
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public Annotation_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterAnnotation_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitAnnotation_type(this);
		}
	}

	public final Annotation_typeContext annotation_type() throws RecognitionException {
		Annotation_typeContext _localctx = new Annotation_typeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_annotation_type);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				model_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
				reference(0);
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

	public static class Annotation_parametersContext extends ParserRuleContext {
		public List<Annotation_parameterContext> annotation_parameter() {
			return getRuleContexts(Annotation_parameterContext.class);
		}
		public Annotation_parameterContext annotation_parameter(int i) {
			return getRuleContext(Annotation_parameterContext.class,i);
		}
		public Annotation_parametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterAnnotation_parameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitAnnotation_parameters(this);
		}
	}

	public final Annotation_parametersContext annotation_parameters() throws RecognitionException {
		Annotation_parametersContext _localctx = new Annotation_parametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_annotation_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__23);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(310);
				annotation_parameter();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__24) {
					{
					{
					setState(311);
					match(T__24);
					setState(312);
					annotation_parameter();
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(323);
			match(T__25);
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

	public static class Annotation_parameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(StopParser.ID, 0); }
		public Annotation_parameter_valueContext annotation_parameter_value() {
			return getRuleContext(Annotation_parameter_valueContext.class,0);
		}
		public Annotation_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterAnnotation_parameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitAnnotation_parameter(this);
		}
	}

	public final Annotation_parameterContext annotation_parameter() throws RecognitionException {
		Annotation_parameterContext _localctx = new Annotation_parameterContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_annotation_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(ID);
			setState(326);
			match(T__26);
			setState(327);
			annotation_parameter_value();
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

	public static class Annotation_parameter_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(StopParser.STRING, 0); }
		public Annotation_parameter_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_parameter_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).enterAnnotation_parameter_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StopListener ) ((StopListener)listener).exitAnnotation_parameter_value(this);
		}
	}

	public final Annotation_parameter_valueContext annotation_parameter_value() throws RecognitionException {
		Annotation_parameter_valueContext _localctx = new Annotation_parameter_valueContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_annotation_parameter_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(STRING);
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
		case 1:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 19:
			return reference_sempred((ReferenceContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean packageName_sempred(PackageNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean reference_sempred(ReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u014e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\5\2F\n\2\3\2\3\2\3\2\6\2K\n\2\r\2\16\2L\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\7\3U\n\3\f\3\16\3X\13\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\7\7\7d\n\7\f\7\16\7g\13\7\3\7\5\7j\n\7\3\7\3\7\5\7n\n\7\3\7\3\7\7\7"+
		"r\n\7\f\7\16\7u\13\7\3\7\5\7x\n\7\3\7\3\7\5\7|\n\7\3\7\3\7\7\7\u0080\n"+
		"\7\f\7\16\7\u0083\13\7\3\7\5\7\u0086\n\7\3\7\3\7\5\7\u008a\n\7\3\7\3\7"+
		"\7\7\u008e\n\7\f\7\16\7\u0091\13\7\3\7\3\7\3\7\3\7\5\7\u0097\n\7\3\7\3"+
		"\7\5\7\u009b\n\7\3\b\3\b\3\b\5\b\u00a0\n\b\7\b\u00a2\n\b\f\b\16\b\u00a5"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\5\n\u00b2\n\n"+
		"\7\n\u00b4\n\n\f\n\16\n\u00b7\13\n\3\n\3\n\3\13\3\13\5\13\u00bd\n\13\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u00c6\n\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\6\20\u00d0\n\20\r\20\16\20\u00d1\3\20\3\20\3\21\5\21\u00d7"+
		"\n\21\3\21\3\21\3\21\5\21\u00dc\n\21\3\21\5\21\u00df\n\21\3\21\3\21\3"+
		"\21\5\21\u00e4\n\21\5\21\u00e6\n\21\3\22\3\22\3\22\5\22\u00eb\n\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00f1\n\23\f\23\16\23\u00f4\13\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0102\n\25\f\25\16"+
		"\25\u0105\13\25\3\26\3\26\3\27\3\27\3\27\5\27\u010c\n\27\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\5\31\u0114\n\31\3\32\3\32\3\32\3\32\7\32\u011a\n\32\f"+
		"\32\16\32\u011d\13\32\3\33\3\33\5\33\u0121\n\33\3\34\3\34\3\34\3\34\5"+
		"\34\u0127\n\34\3\35\3\35\3\35\3\35\5\35\u012d\n\35\3\36\3\36\3\36\5\36"+
		"\u0132\n\36\3\37\3\37\5\37\u0136\n\37\3 \3 \3 \3 \7 \u013c\n \f \16 \u013f"+
		"\13 \7 \u0141\n \f \16 \u0144\13 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\2\4\4"+
		"(#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2"+
		"\3\3\2\t\30\2\u015c\2E\3\2\2\2\4N\3\2\2\2\6Y\3\2\2\2\b\\\3\2\2\2\n_\3"+
		"\2\2\2\f\u009a\3\2\2\2\16\u009c\3\2\2\2\20\u00ac\3\2\2\2\22\u00ae\3\2"+
		"\2\2\24\u00bc\3\2\2\2\26\u00be\3\2\2\2\30\u00c5\3\2\2\2\32\u00c7\3\2\2"+
		"\2\34\u00c9\3\2\2\2\36\u00cb\3\2\2\2 \u00e5\3\2\2\2\"\u00e7\3\2\2\2$\u00ec"+
		"\3\2\2\2&\u00f7\3\2\2\2(\u00fb\3\2\2\2*\u0106\3\2\2\2,\u010b\3\2\2\2."+
		"\u010d\3\2\2\2\60\u0113\3\2\2\2\62\u0115\3\2\2\2\64\u0120\3\2\2\2\66\u0126"+
		"\3\2\2\28\u012c\3\2\2\2:\u012e\3\2\2\2<\u0135\3\2\2\2>\u0137\3\2\2\2@"+
		"\u0147\3\2\2\2B\u014b\3\2\2\2DF\5\6\4\2ED\3\2\2\2EF\3\2\2\2FJ\3\2\2\2"+
		"GK\5\b\5\2HK\5\f\7\2IK\5\36\20\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2KL\3\2\2"+
		"\2LJ\3\2\2\2LM\3\2\2\2M\3\3\2\2\2NO\b\3\1\2OP\7+\2\2PV\3\2\2\2QR\f\3\2"+
		"\2RS\7(\2\2SU\7+\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\5\3\2\2"+
		"\2XV\3\2\2\2YZ\7\3\2\2Z[\5\4\3\2[\7\3\2\2\2\\]\7\4\2\2]^\7,\2\2^\t\3\2"+
		"\2\2_`\7\5\2\2`a\5\30\r\2a\13\3\2\2\2bd\5:\36\2cb\3\2\2\2dg\3\2\2\2ec"+
		"\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7!\2\2ih\3\2\2\2ij\3\2\2\2jk"+
		"\3\2\2\2km\7*\2\2ln\5\62\32\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2o\u009b\5\16"+
		"\b\2pr\5:\36\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2"+
		"\2\2vx\7\"\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\7*\2\2z|\5\62\32\2{z\3"+
		"\2\2\2{|\3\2\2\2|}\3\2\2\2}\u009b\5\16\b\2~\u0080\5:\36\2\177~\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0086\7#\2\2\u0085\u0084\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\7*\2\2\u0088\u008a\5\62"+
		"\32\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u009b\5\16\b\2\u008c\u008e\5:\36\2\u008d\u008c\3\2\2\2\u008e\u0091\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\7*\2\2\u0093\u0094\7%\2\2\u0094\u0096\5\60"+
		"\31\2\u0095\u0097\5\62\32\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\5\22\n\2\u0099\u009b\3\2\2\2\u009ae\3\2\2\2"+
		"\u009as\3\2\2\2\u009a\u0081\3\2\2\2\u009a\u008f\3\2\2\2\u009b\r\3\2\2"+
		"\2\u009c\u00a3\7\6\2\2\u009d\u009f\5\20\t\2\u009e\u00a0\7\7\2\2\u009f"+
		"\u009e\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2"+
		"\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\b\2\2\u00a7\17\3\2\2"+
		"\2\u00a8\u00ad\5\36\20\2\u00a9\u00ad\5 \21\2\u00aa\u00ad\5\66\34\2\u00ab"+
		"\u00ad\58\35\2\u00ac\u00a8\3\2\2\2\u00ac\u00a9\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ab\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00b5\7\6\2\2\u00af\u00b1"+
		"\5\24\13\2\u00b0\u00b2\7\7\2\2\u00b1\u00b0\3\2\2\2\u00b1\u00b2\3\2\2\2"+
		"\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3"+
		"\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00b9\7\b\2\2\u00b9\23\3\2\2\2\u00ba\u00bd\5\36\20\2\u00bb\u00bd\5 \21"+
		"\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\25\3\2\2\2\u00be\u00bf"+
		"\t\2\2\2\u00bf\27\3\2\2\2\u00c0\u00c6\7*\2\2\u00c1\u00c2\5(\25\2\u00c2"+
		"\u00c3\7(\2\2\u00c3\u00c4\7*\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c0\3\2\2"+
		"\2\u00c5\u00c1\3\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\33\3"+
		"\2\2\2\u00c9\u00ca\7*\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7\31\2\2\u00cc"+
		"\u00cd\5\32\16\2\u00cd\u00cf\7\6\2\2\u00ce\u00d0\5\34\17\2\u00cf\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d4\7\b\2\2\u00d4\37\3\2\2\2\u00d5\u00d7\7\'\2"+
		"\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9"+
		"\5,\27\2\u00d9\u00db\7+\2\2\u00da\u00dc\5\"\22\2\u00db\u00da\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00e6\3\2\2\2\u00dd\u00df\7\'\2\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\5.\30\2\u00e1"+
		"\u00e3\7+\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2"+
		"\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6"+
		"!\3\2\2\2\u00e7\u00e8\7%\2\2\u00e8\u00ea\5\30\r\2\u00e9\u00eb\5$\23\2"+
		"\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7"+
		"\32\2\2\u00ed\u00f2\5&\24\2\u00ee\u00ef\7\33\2\2\u00ef\u00f1\5&\24\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2"+
		"\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7\34\2\2\u00f6"+
		"%\3\2\2\2\u00f7\u00f8\7+\2\2\u00f8\u00f9\7\35\2\2\u00f9\u00fa\5*\26\2"+
		"\u00fa\'\3\2\2\2\u00fb\u00fc\b\25\1\2\u00fc\u00fd\7+\2\2\u00fd\u0103\3"+
		"\2\2\2\u00fe\u00ff\f\3\2\2\u00ff\u0100\7(\2\2\u0100\u0102\7+\2\2\u0101"+
		"\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2"+
		"\2\2\u0104)\3\2\2\2\u0105\u0103\3\2\2\2\u0106\u0107\5(\25\2\u0107+\3\2"+
		"\2\2\u0108\u010c\5\26\f\2\u0109\u010c\5\30\r\2\u010a\u010c\5\n\6\2\u010b"+
		"\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c-\3\2\2\2"+
		"\u010d\u010e\7\36\2\2\u010e\u010f\5,\27\2\u010f\u0110\7\37\2\2\u0110/"+
		"\3\2\2\2\u0111\u0114\5.\30\2\u0112\u0114\5,\27\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0112\3\2\2\2\u0114\61\3\2\2\2\u0115\u0116\7 \2\2\u0116\u011b\5\64\33"+
		"\2\u0117\u0118\7\33\2\2\u0118\u011a\5\64\33\2\u0119\u0117\3\2\2\2\u011a"+
		"\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\63\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011e\u0121\5\30\r\2\u011f\u0121\5\n\6\2\u0120"+
		"\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\65\3\2\2\2\u0122\u0123\7$\2\2"+
		"\u0123\u0127\5\30\r\2\u0124\u0125\7$\2\2\u0125\u0127\5\n\6\2\u0126\u0122"+
		"\3\2\2\2\u0126\u0124\3\2\2\2\u0127\67\3\2\2\2\u0128\u0129\7&\2\2\u0129"+
		"\u012d\5\30\r\2\u012a\u012b\7&\2\2\u012b\u012d\5\n\6\2\u012c\u0128\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d9\3\2\2\2\u012e\u012f\7\5\2\2\u012f\u0131"+
		"\5<\37\2\u0130\u0132\5> \2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		";\3\2\2\2\u0133\u0136\5\30\r\2\u0134\u0136\5(\25\2\u0135\u0133\3\2\2\2"+
		"\u0135\u0134\3\2\2\2\u0136=\3\2\2\2\u0137\u0142\7\32\2\2\u0138\u013d\5"+
		"@!\2\u0139\u013a\7\33\2\2\u013a\u013c\5@!\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2"+
		"\2\2\u013f\u013d\3\2\2\2\u0140\u0138\3\2\2\2\u0141\u0144\3\2\2\2\u0142"+
		"\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2"+
		"\2\2\u0145\u0146\7\34\2\2\u0146?\3\2\2\2\u0147\u0148\7+\2\2\u0148\u0149"+
		"\7\35\2\2\u0149\u014a\5B\"\2\u014aA\3\2\2\2\u014b\u014c\7,\2\2\u014cC"+
		"\3\2\2\2,EJLVeimsw{\u0081\u0085\u0089\u008f\u0096\u009a\u009f\u00a3\u00ac"+
		"\u00b1\u00b5\u00bc\u00c5\u00d1\u00d6\u00db\u00de\u00e3\u00e5\u00ea\u00f2"+
		"\u0103\u010b\u0113\u011b\u0120\u0126\u012c\u0131\u0135\u013d\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}