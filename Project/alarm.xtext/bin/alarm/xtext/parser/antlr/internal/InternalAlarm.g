/*
 * generated by Xtext 2.25.0
 */
grammar InternalAlarm;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package alarm.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package alarm.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import alarm.xtext.services.AlarmGrammarAccess;

}

@parser::members {

 	private AlarmGrammarAccess grammarAccess;

    public InternalAlarmParser(TokenStream input, AlarmGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "App";
   	}

   	@Override
   	protected AlarmGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleApp
entryRuleApp returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppRule()); }
	iv_ruleApp=ruleApp
	{ $current=$iv_ruleApp.current; }
	EOF;

// Rule App
ruleApp returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='App'
		{
			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='initial'
		{
			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getInitialKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAppRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='bricks'
		{
			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
		}
		otherlv_6='{'
		{
			newLeafNode(otherlv_6, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0());
				}
				lv_bricks_7_0=ruleBrick
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"bricks",
						lv_bricks_7_0,
						"alarm.xtext.Alarm.Brick");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getAppAccess().getCommaKeyword_8_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_8_1_0());
					}
					lv_bricks_9_0=ruleBrick
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppRule());
						}
						add(
							$current,
							"bricks",
							lv_bricks_9_0,
							"alarm.xtext.Alarm.Brick");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_9());
		}
		otherlv_11='states'
		{
			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getStatesKeyword_10());
		}
		otherlv_12='{'
		{
			newLeafNode(otherlv_12, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_11());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
				}
				lv_states_13_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppRule());
					}
					add(
						$current,
						"states",
						lv_states_13_0,
						"alarm.xtext.Alarm.State");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_14=','
			{
				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getCommaKeyword_13_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_1_0());
					}
					lv_states_15_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppRule());
						}
						add(
							$current,
							"states",
							lv_states_15_0,
							"alarm.xtext.Alarm.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_16='}'
		{
			newLeafNode(otherlv_16, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_14());
		}
		(
			otherlv_17='alarm'
			{
				newLeafNode(otherlv_17, grammarAccess.getAppAccess().getAlarmKeyword_15_0());
			}
			otherlv_18='{'
			{
				newLeafNode(otherlv_18, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_15_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_15_2_0());
					}
					lv_alarm_19_0=ruleAlarm
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAppRule());
						}
						add(
							$current,
							"alarm",
							lv_alarm_19_0,
							"alarm.xtext.Alarm.Alarm");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getAppAccess().getCommaKeyword_15_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_15_3_1_0());
						}
						lv_alarm_21_0=ruleAlarm
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAppRule());
							}
							add(
								$current,
								"alarm",
								lv_alarm_21_0,
								"alarm.xtext.Alarm.Alarm");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_22='}'
			{
				newLeafNode(otherlv_22, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_15_4());
			}
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_16());
		}
	)
;

// Entry rule entryRuleBrick
entryRuleBrick returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBrickRule()); }
	iv_ruleBrick=ruleBrick
	{ $current=$iv_ruleBrick.current; }
	EOF;

// Rule Brick
ruleBrick returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0());
		}
		this_Sensor_0=ruleSensor
		{
			$current = $this_Sensor_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_1());
		}
		this_Actuator_1=ruleActuator
		{
			$current = $this_Actuator_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAlarm
entryRuleAlarm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlarmRule()); }
	iv_ruleAlarm=ruleAlarm
	{ $current=$iv_ruleAlarm.current; }
	EOF;

// Rule Alarm
ruleAlarm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAlarmAccess().getSimpleAlarmParserRuleCall_0());
		}
		this_SimpleAlarm_0=ruleSimpleAlarm
		{
			$current = $this_SimpleAlarm_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlarmAccess().getDualCheckAlarmParserRuleCall_1());
		}
		this_DualCheckAlarm_1=ruleDualCheckAlarm
		{
			$current = $this_DualCheckAlarm_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlarmAccess().getStateBasedAlarmParserRuleCall_2());
		}
		this_StateBasedAlarm_2=ruleStateBasedAlarm
		{
			$current = $this_StateBasedAlarm_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAlarmAccess().getMultiStateAlarmParserRuleCall_3());
		}
		this_MultiStateAlarm_3=ruleMultiStateAlarm
		{
			$current = $this_MultiStateAlarm_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='State'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='actions'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_0());
				}
				lv_actions_5_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					add(
						$current,
						"actions",
						lv_actions_5_0,
						"alarm.xtext.Alarm.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_6_1_0());
					}
					lv_actions_7_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"actions",
							lv_actions_7_0,
							"alarm.xtext.Alarm.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='transition'
		{
			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_9_0());
				}
				lv_transition_10_0=ruleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"transition",
						lv_transition_10_0,
						"alarm.xtext.Alarm.Transition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSensorAccess().getSensorAction_0(),
					$current);
			}
		)
		otherlv_1='Sensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='pin'
			{
				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_4_1_0());
					}
					lv_pin_5_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSensorRule());
						}
						set(
							$current,
							"pin",
							lv_pin_5_0,
							"alarm.xtext.Alarm.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleActuator
entryRuleActuator returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActuatorRule()); }
	iv_ruleActuator=ruleActuator
	{ $current=$iv_ruleActuator.current; }
	EOF;

