/*
 * generated by Xtext 2.25.0
 */
package alarm.xtext.formatting2

import alarm.App
import alarm.State
import alarm.xtext.services.AlarmGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class AlarmFormatter extends AbstractFormatter2 {
	
	@Inject extension AlarmGrammarAccess

	def dispatch void format(App app, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (brick : app.bricks) {
			brick.format
		}
		for (state : app.states) {
			state.format
		}
		for (alarm : app.alarm) {
			alarm.format
		}
	}

	def dispatch void format(State state, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (action : state.actions) {
			action.format
		}
		state.transition.format
	}
	
}