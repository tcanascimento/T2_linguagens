package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.T2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2Parser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'/'", "'*'", "'<'", "'>'", "'>='", "'<='", "'='", "'('", "')'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalT2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT2.g"; }


    	private T2GrammarAccess grammarAccess;

    	public void setGrammarAccess(T2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalT2.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalT2.g:54:1: ( ruleModel EOF )
            // InternalT2.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalT2.g:62:1: ruleModel : ( ( rule__Model__VarsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:66:2: ( ( ( rule__Model__VarsAssignment )* ) )
            // InternalT2.g:67:2: ( ( rule__Model__VarsAssignment )* )
            {
            // InternalT2.g:67:2: ( ( rule__Model__VarsAssignment )* )
            // InternalT2.g:68:3: ( rule__Model__VarsAssignment )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment()); 
            // InternalT2.g:69:3: ( rule__Model__VarsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2.g:69:4: rule__Model__VarsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__VarsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOp"
    // InternalT2.g:78:1: entryRuleOp : ruleOp EOF ;
    public final void entryRuleOp() throws RecognitionException {
        try {
            // InternalT2.g:79:1: ( ruleOp EOF )
            // InternalT2.g:80:1: ruleOp EOF
            {
             before(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getOpRule()); 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalT2.g:87:1: ruleOp : ( ( rule__Op__Alternatives ) ) ;
    public final void ruleOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:91:2: ( ( ( rule__Op__Alternatives ) ) )
            // InternalT2.g:92:2: ( ( rule__Op__Alternatives ) )
            {
            // InternalT2.g:92:2: ( ( rule__Op__Alternatives ) )
            // InternalT2.g:93:3: ( rule__Op__Alternatives )
            {
             before(grammarAccess.getOpAccess().getAlternatives()); 
            // InternalT2.g:94:3: ( rule__Op__Alternatives )
            // InternalT2.g:94:4: rule__Op__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Op__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleValue"
    // InternalT2.g:103:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalT2.g:104:1: ( ruleValue EOF )
            // InternalT2.g:105:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalT2.g:112:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:116:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalT2.g:117:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalT2.g:117:2: ( ( rule__Value__Alternatives ) )
            // InternalT2.g:118:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalT2.g:119:3: ( rule__Value__Alternatives )
            // InternalT2.g:119:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVAR"
    // InternalT2.g:128:1: entryRuleVAR : ruleVAR EOF ;
    public final void entryRuleVAR() throws RecognitionException {
        try {
            // InternalT2.g:129:1: ( ruleVAR EOF )
            // InternalT2.g:130:1: ruleVAR EOF
            {
             before(grammarAccess.getVARRule()); 
            pushFollow(FOLLOW_1);
            ruleVAR();

            state._fsp--;

             after(grammarAccess.getVARRule()); 
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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalT2.g:137:1: ruleVAR : ( ruleValue ) ;
    public final void ruleVAR() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:141:2: ( ( ruleValue ) )
            // InternalT2.g:142:2: ( ruleValue )
            {
            // InternalT2.g:142:2: ( ruleValue )
            // InternalT2.g:143:3: ruleValue
            {
             before(grammarAccess.getVARAccess().getValueParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getVARAccess().getValueParserRuleCall()); 

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
    // $ANTLR end "ruleVAR"


    // $ANTLR start "rule__Op__Alternatives"
    // InternalT2.g:152:1: rule__Op__Alternatives : ( ( '-' ) | ( '+' ) | ( '/' ) | ( '*' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( '=' ) );
    public final void rule__Op__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:156:1: ( ( '-' ) | ( '+' ) | ( '/' ) | ( '*' ) | ( '<' ) | ( '>' ) | ( '>=' ) | ( '<=' ) | ( '=' ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalT2.g:157:2: ( '-' )
                    {
                    // InternalT2.g:157:2: ( '-' )
                    // InternalT2.g:158:3: '-'
                    {
                     before(grammarAccess.getOpAccess().getHyphenMinusKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getHyphenMinusKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2.g:163:2: ( '+' )
                    {
                    // InternalT2.g:163:2: ( '+' )
                    // InternalT2.g:164:3: '+'
                    {
                     before(grammarAccess.getOpAccess().getPlusSignKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalT2.g:169:2: ( '/' )
                    {
                    // InternalT2.g:169:2: ( '/' )
                    // InternalT2.g:170:3: '/'
                    {
                     before(grammarAccess.getOpAccess().getSolidusKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getSolidusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalT2.g:175:2: ( '*' )
                    {
                    // InternalT2.g:175:2: ( '*' )
                    // InternalT2.g:176:3: '*'
                    {
                     before(grammarAccess.getOpAccess().getAsteriskKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalT2.g:181:2: ( '<' )
                    {
                    // InternalT2.g:181:2: ( '<' )
                    // InternalT2.g:182:3: '<'
                    {
                     before(grammarAccess.getOpAccess().getLessThanSignKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getLessThanSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalT2.g:187:2: ( '>' )
                    {
                    // InternalT2.g:187:2: ( '>' )
                    // InternalT2.g:188:3: '>'
                    {
                     before(grammarAccess.getOpAccess().getGreaterThanSignKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getGreaterThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalT2.g:193:2: ( '>=' )
                    {
                    // InternalT2.g:193:2: ( '>=' )
                    // InternalT2.g:194:3: '>='
                    {
                     before(grammarAccess.getOpAccess().getGreaterThanSignEqualsSignKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getGreaterThanSignEqualsSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalT2.g:199:2: ( '<=' )
                    {
                    // InternalT2.g:199:2: ( '<=' )
                    // InternalT2.g:200:3: '<='
                    {
                     before(grammarAccess.getOpAccess().getLessThanSignEqualsSignKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getLessThanSignEqualsSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalT2.g:205:2: ( '=' )
                    {
                    // InternalT2.g:205:2: ( '=' )
                    // InternalT2.g:206:3: '='
                    {
                     before(grammarAccess.getOpAccess().getEqualsSignKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getOpAccess().getEqualsSignKeyword_8()); 

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
    // $ANTLR end "rule__Op__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalT2.g:215:1: rule__Value__Alternatives : ( ( RULE_INT ) | ( ( rule__Value__Group_1__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:219:1: ( ( RULE_INT ) | ( ( rule__Value__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_INT) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalT2.g:220:2: ( RULE_INT )
                    {
                    // InternalT2.g:220:2: ( RULE_INT )
                    // InternalT2.g:221:3: RULE_INT
                    {
                     before(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalT2.g:226:2: ( ( rule__Value__Group_1__0 ) )
                    {
                    // InternalT2.g:226:2: ( ( rule__Value__Group_1__0 ) )
                    // InternalT2.g:227:3: ( rule__Value__Group_1__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_1()); 
                    // InternalT2.g:228:3: ( rule__Value__Group_1__0 )
                    // InternalT2.g:228:4: rule__Value__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Value__Group_1__0"
    // InternalT2.g:236:1: rule__Value__Group_1__0 : rule__Value__Group_1__0__Impl rule__Value__Group_1__1 ;
    public final void rule__Value__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:240:1: ( rule__Value__Group_1__0__Impl rule__Value__Group_1__1 )
            // InternalT2.g:241:2: rule__Value__Group_1__0__Impl rule__Value__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Value__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_1__1();

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
    // $ANTLR end "rule__Value__Group_1__0"


    // $ANTLR start "rule__Value__Group_1__0__Impl"
    // InternalT2.g:248:1: rule__Value__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Value__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:252:1: ( ( '(' ) )
            // InternalT2.g:253:1: ( '(' )
            {
            // InternalT2.g:253:1: ( '(' )
            // InternalT2.g:254:2: '('
            {
             before(grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Value__Group_1__0__Impl"


    // $ANTLR start "rule__Value__Group_1__1"
    // InternalT2.g:263:1: rule__Value__Group_1__1 : rule__Value__Group_1__1__Impl rule__Value__Group_1__2 ;
    public final void rule__Value__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:267:1: ( rule__Value__Group_1__1__Impl rule__Value__Group_1__2 )
            // InternalT2.g:268:2: rule__Value__Group_1__1__Impl rule__Value__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_1__2();

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
    // $ANTLR end "rule__Value__Group_1__1"


    // $ANTLR start "rule__Value__Group_1__1__Impl"
    // InternalT2.g:275:1: rule__Value__Group_1__1__Impl : ( ruleOp ) ;
    public final void rule__Value__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:279:1: ( ( ruleOp ) )
            // InternalT2.g:280:1: ( ruleOp )
            {
            // InternalT2.g:280:1: ( ruleOp )
            // InternalT2.g:281:2: ruleOp
            {
             before(grammarAccess.getValueAccess().getOpParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleOp();

            state._fsp--;

             after(grammarAccess.getValueAccess().getOpParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Value__Group_1__1__Impl"


    // $ANTLR start "rule__Value__Group_1__2"
    // InternalT2.g:290:1: rule__Value__Group_1__2 : rule__Value__Group_1__2__Impl rule__Value__Group_1__3 ;
    public final void rule__Value__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:294:1: ( rule__Value__Group_1__2__Impl rule__Value__Group_1__3 )
            // InternalT2.g:295:2: rule__Value__Group_1__2__Impl rule__Value__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_1__3();

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
    // $ANTLR end "rule__Value__Group_1__2"


    // $ANTLR start "rule__Value__Group_1__2__Impl"
    // InternalT2.g:302:1: rule__Value__Group_1__2__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:306:1: ( ( RULE_INT ) )
            // InternalT2.g:307:1: ( RULE_INT )
            {
            // InternalT2.g:307:1: ( RULE_INT )
            // InternalT2.g:308:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1_2()); 

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
    // $ANTLR end "rule__Value__Group_1__2__Impl"


    // $ANTLR start "rule__Value__Group_1__3"
    // InternalT2.g:317:1: rule__Value__Group_1__3 : rule__Value__Group_1__3__Impl rule__Value__Group_1__4 ;
    public final void rule__Value__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:321:1: ( rule__Value__Group_1__3__Impl rule__Value__Group_1__4 )
            // InternalT2.g:322:2: rule__Value__Group_1__3__Impl rule__Value__Group_1__4
            {
            pushFollow(FOLLOW_6);
            rule__Value__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_1__4();

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
    // $ANTLR end "rule__Value__Group_1__3"


    // $ANTLR start "rule__Value__Group_1__3__Impl"
    // InternalT2.g:329:1: rule__Value__Group_1__3__Impl : ( RULE_INT ) ;
    public final void rule__Value__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:333:1: ( ( RULE_INT ) )
            // InternalT2.g:334:1: ( RULE_INT )
            {
            // InternalT2.g:334:1: ( RULE_INT )
            // InternalT2.g:335:2: RULE_INT
            {
             before(grammarAccess.getValueAccess().getINTTerminalRuleCall_1_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getINTTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Value__Group_1__3__Impl"


    // $ANTLR start "rule__Value__Group_1__4"
    // InternalT2.g:344:1: rule__Value__Group_1__4 : rule__Value__Group_1__4__Impl ;
    public final void rule__Value__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:348:1: ( rule__Value__Group_1__4__Impl )
            // InternalT2.g:349:2: rule__Value__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_1__4__Impl();

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
    // $ANTLR end "rule__Value__Group_1__4"


    // $ANTLR start "rule__Value__Group_1__4__Impl"
    // InternalT2.g:355:1: rule__Value__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Value__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:359:1: ( ( ')' ) )
            // InternalT2.g:360:1: ( ')' )
            {
            // InternalT2.g:360:1: ( ')' )
            // InternalT2.g:361:2: ')'
            {
             before(grammarAccess.getValueAccess().getRightParenthesisKeyword_1_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getRightParenthesisKeyword_1_4()); 

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
    // $ANTLR end "rule__Value__Group_1__4__Impl"


    // $ANTLR start "rule__Model__VarsAssignment"
    // InternalT2.g:371:1: rule__Model__VarsAssignment : ( ruleVAR ) ;
    public final void rule__Model__VarsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalT2.g:375:1: ( ( ruleVAR ) )
            // InternalT2.g:376:2: ( ruleVAR )
            {
            // InternalT2.g:376:2: ( ruleVAR )
            // InternalT2.g:377:3: ruleVAR
            {
             before(grammarAccess.getModelAccess().getVarsVARParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVAR();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVARParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__VarsAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});

}