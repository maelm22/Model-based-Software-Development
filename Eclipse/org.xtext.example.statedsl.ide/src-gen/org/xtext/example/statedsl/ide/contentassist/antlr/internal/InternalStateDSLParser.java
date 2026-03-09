package org.xtext.example.statedsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.statedsl.services.StateDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateDSLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(StateDSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDomainmodel"
    // InternalStateDSL.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalStateDSL.g:54:1: ( ruleDomainmodel EOF )
            // InternalStateDSL.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalStateDSL.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalStateDSL.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalStateDSL.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalStateDSL.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalStateDSL.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalStateDSL.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRuleStateMachine"
    // InternalStateDSL.g:78:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStateDSL.g:79:1: ( ruleStateMachine EOF )
            // InternalStateDSL.g:80:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateDSL.g:87:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:91:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalStateDSL.g:92:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalStateDSL.g:92:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalStateDSL.g:93:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalStateDSL.g:94:3: ( rule__StateMachine__Group__0 )
            // InternalStateDSL.g:94:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleAState"
    // InternalStateDSL.g:103:1: entryRuleAState : ruleAState EOF ;
    public final void entryRuleAState() throws RecognitionException {
        try {
            // InternalStateDSL.g:104:1: ( ruleAState EOF )
            // InternalStateDSL.g:105:1: ruleAState EOF
            {
             before(grammarAccess.getAStateRule()); 
            pushFollow(FOLLOW_1);
            ruleAState();

            state._fsp--;

             after(grammarAccess.getAStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAState"


    // $ANTLR start "ruleAState"
    // InternalStateDSL.g:112:1: ruleAState : ( ( rule__AState__Alternatives ) ) ;
    public final void ruleAState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:116:2: ( ( ( rule__AState__Alternatives ) ) )
            // InternalStateDSL.g:117:2: ( ( rule__AState__Alternatives ) )
            {
            // InternalStateDSL.g:117:2: ( ( rule__AState__Alternatives ) )
            // InternalStateDSL.g:118:3: ( rule__AState__Alternatives )
            {
             before(grammarAccess.getAStateAccess().getAlternatives()); 
            // InternalStateDSL.g:119:3: ( rule__AState__Alternatives )
            // InternalStateDSL.g:119:4: rule__AState__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AState__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAStateAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAState"


    // $ANTLR start "entryRuleState"
    // InternalStateDSL.g:128:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateDSL.g:129:1: ( ruleState EOF )
            // InternalStateDSL.g:130:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateDSL.g:137:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:141:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateDSL.g:142:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateDSL.g:142:2: ( ( rule__State__Group__0 ) )
            // InternalStateDSL.g:143:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStateDSL.g:144:3: ( rule__State__Group__0 )
            // InternalStateDSL.g:144:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleCondition"
    // InternalStateDSL.g:153:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalStateDSL.g:154:1: ( ruleCondition EOF )
            // InternalStateDSL.g:155:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalStateDSL.g:162:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:166:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalStateDSL.g:167:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalStateDSL.g:167:2: ( ( rule__Condition__Group__0 ) )
            // InternalStateDSL.g:168:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalStateDSL.g:169:3: ( rule__Condition__Group__0 )
            // InternalStateDSL.g:169:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTransition"
    // InternalStateDSL.g:178:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalStateDSL.g:179:1: ( ruleTransition EOF )
            // InternalStateDSL.g:180:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalStateDSL.g:187:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:191:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalStateDSL.g:192:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalStateDSL.g:192:2: ( ( rule__Transition__Group__0 ) )
            // InternalStateDSL.g:193:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalStateDSL.g:194:3: ( rule__Transition__Group__0 )
            // InternalStateDSL.g:194:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__AState__Alternatives"
    // InternalStateDSL.g:202:1: rule__AState__Alternatives : ( ( ruleState ) | ( ruleStateMachine ) );
    public final void rule__AState__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:206:1: ( ( ruleState ) | ( ruleStateMachine ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateDSL.g:207:2: ( ruleState )
                    {
                    // InternalStateDSL.g:207:2: ( ruleState )
                    // InternalStateDSL.g:208:3: ruleState
                    {
                     before(grammarAccess.getAStateAccess().getStateParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getAStateAccess().getStateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateDSL.g:213:2: ( ruleStateMachine )
                    {
                    // InternalStateDSL.g:213:2: ( ruleStateMachine )
                    // InternalStateDSL.g:214:3: ruleStateMachine
                    {
                     before(grammarAccess.getAStateAccess().getStateMachineParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStateMachine();

                    state._fsp--;

                     after(grammarAccess.getAStateAccess().getStateMachineParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AState__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalStateDSL.g:223:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:227:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalStateDSL.g:228:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalStateDSL.g:235:1: rule__StateMachine__Group__0__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:239:1: ( ( 'StateMachine' ) )
            // InternalStateDSL.g:240:1: ( 'StateMachine' )
            {
            // InternalStateDSL.g:240:1: ( 'StateMachine' )
            // InternalStateDSL.g:241:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalStateDSL.g:250:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:254:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalStateDSL.g:255:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalStateDSL.g:262:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:266:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // InternalStateDSL.g:267:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // InternalStateDSL.g:267:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // InternalStateDSL.g:268:2: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // InternalStateDSL.g:269:2: ( rule__StateMachine__NameAssignment_1 )
            // InternalStateDSL.g:269:3: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalStateDSL.g:277:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:281:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalStateDSL.g:282:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalStateDSL.g:289:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:293:1: ( ( '{' ) )
            // InternalStateDSL.g:294:1: ( '{' )
            {
            // InternalStateDSL.g:294:1: ( '{' )
            // InternalStateDSL.g:295:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalStateDSL.g:304:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:308:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalStateDSL.g:309:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalStateDSL.g:316:1: rule__StateMachine__Group__3__Impl : ( 'states' ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:320:1: ( ( 'states' ) )
            // InternalStateDSL.g:321:1: ( 'states' )
            {
            // InternalStateDSL.g:321:1: ( 'states' )
            // InternalStateDSL.g:322:2: 'states'
            {
             before(grammarAccess.getStateMachineAccess().getStatesKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStatesKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalStateDSL.g:331:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:335:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // InternalStateDSL.g:336:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalStateDSL.g:343:1: rule__StateMachine__Group__4__Impl : ( '=' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:347:1: ( ( '=' ) )
            // InternalStateDSL.g:348:1: ( '=' )
            {
            // InternalStateDSL.g:348:1: ( '=' )
            // InternalStateDSL.g:349:2: '='
            {
             before(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // InternalStateDSL.g:358:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:362:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // InternalStateDSL.g:363:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // InternalStateDSL.g:370:1: rule__StateMachine__Group__5__Impl : ( ( ( rule__StateMachine__StatesAssignment_5 ) ) ( ( rule__StateMachine__StatesAssignment_5 )* ) ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:374:1: ( ( ( ( rule__StateMachine__StatesAssignment_5 ) ) ( ( rule__StateMachine__StatesAssignment_5 )* ) ) )
            // InternalStateDSL.g:375:1: ( ( ( rule__StateMachine__StatesAssignment_5 ) ) ( ( rule__StateMachine__StatesAssignment_5 )* ) )
            {
            // InternalStateDSL.g:375:1: ( ( ( rule__StateMachine__StatesAssignment_5 ) ) ( ( rule__StateMachine__StatesAssignment_5 )* ) )
            // InternalStateDSL.g:376:2: ( ( rule__StateMachine__StatesAssignment_5 ) ) ( ( rule__StateMachine__StatesAssignment_5 )* )
            {
            // InternalStateDSL.g:376:2: ( ( rule__StateMachine__StatesAssignment_5 ) )
            // InternalStateDSL.g:377:3: ( rule__StateMachine__StatesAssignment_5 )
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 
            // InternalStateDSL.g:378:3: ( rule__StateMachine__StatesAssignment_5 )
            // InternalStateDSL.g:378:4: rule__StateMachine__StatesAssignment_5
            {
            pushFollow(FOLLOW_10);
            rule__StateMachine__StatesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 

            }

            // InternalStateDSL.g:381:2: ( ( rule__StateMachine__StatesAssignment_5 )* )
            // InternalStateDSL.g:382:3: ( rule__StateMachine__StatesAssignment_5 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 
            // InternalStateDSL.g:383:3: ( rule__StateMachine__StatesAssignment_5 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==11||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateDSL.g:383:4: rule__StateMachine__StatesAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__StateMachine__StatesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // InternalStateDSL.g:392:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:396:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // InternalStateDSL.g:397:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // InternalStateDSL.g:404:1: rule__StateMachine__Group__6__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:408:1: ( ( ',' ) )
            // InternalStateDSL.g:409:1: ( ',' )
            {
            // InternalStateDSL.g:409:1: ( ',' )
            // InternalStateDSL.g:410:2: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group__7"
    // InternalStateDSL.g:419:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:423:1: ( rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 )
            // InternalStateDSL.g:424:2: rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7"


    // $ANTLR start "rule__StateMachine__Group__7__Impl"
    // InternalStateDSL.g:431:1: rule__StateMachine__Group__7__Impl : ( 'transitions' ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:435:1: ( ( 'transitions' ) )
            // InternalStateDSL.g:436:1: ( 'transitions' )
            {
            // InternalStateDSL.g:436:1: ( 'transitions' )
            // InternalStateDSL.g:437:2: 'transitions'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7__Impl"


    // $ANTLR start "rule__StateMachine__Group__8"
    // InternalStateDSL.g:446:1: rule__StateMachine__Group__8 : rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 ;
    public final void rule__StateMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:450:1: ( rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 )
            // InternalStateDSL.g:451:2: rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__StateMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8"


    // $ANTLR start "rule__StateMachine__Group__8__Impl"
    // InternalStateDSL.g:458:1: rule__StateMachine__Group__8__Impl : ( '=' ) ;
    public final void rule__StateMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:462:1: ( ( '=' ) )
            // InternalStateDSL.g:463:1: ( '=' )
            {
            // InternalStateDSL.g:463:1: ( '=' )
            // InternalStateDSL.g:464:2: '='
            {
             before(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_8()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8__Impl"


    // $ANTLR start "rule__StateMachine__Group__9"
    // InternalStateDSL.g:473:1: rule__StateMachine__Group__9 : rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 ;
    public final void rule__StateMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:477:1: ( rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 )
            // InternalStateDSL.g:478:2: rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__StateMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9"


    // $ANTLR start "rule__StateMachine__Group__9__Impl"
    // InternalStateDSL.g:485:1: rule__StateMachine__Group__9__Impl : ( ( rule__StateMachine__TransitionsAssignment_9 )* ) ;
    public final void rule__StateMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:489:1: ( ( ( rule__StateMachine__TransitionsAssignment_9 )* ) )
            // InternalStateDSL.g:490:1: ( ( rule__StateMachine__TransitionsAssignment_9 )* )
            {
            // InternalStateDSL.g:490:1: ( ( rule__StateMachine__TransitionsAssignment_9 )* )
            // InternalStateDSL.g:491:2: ( rule__StateMachine__TransitionsAssignment_9 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_9()); 
            // InternalStateDSL.g:492:2: ( rule__StateMachine__TransitionsAssignment_9 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateDSL.g:492:3: rule__StateMachine__TransitionsAssignment_9
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__StateMachine__TransitionsAssignment_9();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9__Impl"


    // $ANTLR start "rule__StateMachine__Group__10"
    // InternalStateDSL.g:500:1: rule__StateMachine__Group__10 : rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 ;
    public final void rule__StateMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:504:1: ( rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11 )
            // InternalStateDSL.g:505:2: rule__StateMachine__Group__10__Impl rule__StateMachine__Group__11
            {
            pushFollow(FOLLOW_14);
            rule__StateMachine__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10"


    // $ANTLR start "rule__StateMachine__Group__10__Impl"
    // InternalStateDSL.g:512:1: rule__StateMachine__Group__10__Impl : ( ',' ) ;
    public final void rule__StateMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:516:1: ( ( ',' ) )
            // InternalStateDSL.g:517:1: ( ',' )
            {
            // InternalStateDSL.g:517:1: ( ',' )
            // InternalStateDSL.g:518:2: ','
            {
             before(grammarAccess.getStateMachineAccess().getCommaKeyword_10()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getCommaKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10__Impl"


    // $ANTLR start "rule__StateMachine__Group__11"
    // InternalStateDSL.g:527:1: rule__StateMachine__Group__11 : rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 ;
    public final void rule__StateMachine__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:531:1: ( rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12 )
            // InternalStateDSL.g:532:2: rule__StateMachine__Group__11__Impl rule__StateMachine__Group__12
            {
            pushFollow(FOLLOW_7);
            rule__StateMachine__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__11"


    // $ANTLR start "rule__StateMachine__Group__11__Impl"
    // InternalStateDSL.g:539:1: rule__StateMachine__Group__11__Impl : ( 'start' ) ;
    public final void rule__StateMachine__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:543:1: ( ( 'start' ) )
            // InternalStateDSL.g:544:1: ( 'start' )
            {
            // InternalStateDSL.g:544:1: ( 'start' )
            // InternalStateDSL.g:545:2: 'start'
            {
             before(grammarAccess.getStateMachineAccess().getStartKeyword_11()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStartKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__11__Impl"


    // $ANTLR start "rule__StateMachine__Group__12"
    // InternalStateDSL.g:554:1: rule__StateMachine__Group__12 : rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 ;
    public final void rule__StateMachine__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:558:1: ( rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13 )
            // InternalStateDSL.g:559:2: rule__StateMachine__Group__12__Impl rule__StateMachine__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__StateMachine__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__12"


    // $ANTLR start "rule__StateMachine__Group__12__Impl"
    // InternalStateDSL.g:566:1: rule__StateMachine__Group__12__Impl : ( '=' ) ;
    public final void rule__StateMachine__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:570:1: ( ( '=' ) )
            // InternalStateDSL.g:571:1: ( '=' )
            {
            // InternalStateDSL.g:571:1: ( '=' )
            // InternalStateDSL.g:572:2: '='
            {
             before(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_12()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getEqualsSignKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__12__Impl"


    // $ANTLR start "rule__StateMachine__Group__13"
    // InternalStateDSL.g:581:1: rule__StateMachine__Group__13 : rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14 ;
    public final void rule__StateMachine__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:585:1: ( rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14 )
            // InternalStateDSL.g:586:2: rule__StateMachine__Group__13__Impl rule__StateMachine__Group__14
            {
            pushFollow(FOLLOW_16);
            rule__StateMachine__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__13"


    // $ANTLR start "rule__StateMachine__Group__13__Impl"
    // InternalStateDSL.g:593:1: rule__StateMachine__Group__13__Impl : ( ( rule__StateMachine__StartAssignment_13 ) ) ;
    public final void rule__StateMachine__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:597:1: ( ( ( rule__StateMachine__StartAssignment_13 ) ) )
            // InternalStateDSL.g:598:1: ( ( rule__StateMachine__StartAssignment_13 ) )
            {
            // InternalStateDSL.g:598:1: ( ( rule__StateMachine__StartAssignment_13 ) )
            // InternalStateDSL.g:599:2: ( rule__StateMachine__StartAssignment_13 )
            {
             before(grammarAccess.getStateMachineAccess().getStartAssignment_13()); 
            // InternalStateDSL.g:600:2: ( rule__StateMachine__StartAssignment_13 )
            // InternalStateDSL.g:600:3: rule__StateMachine__StartAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__StartAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getStartAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__13__Impl"


    // $ANTLR start "rule__StateMachine__Group__14"
    // InternalStateDSL.g:608:1: rule__StateMachine__Group__14 : rule__StateMachine__Group__14__Impl ;
    public final void rule__StateMachine__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:612:1: ( rule__StateMachine__Group__14__Impl )
            // InternalStateDSL.g:613:2: rule__StateMachine__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__14"


    // $ANTLR start "rule__StateMachine__Group__14__Impl"
    // InternalStateDSL.g:619:1: rule__StateMachine__Group__14__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:623:1: ( ( '}' ) )
            // InternalStateDSL.g:624:1: ( '}' )
            {
            // InternalStateDSL.g:624:1: ( '}' )
            // InternalStateDSL.g:625:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_14()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__14__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalStateDSL.g:635:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:639:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateDSL.g:640:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStateDSL.g:647:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:651:1: ( ( 'State' ) )
            // InternalStateDSL.g:652:1: ( 'State' )
            {
            // InternalStateDSL.g:652:1: ( 'State' )
            // InternalStateDSL.g:653:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStateDSL.g:662:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:666:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalStateDSL.g:667:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStateDSL.g:674:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:678:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStateDSL.g:679:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStateDSL.g:679:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStateDSL.g:680:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalStateDSL.g:681:2: ( rule__State__NameAssignment_1 )
            // InternalStateDSL.g:681:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalStateDSL.g:689:1: rule__State__Group__2 : rule__State__Group__2__Impl rule__State__Group__3 ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:693:1: ( rule__State__Group__2__Impl rule__State__Group__3 )
            // InternalStateDSL.g:694:2: rule__State__Group__2__Impl rule__State__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__State__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalStateDSL.g:701:1: rule__State__Group__2__Impl : ( '{' ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:705:1: ( ( '{' ) )
            // InternalStateDSL.g:706:1: ( '{' )
            {
            // InternalStateDSL.g:706:1: ( '{' )
            // InternalStateDSL.g:707:2: '{'
            {
             before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__State__Group__3"
    // InternalStateDSL.g:716:1: rule__State__Group__3 : rule__State__Group__3__Impl ;
    public final void rule__State__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:720:1: ( rule__State__Group__3__Impl )
            // InternalStateDSL.g:721:2: rule__State__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3"


    // $ANTLR start "rule__State__Group__3__Impl"
    // InternalStateDSL.g:727:1: rule__State__Group__3__Impl : ( '}' ) ;
    public final void rule__State__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:731:1: ( ( '}' ) )
            // InternalStateDSL.g:732:1: ( '}' )
            {
            // InternalStateDSL.g:732:1: ( '}' )
            // InternalStateDSL.g:733:2: '}'
            {
             before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__3__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalStateDSL.g:743:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:747:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalStateDSL.g:748:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalStateDSL.g:755:1: rule__Condition__Group__0__Impl : ( 'condition' ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:759:1: ( ( 'condition' ) )
            // InternalStateDSL.g:760:1: ( 'condition' )
            {
            // InternalStateDSL.g:760:1: ( 'condition' )
            // InternalStateDSL.g:761:2: 'condition'
            {
             before(grammarAccess.getConditionAccess().getConditionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getConditionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalStateDSL.g:770:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:774:1: ( rule__Condition__Group__1__Impl )
            // InternalStateDSL.g:775:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalStateDSL.g:781:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__NameAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:785:1: ( ( ( rule__Condition__NameAssignment_1 ) ) )
            // InternalStateDSL.g:786:1: ( ( rule__Condition__NameAssignment_1 ) )
            {
            // InternalStateDSL.g:786:1: ( ( rule__Condition__NameAssignment_1 ) )
            // InternalStateDSL.g:787:2: ( rule__Condition__NameAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getNameAssignment_1()); 
            // InternalStateDSL.g:788:2: ( rule__Condition__NameAssignment_1 )
            // InternalStateDSL.g:788:3: rule__Condition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalStateDSL.g:797:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:801:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalStateDSL.g:802:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalStateDSL.g:809:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:813:1: ( ( 'transition' ) )
            // InternalStateDSL.g:814:1: ( 'transition' )
            {
            // InternalStateDSL.g:814:1: ( 'transition' )
            // InternalStateDSL.g:815:2: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalStateDSL.g:824:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:828:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalStateDSL.g:829:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalStateDSL.g:836:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:840:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // InternalStateDSL.g:841:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // InternalStateDSL.g:841:1: ( ( rule__Transition__NameAssignment_1 ) )
            // InternalStateDSL.g:842:2: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // InternalStateDSL.g:843:2: ( rule__Transition__NameAssignment_1 )
            // InternalStateDSL.g:843:3: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalStateDSL.g:851:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:855:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalStateDSL.g:856:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalStateDSL.g:863:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:867:1: ( ( '{' ) )
            // InternalStateDSL.g:868:1: ( '{' )
            {
            // InternalStateDSL.g:868:1: ( '{' )
            // InternalStateDSL.g:869:2: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalStateDSL.g:878:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:882:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalStateDSL.g:883:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalStateDSL.g:890:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__FromAssignment_3 ) ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:894:1: ( ( ( rule__Transition__FromAssignment_3 ) ) )
            // InternalStateDSL.g:895:1: ( ( rule__Transition__FromAssignment_3 ) )
            {
            // InternalStateDSL.g:895:1: ( ( rule__Transition__FromAssignment_3 ) )
            // InternalStateDSL.g:896:2: ( rule__Transition__FromAssignment_3 )
            {
             before(grammarAccess.getTransitionAccess().getFromAssignment_3()); 
            // InternalStateDSL.g:897:2: ( rule__Transition__FromAssignment_3 )
            // InternalStateDSL.g:897:3: rule__Transition__FromAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Transition__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalStateDSL.g:905:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:909:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalStateDSL.g:910:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalStateDSL.g:917:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__ToAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:921:1: ( ( ( rule__Transition__ToAssignment_4 ) ) )
            // InternalStateDSL.g:922:1: ( ( rule__Transition__ToAssignment_4 ) )
            {
            // InternalStateDSL.g:922:1: ( ( rule__Transition__ToAssignment_4 ) )
            // InternalStateDSL.g:923:2: ( rule__Transition__ToAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getToAssignment_4()); 
            // InternalStateDSL.g:924:2: ( rule__Transition__ToAssignment_4 )
            // InternalStateDSL.g:924:3: rule__Transition__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalStateDSL.g:932:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:936:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalStateDSL.g:937:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalStateDSL.g:944:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__ConditionAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:948:1: ( ( ( rule__Transition__ConditionAssignment_5 ) ) )
            // InternalStateDSL.g:949:1: ( ( rule__Transition__ConditionAssignment_5 ) )
            {
            // InternalStateDSL.g:949:1: ( ( rule__Transition__ConditionAssignment_5 ) )
            // InternalStateDSL.g:950:2: ( rule__Transition__ConditionAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getConditionAssignment_5()); 
            // InternalStateDSL.g:951:2: ( rule__Transition__ConditionAssignment_5 )
            // InternalStateDSL.g:951:3: rule__Transition__ConditionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ConditionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getConditionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalStateDSL.g:959:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:963:1: ( rule__Transition__Group__6__Impl )
            // InternalStateDSL.g:964:2: rule__Transition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalStateDSL.g:970:1: rule__Transition__Group__6__Impl : ( '}' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:974:1: ( ( '}' ) )
            // InternalStateDSL.g:975:1: ( '}' )
            {
            // InternalStateDSL.g:975:1: ( '}' )
            // InternalStateDSL.g:976:2: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalStateDSL.g:986:1: rule__Domainmodel__ElementsAssignment : ( ruleStateMachine ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:990:1: ( ( ruleStateMachine ) )
            // InternalStateDSL.g:991:2: ( ruleStateMachine )
            {
            // InternalStateDSL.g:991:2: ( ruleStateMachine )
            // InternalStateDSL.g:992:3: ruleStateMachine
            {
             before(grammarAccess.getDomainmodelAccess().getElementsStateMachineParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsStateMachineParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // InternalStateDSL.g:1001:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1005:1: ( ( RULE_ID ) )
            // InternalStateDSL.g:1006:2: ( RULE_ID )
            {
            // InternalStateDSL.g:1006:2: ( RULE_ID )
            // InternalStateDSL.g:1007:3: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__StatesAssignment_5"
    // InternalStateDSL.g:1016:1: rule__StateMachine__StatesAssignment_5 : ( ruleAState ) ;
    public final void rule__StateMachine__StatesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1020:1: ( ( ruleAState ) )
            // InternalStateDSL.g:1021:2: ( ruleAState )
            {
            // InternalStateDSL.g:1021:2: ( ruleAState )
            // InternalStateDSL.g:1022:3: ruleAState
            {
             before(grammarAccess.getStateMachineAccess().getStatesAStateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesAStateParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_5"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_9"
    // InternalStateDSL.g:1031:1: rule__StateMachine__TransitionsAssignment_9 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1035:1: ( ( ruleTransition ) )
            // InternalStateDSL.g:1036:2: ( ruleTransition )
            {
            // InternalStateDSL.g:1036:2: ( ruleTransition )
            // InternalStateDSL.g:1037:3: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_9"


    // $ANTLR start "rule__StateMachine__StartAssignment_13"
    // InternalStateDSL.g:1046:1: rule__StateMachine__StartAssignment_13 : ( ruleState ) ;
    public final void rule__StateMachine__StartAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1050:1: ( ( ruleState ) )
            // InternalStateDSL.g:1051:2: ( ruleState )
            {
            // InternalStateDSL.g:1051:2: ( ruleState )
            // InternalStateDSL.g:1052:3: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStartStateParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStartStateParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StartAssignment_13"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStateDSL.g:1061:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1065:1: ( ( RULE_ID ) )
            // InternalStateDSL.g:1066:2: ( RULE_ID )
            {
            // InternalStateDSL.g:1066:2: ( RULE_ID )
            // InternalStateDSL.g:1067:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__Condition__NameAssignment_1"
    // InternalStateDSL.g:1076:1: rule__Condition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Condition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1080:1: ( ( RULE_ID ) )
            // InternalStateDSL.g:1081:2: ( RULE_ID )
            {
            // InternalStateDSL.g:1081:2: ( RULE_ID )
            // InternalStateDSL.g:1082:3: RULE_ID
            {
             before(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__NameAssignment_1"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // InternalStateDSL.g:1091:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1095:1: ( ( RULE_ID ) )
            // InternalStateDSL.g:1096:2: ( RULE_ID )
            {
            // InternalStateDSL.g:1096:2: ( RULE_ID )
            // InternalStateDSL.g:1097:3: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__FromAssignment_3"
    // InternalStateDSL.g:1106:1: rule__Transition__FromAssignment_3 : ( ruleState ) ;
    public final void rule__Transition__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1110:1: ( ( ruleState ) )
            // InternalStateDSL.g:1111:2: ( ruleState )
            {
            // InternalStateDSL.g:1111:2: ( ruleState )
            // InternalStateDSL.g:1112:3: ruleState
            {
             before(grammarAccess.getTransitionAccess().getFromStateParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getFromStateParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__FromAssignment_3"


    // $ANTLR start "rule__Transition__ToAssignment_4"
    // InternalStateDSL.g:1121:1: rule__Transition__ToAssignment_4 : ( ruleState ) ;
    public final void rule__Transition__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1125:1: ( ( ruleState ) )
            // InternalStateDSL.g:1126:2: ( ruleState )
            {
            // InternalStateDSL.g:1126:2: ( ruleState )
            // InternalStateDSL.g:1127:3: ruleState
            {
             before(grammarAccess.getTransitionAccess().getToStateParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getToStateParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ToAssignment_4"


    // $ANTLR start "rule__Transition__ConditionAssignment_5"
    // InternalStateDSL.g:1136:1: rule__Transition__ConditionAssignment_5 : ( ruleCondition ) ;
    public final void rule__Transition__ConditionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateDSL.g:1140:1: ( ( ruleCondition ) )
            // InternalStateDSL.g:1141:2: ( ruleCondition )
            {
            // InternalStateDSL.g:1141:2: ( ruleCondition )
            // InternalStateDSL.g:1142:3: ruleCondition
            {
             before(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getConditionConditionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ConditionAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000100000L});

}