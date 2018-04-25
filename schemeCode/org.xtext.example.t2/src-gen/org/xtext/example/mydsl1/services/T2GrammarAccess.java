/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class T2GrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Model");
		private final Assignment cVarsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cVarsVARParserRuleCall_0 = (RuleCall)cVarsAssignment.eContents().get(0);
		
		//Model:
		//	vars+=VAR*;
		@Override public ParserRule getRule() { return rule; }
		
		//vars+=VAR*
		public Assignment getVarsAssignment() { return cVarsAssignment; }
		
		//VAR
		public RuleCall getVarsVARParserRuleCall_0() { return cVarsVARParserRuleCall_0; }
	}
	public class OpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Op");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPlusSignKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cSolidusKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cAsteriskKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cLessThanSignKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cGreaterThanSignKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cGreaterThanSignEqualsSignKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cLessThanSignEqualsSignKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		private final Keyword cEqualsSignKeyword_8 = (Keyword)cAlternatives.eContents().get(8);
		
		//Op:
		//	'-' | '+' | '/' | '*' | '<' | '>' | '>=' | '<=' | '=';
		@Override public ParserRule getRule() { return rule; }
		
		//'-' | '+' | '/' | '*' | '<' | '>' | '>=' | '<=' | '='
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1() { return cPlusSignKeyword_1; }
		
		//'/'
		public Keyword getSolidusKeyword_2() { return cSolidusKeyword_2; }
		
		//'*'
		public Keyword getAsteriskKeyword_3() { return cAsteriskKeyword_3; }
		
		//'<'
		public Keyword getLessThanSignKeyword_4() { return cLessThanSignKeyword_4; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_5() { return cGreaterThanSignKeyword_5; }
		
		//'>='
		public Keyword getGreaterThanSignEqualsSignKeyword_6() { return cGreaterThanSignEqualsSignKeyword_6; }
		
		//'<='
		public Keyword getLessThanSignEqualsSignKeyword_7() { return cLessThanSignEqualsSignKeyword_7; }
		
		//'='
		public Keyword getEqualsSignKeyword_8() { return cEqualsSignKeyword_8; }
	}
	public class CondicionalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Condicional");
		private final Keyword cIfKeyword = (Keyword)rule.eContents().get(1);
		
		//Condicional:
		//	'if';
		@Override public ParserRule getRule() { return rule; }
		
		//'if'
		public Keyword getIfKeyword() { return cIfKeyword; }
	}
	public class PrefixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Prefix");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDefineKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cSetKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cDisplayKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cPrintKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cLambdaKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		private final Keyword cDefineMacroKeyword_5 = (Keyword)cAlternatives.eContents().get(5);
		private final Keyword cReadKeyword_6 = (Keyword)cAlternatives.eContents().get(6);
		private final Keyword cMapKeyword_7 = (Keyword)cAlternatives.eContents().get(7);
		
		//Prefix:
		//	'define' | 'set!' | 'display' | 'print' | 'lambda' | 'define-macro' | 'read' | 'map';
		@Override public ParserRule getRule() { return rule; }
		
		//'define' | 'set!' | 'display' | 'print' | 'lambda' | 'define-macro' | 'read' | 'map'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'define'
		public Keyword getDefineKeyword_0() { return cDefineKeyword_0; }
		
		//'set!'
		public Keyword getSetKeyword_1() { return cSetKeyword_1; }
		
		//'display'
		public Keyword getDisplayKeyword_2() { return cDisplayKeyword_2; }
		
		//'print'
		public Keyword getPrintKeyword_3() { return cPrintKeyword_3; }
		
		//'lambda'
		public Keyword getLambdaKeyword_4() { return cLambdaKeyword_4; }
		
		//'define-macro'
		public Keyword getDefineMacroKeyword_5() { return cDefineMacroKeyword_5; }
		
		//'read'
		public Keyword getReadKeyword_6() { return cReadKeyword_6; }
		
		//'map'
		public Keyword getMapKeyword_7() { return cMapKeyword_7; }
	}
	public class ComposeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Compose");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrefixParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cPrefixParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Compose:
		//	Prefix | '(' Prefix ')';
		@Override public ParserRule getRule() { return rule; }
		
		//Prefix | '(' Prefix ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_0() { return cPrefixParserRuleCall_0; }
		
		//'(' Prefix ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_1_1() { return cPrefixParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cPrefixParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cComplementoParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Define:
		//	'(' Prefix ID Complemento ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' Prefix ID Complemento ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_1() { return cPrefixParserRuleCall_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_3() { return cComplementoParserRuleCall_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ComplementoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Complemento");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cOpParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cOpParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2_2 = (RuleCall)cGroup_2.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_2_3 = (RuleCall)cGroup_2.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_2_4 = (Keyword)cGroup_2.eContents().get(4);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cPrefixParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_3_2 = (RuleCall)cGroup_3.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final RuleCall cPrefixParserRuleCall_4_0 = (RuleCall)cGroup_4.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cLeftParenthesisKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final RuleCall cPrefixParserRuleCall_5_1 = (RuleCall)cGroup_5.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_5_2 = (RuleCall)cGroup_5.eContents().get(2);
		private final RuleCall cComposeParserRuleCall_5_3 = (RuleCall)cGroup_5.eContents().get(3);
		private final RuleCall cSTRINGTerminalRuleCall_5_4 = (RuleCall)cGroup_5.eContents().get(4);
		private final Keyword cRightParenthesisKeyword_5_5 = (Keyword)cGroup_5.eContents().get(5);
		
		//Complemento:
		//	INT | '(' Op INT* ')' | '(' Op ID INT ')' | '(' Prefix STRING ')' | Prefix STRING | '(' Prefix STRING Compose STRING
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//INT | '(' Op INT* ')' | '(' Op ID INT ')' | '(' Prefix STRING ')' | Prefix STRING | '(' Prefix STRING Compose STRING ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'(' Op INT* ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Op
		public RuleCall getOpParserRuleCall_1_1() { return cOpParserRuleCall_1_1; }
		
		//INT*
		public RuleCall getINTTerminalRuleCall_1_2() { return cINTTerminalRuleCall_1_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }
		
		//'(' Op ID INT ')'
		public Group getGroup_2() { return cGroup_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//Op
		public RuleCall getOpParserRuleCall_2_1() { return cOpParserRuleCall_2_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2_2() { return cIDTerminalRuleCall_2_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_3() { return cINTTerminalRuleCall_2_3; }
		
		//')'
		public Keyword getRightParenthesisKeyword_2_4() { return cRightParenthesisKeyword_2_4; }
		
		//'(' Prefix STRING ')'
		public Group getGroup_3() { return cGroup_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_0() { return cLeftParenthesisKeyword_3_0; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_3_1() { return cPrefixParserRuleCall_3_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_3_2() { return cSTRINGTerminalRuleCall_3_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }
		
		//Prefix STRING
		public Group getGroup_4() { return cGroup_4; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_4_0() { return cPrefixParserRuleCall_4_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_4_1() { return cSTRINGTerminalRuleCall_4_1; }
		
		//'(' Prefix STRING Compose STRING ')'
		public Group getGroup_5() { return cGroup_5; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5_0() { return cLeftParenthesisKeyword_5_0; }
		
		//Prefix
		public RuleCall getPrefixParserRuleCall_5_1() { return cPrefixParserRuleCall_5_1; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5_2() { return cSTRINGTerminalRuleCall_5_2; }
		
		//Compose
		public RuleCall getComposeParserRuleCall_5_3() { return cComposeParserRuleCall_5_3; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_5_4() { return cSTRINGTerminalRuleCall_5_4; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5_5() { return cRightParenthesisKeyword_5_5; }
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cDefAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cDefDefineParserRuleCall_0_0 = (RuleCall)cDefAssignment_0.eContents().get(0);
		private final Assignment cCompAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cCompComplementoParserRuleCall_1_0 = (RuleCall)cCompAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cOpParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cComplementoParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final RuleCall cCondicionalParserRuleCall_3_0 = (RuleCall)cGroup_3.eContents().get(0);
		private final RuleCall cComplementoParserRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		private final RuleCall cComplementoParserRuleCall_3_2 = (RuleCall)cGroup_3.eContents().get(2);
		
		//Value:
		//	def=Define | comp=Complemento | Op Complemento | Condicional Complemento Complemento;
		@Override public ParserRule getRule() { return rule; }
		
		//def=Define | comp=Complemento | Op Complemento | Condicional Complemento Complemento
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//def=Define
		public Assignment getDefAssignment_0() { return cDefAssignment_0; }
		
		//Define
		public RuleCall getDefDefineParserRuleCall_0_0() { return cDefDefineParserRuleCall_0_0; }
		
		//comp=Complemento
		public Assignment getCompAssignment_1() { return cCompAssignment_1; }
		
		//Complemento
		public RuleCall getCompComplementoParserRuleCall_1_0() { return cCompComplementoParserRuleCall_1_0; }
		
		//Op Complemento
		public Group getGroup_2() { return cGroup_2; }
		
		//Op
		public RuleCall getOpParserRuleCall_2_0() { return cOpParserRuleCall_2_0; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_2_1() { return cComplementoParserRuleCall_2_1; }
		
		//Condicional Complemento Complemento
		public Group getGroup_3() { return cGroup_3; }
		
		//Condicional
		public RuleCall getCondicionalParserRuleCall_3_0() { return cCondicionalParserRuleCall_3_0; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_3_1() { return cComplementoParserRuleCall_3_1; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_3_2() { return cComplementoParserRuleCall_3_2; }
	}
	public class VARElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.VAR");
		private final RuleCall cValueParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//VAR:
		//	Value;
		@Override public ParserRule getRule() { return rule; }
		
		//Value
		public RuleCall getValueParserRuleCall() { return cValueParserRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final OpElements pOp;
	private final CondicionalElements pCondicional;
	private final PrefixElements pPrefix;
	private final ComposeElements pCompose;
	private final DefineElements pDefine;
	private final ComplementoElements pComplemento;
	private final ValueElements pValue;
	private final VARElements pVAR;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public T2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pOp = new OpElements();
		this.pCondicional = new CondicionalElements();
		this.pPrefix = new PrefixElements();
		this.pCompose = new ComposeElements();
		this.pDefine = new DefineElements();
		this.pComplemento = new ComplementoElements();
		this.pValue = new ValueElements();
		this.pVAR = new VARElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl1.T2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	vars+=VAR*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Op:
	//	'-' | '+' | '/' | '*' | '<' | '>' | '>=' | '<=' | '=';
	public OpElements getOpAccess() {
		return pOp;
	}
	
	public ParserRule getOpRule() {
		return getOpAccess().getRule();
	}
	
	//Condicional:
	//	'if';
	public CondicionalElements getCondicionalAccess() {
		return pCondicional;
	}
	
	public ParserRule getCondicionalRule() {
		return getCondicionalAccess().getRule();
	}
	
	//Prefix:
	//	'define' | 'set!' | 'display' | 'print' | 'lambda' | 'define-macro' | 'read' | 'map';
	public PrefixElements getPrefixAccess() {
		return pPrefix;
	}
	
	public ParserRule getPrefixRule() {
		return getPrefixAccess().getRule();
	}
	
	//Compose:
	//	Prefix | '(' Prefix ')';
	public ComposeElements getComposeAccess() {
		return pCompose;
	}
	
	public ParserRule getComposeRule() {
		return getComposeAccess().getRule();
	}
	
	//Define:
	//	'(' Prefix ID Complemento ')';
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//Complemento:
	//	INT | '(' Op INT* ')' | '(' Op ID INT ')' | '(' Prefix STRING ')' | Prefix STRING | '(' Prefix STRING Compose STRING
	//	')';
	public ComplementoElements getComplementoAccess() {
		return pComplemento;
	}
	
	public ParserRule getComplementoRule() {
		return getComplementoAccess().getRule();
	}
	
	//Value:
	//	def=Define | comp=Complemento | Op Complemento | Condicional Complemento Complemento;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}
	
	//VAR:
	//	Value;
	public VARElements getVARAccess() {
		return pVAR;
	}
	
	public ParserRule getVARRule() {
		return getVARAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
