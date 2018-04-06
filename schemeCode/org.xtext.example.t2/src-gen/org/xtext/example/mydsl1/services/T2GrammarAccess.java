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
	public class DefineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Define");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cDefineKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cComplementoParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Define:
		//	'(' 'define' ID Complemento ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' 'define' ID Complemento ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//'define'
		public Keyword getDefineKeyword_1() { return cDefineKeyword_1; }
		
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
		
		//Complemento:
		//	INT | '(' Op INT* ')' | '(' Op ID INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//INT | '(' Op INT* ')' | '(' Op ID INT ')'
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
	}
	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl1.T2.Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefineParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cComplementoParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final RuleCall cOpParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final RuleCall cComplementoParserRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		
		//Value:
		//	Define | Complemento | Op Complemento;
		@Override public ParserRule getRule() { return rule; }
		
		//Define | Complemento | Op Complemento
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Define
		public RuleCall getDefineParserRuleCall_0() { return cDefineParserRuleCall_0; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_1() { return cComplementoParserRuleCall_1; }
		
		//Op Complemento
		public Group getGroup_2() { return cGroup_2; }
		
		//Op
		public RuleCall getOpParserRuleCall_2_0() { return cOpParserRuleCall_2_0; }
		
		//Complemento
		public RuleCall getComplementoParserRuleCall_2_1() { return cComplementoParserRuleCall_2_1; }
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
	
	//Define:
	//	'(' 'define' ID Complemento ')';
	public DefineElements getDefineAccess() {
		return pDefine;
	}
	
	public ParserRule getDefineRule() {
		return getDefineAccess().getRule();
	}
	
	//Complemento:
	//	INT | '(' Op INT* ')' | '(' Op ID INT ')';
	public ComplementoElements getComplementoAccess() {
		return pComplemento;
	}
	
	public ParserRule getComplementoRule() {
		return getComplementoAccess().getRule();
	}
	
	//Value:
	//	Define | Complemento | Op Complemento;
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
