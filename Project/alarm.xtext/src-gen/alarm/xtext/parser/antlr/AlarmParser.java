/*
 * generated by Xtext 2.25.0
 */
package alarm.xtext.parser.antlr;

import alarm.xtext.parser.antlr.internal.InternalAlarmParser;
import alarm.xtext.services.AlarmGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class AlarmParser extends AbstractAntlrParser {

	@Inject
	private AlarmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalAlarmParser createParser(XtextTokenStream stream) {
		return new InternalAlarmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "App";
	}

	public AlarmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AlarmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
