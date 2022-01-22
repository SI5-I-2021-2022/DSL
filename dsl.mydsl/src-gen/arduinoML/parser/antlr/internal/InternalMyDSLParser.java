package arduinoML.parser.antlr.internal;

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
import arduinoML.services.MyDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "'{'", "'initial'", "'bricks'", "','", "'}'", "'states'", "'State'", "'actions'", "'transition'", "'-'", "'Sensor'", "'pin'", "'Actuator'", "'Action'", "'value'", "'actuator'", "'Transition'", "'sensor'", "'next'", "'HIGH'", "'LOW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDSL.g"; }



     	private MyDSLGrammarAccess grammarAccess;

        public InternalMyDSLParser(TokenStream input, MyDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "App";
       	}

       	@Override
       	protected MyDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApp"
    // InternalMyDSL.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalMyDSL.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalMyDSL.g:66:2: iv_ruleApp= ruleApp EOF
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
    // InternalMyDSL.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
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
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_bricks_7_0 = null;

        EObject lv_bricks_9_0 = null;

        EObject lv_states_13_0 = null;

        EObject lv_states_15_0 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:78:2: ( (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // InternalMyDSL.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // InternalMyDSL.g:79:2: (otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // InternalMyDSL.g:80:3: otherlv_0= 'App' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'initial' ( ( ruleEString ) ) otherlv_5= 'bricks' otherlv_6= '{' ( (lv_bricks_7_0= ruleBrick ) ) (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )* otherlv_10= '}' otherlv_11= 'states' otherlv_12= '{' ( (lv_states_13_0= ruleState ) ) (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            // InternalMyDSL.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDSL.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDSL.g:85:4: (lv_name_1_0= ruleEString )
            // InternalMyDSL.g:86:5: lv_name_1_0= ruleEString
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
            						"arduinoML.MyDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getInitialKeyword_3());
            		
            // InternalMyDSL.g:111:3: ( ( ruleEString ) )
            // InternalMyDSL.g:112:4: ( ruleEString )
            {
            // InternalMyDSL.g:112:4: ( ruleEString )
            // InternalMyDSL.g:113:5: ruleEString
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
            		
            // InternalMyDSL.g:135:3: ( (lv_bricks_7_0= ruleBrick ) )
            // InternalMyDSL.g:136:4: (lv_bricks_7_0= ruleBrick )
            {
            // InternalMyDSL.g:136:4: (lv_bricks_7_0= ruleBrick )
            // InternalMyDSL.g:137:5: lv_bricks_7_0= ruleBrick
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
            						"arduinoML.MyDSL.Brick");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDSL.g:154:3: (otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDSL.g:155:4: otherlv_8= ',' ( (lv_bricks_9_0= ruleBrick ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_8, grammarAccess.getAppAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMyDSL.g:159:4: ( (lv_bricks_9_0= ruleBrick ) )
            	    // InternalMyDSL.g:160:5: (lv_bricks_9_0= ruleBrick )
            	    {
            	    // InternalMyDSL.g:160:5: (lv_bricks_9_0= ruleBrick )
            	    // InternalMyDSL.g:161:6: lv_bricks_9_0= ruleBrick
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
            	    							"arduinoML.MyDSL.Brick");
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
            		
            // InternalMyDSL.g:191:3: ( (lv_states_13_0= ruleState ) )
            // InternalMyDSL.g:192:4: (lv_states_13_0= ruleState )
            {
            // InternalMyDSL.g:192:4: (lv_states_13_0= ruleState )
            // InternalMyDSL.g:193:5: lv_states_13_0= ruleState
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
            						"arduinoML.MyDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDSL.g:210:3: (otherlv_14= ',' ( (lv_states_15_0= ruleState ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDSL.g:211:4: otherlv_14= ',' ( (lv_states_15_0= ruleState ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FOLLOW_10); 

            	    				newLeafNode(otherlv_14, grammarAccess.getAppAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalMyDSL.g:215:4: ( (lv_states_15_0= ruleState ) )
            	    // InternalMyDSL.g:216:5: (lv_states_15_0= ruleState )
            	    {
            	    // InternalMyDSL.g:216:5: (lv_states_15_0= ruleState )
            	    // InternalMyDSL.g:217:6: lv_states_15_0= ruleState
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
            	    							"arduinoML.MyDSL.State");
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
            		
            otherlv_17=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalMyDSL.g:247:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // InternalMyDSL.g:247:46: (iv_ruleBrick= ruleBrick EOF )
            // InternalMyDSL.g:248:2: iv_ruleBrick= ruleBrick EOF
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
    // InternalMyDSL.g:254:1: ruleBrick returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalMyDSL.g:260:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalMyDSL.g:261:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalMyDSL.g:261:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==22) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDSL.g:262:3: this_Sensor_0= ruleSensor
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
                    // InternalMyDSL.g:271:3: this_Actuator_1= ruleActuator
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


    // $ANTLR start "entryRuleEString"
    // InternalMyDSL.g:283:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDSL.g:283:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDSL.g:284:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDSL.g:290:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDSL.g:296:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDSL.g:297:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDSL.g:297:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDSL.g:298:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDSL.g:306:3: this_ID_1= RULE_ID
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
    // InternalMyDSL.g:317:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDSL.g:317:46: (iv_ruleState= ruleState EOF )
            // InternalMyDSL.g:318:2: iv_ruleState= ruleState EOF
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
    // InternalMyDSL.g:324:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) ;
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
            // InternalMyDSL.g:330:2: ( (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' ) )
            // InternalMyDSL.g:331:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            {
            // InternalMyDSL.g:331:2: (otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}' )
            // InternalMyDSL.g:332:3: otherlv_0= 'State' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actions' otherlv_4= '{' ( (lv_actions_5_0= ruleAction ) ) (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )* otherlv_8= '}' otherlv_9= 'transition' ( (lv_transition_10_0= ruleTransition ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalMyDSL.g:336:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDSL.g:337:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDSL.g:337:4: (lv_name_1_0= ruleEString )
            // InternalMyDSL.g:338:5: lv_name_1_0= ruleEString
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
            						"arduinoML.MyDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getActionsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMyDSL.g:367:3: ( (lv_actions_5_0= ruleAction ) )
            // InternalMyDSL.g:368:4: (lv_actions_5_0= ruleAction )
            {
            // InternalMyDSL.g:368:4: (lv_actions_5_0= ruleAction )
            // InternalMyDSL.g:369:5: lv_actions_5_0= ruleAction
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
            						"arduinoML.MyDSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDSL.g:386:3: (otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==15) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDSL.g:387:4: otherlv_6= ',' ( (lv_actions_7_0= ruleAction ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_13); 

            	    				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMyDSL.g:391:4: ( (lv_actions_7_0= ruleAction ) )
            	    // InternalMyDSL.g:392:5: (lv_actions_7_0= ruleAction )
            	    {
            	    // InternalMyDSL.g:392:5: (lv_actions_7_0= ruleAction )
            	    // InternalMyDSL.g:393:6: lv_actions_7_0= ruleAction
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
            	    							"arduinoML.MyDSL.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_8, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_9, grammarAccess.getStateAccess().getTransitionKeyword_8());
            		
            // InternalMyDSL.g:419:3: ( (lv_transition_10_0= ruleTransition ) )
            // InternalMyDSL.g:420:4: (lv_transition_10_0= ruleTransition )
            {
            // InternalMyDSL.g:420:4: (lv_transition_10_0= ruleTransition )
            // InternalMyDSL.g:421:5: lv_transition_10_0= ruleTransition
            {

            					newCompositeNode(grammarAccess.getStateAccess().getTransitionTransitionParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_transition_10_0=ruleTransition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"transition",
            						lv_transition_10_0,
            						"arduinoML.MyDSL.Transition");
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
    // InternalMyDSL.g:446:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDSL.g:446:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDSL.g:447:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDSL.g:453:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDSL.g:459:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDSL.g:460:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDSL.g:460:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDSL.g:461:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDSL.g:461:3: (kw= '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDSL.g:462:4: kw= '-'
                    {
                    kw=(Token)match(input,21,FOLLOW_16); 

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
    // InternalMyDSL.g:479:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMyDSL.g:479:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMyDSL.g:480:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalMyDSL.g:486:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
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
            // InternalMyDSL.g:492:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDSL.g:493:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDSL.g:493:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDSL.g:494:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDSL.g:494:3: ()
            // InternalMyDSL.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalMyDSL.g:505:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDSL.g:506:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDSL.g:506:4: (lv_name_2_0= ruleEString )
            // InternalMyDSL.g:507:5: lv_name_2_0= ruleEString
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
            						"arduinoML.MyDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDSL.g:528:3: (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDSL.g:529:4: otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getPinKeyword_4_0());
                    			
                    // InternalMyDSL.g:533:4: ( (lv_pin_5_0= ruleEInt ) )
                    // InternalMyDSL.g:534:5: (lv_pin_5_0= ruleEInt )
                    {
                    // InternalMyDSL.g:534:5: (lv_pin_5_0= ruleEInt )
                    // InternalMyDSL.g:535:6: lv_pin_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_pin_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"pin",
                    							lv_pin_5_0,
                    							"arduinoML.MyDSL.EInt");
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
    // InternalMyDSL.g:561:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalMyDSL.g:561:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalMyDSL.g:562:2: iv_ruleActuator= ruleActuator EOF
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
    // InternalMyDSL.g:568:1: ruleActuator returns [EObject current=null] : ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) ;
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
            // InternalMyDSL.g:574:2: ( ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' ) )
            // InternalMyDSL.g:575:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            {
            // InternalMyDSL.g:575:2: ( () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}' )
            // InternalMyDSL.g:576:3: () otherlv_1= 'Actuator' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )? otherlv_6= '}'
            {
            // InternalMyDSL.g:576:3: ()
            // InternalMyDSL.g:577:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActuatorAccess().getActuatorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActuatorAccess().getActuatorKeyword_1());
            		
            // InternalMyDSL.g:587:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDSL.g:588:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDSL.g:588:4: (lv_name_2_0= ruleEString )
            // InternalMyDSL.g:589:5: lv_name_2_0= ruleEString
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
            						"arduinoML.MyDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDSL.g:610:3: (otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDSL.g:611:4: otherlv_4= 'pin' ( (lv_pin_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getPinKeyword_4_0());
                    			
                    // InternalMyDSL.g:615:4: ( (lv_pin_5_0= ruleEInt ) )
                    // InternalMyDSL.g:616:5: (lv_pin_5_0= ruleEInt )
                    {
                    // InternalMyDSL.g:616:5: (lv_pin_5_0= ruleEInt )
                    // InternalMyDSL.g:617:6: lv_pin_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_pin_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"pin",
                    							lv_pin_5_0,
                    							"arduinoML.MyDSL.EInt");
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
    // InternalMyDSL.g:643:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDSL.g:643:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDSL.g:644:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDSL.g:650:1: ruleAction returns [EObject current=null] : (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) ;
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
            // InternalMyDSL.g:656:2: ( (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDSL.g:657:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDSL.g:657:2: (otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            // InternalMyDSL.g:658:3: otherlv_0= 'Action' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getActionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDSL.g:666:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDSL.g:667:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getValueKeyword_2_0());
                    			
                    // InternalMyDSL.g:671:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalMyDSL.g:672:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalMyDSL.g:672:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalMyDSL.g:673:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"arduinoML.MyDSL.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getActionAccess().getActuatorKeyword_3());
            		
            // InternalMyDSL.g:695:3: ( ( ruleEString ) )
            // InternalMyDSL.g:696:4: ( ruleEString )
            {
            // InternalMyDSL.g:696:4: ( ruleEString )
            // InternalMyDSL.g:697:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getActionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getActionAccess().getActuatorActuatorCrossReference_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalMyDSL.g:719:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDSL.g:719:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDSL.g:720:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalMyDSL.g:726:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' ) ;
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
            // InternalMyDSL.g:732:2: ( (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalMyDSL.g:733:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalMyDSL.g:733:2: (otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalMyDSL.g:734:3: otherlv_0= 'Transition' otherlv_1= '{' (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )? otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= 'next' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDSL.g:742:3: (otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDSL.g:743:4: otherlv_2= 'value' ( (lv_value_3_0= ruleSIGNAL ) )
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getValueKeyword_2_0());
                    			
                    // InternalMyDSL.g:747:4: ( (lv_value_3_0= ruleSIGNAL ) )
                    // InternalMyDSL.g:748:5: (lv_value_3_0= ruleSIGNAL )
                    {
                    // InternalMyDSL.g:748:5: (lv_value_3_0= ruleSIGNAL )
                    // InternalMyDSL.g:749:6: lv_value_3_0= ruleSIGNAL
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getValueSIGNALEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_value_3_0=ruleSIGNAL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"arduinoML.MyDSL.SIGNAL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getSensorKeyword_3());
            		
            // InternalMyDSL.g:771:3: ( ( ruleEString ) )
            // InternalMyDSL.g:772:4: ( ruleEString )
            {
            // InternalMyDSL.g:772:4: ( ruleEString )
            // InternalMyDSL.g:773:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSensorSensorCrossReference_4_0());
            				
            pushFollow(FOLLOW_24);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getNextKeyword_5());
            		
            // InternalMyDSL.g:791:3: ( ( ruleEString ) )
            // InternalMyDSL.g:792:4: ( ruleEString )
            {
            // InternalMyDSL.g:792:4: ( ruleEString )
            // InternalMyDSL.g:793:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getNextStateCrossReference_6_0());
            				
            pushFollow(FOLLOW_11);
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


    // $ANTLR start "ruleSIGNAL"
    // InternalMyDSL.g:815:1: ruleSIGNAL returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) ;
    public final Enumerator ruleSIGNAL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDSL.g:821:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) ) )
            // InternalMyDSL.g:822:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            {
            // InternalMyDSL.g:822:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'LOW' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDSL.g:823:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalMyDSL.g:823:3: (enumLiteral_0= 'HIGH' )
                    // InternalMyDSL.g:824:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSIGNALAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDSL.g:831:3: (enumLiteral_1= 'LOW' )
                    {
                    // InternalMyDSL.g:831:3: (enumLiteral_1= 'LOW' )
                    // InternalMyDSL.g:832:4: enumLiteral_1= 'LOW'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000024000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});

}