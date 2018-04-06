/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl1.ide.contentassist.antlr.internal.InternalT2Parser;
import org.xtext.example.mydsl1.services.T2GrammarAccess;

public class T2Parser extends AbstractContentAssistParser {

	@Inject
	private T2GrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalT2Parser createParser() {
		InternalT2Parser result = new InternalT2Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getOpAccess().getAlternatives(), "rule__Op__Alternatives");
					put(grammarAccess.getComplementoAccess().getAlternatives(), "rule__Complemento__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getDefineAccess().getGroup(), "rule__Define__Group__0");
					put(grammarAccess.getComplementoAccess().getGroup_1(), "rule__Complemento__Group_1__0");
					put(grammarAccess.getComplementoAccess().getGroup_2(), "rule__Complemento__Group_2__0");
					put(grammarAccess.getModelAccess().getVarsAssignment(), "rule__Model__VarsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public T2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(T2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
