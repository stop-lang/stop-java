// Generated from Stop.g4 by ANTLR 4.7.2
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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, START=30, STOP=31, QUEUE=32, 
		TRANSITION_OP=33, RETURN_OP=34, ENQUEUE_OP=35, OPTIONAL=36, DOT=37, NUMBER=38, 
		MODEL_TYPE=39, ID=40, FILENAME=41, COMMENT=42, LINE_COMMENT=43, WS=44;
	public static final int
		RULE_file = 0, RULE_packageName = 1, RULE_packageDeclaration = 2, RULE_include = 3, 
		RULE_model = 4, RULE_block = 5, RULE_statement = 6, RULE_return_block = 7, 
		RULE_return_block_statement = 8, RULE_scalar_type = 9, RULE_model_type = 10, 
		RULE_enum_type = 11, RULE_enum_value = 12, RULE_enumeration = 13, RULE_field = 14, 
		RULE_dynamic_source = 15, RULE_dynamic_source_mapping = 16, RULE_dynamic_source_mapping_parameter = 17, 
		RULE_reference = 18, RULE_dynamic_source_mapping_parameter_rename = 19, 
		RULE_type = 20, RULE_collection = 21, RULE_return_type = 22, RULE_throw_type = 23, 
		RULE_throw_parameter = 24, RULE_transition = 25, RULE_enqueue = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "packageName", "packageDeclaration", "include", "model", "block", 
			"statement", "return_block", "return_block_statement", "scalar_type", 
			"model_type", "enum_type", "enum_value", "enumeration", "field", "dynamic_source", 
			"dynamic_source_mapping", "dynamic_source_mapping_parameter", "reference", 
			"dynamic_source_mapping_parameter_rename", "type", "collection", "return_type", 
			"throw_type", "throw_parameter", "transition", "enqueue"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(54);
				packageDeclaration();
				}
			}

			setState(60); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(60);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
					{
					setState(57);
					include();
					}
					break;
				case START:
				case STOP:
				case QUEUE:
				case MODEL_TYPE:
					{
					setState(58);
					model();
					}
					break;
				case T__21:
					{
					setState(59);
					enumeration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(62); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__21) | (1L << START) | (1L << STOP) | (1L << QUEUE) | (1L << MODEL_TYPE))) != 0) );
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
			setState(65);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(72);
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
					setState(67);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(68);
					match(DOT);
					setState(69);
					match(ID);
					}
					} 
				}
				setState(74);
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
			setState(75);
			match(T__0);
			setState(76);
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
		public TerminalNode FILENAME() { return getToken(StopParser.FILENAME, 0); }
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
			setState(78);
			match(T__1);
			setState(79);
			match(FILENAME);
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
		enterRule(_localctx, 8, RULE_model);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==START) {
					{
					setState(81);
					match(START);
					}
				}

				setState(84);
				match(MODEL_TYPE);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(85);
					throw_type();
					}
				}

				setState(88);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STOP) {
					{
					setState(89);
					match(STOP);
					}
				}

				setState(92);
				match(MODEL_TYPE);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(93);
					throw_type();
					}
				}

				setState(96);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUEUE) {
					{
					setState(97);
					match(QUEUE);
					}
				}

				setState(100);
				match(MODEL_TYPE);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(101);
					throw_type();
					}
				}

				setState(104);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(MODEL_TYPE);
				setState(106);
				match(RETURN_OP);
				setState(107);
				return_type();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__28) {
					{
					setState(108);
					throw_type();
					}
				}

				setState(111);
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
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__2);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__26) | (1L << TRANSITION_OP) | (1L << ENQUEUE_OP) | (1L << OPTIONAL) | (1L << MODEL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(116);
				statement();
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(117);
					match(T__3);
					}
				}

				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(T__4);
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
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				enumeration();
				}
				break;
			case T__5:
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
			case T__26:
			case OPTIONAL:
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				field();
				}
				break;
			case TRANSITION_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				transition();
				}
				break;
			case ENQUEUE_OP:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
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
		enterRule(_localctx, 14, RULE_return_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__2);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__26) | (1L << OPTIONAL) | (1L << MODEL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(134);
				return_block_statement();
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(135);
					match(T__3);
					}
				}

				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(T__4);
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
		enterRule(_localctx, 16, RULE_return_block_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				enumeration();
				}
				break;
			case T__5:
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
			case T__26:
			case OPTIONAL:
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
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
		enterRule(_localctx, 18, RULE_scalar_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_model_type);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MODEL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(MODEL_TYPE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				reference(0);
				setState(153);
				match(DOT);
				setState(154);
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
		enterRule(_localctx, 22, RULE_enum_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 24, RULE_enum_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
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
		enterRule(_localctx, 26, RULE_enumeration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(T__21);
			setState(163);
			enum_type();
			setState(164);
			match(T__2);
			setState(166); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(165);
				enum_value();
				}
				}
				setState(168); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MODEL_TYPE );
			setState(170);
			match(T__4);
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
		enterRule(_localctx, 28, RULE_field);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(172);
					match(OPTIONAL);
					}
				}

				setState(175);
				type();
				setState(176);
				match(ID);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN_OP) {
					{
					setState(177);
					dynamic_source();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONAL) {
					{
					setState(180);
					match(OPTIONAL);
					}
				}

				setState(183);
				collection();
				setState(184);
				match(ID);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RETURN_OP) {
					{
					setState(185);
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
		enterRule(_localctx, 30, RULE_dynamic_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(RETURN_OP);
			setState(191);
			model_type();
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(192);
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
		enterRule(_localctx, 32, RULE_dynamic_source_mapping);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(T__22);
			setState(196);
			dynamic_source_mapping_parameter();
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(197);
				match(T__23);
				setState(198);
				dynamic_source_mapping_parameter();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(T__24);
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
		enterRule(_localctx, 34, RULE_dynamic_source_mapping_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			setState(207);
			match(T__25);
			setState(208);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_reference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(211);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ReferenceContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_reference);
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(214);
					match(DOT);
					setState(215);
					match(ID);
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 38, RULE_dynamic_source_mapping_parameter_rename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(225);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
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
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				scalar_type();
				}
				break;
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				model_type();
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
		enterRule(_localctx, 42, RULE_collection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__26);
			setState(228);
			type();
			setState(229);
			match(T__27);
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
		enterRule(_localctx, 44, RULE_return_type);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				collection();
				}
				break;
			case T__5:
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
			case MODEL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
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
		enterRule(_localctx, 46, RULE_throw_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__28);
			setState(236);
			throw_parameter();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__23) {
				{
				{
				setState(237);
				match(T__23);
				setState(238);
				throw_parameter();
				}
				}
				setState(243);
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
		enterRule(_localctx, 48, RULE_throw_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
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

	public static class TransitionContext extends ParserRuleContext {
		public TerminalNode TRANSITION_OP() { return getToken(StopParser.TRANSITION_OP, 0); }
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
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
		enterRule(_localctx, 50, RULE_transition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(TRANSITION_OP);
			setState(247);
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

	public static class EnqueueContext extends ParserRuleContext {
		public TerminalNode ENQUEUE_OP() { return getToken(StopParser.ENQUEUE_OP, 0); }
		public Model_typeContext model_type() {
			return getRuleContext(Model_typeContext.class,0);
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
		enterRule(_localctx, 52, RULE_enqueue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(ENQUEUE_OP);
			setState(250);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return packageName_sempred((PackageNameContext)_localctx, predIndex);
		case 18:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00ff\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\5\2:\n\2\3\2\3\2\3\2\6\2?\n\2\r\2\16"+
		"\2@\3\3\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\6\5\6U\n\6\3\6\3\6\5\6Y\n\6\3\6\3\6\5\6]\n\6\3\6\3\6\5\6a\n\6"+
		"\3\6\3\6\5\6e\n\6\3\6\3\6\5\6i\n\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\6\3"+
		"\6\5\6t\n\6\3\7\3\7\3\7\5\7y\n\7\7\7{\n\7\f\7\16\7~\13\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\5\b\u0086\n\b\3\t\3\t\3\t\5\t\u008b\n\t\7\t\u008d\n\t\f\t\16"+
		"\t\u0090\13\t\3\t\3\t\3\n\3\n\5\n\u0096\n\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u009f\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\6\17\u00a9\n"+
		"\17\r\17\16\17\u00aa\3\17\3\17\3\20\5\20\u00b0\n\20\3\20\3\20\3\20\5\20"+
		"\u00b5\n\20\3\20\5\20\u00b8\n\20\3\20\3\20\3\20\5\20\u00bd\n\20\5\20\u00bf"+
		"\n\20\3\21\3\21\3\21\5\21\u00c4\n\21\3\22\3\22\3\22\3\22\7\22\u00ca\n"+
		"\22\f\22\16\22\u00cd\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\7\24\u00db\n\24\f\24\16\24\u00de\13\24\3\25\3\25\3\26"+
		"\3\26\5\26\u00e4\n\26\3\27\3\27\3\27\3\27\3\30\3\30\5\30\u00ec\n\30\3"+
		"\31\3\31\3\31\3\31\7\31\u00f2\n\31\f\31\16\31\u00f5\13\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\34\2\4\4&\35\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\66\2\3\3\2\b\27\2\u0107\29\3\2\2\2\4B\3"+
		"\2\2\2\6M\3\2\2\2\bP\3\2\2\2\ns\3\2\2\2\fu\3\2\2\2\16\u0085\3\2\2\2\20"+
		"\u0087\3\2\2\2\22\u0095\3\2\2\2\24\u0097\3\2\2\2\26\u009e\3\2\2\2\30\u00a0"+
		"\3\2\2\2\32\u00a2\3\2\2\2\34\u00a4\3\2\2\2\36\u00be\3\2\2\2 \u00c0\3\2"+
		"\2\2\"\u00c5\3\2\2\2$\u00d0\3\2\2\2&\u00d4\3\2\2\2(\u00df\3\2\2\2*\u00e3"+
		"\3\2\2\2,\u00e5\3\2\2\2.\u00eb\3\2\2\2\60\u00ed\3\2\2\2\62\u00f6\3\2\2"+
		"\2\64\u00f8\3\2\2\2\66\u00fb\3\2\2\28:\5\6\4\298\3\2\2\29:\3\2\2\2:>\3"+
		"\2\2\2;?\5\b\5\2<?\5\n\6\2=?\5\34\17\2>;\3\2\2\2><\3\2\2\2>=\3\2\2\2?"+
		"@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\3\3\2\2\2BC\b\3\1\2CD\7*\2\2DJ\3\2\2\2"+
		"EF\f\3\2\2FG\7\'\2\2GI\7*\2\2HE\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\5\3\2\2\2LJ\3\2\2\2MN\7\3\2\2NO\5\4\3\2O\7\3\2\2\2PQ\7\4\2\2QR\7+\2"+
		"\2R\t\3\2\2\2SU\7 \2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7)\2\2WY\5\60\31"+
		"\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Zt\5\f\7\2[]\7!\2\2\\[\3\2\2\2\\]\3\2"+
		"\2\2]^\3\2\2\2^`\7)\2\2_a\5\60\31\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bt\5"+
		"\f\7\2ce\7\"\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fh\7)\2\2gi\5\60\31\2hg"+
		"\3\2\2\2hi\3\2\2\2ij\3\2\2\2jt\5\f\7\2kl\7)\2\2lm\7$\2\2mo\5.\30\2np\5"+
		"\60\31\2on\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\5\20\t\2rt\3\2\2\2sT\3\2\2\2"+
		"s\\\3\2\2\2sd\3\2\2\2sk\3\2\2\2t\13\3\2\2\2u|\7\5\2\2vx\5\16\b\2wy\7\6"+
		"\2\2xw\3\2\2\2xy\3\2\2\2y{\3\2\2\2zv\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2"+
		"\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0080\7\7\2\2\u0080\r\3\2\2\2\u0081\u0086"+
		"\5\34\17\2\u0082\u0086\5\36\20\2\u0083\u0086\5\64\33\2\u0084\u0086\5\66"+
		"\34\2\u0085\u0081\3\2\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0084\3\2\2\2\u0086\17\3\2\2\2\u0087\u008e\7\5\2\2\u0088\u008a\5\22\n"+
		"\2\u0089\u008b\7\6\2\2\u008a\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\7"+
		"\2\2\u0092\21\3\2\2\2\u0093\u0096\5\34\17\2\u0094\u0096\5\36\20\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\23\3\2\2\2\u0097\u0098\t\2\2"+
		"\2\u0098\25\3\2\2\2\u0099\u009f\7)\2\2\u009a\u009b\5&\24\2\u009b\u009c"+
		"\7\'\2\2\u009c\u009d\7)\2\2\u009d\u009f\3\2\2\2\u009e\u0099\3\2\2\2\u009e"+
		"\u009a\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\7)\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a3\7)\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\30\2\2\u00a5\u00a6\5\30\r"+
		"\2\u00a6\u00a8\7\5\2\2\u00a7\u00a9\5\32\16\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\u00ad\7\7\2\2\u00ad\35\3\2\2\2\u00ae\u00b0\7&\2\2\u00af\u00ae"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\5*\26\2\u00b2"+
		"\u00b4\7*\2\2\u00b3\u00b5\5 \21\2\u00b4\u00b3\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b8\7&\2\2\u00b7\u00b6\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\5,\27\2\u00ba\u00bc\7*"+
		"\2\2\u00bb\u00bd\5 \21\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00af\3\2\2\2\u00be\u00b7\3\2\2\2\u00bf\37\3\2\2"+
		"\2\u00c0\u00c1\7$\2\2\u00c1\u00c3\5\26\f\2\u00c2\u00c4\5\"\22\2\u00c3"+
		"\u00c2\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4!\3\2\2\2\u00c5\u00c6\7\31\2\2"+
		"\u00c6\u00cb\5$\23\2\u00c7\u00c8\7\32\2\2\u00c8\u00ca\5$\23\2\u00c9\u00c7"+
		"\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\33\2\2\u00cf#\3\2\2\2"+
		"\u00d0\u00d1\7*\2\2\u00d1\u00d2\7\34\2\2\u00d2\u00d3\5(\25\2\u00d3%\3"+
		"\2\2\2\u00d4\u00d5\b\24\1\2\u00d5\u00d6\7*\2\2\u00d6\u00dc\3\2\2\2\u00d7"+
		"\u00d8\f\3\2\2\u00d8\u00d9\7\'\2\2\u00d9\u00db\7*\2\2\u00da\u00d7\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\'\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\5&\24\2\u00e0)\3\2\2\2\u00e1"+
		"\u00e4\5\24\13\2\u00e2\u00e4\5\26\f\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4+\3\2\2\2\u00e5\u00e6\7\35\2\2\u00e6\u00e7\5*\26\2\u00e7"+
		"\u00e8\7\36\2\2\u00e8-\3\2\2\2\u00e9\u00ec\5,\27\2\u00ea\u00ec\5*\26\2"+
		"\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec/\3\2\2\2\u00ed\u00ee\7"+
		"\37\2\2\u00ee\u00f3\5\62\32\2\u00ef\u00f0\7\32\2\2\u00f0\u00f2\5\62\32"+
		"\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\61\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\5\26\f\2\u00f7"+
		"\63\3\2\2\2\u00f8\u00f9\7#\2\2\u00f9\u00fa\5\26\f\2\u00fa\65\3\2\2\2\u00fb"+
		"\u00fc\7%\2\2\u00fc\u00fd\5\26\f\2\u00fd\67\3\2\2\2!9>@JTX\\`dhosx|\u0085"+
		"\u008a\u008e\u0095\u009e\u00aa\u00af\u00b4\u00b7\u00bc\u00be\u00c3\u00cb"+
		"\u00dc\u00e3\u00eb\u00f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}