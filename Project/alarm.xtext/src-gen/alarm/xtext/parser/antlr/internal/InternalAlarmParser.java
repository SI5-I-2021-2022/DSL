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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlarmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'{'", "'initial'", "'bricks'", "','", "'}'", "'states'", "'alarm'", "'State'", "'actions'", "'transition'", "'-'", "'Sensor'", "'pin'", "'Actuator'", "'Action'", "'value'", "'actuator'", "'Transition'", "'sensor'", "'next'", "'SimpleAlarm'", "'button'", "'Led'", "'buzzer'", "'DualCheckAlarm'", "'button2'", "'StateBasedAlarm'", "'MultiStateAlarm'", "'HIGH'", "'LOW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAlarmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlarmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlarmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlarm.g"; }



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




    // $ANTLR start "entryRuleApp"
    // InternalAlarm.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalAlarm.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalAlarm.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalAlarm.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_states_13_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_alarm_19_0 = null;

        EObject lv_alarm_21_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )? otherlv_23= '}' ) )
            // InternalAlarm.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            {
            // InternalAlarm.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )? otherlv_23= '}' )
            // InternalAlarm.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalAlarm.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getInitialKeyword_3());
            		
            // InternalAlarm.g:111:3: ( ( ruleEString ) )
            // InternalAlarm.g:112:4: ( ruleEString )
            {
            // InternalAlarm.g:112:4: ( ruleEString )
            // InternalAlarm.g:113:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_4_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getBricksKeyword_5());
            		
            otherlv_6=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalAlarm.g:135:3: ( (lv_bricks_7_0= ruleBrick ) )
            // InternalAlarm.g:136:4: (lv_bricks_7_0= ruleBrick )
            {
            // InternalAlarm.g:136:4: (lv_bricks_7_0= ruleBrick )
            // InternalAlarm.g:137:5: lv_bricks_7_0= ruleBrick
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_bricks_7_0=ruleBrick();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_7_0,
            						"alarm.xtext.Alarm.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlarm.g:154:3: (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlarm.g:155:4: otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getAppAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalAlarm.g:159:4: ( (lv_bricks_9_0= ruleBrick ) )
            	    // InternalAlarm.g:160:5: (lv_bricks_9_0= ruleBrick )
            	    {
            	    // InternalAlarm.g:160:5: (lv_bricks_9_0= ruleBrick )
            	    // InternalAlarm.g:161:6: lv_bricks_9_0= ruleBrick
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_bricks_9_0=ruleBrick();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_9_0,
            	    							"alarm.xtext.Alarm.Brick");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getStatesKeyword_10());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_12, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_11());
            		
            // InternalAlarm.g:191:3: ( (lv_states_13_0= ruleState ) )
            // InternalAlarm.g:192:4: (lv_states_13_0= ruleState )
            {
            // InternalAlarm.g:192:4: (lv_states_13_0= ruleState )
            // InternalAlarm.g:193:5: lv_states_13_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_states_13_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_13_0,
            						"alarm.xtext.Alarm.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlarm.g:210:3: (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlarm.g:211:4: otherlv_14= ',' ( (lv_states_15_0= ruleState ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalAlarm.g:215:4: ( (lv_states_15_0= ruleState ) )
            	    // InternalAlarm.g:216:5: (lv_states_15_0= ruleState )
            	    {
            	    // InternalAlarm.g:216:5: (lv_states_15_0= ruleState )
            	    // InternalAlarm.g:217:6: lv_states_15_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_states_15_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_15_0,
            	    							"alarm.xtext.Alarm.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_16, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_14());
            		
            // InternalAlarm.g:239:3: (otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlarm.g:240:4: otherlv_17= 'alarm' otherlv_18= '{' ( (lv_alarm_19_0= ruleAlarm ) ) (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )* otherlv_22= '}'
                    {
                    otherlv_17=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_17, grammarAccess.getAppAccess().getAlarmKeyword_15_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_18, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalAlarm.g:248:4: ( (lv_alarm_19_0= ruleAlarm ) )
                    // InternalAlarm.g:249:5: (lv_alarm_19_0= ruleAlarm )
                    {
                    // InternalAlarm.g:249:5: (lv_alarm_19_0= ruleAlarm )
                    // InternalAlarm.g:250:6: lv_alarm_19_0= ruleAlarm
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_alarm_19_0=ruleAlarm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"alarm",
                    							lv_alarm_19_0,
                    							"alarm.xtext.Alarm.Alarm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlarm.g:267:4: (otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAlarm.g:268:5: otherlv_20= ',' ( (lv_alarm_21_0= ruleAlarm ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FOLLOW_12); 

                    	    					newLeafNode(otherlv_20, grammarAccess.getAppAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalAlarm.g:272:5: ( (lv_alarm_21_0= ruleAlarm ) )
                    	    // InternalAlarm.g:273:6: (lv_alarm_21_0= ruleAlarm )
                    	    {
                    	    // InternalAlarm.g:273:6: (lv_alarm_21_0= ruleAlarm )
                    	    // InternalAlarm.g:274:7: lv_alarm_21_0= ruleAlarm
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_alarm_21_0=ruleAlarm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"alarm",
                    	    								lv_alarm_21_0,
                    	    								"alarm.xtext.Alarm.Alarm");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_22, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_23=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_23, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleBrick"
    // InternalAlarm.g:305:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalAlarm.g:305:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalAlarm.g:306:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // InternalAlarm.g:312:1: ruleBrick returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalAlarm.g:318:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalAlarm.g:319:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalAlarm.g:319:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlarm.g:320:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlarm.g:329:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleAlarm"
    // InternalAlarm.g:341:1: entryRuleAlarm returns [EObject current=null] : iv_ruleAlarm= ruleAlarm EOF ;
    public final EObject entryRuleAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarm = null;


        try {
            // InternalAlarm.g:341:46: (iv_ruleAlarm= ruleAlarm EOF )
            // InternalAlarm.g:342:2: iv_ruleAlarm= ruleAlarm EOF
            {
             newCompositeNode(grammarAccess.getAlarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlarm=ruleAlarm();

            state._fsp--;

             current =iv_ruleAlarm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlarm"


    // $ANTLR start "ruleAlarm"
    // InternalAlarm.g:348:1: ruleAlarm returns [EObject current=null] : (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm ) ;
    public final EObject ruleAlarm() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAlarm_0 = null;

        EObject this_DualCheckAlarm_1 = null;

        EObject this_StateBasedAlarm_2 = null;

        EObject this_MultiStateAlarm_3 = null;



        	enterRule();

        try {
            // InternalAlarm.g:354:2: ( (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm ) )
            // InternalAlarm.g:355:2: (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm )
            {
            // InternalAlarm.g:355:2: (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 36:
                {
                alt6=2;
                }
                break;
            case 38:
                {
                alt6=3;
                }
                break;
            case 39:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalAlarm.g:356:3: this_SimpleAlarm_0= ruleSimpleAlarm
                    {

                    			newCompositeNode(grammarAccess.getAlarmAccess().getSimpleAlarmParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SimpleAlarm_0=ruleSimpleAlarm();

                    state._fsp--;


                    			current = this_SimpleAlarm_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalAlarm.g:365:3: this_DualCheckAlarm_1= ruleDualCheckAlarm
                    {

                    			newCompositeNode(grammarAccess.getAlarmAccess().getDualCheckAlarmParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DualCheckAlarm_1=ruleDualCheckAlarm();

                    state._fsp--;


                    			current = this_DualCheckAlarm_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalAlarm.g:374:3: this_StateBasedAlarm_2= ruleStateBasedAlarm
                    {

                    			newCompositeNode(grammarAccess.getAlarmAccess().getStateBasedAlarmParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateBasedAlarm_2=ruleStateBasedAlarm();

                    state._fsp--;


                    			current = this_StateBasedAlarm_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalAlarm.g:383:3: this_MultiStateAlarm_3= ruleMultiStateAlarm
                    {

                    			newCompositeNode(grammarAccess.getAlarmAccess().getMultiStateAlarmParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiStateAlarm_3=ruleMultiStateAlarm();

                    state._fsp--;


                    			current = this_MultiStateAlarm_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlarm"


    // $ANTLR start "entryRuleEString"
    // InternalAlarm.g:395:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAlarm.g:395:47: (iv_ruleEString= ruleEString EOF )
            // InternalAlarm.g:396:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAlarm.g:402:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:408:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAlarm.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAlarm.g:409:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlarm.g:410:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlarm.g:418:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleState"
    // InternalAlarm.g:429:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAlarm.g:429:46: (iv_ruleState= ruleState EOF )
            // InternalAlarm.g:430:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalAlarm.g:436:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_transition_10_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:442:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) )
            // InternalAlarm.g:443:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            {
            // InternalAlarm.g:443:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            // InternalAlarm.g:444:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalAlarm.g:448:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:449:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:449:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:450:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalAlarm.g:479:3: ( (lv_actions_5_0= ruleAction ) )
            // InternalAlarm.g:480:4: (lv_actions_5_0= ruleAction )
            {
            // InternalAlarm.g:480:4: (lv_actions_5_0= ruleAction )
            // InternalAlarm.g:481:5: lv_actions_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_actions_5_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_5_0,
            						"alarm.xtext.Alarm.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlarm.g:498:3: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==15) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlarm.g:499:4: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_15); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAlarm.g:503:4: ( (lv_actions_7_0= ruleAction ) )
            	    // InternalAlarm.g:504:5: (lv_actions_7_0= ruleAction )
            	    {
            	    // InternalAlarm.g:504:5: (lv_actions_7_0= ruleAction )
            	    // InternalAlarm.g:505:6: lv_actions_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_actions_7_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStateRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_7_0,
            	    							"alarm.xtext.Alarm.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionKeyword_8());
            		
            // InternalAlarm.g:531:3: ( (lv_transition_10_0= ruleTransition ) )
            // InternalAlarm.g:532:4: (lv_transition_10_0= ruleTransition )
            {
            // InternalAlarm.g:532:4: (lv_transition_10_0= ruleTransition )
            // InternalAlarm.g:533:5: lv_transition_10_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_13);
            lv_transition_10_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_10_0,
            						"alarm.xtext.Alarm.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEInt"
    // InternalAlarm.g:558:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAlarm.g:558:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAlarm.g:559:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalAlarm.g:565:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:571:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAlarm.g:572:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAlarm.g:572:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAlarm.g:573:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAlarm.g:573:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlarm.g:574:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSensor"
    // InternalAlarm.g:591:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAlarm.g:591:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAlarm.g:592:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalAlarm.g:598:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:604:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalAlarm.g:605:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalAlarm.g:605:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalAlarm.g:606:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalAlarm.g:606:3: ()
            // InternalAlarm.g:607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalAlarm.g:617:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlarm.g:618:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlarm.g:618:4: (lv_name_2_0= ruleEString )
            // InternalAlarm.g:619:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlarm.g:640:3: (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlarm.g:641:4: otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinKeyword_4_0());
                    			
                    // InternalAlarm.g:645:4: ( (lv_pin_5_0= ruleEInt ) )
                    // InternalAlarm.g:646:5: (lv_pin_5_0= ruleEInt )
                    {
                    // InternalAlarm.g:646:5: (lv_pin_5_0= ruleEInt )
                    // InternalAlarm.g:647:6: lv_pin_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_pin_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"pin",
                    							lv_pin_5_0,
                    							"alarm.xtext.Alarm.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalAlarm.g:673:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalAlarm.g:673:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalAlarm.g:674:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalAlarm.g:680:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:686:2: ( ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalAlarm.g:687:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalAlarm.g:687:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalAlarm.g:688:3: () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalAlarm.g:688:3: ()
            // InternalAlarm.g:689:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		
            // InternalAlarm.g:699:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlarm.g:700:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlarm.g:700:4: (lv_name_2_0= ruleEString )
            // InternalAlarm.g:701:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalAlarm.g:722:3: (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalAlarm.g:723:4: otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinKeyword_4_0());
                    			
                    // InternalAlarm.g:727:4: ( (lv_pin_5_0= ruleEInt ) )
                    // InternalAlarm.g:728:5: (lv_pin_5_0= ruleEInt )
                    {
                    // InternalAlarm.g:728:5: (lv_pin_5_0= ruleEInt )
                    // InternalAlarm.g:729:6: lv_pin_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_pin_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"pin",
                    							lv_pin_5_0,
                    							"alarm.xtext.Alarm.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleAction"
    // InternalAlarm.g:755:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAlarm.g:755:47: (iv_ruleAction= ruleAction EOF )
            // InternalAlarm.g:756:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalAlarm.g:762:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:768:2: ( (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalAlarm.g:769:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalAlarm.g:769:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalAlarm.g:770:3: otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlarm.g:778:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalAlarm.g:779:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getValueKeyword_2_0());
                    			
                    // InternalAlarm.g:783:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalAlarm.g:784:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalAlarm.g:784:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalAlarm.g:785:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"alarm.xtext.Alarm.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActuatorKeyword_3());
            		
            // InternalAlarm.g:807:3: ( ( ruleEString ) )
            // InternalAlarm.g:808:4: ( ruleEString )
            {
            // InternalAlarm.g:808:4: ( ruleEString )
            // InternalAlarm.g:809:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_4_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleTransition"
    // InternalAlarm.g:831:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAlarm.g:831:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAlarm.g:832:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalAlarm.g:838:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:844:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalAlarm.g:845:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalAlarm.g:845:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalAlarm.g:846:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalAlarm.g:854:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalAlarm.g:855:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getValueKeyword_2_0());
                    			
                    // InternalAlarm.g:859:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalAlarm.g:860:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalAlarm.g:860:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalAlarm.g:861:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"alarm.xtext.Alarm.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSensorKeyword_3());
            		
            // InternalAlarm.g:883:3: ( ( ruleEString ) )
            // InternalAlarm.g:884:4: ( ruleEString )
            {
            // InternalAlarm.g:884:4: ( ruleEString )
            // InternalAlarm.g:885:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getNextKeyword_5());
            		
            // InternalAlarm.g:903:3: ( ( ruleEString ) )
            // InternalAlarm.g:904:4: ( ruleEString )
            {
            // InternalAlarm.g:904:4: ( ruleEString )
            // InternalAlarm.g:905:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSimpleAlarm"
    // InternalAlarm.g:927:1: entryRuleSimpleAlarm returns [EObject current=null] : iv_ruleSimpleAlarm= ruleSimpleAlarm EOF ;
    public final EObject entryRuleSimpleAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAlarm = null;


        try {
            // InternalAlarm.g:927:52: (iv_ruleSimpleAlarm= ruleSimpleAlarm EOF )
            // InternalAlarm.g:928:2: iv_ruleSimpleAlarm= ruleSimpleAlarm EOF
            {
             newCompositeNode(grammarAccess.getSimpleAlarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleAlarm=ruleSimpleAlarm();

            state._fsp--;

             current =iv_ruleSimpleAlarm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleAlarm"


    // $ANTLR start "ruleSimpleAlarm"
    // InternalAlarm.g:934:1: ruleSimpleAlarm returns [EObject current=null] : (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleSimpleAlarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:940:2: ( (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:941:2: (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:941:2: (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:942:3: otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleAlarmAccess().getSimpleAlarmKeyword_0());
            		
            // InternalAlarm.g:946:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:947:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:947:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:948:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimpleAlarmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:973:3: ( ( ruleEString ) )
            // InternalAlarm.g:974:4: ( ruleEString )
            {
            // InternalAlarm.g:974:4: ( ruleEString )
            // InternalAlarm.g:975:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleAlarmAccess().getLedKeyword_5());
            		
            // InternalAlarm.g:993:3: ( ( ruleEString ) )
            // InternalAlarm.g:994:4: ( ruleEString )
            {
            // InternalAlarm.g:994:4: ( ruleEString )
            // InternalAlarm.g:995:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getLedActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleAlarmAccess().getBuzzerKeyword_7());
            		
            // InternalAlarm.g:1013:3: ( ( ruleEString ) )
            // InternalAlarm.g:1014:4: ( ruleEString )
            {
            // InternalAlarm.g:1014:4: ( ruleEString )
            // InternalAlarm.g:1015:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getBuzzerActuatorCrossReference_8_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getSimpleAlarmAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleAlarm"


    // $ANTLR start "entryRuleDualCheckAlarm"
    // InternalAlarm.g:1037:1: entryRuleDualCheckAlarm returns [EObject current=null] : iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF ;
    public final EObject entryRuleDualCheckAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDualCheckAlarm = null;


        try {
            // InternalAlarm.g:1037:55: (iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF )
            // InternalAlarm.g:1038:2: iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF
            {
             newCompositeNode(grammarAccess.getDualCheckAlarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDualCheckAlarm=ruleDualCheckAlarm();

            state._fsp--;

             current =iv_ruleDualCheckAlarm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDualCheckAlarm"


    // $ANTLR start "ruleDualCheckAlarm"
    // InternalAlarm.g:1044:1: ruleDualCheckAlarm returns [EObject current=null] : (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleDualCheckAlarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:1050:2: ( (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:1051:2: (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:1051:2: (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:1052:3: otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDualCheckAlarmAccess().getDualCheckAlarmKeyword_0());
            		
            // InternalAlarm.g:1056:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:1057:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:1057:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:1058:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDualCheckAlarmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getDualCheckAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getDualCheckAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1083:3: ( ( ruleEString ) )
            // InternalAlarm.g:1084:4: ( ruleEString )
            {
            // InternalAlarm.g:1084:4: ( ruleEString )
            // InternalAlarm.g:1085:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getDualCheckAlarmAccess().getBuzzerKeyword_5());
            		
            // InternalAlarm.g:1103:3: ( ( ruleEString ) )
            // InternalAlarm.g:1104:4: ( ruleEString )
            {
            // InternalAlarm.g:1104:4: ( ruleEString )
            // InternalAlarm.g:1105:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getBuzzerActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getDualCheckAlarmAccess().getButton2Keyword_7());
            		
            // InternalAlarm.g:1123:3: ( ( ruleEString ) )
            // InternalAlarm.g:1124:4: ( ruleEString )
            {
            // InternalAlarm.g:1124:4: ( ruleEString )
            // InternalAlarm.g:1125:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButton2SensorCrossReference_8_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getDualCheckAlarmAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDualCheckAlarm"


    // $ANTLR start "entryRuleStateBasedAlarm"
    // InternalAlarm.g:1147:1: entryRuleStateBasedAlarm returns [EObject current=null] : iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF ;
    public final EObject entryRuleStateBasedAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateBasedAlarm = null;


        try {
            // InternalAlarm.g:1147:56: (iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF )
            // InternalAlarm.g:1148:2: iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF
            {
             newCompositeNode(grammarAccess.getStateBasedAlarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateBasedAlarm=ruleStateBasedAlarm();

            state._fsp--;

             current =iv_ruleStateBasedAlarm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateBasedAlarm"


    // $ANTLR start "ruleStateBasedAlarm"
    // InternalAlarm.g:1154:1: ruleStateBasedAlarm returns [EObject current=null] : (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleStateBasedAlarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:1160:2: ( (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalAlarm.g:1161:2: (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalAlarm.g:1161:2: (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalAlarm.g:1162:3: otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateBasedAlarmAccess().getStateBasedAlarmKeyword_0());
            		
            // InternalAlarm.g:1166:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:1167:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:1167:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:1168:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateBasedAlarmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getStateBasedAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStateBasedAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1193:3: ( ( ruleEString ) )
            // InternalAlarm.g:1194:4: ( ruleEString )
            {
            // InternalAlarm.g:1194:4: ( ruleEString )
            // InternalAlarm.g:1195:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateBasedAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getStateBasedAlarmAccess().getLedKeyword_5());
            		
            // InternalAlarm.g:1213:3: ( ( ruleEString ) )
            // InternalAlarm.g:1214:4: ( ruleEString )
            {
            // InternalAlarm.g:1214:4: ( ruleEString )
            // InternalAlarm.g:1215:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateBasedAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getLedActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateBasedAlarmAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateBasedAlarm"


    // $ANTLR start "entryRuleMultiStateAlarm"
    // InternalAlarm.g:1237:1: entryRuleMultiStateAlarm returns [EObject current=null] : iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF ;
    public final EObject entryRuleMultiStateAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStateAlarm = null;


        try {
            // InternalAlarm.g:1237:56: (iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF )
            // InternalAlarm.g:1238:2: iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF
            {
             newCompositeNode(grammarAccess.getMultiStateAlarmRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiStateAlarm=ruleMultiStateAlarm();

            state._fsp--;

             current =iv_ruleMultiStateAlarm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiStateAlarm"


    // $ANTLR start "ruleMultiStateAlarm"
    // InternalAlarm.g:1244:1: ruleMultiStateAlarm returns [EObject current=null] : (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleMultiStateAlarm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:1250:2: ( (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:1251:2: (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:1251:2: (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:1252:3: otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiStateAlarmAccess().getMultiStateAlarmKeyword_0());
            		
            // InternalAlarm.g:1256:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:1257:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:1257:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:1258:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiStateAlarmRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiStateAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiStateAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1283:3: ( ( ruleEString ) )
            // InternalAlarm.g:1284:4: ( ruleEString )
            {
            // InternalAlarm.g:1284:4: ( ruleEString )
            // InternalAlarm.g:1285:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_29);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiStateAlarmAccess().getBuzzerKeyword_5());
            		
            // InternalAlarm.g:1303:3: ( ( ruleEString ) )
            // InternalAlarm.g:1304:4: ( ruleEString )
            {
            // InternalAlarm.g:1304:4: ( ruleEString )
            // InternalAlarm.g:1305:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getBuzzerActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMultiStateAlarmAccess().getLedKeyword_7());
            		
            // InternalAlarm.g:1323:3: ( ( ruleEString ) )
            // InternalAlarm.g:1324:4: ( ruleEString )
            {
            // InternalAlarm.g:1324:4: ( ruleEString )
            // InternalAlarm.g:1325:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getLedActuatorCrossReference_8_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMultiStateAlarmAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiStateAlarm"


    // $ANTLR start "ruleSIGNAL"
    // InternalAlarm.g:1347:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:1353:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAlarm.g:1354:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAlarm.g:1354:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==40) ) {
                alt14=1;
            }
            else if ( (LA14_0==41) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAlarm.g:1355:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAlarm.g:1355:3: (enumLiteral_0= 'HIGH' )
                    // InternalAlarm.g:1356:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlarm.g:1363:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAlarm.g:1363:3: (enumLiteral_1= 'LOW' )
                    // InternalAlarm.g:1364:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSIGNALAccess().getLOWEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSIGNAL"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000D100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});

}