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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'states'", "'='", "'['", "']'", "','", "'transitions'", "'start'", "'}'", "'State'", "'Condition'", "'Transition'", "'from'", "'to'", "'condition'"
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
    public static final int T__26=26;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalStateDSL.g:107:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' otherlv_5= '[' ( (lv_states_6_0= ruleAState ) )+ otherlv_7= ']' otherlv_8= ',' otherlv_9= 'transitions' otherlv_10= '=' otherlv_11= '[' ( (lv_transitions_12_0= ruleTransition ) )* otherlv_13= ']' otherlv_14= ',' otherlv_15= 'start' otherlv_16= '=' ( (lv_start_17_0= ruleState ) ) otherlv_18= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_states_6_0 = null;

        EObject lv_transitions_12_0 = null;

        EObject lv_start_17_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:113:2: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' otherlv_5= '[' ( (lv_states_6_0= ruleAState ) )+ otherlv_7= ']' otherlv_8= ',' otherlv_9= 'transitions' otherlv_10= '=' otherlv_11= '[' ( (lv_transitions_12_0= ruleTransition ) )* otherlv_13= ']' otherlv_14= ',' otherlv_15= 'start' otherlv_16= '=' ( (lv_start_17_0= ruleState ) ) otherlv_18= '}' ) )
            // InternalStateDSL.g:114:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' otherlv_5= '[' ( (lv_states_6_0= ruleAState ) )+ otherlv_7= ']' otherlv_8= ',' otherlv_9= 'transitions' otherlv_10= '=' otherlv_11= '[' ( (lv_transitions_12_0= ruleTransition ) )* otherlv_13= ']' otherlv_14= ',' otherlv_15= 'start' otherlv_16= '=' ( (lv_start_17_0= ruleState ) ) otherlv_18= '}' )
            {
            // InternalStateDSL.g:114:2: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' otherlv_5= '[' ( (lv_states_6_0= ruleAState ) )+ otherlv_7= ']' otherlv_8= ',' otherlv_9= 'transitions' otherlv_10= '=' otherlv_11= '[' ( (lv_transitions_12_0= ruleTransition ) )* otherlv_13= ']' otherlv_14= ',' otherlv_15= 'start' otherlv_16= '=' ( (lv_start_17_0= ruleState ) ) otherlv_18= '}' )
            // InternalStateDSL.g:115:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'states' otherlv_4= '=' otherlv_5= '[' ( (lv_states_6_0= ruleAState ) )+ otherlv_7= ']' otherlv_8= ',' otherlv_9= 'transitions' otherlv_10= '=' otherlv_11= '[' ( (lv_transitions_12_0= ruleTransition ) )* otherlv_13= ']' otherlv_14= ',' otherlv_15= 'start' otherlv_16= '=' ( (lv_start_17_0= ruleState ) ) otherlv_18= '}'
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
            		
            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalStateDSL.g:153:3: ( (lv_states_6_0= ruleAState ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==21) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalStateDSL.g:154:4: (lv_states_6_0= ruleAState )
            	    {
            	    // InternalStateDSL.g:154:4: (lv_states_6_0= ruleAState )
            	    // InternalStateDSL.g:155:5: lv_states_6_0= ruleAState
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getStatesAStateParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_states_6_0=ruleAState();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"states",
            	    						lv_states_6_0,
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

            otherlv_7=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getCommaKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getTransitionsKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getEqualsSignKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalStateDSL.g:192:3: ( (lv_transitions_12_0= ruleTransition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==23) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateDSL.g:193:4: (lv_transitions_12_0= ruleTransition )
            	    {
            	    // InternalStateDSL.g:193:4: (lv_transitions_12_0= ruleTransition )
            	    // InternalStateDSL.g:194:5: lv_transitions_12_0= ruleTransition
            	    {

            	    					newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_transitions_12_0=ruleTransition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transitions",
            	    						lv_transitions_12_0,
            	    						"org.xtext.example.statedsl.StateDSL.Transition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getStartKeyword_15());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getEqualsSignKeyword_16());
            		
            // InternalStateDSL.g:227:3: ( (lv_start_17_0= ruleState ) )
            // InternalStateDSL.g:228:4: (lv_start_17_0= ruleState )
            {
            // InternalStateDSL.g:228:4: (lv_start_17_0= ruleState )
            // InternalStateDSL.g:229:5: lv_start_17_0= ruleState
            {

            					newCompositeNode(grammarAccess.getStateMachineAccess().getStartStateParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_16);
            lv_start_17_0=ruleState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateMachineRule());
            					}
            					set(
            						current,
            						"start",
            						lv_start_17_0,
            						"org.xtext.example.statedsl.StateDSL.State");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_18());
            		

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
    // InternalStateDSL.g:254:1: entryRuleAState returns [EObject current=null] : iv_ruleAState= ruleAState EOF ;
    public final EObject entryRuleAState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAState = null;


        try {
            // InternalStateDSL.g:254:47: (iv_ruleAState= ruleAState EOF )
            // InternalStateDSL.g:255:2: iv_ruleAState= ruleAState EOF
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
    // InternalStateDSL.g:261:1: ruleAState returns [EObject current=null] : (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine ) ;
    public final EObject ruleAState() throws RecognitionException {
        EObject current = null;

        EObject this_State_0 = null;

        EObject this_StateMachine_1 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:267:2: ( (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine ) )
            // InternalStateDSL.g:268:2: (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine )
            {
            // InternalStateDSL.g:268:2: (this_State_0= ruleState | this_StateMachine_1= ruleStateMachine )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
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
                    // InternalStateDSL.g:269:3: this_State_0= ruleState
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
                    // InternalStateDSL.g:278:3: this_StateMachine_1= ruleStateMachine
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
    // InternalStateDSL.g:290:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalStateDSL.g:290:46: (iv_ruleState= ruleState EOF )
            // InternalStateDSL.g:291:2: iv_ruleState= ruleState EOF
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
    // InternalStateDSL.g:297:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalStateDSL.g:303:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // InternalStateDSL.g:304:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // InternalStateDSL.g:304:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // InternalStateDSL.g:305:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateDSL.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:311:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_2); 

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
    // InternalStateDSL.g:339:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalStateDSL.g:339:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalStateDSL.g:340:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalStateDSL.g:346:1: ruleCondition returns [EObject current=null] : (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateDSL.g:352:2: ( (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateDSL.g:353:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateDSL.g:353:2: (otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateDSL.g:354:3: otherlv_0= 'Condition' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getConditionKeyword_0());
            		
            // InternalStateDSL.g:358:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:359:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:359:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:360:5: lv_name_1_0= RULE_ID
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
    // InternalStateDSL.g:380:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateDSL.g:380:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateDSL.g:381:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateDSL.g:387:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_from_5_0 = null;

        EObject lv_to_8_0 = null;

        EObject lv_condition_11_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:393:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' ) )
            // InternalStateDSL.g:394:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' )
            {
            // InternalStateDSL.g:394:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' )
            // InternalStateDSL.g:395:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStateDSL.g:399:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:400:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:400:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:401:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignKeyword_4());
            		
            // InternalStateDSL.g:429:3: ( (lv_from_5_0= ruleAState ) )
            // InternalStateDSL.g:430:4: (lv_from_5_0= ruleAState )
            {
            // InternalStateDSL.g:430:4: (lv_from_5_0= ruleAState )
            // InternalStateDSL.g:431:5: lv_from_5_0= ruleAState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getFromAStateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_18);
            lv_from_5_0=ruleAState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"from",
            						lv_from_5_0,
            						"org.xtext.example.statedsl.StateDSL.AState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getToKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getEqualsSignKeyword_7());
            		
            // InternalStateDSL.g:456:3: ( (lv_to_8_0= ruleAState ) )
            // InternalStateDSL.g:457:4: (lv_to_8_0= ruleAState )
            {
            // InternalStateDSL.g:457:4: (lv_to_8_0= ruleAState )
            // InternalStateDSL.g:458:5: lv_to_8_0= ruleAState
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getToAStateParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_19);
            lv_to_8_0=ruleAState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"to",
            						lv_to_8_0,
            						"org.xtext.example.statedsl.StateDSL.AState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getConditionKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getEqualsSignKeyword_10());
            		
            // InternalStateDSL.g:483:3: ( (lv_condition_11_0= ruleCondition ) )
            // InternalStateDSL.g:484:4: (lv_condition_11_0= ruleCondition )
            {
            // InternalStateDSL.g:484:4: (lv_condition_11_0= ruleCondition )
            // InternalStateDSL.g:485:5: lv_condition_11_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_16);
            lv_condition_11_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_11_0,
            						"org.xtext.example.statedsl.StateDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_12());
            		

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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000200800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000210800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});

}