// Generated from E:/dtantlrlr/src/main/java/org/dantlr\Dql.g4 by ANTLR 4.7
package org.dantlr.gner.cab;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4;
	public static final int
		RULE_binding = 0, RULE_suffix = 1, RULE_id = 2, RULE_midl = 3, RULE_endexpr = 4;
	public static final String[] ruleNames = {
		"binding", "suffix", "id", "midl", "endexpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'select'", "'insert'", "'[a-z]+'", "'from'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
	public String getGrammarFileName() { return "Dql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BindingContext extends ParserRuleContext {
		public SuffixContext suffix() {
			return getRuleContext(SuffixContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public MidlContext midl() {
			return getRuleContext(MidlContext.class,0);
		}
		public EndexprContext endexpr() {
			return getRuleContext(EndexprContext.class,0);
		}
		public BindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).enterBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).exitBinding(this);
		}
	}

	public final BindingContext binding() throws RecognitionException {
		BindingContext _localctx = new BindingContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_binding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			suffix();
			setState(11);
			id();
			setState(12);
			midl();
			setState(13);
			endexpr();
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

	public static class SuffixContext extends ParserRuleContext {
		public SuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).enterSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).exitSuffix(this);
		}
	}

	public final SuffixContext suffix() throws RecognitionException {
		SuffixContext _localctx = new SuffixContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_suffix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
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

	public static class IdContext extends ParserRuleContext {
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			match(T__2);
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

	public static class MidlContext extends ParserRuleContext {
		public MidlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_midl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).enterMidl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).exitMidl(this);
		}
	}

	public final MidlContext midl() throws RecognitionException {
		MidlContext _localctx = new MidlContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_midl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(T__3);
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

	public static class EndexprContext extends ParserRuleContext {
		public EndexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).enterEndexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DqlListener ) ((DqlListener)listener).exitEndexpr(this);
		}
	}

	public final EndexprContext endexpr() throws RecognitionException {
		EndexprContext _localctx = new EndexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_endexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__2);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\32\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\3\3\2\3\4\2\24\2\f\3\2\2\2\4\21\3\2\2"+
		"\2\6\23\3\2\2\2\b\25\3\2\2\2\n\27\3\2\2\2\f\r\5\4\3\2\r\16\5\6\4\2\16"+
		"\17\5\b\5\2\17\20\5\n\6\2\20\3\3\2\2\2\21\22\t\2\2\2\22\5\3\2\2\2\23\24"+
		"\7\5\2\2\24\7\3\2\2\2\25\26\7\6\2\2\26\t\3\2\2\2\27\30\7\5\2\2\30\13\3"+
		"\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}