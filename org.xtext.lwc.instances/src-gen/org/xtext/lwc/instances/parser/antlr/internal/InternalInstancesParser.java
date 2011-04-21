package org.xtext.lwc.instances.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.lwc.instances.services.InstancesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalInstancesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import'", "'.*'", "'.'", "'='", "'{'", "'}'", "'+='", "'||'", "'&&'", "'=='", "'!='", "'instanceof'", "'>='", "'<='", "'>'", "'<'", "'->'", "'..'", "'+'", "'-'", "'*'", "'**'", "'/'", "'%'", "'!'", "'as'", "'?.'", "'*.'", "','", "'('", "')'", "'['", "'|'", "']'", "'if'", "'else'", "'switch'", "':'", "'default'", "'case'", "'for'", "'while'", "'do'", "'super'", "'::'", "'new'", "'false'", "'true'", "'null'", "'typeof'", "'throw'", "'return'", "'try'", "'finally'", "'catch'", "'=>'", "'?'", "'extends'", "'&'"
    };
    public static final int T__42=42;
    public static final int T__12=12;
    public static final int T__28=28;
    public static final int T__57=57;
    public static final int T__23=23;
    public static final int T__51=51;
    public static final int T__13=13;
    public static final int RULE_STRING=6;
    public static final int T__69=69;
    public static final int T__47=47;
    public static final int T__50=50;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__19=19;
    public static final int T__67=67;
    public static final int T__39=39;
    public static final int T__30=30;
    public static final int T__52=52;
    public static final int T__46=46;
    public static final int T__68=68;
    public static final int T__17=17;
    public static final int T__62=62;
    public static final int RULE_INT=4;
    public static final int T__27=27;
    public static final int T__24=24;
    public static final int T__49=49;
    public static final int T__61=61;
    public static final int T__59=59;
    public static final int T__54=54;
    public static final int T__48=48;
    public static final int T__34=34;
    public static final int T__56=56;
    public static final int T__15=15;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__35=35;
    public static final int RULE_ID=5;
    public static final int T__36=36;
    public static final int T__20=20;
    public static final int T__58=58;
    public static final int T__64=64;
    public static final int T__44=44;
    public static final int T__66=66;
    public static final int T__14=14;
    public static final int T__33=33;
    public static final int T__22=22;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__29=29;
    public static final int T__45=45;
    public static final int RULE_WS=9;
    public static final int T__63=63;
    public static final int T__43=43;
    public static final int T__31=31;
    public static final int T__40=40;
    public static final int EOF=-1;
    public static final int T__53=53;
    public static final int T__16=16;
    public static final int T__32=32;
    public static final int T__38=38;
    public static final int T__37=37;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__60=60;
    public static final int T__41=41;
    public static final int T__18=18;

    // delegates
    // delegators


        public InternalInstancesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalInstancesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalInstancesParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g"; }



     	private InstancesGrammarAccess grammarAccess;
     	
        public InternalInstancesParser(TokenStream input, InstancesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Instance";	
       	}
       	
       	@Override
       	protected InstancesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleInstance"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:67:1: entryRuleInstance returns [EObject current=null] : iv_ruleInstance= ruleInstance EOF ;
    public final EObject entryRuleInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstance = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:68:2: (iv_ruleInstance= ruleInstance EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:69:2: iv_ruleInstance= ruleInstance EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceRule()); 
            }
            pushFollow(FOLLOW_ruleInstance_in_entryRuleInstance75);
            iv_ruleInstance=ruleInstance();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstance; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstance85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstance"


    // $ANTLR start "ruleInstance"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:76:1: ruleInstance returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_expressions_2_0= ruleXVariableDeclaration ) )* ) ;
    public final EObject ruleInstance() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:79:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_expressions_2_0= ruleXVariableDeclaration ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_expressions_2_0= ruleXVariableDeclaration ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:80:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_expressions_2_0= ruleXVariableDeclaration ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:80:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_expressions_2_0= ruleXVariableDeclaration ) )*
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:80:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:81:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getInstanceAccess().getInstanceAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:86:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:87:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:87:1: (lv_imports_1_0= ruleImport )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:88:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstanceAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImport_in_ruleInstance140);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
            	              		"Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:104:3: ( (lv_expressions_2_0= ruleXVariableDeclaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||LA2_0==40||LA2_0==66) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:105:1: (lv_expressions_2_0= ruleXVariableDeclaration )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:105:1: (lv_expressions_2_0= ruleXVariableDeclaration )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:106:3: lv_expressions_2_0= ruleXVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getInstanceAccess().getExpressionsXVariableDeclarationParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXVariableDeclaration_in_ruleInstance162);
            	    lv_expressions_2_0=ruleXVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getInstanceRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XVariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstance"


    // $ANTLR start "entryRuleImport"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:130:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:131:2: (iv_ruleImport= ruleImport EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:132:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport199);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport209); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:139:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:142:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:143:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:143:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:143:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImport246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:147:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:148:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:148:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:149:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildCard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildCardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport267);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildCard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildCard"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:173:1: entryRuleQualifiedNameWithWildCard returns [String current=null] : iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF ;
    public final String entryRuleQualifiedNameWithWildCard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildCard = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:174:2: (iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:175:2: iv_ruleQualifiedNameWithWildCard= ruleQualifiedNameWithWildCard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildCardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard304);
            iv_ruleQualifiedNameWithWildCard=ruleQualifiedNameWithWildCard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildCard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard315); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildCard"


    // $ANTLR start "ruleQualifiedNameWithWildCard"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:182:1: ruleQualifiedNameWithWildCard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildCard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:185:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:186:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:186:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:187:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildCardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard362);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:197:1: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:198:2: kw= '.*'
                    {
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleQualifiedNameWithWildCard381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildCardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildCard"


    // $ANTLR start "entryRuleXIntLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:211:1: entryRuleXIntLiteral returns [EObject current=null] : iv_ruleXIntLiteral= ruleXIntLiteral EOF ;
    public final EObject entryRuleXIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIntLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:212:2: (iv_ruleXIntLiteral= ruleXIntLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:213:2: iv_ruleXIntLiteral= ruleXIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIntLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral423);
            iv_ruleXIntLiteral=ruleXIntLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIntLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIntLiteral433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIntLiteral"


    // $ANTLR start "ruleXIntLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:220:1: ruleXIntLiteral returns [EObject current=null] : ( ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleXIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_day_1_0=null;
        Token otherlv_2=null;
        Token lv_month_3_0=null;
        Token otherlv_4=null;
        Token lv_year_5_0=null;
        Token lv_value_7_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:223:28: ( ( ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:1: ( ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:1: ( ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) ) | ( () ( (lv_value_7_0= RULE_INT ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==13) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_ID||LA4_2==26) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RULE_INT) ) {
                        alt4=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA4_1==EOF||(LA4_1>=RULE_INT && LA4_1<=RULE_STRING)||(LA4_1>=15 && LA4_1<=42)||(LA4_1>=44 && LA4_1<=54)||(LA4_1>=56 && LA4_1<=66)) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:2: ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:2: ( () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:3: () ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) ) otherlv_2= '.' ( (lv_month_3_0= RULE_INT ) ) otherlv_4= '.' ( (lv_year_5_0= RULE_INT ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:224:3: ()
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:225:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXIntLiteralAccess().getDateLiteralAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:230:2: ( ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:230:3: ( ( RULE_INT ) )=> (lv_day_1_0= RULE_INT )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:236:1: (lv_day_1_0= RULE_INT )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:237:3: lv_day_1_0= RULE_INT
                    {
                    lv_day_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_day_1_0, grammarAccess.getXIntLiteralAccess().getDayINTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXIntLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"day",
                              		lv_day_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXIntLiteral513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXIntLiteralAccess().getFullStopKeyword_0_2());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:257:1: ( (lv_month_3_0= RULE_INT ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:258:1: (lv_month_3_0= RULE_INT )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:258:1: (lv_month_3_0= RULE_INT )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:259:3: lv_month_3_0= RULE_INT
                    {
                    lv_month_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_month_3_0, grammarAccess.getXIntLiteralAccess().getMonthINTTerminalRuleCall_0_3_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXIntLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"month",
                              		lv_month_3_0, 
                              		"INT");
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleXIntLiteral547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXIntLiteralAccess().getFullStopKeyword_0_4());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:279:1: ( (lv_year_5_0= RULE_INT ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:280:1: (lv_year_5_0= RULE_INT )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:280:1: (lv_year_5_0= RULE_INT )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:281:3: lv_year_5_0= RULE_INT
                    {
                    lv_year_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_year_5_0, grammarAccess.getXIntLiteralAccess().getYearINTTerminalRuleCall_0_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXIntLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"year",
                              		lv_year_5_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:298:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:298:6: ( () ( (lv_value_7_0= RULE_INT ) ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:298:7: () ( (lv_value_7_0= RULE_INT ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:298:7: ()
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:299:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXIntLiteralAccess().getXIntLiteralAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:304:2: ( (lv_value_7_0= RULE_INT ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:305:1: (lv_value_7_0= RULE_INT )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:305:1: (lv_value_7_0= RULE_INT )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:306:3: lv_value_7_0= RULE_INT
                    {
                    lv_value_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleXIntLiteral603); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_7_0, grammarAccess.getXIntLiteralAccess().getValueINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXIntLiteralRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_7_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIntLiteral"


    // $ANTLR start "entryRuleXVariableDeclaration"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:330:1: entryRuleXVariableDeclaration returns [EObject current=null] : iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF ;
    public final EObject entryRuleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXVariableDeclaration = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:331:2: (iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:332:2: iv_ruleXVariableDeclaration= ruleXVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration645);
            iv_ruleXVariableDeclaration=ruleXVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXVariableDeclaration655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXVariableDeclaration"


    // $ANTLR start "ruleXVariableDeclaration"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:339:1: ruleXVariableDeclaration returns [EObject current=null] : ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_name_2_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_right_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:342:28: ( ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:343:1: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:343:1: ( () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:343:2: () ( (lv_type_1_0= ruleJvmTypeReference ) ) ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '=' ( (lv_right_4_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:343:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:344:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXVariableDeclarationAccess().getXVariableDeclarationAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:349:2: ( (lv_type_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:350:1: (lv_type_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:350:1: (lv_type_1_0= ruleJvmTypeReference )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:351:3: lv_type_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getTypeJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration710);
            lv_type_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:367:2: ( (lv_name_2_0= RULE_ID ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:368:1: (lv_name_2_0= RULE_ID )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:368:1: (lv_name_2_0= RULE_ID )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:369:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXVariableDeclaration727); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getXVariableDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXVariableDeclarationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleXVariableDeclaration744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXVariableDeclarationAccess().getEqualsSignKeyword_3());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:389:1: ( (lv_right_4_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:390:1: (lv_right_4_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:390:1: (lv_right_4_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:391:3: lv_right_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXVariableDeclarationAccess().getRightXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXVariableDeclaration765);
            lv_right_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXVariableDeclaration"


    // $ANTLR start "entryRuleXBlockExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:415:1: entryRuleXBlockExpression returns [EObject current=null] : iv_ruleXBlockExpression= ruleXBlockExpression EOF ;
    public final EObject entryRuleXBlockExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBlockExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:416:2: (iv_ruleXBlockExpression= ruleXBlockExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:417:2: iv_ruleXBlockExpression= ruleXBlockExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBlockExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression801);
            iv_ruleXBlockExpression=ruleXBlockExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBlockExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBlockExpression811); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBlockExpression"


    // $ANTLR start "ruleXBlockExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:424:1: ruleXBlockExpression returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleXExpression ) )* otherlv_3= '}' ) ;
    public final EObject ruleXBlockExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expressions_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:427:28: ( ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleXExpression ) )* otherlv_3= '}' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:428:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleXExpression ) )* otherlv_3= '}' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:428:1: ( () otherlv_1= '{' ( (lv_expressions_2_0= ruleXExpression ) )* otherlv_3= '}' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:428:2: () otherlv_1= '{' ( (lv_expressions_2_0= ruleXExpression ) )* otherlv_3= '}'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:428:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:429:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBlockExpressionAccess().getObjectLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleXBlockExpression857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXBlockExpressionAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:438:1: ( (lv_expressions_2_0= ruleXExpression ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_INT && LA5_0<=RULE_STRING)||LA5_0==15||LA5_0==26||(LA5_0>=29 && LA5_0<=30)||LA5_0==35||LA5_0==40||LA5_0==42||LA5_0==45||LA5_0==47||(LA5_0>=51 && LA5_0<=54)||(LA5_0>=56 && LA5_0<=63)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:439:1: (lv_expressions_2_0= ruleXExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:439:1: (lv_expressions_2_0= ruleXExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:440:3: lv_expressions_2_0= ruleXExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXBlockExpressionAccess().getExpressionsXExpressionParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXBlockExpression878);
            	    lv_expressions_2_0=ruleXExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXBlockExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"expressions",
            	              		lv_expressions_2_0, 
            	              		"XExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleXBlockExpression891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXBlockExpressionAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBlockExpression"


    // $ANTLR start "entryRuleXExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:468:1: entryRuleXExpression returns [EObject current=null] : iv_ruleXExpression= ruleXExpression EOF ;
    public final EObject entryRuleXExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:469:2: (iv_ruleXExpression= ruleXExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:470:2: iv_ruleXExpression= ruleXExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXExpression_in_entryRuleXExpression927);
            iv_ruleXExpression=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXExpression937); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXExpression"


    // $ANTLR start "ruleXExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:477:1: ruleXExpression returns [EObject current=null] : this_XAssignment_0= ruleXAssignment ;
    public final EObject ruleXExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAssignment_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:480:28: (this_XAssignment_0= ruleXAssignment )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:482:5: this_XAssignment_0= ruleXAssignment
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXExpressionAccess().getXAssignmentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleXAssignment_in_ruleXExpression983);
            this_XAssignment_0=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAssignment_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXExpression"


    // $ANTLR start "entryRuleXAssignment"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:498:1: entryRuleXAssignment returns [EObject current=null] : iv_ruleXAssignment= ruleXAssignment EOF ;
    public final EObject entryRuleXAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAssignment = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:499:2: (iv_ruleXAssignment= ruleXAssignment EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:500:2: iv_ruleXAssignment= ruleXAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAssignmentRule()); 
            }
            pushFollow(FOLLOW_ruleXAssignment_in_entryRuleXAssignment1017);
            iv_ruleXAssignment=ruleXAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAssignment; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAssignment1027); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAssignment"


    // $ANTLR start "ruleXAssignment"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:507:1: ruleXAssignment returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) ;
    public final EObject ruleXAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_3_0 = null;

        EObject this_XOrExpression_4 = null;

        EObject lv_rightOperand_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:510:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:1: ( ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) ) | (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==EOF||(LA7_1>=RULE_INT && LA7_1<=RULE_STRING)||LA7_1==13||(LA7_1>=15 && LA7_1<=42)||(LA7_1>=44 && LA7_1<=66)) ) {
                    alt7=2;
                }
                else if ( (LA7_1==14) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA7_0==RULE_INT||LA7_0==RULE_STRING||LA7_0==15||LA7_0==26||(LA7_0>=29 && LA7_0<=30)||LA7_0==35||LA7_0==40||LA7_0==42||LA7_0==45||LA7_0==47||(LA7_0>=51 && LA7_0<=54)||(LA7_0>=56 && LA7_0<=63)) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:2: ( () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:3: () ( (otherlv_1= RULE_ID ) ) ruleOpSingleAssign ( (lv_value_3_0= ruleXAssignment ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:511:3: ()
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:512:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXAssignmentAccess().getXAssignmentAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:517:2: ( (otherlv_1= RULE_ID ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:518:1: (otherlv_1= RULE_ID )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:518:1: (otherlv_1= RULE_ID )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:519:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXAssignmentRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXAssignment1082); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	
                    }

                    }


                    }

                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getOpSingleAssignParserRuleCall_0_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1098);
                    ruleOpSingleAssign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:538:1: ( (lv_value_3_0= ruleXAssignment ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:539:1: (lv_value_3_0= ruleXAssignment )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:539:1: (lv_value_3_0= ruleXAssignment )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:540:3: lv_value_3_0= ruleXAssignment
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXAssignmentAccess().getValueXAssignmentParserRuleCall_0_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1118);
                    lv_value_3_0=ruleXAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"XAssignment");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:557:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:557:6: (this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )? )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:558:5: this_XOrExpression_4= ruleXOrExpression ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXAssignmentAccess().getXOrExpressionParserRuleCall_1_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXOrExpression_in_ruleXAssignment1148);
                    this_XOrExpression_4=ruleXOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XOrExpression_4; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:1: ( ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) ) )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==17) ) {
                        int LA6_1 = input.LA(2);

                        if ( (synpred2_InternalInstances()) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) ) ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:2: ( ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )=> ( () ( ( ruleOpMultiAssign ) ) )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:571:6: ( () ( ( ruleOpMultiAssign ) ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:571:7: () ( ( ruleOpMultiAssign ) )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:571:7: ()
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:572:5: 
                            {
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:577:2: ( ( ruleOpMultiAssign ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:578:1: ( ruleOpMultiAssign )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:578:1: ( ruleOpMultiAssign )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:579:3: ruleOpMultiAssign
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getXAssignmentRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1201);
                            ruleOpMultiAssign();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }


                            }

                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:592:4: ( (lv_rightOperand_7_0= ruleXAssignment ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:593:1: (lv_rightOperand_7_0= ruleXAssignment )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:593:1: (lv_rightOperand_7_0= ruleXAssignment )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:594:3: lv_rightOperand_7_0= ruleXAssignment
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXAssignmentAccess().getRightOperandXAssignmentParserRuleCall_1_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXAssignment_in_ruleXAssignment1224);
                            lv_rightOperand_7_0=ruleXAssignment();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXAssignmentRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"rightOperand",
                                      		lv_rightOperand_7_0, 
                                      		"XAssignment");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAssignment"


    // $ANTLR start "entryRuleOpSingleAssign"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:618:1: entryRuleOpSingleAssign returns [String current=null] : iv_ruleOpSingleAssign= ruleOpSingleAssign EOF ;
    public final String entryRuleOpSingleAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpSingleAssign = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:619:2: (iv_ruleOpSingleAssign= ruleOpSingleAssign EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:620:2: iv_ruleOpSingleAssign= ruleOpSingleAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpSingleAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1264);
            iv_ruleOpSingleAssign=ruleOpSingleAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpSingleAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpSingleAssign1275); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpSingleAssign"


    // $ANTLR start "ruleOpSingleAssign"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:627:1: ruleOpSingleAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '=' ;
    public final AntlrDatatypeRuleToken ruleOpSingleAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:630:28: (kw= '=' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:632:2: kw= '='
            {
            kw=(Token)match(input,14,FOLLOW_14_in_ruleOpSingleAssign1312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpSingleAssignAccess().getEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpSingleAssign"


    // $ANTLR start "entryRuleOpMultiAssign"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:645:1: entryRuleOpMultiAssign returns [String current=null] : iv_ruleOpMultiAssign= ruleOpMultiAssign EOF ;
    public final String entryRuleOpMultiAssign() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMultiAssign = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:646:2: (iv_ruleOpMultiAssign= ruleOpMultiAssign EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:647:2: iv_ruleOpMultiAssign= ruleOpMultiAssign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiAssignRule()); 
            }
            pushFollow(FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1352);
            iv_ruleOpMultiAssign=ruleOpMultiAssign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMultiAssign.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMultiAssign1363); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMultiAssign"


    // $ANTLR start "ruleOpMultiAssign"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:654:1: ruleOpMultiAssign returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '+=' ;
    public final AntlrDatatypeRuleToken ruleOpMultiAssign() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:657:28: (kw= '+=' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:659:2: kw= '+='
            {
            kw=(Token)match(input,17,FOLLOW_17_in_ruleOpMultiAssign1400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpMultiAssignAccess().getPlusSignEqualsSignKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMultiAssign"


    // $ANTLR start "entryRuleXOrExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:672:1: entryRuleXOrExpression returns [EObject current=null] : iv_ruleXOrExpression= ruleXOrExpression EOF ;
    public final EObject entryRuleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:673:2: (iv_ruleXOrExpression= ruleXOrExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:674:2: iv_ruleXOrExpression= ruleXOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1439);
            iv_ruleXOrExpression=ruleXOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrExpression1449); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrExpression"


    // $ANTLR start "ruleXOrExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:681:1: ruleXOrExpression returns [EObject current=null] : (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) ;
    public final EObject ruleXOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAndExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:684:28: ( (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:685:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:685:1: (this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:686:5: this_XAndExpression_0= ruleXAndExpression ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOrExpressionAccess().getXAndExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1496);
            this_XAndExpression_0=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAndExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:1: ( ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred3_InternalInstances()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) ) ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:2: ( ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:3: ( ( () ( ( ruleOpOr ) ) ) )=> ( () ( ( ruleOpOr ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:699:6: ( () ( ( ruleOpOr ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:699:7: () ( ( ruleOpOr ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:699:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:700:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:705:2: ( ( ruleOpOr ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:706:1: ( ruleOpOr )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:706:1: ( ruleOpOr )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:707:3: ruleOpOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOrExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOr_in_ruleXOrExpression1549);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:720:4: ( (lv_rightOperand_3_0= ruleXAndExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:721:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:721:1: (lv_rightOperand_3_0= ruleXAndExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:722:3: lv_rightOperand_3_0= ruleXAndExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOrExpressionAccess().getRightOperandXAndExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAndExpression_in_ruleXOrExpression1572);
            	    lv_rightOperand_3_0=ruleXAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOrExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAndExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:746:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:747:2: (iv_ruleOpOr= ruleOpOr EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:748:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_ruleOpOr_in_entryRuleOpOr1611);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOr1622); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:755:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:758:28: (kw= '||' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:760:2: kw= '||'
            {
            kw=(Token)match(input,18,FOLLOW_18_in_ruleOpOr1659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleXAndExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:773:1: entryRuleXAndExpression returns [EObject current=null] : iv_ruleXAndExpression= ruleXAndExpression EOF ;
    public final EObject entryRuleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAndExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:774:2: (iv_ruleXAndExpression= ruleXAndExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:775:2: iv_ruleXAndExpression= ruleXAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAndExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1698);
            iv_ruleXAndExpression=ruleXAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAndExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAndExpression1708); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAndExpression"


    // $ANTLR start "ruleXAndExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:782:1: ruleXAndExpression returns [EObject current=null] : (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) ;
    public final EObject ruleXAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XEqualityExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:785:28: ( (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:786:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:786:1: (this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:787:5: this_XEqualityExpression_0= ruleXEqualityExpression ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAndExpressionAccess().getXEqualityExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1755);
            this_XEqualityExpression_0=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XEqualityExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:1: ( ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred4_InternalInstances()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) ) ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:2: ( ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:3: ( ( () ( ( ruleOpAnd ) ) ) )=> ( () ( ( ruleOpAnd ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:800:6: ( () ( ( ruleOpAnd ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:800:7: () ( ( ruleOpAnd ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:800:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:801:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:806:2: ( ( ruleOpAnd ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:807:1: ( ruleOpAnd )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:807:1: ( ruleOpAnd )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:808:3: ruleOpAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAndExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAnd_in_ruleXAndExpression1808);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:821:4: ( (lv_rightOperand_3_0= ruleXEqualityExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:822:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:822:1: (lv_rightOperand_3_0= ruleXEqualityExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:823:3: lv_rightOperand_3_0= ruleXEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAndExpressionAccess().getRightOperandXEqualityExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1831);
            	    lv_rightOperand_3_0=ruleXEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAndExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XEqualityExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:847:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:848:2: (iv_ruleOpAnd= ruleOpAnd EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:849:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_ruleOpAnd_in_entryRuleOpAnd1870);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAnd1881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:856:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:859:28: (kw= '&&' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:861:2: kw= '&&'
            {
            kw=(Token)match(input,19,FOLLOW_19_in_ruleOpAnd1918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleXEqualityExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:874:1: entryRuleXEqualityExpression returns [EObject current=null] : iv_ruleXEqualityExpression= ruleXEqualityExpression EOF ;
    public final EObject entryRuleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXEqualityExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:875:2: (iv_ruleXEqualityExpression= ruleXEqualityExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:876:2: iv_ruleXEqualityExpression= ruleXEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1957);
            iv_ruleXEqualityExpression=ruleXEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXEqualityExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXEqualityExpression1967); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXEqualityExpression"


    // $ANTLR start "ruleXEqualityExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:883:1: ruleXEqualityExpression returns [EObject current=null] : (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) ;
    public final EObject ruleXEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XRelationalExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:886:28: ( (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:887:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:887:1: (this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:888:5: this_XRelationalExpression_0= ruleXRelationalExpression ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getXRelationalExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2014);
            this_XRelationalExpression_0=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XRelationalExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:1: ( ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred5_InternalInstances()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==21) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred5_InternalInstances()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) ) ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:2: ( ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:3: ( ( () ( ( ruleOpEquality ) ) ) )=> ( () ( ( ruleOpEquality ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:901:6: ( () ( ( ruleOpEquality ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:901:7: () ( ( ruleOpEquality ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:901:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:902:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:907:2: ( ( ruleOpEquality ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:908:1: ( ruleOpEquality )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:908:1: ( ruleOpEquality )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:909:3: ruleOpEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2067);
            	    ruleOpEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:922:4: ( (lv_rightOperand_3_0= ruleXRelationalExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:923:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:923:1: (lv_rightOperand_3_0= ruleXRelationalExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:924:3: lv_rightOperand_3_0= ruleXRelationalExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXEqualityExpressionAccess().getRightOperandXRelationalExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2090);
            	    lv_rightOperand_3_0=ruleXRelationalExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXEqualityExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XRelationalExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXEqualityExpression"


    // $ANTLR start "entryRuleOpEquality"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:948:1: entryRuleOpEquality returns [String current=null] : iv_ruleOpEquality= ruleOpEquality EOF ;
    public final String entryRuleOpEquality() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpEquality = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:949:2: (iv_ruleOpEquality= ruleOpEquality EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:950:2: iv_ruleOpEquality= ruleOpEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleOpEquality_in_entryRuleOpEquality2129);
            iv_ruleOpEquality=ruleOpEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpEquality.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpEquality2140); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpEquality"


    // $ANTLR start "ruleOpEquality"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:957:1: ruleOpEquality returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleOpEquality() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:960:28: ( (kw= '==' | kw= '!=' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:961:1: (kw= '==' | kw= '!=' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:961:1: (kw= '==' | kw= '!=' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            else if ( (LA11_0==21) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:962:2: kw= '=='
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleOpEquality2178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:969:2: kw= '!='
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleOpEquality2197); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpEqualityAccess().getExclamationMarkEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpEquality"


    // $ANTLR start "entryRuleXRelationalExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:982:1: entryRuleXRelationalExpression returns [EObject current=null] : iv_ruleXRelationalExpression= ruleXRelationalExpression EOF ;
    public final EObject entryRuleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXRelationalExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:983:2: (iv_ruleXRelationalExpression= ruleXRelationalExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:984:2: iv_ruleXRelationalExpression= ruleXRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2237);
            iv_ruleXRelationalExpression=ruleXRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXRelationalExpression2247); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXRelationalExpression"


    // $ANTLR start "ruleXRelationalExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:991:1: ruleXRelationalExpression returns [EObject current=null] : (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) ;
    public final EObject ruleXRelationalExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XOtherOperatorExpression_0 = null;

        EObject lv_rightOperand_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:994:28: ( (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:995:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:995:1: (this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:996:5: this_XOtherOperatorExpression_0= ruleXOtherOperatorExpression ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getXOtherOperatorExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2294);
            this_XOtherOperatorExpression_0=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XOtherOperatorExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:1: ( ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) ) | ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) ) )*
            loop12:
            do {
                int alt12=3;
                switch ( input.LA(1) ) {
                case 26:
                    {
                    int LA12_2 = input.LA(2);

                    if ( (synpred7_InternalInstances()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA12_3 = input.LA(2);

                    if ( (synpred6_InternalInstances()) ) {
                        alt12=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA12_4 = input.LA(2);

                    if ( (synpred7_InternalInstances()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA12_5 = input.LA(2);

                    if ( (synpred7_InternalInstances()) ) {
                        alt12=2;
                    }


                    }
                    break;
                case 25:
                    {
                    int LA12_6 = input.LA(2);

                    if ( (synpred7_InternalInstances()) ) {
                        alt12=2;
                    }


                    }
                    break;

                }

                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:2: ( ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) ) ( ( ruleQualifiedName ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:3: ( ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:4: ( ( () 'instanceof' ) )=> ( () otherlv_2= 'instanceof' )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1006:5: ( () otherlv_2= 'instanceof' )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1006:6: () otherlv_2= 'instanceof'
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1006:6: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1007:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleXRelationalExpression2330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXRelationalExpressionAccess().getInstanceofKeyword_1_0_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1016:3: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1017:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1017:1: ( ruleQualifiedName )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1018:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getTypeJvmTypeCrossReference_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2355);
            	    ruleQualifiedName();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:6: ( ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) ) ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:7: ( ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:8: ( ( () ( ( ruleOpCompare ) ) ) )=> ( () ( ( ruleOpCompare ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1037:6: ( () ( ( ruleOpCompare ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1037:7: () ( ( ruleOpCompare ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1037:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1038:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1043:2: ( ( ruleOpCompare ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1044:1: ( ruleOpCompare )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1044:1: ( ruleOpCompare )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1045:3: ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2416);
            	    ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1058:4: ( (lv_rightOperand_6_0= ruleXOtherOperatorExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1059:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1059:1: (lv_rightOperand_6_0= ruleXOtherOperatorExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1060:3: lv_rightOperand_6_0= ruleXOtherOperatorExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXRelationalExpressionAccess().getRightOperandXOtherOperatorExpressionParserRuleCall_1_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2439);
            	    lv_rightOperand_6_0=ruleXOtherOperatorExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_6_0, 
            	              		"XOtherOperatorExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXRelationalExpression"


    // $ANTLR start "entryRuleOpCompare"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1084:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1085:2: (iv_ruleOpCompare= ruleOpCompare EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1086:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_ruleOpCompare_in_entryRuleOpCompare2479);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpCompare2490); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1093:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1096:28: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1097:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1097:1: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            case 26:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1098:2: kw= '>='
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleOpCompare2528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1105:2: kw= '<='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleOpCompare2547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1112:2: kw= '>'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleOpCompare2566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1119:2: kw= '<'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleOpCompare2585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleXOtherOperatorExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1132:1: entryRuleXOtherOperatorExpression returns [EObject current=null] : iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF ;
    public final EObject entryRuleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOtherOperatorExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1133:2: (iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1134:2: iv_ruleXOtherOperatorExpression= ruleXOtherOperatorExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOtherOperatorExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2625);
            iv_ruleXOtherOperatorExpression=ruleXOtherOperatorExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOtherOperatorExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2635); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOtherOperatorExpression"


    // $ANTLR start "ruleXOtherOperatorExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1141:1: ruleXOtherOperatorExpression returns [EObject current=null] : (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) ;
    public final EObject ruleXOtherOperatorExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XAdditiveExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1144:28: ( (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1145:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1145:1: (this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1146:5: this_XAdditiveExpression_0= ruleXAdditiveExpression ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getXAdditiveExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2682);
            this_XAdditiveExpression_0=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XAdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:1: ( ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==27) ) {
                    int LA14_2 = input.LA(2);

                    if ( (synpred8_InternalInstances()) ) {
                        alt14=1;
                    }


                }
                else if ( (LA14_0==28) ) {
                    int LA14_3 = input.LA(2);

                    if ( (synpred8_InternalInstances()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) ) ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:2: ( ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:3: ( ( () ( ( ruleOpOther ) ) ) )=> ( () ( ( ruleOpOther ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1159:6: ( () ( ( ruleOpOther ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1159:7: () ( ( ruleOpOther ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1159:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1160:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1165:2: ( ( ruleOpOther ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1166:1: ( ruleOpOther )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1166:1: ( ruleOpOther )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1167:3: ruleOpOther
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2735);
            	    ruleOpOther();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1180:4: ( (lv_rightOperand_3_0= ruleXAdditiveExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1181:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1181:1: (lv_rightOperand_3_0= ruleXAdditiveExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1182:3: lv_rightOperand_3_0= ruleXAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXOtherOperatorExpressionAccess().getRightOperandXAdditiveExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2758);
            	    lv_rightOperand_3_0=ruleXAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXOtherOperatorExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XAdditiveExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOtherOperatorExpression"


    // $ANTLR start "entryRuleOpOther"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1206:1: entryRuleOpOther returns [String current=null] : iv_ruleOpOther= ruleOpOther EOF ;
    public final String entryRuleOpOther() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOther = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1207:2: (iv_ruleOpOther= ruleOpOther EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1208:2: iv_ruleOpOther= ruleOpOther EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOtherRule()); 
            }
            pushFollow(FOLLOW_ruleOpOther_in_entryRuleOpOther2797);
            iv_ruleOpOther=ruleOpOther();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOther.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpOther2808); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpOther"


    // $ANTLR start "ruleOpOther"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1215:1: ruleOpOther returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '->' | kw= '..' ) ;
    public final AntlrDatatypeRuleToken ruleOpOther() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1218:28: ( (kw= '->' | kw= '..' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1219:1: (kw= '->' | kw= '..' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1219:1: (kw= '->' | kw= '..' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==28) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1220:2: kw= '->'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleOpOther2846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1227:2: kw= '..'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleOpOther2865); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpOtherAccess().getFullStopFullStopKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpOther"


    // $ANTLR start "entryRuleXAdditiveExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1240:1: entryRuleXAdditiveExpression returns [EObject current=null] : iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF ;
    public final EObject entryRuleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXAdditiveExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1241:2: (iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1242:2: iv_ruleXAdditiveExpression= ruleXAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2905);
            iv_ruleXAdditiveExpression=ruleXAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXAdditiveExpression2915); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXAdditiveExpression"


    // $ANTLR start "ruleXAdditiveExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1249:1: ruleXAdditiveExpression returns [EObject current=null] : (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleXAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XMultiplicativeExpression_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1252:28: ( (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1253:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1253:1: (this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1254:5: this_XMultiplicativeExpression_0= ruleXMultiplicativeExpression ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getXMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2962);
            this_XMultiplicativeExpression_0=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:1: ( ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    int LA16_2 = input.LA(2);

                    if ( (synpred9_InternalInstances()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==29) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred9_InternalInstances()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) ) ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:2: ( ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:3: ( ( () ( ( ruleOpAdd ) ) ) )=> ( () ( ( ruleOpAdd ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1267:6: ( () ( ( ruleOpAdd ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1267:7: () ( ( ruleOpAdd ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1267:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1268:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1273:2: ( ( ruleOpAdd ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1274:1: ( ruleOpAdd )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1274:1: ( ruleOpAdd )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1275:3: ruleOpAdd
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3015);
            	    ruleOpAdd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1288:4: ( (lv_rightOperand_3_0= ruleXMultiplicativeExpression ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1289:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1289:1: (lv_rightOperand_3_0= ruleXMultiplicativeExpression )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1290:3: lv_rightOperand_3_0= ruleXMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXAdditiveExpressionAccess().getRightOperandXMultiplicativeExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3038);
            	    lv_rightOperand_3_0=ruleXMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XMultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXAdditiveExpression"


    // $ANTLR start "entryRuleOpAdd"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1314:1: entryRuleOpAdd returns [String current=null] : iv_ruleOpAdd= ruleOpAdd EOF ;
    public final String entryRuleOpAdd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAdd = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1315:2: (iv_ruleOpAdd= ruleOpAdd EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1316:2: iv_ruleOpAdd= ruleOpAdd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAddRule()); 
            }
            pushFollow(FOLLOW_ruleOpAdd_in_entryRuleOpAdd3077);
            iv_ruleOpAdd=ruleOpAdd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAdd.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpAdd3088); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpAdd"


    // $ANTLR start "ruleOpAdd"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1323:1: ruleOpAdd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOpAdd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1326:28: ( (kw= '+' | kw= '-' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1327:1: (kw= '+' | kw= '-' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1327:1: (kw= '+' | kw= '-' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            else if ( (LA17_0==30) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1328:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpAdd3126); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1335:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpAdd3145); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpAddAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpAdd"


    // $ANTLR start "entryRuleXMultiplicativeExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1348:1: entryRuleXMultiplicativeExpression returns [EObject current=null] : iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF ;
    public final EObject entryRuleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiplicativeExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1349:2: (iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1350:2: iv_ruleXMultiplicativeExpression= ruleXMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3185);
            iv_ruleXMultiplicativeExpression=ruleXMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3195); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMultiplicativeExpression"


    // $ANTLR start "ruleXMultiplicativeExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1357:1: ruleXMultiplicativeExpression returns [EObject current=null] : (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) ;
    public final EObject ruleXMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XUnaryOperation_0 = null;

        EObject lv_rightOperand_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1360:28: ( (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1361:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1361:1: (this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1362:5: this_XUnaryOperation_0= ruleXUnaryOperation ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getXUnaryOperationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3242);
            this_XUnaryOperation_0=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XUnaryOperation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:1: ( ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) ) )*
            loop18:
            do {
                int alt18=2;
                switch ( input.LA(1) ) {
                case 31:
                    {
                    int LA18_2 = input.LA(2);

                    if ( (synpred10_InternalInstances()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 32:
                    {
                    int LA18_3 = input.LA(2);

                    if ( (synpred10_InternalInstances()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 33:
                    {
                    int LA18_4 = input.LA(2);

                    if ( (synpred10_InternalInstances()) ) {
                        alt18=1;
                    }


                    }
                    break;
                case 34:
                    {
                    int LA18_5 = input.LA(2);

                    if ( (synpred10_InternalInstances()) ) {
                        alt18=1;
                    }


                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) ) ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:2: ( ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:3: ( ( () ( ( ruleOpMulti ) ) ) )=> ( () ( ( ruleOpMulti ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1375:6: ( () ( ( ruleOpMulti ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1375:7: () ( ( ruleOpMulti ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1375:7: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1376:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1381:2: ( ( ruleOpMulti ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1382:1: ( ruleOpMulti )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1382:1: ( ruleOpMulti )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1383:3: ruleOpMulti
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3295);
            	    ruleOpMulti();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1396:4: ( (lv_rightOperand_3_0= ruleXUnaryOperation ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1397:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1397:1: (lv_rightOperand_3_0= ruleXUnaryOperation )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1398:3: lv_rightOperand_3_0= ruleXUnaryOperation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMultiplicativeExpressionAccess().getRightOperandXUnaryOperationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3318);
            	    lv_rightOperand_3_0=ruleXUnaryOperation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rightOperand",
            	              		lv_rightOperand_3_0, 
            	              		"XUnaryOperation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMultiplicativeExpression"


    // $ANTLR start "entryRuleOpMulti"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1422:1: entryRuleOpMulti returns [String current=null] : iv_ruleOpMulti= ruleOpMulti EOF ;
    public final String entryRuleOpMulti() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpMulti = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1423:2: (iv_ruleOpMulti= ruleOpMulti EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1424:2: iv_ruleOpMulti= ruleOpMulti EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpMultiRule()); 
            }
            pushFollow(FOLLOW_ruleOpMulti_in_entryRuleOpMulti3357);
            iv_ruleOpMulti=ruleOpMulti();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpMulti.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpMulti3368); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpMulti"


    // $ANTLR start "ruleOpMulti"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1431:1: ruleOpMulti returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) ;
    public final AntlrDatatypeRuleToken ruleOpMulti() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1434:28: ( (kw= '*' | kw= '**' | kw= '/' | kw= '%' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1435:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1435:1: (kw= '*' | kw= '**' | kw= '/' | kw= '%' )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt19=1;
                }
                break;
            case 32:
                {
                alt19=2;
                }
                break;
            case 33:
                {
                alt19=3;
                }
                break;
            case 34:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1436:2: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleOpMulti3406); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1443:2: kw= '**'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleOpMulti3425); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getAsteriskAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1450:2: kw= '/'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleOpMulti3444); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getSolidusKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1457:2: kw= '%'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleOpMulti3463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpMultiAccess().getPercentSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpMulti"


    // $ANTLR start "entryRuleXUnaryOperation"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1470:1: entryRuleXUnaryOperation returns [EObject current=null] : iv_ruleXUnaryOperation= ruleXUnaryOperation EOF ;
    public final EObject entryRuleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXUnaryOperation = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1471:2: (iv_ruleXUnaryOperation= ruleXUnaryOperation EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1472:2: iv_ruleXUnaryOperation= ruleXUnaryOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXUnaryOperationRule()); 
            }
            pushFollow(FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3503);
            iv_ruleXUnaryOperation=ruleXUnaryOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXUnaryOperation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXUnaryOperation3513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXUnaryOperation"


    // $ANTLR start "ruleXUnaryOperation"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1479:1: ruleXUnaryOperation returns [EObject current=null] : ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) ;
    public final EObject ruleXUnaryOperation() throws RecognitionException {
        EObject current = null;

        EObject lv_operand_2_0 = null;

        EObject this_XCastedExpression_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1482:28: ( ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:1: ( ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) ) | this_XCastedExpression_3= ruleXCastedExpression )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=29 && LA20_0<=30)||LA20_0==35) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_INT && LA20_0<=RULE_STRING)||LA20_0==15||LA20_0==26||LA20_0==40||LA20_0==42||LA20_0==45||LA20_0==47||(LA20_0>=51 && LA20_0<=54)||(LA20_0>=56 && LA20_0<=63)) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:2: ( () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:3: () ( ( ruleOpUnary ) ) ( (lv_operand_2_0= ruleXCastedExpression ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1483:3: ()
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1484:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getXUnaryOperationAccess().getXUnaryOperationAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1489:2: ( ( ruleOpUnary ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1490:1: ( ruleOpUnary )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1490:1: ( ruleOpUnary )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1491:3: ruleOpUnary
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXUnaryOperationRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getFeatureJvmIdentifiableElementCrossReference_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3571);
                    ruleOpUnary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1504:2: ( (lv_operand_2_0= ruleXCastedExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1505:1: (lv_operand_2_0= ruleXCastedExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1505:1: (lv_operand_2_0= ruleXCastedExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1506:3: lv_operand_2_0= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXUnaryOperationAccess().getOperandXCastedExpressionParserRuleCall_0_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3592);
                    lv_operand_2_0=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXUnaryOperationRule());
                      	        }
                             		set(
                             			current, 
                             			"operand",
                              		lv_operand_2_0, 
                              		"XCastedExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1524:5: this_XCastedExpression_3= ruleXCastedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXUnaryOperationAccess().getXCastedExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3621);
                    this_XCastedExpression_3=ruleXCastedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XCastedExpression_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXUnaryOperation"


    // $ANTLR start "entryRuleOpUnary"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1540:1: entryRuleOpUnary returns [String current=null] : iv_ruleOpUnary= ruleOpUnary EOF ;
    public final String entryRuleOpUnary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpUnary = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1541:2: (iv_ruleOpUnary= ruleOpUnary EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1542:2: iv_ruleOpUnary= ruleOpUnary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpUnaryRule()); 
            }
            pushFollow(FOLLOW_ruleOpUnary_in_entryRuleOpUnary3657);
            iv_ruleOpUnary=ruleOpUnary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpUnary.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpUnary3668); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOpUnary"


    // $ANTLR start "ruleOpUnary"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1549:1: ruleOpUnary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= '-' | kw= '+' ) ;
    public final AntlrDatatypeRuleToken ruleOpUnary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1552:28: ( (kw= '!' | kw= '-' | kw= '+' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1553:1: (kw= '!' | kw= '-' | kw= '+' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1553:1: (kw= '!' | kw= '-' | kw= '+' )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt21=1;
                }
                break;
            case 30:
                {
                alt21=2;
                }
                break;
            case 29:
                {
                alt21=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1554:2: kw= '!'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleOpUnary3706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getExclamationMarkKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1561:2: kw= '-'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleOpUnary3725); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1568:2: kw= '+'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleOpUnary3744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getOpUnaryAccess().getPlusSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOpUnary"


    // $ANTLR start "entryRuleXCastedExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1581:1: entryRuleXCastedExpression returns [EObject current=null] : iv_ruleXCastedExpression= ruleXCastedExpression EOF ;
    public final EObject entryRuleXCastedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCastedExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1582:2: (iv_ruleXCastedExpression= ruleXCastedExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1583:2: iv_ruleXCastedExpression= ruleXCastedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCastedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3784);
            iv_ruleXCastedExpression=ruleXCastedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCastedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCastedExpression3794); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCastedExpression"


    // $ANTLR start "ruleXCastedExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1590:1: ruleXCastedExpression returns [EObject current=null] : (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) ;
    public final EObject ruleXCastedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_XMemberFeatureCall_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1593:28: ( (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1594:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1594:1: (this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1595:5: this_XMemberFeatureCall_0= ruleXMemberFeatureCall ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXCastedExpressionAccess().getXMemberFeatureCallParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3841);
            this_XMemberFeatureCall_0=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XMemberFeatureCall_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:1: ( ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    int LA22_2 = input.LA(2);

                    if ( (synpred11_InternalInstances()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) ) ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:2: ( ( ( () 'as' ) )=> ( () otherlv_2= 'as' ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:3: ( ( () 'as' ) )=> ( () otherlv_2= 'as' )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1605:5: ( () otherlv_2= 'as' )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1605:6: () otherlv_2= 'as'
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1605:6: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1606:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXCastedExpression3876); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXCastedExpressionAccess().getAsKeyword_1_0_0_1());
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1615:3: ( (lv_type_3_0= ruleJvmTypeReference ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1616:1: (lv_type_3_0= ruleJvmTypeReference )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1616:1: (lv_type_3_0= ruleJvmTypeReference )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1617:3: lv_type_3_0= ruleJvmTypeReference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXCastedExpressionAccess().getTypeJvmTypeReferenceParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3899);
            	    lv_type_3_0=ruleJvmTypeReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXCastedExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"type",
            	              		lv_type_3_0, 
            	              		"JvmTypeReference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCastedExpression"


    // $ANTLR start "entryRuleXMemberFeatureCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1641:1: entryRuleXMemberFeatureCall returns [EObject current=null] : iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF ;
    public final EObject entryRuleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMemberFeatureCall = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1642:2: (iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1643:2: iv_ruleXMemberFeatureCall= ruleXMemberFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXMemberFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3937);
            iv_ruleXMemberFeatureCall=ruleXMemberFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXMemberFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXMemberFeatureCall3947); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXMemberFeatureCall"


    // $ANTLR start "ruleXMemberFeatureCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1650:1: ruleXMemberFeatureCall returns [EObject current=null] : (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) ;
    public final EObject ruleXMemberFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token lv_nullSafe_8_0=null;
        Token lv_spreading_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_explicitOperationCall_16_0=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject this_XPrimaryExpression_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_typeArguments_11_0 = null;

        EObject lv_typeArguments_13_0 = null;

        EObject lv_memberCallArguments_17_0 = null;

        EObject lv_memberCallArguments_18_0 = null;

        EObject lv_memberCallArguments_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1653:28: ( (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1654:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1654:1: (this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1655:5: this_XPrimaryExpression_0= ruleXPrimaryExpression ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getXPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3994);
            this_XPrimaryExpression_0=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XPrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:1: ( ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) ) | ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? ) )*
            loop29:
            do {
                int alt29=3;
                switch ( input.LA(1) ) {
                case 13:
                    {
                    int LA29_2 = input.LA(2);

                    if ( (synpred12_InternalInstances()) ) {
                        alt29=1;
                    }
                    else if ( (synpred13_InternalInstances()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 37:
                    {
                    int LA29_3 = input.LA(2);

                    if ( (synpred13_InternalInstances()) ) {
                        alt29=2;
                    }


                    }
                    break;
                case 38:
                    {
                    int LA29_4 = input.LA(2);

                    if ( (synpred13_InternalInstances()) ) {
                        alt29=2;
                    }


                    }
                    break;

                }

                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:2: ( ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) ) ( (lv_value_5_0= ruleXAssignment ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:3: ( ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )=> ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1670:25: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1670:26: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ruleOpSingleAssign
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1670:26: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1671:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4043); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_0_0_0_1());
            	          
            	    }
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1680:1: ( (otherlv_3= RULE_ID ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1681:1: (otherlv_3= RULE_ID )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1681:1: (otherlv_3= RULE_ID )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1682:3: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4063); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_3, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_0_0_0_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    if ( state.backtracking==0 ) {
            	       
            	              newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getOpSingleAssignParserRuleCall_1_0_0_0_3()); 
            	          
            	    }
            	    pushFollow(FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4079);
            	    ruleOpSingleAssign();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	              afterParserOrEnumRuleCall();
            	          
            	    }

            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1701:3: ( (lv_value_5_0= ruleXAssignment ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1702:1: (lv_value_5_0= ruleXAssignment )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1702:1: (lv_value_5_0= ruleXAssignment )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1703:3: lv_value_5_0= ruleXAssignment
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getValueXAssignmentParserRuleCall_1_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4101);
            	    lv_value_5_0=ruleXAssignment();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"value",
            	              		lv_value_5_0, 
            	              		"XAssignment");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:6: ( ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )? )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) ) (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )? ( (otherlv_15= RULE_ID ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:7: ( ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )=> ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1736:7: ( () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1736:8: () (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1736:8: ()
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1737:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1742:2: (otherlv_7= '.' | ( (lv_nullSafe_8_0= '?.' ) ) | ( (lv_spreading_9_0= '*.' ) ) )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 37:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 38:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1742:4: otherlv_7= '.'
            	            {
            	            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleXMemberFeatureCall4187); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_7, grammarAccess.getXMemberFeatureCallAccess().getFullStopKeyword_1_1_0_0_1_0());
            	                  
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1747:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1747:6: ( (lv_nullSafe_8_0= '?.' ) )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1748:1: (lv_nullSafe_8_0= '?.' )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1748:1: (lv_nullSafe_8_0= '?.' )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1749:3: lv_nullSafe_8_0= '?.'
            	            {
            	            lv_nullSafe_8_0=(Token)match(input,37,FOLLOW_37_in_ruleXMemberFeatureCall4211); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_nullSafe_8_0, grammarAccess.getXMemberFeatureCallAccess().getNullSafeQuestionMarkFullStopKeyword_1_1_0_0_1_1_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "nullSafe", true, "?.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1763:6: ( (lv_spreading_9_0= '*.' ) )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1763:6: ( (lv_spreading_9_0= '*.' ) )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1764:1: (lv_spreading_9_0= '*.' )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1764:1: (lv_spreading_9_0= '*.' )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1765:3: lv_spreading_9_0= '*.'
            	            {
            	            lv_spreading_9_0=(Token)match(input,38,FOLLOW_38_in_ruleXMemberFeatureCall4248); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_spreading_9_0, grammarAccess.getXMemberFeatureCallAccess().getSpreadingAsteriskFullStopKeyword_1_1_0_0_1_2_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "spreading", true, "*.");
            	              	    
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1778:5: (otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>' )?
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==26) ) {
            	        alt25=1;
            	    }
            	    switch (alt25) {
            	        case 1 :
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1778:7: otherlv_10= '<' ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) ) (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )* otherlv_14= '>'
            	            {
            	            otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleXMemberFeatureCall4277); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_10, grammarAccess.getXMemberFeatureCallAccess().getLessThanSignKeyword_1_1_1_0());
            	                  
            	            }
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1782:1: ( (lv_typeArguments_11_0= ruleJvmArgumentTypeReference ) )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1783:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1783:1: (lv_typeArguments_11_0= ruleJvmArgumentTypeReference )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1784:3: lv_typeArguments_11_0= ruleJvmArgumentTypeReference
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4298);
            	            lv_typeArguments_11_0=ruleJvmArgumentTypeReference();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"typeArguments",
            	                      		lv_typeArguments_11_0, 
            	                      		"JvmArgumentTypeReference");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1800:2: (otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) ) )*
            	            loop24:
            	            do {
            	                int alt24=2;
            	                int LA24_0 = input.LA(1);

            	                if ( (LA24_0==39) ) {
            	                    alt24=1;
            	                }


            	                switch (alt24) {
            	            	case 1 :
            	            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1800:4: otherlv_12= ',' ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    {
            	            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4311); if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	          	newLeafNode(otherlv_12, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_1_2_0());
            	            	          
            	            	    }
            	            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1804:1: ( (lv_typeArguments_13_0= ruleJvmArgumentTypeReference ) )
            	            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1805:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    {
            	            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1805:1: (lv_typeArguments_13_0= ruleJvmArgumentTypeReference )
            	            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1806:3: lv_typeArguments_13_0= ruleJvmArgumentTypeReference
            	            	    {
            	            	    if ( state.backtracking==0 ) {
            	            	       
            	            	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_1_2_1_0()); 
            	            	      	    
            	            	    }
            	            	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4332);
            	            	    lv_typeArguments_13_0=ruleJvmArgumentTypeReference();

            	            	    state._fsp--;
            	            	    if (state.failed) return current;
            	            	    if ( state.backtracking==0 ) {

            	            	      	        if (current==null) {
            	            	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	            	      	        }
            	            	             		add(
            	            	             			current, 
            	            	             			"typeArguments",
            	            	              		lv_typeArguments_13_0, 
            	            	              		"JvmArgumentTypeReference");
            	            	      	        afterParserOrEnumRuleCall();
            	            	      	    
            	            	    }

            	            	    }


            	            	    }


            	            	    }
            	            	    break;

            	            	default :
            	            	    break loop24;
            	                }
            	            } while (true);

            	            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleXMemberFeatureCall4346); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_14, grammarAccess.getXMemberFeatureCallAccess().getGreaterThanSignKeyword_1_1_1_3());
            	                  
            	            }

            	            }
            	            break;

            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1826:3: ( (otherlv_15= RULE_ID ) )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1827:1: (otherlv_15= RULE_ID )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1827:1: (otherlv_15= RULE_ID )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1828:3: otherlv_15= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	      	        }
            	              
            	    }
            	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4368); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_15, grammarAccess.getXMemberFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_1_1_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1839:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?
            	    int alt28=2;
            	    alt28 = dfa28.predict(input);
            	    switch (alt28) {
            	        case 1 :
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1839:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')'
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1839:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1839:4: ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' )
            	            {
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1846:1: (lv_explicitOperationCall_16_0= '(' )
            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1847:3: lv_explicitOperationCall_16_0= '('
            	            {
            	            lv_explicitOperationCall_16_0=(Token)match(input,40,FOLLOW_40_in_ruleXMemberFeatureCall4402); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_explicitOperationCall_16_0, grammarAccess.getXMemberFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_1_1_3_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getXMemberFeatureCallRule());
            	              	        }
            	                     		setWithLastConsumed(current, "explicitOperationCall", true, "(");
            	              	    
            	            }

            	            }


            	            }

            	            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?
            	            int alt27=3;
            	            alt27 = dfa27.predict(input);
            	            switch (alt27) {
            	                case 1 :
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    {
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) )
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    {
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1872:1: (lv_memberCallArguments_17_0= ruleXShortClosure )
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1873:3: lv_memberCallArguments_17_0= ruleXShortClosure
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXShortClosureParserRuleCall_1_1_3_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4477);
            	                    lv_memberCallArguments_17_0=ruleXShortClosure();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_17_0, 
            	                              		"XShortClosure");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1890:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    {
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1890:6: ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* )
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1890:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    {
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1890:7: ( (lv_memberCallArguments_18_0= ruleXExpression ) )
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1891:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    {
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1891:1: (lv_memberCallArguments_18_0= ruleXExpression )
            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1892:3: lv_memberCallArguments_18_0= ruleXExpression
            	                    {
            	                    if ( state.backtracking==0 ) {
            	                       
            	                      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_0_0()); 
            	                      	    
            	                    }
            	                    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4505);
            	                    lv_memberCallArguments_18_0=ruleXExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      	        if (current==null) {
            	                      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                      	        }
            	                             		add(
            	                             			current, 
            	                             			"memberCallArguments",
            	                              		lv_memberCallArguments_18_0, 
            	                              		"XExpression");
            	                      	        afterParserOrEnumRuleCall();
            	                      	    
            	                    }

            	                    }


            	                    }

            	                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1908:2: (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )*
            	                    loop26:
            	                    do {
            	                        int alt26=2;
            	                        int LA26_0 = input.LA(1);

            	                        if ( (LA26_0==39) ) {
            	                            alt26=1;
            	                        }


            	                        switch (alt26) {
            	                    	case 1 :
            	                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1908:4: otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    {
            	                    	    otherlv_19=(Token)match(input,39,FOLLOW_39_in_ruleXMemberFeatureCall4518); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	          	newLeafNode(otherlv_19, grammarAccess.getXMemberFeatureCallAccess().getCommaKeyword_1_1_3_1_1_1_0());
            	                    	          
            	                    	    }
            	                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1912:1: ( (lv_memberCallArguments_20_0= ruleXExpression ) )
            	                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1913:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    {
            	                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1913:1: (lv_memberCallArguments_20_0= ruleXExpression )
            	                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1914:3: lv_memberCallArguments_20_0= ruleXExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {
            	                    	       
            	                    	      	        newCompositeNode(grammarAccess.getXMemberFeatureCallAccess().getMemberCallArgumentsXExpressionParserRuleCall_1_1_3_1_1_1_1_0()); 
            	                    	      	    
            	                    	    }
            	                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4539);
            	                    	    lv_memberCallArguments_20_0=ruleXExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      	        if (current==null) {
            	                    	      	            current = createModelElementForParent(grammarAccess.getXMemberFeatureCallRule());
            	                    	      	        }
            	                    	             		add(
            	                    	             			current, 
            	                    	             			"memberCallArguments",
            	                    	              		lv_memberCallArguments_20_0, 
            	                    	              		"XExpression");
            	                    	      	        afterParserOrEnumRuleCall();
            	                    	      	    
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop26;
            	                        }
            	                    } while (true);


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_21=(Token)match(input,41,FOLLOW_41_in_ruleXMemberFeatureCall4556); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_21, grammarAccess.getXMemberFeatureCallAccess().getRightParenthesisKeyword_1_1_3_2());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXMemberFeatureCall"


    // $ANTLR start "entryRuleXPrimaryExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1942:1: entryRuleXPrimaryExpression returns [EObject current=null] : iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF ;
    public final EObject entryRuleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXPrimaryExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1943:2: (iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1944:2: iv_ruleXPrimaryExpression= ruleXPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4597);
            iv_ruleXPrimaryExpression=ruleXPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXPrimaryExpression4607); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXPrimaryExpression"


    // $ANTLR start "ruleXPrimaryExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1951:1: ruleXPrimaryExpression returns [EObject current=null] : (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) ;
    public final EObject ruleXPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject this_XConstructorCall_0 = null;

        EObject this_XBlockExpression_1 = null;

        EObject this_XSwitchExpression_2 = null;

        EObject this_XFeatureCall_3 = null;

        EObject this_XLiteral_4 = null;

        EObject this_XIfExpression_5 = null;

        EObject this_XForLoopExpression_6 = null;

        EObject this_XWhileExpression_7 = null;

        EObject this_XDoWhileExpression_8 = null;

        EObject this_XThrowExpression_9 = null;

        EObject this_XReturnExpression_10 = null;

        EObject this_XTryCatchFinallyExpression_11 = null;

        EObject this_XParenthesizedExpression_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1954:28: ( (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1955:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1955:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )
            int alt30=13;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1956:5: this_XConstructorCall_0= ruleXConstructorCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXConstructorCallParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4654);
                    this_XConstructorCall_0=ruleXConstructorCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XConstructorCall_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1966:5: this_XBlockExpression_1= ruleXBlockExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXBlockExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4681);
                    this_XBlockExpression_1=ruleXBlockExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBlockExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1976:5: this_XSwitchExpression_2= ruleXSwitchExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXSwitchExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4708);
                    this_XSwitchExpression_2=ruleXSwitchExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XSwitchExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1986:5: this_XFeatureCall_3= ruleXFeatureCall
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXFeatureCallParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4735);
                    this_XFeatureCall_3=ruleXFeatureCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFeatureCall_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1996:5: this_XLiteral_4= ruleXLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4762);
                    this_XLiteral_4=ruleXLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2006:5: this_XIfExpression_5= ruleXIfExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXIfExpressionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4789);
                    this_XIfExpression_5=ruleXIfExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIfExpression_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2016:5: this_XForLoopExpression_6= ruleXForLoopExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXForLoopExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4816);
                    this_XForLoopExpression_6=ruleXForLoopExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XForLoopExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2026:5: this_XWhileExpression_7= ruleXWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXWhileExpressionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4843);
                    this_XWhileExpression_7=ruleXWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XWhileExpression_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 9 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2036:5: this_XDoWhileExpression_8= ruleXDoWhileExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXDoWhileExpressionParserRuleCall_8()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4870);
                    this_XDoWhileExpression_8=ruleXDoWhileExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XDoWhileExpression_8; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 10 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2046:5: this_XThrowExpression_9= ruleXThrowExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXThrowExpressionParserRuleCall_9()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4897);
                    this_XThrowExpression_9=ruleXThrowExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XThrowExpression_9; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 11 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2056:5: this_XReturnExpression_10= ruleXReturnExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXReturnExpressionParserRuleCall_10()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4924);
                    this_XReturnExpression_10=ruleXReturnExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XReturnExpression_10; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 12 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2066:5: this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXTryCatchFinallyExpressionParserRuleCall_11()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4951);
                    this_XTryCatchFinallyExpression_11=ruleXTryCatchFinallyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTryCatchFinallyExpression_11; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 13 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2076:5: this_XParenthesizedExpression_12= ruleXParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXPrimaryExpressionAccess().getXParenthesizedExpressionParserRuleCall_12()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4978);
                    this_XParenthesizedExpression_12=ruleXParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XParenthesizedExpression_12; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXPrimaryExpression"


    // $ANTLR start "entryRuleXLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2092:1: entryRuleXLiteral returns [EObject current=null] : iv_ruleXLiteral= ruleXLiteral EOF ;
    public final EObject entryRuleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2093:2: (iv_ruleXLiteral= ruleXLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2094:2: iv_ruleXLiteral= ruleXLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXLiteral_in_entryRuleXLiteral5013);
            iv_ruleXLiteral=ruleXLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXLiteral5023); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXLiteral"


    // $ANTLR start "ruleXLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2101:1: ruleXLiteral returns [EObject current=null] : (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) ;
    public final EObject ruleXLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_XClosure_0 = null;

        EObject this_XBooleanLiteral_1 = null;

        EObject this_XIntLiteral_2 = null;

        EObject this_XNullLiteral_3 = null;

        EObject this_XStringLiteral_4 = null;

        EObject this_XTypeLiteral_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2104:28: ( (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2105:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2105:1: (this_XClosure_0= ruleXClosure | this_XBooleanLiteral_1= ruleXBooleanLiteral | this_XIntLiteral_2= ruleXIntLiteral | this_XNullLiteral_3= ruleXNullLiteral | this_XStringLiteral_4= ruleXStringLiteral | this_XTypeLiteral_5= ruleXTypeLiteral )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt31=1;
                }
                break;
            case 57:
            case 58:
                {
                alt31=2;
                }
                break;
            case RULE_INT:
                {
                alt31=3;
                }
                break;
            case 59:
                {
                alt31=4;
                }
                break;
            case RULE_STRING:
                {
                alt31=5;
                }
                break;
            case 60:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2106:5: this_XClosure_0= ruleXClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXClosureParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXClosure_in_ruleXLiteral5070);
                    this_XClosure_0=ruleXClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XClosure_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2116:5: this_XBooleanLiteral_1= ruleXBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5097);
                    this_XBooleanLiteral_1=ruleXBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2126:5: this_XIntLiteral_2= ruleXIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXIntLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXIntLiteral_in_ruleXLiteral5124);
                    this_XIntLiteral_2=ruleXIntLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XIntLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2136:5: this_XNullLiteral_3= ruleXNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXNullLiteral_in_ruleXLiteral5151);
                    this_XNullLiteral_3=ruleXNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XNullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2146:5: this_XStringLiteral_4= ruleXStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXStringLiteral_in_ruleXLiteral5178);
                    this_XStringLiteral_4=ruleXStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XStringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2156:5: this_XTypeLiteral_5= ruleXTypeLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getXLiteralAccess().getXTypeLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5205);
                    this_XTypeLiteral_5=ruleXTypeLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XTypeLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXLiteral"


    // $ANTLR start "entryRuleXClosure"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2172:1: entryRuleXClosure returns [EObject current=null] : iv_ruleXClosure= ruleXClosure EOF ;
    public final EObject entryRuleXClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXClosure = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2173:2: (iv_ruleXClosure= ruleXClosure EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2174:2: iv_ruleXClosure= ruleXClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXClosure_in_entryRuleXClosure5240);
            iv_ruleXClosure=ruleXClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXClosure5250); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXClosure"


    // $ANTLR start "ruleXClosure"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2181:1: ruleXClosure returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) ;
    public final EObject ruleXClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_formalParameters_2_0 = null;

        EObject lv_formalParameters_4_0 = null;

        EObject lv_expression_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2184:28: ( ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2185:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2185:1: ( () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2185:2: () otherlv_1= '[' ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )? otherlv_5= '|' ( (lv_expression_6_0= ruleXExpression ) ) otherlv_7= ']'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2185:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2186:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXClosureAccess().getXClosureAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleXClosure5296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXClosureAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2195:1: ( ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_ID||LA33_0==40||LA33_0==66) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2195:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) ) (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2195:2: ( (lv_formalParameters_2_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2196:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2196:1: (lv_formalParameters_2_0= ruleJvmFormalParameter )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2197:3: lv_formalParameters_2_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5318);
                    lv_formalParameters_2_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_2_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2213:2: (otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==39) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2213:4: otherlv_3= ',' ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleXClosure5331); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getXClosureAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2217:1: ( (lv_formalParameters_4_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2218:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2218:1: (lv_formalParameters_4_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2219:3: lv_formalParameters_4_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5352);
                    	    lv_formalParameters_4_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_4_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleXClosure5368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXClosureAccess().getVerticalLineKeyword_3());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2239:1: ( (lv_expression_6_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2240:1: (lv_expression_6_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2240:1: (lv_expression_6_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2241:3: lv_expression_6_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXClosureAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXClosure5389);
            lv_expression_6_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_6_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,44,FOLLOW_44_in_ruleXClosure5401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getXClosureAccess().getRightSquareBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXClosure"


    // $ANTLR start "entryRuleXShortClosure"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2269:1: entryRuleXShortClosure returns [EObject current=null] : iv_ruleXShortClosure= ruleXShortClosure EOF ;
    public final EObject entryRuleXShortClosure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXShortClosure = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2270:2: (iv_ruleXShortClosure= ruleXShortClosure EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2271:2: iv_ruleXShortClosure= ruleXShortClosure EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXShortClosureRule()); 
            }
            pushFollow(FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5437);
            iv_ruleXShortClosure=ruleXShortClosure();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXShortClosure; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXShortClosure5447); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXShortClosure"


    // $ANTLR start "ruleXShortClosure"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2278:1: ruleXShortClosure returns [EObject current=null] : ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXShortClosure() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_formalParameters_1_0 = null;

        EObject lv_formalParameters_3_0 = null;

        EObject lv_expression_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2281:28: ( ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2282:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2282:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2282:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) ) ( (lv_expression_5_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2282:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2282:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2293:5: ( () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2293:6: () ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )? otherlv_4= '|'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2293:6: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2294:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXShortClosureAccess().getXClosureAction_0_0_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2299:2: ( ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )* )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID||LA35_0==40||LA35_0==66) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2299:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) ) (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2299:3: ( (lv_formalParameters_1_0= ruleJvmFormalParameter ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2300:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2300:1: (lv_formalParameters_1_0= ruleJvmFormalParameter )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2301:3: lv_formalParameters_1_0= ruleJvmFormalParameter
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5545);
                    lv_formalParameters_1_0=ruleJvmFormalParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                      	        }
                             		add(
                             			current, 
                             			"formalParameters",
                              		lv_formalParameters_1_0, 
                              		"JvmFormalParameter");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2317:2: (otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==39) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2317:4: otherlv_2= ',' ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXShortClosure5558); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXShortClosureAccess().getCommaKeyword_0_0_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2321:1: ( (lv_formalParameters_3_0= ruleJvmFormalParameter ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2322:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2322:1: (lv_formalParameters_3_0= ruleJvmFormalParameter )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2323:3: lv_formalParameters_3_0= ruleJvmFormalParameter
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXShortClosureAccess().getFormalParametersJvmFormalParameterParserRuleCall_0_0_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5579);
                    	    lv_formalParameters_3_0=ruleJvmFormalParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"formalParameters",
                    	              		lv_formalParameters_3_0, 
                    	              		"JvmFormalParameter");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,43,FOLLOW_43_in_ruleXShortClosure5595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXShortClosureAccess().getVerticalLineKeyword_0_0_2());
                  
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2343:3: ( (lv_expression_5_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2344:1: (lv_expression_5_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2344:1: (lv_expression_5_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2345:3: lv_expression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXShortClosureAccess().getExpressionXExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXShortClosure5618);
            lv_expression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXShortClosureRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXShortClosure"


    // $ANTLR start "entryRuleXParenthesizedExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2369:1: entryRuleXParenthesizedExpression returns [EObject current=null] : iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF ;
    public final EObject entryRuleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXParenthesizedExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2370:2: (iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2371:2: iv_ruleXParenthesizedExpression= ruleXParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5654);
            iv_ruleXParenthesizedExpression=ruleXParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXParenthesizedExpression5664); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXParenthesizedExpression"


    // $ANTLR start "ruleXParenthesizedExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2378:1: ruleXParenthesizedExpression returns [EObject current=null] : (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) ;
    public final EObject ruleXParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_XExpression_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2381:28: ( (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2382:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2382:1: (otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2382:3: otherlv_0= '(' this_XExpression_1= ruleXExpression otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXParenthesizedExpression5701); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXParenthesizedExpressionAccess().getLeftParenthesisKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXParenthesizedExpressionAccess().getXExpressionParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5723);
            this_XExpression_1=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XExpression_1; 
                      afterParserOrEnumRuleCall();
                  
            }
            otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleXParenthesizedExpression5734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXParenthesizedExpressionAccess().getRightParenthesisKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXParenthesizedExpression"


    // $ANTLR start "entryRuleXIfExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2407:1: entryRuleXIfExpression returns [EObject current=null] : iv_ruleXIfExpression= ruleXIfExpression EOF ;
    public final EObject entryRuleXIfExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXIfExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2408:2: (iv_ruleXIfExpression= ruleXIfExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2409:2: iv_ruleXIfExpression= ruleXIfExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXIfExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5770);
            iv_ruleXIfExpression=ruleXIfExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXIfExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXIfExpression5780); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXIfExpression"


    // $ANTLR start "ruleXIfExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2416:1: ruleXIfExpression returns [EObject current=null] : ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) ;
    public final EObject ruleXIfExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_if_3_0 = null;

        EObject lv_then_5_0 = null;

        EObject lv_else_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2419:28: ( ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2420:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2420:1: ( () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2420:2: () otherlv_1= 'if' otherlv_2= '(' ( (lv_if_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_then_5_0= ruleXExpression ) ) ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2420:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2421:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXIfExpressionAccess().getXIfExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleXIfExpression5826); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXIfExpressionAccess().getIfKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXIfExpression5838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXIfExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2434:1: ( (lv_if_3_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2435:1: (lv_if_3_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2435:1: (lv_if_3_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2436:3: lv_if_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getIfXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5859);
            lv_if_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXIfExpression5871); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXIfExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2456:1: ( (lv_then_5_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2457:1: (lv_then_5_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2457:1: (lv_then_5_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2458:3: lv_then_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getThenXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5892);
            lv_then_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:2: ( ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                int LA36_1 = input.LA(2);

                if ( (synpred17_InternalInstances()) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:3: ( ( 'else' )=>otherlv_6= 'else' ) ( (lv_else_7_0= ruleXExpression ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:3: ( ( 'else' )=>otherlv_6= 'else' )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:4: ( 'else' )=>otherlv_6= 'else'
                    {
                    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleXIfExpression5913); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXIfExpressionAccess().getElseKeyword_6_0());
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2479:2: ( (lv_else_7_0= ruleXExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2480:1: (lv_else_7_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2480:1: (lv_else_7_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2481:3: lv_else_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXIfExpressionAccess().getElseXExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXIfExpression5935);
                    lv_else_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXIfExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXIfExpression"


    // $ANTLR start "entryRuleXSwitchExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2505:1: entryRuleXSwitchExpression returns [EObject current=null] : iv_ruleXSwitchExpression= ruleXSwitchExpression EOF ;
    public final EObject entryRuleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSwitchExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2506:2: (iv_ruleXSwitchExpression= ruleXSwitchExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2507:2: iv_ruleXSwitchExpression= ruleXSwitchExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXSwitchExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5973);
            iv_ruleXSwitchExpression=ruleXSwitchExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXSwitchExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXSwitchExpression5983); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXSwitchExpression"


    // $ANTLR start "ruleXSwitchExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2514:1: ruleXSwitchExpression returns [EObject current=null] : ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleXSwitchExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_localVarName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_switch_4_0 = null;

        EObject lv_cases_6_0 = null;

        EObject lv_default_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2517:28: ( ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2518:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2518:1: ( () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2518:2: () otherlv_1= 'switch' ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )? ( (lv_switch_4_0= ruleXExpression ) ) otherlv_5= '{' ( (lv_cases_6_0= ruleXCasePart ) )+ (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )? otherlv_10= '}'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2518:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2519:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXSwitchExpressionAccess().getXSwitchExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleXSwitchExpression6029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXSwitchExpressionAccess().getSwitchKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2528:1: ( ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==48) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2528:2: ( (lv_localVarName_2_0= RULE_ID ) ) otherlv_3= ':'
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2528:2: ( (lv_localVarName_2_0= RULE_ID ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2529:1: (lv_localVarName_2_0= RULE_ID )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2529:1: (lv_localVarName_2_0= RULE_ID )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2530:3: lv_localVarName_2_0= RULE_ID
                    {
                    lv_localVarName_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleXSwitchExpression6047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_localVarName_2_0, grammarAccess.getXSwitchExpressionAccess().getLocalVarNameIDTerminalRuleCall_2_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"localVarName",
                              		lv_localVarName_2_0, 
                              		"ID");
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_2_1());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2550:3: ( (lv_switch_4_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2551:1: (lv_switch_4_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2551:1: (lv_switch_4_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2552:3: lv_switch_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getSwitchXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6087);
            lv_switch_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"switch",
                      		lv_switch_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleXSwitchExpression6099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXSwitchExpressionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2572:1: ( (lv_cases_6_0= ruleXCasePart ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==40||LA38_0==48||LA38_0==50||LA38_0==66) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2573:1: (lv_cases_6_0= ruleXCasePart )
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2573:1: (lv_cases_6_0= ruleXCasePart )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2574:3: lv_cases_6_0= ruleXCasePart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getCasesXCasePartParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6120);
            	    lv_cases_6_0=ruleXCasePart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"cases",
            	              		lv_cases_6_0, 
            	              		"XCasePart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2590:3: (otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2590:5: otherlv_7= 'default' otherlv_8= ':' ( (lv_default_9_0= ruleXExpression ) )
                    {
                    otherlv_7=(Token)match(input,49,FOLLOW_49_in_ruleXSwitchExpression6134); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXSwitchExpressionAccess().getDefaultKeyword_6_0());
                          
                    }
                    otherlv_8=(Token)match(input,48,FOLLOW_48_in_ruleXSwitchExpression6146); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getXSwitchExpressionAccess().getColonKeyword_6_1());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2598:1: ( (lv_default_9_0= ruleXExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2599:1: (lv_default_9_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2599:1: (lv_default_9_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2600:3: lv_default_9_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXSwitchExpressionAccess().getDefaultXExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXSwitchExpression6167);
                    lv_default_9_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXSwitchExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"default",
                              		lv_default_9_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleXSwitchExpression6181); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getXSwitchExpressionAccess().getRightCurlyBracketKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXSwitchExpression"


    // $ANTLR start "entryRuleXCasePart"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2628:1: entryRuleXCasePart returns [EObject current=null] : iv_ruleXCasePart= ruleXCasePart EOF ;
    public final EObject entryRuleXCasePart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCasePart = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2629:2: (iv_ruleXCasePart= ruleXCasePart EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2630:2: iv_ruleXCasePart= ruleXCasePart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCasePartRule()); 
            }
            pushFollow(FOLLOW_ruleXCasePart_in_entryRuleXCasePart6217);
            iv_ruleXCasePart=ruleXCasePart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCasePart; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCasePart6227); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCasePart"


    // $ANTLR start "ruleXCasePart"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2637:1: ruleXCasePart returns [EObject current=null] : ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCasePart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_typeGuard_0_0 = null;

        EObject lv_case_2_0 = null;

        EObject lv_then_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2640:28: ( ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2641:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2641:1: ( ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2641:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )? (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2641:2: ( (lv_typeGuard_0_0= ruleJvmTypeReference ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==40||LA40_0==66) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2642:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2642:1: (lv_typeGuard_0_0= ruleJvmTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2643:3: lv_typeGuard_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getTypeGuardJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6273);
                    lv_typeGuard_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"typeGuard",
                              		lv_typeGuard_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2659:3: (otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==50) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2659:5: otherlv_1= 'case' ( (lv_case_2_0= ruleXExpression ) )
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXCasePart6287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXCasePartAccess().getCaseKeyword_1_0());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2663:1: ( (lv_case_2_0= ruleXExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2664:1: (lv_case_2_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2664:1: (lv_case_2_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2665:3: lv_case_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXCasePartAccess().getCaseXExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6308);
                    lv_case_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
                      	        }
                             		set(
                             			current, 
                             			"case",
                              		lv_case_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,48,FOLLOW_48_in_ruleXCasePart6322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCasePartAccess().getColonKeyword_2());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2685:1: ( (lv_then_4_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2686:1: (lv_then_4_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2686:1: (lv_then_4_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2687:3: lv_then_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCasePartAccess().getThenXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCasePart6343);
            lv_then_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCasePartRule());
              	        }
                     		set(
                     			current, 
                     			"then",
                      		lv_then_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCasePart"


    // $ANTLR start "entryRuleXForLoopExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2711:1: entryRuleXForLoopExpression returns [EObject current=null] : iv_ruleXForLoopExpression= ruleXForLoopExpression EOF ;
    public final EObject entryRuleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXForLoopExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2712:2: (iv_ruleXForLoopExpression= ruleXForLoopExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2713:2: iv_ruleXForLoopExpression= ruleXForLoopExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXForLoopExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6379);
            iv_ruleXForLoopExpression=ruleXForLoopExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXForLoopExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXForLoopExpression6389); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXForLoopExpression"


    // $ANTLR start "ruleXForLoopExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2720:1: ruleXForLoopExpression returns [EObject current=null] : ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) ;
    public final EObject ruleXForLoopExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_declaredParam_3_0 = null;

        EObject lv_forExpression_5_0 = null;

        EObject lv_eachExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2723:28: ( ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2724:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2724:1: ( () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2724:2: () otherlv_1= 'for' otherlv_2= '(' ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) ) otherlv_4= ':' ( (lv_forExpression_5_0= ruleXExpression ) ) otherlv_6= ')' ( (lv_eachExpression_7_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2724:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2725:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXForLoopExpressionAccess().getXForLoopExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleXForLoopExpression6435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXForLoopExpressionAccess().getForKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXForLoopExpression6447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXForLoopExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2738:1: ( (lv_declaredParam_3_0= ruleJvmFormalParameter ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2739:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2739:1: (lv_declaredParam_3_0= ruleJvmFormalParameter )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2740:3: lv_declaredParam_3_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getDeclaredParamJvmFormalParameterParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6468);
            lv_declaredParam_3_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_3_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleXForLoopExpression6480); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXForLoopExpressionAccess().getColonKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2760:1: ( (lv_forExpression_5_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2761:1: (lv_forExpression_5_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2761:1: (lv_forExpression_5_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2762:3: lv_forExpression_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getForExpressionXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6501);
            lv_forExpression_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"forExpression",
                      		lv_forExpression_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXForLoopExpression6513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXForLoopExpressionAccess().getRightParenthesisKeyword_6());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2782:1: ( (lv_eachExpression_7_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2783:1: (lv_eachExpression_7_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2783:1: (lv_eachExpression_7_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2784:3: lv_eachExpression_7_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXForLoopExpressionAccess().getEachExpressionXExpressionParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXForLoopExpression6534);
            lv_eachExpression_7_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXForLoopExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"eachExpression",
                      		lv_eachExpression_7_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXForLoopExpression"


    // $ANTLR start "entryRuleXWhileExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2808:1: entryRuleXWhileExpression returns [EObject current=null] : iv_ruleXWhileExpression= ruleXWhileExpression EOF ;
    public final EObject entryRuleXWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXWhileExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2809:2: (iv_ruleXWhileExpression= ruleXWhileExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2810:2: iv_ruleXWhileExpression= ruleXWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6570);
            iv_ruleXWhileExpression=ruleXWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXWhileExpression6580); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXWhileExpression"


    // $ANTLR start "ruleXWhileExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2817:1: ruleXWhileExpression returns [EObject current=null] : ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) ;
    public final EObject ruleXWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_predicate_3_0 = null;

        EObject lv_body_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2820:28: ( ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2821:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2821:1: ( () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2821:2: () otherlv_1= 'while' otherlv_2= '(' ( (lv_predicate_3_0= ruleXExpression ) ) otherlv_4= ')' ( (lv_body_5_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2821:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2822:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXWhileExpressionAccess().getXWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleXWhileExpression6626); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXWhileExpressionAccess().getWhileKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXWhileExpression6638); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXWhileExpressionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2835:1: ( (lv_predicate_3_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2836:1: (lv_predicate_3_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2836:1: (lv_predicate_3_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2837:3: lv_predicate_3_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getPredicateXExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6659);
            lv_predicate_3_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_3_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXWhileExpression6671); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXWhileExpressionAccess().getRightParenthesisKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2857:1: ( (lv_body_5_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2858:1: (lv_body_5_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2858:1: (lv_body_5_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2859:3: lv_body_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXWhileExpressionAccess().getBodyXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXWhileExpression6692);
            lv_body_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXWhileExpression"


    // $ANTLR start "entryRuleXDoWhileExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2883:1: entryRuleXDoWhileExpression returns [EObject current=null] : iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF ;
    public final EObject entryRuleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDoWhileExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2884:2: (iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2885:2: iv_ruleXDoWhileExpression= ruleXDoWhileExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDoWhileExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6728);
            iv_ruleXDoWhileExpression=ruleXDoWhileExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDoWhileExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDoWhileExpression6738); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXDoWhileExpression"


    // $ANTLR start "ruleXDoWhileExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2892:1: ruleXDoWhileExpression returns [EObject current=null] : ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) ;
    public final EObject ruleXDoWhileExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_body_2_0 = null;

        EObject lv_predicate_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2895:28: ( ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2896:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2896:1: ( () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2896:2: () otherlv_1= 'do' ( (lv_body_2_0= ruleXExpression ) ) otherlv_3= 'while' otherlv_4= '(' ( (lv_predicate_5_0= ruleXExpression ) ) otherlv_6= ')'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2896:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXDoWhileExpressionAccess().getXDoWhileExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleXDoWhileExpression6784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXDoWhileExpressionAccess().getDoKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2906:1: ( (lv_body_2_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2907:1: (lv_body_2_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2907:1: (lv_body_2_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2908:3: lv_body_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getBodyXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6805);
            lv_body_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleXDoWhileExpression6817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXDoWhileExpressionAccess().getWhileKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleXDoWhileExpression6829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXDoWhileExpressionAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2932:1: ( (lv_predicate_5_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2933:1: (lv_predicate_5_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2933:1: (lv_predicate_5_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2934:3: lv_predicate_5_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDoWhileExpressionAccess().getPredicateXExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6850);
            lv_predicate_5_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXDoWhileExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"predicate",
                      		lv_predicate_5_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleXDoWhileExpression6862); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getXDoWhileExpressionAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDoWhileExpression"


    // $ANTLR start "entryRuleJvmFormalParameter"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2964:1: entryRuleJvmFormalParameter returns [EObject current=null] : iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF ;
    public final EObject entryRuleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmFormalParameter = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2965:2: (iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2966:2: iv_ruleJvmFormalParameter= ruleJvmFormalParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmFormalParameterRule()); 
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter6900);
            iv_ruleJvmFormalParameter=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmFormalParameter; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmFormalParameter6910); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmFormalParameter"


    // $ANTLR start "ruleJvmFormalParameter"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2973:1: ruleJvmFormalParameter returns [EObject current=null] : ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleJvmFormalParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        EObject lv_parameterType_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2976:28: ( ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2977:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2977:1: ( ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2977:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )? ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2977:2: ( (lv_parameterType_0_0= ruleJvmTypeReference ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID||LA42_1==13||LA42_1==26) ) {
                    alt42=1;
                }
            }
            else if ( (LA42_0==40||LA42_0==66) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2978:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2978:1: (lv_parameterType_0_0= ruleJvmTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2979:3: lv_parameterType_0_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmFormalParameterAccess().getParameterTypeJvmTypeReferenceParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter6956);
                    lv_parameterType_0_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmFormalParameterRule());
                      	        }
                             		set(
                             			current, 
                             			"parameterType",
                              		lv_parameterType_0_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2995:3: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2996:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2996:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2997:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleJvmFormalParameter6974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getJvmFormalParameterAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmFormalParameterRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmFormalParameter"


    // $ANTLR start "entryRuleXFeatureCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3021:1: entryRuleXFeatureCall returns [EObject current=null] : iv_ruleXFeatureCall= ruleXFeatureCall EOF ;
    public final EObject entryRuleXFeatureCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFeatureCall = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3022:2: (iv_ruleXFeatureCall= ruleXFeatureCall EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3023:2: iv_ruleXFeatureCall= ruleXFeatureCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFeatureCallRule()); 
            }
            pushFollow(FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7015);
            iv_ruleXFeatureCall=ruleXFeatureCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFeatureCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFeatureCall7025); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFeatureCall"


    // $ANTLR start "ruleXFeatureCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3030:1: ruleXFeatureCall returns [EObject current=null] : ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) ;
    public final EObject ruleXFeatureCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_explicitOperationCall_8_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_3_0 = null;

        EObject lv_typeArguments_5_0 = null;

        EObject lv_featureCallArguments_9_0 = null;

        EObject lv_featureCallArguments_10_0 = null;

        EObject lv_featureCallArguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3033:28: ( ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3034:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3034:1: ( () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3034:2: () ( ( ruleStaticQualifier ) )? (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )? ( ( ruleIdOrSuper ) ) ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3034:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3035:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXFeatureCallAccess().getXFeatureCallAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3040:2: ( ( ruleStaticQualifier ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==55) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3041:1: ( ruleStaticQualifier )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3041:1: ( ruleStaticQualifier )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3042:3: ruleStaticQualifier
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getDeclaringTypeJvmDeclaredTypeCrossReference_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7082);
                    ruleStaticQualifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3055:3: (otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==26) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3055:5: otherlv_2= '<' ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) ) (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleXFeatureCall7096); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXFeatureCallAccess().getLessThanSignKeyword_2_0());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3059:1: ( (lv_typeArguments_3_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3060:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3060:1: (lv_typeArguments_3_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3061:3: lv_typeArguments_3_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7117);
                    lv_typeArguments_3_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_3_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3077:2: (otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==39) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3077:4: otherlv_4= ',' ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7130); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getXFeatureCallAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3081:1: ( (lv_typeArguments_5_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3082:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3082:1: (lv_typeArguments_5_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3083:3: lv_typeArguments_5_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_2_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7151);
                    	    lv_typeArguments_5_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_5_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleXFeatureCall7165); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXFeatureCallAccess().getGreaterThanSignKeyword_2_3());
                          
                    }

                    }
                    break;

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3103:3: ( ( ruleIdOrSuper ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3104:1: ( ruleIdOrSuper )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3104:1: ( ruleIdOrSuper )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3105:3: ruleIdOrSuper
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXFeatureCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureJvmIdentifiableElementCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7190);
            ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3118:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3118:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3118:3: ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3118:4: ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3125:1: (lv_explicitOperationCall_8_0= '(' )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3126:3: lv_explicitOperationCall_8_0= '('
                    {
                    lv_explicitOperationCall_8_0=(Token)match(input,40,FOLLOW_40_in_ruleXFeatureCall7224); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_explicitOperationCall_8_0, grammarAccess.getXFeatureCallAccess().getExplicitOperationCallLeftParenthesisKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXFeatureCallRule());
                      	        }
                             		setWithLastConsumed(current, "explicitOperationCall", true, "(");
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?
                    int alt47=3;
                    alt47 = dfa47.predict(input);
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:3: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3151:1: (lv_featureCallArguments_9_0= ruleXShortClosure )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3152:3: lv_featureCallArguments_9_0= ruleXShortClosure
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXShortClosureParserRuleCall_4_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7299);
                            lv_featureCallArguments_9_0=ruleXShortClosure();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_9_0, 
                                      		"XShortClosure");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3169:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3169:6: ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3169:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3169:7: ( (lv_featureCallArguments_10_0= ruleXExpression ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3170:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3170:1: (lv_featureCallArguments_10_0= ruleXExpression )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3171:3: lv_featureCallArguments_10_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7327);
                            lv_featureCallArguments_10_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"featureCallArguments",
                                      		lv_featureCallArguments_10_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3187:2: (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==39) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3187:4: otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXFeatureCall7340); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_11, grammarAccess.getXFeatureCallAccess().getCommaKeyword_4_1_1_1_0());
                            	          
                            	    }
                            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3191:1: ( (lv_featureCallArguments_12_0= ruleXExpression ) )
                            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3192:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    {
                            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3192:1: (lv_featureCallArguments_12_0= ruleXExpression )
                            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3193:3: lv_featureCallArguments_12_0= ruleXExpression
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getXFeatureCallAccess().getFeatureCallArgumentsXExpressionParserRuleCall_4_1_1_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleXExpression_in_ruleXFeatureCall7361);
                            	    lv_featureCallArguments_12_0=ruleXExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getXFeatureCallRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"featureCallArguments",
                            	              		lv_featureCallArguments_12_0, 
                            	              		"XExpression");
                            	      	        afterParserOrEnumRuleCall();
                            	      	    
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXFeatureCall7378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getXFeatureCallAccess().getRightParenthesisKeyword_4_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFeatureCall"


    // $ANTLR start "entryRuleIdOrSuper"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3221:1: entryRuleIdOrSuper returns [String current=null] : iv_ruleIdOrSuper= ruleIdOrSuper EOF ;
    public final String entryRuleIdOrSuper() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdOrSuper = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3222:2: (iv_ruleIdOrSuper= ruleIdOrSuper EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3223:2: iv_ruleIdOrSuper= ruleIdOrSuper EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdOrSuperRule()); 
            }
            pushFollow(FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7417);
            iv_ruleIdOrSuper=ruleIdOrSuper();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdOrSuper.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIdOrSuper7428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIdOrSuper"


    // $ANTLR start "ruleIdOrSuper"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3230:1: ruleIdOrSuper returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | kw= 'super' ) ;
    public final AntlrDatatypeRuleToken ruleIdOrSuper() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3233:28: ( (this_ID_0= RULE_ID | kw= 'super' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3234:1: (this_ID_0= RULE_ID | kw= 'super' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3234:1: (this_ID_0= RULE_ID | kw= 'super' )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                alt49=1;
            }
            else if ( (LA49_0==54) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3234:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIdOrSuper7468); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdOrSuperAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3243:2: kw= 'super'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleIdOrSuper7492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdOrSuperAccess().getSuperKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIdOrSuper"


    // $ANTLR start "entryRuleStaticQualifier"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3256:1: entryRuleStaticQualifier returns [String current=null] : iv_ruleStaticQualifier= ruleStaticQualifier EOF ;
    public final String entryRuleStaticQualifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStaticQualifier = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3257:2: (iv_ruleStaticQualifier= ruleStaticQualifier EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3258:2: iv_ruleStaticQualifier= ruleStaticQualifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStaticQualifierRule()); 
            }
            pushFollow(FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7533);
            iv_ruleStaticQualifier=ruleStaticQualifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStaticQualifier.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStaticQualifier7544); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStaticQualifier"


    // $ANTLR start "ruleStaticQualifier"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3265:1: ruleStaticQualifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '::' )+ ;
    public final AntlrDatatypeRuleToken ruleStaticQualifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3268:28: ( (this_ID_0= RULE_ID kw= '::' )+ )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3269:1: (this_ID_0= RULE_ID kw= '::' )+
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3269:1: (this_ID_0= RULE_ID kw= '::' )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_ID) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==55) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3269:6: this_ID_0= RULE_ID kw= '::'
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStaticQualifier7584); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getStaticQualifierAccess().getIDTerminalRuleCall_0()); 
            	          
            	    }
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleStaticQualifier7602); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getStaticQualifierAccess().getColonColonKeyword_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStaticQualifier"


    // $ANTLR start "entryRuleXConstructorCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3290:1: entryRuleXConstructorCall returns [EObject current=null] : iv_ruleXConstructorCall= ruleXConstructorCall EOF ;
    public final EObject entryRuleXConstructorCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXConstructorCall = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3291:2: (iv_ruleXConstructorCall= ruleXConstructorCall EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3292:2: iv_ruleXConstructorCall= ruleXConstructorCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXConstructorCallRule()); 
            }
            pushFollow(FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7643);
            iv_ruleXConstructorCall=ruleXConstructorCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXConstructorCall; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXConstructorCall7653); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXConstructorCall"


    // $ANTLR start "ruleXConstructorCall"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3299:1: ruleXConstructorCall returns [EObject current=null] : ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) ;
    public final EObject ruleXConstructorCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_typeArguments_4_0 = null;

        EObject lv_typeArguments_6_0 = null;

        EObject lv_arguments_9_0 = null;

        EObject lv_arguments_10_0 = null;

        EObject lv_arguments_12_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3302:28: ( ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3303:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3303:1: ( () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3303:2: () otherlv_1= 'new' ( ( ruleQualifiedName ) ) (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )? otherlv_8= '(' ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3303:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3304:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXConstructorCallAccess().getXConstructorCallAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleXConstructorCall7699); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXConstructorCallAccess().getNewKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3313:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3314:1: ( ruleQualifiedName )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3314:1: ( ruleQualifiedName )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3315:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXConstructorCallRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getConstructorJvmConstructorCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7722);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3328:2: (otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==26) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3328:4: otherlv_3= '<' ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) ) (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )* otherlv_7= '>'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleXConstructorCall7735); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getXConstructorCallAccess().getLessThanSignKeyword_3_0());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3332:1: ( (lv_typeArguments_4_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3333:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3333:1: (lv_typeArguments_4_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3334:3: lv_typeArguments_4_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7756);
                    lv_typeArguments_4_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"typeArguments",
                              		lv_typeArguments_4_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3350:2: (otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==39) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3350:4: otherlv_5= ',' ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall7769); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_5, grammarAccess.getXConstructorCallAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3354:1: ( (lv_typeArguments_6_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3355:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3355:1: (lv_typeArguments_6_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3356:3: lv_typeArguments_6_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getTypeArgumentsJvmArgumentTypeReferenceParserRuleCall_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7790);
                    	    lv_typeArguments_6_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"typeArguments",
                    	              		lv_typeArguments_6_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleXConstructorCall7804); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getXConstructorCallAccess().getGreaterThanSignKeyword_3_3());
                          
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleXConstructorCall7818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getXConstructorCallAccess().getLeftParenthesisKeyword_4());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:2: ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3392:1: (lv_arguments_9_0= ruleXShortClosure )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3393:3: lv_arguments_9_0= ruleXShortClosure
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXShortClosureParserRuleCall_5_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7880);
                    lv_arguments_9_0=ruleXShortClosure();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_9_0, 
                              		"XShortClosure");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3410:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3410:6: ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3410:7: ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3410:7: ( (lv_arguments_10_0= ruleXExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3411:1: (lv_arguments_10_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3411:1: (lv_arguments_10_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3412:3: lv_arguments_10_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7908);
                    lv_arguments_10_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_10_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3428:2: (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==39) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3428:4: otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) )
                    	    {
                    	    otherlv_11=(Token)match(input,39,FOLLOW_39_in_ruleXConstructorCall7921); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_11, grammarAccess.getXConstructorCallAccess().getCommaKeyword_5_1_1_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3432:1: ( (lv_arguments_12_0= ruleXExpression ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3433:1: (lv_arguments_12_0= ruleXExpression )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3433:1: (lv_arguments_12_0= ruleXExpression )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3434:3: lv_arguments_12_0= ruleXExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXConstructorCallAccess().getArgumentsXExpressionParserRuleCall_5_1_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXExpression_in_ruleXConstructorCall7942);
                    	    lv_arguments_12_0=ruleXExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXConstructorCallRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_12_0, 
                    	              		"XExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleXConstructorCall7959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getXConstructorCallAccess().getRightParenthesisKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXConstructorCall"


    // $ANTLR start "entryRuleXBooleanLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3462:1: entryRuleXBooleanLiteral returns [EObject current=null] : iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF ;
    public final EObject entryRuleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXBooleanLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3463:2: (iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3464:2: iv_ruleXBooleanLiteral= ruleXBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7995);
            iv_ruleXBooleanLiteral=ruleXBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXBooleanLiteral8005); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXBooleanLiteral"


    // $ANTLR start "ruleXBooleanLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3471:1: ruleXBooleanLiteral returns [EObject current=null] : ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) ;
    public final EObject ruleXBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_isTrue_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3474:28: ( ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3475:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3475:1: ( () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3475:2: () (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3475:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3476:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXBooleanLiteralAccess().getXBooleanLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3481:2: (otherlv_1= 'false' | ( (lv_isTrue_2_0= 'true' ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==57) ) {
                alt55=1;
            }
            else if ( (LA55_0==58) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3481:4: otherlv_1= 'false'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleXBooleanLiteral8052); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXBooleanLiteralAccess().getFalseKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3486:6: ( (lv_isTrue_2_0= 'true' ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3486:6: ( (lv_isTrue_2_0= 'true' ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3487:1: (lv_isTrue_2_0= 'true' )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3487:1: (lv_isTrue_2_0= 'true' )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3488:3: lv_isTrue_2_0= 'true'
                    {
                    lv_isTrue_2_0=(Token)match(input,58,FOLLOW_58_in_ruleXBooleanLiteral8076); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_isTrue_2_0, grammarAccess.getXBooleanLiteralAccess().getIsTrueTrueKeyword_1_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getXBooleanLiteralRule());
                      	        }
                             		setWithLastConsumed(current, "isTrue", true, "true");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXBooleanLiteral"


    // $ANTLR start "entryRuleXNullLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3509:1: entryRuleXNullLiteral returns [EObject current=null] : iv_ruleXNullLiteral= ruleXNullLiteral EOF ;
    public final EObject entryRuleXNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXNullLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3510:2: (iv_ruleXNullLiteral= ruleXNullLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3511:2: iv_ruleXNullLiteral= ruleXNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8126);
            iv_ruleXNullLiteral=ruleXNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXNullLiteral8136); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXNullLiteral"


    // $ANTLR start "ruleXNullLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3518:1: ruleXNullLiteral returns [EObject current=null] : ( () otherlv_1= 'null' ) ;
    public final EObject ruleXNullLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3521:28: ( ( () otherlv_1= 'null' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3522:1: ( () otherlv_1= 'null' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3522:1: ( () otherlv_1= 'null' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3522:2: () otherlv_1= 'null'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3522:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3523:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXNullLiteralAccess().getXNullLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleXNullLiteral8182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXNullLiteralAccess().getNullKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXNullLiteral"


    // $ANTLR start "entryRuleXStringLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3540:1: entryRuleXStringLiteral returns [EObject current=null] : iv_ruleXStringLiteral= ruleXStringLiteral EOF ;
    public final EObject entryRuleXStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStringLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3541:2: (iv_ruleXStringLiteral= ruleXStringLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3542:2: iv_ruleXStringLiteral= ruleXStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8218);
            iv_ruleXStringLiteral=ruleXStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXStringLiteral8228); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXStringLiteral"


    // $ANTLR start "ruleXStringLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3549:1: ruleXStringLiteral returns [EObject current=null] : ( () ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleXStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3552:28: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3553:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3553:1: ( () ( (lv_value_1_0= RULE_STRING ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3553:2: () ( (lv_value_1_0= RULE_STRING ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3553:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3554:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXStringLiteralAccess().getXStringLiteralAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3559:2: ( (lv_value_1_0= RULE_STRING ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3560:1: (lv_value_1_0= RULE_STRING )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3560:1: (lv_value_1_0= RULE_STRING )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3561:3: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleXStringLiteral8279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_1_0, grammarAccess.getXStringLiteralAccess().getValueSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getXStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXStringLiteral"


    // $ANTLR start "entryRuleXTypeLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3585:1: entryRuleXTypeLiteral returns [EObject current=null] : iv_ruleXTypeLiteral= ruleXTypeLiteral EOF ;
    public final EObject entryRuleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTypeLiteral = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3586:2: (iv_ruleXTypeLiteral= ruleXTypeLiteral EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3587:2: iv_ruleXTypeLiteral= ruleXTypeLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTypeLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8320);
            iv_ruleXTypeLiteral=ruleXTypeLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTypeLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTypeLiteral8330); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTypeLiteral"


    // $ANTLR start "ruleXTypeLiteral"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3594:1: ruleXTypeLiteral returns [EObject current=null] : ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) ;
    public final EObject ruleXTypeLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3597:28: ( ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3598:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3598:1: ( () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3598:2: () otherlv_1= 'typeof' otherlv_2= '(' ( ( ruleQualifiedName ) ) otherlv_4= ')'
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3598:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3599:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTypeLiteralAccess().getXTypeLiteralAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXTypeLiteral8376); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTypeLiteralAccess().getTypeofKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleXTypeLiteral8388); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getXTypeLiteralAccess().getLeftParenthesisKeyword_2());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3612:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3613:1: ( ruleQualifiedName )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3613:1: ( ruleQualifiedName )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3614:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXTypeLiteralRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTypeLiteralAccess().getTypeJvmTypeCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8411);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXTypeLiteral8423); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getXTypeLiteralAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTypeLiteral"


    // $ANTLR start "entryRuleXThrowExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3639:1: entryRuleXThrowExpression returns [EObject current=null] : iv_ruleXThrowExpression= ruleXThrowExpression EOF ;
    public final EObject entryRuleXThrowExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXThrowExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3640:2: (iv_ruleXThrowExpression= ruleXThrowExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3641:2: iv_ruleXThrowExpression= ruleXThrowExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXThrowExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8459);
            iv_ruleXThrowExpression=ruleXThrowExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXThrowExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXThrowExpression8469); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXThrowExpression"


    // $ANTLR start "ruleXThrowExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3648:1: ruleXThrowExpression returns [EObject current=null] : ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) ;
    public final EObject ruleXThrowExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3651:28: ( ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3652:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3652:1: ( () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3652:2: () otherlv_1= 'throw' ( (lv_expression_2_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3652:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3653:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXThrowExpressionAccess().getXThrowExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleXThrowExpression8515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXThrowExpressionAccess().getThrowKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3662:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3663:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3663:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3664:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXThrowExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXThrowExpression8536);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXThrowExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXThrowExpression"


    // $ANTLR start "entryRuleXReturnExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3688:1: entryRuleXReturnExpression returns [EObject current=null] : iv_ruleXReturnExpression= ruleXReturnExpression EOF ;
    public final EObject entryRuleXReturnExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXReturnExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3689:2: (iv_ruleXReturnExpression= ruleXReturnExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3690:2: iv_ruleXReturnExpression= ruleXReturnExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXReturnExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8572);
            iv_ruleXReturnExpression=ruleXReturnExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXReturnExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXReturnExpression8582); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXReturnExpression"


    // $ANTLR start "ruleXReturnExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3697:1: ruleXReturnExpression returns [EObject current=null] : ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) ;
    public final EObject ruleXReturnExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3700:28: ( ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3701:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3701:1: ( () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3701:2: () otherlv_1= 'return' ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3701:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXReturnExpressionAccess().getXReturnExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXReturnExpression8628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXReturnExpressionAccess().getReturnKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3711:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3711:2: ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3716:1: (lv_expression_2_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3717:3: lv_expression_2_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXReturnExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXReturnExpression8659);
                    lv_expression_2_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXReturnExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_2_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXReturnExpression"


    // $ANTLR start "entryRuleXTryCatchFinallyExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3741:1: entryRuleXTryCatchFinallyExpression returns [EObject current=null] : iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF ;
    public final EObject entryRuleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXTryCatchFinallyExpression = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3742:2: (iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3743:2: iv_ruleXTryCatchFinallyExpression= ruleXTryCatchFinallyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8696);
            iv_ruleXTryCatchFinallyExpression=ruleXTryCatchFinallyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXTryCatchFinallyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8706); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXTryCatchFinallyExpression"


    // $ANTLR start "ruleXTryCatchFinallyExpression"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3750:1: ruleXTryCatchFinallyExpression returns [EObject current=null] : ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) ;
    public final EObject ruleXTryCatchFinallyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_expression_2_0 = null;

        EObject lv_catchClauses_3_0 = null;

        EObject lv_finallyExpression_5_0 = null;

        EObject lv_finallyExpression_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3753:28: ( ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3754:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3754:1: ( () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3754:2: () otherlv_1= 'try' ( (lv_expression_2_0= ruleXExpression ) ) ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3754:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3755:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXTryCatchFinallyExpressionAccess().getXTryCatchFinallyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleXTryCatchFinallyExpression8752); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXTryCatchFinallyExpressionAccess().getTryKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3764:1: ( (lv_expression_2_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3765:1: (lv_expression_2_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3765:1: (lv_expression_2_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3766:3: lv_expression_2_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getExpressionXExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8773);
            lv_expression_2_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:2: ( ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? ) | (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==65) ) {
                alt59=1;
            }
            else if ( (LA59_0==64) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:3: ( ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )? )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+ ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:4: ( ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==65) ) {
                            int LA57_2 = input.LA(2);

                            if ( (synpred22_InternalInstances()) ) {
                                alt57=1;
                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:5: ( 'catch' )=> (lv_catchClauses_3_0= ruleXCatchClause )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3784:1: (lv_catchClauses_3_0= ruleXCatchClause )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3785:3: lv_catchClauses_3_0= ruleXCatchClause
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getCatchClausesXCatchClauseParserRuleCall_3_0_0_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8803);
                    	    lv_catchClauses_3_0=ruleXCatchClause();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"catchClauses",
                    	              		lv_catchClauses_3_0, 
                    	              		"XCatchClause");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
                    } while (true);

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:3: ( ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==64) ) {
                        int LA58_1 = input.LA(2);

                        if ( (synpred23_InternalInstances()) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:4: ( ( 'finally' )=>otherlv_4= 'finally' ) ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:4: ( ( 'finally' )=>otherlv_4= 'finally' )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:5: ( 'finally' )=>otherlv_4= 'finally'
                            {
                            otherlv_4=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8825); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_0_1_0());
                                  
                            }

                            }

                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3806:2: ( (lv_finallyExpression_5_0= ruleXExpression ) )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3807:1: (lv_finallyExpression_5_0= ruleXExpression )
                            {
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3807:1: (lv_finallyExpression_5_0= ruleXExpression )
                            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3808:3: lv_finallyExpression_5_0= ruleXExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8847);
                            lv_finallyExpression_5_0=ruleXExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finallyExpression",
                                      		lv_finallyExpression_5_0, 
                                      		"XExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3825:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3825:6: (otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3825:8: otherlv_6= 'finally' ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    {
                    otherlv_6=(Token)match(input,64,FOLLOW_64_in_ruleXTryCatchFinallyExpression8869); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyKeyword_3_1_0());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3829:1: ( (lv_finallyExpression_7_0= ruleXExpression ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3830:1: (lv_finallyExpression_7_0= ruleXExpression )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3830:1: (lv_finallyExpression_7_0= ruleXExpression )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3831:3: lv_finallyExpression_7_0= ruleXExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXTryCatchFinallyExpressionAccess().getFinallyExpressionXExpressionParserRuleCall_3_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8890);
                    lv_finallyExpression_7_0=ruleXExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXTryCatchFinallyExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"finallyExpression",
                              		lv_finallyExpression_7_0, 
                              		"XExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXTryCatchFinallyExpression"


    // $ANTLR start "entryRuleXCatchClause"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3855:1: entryRuleXCatchClause returns [EObject current=null] : iv_ruleXCatchClause= ruleXCatchClause EOF ;
    public final EObject entryRuleXCatchClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXCatchClause = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3856:2: (iv_ruleXCatchClause= ruleXCatchClause EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3857:2: iv_ruleXCatchClause= ruleXCatchClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXCatchClauseRule()); 
            }
            pushFollow(FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8928);
            iv_ruleXCatchClause=ruleXCatchClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXCatchClause; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXCatchClause8938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXCatchClause"


    // $ANTLR start "ruleXCatchClause"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3864:1: ruleXCatchClause returns [EObject current=null] : ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) ;
    public final EObject ruleXCatchClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_declaredParam_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3867:28: ( ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3868:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3868:1: ( ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3868:2: ( ( 'catch' )=>otherlv_0= 'catch' ) otherlv_1= '(' ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) ) otherlv_3= ')' ( (lv_expression_4_0= ruleXExpression ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3868:2: ( ( 'catch' )=>otherlv_0= 'catch' )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3868:3: ( 'catch' )=>otherlv_0= 'catch'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleXCatchClause8983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getXCatchClauseAccess().getCatchKeyword_0());
                  
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleXCatchClause8996); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getXCatchClauseAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3877:1: ( (lv_declaredParam_2_0= ruleJvmFormalParameter ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3878:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3878:1: (lv_declaredParam_2_0= ruleJvmFormalParameter )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3879:3: lv_declaredParam_2_0= ruleJvmFormalParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getDeclaredParamJvmFormalParameterParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9017);
            lv_declaredParam_2_0=ruleJvmFormalParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"declaredParam",
                      		lv_declaredParam_2_0, 
                      		"JvmFormalParameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleXCatchClause9029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getXCatchClauseAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3899:1: ( (lv_expression_4_0= ruleXExpression ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3900:1: (lv_expression_4_0= ruleXExpression )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3900:1: (lv_expression_4_0= ruleXExpression )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3901:3: lv_expression_4_0= ruleXExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXCatchClauseAccess().getExpressionXExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleXExpression_in_ruleXCatchClause9050);
            lv_expression_4_0=ruleXExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXCatchClauseRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_4_0, 
                      		"XExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXCatchClause"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3925:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3926:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3927:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9087);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName9098); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3934:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3937:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3938:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3938:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3938:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3945:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==13) ) {
                    int LA60_2 = input.LA(2);

                    if ( (LA60_2==RULE_ID) ) {
                        int LA60_3 = input.LA(3);

                        if ( (synpred25_InternalInstances()) ) {
                            alt60=1;
                        }


                    }


                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3945:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3945:2: ( ( '.' )=>kw= '.' )
            	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3945:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,13,FOLLOW_13_in_ruleQualifiedName9166); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName9182); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleJvmTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3968:1: entryRuleJvmTypeReference returns [EObject current=null] : iv_ruleJvmTypeReference= ruleJvmTypeReference EOF ;
    public final EObject entryRuleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmTypeReference = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3969:2: (iv_ruleJvmTypeReference= ruleJvmTypeReference EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3970:2: iv_ruleJvmTypeReference= ruleJvmTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9229);
            iv_ruleJvmTypeReference=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmTypeReference9239); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmTypeReference"


    // $ANTLR start "ruleJvmTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3977:1: ruleJvmTypeReference returns [EObject current=null] : (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) ;
    public final EObject ruleJvmTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmParameterizedTypeReference_0 = null;

        EObject this_XFunctionTypeRef_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3980:28: ( (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3981:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3981:1: (this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference | this_XFunctionTypeRef_1= ruleXFunctionTypeRef )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==40||LA61_0==66) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3982:5: this_JvmParameterizedTypeReference_0= ruleJvmParameterizedTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getJvmParameterizedTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9286);
                    this_JvmParameterizedTypeReference_0=ruleJvmParameterizedTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmParameterizedTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3992:5: this_XFunctionTypeRef_1= ruleXFunctionTypeRef
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmTypeReferenceAccess().getXFunctionTypeRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9313);
                    this_XFunctionTypeRef_1=ruleXFunctionTypeRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_XFunctionTypeRef_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmTypeReference"


    // $ANTLR start "entryRuleXFunctionTypeRef"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4008:1: entryRuleXFunctionTypeRef returns [EObject current=null] : iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF ;
    public final EObject entryRuleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXFunctionTypeRef = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4009:2: (iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4010:2: iv_ruleXFunctionTypeRef= ruleXFunctionTypeRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXFunctionTypeRefRule()); 
            }
            pushFollow(FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9348);
            iv_ruleXFunctionTypeRef=ruleXFunctionTypeRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXFunctionTypeRef; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXFunctionTypeRef9358); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXFunctionTypeRef"


    // $ANTLR start "ruleXFunctionTypeRef"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4017:1: ruleXFunctionTypeRef returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleXFunctionTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_paramTypes_1_0 = null;

        EObject lv_paramTypes_3_0 = null;

        EObject lv_returnType_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4020:28: ( ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4021:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4021:1: ( (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4021:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )? otherlv_5= '=>' ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4021:2: (otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==40) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4021:4: otherlv_0= '(' ( (lv_paramTypes_1_0= ruleJvmTypeReference ) ) (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleXFunctionTypeRef9396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getXFunctionTypeRefAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4025:1: ( (lv_paramTypes_1_0= ruleJvmTypeReference ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4026:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4026:1: (lv_paramTypes_1_0= ruleJvmTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4027:3: lv_paramTypes_1_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9417);
                    lv_paramTypes_1_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                      	        }
                             		add(
                             			current, 
                             			"paramTypes",
                              		lv_paramTypes_1_0, 
                              		"JvmTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4043:2: (otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==39) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4043:4: otherlv_2= ',' ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    {
                    	    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleXFunctionTypeRef9430); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_2, grammarAccess.getXFunctionTypeRefAccess().getCommaKeyword_0_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4047:1: ( (lv_paramTypes_3_0= ruleJvmTypeReference ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4048:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4048:1: (lv_paramTypes_3_0= ruleJvmTypeReference )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4049:3: lv_paramTypes_3_0= ruleJvmTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getParamTypesJvmTypeReferenceParserRuleCall_0_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9451);
                    	    lv_paramTypes_3_0=ruleJvmTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"paramTypes",
                    	              		lv_paramTypes_3_0, 
                    	              		"JvmTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleXFunctionTypeRef9465); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getXFunctionTypeRefAccess().getRightParenthesisKeyword_0_3());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,66,FOLLOW_66_in_ruleXFunctionTypeRef9479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getXFunctionTypeRefAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4073:1: ( (lv_returnType_6_0= ruleJvmTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4074:1: (lv_returnType_6_0= ruleJvmTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4074:1: (lv_returnType_6_0= ruleJvmTypeReference )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4075:3: lv_returnType_6_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXFunctionTypeRefAccess().getReturnTypeJvmTypeReferenceParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9500);
            lv_returnType_6_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getXFunctionTypeRefRule());
              	        }
                     		set(
                     			current, 
                     			"returnType",
                      		lv_returnType_6_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXFunctionTypeRef"


    // $ANTLR start "entryRuleJvmParameterizedTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4099:1: entryRuleJvmParameterizedTypeReference returns [EObject current=null] : iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF ;
    public final EObject entryRuleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmParameterizedTypeReference = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4100:2: (iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4101:2: iv_ruleJvmParameterizedTypeReference= ruleJvmParameterizedTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9536);
            iv_ruleJvmParameterizedTypeReference=ruleJvmParameterizedTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmParameterizedTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9546); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmParameterizedTypeReference"


    // $ANTLR start "ruleJvmParameterizedTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4108:1: ruleJvmParameterizedTypeReference returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) ;
    public final EObject ruleJvmParameterizedTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_arguments_2_0 = null;

        EObject lv_arguments_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4111:28: ( ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4112:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4112:1: ( ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4112:2: ( ( ruleQualifiedName ) ) ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4112:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4113:1: ( ruleQualifiedName )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4113:1: ( ruleQualifiedName )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4114:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getJvmParameterizedTypeReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getTypeJvmTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9594);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?
            int alt65=2;
            alt65 = dfa65.predict(input);
            switch (alt65) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:3: ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>'
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:3: ( ( '<' )=>otherlv_1= '<' )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:4: ( '<' )=>otherlv_1= '<'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleJvmParameterizedTypeReference9615); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getJvmParameterizedTypeReferenceAccess().getLessThanSignKeyword_1_0());
                          
                    }

                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4132:2: ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4133:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4133:1: (lv_arguments_2_0= ruleJvmArgumentTypeReference )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4134:3: lv_arguments_2_0= ruleJvmArgumentTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9637);
                    lv_arguments_2_0=ruleJvmArgumentTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"arguments",
                              		lv_arguments_2_0, 
                              		"JvmArgumentTypeReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4150:2: (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==39) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4150:4: otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    {
                    	    otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleJvmParameterizedTypeReference9650); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getJvmParameterizedTypeReferenceAccess().getCommaKeyword_1_2_0());
                    	          
                    	    }
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4154:1: ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4155:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    {
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4155:1: (lv_arguments_4_0= ruleJvmArgumentTypeReference )
                    	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4156:3: lv_arguments_4_0= ruleJvmArgumentTypeReference
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getJvmParameterizedTypeReferenceAccess().getArgumentsJvmArgumentTypeReferenceParserRuleCall_1_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9671);
                    	    lv_arguments_4_0=ruleJvmArgumentTypeReference();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getJvmParameterizedTypeReferenceRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"arguments",
                    	              		lv_arguments_4_0, 
                    	              		"JvmArgumentTypeReference");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleJvmParameterizedTypeReference9685); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getJvmParameterizedTypeReferenceAccess().getGreaterThanSignKeyword_1_3());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmParameterizedTypeReference"


    // $ANTLR start "entryRuleJvmArgumentTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4184:1: entryRuleJvmArgumentTypeReference returns [EObject current=null] : iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF ;
    public final EObject entryRuleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmArgumentTypeReference = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4185:2: (iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4186:2: iv_ruleJvmArgumentTypeReference= ruleJvmArgumentTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9723);
            iv_ruleJvmArgumentTypeReference=ruleJvmArgumentTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmArgumentTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9733); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmArgumentTypeReference"


    // $ANTLR start "ruleJvmArgumentTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4193:1: ruleJvmArgumentTypeReference returns [EObject current=null] : (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) ;
    public final EObject ruleJvmArgumentTypeReference() throws RecognitionException {
        EObject current = null;

        EObject this_JvmTypeReference_0 = null;

        EObject this_JvmWildcardTypeReference_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4196:28: ( (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4197:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4197:1: (this_JvmTypeReference_0= ruleJvmTypeReference | this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID||LA66_0==40||LA66_0==66) ) {
                alt66=1;
            }
            else if ( (LA66_0==67) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4198:5: this_JvmTypeReference_0= ruleJvmTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmTypeReferenceParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9780);
                    this_JvmTypeReference_0=ruleJvmTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmTypeReference_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4208:5: this_JvmWildcardTypeReference_1= ruleJvmWildcardTypeReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getJvmArgumentTypeReferenceAccess().getJvmWildcardTypeReferenceParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9807);
                    this_JvmWildcardTypeReference_1=ruleJvmWildcardTypeReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_JvmWildcardTypeReference_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmArgumentTypeReference"


    // $ANTLR start "entryRuleJvmWildcardTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4224:1: entryRuleJvmWildcardTypeReference returns [EObject current=null] : iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF ;
    public final EObject entryRuleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmWildcardTypeReference = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4225:2: (iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4226:2: iv_ruleJvmWildcardTypeReference= ruleJvmWildcardTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9842);
            iv_ruleJvmWildcardTypeReference=ruleJvmWildcardTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmWildcardTypeReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9852); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmWildcardTypeReference"


    // $ANTLR start "ruleJvmWildcardTypeReference"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4233:1: ruleJvmWildcardTypeReference returns [EObject current=null] : ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) ;
    public final EObject ruleJvmWildcardTypeReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_constraints_2_0 = null;

        EObject lv_constraints_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4236:28: ( ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4237:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4237:1: ( () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )? )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4237:2: () otherlv_1= '?' ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4237:2: ()
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4238:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getJvmWildcardTypeReferenceAccess().getJvmWildcardTypeReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleJvmWildcardTypeReference9898); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJvmWildcardTypeReferenceAccess().getQuestionMarkKeyword_1());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4247:1: ( ( (lv_constraints_2_0= ruleJvmUpperBound ) ) | ( (lv_constraints_3_0= ruleJvmLowerBound ) ) )?
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            else if ( (LA67_0==54) ) {
                alt67=2;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4247:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4247:2: ( (lv_constraints_2_0= ruleJvmUpperBound ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4248:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4248:1: (lv_constraints_2_0= ruleJvmUpperBound )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4249:3: lv_constraints_2_0= ruleJvmUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmUpperBoundParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9920);
                    lv_constraints_2_0=ruleJvmUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_2_0, 
                              		"JvmUpperBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4266:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4266:6: ( (lv_constraints_3_0= ruleJvmLowerBound ) )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4267:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    {
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4267:1: (lv_constraints_3_0= ruleJvmLowerBound )
                    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4268:3: lv_constraints_3_0= ruleJvmLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJvmWildcardTypeReferenceAccess().getConstraintsJvmLowerBoundParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9947);
                    lv_constraints_3_0=ruleJvmLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJvmWildcardTypeReferenceRule());
                      	        }
                             		add(
                             			current, 
                             			"constraints",
                              		lv_constraints_3_0, 
                              		"JvmLowerBound");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmWildcardTypeReference"


    // $ANTLR start "entryRuleJvmUpperBound"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4292:1: entryRuleJvmUpperBound returns [EObject current=null] : iv_ruleJvmUpperBound= ruleJvmUpperBound EOF ;
    public final EObject entryRuleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBound = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4293:2: (iv_ruleJvmUpperBound= ruleJvmUpperBound EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4294:2: iv_ruleJvmUpperBound= ruleJvmUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9985);
            iv_ruleJvmUpperBound=ruleJvmUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBound9995); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBound"


    // $ANTLR start "ruleJvmUpperBound"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4301:1: ruleJvmUpperBound returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4304:28: ( (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4305:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4305:1: (otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4305:3: otherlv_0= 'extends' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleJvmUpperBound10032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAccess().getExtendsKeyword_0());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4309:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4310:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4310:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4311:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10053);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBound"


    // $ANTLR start "entryRuleJvmUpperBoundAnded"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4335:1: entryRuleJvmUpperBoundAnded returns [EObject current=null] : iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF ;
    public final EObject entryRuleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmUpperBoundAnded = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4336:2: (iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4337:2: iv_ruleJvmUpperBoundAnded= ruleJvmUpperBoundAnded EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmUpperBoundAndedRule()); 
            }
            pushFollow(FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10089);
            iv_ruleJvmUpperBoundAnded=ruleJvmUpperBoundAnded();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmUpperBoundAnded; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10099); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmUpperBoundAnded"


    // $ANTLR start "ruleJvmUpperBoundAnded"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4344:1: ruleJvmUpperBoundAnded returns [EObject current=null] : (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmUpperBoundAnded() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4347:28: ( (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4348:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4348:1: (otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4348:3: otherlv_0= '&' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleJvmUpperBoundAnded10136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmUpperBoundAndedAccess().getAmpersandKeyword_0());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4352:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4353:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4353:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4354:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmUpperBoundAndedAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10157);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmUpperBoundAndedRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmUpperBoundAnded"


    // $ANTLR start "entryRuleJvmLowerBound"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4378:1: entryRuleJvmLowerBound returns [EObject current=null] : iv_ruleJvmLowerBound= ruleJvmLowerBound EOF ;
    public final EObject entryRuleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJvmLowerBound = null;


        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4379:2: (iv_ruleJvmLowerBound= ruleJvmLowerBound EOF )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4380:2: iv_ruleJvmLowerBound= ruleJvmLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJvmLowerBoundRule()); 
            }
            pushFollow(FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10193);
            iv_ruleJvmLowerBound=ruleJvmLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJvmLowerBound; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleJvmLowerBound10203); if (state.failed) return current;

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
    // $ANTLR end "entryRuleJvmLowerBound"


    // $ANTLR start "ruleJvmLowerBound"
    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4387:1: ruleJvmLowerBound returns [EObject current=null] : (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) ;
    public final EObject ruleJvmLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_typeReference_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4390:28: ( (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4391:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4391:1: (otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4391:3: otherlv_0= 'super' ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleJvmLowerBound10240); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJvmLowerBoundAccess().getSuperKeyword_0());
                  
            }
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4395:1: ( (lv_typeReference_1_0= ruleJvmTypeReference ) )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4396:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            {
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4396:1: (lv_typeReference_1_0= ruleJvmTypeReference )
            // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4397:3: lv_typeReference_1_0= ruleJvmTypeReference
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJvmLowerBoundAccess().getTypeReferenceJvmTypeReferenceParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10261);
            lv_typeReference_1_0=ruleJvmTypeReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJvmLowerBoundRule());
              	        }
                     		set(
                     			current, 
                     			"typeReference",
                      		lv_typeReference_1_0, 
                      		"JvmTypeReference");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleJvmLowerBound"

    // $ANTLR start synpred2_InternalInstances
    public final void synpred2_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:3: ( ( () ( ( ruleOpMultiAssign ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:4: ( () ( ( ruleOpMultiAssign ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:4: ( () ( ( ruleOpMultiAssign ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:5: () ( ( ruleOpMultiAssign ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:566:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:567:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:567:2: ( ( ruleOpMultiAssign ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:568:1: ( ruleOpMultiAssign )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:568:1: ( ruleOpMultiAssign )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:569:3: ruleOpMultiAssign
        {
        pushFollow(FOLLOW_ruleOpMultiAssign_in_synpred2_InternalInstances1169);
        ruleOpMultiAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalInstances

    // $ANTLR start synpred3_InternalInstances
    public final void synpred3_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:3: ( ( () ( ( ruleOpOr ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:4: ( () ( ( ruleOpOr ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:4: ( () ( ( ruleOpOr ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:5: () ( ( ruleOpOr ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:694:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:695:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:695:2: ( ( ruleOpOr ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:696:1: ( ruleOpOr )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:696:1: ( ruleOpOr )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:697:3: ruleOpOr
        {
        pushFollow(FOLLOW_ruleOpOr_in_synpred3_InternalInstances1517);
        ruleOpOr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalInstances

    // $ANTLR start synpred4_InternalInstances
    public final void synpred4_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:3: ( ( () ( ( ruleOpAnd ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:4: ( () ( ( ruleOpAnd ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:4: ( () ( ( ruleOpAnd ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:5: () ( ( ruleOpAnd ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:795:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:796:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:796:2: ( ( ruleOpAnd ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:797:1: ( ruleOpAnd )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:797:1: ( ruleOpAnd )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:798:3: ruleOpAnd
        {
        pushFollow(FOLLOW_ruleOpAnd_in_synpred4_InternalInstances1776);
        ruleOpAnd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred4_InternalInstances

    // $ANTLR start synpred5_InternalInstances
    public final void synpred5_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:3: ( ( () ( ( ruleOpEquality ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:4: ( () ( ( ruleOpEquality ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:4: ( () ( ( ruleOpEquality ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:5: () ( ( ruleOpEquality ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:896:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:897:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:897:2: ( ( ruleOpEquality ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:898:1: ( ruleOpEquality )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:898:1: ( ruleOpEquality )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:899:3: ruleOpEquality
        {
        pushFollow(FOLLOW_ruleOpEquality_in_synpred5_InternalInstances2035);
        ruleOpEquality();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalInstances

    // $ANTLR start synpred6_InternalInstances
    public final void synpred6_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:4: ( ( () 'instanceof' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:5: ( () 'instanceof' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:5: ( () 'instanceof' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:6: () 'instanceof'
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1004:6: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1005:1: 
        {
        }

        match(input,22,FOLLOW_22_in_synpred6_InternalInstances2311); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalInstances

    // $ANTLR start synpred7_InternalInstances
    public final void synpred7_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:8: ( ( () ( ( ruleOpCompare ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:9: ( () ( ( ruleOpCompare ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:9: ( () ( ( ruleOpCompare ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:10: () ( ( ruleOpCompare ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1032:10: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1033:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1033:2: ( ( ruleOpCompare ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1034:1: ( ruleOpCompare )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1034:1: ( ruleOpCompare )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1035:3: ruleOpCompare
        {
        pushFollow(FOLLOW_ruleOpCompare_in_synpred7_InternalInstances2384);
        ruleOpCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalInstances

    // $ANTLR start synpred8_InternalInstances
    public final void synpred8_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:3: ( ( () ( ( ruleOpOther ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:4: ( () ( ( ruleOpOther ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:4: ( () ( ( ruleOpOther ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:5: () ( ( ruleOpOther ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1154:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1155:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1155:2: ( ( ruleOpOther ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1156:1: ( ruleOpOther )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1156:1: ( ruleOpOther )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1157:3: ruleOpOther
        {
        pushFollow(FOLLOW_ruleOpOther_in_synpred8_InternalInstances2703);
        ruleOpOther();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred8_InternalInstances

    // $ANTLR start synpred9_InternalInstances
    public final void synpred9_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:3: ( ( () ( ( ruleOpAdd ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:4: ( () ( ( ruleOpAdd ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:4: ( () ( ( ruleOpAdd ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:5: () ( ( ruleOpAdd ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1262:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1263:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1263:2: ( ( ruleOpAdd ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1264:1: ( ruleOpAdd )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1264:1: ( ruleOpAdd )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1265:3: ruleOpAdd
        {
        pushFollow(FOLLOW_ruleOpAdd_in_synpred9_InternalInstances2983);
        ruleOpAdd();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalInstances

    // $ANTLR start synpred10_InternalInstances
    public final void synpred10_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:3: ( ( () ( ( ruleOpMulti ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:4: ( () ( ( ruleOpMulti ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:4: ( () ( ( ruleOpMulti ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:5: () ( ( ruleOpMulti ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1370:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1371:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1371:2: ( ( ruleOpMulti ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1372:1: ( ruleOpMulti )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1372:1: ( ruleOpMulti )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1373:3: ruleOpMulti
        {
        pushFollow(FOLLOW_ruleOpMulti_in_synpred10_InternalInstances3263);
        ruleOpMulti();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred10_InternalInstances

    // $ANTLR start synpred11_InternalInstances
    public final void synpred11_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:3: ( ( () 'as' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:4: ( () 'as' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:4: ( () 'as' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:5: () 'as'
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1603:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1604:1: 
        {
        }

        match(input,36,FOLLOW_36_in_synpred11_InternalInstances3857); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred11_InternalInstances

    // $ANTLR start synpred12_InternalInstances
    public final void synpred12_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:4: ( ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:5: ( () '.' ( ( RULE_ID ) ) ruleOpSingleAssign )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:6: () '.' ( ( RULE_ID ) ) ruleOpSingleAssign
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1663:6: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1664:1: 
        {
        }

        match(input,13,FOLLOW_13_in_synpred12_InternalInstances4011); if (state.failed) return ;
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1665:1: ( ( RULE_ID ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1666:1: ( RULE_ID )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1666:1: ( RULE_ID )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1667:2: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_RULE_ID_in_synpred12_InternalInstances4019); if (state.failed) return ;

        }


        }

        pushFollow(FOLLOW_ruleOpSingleAssign_in_synpred12_InternalInstances4026);
        ruleOpSingleAssign();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred12_InternalInstances

    // $ANTLR start synpred13_InternalInstances
    public final void synpred13_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:8: ( ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:9: ( () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:10: () ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1720:10: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1721:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1721:2: ( '.' | ( ( '?.' ) ) | ( ( '*.' ) ) )
        int alt68=3;
        switch ( input.LA(1) ) {
        case 13:
            {
            alt68=1;
            }
            break;
        case 37:
            {
            alt68=2;
            }
            break;
        case 38:
            {
            alt68=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }

        switch (alt68) {
            case 1 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1721:4: '.'
                {
                match(input,13,FOLLOW_13_in_synpred13_InternalInstances4126); if (state.failed) return ;

                }
                break;
            case 2 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1723:6: ( ( '?.' ) )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1723:6: ( ( '?.' ) )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1724:1: ( '?.' )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1724:1: ( '?.' )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1725:2: '?.'
                {
                match(input,37,FOLLOW_37_in_synpred13_InternalInstances4140); if (state.failed) return ;

                }


                }


                }
                break;
            case 3 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1730:6: ( ( '*.' ) )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1730:6: ( ( '*.' ) )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1731:1: ( '*.' )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1731:1: ( '*.' )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1732:2: '*.'
                {
                match(input,38,FOLLOW_38_in_synpred13_InternalInstances4160); if (state.failed) return ;

                }


                }


                }
                break;

        }


        }


        }
    }
    // $ANTLR end synpred13_InternalInstances

    // $ANTLR start synpred14_InternalInstances
    public final void synpred14_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1839:4: ( ( '(' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1840:1: ( '(' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1840:1: ( '(' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1841:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred14_InternalInstances4384); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalInstances

    // $ANTLR start synpred15_InternalInstances
    public final void synpred15_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1860:6: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1861:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1861:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt70=2;
        int LA70_0 = input.LA(1);

        if ( (LA70_0==RULE_ID||LA70_0==40||LA70_0==66) ) {
            alt70=1;
        }
        switch (alt70) {
            case 1 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1861:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1861:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1862:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1862:1: ( ruleJvmFormalParameter )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1863:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalInstances4436);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1865:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop69:
                do {
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==39) ) {
                        alt69=1;
                    }


                    switch (alt69) {
                	case 1 :
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1865:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred15_InternalInstances4443); if (state.failed) return ;
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1866:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1867:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1867:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:1868:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalInstances4450);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop69;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred15_InternalInstances4460); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred15_InternalInstances

    // $ANTLR start synpred17_InternalInstances
    public final void synpred17_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:4: ( 'else' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:2474:6: 'else'
        {
        match(input,46,FOLLOW_46_in_synpred17_InternalInstances5905); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalInstances

    // $ANTLR start synpred18_InternalInstances
    public final void synpred18_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3118:4: ( ( '(' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3119:1: ( '(' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3119:1: ( '(' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3120:2: '('
        {
        match(input,40,FOLLOW_40_in_synpred18_InternalInstances7206); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred18_InternalInstances

    // $ANTLR start synpred19_InternalInstances
    public final void synpred19_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:4: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:5: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:6: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3139:6: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3140:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3140:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt74=2;
        int LA74_0 = input.LA(1);

        if ( (LA74_0==RULE_ID||LA74_0==40||LA74_0==66) ) {
            alt74=1;
        }
        switch (alt74) {
            case 1 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3140:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3140:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3141:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3141:1: ( ruleJvmFormalParameter )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3142:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalInstances7258);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3144:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop73:
                do {
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==39) ) {
                        alt73=1;
                    }


                    switch (alt73) {
                	case 1 :
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3144:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred19_InternalInstances7265); if (state.failed) return ;
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3145:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3146:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3146:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3147:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalInstances7272);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop73;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred19_InternalInstances7282); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalInstances

    // $ANTLR start synpred20_InternalInstances
    public final void synpred20_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:3: ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:4: ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:5: () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|'
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3380:5: ()
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3381:1: 
        {
        }

        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3381:2: ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )?
        int alt76=2;
        int LA76_0 = input.LA(1);

        if ( (LA76_0==RULE_ID||LA76_0==40||LA76_0==66) ) {
            alt76=1;
        }
        switch (alt76) {
            case 1 :
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3381:3: ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )*
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3381:3: ( ( ruleJvmFormalParameter ) )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3382:1: ( ruleJvmFormalParameter )
                {
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3382:1: ( ruleJvmFormalParameter )
                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3383:1: ruleJvmFormalParameter
                {
                pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalInstances7839);
                ruleJvmFormalParameter();

                state._fsp--;
                if (state.failed) return ;

                }


                }

                // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3385:2: ( ',' ( ( ruleJvmFormalParameter ) ) )*
                loop75:
                do {
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==39) ) {
                        alt75=1;
                    }


                    switch (alt75) {
                	case 1 :
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3385:4: ',' ( ( ruleJvmFormalParameter ) )
                	    {
                	    match(input,39,FOLLOW_39_in_synpred20_InternalInstances7846); if (state.failed) return ;
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3386:1: ( ( ruleJvmFormalParameter ) )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3387:1: ( ruleJvmFormalParameter )
                	    {
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3387:1: ( ruleJvmFormalParameter )
                	    // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3388:1: ruleJvmFormalParameter
                	    {
                	    pushFollow(FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalInstances7853);
                	    ruleJvmFormalParameter();

                	    state._fsp--;
                	    if (state.failed) return ;

                	    }


                	    }


                	    }
                	    break;

                	default :
                	    break loop75;
                    }
                } while (true);


                }
                break;

        }

        match(input,43,FOLLOW_43_in_synpred20_InternalInstances7863); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred20_InternalInstances

    // $ANTLR start synpred21_InternalInstances
    public final void synpred21_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3711:2: ( ( ruleXExpression ) )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3712:1: ( ruleXExpression )
        {
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3712:1: ( ruleXExpression )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3713:1: ruleXExpression
        {
        pushFollow(FOLLOW_ruleXExpression_in_synpred21_InternalInstances8642);
        ruleXExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred21_InternalInstances

    // $ANTLR start synpred22_InternalInstances
    public final void synpred22_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:5: ( 'catch' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3782:7: 'catch'
        {
        match(input,65,FOLLOW_65_in_synpred22_InternalInstances8787); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalInstances

    // $ANTLR start synpred23_InternalInstances
    public final void synpred23_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:5: ( 'finally' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3801:7: 'finally'
        {
        match(input,64,FOLLOW_64_in_synpred23_InternalInstances8817); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred23_InternalInstances

    // $ANTLR start synpred25_InternalInstances
    public final void synpred25_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3945:3: ( '.' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:3946:2: '.'
        {
        match(input,13,FOLLOW_13_in_synpred25_InternalInstances9157); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalInstances

    // $ANTLR start synpred26_InternalInstances
    public final void synpred26_InternalInstances_fragment() throws RecognitionException {   
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:4: ( '<' )
        // ../org.xtext.lwc.instances/src-gen/org/xtext/lwc/instances/parser/antlr/internal/InternalInstances.g:4127:6: '<'
        {
        match(input,26,FOLLOW_26_in_synpred26_InternalInstances9607); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred26_InternalInstances

    // Delegated rules

    public final boolean synpred25_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred23_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalInstances() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalInstances_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA65 dfa65 = new DFA65(this);
    static final String DFA28_eotS =
        "\71\uffff";
    static final String DFA28_eofS =
        "\1\2\70\uffff";
    static final String DFA28_minS =
        "\1\4\1\0\67\uffff";
    static final String DFA28_maxS =
        "\1\102\1\0\67\uffff";
    static final String DFA28_acceptS =
        "\2\uffff\1\2\65\uffff\1\1";
    static final String DFA28_specialS =
        "\1\uffff\1\0\67\uffff}>";
    static final String[] DFA28_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\31\2\1\1\2\2\1\uffff\13\2\1\uffff\13"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "1839:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_16_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )? otherlv_21= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_1 = input.LA(1);

                         
                        int index28_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index28_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA27_eotS =
        "\34\uffff";
    static final String DFA27_eofS =
        "\34\uffff";
    static final String DFA27_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA27_maxS =
        "\1\102\2\0\31\uffff";
    static final String DFA27_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA27_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\5\1\1\1\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\4\uffff\1"+
            "\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\4\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1860:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_memberCallArguments_17_0= ruleXShortClosure ) ) | ( ( (lv_memberCallArguments_18_0= ruleXExpression ) ) (otherlv_19= ',' ( (lv_memberCallArguments_20_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==RULE_ID) ) {s = 1;}

                        else if ( (LA27_0==40) ) {s = 2;}

                        else if ( (LA27_0==66) && (synpred15_InternalInstances())) {s = 3;}

                        else if ( (LA27_0==43) && (synpred15_InternalInstances())) {s = 4;}

                        else if ( (LA27_0==RULE_INT||LA27_0==RULE_STRING||LA27_0==15||LA27_0==26||(LA27_0>=29 && LA27_0<=30)||LA27_0==35||LA27_0==42||LA27_0==45||LA27_0==47||(LA27_0>=51 && LA27_0<=54)||(LA27_0>=56 && LA27_0<=63)) ) {s = 5;}

                        else if ( (LA27_0==41) ) {s = 27;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_1 = input.LA(1);

                         
                        int index27_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred15_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index27_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA30_eotS =
        "\16\uffff";
    static final String DFA30_eofS =
        "\16\uffff";
    static final String DFA30_minS =
        "\1\4\15\uffff";
    static final String DFA30_maxS =
        "\1\77\15\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15";
    static final String DFA30_specialS =
        "\16\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\5\1\4\1\5\10\uffff\1\2\12\uffff\1\4\15\uffff\1\15\1\uffff"+
            "\1\5\2\uffff\1\6\1\uffff\1\3\3\uffff\1\7\1\10\1\11\1\4\1\uffff"+
            "\1\1\4\5\1\12\1\13\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1955:1: (this_XConstructorCall_0= ruleXConstructorCall | this_XBlockExpression_1= ruleXBlockExpression | this_XSwitchExpression_2= ruleXSwitchExpression | this_XFeatureCall_3= ruleXFeatureCall | this_XLiteral_4= ruleXLiteral | this_XIfExpression_5= ruleXIfExpression | this_XForLoopExpression_6= ruleXForLoopExpression | this_XWhileExpression_7= ruleXWhileExpression | this_XDoWhileExpression_8= ruleXDoWhileExpression | this_XThrowExpression_9= ruleXThrowExpression | this_XReturnExpression_10= ruleXReturnExpression | this_XTryCatchFinallyExpression_11= ruleXTryCatchFinallyExpression | this_XParenthesizedExpression_12= ruleXParenthesizedExpression )";
        }
    }
    static final String DFA48_eotS =
        "\71\uffff";
    static final String DFA48_eofS =
        "\1\2\70\uffff";
    static final String DFA48_minS =
        "\1\4\1\0\67\uffff";
    static final String DFA48_maxS =
        "\1\102\1\0\67\uffff";
    static final String DFA48_acceptS =
        "\2\uffff\1\2\65\uffff\1\1";
    static final String DFA48_specialS =
        "\1\uffff\1\0\67\uffff}>";
    static final String[] DFA48_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\31\2\1\1\2\2\1\uffff\13\2\1\uffff\13"+
            "\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "3118:2: ( ( ( ( '(' ) )=> (lv_explicitOperationCall_8_0= '(' ) ) ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )? otherlv_13= ')' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_1 = input.LA(1);

                         
                        int index48_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index48_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA47_eotS =
        "\34\uffff";
    static final String DFA47_eofS =
        "\34\uffff";
    static final String DFA47_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA47_maxS =
        "\1\102\2\0\31\uffff";
    static final String DFA47_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA47_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\5\1\1\1\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\4\uffff\1"+
            "\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\4\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3139:2: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_featureCallArguments_9_0= ruleXShortClosure ) ) | ( ( (lv_featureCallArguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_featureCallArguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA47_0 = input.LA(1);

                         
                        int index47_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA47_0==RULE_ID) ) {s = 1;}

                        else if ( (LA47_0==40) ) {s = 2;}

                        else if ( (LA47_0==66) && (synpred19_InternalInstances())) {s = 3;}

                        else if ( (LA47_0==43) && (synpred19_InternalInstances())) {s = 4;}

                        else if ( (LA47_0==RULE_INT||LA47_0==RULE_STRING||LA47_0==15||LA47_0==26||(LA47_0>=29 && LA47_0<=30)||LA47_0==35||LA47_0==42||LA47_0==45||LA47_0==47||(LA47_0>=51 && LA47_0<=54)||(LA47_0>=56 && LA47_0<=63)) ) {s = 5;}

                        else if ( (LA47_0==41) ) {s = 27;}

                         
                        input.seek(index47_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA47_1 = input.LA(1);

                         
                        int index47_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index47_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA47_2 = input.LA(1);

                         
                        int index47_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index47_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 47, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA54_eotS =
        "\34\uffff";
    static final String DFA54_eofS =
        "\34\uffff";
    static final String DFA54_minS =
        "\1\4\2\0\31\uffff";
    static final String DFA54_maxS =
        "\1\102\2\0\31\uffff";
    static final String DFA54_acceptS =
        "\3\uffff\2\1\1\2\25\uffff\1\3";
    static final String DFA54_specialS =
        "\1\0\1\1\1\2\31\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\5\1\1\1\5\10\uffff\1\5\12\uffff\1\5\2\uffff\2\5\4\uffff\1"+
            "\5\4\uffff\1\2\1\33\1\5\1\4\1\uffff\1\5\1\uffff\1\5\3\uffff"+
            "\4\5\1\uffff\10\5\2\uffff\1\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "3380:1: ( ( ( ( () ( ( ( ruleJvmFormalParameter ) ) ( ',' ( ( ruleJvmFormalParameter ) ) )* )? '|' ) )=> (lv_arguments_9_0= ruleXShortClosure ) ) | ( ( (lv_arguments_10_0= ruleXExpression ) ) (otherlv_11= ',' ( (lv_arguments_12_0= ruleXExpression ) ) )* ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_0 = input.LA(1);

                         
                        int index54_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA54_0==RULE_ID) ) {s = 1;}

                        else if ( (LA54_0==40) ) {s = 2;}

                        else if ( (LA54_0==66) && (synpred20_InternalInstances())) {s = 3;}

                        else if ( (LA54_0==43) && (synpred20_InternalInstances())) {s = 4;}

                        else if ( (LA54_0==RULE_INT||LA54_0==RULE_STRING||LA54_0==15||LA54_0==26||(LA54_0>=29 && LA54_0<=30)||LA54_0==35||LA54_0==42||LA54_0==45||LA54_0==47||(LA54_0>=51 && LA54_0<=54)||(LA54_0>=56 && LA54_0<=63)) ) {s = 5;}

                        else if ( (LA54_0==41) ) {s = 27;}

                         
                        input.seek(index54_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_1 = input.LA(1);

                         
                        int index54_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_1);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA54_2 = input.LA(1);

                         
                        int index54_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred20_InternalInstances()) ) {s = 4;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index54_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA56_eotS =
        "\71\uffff";
    static final String DFA56_eofS =
        "\1\31\70\uffff";
    static final String DFA56_minS =
        "\1\4\30\0\40\uffff";
    static final String DFA56_maxS =
        "\1\102\30\0\40\uffff";
    static final String DFA56_acceptS =
        "\31\uffff\1\2\36\uffff\1\1";
    static final String DFA56_specialS =
        "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
        "\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\40\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\15\1\1\1\17\6\uffff\1\31\1\uffff\1\6\12\31\1\10\2\31\1\4"+
            "\1\3\4\31\1\2\4\31\1\30\1\31\1\12\1\uffff\1\31\1\21\1\31\1\7"+
            "\3\31\1\22\1\23\1\24\1\11\1\uffff\1\5\1\13\1\14\1\16\1\20\1"+
            "\25\1\26\1\27\3\31",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3711:1: ( ( ( ruleXExpression ) )=> (lv_expression_2_0= ruleXExpression ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_1 = input.LA(1);

                         
                        int index56_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA56_4 = input.LA(1);

                         
                        int index56_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA56_7 = input.LA(1);

                         
                        int index56_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA56_8 = input.LA(1);

                         
                        int index56_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA56_9 = input.LA(1);

                         
                        int index56_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA56_10 = input.LA(1);

                         
                        int index56_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA56_11 = input.LA(1);

                         
                        int index56_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA56_12 = input.LA(1);

                         
                        int index56_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA56_13 = input.LA(1);

                         
                        int index56_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA56_14 = input.LA(1);

                         
                        int index56_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA56_15 = input.LA(1);

                         
                        int index56_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA56_16 = input.LA(1);

                         
                        int index56_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA56_17 = input.LA(1);

                         
                        int index56_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_17);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA56_18 = input.LA(1);

                         
                        int index56_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_18);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA56_19 = input.LA(1);

                         
                        int index56_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA56_20 = input.LA(1);

                         
                        int index56_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_22);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA56_23 = input.LA(1);

                         
                        int index56_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA56_24 = input.LA(1);

                         
                        int index56_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred21_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index56_24);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA65_eotS =
        "\71\uffff";
    static final String DFA65_eofS =
        "\1\2\70\uffff";
    static final String DFA65_minS =
        "\1\4\1\0\67\uffff";
    static final String DFA65_maxS =
        "\1\102\1\0\67\uffff";
    static final String DFA65_acceptS =
        "\2\uffff\1\2\65\uffff\1\1";
    static final String DFA65_specialS =
        "\1\uffff\1\0\67\uffff}>";
    static final String[] DFA65_transitionS = {
            "\3\2\6\uffff\1\2\1\uffff\13\2\1\1\20\2\1\uffff\13\2\1\uffff"+
            "\13\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA65_eot = DFA.unpackEncodedString(DFA65_eotS);
    static final short[] DFA65_eof = DFA.unpackEncodedString(DFA65_eofS);
    static final char[] DFA65_min = DFA.unpackEncodedStringToUnsignedChars(DFA65_minS);
    static final char[] DFA65_max = DFA.unpackEncodedStringToUnsignedChars(DFA65_maxS);
    static final short[] DFA65_accept = DFA.unpackEncodedString(DFA65_acceptS);
    static final short[] DFA65_special = DFA.unpackEncodedString(DFA65_specialS);
    static final short[][] DFA65_transition;

    static {
        int numStates = DFA65_transitionS.length;
        DFA65_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA65_transition[i] = DFA.unpackEncodedString(DFA65_transitionS[i]);
        }
    }

    class DFA65 extends DFA {

        public DFA65(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 65;
            this.eot = DFA65_eot;
            this.eof = DFA65_eof;
            this.min = DFA65_min;
            this.max = DFA65_max;
            this.accept = DFA65_accept;
            this.special = DFA65_special;
            this.transition = DFA65_transition;
        }
        public String getDescription() {
            return "4127:2: ( ( ( '<' )=>otherlv_1= '<' ) ( (lv_arguments_2_0= ruleJvmArgumentTypeReference ) ) (otherlv_3= ',' ( (lv_arguments_4_0= ruleJvmArgumentTypeReference ) ) )* otherlv_5= '>' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA65_1 = input.LA(1);

                         
                        int index65_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred26_InternalInstances()) ) {s = 56;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index65_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 65, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleInstance_in_entryRuleInstance75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstance85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleInstance140 = new BitSet(new long[]{0x0000010000000822L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_ruleInstance162 = new BitSet(new long[]{0x0000010000000022L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImport246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_ruleImport267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildCard_in_entryRuleQualifiedNameWithWildCard304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildCard315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildCard362 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleQualifiedNameWithWildCard381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_entryRuleXIntLiteral423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIntLiteral433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral496 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXIntLiteral513 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral530 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleXIntLiteral547 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleXIntLiteral603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXVariableDeclaration_in_entryRuleXVariableDeclaration645 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXVariableDeclaration655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXVariableDeclaration710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXVariableDeclaration727 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleXVariableDeclaration744 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXVariableDeclaration765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_entryRuleXBlockExpression801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBlockExpression811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleXBlockExpression857 = new BitSet(new long[]{0xFF78A50864018070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXBlockExpression878 = new BitSet(new long[]{0xFF78A50864018070L});
    public static final BitSet FOLLOW_16_in_ruleXBlockExpression891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_entryRuleXExpression927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXExpression937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXExpression983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAssignment_in_entryRuleXAssignment1017 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAssignment1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXAssignment1082 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXAssignment1098 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_ruleXAssignment1148 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_ruleXAssignment1201 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXAssignment1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_entryRuleOpSingleAssign1264 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpSingleAssign1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleOpSingleAssign1312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_entryRuleOpMultiAssign1352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMultiAssign1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOpMultiAssign1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrExpression_in_entryRuleXOrExpression1439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrExpression1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1496 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_ruleXOrExpression1549 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_ruleXOrExpression1572 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleOpOr_in_entryRuleOpOr1611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOr1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleOpOr1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAndExpression_in_entryRuleXAndExpression1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAndExpression1708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1755 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_ruleXAndExpression1808 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_ruleXAndExpression1831 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_entryRuleOpAnd1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAnd1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleOpAnd1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXEqualityExpression_in_entryRuleXEqualityExpression1957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXEqualityExpression1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2014 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_ruleXEqualityExpression2067 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_ruleXEqualityExpression2090 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_entryRuleOpEquality2129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpEquality2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleOpEquality2178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleOpEquality2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXRelationalExpression_in_entryRuleXRelationalExpression2237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXRelationalExpression2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2294 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_22_in_ruleXRelationalExpression2330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXRelationalExpression2355 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_ruleXRelationalExpression2416 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_ruleXRelationalExpression2439 = new BitSet(new long[]{0x0000000007C00002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_entryRuleOpCompare2479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpCompare2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleOpCompare2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleOpCompare2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleOpCompare2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleOpCompare2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOtherOperatorExpression_in_entryRuleXOtherOperatorExpression2625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOtherOperatorExpression2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2682 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_ruleXOtherOperatorExpression2735 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_ruleXOtherOperatorExpression2758 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_entryRuleOpOther2797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpOther2808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleOpOther2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleOpOther2865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXAdditiveExpression_in_entryRuleXAdditiveExpression2905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXAdditiveExpression2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression2962 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_ruleXAdditiveExpression3015 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_ruleXAdditiveExpression3038 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_entryRuleOpAdd3077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpAdd3088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpAdd3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpAdd3145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMultiplicativeExpression_in_entryRuleXMultiplicativeExpression3185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMultiplicativeExpression3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3242 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_ruleXMultiplicativeExpression3295 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_ruleXMultiplicativeExpression3318 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_entryRuleOpMulti3357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpMulti3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOpMulti3406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOpMulti3425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOpMulti3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOpMulti3463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXUnaryOperation_in_entryRuleXUnaryOperation3503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXUnaryOperation3513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_ruleXUnaryOperation3571 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_ruleXUnaryOperation3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpUnary_in_entryRuleOpUnary3657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpUnary3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleOpUnary3706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleOpUnary3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOpUnary3744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCastedExpression_in_entryRuleXCastedExpression3784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCastedExpression3794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_ruleXCastedExpression3841 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_ruleXCastedExpression3876 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCastedExpression3899 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleXMemberFeatureCall_in_entryRuleXMemberFeatureCall3937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXMemberFeatureCall3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_ruleXMemberFeatureCall3994 = new BitSet(new long[]{0x0000006000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4043 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4063 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_ruleXMemberFeatureCall4079 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXAssignment_in_ruleXMemberFeatureCall4101 = new BitSet(new long[]{0x0000006000002002L});
    public static final BitSet FOLLOW_13_in_ruleXMemberFeatureCall4187 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_37_in_ruleXMemberFeatureCall4211 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_38_in_ruleXMemberFeatureCall4248 = new BitSet(new long[]{0x0000000004000020L});
    public static final BitSet FOLLOW_26_in_ruleXMemberFeatureCall4277 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4298 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4311 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXMemberFeatureCall4332 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXMemberFeatureCall4346 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXMemberFeatureCall4368 = new BitSet(new long[]{0x0000016000002002L});
    public static final BitSet FOLLOW_40_in_ruleXMemberFeatureCall4402 = new BitSet(new long[]{0xFF78AF0864008070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXMemberFeatureCall4477 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4505 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXMemberFeatureCall4518 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXMemberFeatureCall4539 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXMemberFeatureCall4556 = new BitSet(new long[]{0x0000006000002002L});
    public static final BitSet FOLLOW_ruleXPrimaryExpression_in_entryRuleXPrimaryExpression4597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXPrimaryExpression4607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_ruleXPrimaryExpression4654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBlockExpression_in_ruleXPrimaryExpression4681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_ruleXPrimaryExpression4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_ruleXPrimaryExpression4735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_ruleXPrimaryExpression4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_ruleXPrimaryExpression4789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_ruleXPrimaryExpression4816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_ruleXPrimaryExpression4843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_ruleXPrimaryExpression4870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_ruleXPrimaryExpression4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_ruleXPrimaryExpression4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_ruleXPrimaryExpression4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_ruleXPrimaryExpression4978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXLiteral_in_entryRuleXLiteral5013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXLiteral5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_ruleXLiteral5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_ruleXLiteral5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIntLiteral_in_ruleXLiteral5124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_ruleXLiteral5151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_ruleXLiteral5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_ruleXLiteral5205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXClosure_in_entryRuleXClosure5240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXClosure5250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleXClosure5296 = new BitSet(new long[]{0x0000090000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5318 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXClosure5331 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXClosure5352 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXClosure5368 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXClosure5389 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleXClosure5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_entryRuleXShortClosure5437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXShortClosure5447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5545 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_ruleXShortClosure5558 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXShortClosure5579 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_ruleXShortClosure5595 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXShortClosure5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXParenthesizedExpression_in_entryRuleXParenthesizedExpression5654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXParenthesizedExpression5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXParenthesizedExpression5701 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXParenthesizedExpression5723 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXParenthesizedExpression5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXIfExpression_in_entryRuleXIfExpression5770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXIfExpression5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleXIfExpression5826 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXIfExpression5838 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5859 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXIfExpression5871 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5892 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleXIfExpression5913 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXIfExpression5935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXSwitchExpression_in_entryRuleXSwitchExpression5973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXSwitchExpression5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleXSwitchExpression6029 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleXSwitchExpression6047 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6064 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleXSwitchExpression6099 = new BitSet(new long[]{0x0005010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXCasePart_in_ruleXSwitchExpression6120 = new BitSet(new long[]{0x0007010000010020L,0x0000000000000004L});
    public static final BitSet FOLLOW_49_in_ruleXSwitchExpression6134 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXSwitchExpression6146 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXSwitchExpression6167 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleXSwitchExpression6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCasePart_in_entryRuleXCasePart6217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCasePart6227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXCasePart6273 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_50_in_ruleXCasePart6287 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6308 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXCasePart6322 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCasePart6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXForLoopExpression_in_entryRuleXForLoopExpression6379 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXForLoopExpression6389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXForLoopExpression6435 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXForLoopExpression6447 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXForLoopExpression6468 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleXForLoopExpression6480 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6501 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXForLoopExpression6513 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXForLoopExpression6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXWhileExpression_in_entryRuleXWhileExpression6570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXWhileExpression6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleXWhileExpression6626 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXWhileExpression6638 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6659 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXWhileExpression6671 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXWhileExpression6692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDoWhileExpression_in_entryRuleXDoWhileExpression6728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDoWhileExpression6738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleXDoWhileExpression6784 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6805 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleXDoWhileExpression6817 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXDoWhileExpression6829 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXDoWhileExpression6850 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXDoWhileExpression6862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_entryRuleJvmFormalParameter6900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmFormalParameter6910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmFormalParameter6956 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleJvmFormalParameter6974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFeatureCall_in_entryRuleXFeatureCall7015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFeatureCall7025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_ruleXFeatureCall7082 = new BitSet(new long[]{0x0040000004000020L});
    public static final BitSet FOLLOW_26_in_ruleXFeatureCall7096 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7117 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7130 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXFeatureCall7151 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXFeatureCall7165 = new BitSet(new long[]{0x0040000004000020L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_ruleXFeatureCall7190 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFeatureCall7224 = new BitSet(new long[]{0xFF78AF0864008070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXFeatureCall7299 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7327 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFeatureCall7340 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXFeatureCall7361 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFeatureCall7378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIdOrSuper_in_entryRuleIdOrSuper7417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIdOrSuper7428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIdOrSuper7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIdOrSuper7492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStaticQualifier_in_entryRuleStaticQualifier7533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStaticQualifier7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStaticQualifier7584 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleStaticQualifier7602 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_ruleXConstructorCall_in_entryRuleXConstructorCall7643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXConstructorCall7653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleXConstructorCall7699 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXConstructorCall7722 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_26_in_ruleXConstructorCall7735 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7756 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall7769 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleXConstructorCall7790 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleXConstructorCall7804 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXConstructorCall7818 = new BitSet(new long[]{0xFF78AF0864008070L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleXShortClosure_in_ruleXConstructorCall7880 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7908 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXConstructorCall7921 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXConstructorCall7942 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXConstructorCall7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXBooleanLiteral_in_entryRuleXBooleanLiteral7995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXBooleanLiteral8005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleXBooleanLiteral8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleXBooleanLiteral8076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXNullLiteral_in_entryRuleXNullLiteral8126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXNullLiteral8136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleXNullLiteral8182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXStringLiteral_in_entryRuleXStringLiteral8218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXStringLiteral8228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleXStringLiteral8279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTypeLiteral_in_entryRuleXTypeLiteral8320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTypeLiteral8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXTypeLiteral8376 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXTypeLiteral8388 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleXTypeLiteral8411 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXTypeLiteral8423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXThrowExpression_in_entryRuleXThrowExpression8459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXThrowExpression8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXThrowExpression8515 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXThrowExpression8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXReturnExpression_in_entryRuleXReturnExpression8572 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXReturnExpression8582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXReturnExpression8628 = new BitSet(new long[]{0xFF78A50864008072L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXReturnExpression8659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXTryCatchFinallyExpression_in_entryRuleXTryCatchFinallyExpression8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXTryCatchFinallyExpression8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXTryCatchFinallyExpression8752 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_ruleXTryCatchFinallyExpression8803 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8825 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleXTryCatchFinallyExpression8869 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXTryCatchFinallyExpression8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXCatchClause_in_entryRuleXCatchClause8928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXCatchClause8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleXCatchClause8983 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleXCatchClause8996 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_ruleXCatchClause9017 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleXCatchClause9029 = new BitSet(new long[]{0xFF78A50864008070L});
    public static final BitSet FOLLOW_ruleXExpression_in_ruleXCatchClause9050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName9087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName9098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9138 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleQualifiedName9166 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName9182 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_entryRuleJvmTypeReference9229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmTypeReference9239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_ruleJvmTypeReference9286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_ruleJvmTypeReference9313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXFunctionTypeRef_in_entryRuleXFunctionTypeRef9348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXFunctionTypeRef9358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleXFunctionTypeRef9396 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9417 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_39_in_ruleXFunctionTypeRef9430 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9451 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_41_in_ruleXFunctionTypeRef9465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleXFunctionTypeRef9479 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleXFunctionTypeRef9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmParameterizedTypeReference_in_entryRuleJvmParameterizedTypeReference9536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmParameterizedTypeReference9546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleJvmParameterizedTypeReference9594 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleJvmParameterizedTypeReference9615 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9637 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_39_in_ruleJvmParameterizedTypeReference9650 = new BitSet(new long[]{0x0000010000000020L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_ruleJvmParameterizedTypeReference9671 = new BitSet(new long[]{0x0000008002000000L});
    public static final BitSet FOLLOW_25_in_ruleJvmParameterizedTypeReference9685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmArgumentTypeReference_in_entryRuleJvmArgumentTypeReference9723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmArgumentTypeReference9733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmArgumentTypeReference9780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_ruleJvmArgumentTypeReference9807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmWildcardTypeReference_in_entryRuleJvmWildcardTypeReference9842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmWildcardTypeReference9852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleJvmWildcardTypeReference9898 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_ruleJvmWildcardTypeReference9920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_ruleJvmWildcardTypeReference9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBound_in_entryRuleJvmUpperBound9985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBound9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleJvmUpperBound10032 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBound10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmUpperBoundAnded_in_entryRuleJvmUpperBoundAnded10089 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmUpperBoundAnded10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleJvmUpperBoundAnded10136 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmUpperBoundAnded10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmLowerBound_in_entryRuleJvmLowerBound10193 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJvmLowerBound10203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleJvmLowerBound10240 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmTypeReference_in_ruleJvmLowerBound10261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMultiAssign_in_synpred2_InternalInstances1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOr_in_synpred3_InternalInstances1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAnd_in_synpred4_InternalInstances1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpEquality_in_synpred5_InternalInstances2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_synpred6_InternalInstances2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpCompare_in_synpred7_InternalInstances2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpOther_in_synpred8_InternalInstances2703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpAdd_in_synpred9_InternalInstances2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpMulti_in_synpred10_InternalInstances3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_synpred11_InternalInstances3857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred12_InternalInstances4011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_synpred12_InternalInstances4019 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleOpSingleAssign_in_synpred12_InternalInstances4026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred13_InternalInstances4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_synpred13_InternalInstances4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_synpred13_InternalInstances4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred14_InternalInstances4384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalInstances4436 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred15_InternalInstances4443 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred15_InternalInstances4450 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred15_InternalInstances4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_synpred17_InternalInstances5905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_synpred18_InternalInstances7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalInstances7258 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred19_InternalInstances7265 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred19_InternalInstances7272 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred19_InternalInstances7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalInstances7839 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_39_in_synpred20_InternalInstances7846 = new BitSet(new long[]{0x0000010000000020L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleJvmFormalParameter_in_synpred20_InternalInstances7853 = new BitSet(new long[]{0x0000088000000000L});
    public static final BitSet FOLLOW_43_in_synpred20_InternalInstances7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXExpression_in_synpred21_InternalInstances8642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_synpred22_InternalInstances8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_synpred23_InternalInstances8817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_synpred25_InternalInstances9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_synpred26_InternalInstances9607 = new BitSet(new long[]{0x0000000000000002L});

}