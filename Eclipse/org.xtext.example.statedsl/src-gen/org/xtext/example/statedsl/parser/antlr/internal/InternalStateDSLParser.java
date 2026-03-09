package org.xtext.example.statedsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.statedsl.services.StateDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'states'", "'='", "','", "'transitions'", "'start'", "'}'", "'State'", "'condition'", "'transition'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalStateDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateDSL.g"; }



     	private StateDSLGrammarAccess grammarAccess;

        public InternalStateDSLParser(TokenStream input, StateDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Domainmodel";
       	}

       	@Override
       	protected StateDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainmodel"
    // InternalStateDSL.g:64:1: entryRuleDomainmodel returns [EObject current=null] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final EObject entryRuleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainmodel = null;


        try {
            // InternalStateDSL.g:64:52: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // InternalStateDSL.g:65:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             newCompositeNode(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalStateDSL.g:71:1: ruleDomainmodel returns [EObject current=null] : ( (lv_elements_0_0= ruleStateMachine ) )* ;
    public final EObject ruleDomainmodel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:77:2: ( ( (lv_elements_0_0= ruleStateMachine ) )* )
            // InternalStateDSL.g:78:2: ( (lv_elements_0_0= ruleStateMachine ) )*
            {
            // InternalStateDSL.g:78:2: ( (lv_elements_0_0= ruleStateMachine ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateDSL.g:79:3: (lv_elements_0_0= ruleStateMachine )
            	    {
            	    // InternalStateDSL.g:79:3: (lv_elements_0_0= ruleStateMachine )
            	    // InternalStateDSL.g:80:4: lv_elements_0_0= ruleStateMachine
            	    {

            	    				newCompositeNode(grammarAccess.getDomainmodelAccess().getElementsStateMachineParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleStateMachine();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getDomainmodelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"org.xtext.example.statedsl.StateDSL.StateMachine");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleStateMachine"
    // InternalStateDSL.g:100:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // InternalStateDSL.g:100:53: (iv_ruleStateMachine= ruleStateMachine EOF )
            // InternalStateDSL.g:101:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateDSL.g:107:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' ( (lv_states_5_0= ruleAState ) )+ otherlv_6= ',' otherlv_7= 'transitions' otherlv_8= '=' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= ',' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleState ) ) otherlv_14= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_states_5_0 = null;

        EObject lv_transitions_9_0 = null;

        EObject lv_start_13_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:113:2: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' ( (lv_states_5_0= ruleAState ) )+ otherlv_6= ',' otherlv_7= 'transitions' otherlv_8= '=' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= ',' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleState ) ) otherlv_14= '}' ) )
            // InternalStateDSL.g:114:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' ( (lv_states_5_0= ruleAState ) )+ otherlv_6= ',' otherlv_7= 'transitions' otherlv_8= '=' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= ',' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleState ) ) otherlv_14= '}' )
            {
            // InternalStateDSL.g:114:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' ( (lv_states_5_0= ruleAState ) )+ otherlv_6= ',' otherlv_7= 'transitions' otherlv_8= '=' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= ',' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleState ) ) otherlv_14= '}' )
            // InternalStateDSL.g:115:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' ( (lv_states_5_0= ruleAState ) )+ otherlv_6= ',' otherlv_7= 'transitions' otherlv_8= '=' ( (lv_transitions_9_0= ruleTransition ) )* otherlv_10= ',' otherlv_11= 'start' otherlv_12= '=' ( (lv_start_13_0= ruleState ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
            		
            // InternalStateDSL.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateMachineRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getStatesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getEqualsSignKeyword_4());
            		
            // InternalStateDSL.g:149:3: ( (lv_states_5_0= ruleAState ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateDSL.g:150:4: (lv_states_5_0= ruleAState )
            	    {
            	    // InternalStateDSL.g:150:4: (lv_states_5_0= ruleAState )
            	    // InternalStateDSL.g:151:5: lv_states_5_0= ruleAState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesAStateParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_states_5_0=ruleAState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_5_0,
            	    						"org.xtext.example.statedsl.StateDSL.AState");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_6, grammarAccess.getStateMachineAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getTransitionsKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getEqualsSignKeyword_8());
            		
            // InternalStateDSL.g:180:3: ( (lv_transitions_9_0= ruleTransition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateDSL.g:181:4: (lv_transitions_9_0= ruleTransition )
            	    {
            	    // InternalStateDSL.g:181:4: (lv_transitions_9_0= ruleTransition )
            	    // InternalStateDSL.g:182:5: lv_transitions_9_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_transitions_9_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_9_0,
            	    						"org.xtext.example.statedsl.StateDSL.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,17,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getStartKeyword_11());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_13); 

            			newLeafNode(otherlv_12, grammarAccess.getStateMachineAccess().getEqualsSignKeyword_12());
            		
            // InternalStateDSL.g:211:3: ( (lv_start_13_0= ruleState ) )
            // InternalStateDSL.g:212:4: (lv_start_13_0= ruleState )
            {
            // InternalStateDSL.g:212:4: (lv_start_13_0= ruleState )
            // InternalStateDSL.g:213:5: lv_start_13_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getStartStateParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_14);
            lv_start_13_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_13_0,
            						"org.xtext.example.statedsl.StateDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAState"
    // InternalStateDSL.g:238:1: entryRuleAState returns [EObject current=null] : iv_ruleAState= ruleAState EOF ;
    public final EObject entryRuleAState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAState = null;


        try {
            // InternalStateDSL.g:238:47: (iv_ruleAState= ruleAState EOF )
            // InternalStateDSL.g:239:2: iv_ruleAState= ruleAState EOF
            {
             newCompositeNode(grammarAccess.getAStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAState=ruleAState();

            state._fsp--;

             current =iv_ruleAState; 
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
    // $ANTLR end "entryRuleAState"


    // $ANTLR start "ruleAState"
    // InternalStateDSL.g:245:1: ruleAState returns [EObject current=null] : (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine ) ;
    public final EObject ruleAState() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_StateMachine_1 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:251:2: ( (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine ) )
            // InternalStateDSL.g:252:2: (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine )
            {
            // InternalStateDSL.g:252:2: (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==11) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalStateDSL.g:253:3: this_State_0= ruleState
                    {

                    			newCompositeNode(grammarAccess.getAStateAccess().getStateParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_0=ruleState();

                    state._fsp--;


                    			current = this_State_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateDSL.g:262:3: this_StateMachine_1= ruleStateMachine
                    {

                    			newCompositeNode(grammarAccess.getAStateAccess().getStateMachineParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StateMachine_1=ruleStateMachine();

                    state._fsp--;


                    			current = this_StateMachine_1;
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
    // $ANTLR end "ruleAState"


    // $ANTLR start "entryRuleState"
    // InternalStateDSL.g:274:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateDSL.g:274:46: (iv_ruleState= ruleState EOF )
            // InternalStateDSL.g:275:2: iv_ruleState= ruleState EOF
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
    // InternalStateDSL.g:281:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStateDSL.g:287:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStateDSL.g:288:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStateDSL.g:288:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStateDSL.g:289:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateDSL.g:293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:294:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleCondition"
    // InternalStateDSL.g:323:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalStateDSL.g:323:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalStateDSL.g:324:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalStateDSL.g:330:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateDSL.g:336:2: ( (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateDSL.g:337:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateDSL.g:337:2: (otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateDSL.g:338:3: otherlv_0= 'condition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalStateDSL.g:342:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:343:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:343:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:344:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTransition"
    // InternalStateDSL.g:364:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateDSL.g:364:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateDSL.g:365:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateDSL.g:371:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_from_3_0= ruleState ) ) ( (lv_to_4_0= ruleState ) ) ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_from_3_0 = null;

        EObject lv_to_4_0 = null;

        EObject lv_condition_5_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:377:2: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_from_3_0= ruleState ) ) ( (lv_to_4_0= ruleState ) ) ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '}' ) )
            // InternalStateDSL.g:378:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_from_3_0= ruleState ) ) ( (lv_to_4_0= ruleState ) ) ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '}' )
            {
            // InternalStateDSL.g:378:2: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_from_3_0= ruleState ) ) ( (lv_to_4_0= ruleState ) ) ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '}' )
            // InternalStateDSL.g:379:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_from_3_0= ruleState ) ) ( (lv_to_4_0= ruleState ) ) ( (lv_condition_5_0= ruleCondition ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStateDSL.g:383:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:384:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:384:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:385:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalStateDSL.g:405:3: ( (lv_from_3_0= ruleState ) )
            // InternalStateDSL.g:406:4: (lv_from_3_0= ruleState )
            {
            // InternalStateDSL.g:406:4: (lv_from_3_0= ruleState )
            // InternalStateDSL.g:407:5: lv_from_3_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_from_3_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_3_0,
            						"org.xtext.example.statedsl.StateDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateDSL.g:424:3: ( (lv_to_4_0= ruleState ) )
            // InternalStateDSL.g:425:4: (lv_to_4_0= ruleState )
            {
            // InternalStateDSL.g:425:4: (lv_to_4_0= ruleState )
            // InternalStateDSL.g:426:5: lv_to_4_0= ruleState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getToStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_to_4_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_4_0,
            						"org.xtext.example.statedsl.StateDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalStateDSL.g:443:3: ( (lv_condition_5_0= ruleCondition ) )
            // InternalStateDSL.g:444:4: (lv_condition_5_0= ruleCondition )
            {
            // InternalStateDSL.g:444:4: (lv_condition_5_0= ruleCondition )
            // InternalStateDSL.g:445:5: lv_condition_5_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_condition_5_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_5_0,
            						"org.xtext.example.statedsl.StateDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000088800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});

}