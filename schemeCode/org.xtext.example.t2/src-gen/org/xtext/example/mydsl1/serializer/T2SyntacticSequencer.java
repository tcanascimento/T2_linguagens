/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl1.services.T2GrammarAccess;

@SuppressWarnings("all")
public class T2SyntacticSequencer extends AbstractSyntacticSequencer {

	protected T2GrammarAccess grammarAccess;
	protected AbstractElementAlias match_Value___CondicionalParserRuleCall_3_0_ComplementoParserRuleCall_3_1_ComplementoParserRuleCall_3_2___or___OpParserRuleCall_2_0_ComplementoParserRuleCall_2_1__;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (T2GrammarAccess) access;
		match_Value___CondicionalParserRuleCall_3_0_ComplementoParserRuleCall_3_1_ComplementoParserRuleCall_3_2___or___OpParserRuleCall_2_0_ComplementoParserRuleCall_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getCondicionalParserRuleCall_3_0()), new TokenAlias(false, false, grammarAccess.getValueAccess().getComplementoParserRuleCall_3_1()), new TokenAlias(false, false, grammarAccess.getValueAccess().getComplementoParserRuleCall_3_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getOpParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getValueAccess().getComplementoParserRuleCall_2_1())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getComplementoRule())
			return getComplementoToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCondicionalRule())
			return getCondicionalToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpRule())
			return getOpToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Complemento:
	 * 	INT | '(' Op INT*')' | '(' Op ID INT')' | '(' Prefix STRING ')'| Prefix STRING | '(' Prefix STRING Compose STRING ')'
	 * ;
	 */
	protected String getComplementoToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * Condicional:
	 * 	'if' 
	 * ;
	 */
	protected String getCondicionalToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "if";
	}
	
	/**
	 * Op:
	 * 	'-' | '+' | '/' | '*' | '<' | '>'  | '>=' | '<=' | '='
	 * ;
	 */
	protected String getOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Value___CondicionalParserRuleCall_3_0_ComplementoParserRuleCall_3_1_ComplementoParserRuleCall_3_2___or___OpParserRuleCall_2_0_ComplementoParserRuleCall_2_1__.equals(syntax))
				emit_Value___CondicionalParserRuleCall_3_0_ComplementoParserRuleCall_3_1_ComplementoParserRuleCall_3_2___or___OpParserRuleCall_2_0_ComplementoParserRuleCall_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (Op Complemento) | (Condicional Complemento Complemento)
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 */
	protected void emit_Value___CondicionalParserRuleCall_3_0_ComplementoParserRuleCall_3_1_ComplementoParserRuleCall_3_2___or___OpParserRuleCall_2_0_ComplementoParserRuleCall_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
