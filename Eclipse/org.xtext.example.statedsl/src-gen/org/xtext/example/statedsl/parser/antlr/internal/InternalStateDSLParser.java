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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'StateMachine'", "'{'", "'states'", "'='", "'['", "']'", "','", "'transitions'", "'start'", "'}'", "'State'", "'Transition'", "'from'", "'to'", "'condition'", "'OR'", "'AND'", "'('", "')'"
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
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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

                if ( (LA3_0==22) ) {
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
    // InternalStateDSL.g:297:1: ruleState returns [EObject current=null] : (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalStateDSL.g:303:2: ( (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalStateDSL.g:304:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalStateDSL.g:304:2: (otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalStateDSL.g:305:3: otherlv_0= 'State' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalStateDSL.g:309:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:310:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:310:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:311:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

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


    // $ANTLR start "entryRuleTransition"
    // InternalStateDSL.g:331:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalStateDSL.g:331:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalStateDSL.g:332:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalStateDSL.g:338:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' ) ;
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
            // InternalStateDSL.g:344:2: ( (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' ) )
            // InternalStateDSL.g:345:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' )
            {
            // InternalStateDSL.g:345:2: (otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}' )
            // InternalStateDSL.g:346:3: otherlv_0= 'Transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'from' otherlv_4= '=' ( (lv_from_5_0= ruleAState ) ) otherlv_6= 'to' otherlv_7= '=' ( (lv_to_8_0= ruleAState ) ) otherlv_9= 'condition' otherlv_10= '=' ( (lv_condition_11_0= ruleCondition ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalStateDSL.g:350:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalStateDSL.g:351:4: (lv_name_1_0= RULE_ID )
            {
            // InternalStateDSL.g:351:4: (lv_name_1_0= RULE_ID )
            // InternalStateDSL.g:352:5: lv_name_1_0= RULE_ID
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
            		
            otherlv_3=(Token)match(input,23,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getFromKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getEqualsSignKeyword_4());
            		
            // InternalStateDSL.g:380:3: ( (lv_from_5_0= ruleAState ) )
            // InternalStateDSL.g:381:4: (lv_from_5_0= ruleAState )
            {
            // InternalStateDSL.g:381:4: (lv_from_5_0= ruleAState )
            // InternalStateDSL.g:382:5: lv_from_5_0= ruleAState
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

            otherlv_6=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getToKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getEqualsSignKeyword_7());
            		
            // InternalStateDSL.g:407:3: ( (lv_to_8_0= ruleAState ) )
            // InternalStateDSL.g:408:4: (lv_to_8_0= ruleAState )
            {
            // InternalStateDSL.g:408:4: (lv_to_8_0= ruleAState )
            // InternalStateDSL.g:409:5: lv_to_8_0= ruleAState
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

            otherlv_9=(Token)match(input,25,FOLLOW_7); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getConditionKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getEqualsSignKeyword_10());
            		
            // InternalStateDSL.g:434:3: ( (lv_condition_11_0= ruleCondition ) )
            // InternalStateDSL.g:435:4: (lv_condition_11_0= ruleCondition )
            {
            // InternalStateDSL.g:435:4: (lv_condition_11_0= ruleCondition )
            // InternalStateDSL.g:436:5: lv_condition_11_0= ruleCondition
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


    // $ANTLR start "entryRuleCondition"
    // InternalStateDSL.g:461:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalStateDSL.g:461:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalStateDSL.g:462:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalStateDSL.g:468:1: ruleCondition returns [EObject current=null] : this_OrCondition_0= ruleOrCondition ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_OrCondition_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:474:2: (this_OrCondition_0= ruleOrCondition )
            // InternalStateDSL.g:475:2: this_OrCondition_0= ruleOrCondition
            {

            		newCompositeNode(grammarAccess.getConditionAccess().getOrConditionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_OrCondition_0=ruleOrCondition();

            state._fsp--;


            		current = this_OrCondition_0;
            		afterParserOrEnumRuleCall();
            	

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


    // $ANTLR start "entryRuleOrCondition"
    // InternalStateDSL.g:486:1: entryRuleOrCondition returns [EObject current=null] : iv_ruleOrCondition= ruleOrCondition EOF ;
    public final EObject entryRuleOrCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrCondition = null;


        try {
            // InternalStateDSL.g:486:52: (iv_ruleOrCondition= ruleOrCondition EOF )
            // InternalStateDSL.g:487:2: iv_ruleOrCondition= ruleOrCondition EOF
            {
             newCompositeNode(grammarAccess.getOrConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrCondition=ruleOrCondition();

            state._fsp--;

             current =iv_ruleOrCondition; 
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
    // $ANTLR end "entryRuleOrCondition"


    // $ANTLR start "ruleOrCondition"
    // InternalStateDSL.g:493:1: ruleOrCondition returns [EObject current=null] : (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) ;
    public final EObject ruleOrCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AndCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:499:2: ( (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* ) )
            // InternalStateDSL.g:500:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            {
            // InternalStateDSL.g:500:2: (this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )* )
            // InternalStateDSL.g:501:3: this_AndCondition_0= ruleAndCondition ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrConditionAccess().getAndConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_21);
            this_AndCondition_0=ruleAndCondition();

            state._fsp--;


            			current = this_AndCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateDSL.g:509:3: ( () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==26) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalStateDSL.g:510:4: () otherlv_2= 'OR' ( (lv_right_3_0= ruleAndCondition ) )
            	    {
            	    // InternalStateDSL.g:510:4: ()
            	    // InternalStateDSL.g:511:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrConditionAccess().getOrConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,26,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrConditionAccess().getORKeyword_1_1());
            	    			
            	    // InternalStateDSL.g:521:4: ( (lv_right_3_0= ruleAndCondition ) )
            	    // InternalStateDSL.g:522:5: (lv_right_3_0= ruleAndCondition )
            	    {
            	    // InternalStateDSL.g:522:5: (lv_right_3_0= ruleAndCondition )
            	    // InternalStateDSL.g:523:6: lv_right_3_0= ruleAndCondition
            	    {

            	    						newCompositeNode(grammarAccess.getOrConditionAccess().getRightAndConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_right_3_0=ruleAndCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.statedsl.StateDSL.AndCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "ruleOrCondition"


    // $ANTLR start "entryRuleAndCondition"
    // InternalStateDSL.g:545:1: entryRuleAndCondition returns [EObject current=null] : iv_ruleAndCondition= ruleAndCondition EOF ;
    public final EObject entryRuleAndCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndCondition = null;


        try {
            // InternalStateDSL.g:545:53: (iv_ruleAndCondition= ruleAndCondition EOF )
            // InternalStateDSL.g:546:2: iv_ruleAndCondition= ruleAndCondition EOF
            {
             newCompositeNode(grammarAccess.getAndConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAndCondition=ruleAndCondition();

            state._fsp--;

             current =iv_ruleAndCondition; 
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
    // $ANTLR end "entryRuleAndCondition"


    // $ANTLR start "ruleAndCondition"
    // InternalStateDSL.g:552:1: ruleAndCondition returns [EObject current=null] : (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) ;
    public final EObject ruleAndCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryCondition_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:558:2: ( (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* ) )
            // InternalStateDSL.g:559:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            {
            // InternalStateDSL.g:559:2: (this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )* )
            // InternalStateDSL.g:560:3: this_PrimaryCondition_0= rulePrimaryCondition ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndConditionAccess().getPrimaryConditionParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_PrimaryCondition_0=rulePrimaryCondition();

            state._fsp--;


            			current = this_PrimaryCondition_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalStateDSL.g:568:3: ( () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==27) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalStateDSL.g:569:4: () otherlv_2= 'AND' ( (lv_right_3_0= rulePrimaryCondition ) )
            	    {
            	    // InternalStateDSL.g:569:4: ()
            	    // InternalStateDSL.g:570:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndConditionAccess().getAndConditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_20); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndConditionAccess().getANDKeyword_1_1());
            	    			
            	    // InternalStateDSL.g:580:4: ( (lv_right_3_0= rulePrimaryCondition ) )
            	    // InternalStateDSL.g:581:5: (lv_right_3_0= rulePrimaryCondition )
            	    {
            	    // InternalStateDSL.g:581:5: (lv_right_3_0= rulePrimaryCondition )
            	    // InternalStateDSL.g:582:6: lv_right_3_0= rulePrimaryCondition
            	    {

            	    						newCompositeNode(grammarAccess.getAndConditionAccess().getRightPrimaryConditionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=rulePrimaryCondition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndConditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.statedsl.StateDSL.PrimaryCondition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


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
    // $ANTLR end "ruleAndCondition"


    // $ANTLR start "entryRulePrimaryCondition"
    // InternalStateDSL.g:604:1: entryRulePrimaryCondition returns [EObject current=null] : iv_rulePrimaryCondition= rulePrimaryCondition EOF ;
    public final EObject entryRulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryCondition = null;


        try {
            // InternalStateDSL.g:604:57: (iv_rulePrimaryCondition= rulePrimaryCondition EOF )
            // InternalStateDSL.g:605:2: iv_rulePrimaryCondition= rulePrimaryCondition EOF
            {
             newCompositeNode(grammarAccess.getPrimaryConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryCondition=rulePrimaryCondition();

            state._fsp--;

             current =iv_rulePrimaryCondition; 
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
    // $ANTLR end "entryRulePrimaryCondition"


    // $ANTLR start "rulePrimaryCondition"
    // InternalStateDSL.g:611:1: rulePrimaryCondition returns [EObject current=null] : (this_LiteralCondition_0= ruleLiteralCondition | (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' ) ) ;
    public final EObject rulePrimaryCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_LiteralCondition_0 = null;

        EObject this_Condition_2 = null;



        	enterRule();

        try {
            // InternalStateDSL.g:617:2: ( (this_LiteralCondition_0= ruleLiteralCondition | (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' ) ) )
            // InternalStateDSL.g:618:2: (this_LiteralCondition_0= ruleLiteralCondition | (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' ) )
            {
            // InternalStateDSL.g:618:2: (this_LiteralCondition_0= ruleLiteralCondition | (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateDSL.g:619:3: this_LiteralCondition_0= ruleLiteralCondition
                    {

                    			newCompositeNode(grammarAccess.getPrimaryConditionAccess().getLiteralConditionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LiteralCondition_0=ruleLiteralCondition();

                    state._fsp--;


                    			current = this_LiteralCondition_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalStateDSL.g:628:3: (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' )
                    {
                    // InternalStateDSL.g:628:3: (otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')' )
                    // InternalStateDSL.g:629:4: otherlv_1= '(' this_Condition_2= ruleCondition otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_20); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryConditionAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryConditionAccess().getConditionParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_Condition_2=ruleCondition();

                    state._fsp--;


                    				current = this_Condition_2;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryConditionAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "rulePrimaryCondition"


    // $ANTLR start "entryRuleLiteralCondition"
    // InternalStateDSL.g:650:1: entryRuleLiteralCondition returns [EObject current=null] : iv_ruleLiteralCondition= ruleLiteralCondition EOF ;
    public final EObject entryRuleLiteralCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralCondition = null;


        try {
            // InternalStateDSL.g:650:57: (iv_ruleLiteralCondition= ruleLiteralCondition EOF )
            // InternalStateDSL.g:651:2: iv_ruleLiteralCondition= ruleLiteralCondition EOF
            {
             newCompositeNode(grammarAccess.getLiteralConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteralCondition=ruleLiteralCondition();

            state._fsp--;

             current =iv_ruleLiteralCondition; 
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
    // $ANTLR end "entryRuleLiteralCondition"


    // $ANTLR start "ruleLiteralCondition"
    // InternalStateDSL.g:657:1: ruleLiteralCondition returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleLiteralCondition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalStateDSL.g:663:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalStateDSL.g:664:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalStateDSL.g:664:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalStateDSL.g:665:3: (lv_name_0_0= RULE_ID )
            {
            // InternalStateDSL.g:665:3: (lv_name_0_0= RULE_ID )
            // InternalStateDSL.g:666:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getLiteralConditionAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLiteralConditionRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleLiteralCondition"

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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});

}