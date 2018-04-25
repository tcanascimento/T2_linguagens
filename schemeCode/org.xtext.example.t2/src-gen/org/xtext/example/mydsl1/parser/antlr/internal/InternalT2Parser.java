package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.T2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalT2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'/'", "'*'", "'<'", "'>'", "'>='", "'<='", "'='", "'if'", "'define'", "'set!'", "'display'", "'print'", "'lambda'", "'define-macro'", "'read'", "'map'", "'('", "')'"
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
    public static final int T__30=30;
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


        public InternalT2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalT2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalT2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalT2.g"; }



     	private T2GrammarAccess grammarAccess;

        public InternalT2Parser(TokenStream input, T2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected T2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalT2.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalT2.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalT2.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalT2.g:71:1: ruleModel returns [EObject current=null] : ( (lv_vars_0_0= ruleVAR ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_vars_0_0 = null;



        	enterRule();

        try {
            // InternalT2.g:77:2: ( ( (lv_vars_0_0= ruleVAR ) )* )
            // InternalT2.g:78:2: ( (lv_vars_0_0= ruleVAR ) )*
            {
            // InternalT2.g:78:2: ( (lv_vars_0_0= ruleVAR ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_INT||(LA1_0>=11 && LA1_0<=29)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalT2.g:79:3: (lv_vars_0_0= ruleVAR )
            	    {
            	    // InternalT2.g:79:3: (lv_vars_0_0= ruleVAR )
            	    // InternalT2.g:80:4: lv_vars_0_0= ruleVAR
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getVarsVARParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_vars_0_0=ruleVAR();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"vars",
            	    					lv_vars_0_0,
            	    					"org.xtext.example.mydsl1.T2.VAR");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleOp"
    // InternalT2.g:100:1: entryRuleOp returns [String current=null] : iv_ruleOp= ruleOp EOF ;
    public final String entryRuleOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOp = null;


        try {
            // InternalT2.g:100:42: (iv_ruleOp= ruleOp EOF )
            // InternalT2.g:101:2: iv_ruleOp= ruleOp EOF
            {
             newCompositeNode(grammarAccess.getOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOp=ruleOp();

            state._fsp--;

             current =iv_ruleOp.getText(); 
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
    // $ANTLR end "entryRuleOp"


    // $ANTLR start "ruleOp"
    // InternalT2.g:107:1: ruleOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '-' | kw= '+' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT2.g:113:2: ( (kw= '-' | kw= '+' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= '=' ) )
            // InternalT2.g:114:2: (kw= '-' | kw= '+' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= '=' )
            {
            // InternalT2.g:114:2: (kw= '-' | kw= '+' | kw= '/' | kw= '*' | kw= '<' | kw= '>' | kw= '>=' | kw= '<=' | kw= '=' )
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
                    // InternalT2.g:115:3: kw= '-'
                    {
                    kw=(Token)match(input,11,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getHyphenMinusKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:121:3: kw= '+'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getPlusSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT2.g:127:3: kw= '/'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getSolidusKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT2.g:133:3: kw= '*'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getAsteriskKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT2.g:139:3: kw= '<'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getLessThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalT2.g:145:3: kw= '>'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getGreaterThanSignKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalT2.g:151:3: kw= '>='
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getGreaterThanSignEqualsSignKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalT2.g:157:3: kw= '<='
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getLessThanSignEqualsSignKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalT2.g:163:3: kw= '='
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOpAccess().getEqualsSignKeyword_8());
                    		

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
    // $ANTLR end "ruleOp"


    // $ANTLR start "entryRuleCondicional"
    // InternalT2.g:172:1: entryRuleCondicional returns [String current=null] : iv_ruleCondicional= ruleCondicional EOF ;
    public final String entryRuleCondicional() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCondicional = null;


        try {
            // InternalT2.g:172:51: (iv_ruleCondicional= ruleCondicional EOF )
            // InternalT2.g:173:2: iv_ruleCondicional= ruleCondicional EOF
            {
             newCompositeNode(grammarAccess.getCondicionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondicional=ruleCondicional();

            state._fsp--;

             current =iv_ruleCondicional.getText(); 
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
    // $ANTLR end "entryRuleCondicional"


    // $ANTLR start "ruleCondicional"
    // InternalT2.g:179:1: ruleCondicional returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'if' ;
    public final AntlrDatatypeRuleToken ruleCondicional() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT2.g:185:2: (kw= 'if' )
            // InternalT2.g:186:2: kw= 'if'
            {
            kw=(Token)match(input,20,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getCondicionalAccess().getIfKeyword());
            	

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
    // $ANTLR end "ruleCondicional"


    // $ANTLR start "entryRulePrefix"
    // InternalT2.g:194:1: entryRulePrefix returns [String current=null] : iv_rulePrefix= rulePrefix EOF ;
    public final String entryRulePrefix() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrefix = null;


        try {
            // InternalT2.g:194:46: (iv_rulePrefix= rulePrefix EOF )
            // InternalT2.g:195:2: iv_rulePrefix= rulePrefix EOF
            {
             newCompositeNode(grammarAccess.getPrefixRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrefix=rulePrefix();

            state._fsp--;

             current =iv_rulePrefix.getText(); 
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
    // $ANTLR end "entryRulePrefix"


    // $ANTLR start "rulePrefix"
    // InternalT2.g:201:1: rulePrefix returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'define' | kw= 'set!' | kw= 'display' | kw= 'print' | kw= 'lambda' | kw= 'define-macro' | kw= 'read' | kw= 'map' ) ;
    public final AntlrDatatypeRuleToken rulePrefix() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalT2.g:207:2: ( (kw= 'define' | kw= 'set!' | kw= 'display' | kw= 'print' | kw= 'lambda' | kw= 'define-macro' | kw= 'read' | kw= 'map' ) )
            // InternalT2.g:208:2: (kw= 'define' | kw= 'set!' | kw= 'display' | kw= 'print' | kw= 'lambda' | kw= 'define-macro' | kw= 'read' | kw= 'map' )
            {
            // InternalT2.g:208:2: (kw= 'define' | kw= 'set!' | kw= 'display' | kw= 'print' | kw= 'lambda' | kw= 'define-macro' | kw= 'read' | kw= 'map' )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt3=1;
                }
                break;
            case 22:
                {
                alt3=2;
                }
                break;
            case 23:
                {
                alt3=3;
                }
                break;
            case 24:
                {
                alt3=4;
                }
                break;
            case 25:
                {
                alt3=5;
                }
                break;
            case 26:
                {
                alt3=6;
                }
                break;
            case 27:
                {
                alt3=7;
                }
                break;
            case 28:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalT2.g:209:3: kw= 'define'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getDefineKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:215:3: kw= 'set!'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getSetKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalT2.g:221:3: kw= 'display'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getDisplayKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalT2.g:227:3: kw= 'print'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getPrintKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalT2.g:233:3: kw= 'lambda'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getLambdaKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalT2.g:239:3: kw= 'define-macro'
                    {
                    kw=(Token)match(input,26,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getDefineMacroKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalT2.g:245:3: kw= 'read'
                    {
                    kw=(Token)match(input,27,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getReadKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalT2.g:251:3: kw= 'map'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPrefixAccess().getMapKeyword_7());
                    		

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
    // $ANTLR end "rulePrefix"


    // $ANTLR start "entryRuleCompose"
    // InternalT2.g:260:1: entryRuleCompose returns [String current=null] : iv_ruleCompose= ruleCompose EOF ;
    public final String entryRuleCompose() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCompose = null;


        try {
            // InternalT2.g:260:47: (iv_ruleCompose= ruleCompose EOF )
            // InternalT2.g:261:2: iv_ruleCompose= ruleCompose EOF
            {
             newCompositeNode(grammarAccess.getComposeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompose=ruleCompose();

            state._fsp--;

             current =iv_ruleCompose.getText(); 
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
    // $ANTLR end "entryRuleCompose"


    // $ANTLR start "ruleCompose"
    // InternalT2.g:267:1: ruleCompose returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Prefix_0= rulePrefix | (kw= '(' this_Prefix_2= rulePrefix kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleCompose() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Prefix_0 = null;

        AntlrDatatypeRuleToken this_Prefix_2 = null;



        	enterRule();

        try {
            // InternalT2.g:273:2: ( (this_Prefix_0= rulePrefix | (kw= '(' this_Prefix_2= rulePrefix kw= ')' ) ) )
            // InternalT2.g:274:2: (this_Prefix_0= rulePrefix | (kw= '(' this_Prefix_2= rulePrefix kw= ')' ) )
            {
            // InternalT2.g:274:2: (this_Prefix_0= rulePrefix | (kw= '(' this_Prefix_2= rulePrefix kw= ')' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=21 && LA4_0<=28)) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalT2.g:275:3: this_Prefix_0= rulePrefix
                    {

                    			newCompositeNode(grammarAccess.getComposeAccess().getPrefixParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Prefix_0=rulePrefix();

                    state._fsp--;


                    			current.merge(this_Prefix_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:286:3: (kw= '(' this_Prefix_2= rulePrefix kw= ')' )
                    {
                    // InternalT2.g:286:3: (kw= '(' this_Prefix_2= rulePrefix kw= ')' )
                    // InternalT2.g:287:4: kw= '(' this_Prefix_2= rulePrefix kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComposeAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getComposeAccess().getPrefixParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Prefix_2=rulePrefix();

                    state._fsp--;


                    				current.merge(this_Prefix_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComposeAccess().getRightParenthesisKeyword_1_2());
                    			

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
    // $ANTLR end "ruleCompose"


    // $ANTLR start "entryRuleDefine"
    // InternalT2.g:312:1: entryRuleDefine returns [String current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final String entryRuleDefine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefine = null;


        try {
            // InternalT2.g:312:46: (iv_ruleDefine= ruleDefine EOF )
            // InternalT2.g:313:2: iv_ruleDefine= ruleDefine EOF
            {
             newCompositeNode(grammarAccess.getDefineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefine=ruleDefine();

            state._fsp--;

             current =iv_ruleDefine.getText(); 
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
    // $ANTLR end "entryRuleDefine"


    // $ANTLR start "ruleDefine"
    // InternalT2.g:319:1: ruleDefine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' this_Prefix_1= rulePrefix this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDefine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Prefix_1 = null;

        AntlrDatatypeRuleToken this_Complemento_3 = null;



        	enterRule();

        try {
            // InternalT2.g:325:2: ( (kw= '(' this_Prefix_1= rulePrefix this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' ) )
            // InternalT2.g:326:2: (kw= '(' this_Prefix_1= rulePrefix this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' )
            {
            // InternalT2.g:326:2: (kw= '(' this_Prefix_1= rulePrefix this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' )
            // InternalT2.g:327:3: kw= '(' this_Prefix_1= rulePrefix this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')'
            {
            kw=(Token)match(input,29,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		

            			newCompositeNode(grammarAccess.getDefineAccess().getPrefixParserRuleCall_1());
            		
            pushFollow(FOLLOW_6);
            this_Prefix_1=rulePrefix();

            state._fsp--;


            			current.merge(this_Prefix_1);
            		

            			afterParserOrEnumRuleCall();
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getDefineAccess().getIDTerminalRuleCall_2());
            		

            			newCompositeNode(grammarAccess.getDefineAccess().getComplementoParserRuleCall_3());
            		
            pushFollow(FOLLOW_5);
            this_Complemento_3=ruleComplemento();

            state._fsp--;


            			current.merge(this_Complemento_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,30,FOLLOW_2); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleDefine"


    // $ANTLR start "entryRuleComplemento"
    // InternalT2.g:368:1: entryRuleComplemento returns [String current=null] : iv_ruleComplemento= ruleComplemento EOF ;
    public final String entryRuleComplemento() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplemento = null;


        try {
            // InternalT2.g:368:51: (iv_ruleComplemento= ruleComplemento EOF )
            // InternalT2.g:369:2: iv_ruleComplemento= ruleComplemento EOF
            {
             newCompositeNode(grammarAccess.getComplementoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplemento=ruleComplemento();

            state._fsp--;

             current =iv_ruleComplemento.getText(); 
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
    // $ANTLR end "entryRuleComplemento"


    // $ANTLR start "ruleComplemento"
    // InternalT2.g:375:1: ruleComplemento returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) | (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' ) | (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING ) | (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleComplemento() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_7=null;
        Token this_INT_8=null;
        Token this_STRING_12=null;
        Token this_STRING_15=null;
        Token this_STRING_18=null;
        Token this_STRING_20=null;
        AntlrDatatypeRuleToken this_Op_2 = null;

        AntlrDatatypeRuleToken this_Op_6 = null;

        AntlrDatatypeRuleToken this_Prefix_11 = null;

        AntlrDatatypeRuleToken this_Prefix_14 = null;

        AntlrDatatypeRuleToken this_Prefix_17 = null;

        AntlrDatatypeRuleToken this_Compose_19 = null;



        	enterRule();

        try {
            // InternalT2.g:381:2: ( (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) | (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' ) | (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING ) | (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' ) ) )
            // InternalT2.g:382:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) | (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' ) | (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING ) | (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' ) )
            {
            // InternalT2.g:382:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) | (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' ) | (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING ) | (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' ) )
            int alt6=6;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalT2.g:383:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:391:3: (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' )
                    {
                    // InternalT2.g:391:3: (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' )
                    // InternalT2.g:392:4: kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getOpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Op_2=ruleOp();

                    state._fsp--;


                    				current.merge(this_Op_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalT2.g:407:4: (this_INT_3= RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_INT) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalT2.g:408:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

                    	    					current.merge(this_INT_3);
                    	    				

                    	    					newLeafNode(this_INT_3, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalT2.g:423:3: (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' )
                    {
                    // InternalT2.g:423:3: (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' )
                    // InternalT2.g:424:4: kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getOpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_6);
                    this_Op_6=ruleOp();

                    state._fsp--;


                    				current.merge(this_Op_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_10); 

                    				current.merge(this_ID_7);
                    			

                    				newLeafNode(this_ID_7, grammarAccess.getComplementoAccess().getIDTerminalRuleCall_2_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_5); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_2_3());
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_2_4());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalT2.g:460:3: (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' )
                    {
                    // InternalT2.g:460:3: (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' )
                    // InternalT2.g:461:4: kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_3_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getPrefixParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Prefix_11=rulePrefix();

                    state._fsp--;


                    				current.merge(this_Prefix_11);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    				current.merge(this_STRING_12);
                    			

                    				newLeafNode(this_STRING_12, grammarAccess.getComplementoAccess().getSTRINGTerminalRuleCall_3_2());
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_3_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalT2.g:490:3: (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING )
                    {
                    // InternalT2.g:490:3: (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING )
                    // InternalT2.g:491:4: this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING
                    {

                    				newCompositeNode(grammarAccess.getComplementoAccess().getPrefixParserRuleCall_4_0());
                    			
                    pushFollow(FOLLOW_11);
                    this_Prefix_14=rulePrefix();

                    state._fsp--;


                    				current.merge(this_Prefix_14);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_STRING_15=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    				current.merge(this_STRING_15);
                    			

                    				newLeafNode(this_STRING_15, grammarAccess.getComplementoAccess().getSTRINGTerminalRuleCall_4_1());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalT2.g:510:3: (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' )
                    {
                    // InternalT2.g:510:3: (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' )
                    // InternalT2.g:511:4: kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')'
                    {
                    kw=(Token)match(input,29,FOLLOW_4); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_5_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getPrefixParserRuleCall_5_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Prefix_17=rulePrefix();

                    state._fsp--;


                    				current.merge(this_Prefix_17);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_STRING_18=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    				current.merge(this_STRING_18);
                    			

                    				newLeafNode(this_STRING_18, grammarAccess.getComplementoAccess().getSTRINGTerminalRuleCall_5_2());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getComposeParserRuleCall_5_3());
                    			
                    pushFollow(FOLLOW_11);
                    this_Compose_19=ruleCompose();

                    state._fsp--;


                    				current.merge(this_Compose_19);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_STRING_20=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    				current.merge(this_STRING_20);
                    			

                    				newLeafNode(this_STRING_20, grammarAccess.getComplementoAccess().getSTRINGTerminalRuleCall_5_4());
                    			
                    kw=(Token)match(input,30,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_5_5());
                    			

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
    // $ANTLR end "ruleComplemento"


    // $ANTLR start "entryRuleValue"
    // InternalT2.g:560:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalT2.g:560:46: (iv_ruleValue= ruleValue EOF )
            // InternalT2.g:561:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalT2.g:567:1: ruleValue returns [EObject current=null] : ( ( (lv_def_0_0= ruleDefine ) ) | ( (lv_comp_1_0= ruleComplemento ) ) | ( ruleOp ruleComplemento ) | ( ruleCondicional ruleComplemento ruleComplemento ) ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_def_0_0 = null;

        AntlrDatatypeRuleToken lv_comp_1_0 = null;



        	enterRule();

        try {
            // InternalT2.g:573:2: ( ( ( (lv_def_0_0= ruleDefine ) ) | ( (lv_comp_1_0= ruleComplemento ) ) | ( ruleOp ruleComplemento ) | ( ruleCondicional ruleComplemento ruleComplemento ) ) )
            // InternalT2.g:574:2: ( ( (lv_def_0_0= ruleDefine ) ) | ( (lv_comp_1_0= ruleComplemento ) ) | ( ruleOp ruleComplemento ) | ( ruleCondicional ruleComplemento ruleComplemento ) )
            {
            // InternalT2.g:574:2: ( ( (lv_def_0_0= ruleDefine ) ) | ( (lv_comp_1_0= ruleComplemento ) ) | ( ruleOp ruleComplemento ) | ( ruleCondicional ruleComplemento ruleComplemento ) )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalT2.g:575:3: ( (lv_def_0_0= ruleDefine ) )
                    {
                    // InternalT2.g:575:3: ( (lv_def_0_0= ruleDefine ) )
                    // InternalT2.g:576:4: (lv_def_0_0= ruleDefine )
                    {
                    // InternalT2.g:576:4: (lv_def_0_0= ruleDefine )
                    // InternalT2.g:577:5: lv_def_0_0= ruleDefine
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getDefDefineParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_def_0_0=ruleDefine();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"def",
                    						lv_def_0_0,
                    						"org.xtext.example.mydsl1.T2.Define");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalT2.g:595:3: ( (lv_comp_1_0= ruleComplemento ) )
                    {
                    // InternalT2.g:595:3: ( (lv_comp_1_0= ruleComplemento ) )
                    // InternalT2.g:596:4: (lv_comp_1_0= ruleComplemento )
                    {
                    // InternalT2.g:596:4: (lv_comp_1_0= ruleComplemento )
                    // InternalT2.g:597:5: lv_comp_1_0= ruleComplemento
                    {

                    					newCompositeNode(grammarAccess.getValueAccess().getCompComplementoParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comp_1_0=ruleComplemento();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getValueRule());
                    					}
                    					set(
                    						current,
                    						"comp",
                    						lv_comp_1_0,
                    						"org.xtext.example.mydsl1.T2.Complemento");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalT2.g:615:3: ( ruleOp ruleComplemento )
                    {
                    // InternalT2.g:615:3: ( ruleOp ruleComplemento )
                    // InternalT2.g:616:4: ruleOp ruleComplemento
                    {

                    				newCompositeNode(grammarAccess.getValueAccess().getOpParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_7);
                    ruleOp();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getValueAccess().getComplementoParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleComplemento();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalT2.g:632:3: ( ruleCondicional ruleComplemento ruleComplemento )
                    {
                    // InternalT2.g:632:3: ( ruleCondicional ruleComplemento ruleComplemento )
                    // InternalT2.g:633:4: ruleCondicional ruleComplemento ruleComplemento
                    {

                    				newCompositeNode(grammarAccess.getValueAccess().getCondicionalParserRuleCall_3_0());
                    			
                    pushFollow(FOLLOW_7);
                    ruleCondicional();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getValueAccess().getComplementoParserRuleCall_3_1());
                    			
                    pushFollow(FOLLOW_7);
                    ruleComplemento();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    				newCompositeNode(grammarAccess.getValueAccess().getComplementoParserRuleCall_3_2());
                    			
                    pushFollow(FOLLOW_2);
                    ruleComplemento();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVAR"
    // InternalT2.g:659:1: entryRuleVAR returns [EObject current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final EObject entryRuleVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR = null;


        try {
            // InternalT2.g:659:44: (iv_ruleVAR= ruleVAR EOF )
            // InternalT2.g:660:2: iv_ruleVAR= ruleVAR EOF
            {
             newCompositeNode(grammarAccess.getVARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAR=ruleVAR();

            state._fsp--;

             current =iv_ruleVAR; 
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
    // $ANTLR end "entryRuleVAR"


    // $ANTLR start "ruleVAR"
    // InternalT2.g:666:1: ruleVAR returns [EObject current=null] : this_Value_0= ruleValue ;
    public final EObject ruleVAR() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;



        	enterRule();

        try {
            // InternalT2.g:672:2: (this_Value_0= ruleValue )
            // InternalT2.g:673:2: this_Value_0= ruleValue
            {

            		newCompositeNode(grammarAccess.getVARAccess().getValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Value_0=ruleValue();

            state._fsp--;


            		current = this_Value_0;
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
    // $ANTLR end "ruleVAR"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\32\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\13\1\uffff\10\6\11\4\1\25\4\uffff";
    static final String dfa_3s = "\1\35\1\uffff\1\34\1\uffff\10\6\12\36\4\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\5\22\uffff\1\3\1\2\1\4\1\6";
    static final String dfa_5s = "\32\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\17\uffff\10\3\1\2",
            "",
            "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\25",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\1\26\1\27\30\uffff\1\27",
            "\11\31\1\30",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "382:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) | (kw= '(' this_Prefix_11= rulePrefix this_STRING_12= RULE_STRING kw= ')' ) | (this_Prefix_14= rulePrefix this_STRING_15= RULE_STRING ) | (kw= '(' this_Prefix_17= rulePrefix this_STRING_18= RULE_STRING this_Compose_19= ruleCompose this_STRING_20= RULE_STRING kw= ')' ) )";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\5\1\13\3\uffff\10\4\1\uffff";
    static final String dfa_9s = "\1\35\1\34\3\uffff\10\6\1\uffff";
    static final String dfa_10s = "\2\uffff\1\2\1\3\1\4\10\uffff\1\1";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\2\5\uffff\11\3\1\4\10\2\1\1",
            "\11\2\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            "\1\15\1\uffff\1\2",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "574:2: ( ( (lv_def_0_0= ruleDefine ) ) | ( (lv_comp_1_0= ruleComplemento ) ) | ( ruleOp ruleComplemento ) | ( ruleCondicional ruleComplemento ruleComplemento ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000003FFFF822L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000001FE00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000003FE00020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000003FE00000L});

}