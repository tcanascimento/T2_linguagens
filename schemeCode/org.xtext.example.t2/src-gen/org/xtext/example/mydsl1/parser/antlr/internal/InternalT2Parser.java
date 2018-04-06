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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'+'", "'/'", "'*'", "'<'", "'>'", "'>='", "'<='", "'='", "'('", "'define'", "')'"
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
    public static final int T__22=22;
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

        AntlrDatatypeRuleToken lv_vars_0_0 = null;



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

                if ( (LA1_0==RULE_INT||LA1_0==20) ) {
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


    // $ANTLR start "entryRuleDefine"
    // InternalT2.g:172:1: entryRuleDefine returns [String current=null] : iv_ruleDefine= ruleDefine EOF ;
    public final String entryRuleDefine() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDefine = null;


        try {
            // InternalT2.g:172:46: (iv_ruleDefine= ruleDefine EOF )
            // InternalT2.g:173:2: iv_ruleDefine= ruleDefine EOF
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
    // InternalT2.g:179:1: ruleDefine returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' kw= 'define' this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleDefine() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_2=null;
        AntlrDatatypeRuleToken this_Complemento_3 = null;



        	enterRule();

        try {
            // InternalT2.g:185:2: ( (kw= '(' kw= 'define' this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' ) )
            // InternalT2.g:186:2: (kw= '(' kw= 'define' this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' )
            {
            // InternalT2.g:186:2: (kw= '(' kw= 'define' this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')' )
            // InternalT2.g:187:3: kw= '(' kw= 'define' this_ID_2= RULE_ID this_Complemento_3= ruleComplemento kw= ')'
            {
            kw=(Token)match(input,20,FOLLOW_4); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getLeftParenthesisKeyword_0());
            		
            kw=(Token)match(input,21,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getDefineAccess().getDefineKeyword_1());
            		
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            			current.merge(this_ID_2);
            		

            			newLeafNode(this_ID_2, grammarAccess.getDefineAccess().getIDTerminalRuleCall_2());
            		

            			newCompositeNode(grammarAccess.getDefineAccess().getComplementoParserRuleCall_3());
            		
            pushFollow(FOLLOW_7);
            this_Complemento_3=ruleComplemento();

            state._fsp--;


            			current.merge(this_Complemento_3);
            		

            			afterParserOrEnumRuleCall();
            		
            kw=(Token)match(input,22,FOLLOW_2); 

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
    // InternalT2.g:223:1: entryRuleComplemento returns [String current=null] : iv_ruleComplemento= ruleComplemento EOF ;
    public final String entryRuleComplemento() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComplemento = null;


        try {
            // InternalT2.g:223:51: (iv_ruleComplemento= ruleComplemento EOF )
            // InternalT2.g:224:2: iv_ruleComplemento= ruleComplemento EOF
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
    // InternalT2.g:230:1: ruleComplemento returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) ) ;
    public final AntlrDatatypeRuleToken ruleComplemento() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_3=null;
        Token this_ID_7=null;
        Token this_INT_8=null;
        AntlrDatatypeRuleToken this_Op_2 = null;

        AntlrDatatypeRuleToken this_Op_6 = null;



        	enterRule();

        try {
            // InternalT2.g:236:2: ( (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) ) )
            // InternalT2.g:237:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) )
            {
            // InternalT2.g:237:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalT2.g:238:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:246:3: (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' )
                    {
                    // InternalT2.g:246:3: (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' )
                    // InternalT2.g:247:4: kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')'
                    {
                    kw=(Token)match(input,20,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getOpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Op_2=ruleOp();

                    state._fsp--;


                    				current.merge(this_Op_2);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    // InternalT2.g:262:4: (this_INT_3= RULE_INT )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_INT) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalT2.g:263:5: this_INT_3= RULE_INT
                    	    {
                    	    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

                    	    					current.merge(this_INT_3);
                    	    				

                    	    					newLeafNode(this_INT_3, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_1_2());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_1_3());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalT2.g:278:3: (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' )
                    {
                    // InternalT2.g:278:3: (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' )
                    // InternalT2.g:279:4: kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')'
                    {
                    kw=(Token)match(input,20,FOLLOW_8); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getComplementoAccess().getOpParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_5);
                    this_Op_6=ruleOp();

                    state._fsp--;


                    				current.merge(this_Op_6);
                    			

                    				afterParserOrEnumRuleCall();
                    			
                    this_ID_7=(Token)match(input,RULE_ID,FOLLOW_10); 

                    				current.merge(this_ID_7);
                    			

                    				newLeafNode(this_ID_7, grammarAccess.getComplementoAccess().getIDTerminalRuleCall_2_2());
                    			
                    this_INT_8=(Token)match(input,RULE_INT,FOLLOW_7); 

                    				current.merge(this_INT_8);
                    			

                    				newLeafNode(this_INT_8, grammarAccess.getComplementoAccess().getINTTerminalRuleCall_2_3());
                    			
                    kw=(Token)match(input,22,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getComplementoAccess().getRightParenthesisKeyword_2_4());
                    			

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
    // InternalT2.g:318:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // InternalT2.g:318:45: (iv_ruleValue= ruleValue EOF )
            // InternalT2.g:319:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
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
    // InternalT2.g:325:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Define_0= ruleDefine | this_Complemento_1= ruleComplemento ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Define_0 = null;

        AntlrDatatypeRuleToken this_Complemento_1 = null;



        	enterRule();

        try {
            // InternalT2.g:331:2: ( (this_Define_0= ruleDefine | this_Complemento_1= ruleComplemento ) )
            // InternalT2.g:332:2: (this_Define_0= ruleDefine | this_Complemento_1= ruleComplemento )
            {
            // InternalT2.g:332:2: (this_Define_0= ruleDefine | this_Complemento_1= ruleComplemento )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==21) ) {
                    alt5=1;
                }
                else if ( ((LA5_1>=11 && LA5_1<=19)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_INT) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalT2.g:333:3: this_Define_0= ruleDefine
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDefineParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Define_0=ruleDefine();

                    state._fsp--;


                    			current.merge(this_Define_0);
                    		

                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalT2.g:344:3: this_Complemento_1= ruleComplemento
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getComplementoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Complemento_1=ruleComplemento();

                    state._fsp--;


                    			current.merge(this_Complemento_1);
                    		

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVAR"
    // InternalT2.g:358:1: entryRuleVAR returns [String current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final String entryRuleVAR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVAR = null;


        try {
            // InternalT2.g:358:43: (iv_ruleVAR= ruleVAR EOF )
            // InternalT2.g:359:2: iv_ruleVAR= ruleVAR EOF
            {
             newCompositeNode(grammarAccess.getVARRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVAR=ruleVAR();

            state._fsp--;

             current =iv_ruleVAR.getText(); 
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
    // InternalT2.g:365:1: ruleVAR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_Value_0= ruleValue ;
    public final AntlrDatatypeRuleToken ruleVAR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_Value_0 = null;



        	enterRule();

        try {
            // InternalT2.g:371:2: (this_Value_0= ruleValue )
            // InternalT2.g:372:2: this_Value_0= ruleValue
            {

            		newCompositeNode(grammarAccess.getVARAccess().getValueParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Value_0=ruleValue();

            state._fsp--;


            		current.merge(this_Value_0);
            	

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\5\1\uffff\1\13\11\4\2\uffff";
    static final String dfa_3s = "\1\24\1\uffff\1\23\11\26\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\12\uffff\1\3\1\2";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\16\uffff\1\2",
            "",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "\1\14\1\15\20\uffff\1\15",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "237:2: (this_INT_0= RULE_INT | (kw= '(' this_Op_2= ruleOp (this_INT_3= RULE_INT )* kw= ')' ) | (kw= '(' this_Op_6= ruleOp this_ID_7= RULE_ID this_INT_8= RULE_INT kw= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000500020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000FF800L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}