/*
 * generated by Xtext 2.25.0
 */
package arduinoML.serializer;

import arduinoML.services.MyDSLGrammarAccess;
import com.google.inject.Inject;
import dSL.Actuator;
import dSL.App;
import dSL.DSLPackage;
import dSL.Sensor;
import dSL.State;
import dSL.Transition;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;

@SuppressWarnings("all")
public class MyDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DSLPackage.ACTION:
				sequence_Action(context, (dSL.Action) semanticObject); 
				return; 
			case DSLPackage.ACTUATOR:
				sequence_Actuator(context, (Actuator) semanticObject); 
				return; 
			case DSLPackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case DSLPackage.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case DSLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case DSLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (value=SIGNAL? actuator=[Actuator|EString])
	 */
	protected void sequence_Action(ISerializationContext context, dSL.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Brick returns Actuator
	 *     Actuator returns Actuator
	 *
	 * Constraint:
	 *     (name=EString pin=EInt?)
	 */
	protected void sequence_Actuator(ISerializationContext context, Actuator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     App returns App
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         initial=[State|EString] 
	 *         bricks+=Brick 
	 *         bricks+=Brick* 
	 *         states+=State 
	 *         states+=State*
	 *     )
	 */
	protected void sequence_App(ISerializationContext context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Brick returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (name=EString pin=EInt?)
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=EString actions+=Action actions+=Action* transition=Transition)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (value=SIGNAL? sensor=[Sensor|EString] next=[State|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
