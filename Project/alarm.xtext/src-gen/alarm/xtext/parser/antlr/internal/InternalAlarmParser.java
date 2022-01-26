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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'App'", "'which'", "'start'", "'with'", "':'", "'bricks'", "','", "';'", "'states'", "'alarm'", "'{'", "'}'", "'on'", "'pin'", "'Sensor'", "'Actuator'", "'State'", "'actions'", "'-'", "'do'", "'='", "'Transition'", "'to'", "'when'", "'SimpleAlarm'", "'button'", "'Led'", "'buzzer'", "'DualCheckAlarm'", "'button2'", "'StateBasedAlarm'", "'MultiStateAlarm'", "'HIGH'", "'LOW'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
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
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalAlarm.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'App' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'which' otherlv_4= 'start' otherlv_5= 'with' ( ( ruleEString ) ) otherlv_7= ':' otherlv_8= 'with' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )* otherlv_14= ';' otherlv_15= 'with' otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )* otherlv_21= ';' (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )? ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_bricks_11_0 = null;

        EObject lv_bricks_13_0 = null;

        EObject lv_states_18_0 = null;

        EObject lv_states_20_0 = null;

        EObject lv_alarm_24_0 = null;

        EObject lv_alarm_26_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:78:2: ( (otherlv_0= 'create' otherlv_1= 'App' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'which' otherlv_4= 'start' otherlv_5= 'with' ( ( ruleEString ) ) otherlv_7= ':' otherlv_8= 'with' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )* otherlv_14= ';' otherlv_15= 'with' otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )* otherlv_21= ';' (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )? ) )
            // InternalAlarm.g:79:2: (otherlv_0= 'create' otherlv_1= 'App' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'which' otherlv_4= 'start' otherlv_5= 'with' ( ( ruleEString ) ) otherlv_7= ':' otherlv_8= 'with' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )* otherlv_14= ';' otherlv_15= 'with' otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )* otherlv_21= ';' (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )? )
            {
            // InternalAlarm.g:79:2: (otherlv_0= 'create' otherlv_1= 'App' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'which' otherlv_4= 'start' otherlv_5= 'with' ( ( ruleEString ) ) otherlv_7= ':' otherlv_8= 'with' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )* otherlv_14= ';' otherlv_15= 'with' otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )* otherlv_21= ';' (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )? )
            // InternalAlarm.g:80:3: otherlv_0= 'create' otherlv_1= 'App' ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'which' otherlv_4= 'start' otherlv_5= 'with' ( ( ruleEString ) ) otherlv_7= ':' otherlv_8= 'with' otherlv_9= 'bricks' otherlv_10= ':' ( (lv_bricks_11_0= ruleBrick ) ) (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )* otherlv_14= ';' otherlv_15= 'with' otherlv_16= 'states' otherlv_17= ':' ( (lv_states_18_0= ruleState ) ) (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )* otherlv_21= ';' (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAppAccess().getAppKeyword_1());
            		
            // InternalAlarm.g:88:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlarm.g:89:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlarm.g:89:4: (lv_name_2_0= ruleEString )
            // InternalAlarm.g:90:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAppAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getWhichKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getStartKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getWithKeyword_5());
            		
            // InternalAlarm.g:119:3: ( ( ruleEString ) )
            // InternalAlarm.g:120:4: ( ruleEString )
            {
            // InternalAlarm.g:120:4: ( ruleEString )
            // InternalAlarm.g:121:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppAccess().getInitialStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAppAccess().getColonKeyword_7());
            		
            otherlv_8=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getAppAccess().getWithKeyword_8());
            		
            otherlv_9=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getAppAccess().getBricksKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getColonKeyword_10());
            		
            // InternalAlarm.g:151:3: ( (lv_bricks_11_0= ruleBrick ) )
            // InternalAlarm.g:152:4: (lv_bricks_11_0= ruleBrick )
            {
            // InternalAlarm.g:152:4: (lv_bricks_11_0= ruleBrick )
            // InternalAlarm.g:153:5: lv_bricks_11_0= ruleBrick
            {

            					newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_bricks_11_0=ruleBrick();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"bricks",
            						lv_bricks_11_0,
            						"alarm.xtext.Alarm.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlarm.g:170:3: (otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlarm.g:171:4: otherlv_12= ',' ( (lv_bricks_13_0= ruleBrick ) )
            	    {
            	    otherlv_12=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_12, grammarAccess.getAppAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalAlarm.g:175:4: ( (lv_bricks_13_0= ruleBrick ) )
            	    // InternalAlarm.g:176:5: (lv_bricks_13_0= ruleBrick )
            	    {
            	    // InternalAlarm.g:176:5: (lv_bricks_13_0= ruleBrick )
            	    // InternalAlarm.g:177:6: lv_bricks_13_0= ruleBrick
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getBricksBrickParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_bricks_13_0=ruleBrick();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"bricks",
            	    							lv_bricks_13_0,
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

            otherlv_14=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getAppAccess().getSemicolonKeyword_13());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getAppAccess().getWithKeyword_14());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_16, grammarAccess.getAppAccess().getStatesKeyword_15());
            		
            otherlv_17=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getAppAccess().getColonKeyword_16());
            		
            // InternalAlarm.g:211:3: ( (lv_states_18_0= ruleState ) )
            // InternalAlarm.g:212:4: (lv_states_18_0= ruleState )
            {
            // InternalAlarm.g:212:4: (lv_states_18_0= ruleState )
            // InternalAlarm.g:213:5: lv_states_18_0= ruleState
            {

            					newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_11);
            lv_states_18_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"states",
            						lv_states_18_0,
            						"alarm.xtext.Alarm.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlarm.g:230:3: (otherlv_19= ',' ( (lv_states_20_0= ruleState ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAlarm.g:231:4: otherlv_19= ',' ( (lv_states_20_0= ruleState ) )
            	    {
            	    otherlv_19=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_19, grammarAccess.getAppAccess().getCommaKeyword_18_0());
            	    			
            	    // InternalAlarm.g:235:4: ( (lv_states_20_0= ruleState ) )
            	    // InternalAlarm.g:236:5: (lv_states_20_0= ruleState )
            	    {
            	    // InternalAlarm.g:236:5: (lv_states_20_0= ruleState )
            	    // InternalAlarm.g:237:6: lv_states_20_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getStatesStateParserRuleCall_18_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_states_20_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_20_0,
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

            otherlv_21=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getAppAccess().getSemicolonKeyword_19());
            		
            // InternalAlarm.g:259:3: (otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlarm.g:260:4: otherlv_22= 'alarm' otherlv_23= '{' ( (lv_alarm_24_0= ruleAlarm ) ) (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )* otherlv_27= '}'
                    {
                    otherlv_22=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_22, grammarAccess.getAppAccess().getAlarmKeyword_20_0());
                    			
                    otherlv_23=(Token)match(input,22,FOLLOW_16); 

                    				newLeafNode(otherlv_23, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_20_1());
                    			
                    // InternalAlarm.g:268:4: ( (lv_alarm_24_0= ruleAlarm ) )
                    // InternalAlarm.g:269:5: (lv_alarm_24_0= ruleAlarm )
                    {
                    // InternalAlarm.g:269:5: (lv_alarm_24_0= ruleAlarm )
                    // InternalAlarm.g:270:6: lv_alarm_24_0= ruleAlarm
                    {

                    						newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_20_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_alarm_24_0=ruleAlarm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppRule());
                    						}
                    						add(
                    							current,
                    							"alarm",
                    							lv_alarm_24_0,
                    							"alarm.xtext.Alarm.Alarm");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAlarm.g:287:4: (otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==18) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAlarm.g:288:5: otherlv_25= ',' ( (lv_alarm_26_0= ruleAlarm ) )
                    	    {
                    	    otherlv_25=(Token)match(input,18,FOLLOW_16); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getAppAccess().getCommaKeyword_20_3_0());
                    	    				
                    	    // InternalAlarm.g:292:5: ( (lv_alarm_26_0= ruleAlarm ) )
                    	    // InternalAlarm.g:293:6: (lv_alarm_26_0= ruleAlarm )
                    	    {
                    	    // InternalAlarm.g:293:6: (lv_alarm_26_0= ruleAlarm )
                    	    // InternalAlarm.g:294:7: lv_alarm_26_0= ruleAlarm
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppAccess().getAlarmAlarmParserRuleCall_20_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_alarm_26_0=ruleAlarm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"alarm",
                    	    								lv_alarm_26_0,
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

                    otherlv_27=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_27, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_20_4());
                    			

                    }
                    break;

            }


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
    // InternalAlarm.g:321:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalAlarm.g:321:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalAlarm.g:322:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalAlarm.g:328:1: ruleBrick returns [EObject current=null] : ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_pin_5_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:334:2: ( ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) ) )
            // InternalAlarm.g:335:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )
            {
            // InternalAlarm.g:335:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )
            // InternalAlarm.g:336:3: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= 'on' otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) )
            {
            // InternalAlarm.g:336:3: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==26) ) {
                alt5=1;
            }
            else if ( (LA5_0==27) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlarm.g:337:4: this_Sensor_0= ruleSensor
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    				current = this_Sensor_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalAlarm.g:346:4: this_Actuator_1= ruleActuator
                    {

                    				newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_4);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    				current = this_Actuator_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            // InternalAlarm.g:355:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAlarm.g:356:4: (lv_name_2_0= ruleEString )
            {
            // InternalAlarm.g:356:4: (lv_name_2_0= ruleEString )
            // InternalAlarm.g:357:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_18);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"alarm.xtext.Alarm.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getBrickAccess().getOnKeyword_2());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getBrickAccess().getPinKeyword_3());
            		
            // InternalAlarm.g:382:3: ( (lv_pin_5_0= ruleEInt ) )
            // InternalAlarm.g:383:4: (lv_pin_5_0= ruleEInt )
            {
            // InternalAlarm.g:383:4: (lv_pin_5_0= ruleEInt )
            // InternalAlarm.g:384:5: lv_pin_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getBrickAccess().getPinEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_pin_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBrickRule());
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


    // $ANTLR start "entryRuleSensor"
    // InternalAlarm.g:405:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalAlarm.g:405:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalAlarm.g:406:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalAlarm.g:412:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:418:2: ( ( () otherlv_1= 'Sensor' ) )
            // InternalAlarm.g:419:2: ( () otherlv_1= 'Sensor' )
            {
            // InternalAlarm.g:419:2: ( () otherlv_1= 'Sensor' )
            // InternalAlarm.g:420:3: () otherlv_1= 'Sensor'
            {
            // InternalAlarm.g:420:3: ()
            // InternalAlarm.g:421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		

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
    // InternalAlarm.g:435:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalAlarm.g:435:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalAlarm.g:436:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalAlarm.g:442:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:448:2: ( ( () otherlv_1= 'Actuator' ) )
            // InternalAlarm.g:449:2: ( () otherlv_1= 'Actuator' )
            {
            // InternalAlarm.g:449:2: ( () otherlv_1= 'Actuator' )
            // InternalAlarm.g:450:3: () otherlv_1= 'Actuator'
            {
            // InternalAlarm.g:450:3: ()
            // InternalAlarm.g:451:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		

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


    // $ANTLR start "entryRuleAlarm"
    // InternalAlarm.g:465:1: entryRuleAlarm returns [EObject current=null] : iv_ruleAlarm= ruleAlarm EOF ;
    public final EObject entryRuleAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlarm = null;


        try {
            // InternalAlarm.g:465:46: (iv_ruleAlarm= ruleAlarm EOF )
            // InternalAlarm.g:466:2: iv_ruleAlarm= ruleAlarm EOF
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
    // InternalAlarm.g:472:1: ruleAlarm returns [EObject current=null] : (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm ) ;
    public final EObject ruleAlarm() throws RecognitionException {
        EObject current = null;

        EObject this_SimpleAlarm_0 = null;

        EObject this_DualCheckAlarm_1 = null;

        EObject this_StateBasedAlarm_2 = null;

        EObject this_MultiStateAlarm_3 = null;



        	enterRule();

        try {
            // InternalAlarm.g:478:2: ( (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm ) )
            // InternalAlarm.g:479:2: (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm )
            {
            // InternalAlarm.g:479:2: (this_SimpleAlarm_0= ruleSimpleAlarm | this_DualCheckAlarm_1= ruleDualCheckAlarm | this_StateBasedAlarm_2= ruleStateBasedAlarm | this_MultiStateAlarm_3= ruleMultiStateAlarm )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 40:
                {
                alt6=2;
                }
                break;
            case 42:
                {
                alt6=3;
                }
                break;
            case 43:
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
                    // InternalAlarm.g:480:3: this_SimpleAlarm_0= ruleSimpleAlarm
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
                    // InternalAlarm.g:489:3: this_DualCheckAlarm_1= ruleDualCheckAlarm
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
                    // InternalAlarm.g:498:3: this_StateBasedAlarm_2= ruleStateBasedAlarm
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
                    // InternalAlarm.g:507:3: this_MultiStateAlarm_3= ruleMultiStateAlarm
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
    // InternalAlarm.g:519:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAlarm.g:519:47: (iv_ruleEString= ruleEString EOF )
            // InternalAlarm.g:520:2: iv_ruleEString= ruleEString EOF
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
    // InternalAlarm.g:526:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:532:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAlarm.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAlarm.g:533:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAlarm.g:534:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAlarm.g:542:3: this_ID_1= RULE_ID
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
    // InternalAlarm.g:553:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAlarm.g:553:46: (iv_ruleState= ruleState EOF )
            // InternalAlarm.g:554:2: iv_ruleState= ruleState EOF
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
    // InternalAlarm.g:560:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with' otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ';' ( (lv_transition_9_0= ruleTransition ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_actions_5_0 = null;

        EObject lv_actions_7_0 = null;

        EObject lv_transition_9_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:566:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with' otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ';' ( (lv_transition_9_0= ruleTransition ) ) ) )
            // InternalAlarm.g:567:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with' otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ';' ( (lv_transition_9_0= ruleTransition ) ) )
            {
            // InternalAlarm.g:567:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with' otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ';' ( (lv_transition_9_0= ruleTransition ) ) )
            // InternalAlarm.g:568:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'with' otherlv_3= 'actions' otherlv_4= ':' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= ';' ( (lv_transition_9_0= ruleTransition ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalAlarm.g:572:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:573:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:573:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:574:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_2=(Token)match(input,15,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getColonKeyword_4());
            		
            // InternalAlarm.g:603:3: ( (lv_actions_5_0= ruleAction ) )
            // InternalAlarm.g:604:4: (lv_actions_5_0= ruleAction )
            {
            // InternalAlarm.g:604:4: (lv_actions_5_0= ruleAction )
            // InternalAlarm.g:605:5: lv_actions_5_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalAlarm.g:622:3: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAlarm.g:623:4: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
            	    {
            	    otherlv_6=(Token)match(input,18,FOLLOW_22); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalAlarm.g:627:4: ( (lv_actions_7_0= ruleAction ) )
            	    // InternalAlarm.g:628:5: (lv_actions_7_0= ruleAction )
            	    {
            	    // InternalAlarm.g:628:5: (lv_actions_7_0= ruleAction )
            	    // InternalAlarm.g:629:6: lv_actions_7_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getStateAccess().getActionsActionParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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

            otherlv_8=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getSemicolonKeyword_7());
            		
            // InternalAlarm.g:651:3: ( (lv_transition_9_0= ruleTransition ) )
            // InternalAlarm.g:652:4: (lv_transition_9_0= ruleTransition )
            {
            // InternalAlarm.g:652:4: (lv_transition_9_0= ruleTransition )
            // InternalAlarm.g:653:5: lv_transition_9_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_transition_9_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_9_0,
            						"alarm.xtext.Alarm.Transition");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAlarm.g:674:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalAlarm.g:674:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalAlarm.g:675:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalAlarm.g:681:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:687:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalAlarm.g:688:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalAlarm.g:688:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalAlarm.g:689:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalAlarm.g:689:3: (kw= '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalAlarm.g:690:4: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_23); 

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


    // $ANTLR start "entryRuleAction"
    // InternalAlarm.g:707:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalAlarm.g:707:47: (iv_ruleAction= ruleAction EOF )
            // InternalAlarm.g:708:2: iv_ruleAction= ruleAction EOF
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
    // InternalAlarm.g:714:1: ruleAction returns [EObject current=null] : (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:720:2: ( (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleSIGNAL ) ) ) )
            // InternalAlarm.g:721:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleSIGNAL ) ) )
            {
            // InternalAlarm.g:721:2: (otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleSIGNAL ) ) )
            // InternalAlarm.g:722:3: otherlv_0= 'do' ( ( ruleEString ) ) otherlv_2= '=' ( (lv_value_3_0= ruleSIGNAL ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getDoKeyword_0());
            		
            // InternalAlarm.g:726:3: ( ( ruleEString ) )
            // InternalAlarm.g:727:4: ( ruleEString )
            {
            // InternalAlarm.g:727:4: ( ruleEString )
            // InternalAlarm.g:728:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_1_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getActionAccess().getEqualsSignKeyword_2());
            		
            // InternalAlarm.g:746:3: ( (lv_value_3_0= ruleSIGNAL ) )
            // InternalAlarm.g:747:4: (lv_value_3_0= ruleSIGNAL )
            {
            // InternalAlarm.g:747:4: (lv_value_3_0= ruleSIGNAL )
            // InternalAlarm.g:748:5: lv_value_3_0= ruleSIGNAL
            {

            					newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalAlarm.g:769:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAlarm.g:769:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAlarm.g:770:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalAlarm.g:776:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'with' otherlv_1= 'Transition' otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'when' ( ( ruleEString ) ) otherlv_6= '=' ( (lv_value_7_0= ruleSIGNAL ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_value_7_0 = null;



        	enterRule();

        try {
            // InternalAlarm.g:782:2: ( (otherlv_0= 'with' otherlv_1= 'Transition' otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'when' ( ( ruleEString ) ) otherlv_6= '=' ( (lv_value_7_0= ruleSIGNAL ) ) ) )
            // InternalAlarm.g:783:2: (otherlv_0= 'with' otherlv_1= 'Transition' otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'when' ( ( ruleEString ) ) otherlv_6= '=' ( (lv_value_7_0= ruleSIGNAL ) ) )
            {
            // InternalAlarm.g:783:2: (otherlv_0= 'with' otherlv_1= 'Transition' otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'when' ( ( ruleEString ) ) otherlv_6= '=' ( (lv_value_7_0= ruleSIGNAL ) ) )
            // InternalAlarm.g:784:3: otherlv_0= 'with' otherlv_1= 'Transition' otherlv_2= 'to' ( ( ruleEString ) ) otherlv_4= 'when' ( ( ruleEString ) ) otherlv_6= '=' ( (lv_value_7_0= ruleSIGNAL ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getWithKeyword_0());
            		
            otherlv_1=(Token)match(input,33,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getToKeyword_2());
            		
            // InternalAlarm.g:796:3: ( ( ruleEString ) )
            // InternalAlarm.g:797:4: ( ruleEString )
            {
            // InternalAlarm.g:797:4: ( ruleEString )
            // InternalAlarm.g:798:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_3_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getWhenKeyword_4());
            		
            // InternalAlarm.g:816:3: ( ( ruleEString ) )
            // InternalAlarm.g:817:4: ( ruleEString )
            {
            // InternalAlarm.g:817:4: ( ruleEString )
            // InternalAlarm.g:818:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_5_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getEqualsSignKeyword_6());
            		
            // InternalAlarm.g:836:3: ( (lv_value_7_0= ruleSIGNAL ) )
            // InternalAlarm.g:837:4: (lv_value_7_0= ruleSIGNAL )
            {
            // InternalAlarm.g:837:4: (lv_value_7_0= ruleSIGNAL )
            // InternalAlarm.g:838:5: lv_value_7_0= ruleSIGNAL
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_7_0=ruleSIGNAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_7_0,
            						"alarm.xtext.Alarm.SIGNAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalAlarm.g:859:1: entryRuleSimpleAlarm returns [EObject current=null] : iv_ruleSimpleAlarm= ruleSimpleAlarm EOF ;
    public final EObject entryRuleSimpleAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleAlarm = null;


        try {
            // InternalAlarm.g:859:52: (iv_ruleSimpleAlarm= ruleSimpleAlarm EOF )
            // InternalAlarm.g:860:2: iv_ruleSimpleAlarm= ruleSimpleAlarm EOF
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
    // InternalAlarm.g:866:1: ruleSimpleAlarm returns [EObject current=null] : (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' ) ;
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
            // InternalAlarm.g:872:2: ( (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:873:2: (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:873:2: (otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:874:3: otherlv_0= 'SimpleAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= 'buzzer' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSimpleAlarmAccess().getSimpleAlarmKeyword_0());
            		
            // InternalAlarm.g:878:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:879:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:879:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:880:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSimpleAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getSimpleAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:905:3: ( ( ruleEString ) )
            // InternalAlarm.g:906:4: ( ruleEString )
            {
            // InternalAlarm.g:906:4: ( ruleEString )
            // InternalAlarm.g:907:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getSimpleAlarmAccess().getLedKeyword_5());
            		
            // InternalAlarm.g:925:3: ( ( ruleEString ) )
            // InternalAlarm.g:926:4: ( ruleEString )
            {
            // InternalAlarm.g:926:4: ( ruleEString )
            // InternalAlarm.g:927:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getLedActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getSimpleAlarmAccess().getBuzzerKeyword_7());
            		
            // InternalAlarm.g:945:3: ( ( ruleEString ) )
            // InternalAlarm.g:946:4: ( ruleEString )
            {
            // InternalAlarm.g:946:4: ( ruleEString )
            // InternalAlarm.g:947:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSimpleAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getSimpleAlarmAccess().getBuzzerActuatorCrossReference_8_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlarm.g:969:1: entryRuleDualCheckAlarm returns [EObject current=null] : iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF ;
    public final EObject entryRuleDualCheckAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDualCheckAlarm = null;


        try {
            // InternalAlarm.g:969:55: (iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF )
            // InternalAlarm.g:970:2: iv_ruleDualCheckAlarm= ruleDualCheckAlarm EOF
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
    // InternalAlarm.g:976:1: ruleDualCheckAlarm returns [EObject current=null] : (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' ) ;
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
            // InternalAlarm.g:982:2: ( (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:983:2: (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:983:2: (otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:984:3: otherlv_0= 'DualCheckAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'button2' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDualCheckAlarmAccess().getDualCheckAlarmKeyword_0());
            		
            // InternalAlarm.g:988:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:989:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:989:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:990:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getDualCheckAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getDualCheckAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1015:3: ( ( ruleEString ) )
            // InternalAlarm.g:1016:4: ( ruleEString )
            {
            // InternalAlarm.g:1016:4: ( ruleEString )
            // InternalAlarm.g:1017:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getDualCheckAlarmAccess().getBuzzerKeyword_5());
            		
            // InternalAlarm.g:1035:3: ( ( ruleEString ) )
            // InternalAlarm.g:1036:4: ( ruleEString )
            {
            // InternalAlarm.g:1036:4: ( ruleEString )
            // InternalAlarm.g:1037:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getBuzzerActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_33);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,41,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getDualCheckAlarmAccess().getButton2Keyword_7());
            		
            // InternalAlarm.g:1055:3: ( ( ruleEString ) )
            // InternalAlarm.g:1056:4: ( ruleEString )
            {
            // InternalAlarm.g:1056:4: ( ruleEString )
            // InternalAlarm.g:1057:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDualCheckAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getDualCheckAlarmAccess().getButton2SensorCrossReference_8_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlarm.g:1079:1: entryRuleStateBasedAlarm returns [EObject current=null] : iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF ;
    public final EObject entryRuleStateBasedAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateBasedAlarm = null;


        try {
            // InternalAlarm.g:1079:56: (iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF )
            // InternalAlarm.g:1080:2: iv_ruleStateBasedAlarm= ruleStateBasedAlarm EOF
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
    // InternalAlarm.g:1086:1: ruleStateBasedAlarm returns [EObject current=null] : (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' ) ;
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
            // InternalAlarm.g:1092:2: ( (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalAlarm.g:1093:2: (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalAlarm.g:1093:2: (otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalAlarm.g:1094:3: otherlv_0= 'StateBasedAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'Led' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateBasedAlarmAccess().getStateBasedAlarmKeyword_0());
            		
            // InternalAlarm.g:1098:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:1099:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:1099:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:1100:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getStateBasedAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStateBasedAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1125:3: ( ( ruleEString ) )
            // InternalAlarm.g:1126:4: ( ruleEString )
            {
            // InternalAlarm.g:1126:4: ( ruleEString )
            // InternalAlarm.g:1127:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateBasedAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getStateBasedAlarmAccess().getLedKeyword_5());
            		
            // InternalAlarm.g:1145:3: ( ( ruleEString ) )
            // InternalAlarm.g:1146:4: ( ruleEString )
            {
            // InternalAlarm.g:1146:4: ( ruleEString )
            // InternalAlarm.g:1147:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateBasedAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStateBasedAlarmAccess().getLedActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlarm.g:1169:1: entryRuleMultiStateAlarm returns [EObject current=null] : iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF ;
    public final EObject entryRuleMultiStateAlarm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStateAlarm = null;


        try {
            // InternalAlarm.g:1169:56: (iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF )
            // InternalAlarm.g:1170:2: iv_ruleMultiStateAlarm= ruleMultiStateAlarm EOF
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
    // InternalAlarm.g:1176:1: ruleMultiStateAlarm returns [EObject current=null] : (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' ) ;
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
            // InternalAlarm.g:1182:2: ( (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalAlarm.g:1183:2: (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalAlarm.g:1183:2: (otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalAlarm.g:1184:3: otherlv_0= 'MultiStateAlarm' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'button' ( ( ruleEString ) ) otherlv_5= 'buzzer' ( ( ruleEString ) ) otherlv_7= 'Led' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMultiStateAlarmAccess().getMultiStateAlarmKeyword_0());
            		
            // InternalAlarm.g:1188:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAlarm.g:1189:4: (lv_name_1_0= ruleEString )
            {
            // InternalAlarm.g:1189:4: (lv_name_1_0= ruleEString )
            // InternalAlarm.g:1190:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
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

            otherlv_2=(Token)match(input,22,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getMultiStateAlarmAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getMultiStateAlarmAccess().getButtonKeyword_3());
            		
            // InternalAlarm.g:1215:3: ( ( ruleEString ) )
            // InternalAlarm.g:1216:4: ( ruleEString )
            {
            // InternalAlarm.g:1216:4: ( ruleEString )
            // InternalAlarm.g:1217:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getButtonSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_31);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,39,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getMultiStateAlarmAccess().getBuzzerKeyword_5());
            		
            // InternalAlarm.g:1235:3: ( ( ruleEString ) )
            // InternalAlarm.g:1236:4: ( ruleEString )
            {
            // InternalAlarm.g:1236:4: ( ruleEString )
            // InternalAlarm.g:1237:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getBuzzerActuatorCrossReference_6_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,38,FOLLOW_4); 

            			newLeafNode(otherlv_7, grammarAccess.getMultiStateAlarmAccess().getLedKeyword_7());
            		
            // InternalAlarm.g:1255:3: ( ( ruleEString ) )
            // InternalAlarm.g:1256:4: ( ruleEString )
            {
            // InternalAlarm.g:1256:4: ( ruleEString )
            // InternalAlarm.g:1257:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiStateAlarmRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMultiStateAlarmAccess().getLedActuatorCrossReference_8_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,23,FOLLOW_2); 

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
    // InternalAlarm.g:1279:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlarm.g:1285:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalAlarm.g:1286:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalAlarm.g:1286:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAlarm.g:1287:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalAlarm.g:1287:3: (enumLiteral_0= 'HIGH' )
                    // InternalAlarm.g:1288:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlarm.g:1295:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalAlarm.g:1295:3: (enumLiteral_1= 'LOW' )
                    // InternalAlarm.g:1296:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000D1000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});

}