// Rule Actuator
ruleActuator returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActuatorAccess().getActuatorAction_0(),
					$current);
			}
		)
		otherlv_1='Actuator'
		{
			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActuatorRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			otherlv_4='pin'
			{
				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_4_1_0());
					}
					lv_pin_5_0=ruleEInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActuatorRule());
						}
						set(
							$current,
							"pin",
							lv_pin_5_0,
							"alarm.xtext.Alarm.EInt");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Action'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='value'
			{
				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getValueKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_1_0());
					}
					lv_value_3_0=ruleSIGNAL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActionRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"alarm.xtext.Alarm.SIGNAL");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='actuator'
		{
			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActuatorKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getActionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		otherlv_1='{'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
		}
		(
			otherlv_2='value'
			{
				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getValueKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_2_1_0());
					}
					lv_value_3_0=ruleSIGNAL
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"value",
							lv_value_3_0,
							"alarm.xtext.Alarm.SIGNAL");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4='sensor'
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSensorKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6='next'
		{
			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getNextKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleSimpleAlarm
entryRuleSimpleAlarm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSimpleAlarmRule()); }
	iv_ruleSimpleAlarm=ruleSimpleAlarm
	{ $current=$iv_ruleSimpleAlarm.current; }
	EOF;

// Rule SimpleAlarm
ruleSimpleAlarm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='SimpleAlarm'
		{
			newLeafNode(otherlv_0, grammarAccess.getSimpleAlarmAccess().getSimpleAlarmKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSimpleAlarmRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSimpleAlarmAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='button'
		{
			newLeafNode(otherlv_3, grammarAccess.getSimpleAlarmAccess().getButtonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getButtonSensorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='Led'
		{
			newLeafNode(otherlv_5, grammarAccess.getSimpleAlarmAccess().getLedKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getLedActuatorCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='buzzer'
		{
			newLeafNode(otherlv_7, grammarAccess.getSimpleAlarmAccess().getBuzzerKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSimpleAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getBuzzerActuatorCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getSimpleAlarmAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleDualCheckAlarm
entryRuleDualCheckAlarm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDualCheckAlarmRule()); }
	iv_ruleDualCheckAlarm=ruleDualCheckAlarm
	{ $current=$iv_ruleDualCheckAlarm.current; }
	EOF;

// Rule DualCheckAlarm
ruleDualCheckAlarm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='DualCheckAlarm'
		{
			newLeafNode(otherlv_0, grammarAccess.getDualCheckAlarmAccess().getDualCheckAlarmKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDualCheckAlarmRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getDualCheckAlarmAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='button'
		{
			newLeafNode(otherlv_3, grammarAccess.getDualCheckAlarmAccess().getButtonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDualCheckAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButtonSensorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='buzzer'
		{
			newLeafNode(otherlv_5, grammarAccess.getDualCheckAlarmAccess().getBuzzerKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDualCheckAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getBuzzerActuatorCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='button2'
		{
			newLeafNode(otherlv_7, grammarAccess.getDualCheckAlarmAccess().getButton2Keyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDualCheckAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButton2SensorCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getDualCheckAlarmAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Entry rule entryRuleStateBasedAlarm
entryRuleStateBasedAlarm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateBasedAlarmRule()); }
	iv_ruleStateBasedAlarm=ruleStateBasedAlarm
	{ $current=$iv_ruleStateBasedAlarm.current; }
	EOF;

// Rule StateBasedAlarm
ruleStateBasedAlarm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='StateBasedAlarm'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateBasedAlarmAccess().getStateBasedAlarmKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateBasedAlarmRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateBasedAlarmAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='button'
		{
			newLeafNode(otherlv_3, grammarAccess.getStateBasedAlarmAccess().getButtonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateBasedAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getButtonSensorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='Led'
		{
			newLeafNode(otherlv_5, grammarAccess.getStateBasedAlarmAccess().getLedKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateBasedAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getLedActuatorCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateBasedAlarmAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleMultiStateAlarm
entryRuleMultiStateAlarm returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiStateAlarmRule()); }
	iv_ruleMultiStateAlarm=ruleMultiStateAlarm
	{ $current=$iv_ruleMultiStateAlarm.current; }
	EOF;

// Rule MultiStateAlarm
ruleMultiStateAlarm returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='MultiStateAlarm'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiStateAlarmAccess().getMultiStateAlarmKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiStateAlarmRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"alarm.xtext.Alarm.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMultiStateAlarmAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='button'
		{
			newLeafNode(otherlv_3, grammarAccess.getMultiStateAlarmAccess().getButtonKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiStateAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getButtonSensorCrossReference_4_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='buzzer'
		{
			newLeafNode(otherlv_5, grammarAccess.getMultiStateAlarmAccess().getBuzzerKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiStateAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getBuzzerActuatorCrossReference_6_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7='Led'
		{
			newLeafNode(otherlv_7, grammarAccess.getMultiStateAlarmAccess().getLedKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiStateAlarmRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getLedActuatorCrossReference_8_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getMultiStateAlarmAccess().getRightCurlyBracketKeyword_9());
		}
	)
;

// Rule SIGNAL
ruleSIGNAL returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='HIGH'
			{
				$current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LOW'
			{
				$current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
