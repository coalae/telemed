package ase.parser.antlr.internal;

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
import ase.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DATE", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SELECT'", "','", "'From'", "'MedicalRecord'", "'WHERE'", "';'", "'PatientMonitoring'", "'Prescription'", "'INSERT'", "'INTO'", "'Values('", "')'", "'DROP'", "'TABLE'", "'DELETE'", "'FROM'", "'and'", "'recordId'", "'='", "'patientId'", "'doctorId'", "'medicalCondition'", "'date'", "'price'", "'description'", "'monitoringId'", "'category'", "'riskPerception'", "'treated'", "'deviceId'", "'prescriptionId'", "'medicationName'", "'start'", "'end'", "'ordered'", "'Bronchitis'", "'Asthma'", "'Diabetes'", "'Flu'", "'Hypertension'", "'High'", "'Medium'", "'Low'"
    };
    public static final int T__50=50;
    public static final int RULE_DAY=9;
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_YEAR=11;
    public static final int T__19=19;
    public static final int T__59=59;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=12;
    public static final int RULE_DATE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_MONTH=10;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalQueryDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalQueryDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalQueryDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalQueryDsl.g"; }



     	private QueryDslGrammarAccess grammarAccess;

        public InternalQueryDslParser(TokenStream input, QueryDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected QueryDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalQueryDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalQueryDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalQueryDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalQueryDsl.g:72:1: ruleModel returns [EObject current=null] : ( (lv_queryType_0_0= ruleQueryType ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_queryType_0_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:78:2: ( ( (lv_queryType_0_0= ruleQueryType ) )* )
            // InternalQueryDsl.g:79:2: ( (lv_queryType_0_0= ruleQueryType ) )*
            {
            // InternalQueryDsl.g:79:2: ( (lv_queryType_0_0= ruleQueryType ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==25||LA1_0==29||LA1_0==31) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQueryDsl.g:80:3: (lv_queryType_0_0= ruleQueryType )
            	    {
            	    // InternalQueryDsl.g:80:3: (lv_queryType_0_0= ruleQueryType )
            	    // InternalQueryDsl.g:81:4: lv_queryType_0_0= ruleQueryType
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getQueryTypeQueryTypeParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_queryType_0_0=ruleQueryType();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"queryType",
            	    					lv_queryType_0_0,
            	    					"ase.QueryDsl.QueryType");
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


    // $ANTLR start "entryRuleQueryType"
    // InternalQueryDsl.g:101:1: entryRuleQueryType returns [EObject current=null] : iv_ruleQueryType= ruleQueryType EOF ;
    public final EObject entryRuleQueryType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQueryType = null;


        try {
            // InternalQueryDsl.g:101:50: (iv_ruleQueryType= ruleQueryType EOF )
            // InternalQueryDsl.g:102:2: iv_ruleQueryType= ruleQueryType EOF
            {
             newCompositeNode(grammarAccess.getQueryTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQueryType=ruleQueryType();

            state._fsp--;

             current =iv_ruleQueryType; 
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
    // $ANTLR end "entryRuleQueryType"


    // $ANTLR start "ruleQueryType"
    // InternalQueryDsl.g:108:1: ruleQueryType returns [EObject current=null] : (this_Select_0= ruleSelect | this_Insert_1= ruleInsert | this_Drop_2= ruleDrop | this_Delete_3= ruleDelete ) ;
    public final EObject ruleQueryType() throws RecognitionException {
        EObject current = null;

        EObject this_Select_0 = null;

        EObject this_Insert_1 = null;

        EObject this_Drop_2 = null;

        EObject this_Delete_3 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:114:2: ( (this_Select_0= ruleSelect | this_Insert_1= ruleInsert | this_Drop_2= ruleDrop | this_Delete_3= ruleDelete ) )
            // InternalQueryDsl.g:115:2: (this_Select_0= ruleSelect | this_Insert_1= ruleInsert | this_Drop_2= ruleDrop | this_Delete_3= ruleDelete )
            {
            // InternalQueryDsl.g:115:2: (this_Select_0= ruleSelect | this_Insert_1= ruleInsert | this_Drop_2= ruleDrop | this_Delete_3= ruleDelete )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 29:
                {
                alt2=3;
                }
                break;
            case 31:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalQueryDsl.g:116:3: this_Select_0= ruleSelect
                    {

                    			newCompositeNode(grammarAccess.getQueryTypeAccess().getSelectParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Select_0=ruleSelect();

                    state._fsp--;


                    			current = this_Select_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:125:3: this_Insert_1= ruleInsert
                    {

                    			newCompositeNode(grammarAccess.getQueryTypeAccess().getInsertParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Insert_1=ruleInsert();

                    state._fsp--;


                    			current = this_Insert_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:134:3: this_Drop_2= ruleDrop
                    {

                    			newCompositeNode(grammarAccess.getQueryTypeAccess().getDropParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Drop_2=ruleDrop();

                    state._fsp--;


                    			current = this_Drop_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:143:3: this_Delete_3= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getQueryTypeAccess().getDeleteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_3=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_3;
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
    // $ANTLR end "ruleQueryType"


    // $ANTLR start "entryRuleSelect"
    // InternalQueryDsl.g:155:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // InternalQueryDsl.g:155:47: (iv_ruleSelect= ruleSelect EOF )
            // InternalQueryDsl.g:156:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalQueryDsl.g:162:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'SELECT' (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SelectMedicalRecord_1 = null;

        EObject this_SelectPatientMonitoring_2 = null;

        EObject this_SelectPrescription_3 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:168:2: ( (otherlv_0= 'SELECT' (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription ) ) )
            // InternalQueryDsl.g:169:2: (otherlv_0= 'SELECT' (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription ) )
            {
            // InternalQueryDsl.g:169:2: (otherlv_0= 'SELECT' (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription ) )
            // InternalQueryDsl.g:170:3: otherlv_0= 'SELECT' (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSELECTKeyword_0());
            		
            // InternalQueryDsl.g:174:3: (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:175:4: this_SelectMedicalRecord_1= ruleSelectMedicalRecord
                    {

                    				newCompositeNode(grammarAccess.getSelectAccess().getSelectMedicalRecordParserRuleCall_1_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectMedicalRecord_1=ruleSelectMedicalRecord();

                    state._fsp--;


                    				current = this_SelectMedicalRecord_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:184:4: this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring
                    {

                    				newCompositeNode(grammarAccess.getSelectAccess().getSelectPatientMonitoringParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectPatientMonitoring_2=ruleSelectPatientMonitoring();

                    state._fsp--;


                    				current = this_SelectPatientMonitoring_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:193:4: this_SelectPrescription_3= ruleSelectPrescription
                    {

                    				newCompositeNode(grammarAccess.getSelectAccess().getSelectPrescriptionParserRuleCall_1_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_SelectPrescription_3=ruleSelectPrescription();

                    state._fsp--;


                    				current = this_SelectPrescription_3;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSelectMedicalRecord"
    // InternalQueryDsl.g:206:1: entryRuleSelectMedicalRecord returns [EObject current=null] : iv_ruleSelectMedicalRecord= ruleSelectMedicalRecord EOF ;
    public final EObject entryRuleSelectMedicalRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectMedicalRecord = null;


        try {
            // InternalQueryDsl.g:206:60: (iv_ruleSelectMedicalRecord= ruleSelectMedicalRecord EOF )
            // InternalQueryDsl.g:207:2: iv_ruleSelectMedicalRecord= ruleSelectMedicalRecord EOF
            {
             newCompositeNode(grammarAccess.getSelectMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectMedicalRecord=ruleSelectMedicalRecord();

            state._fsp--;

             current =iv_ruleSelectMedicalRecord; 
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
    // $ANTLR end "entryRuleSelectMedicalRecord"


    // $ANTLR start "ruleSelectMedicalRecord"
    // InternalQueryDsl.g:213:1: ruleSelectMedicalRecord returns [EObject current=null] : ( ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) ) (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )* otherlv_3= 'From' otherlv_4= 'MedicalRecord' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )? otherlv_7= ';' ) ;
    public final EObject ruleSelectMedicalRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_variableMedicalRecord_0_0 = null;

        Enumerator lv_variableMedicalRecordNext_2_0 = null;

        EObject lv_where_6_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:219:2: ( ( ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) ) (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )* otherlv_3= 'From' otherlv_4= 'MedicalRecord' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )? otherlv_7= ';' ) )
            // InternalQueryDsl.g:220:2: ( ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) ) (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )* otherlv_3= 'From' otherlv_4= 'MedicalRecord' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )? otherlv_7= ';' )
            {
            // InternalQueryDsl.g:220:2: ( ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) ) (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )* otherlv_3= 'From' otherlv_4= 'MedicalRecord' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )? otherlv_7= ';' )
            // InternalQueryDsl.g:221:3: ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) ) (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )* otherlv_3= 'From' otherlv_4= 'MedicalRecord' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )? otherlv_7= ';'
            {
            // InternalQueryDsl.g:221:3: ( (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord ) )
            // InternalQueryDsl.g:222:4: (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord )
            {
            // InternalQueryDsl.g:222:4: (lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord )
            // InternalQueryDsl.g:223:5: lv_variableMedicalRecord_0_0= ruleVariableMedicalRecord
            {

            					newCompositeNode(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordVariableMedicalRecordEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_variableMedicalRecord_0_0=ruleVariableMedicalRecord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectMedicalRecordRule());
            					}
            					add(
            						current,
            						"variableMedicalRecord",
            						lv_variableMedicalRecord_0_0,
            						"ase.QueryDsl.VariableMedicalRecord");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:240:3: (otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalQueryDsl.g:241:4: otherlv_1= ',' ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_6); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectMedicalRecordAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalQueryDsl.g:245:4: ( (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord ) )
            	    // InternalQueryDsl.g:246:5: (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord )
            	    {
            	    // InternalQueryDsl.g:246:5: (lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord )
            	    // InternalQueryDsl.g:247:6: lv_variableMedicalRecordNext_2_0= ruleVariableMedicalRecord
            	    {

            	    						newCompositeNode(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordNextVariableMedicalRecordEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_variableMedicalRecordNext_2_0=ruleVariableMedicalRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectMedicalRecordRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variableMedicalRecordNext",
            	    							lv_variableMedicalRecordNext_2_0,
            	    							"ase.QueryDsl.VariableMedicalRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectMedicalRecordAccess().getFromKeyword_2());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectMedicalRecordAccess().getMedicalRecordKeyword_3());
            		
            // InternalQueryDsl.g:273:3: (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalQueryDsl.g:274:4: otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWhereMedicalRecord ) )+
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectMedicalRecordAccess().getWHEREKeyword_4_0());
                    			
                    // InternalQueryDsl.g:278:4: ( (lv_where_6_0= ruleWhereMedicalRecord ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==34||(LA5_0>=36 && LA5_0<=41)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalQueryDsl.g:279:5: (lv_where_6_0= ruleWhereMedicalRecord )
                    	    {
                    	    // InternalQueryDsl.g:279:5: (lv_where_6_0= ruleWhereMedicalRecord )
                    	    // InternalQueryDsl.g:280:6: lv_where_6_0= ruleWhereMedicalRecord
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectMedicalRecordAccess().getWhereWhereMedicalRecordParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_where_6_0=ruleWhereMedicalRecord();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelectMedicalRecordRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"where",
                    	    							lv_where_6_0,
                    	    							"ase.QueryDsl.WhereMedicalRecord");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectMedicalRecordAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSelectMedicalRecord"


    // $ANTLR start "entryRuleSelectPatientMonitoring"
    // InternalQueryDsl.g:306:1: entryRuleSelectPatientMonitoring returns [EObject current=null] : iv_ruleSelectPatientMonitoring= ruleSelectPatientMonitoring EOF ;
    public final EObject entryRuleSelectPatientMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectPatientMonitoring = null;


        try {
            // InternalQueryDsl.g:306:64: (iv_ruleSelectPatientMonitoring= ruleSelectPatientMonitoring EOF )
            // InternalQueryDsl.g:307:2: iv_ruleSelectPatientMonitoring= ruleSelectPatientMonitoring EOF
            {
             newCompositeNode(grammarAccess.getSelectPatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectPatientMonitoring=ruleSelectPatientMonitoring();

            state._fsp--;

             current =iv_ruleSelectPatientMonitoring; 
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
    // $ANTLR end "entryRuleSelectPatientMonitoring"


    // $ANTLR start "ruleSelectPatientMonitoring"
    // InternalQueryDsl.g:313:1: ruleSelectPatientMonitoring returns [EObject current=null] : ( ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) ) (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )* otherlv_3= 'From' otherlv_4= 'PatientMonitoring' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )? otherlv_7= ';' ) ;
    public final EObject ruleSelectPatientMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_variablePatientMonitoring_0_0 = null;

        Enumerator lv_variablePatientMonitoringNext_2_0 = null;

        EObject lv_where_6_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:319:2: ( ( ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) ) (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )* otherlv_3= 'From' otherlv_4= 'PatientMonitoring' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )? otherlv_7= ';' ) )
            // InternalQueryDsl.g:320:2: ( ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) ) (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )* otherlv_3= 'From' otherlv_4= 'PatientMonitoring' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )? otherlv_7= ';' )
            {
            // InternalQueryDsl.g:320:2: ( ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) ) (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )* otherlv_3= 'From' otherlv_4= 'PatientMonitoring' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )? otherlv_7= ';' )
            // InternalQueryDsl.g:321:3: ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) ) (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )* otherlv_3= 'From' otherlv_4= 'PatientMonitoring' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )? otherlv_7= ';'
            {
            // InternalQueryDsl.g:321:3: ( (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring ) )
            // InternalQueryDsl.g:322:4: (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring )
            {
            // InternalQueryDsl.g:322:4: (lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring )
            // InternalQueryDsl.g:323:5: lv_variablePatientMonitoring_0_0= ruleVariablePatientMonitoring
            {

            					newCompositeNode(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringVariablePatientMonitoringEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_variablePatientMonitoring_0_0=ruleVariablePatientMonitoring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectPatientMonitoringRule());
            					}
            					set(
            						current,
            						"variablePatientMonitoring",
            						lv_variablePatientMonitoring_0_0,
            						"ase.QueryDsl.VariablePatientMonitoring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:340:3: (otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalQueryDsl.g:341:4: otherlv_1= ',' ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_10); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectPatientMonitoringAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalQueryDsl.g:345:4: ( (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring ) )
            	    // InternalQueryDsl.g:346:5: (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring )
            	    {
            	    // InternalQueryDsl.g:346:5: (lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring )
            	    // InternalQueryDsl.g:347:6: lv_variablePatientMonitoringNext_2_0= ruleVariablePatientMonitoring
            	    {

            	    						newCompositeNode(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringNextVariablePatientMonitoringEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_variablePatientMonitoringNext_2_0=ruleVariablePatientMonitoring();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectPatientMonitoringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablePatientMonitoringNext",
            	    							lv_variablePatientMonitoringNext_2_0,
            	    							"ase.QueryDsl.VariablePatientMonitoring");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectPatientMonitoringAccess().getFromKeyword_2());
            		
            otherlv_4=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectPatientMonitoringAccess().getPatientMonitoringKeyword_3());
            		
            // InternalQueryDsl.g:373:3: (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:374:4: otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePatientMonitoring ) )+
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectPatientMonitoringAccess().getWHEREKeyword_4_0());
                    			
                    // InternalQueryDsl.g:378:4: ( (lv_where_6_0= ruleWherePatientMonitoring ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==36||LA8_0==39||(LA8_0>=42 && LA8_0<=46)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalQueryDsl.g:379:5: (lv_where_6_0= ruleWherePatientMonitoring )
                    	    {
                    	    // InternalQueryDsl.g:379:5: (lv_where_6_0= ruleWherePatientMonitoring )
                    	    // InternalQueryDsl.g:380:6: lv_where_6_0= ruleWherePatientMonitoring
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectPatientMonitoringAccess().getWhereWherePatientMonitoringParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_12);
                    	    lv_where_6_0=ruleWherePatientMonitoring();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelectPatientMonitoringRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"where",
                    	    							lv_where_6_0,
                    	    							"ase.QueryDsl.WherePatientMonitoring");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectPatientMonitoringAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSelectPatientMonitoring"


    // $ANTLR start "entryRuleSelectPrescription"
    // InternalQueryDsl.g:406:1: entryRuleSelectPrescription returns [EObject current=null] : iv_ruleSelectPrescription= ruleSelectPrescription EOF ;
    public final EObject entryRuleSelectPrescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectPrescription = null;


        try {
            // InternalQueryDsl.g:406:59: (iv_ruleSelectPrescription= ruleSelectPrescription EOF )
            // InternalQueryDsl.g:407:2: iv_ruleSelectPrescription= ruleSelectPrescription EOF
            {
             newCompositeNode(grammarAccess.getSelectPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectPrescription=ruleSelectPrescription();

            state._fsp--;

             current =iv_ruleSelectPrescription; 
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
    // $ANTLR end "entryRuleSelectPrescription"


    // $ANTLR start "ruleSelectPrescription"
    // InternalQueryDsl.g:413:1: ruleSelectPrescription returns [EObject current=null] : ( ( (lv_variablePrescription_0_0= ruleVariablePrescription ) ) (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )* otherlv_3= 'From' otherlv_4= 'Prescription' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )? otherlv_7= ';' ) ;
    public final EObject ruleSelectPrescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_variablePrescription_0_0 = null;

        Enumerator lv_variablePrescriptionNext_2_0 = null;

        EObject lv_where_6_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:419:2: ( ( ( (lv_variablePrescription_0_0= ruleVariablePrescription ) ) (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )* otherlv_3= 'From' otherlv_4= 'Prescription' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )? otherlv_7= ';' ) )
            // InternalQueryDsl.g:420:2: ( ( (lv_variablePrescription_0_0= ruleVariablePrescription ) ) (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )* otherlv_3= 'From' otherlv_4= 'Prescription' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )? otherlv_7= ';' )
            {
            // InternalQueryDsl.g:420:2: ( ( (lv_variablePrescription_0_0= ruleVariablePrescription ) ) (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )* otherlv_3= 'From' otherlv_4= 'Prescription' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )? otherlv_7= ';' )
            // InternalQueryDsl.g:421:3: ( (lv_variablePrescription_0_0= ruleVariablePrescription ) ) (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )* otherlv_3= 'From' otherlv_4= 'Prescription' (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )? otherlv_7= ';'
            {
            // InternalQueryDsl.g:421:3: ( (lv_variablePrescription_0_0= ruleVariablePrescription ) )
            // InternalQueryDsl.g:422:4: (lv_variablePrescription_0_0= ruleVariablePrescription )
            {
            // InternalQueryDsl.g:422:4: (lv_variablePrescription_0_0= ruleVariablePrescription )
            // InternalQueryDsl.g:423:5: lv_variablePrescription_0_0= ruleVariablePrescription
            {

            					newCompositeNode(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionVariablePrescriptionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_variablePrescription_0_0=ruleVariablePrescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSelectPrescriptionRule());
            					}
            					set(
            						current,
            						"variablePrescription",
            						lv_variablePrescription_0_0,
            						"ase.QueryDsl.VariablePrescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:440:3: (otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQueryDsl.g:441:4: otherlv_1= ',' ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) )
            	    {
            	    otherlv_1=(Token)match(input,18,FOLLOW_4); 

            	    				newLeafNode(otherlv_1, grammarAccess.getSelectPrescriptionAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalQueryDsl.g:445:4: ( (lv_variablePrescriptionNext_2_0= ruleVariablePrescription ) )
            	    // InternalQueryDsl.g:446:5: (lv_variablePrescriptionNext_2_0= ruleVariablePrescription )
            	    {
            	    // InternalQueryDsl.g:446:5: (lv_variablePrescriptionNext_2_0= ruleVariablePrescription )
            	    // InternalQueryDsl.g:447:6: lv_variablePrescriptionNext_2_0= ruleVariablePrescription
            	    {

            	    						newCompositeNode(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionNextVariablePrescriptionEnumRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_variablePrescriptionNext_2_0=ruleVariablePrescription();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSelectPrescriptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"variablePrescriptionNext",
            	    							lv_variablePrescriptionNext_2_0,
            	    							"ase.QueryDsl.VariablePrescription");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getSelectPrescriptionAccess().getFromKeyword_2());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getSelectPrescriptionAccess().getPrescriptionKeyword_3());
            		
            // InternalQueryDsl.g:473:3: (otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+ )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalQueryDsl.g:474:4: otherlv_5= 'WHERE' ( (lv_where_6_0= ruleWherePrescription ) )+
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getSelectPrescriptionAccess().getWHEREKeyword_4_0());
                    			
                    // InternalQueryDsl.g:478:4: ( (lv_where_6_0= ruleWherePrescription ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==34||LA11_0==40||(LA11_0>=47 && LA11_0<=51)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalQueryDsl.g:479:5: (lv_where_6_0= ruleWherePrescription )
                    	    {
                    	    // InternalQueryDsl.g:479:5: (lv_where_6_0= ruleWherePrescription )
                    	    // InternalQueryDsl.g:480:6: lv_where_6_0= ruleWherePrescription
                    	    {

                    	    						newCompositeNode(grammarAccess.getSelectPrescriptionAccess().getWhereWherePrescriptionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_where_6_0=ruleWherePrescription();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSelectPrescriptionRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"where",
                    	    							lv_where_6_0,
                    	    							"ase.QueryDsl.WherePrescription");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSelectPrescriptionAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleSelectPrescription"


    // $ANTLR start "entryRuleInsert"
    // InternalQueryDsl.g:506:1: entryRuleInsert returns [EObject current=null] : iv_ruleInsert= ruleInsert EOF ;
    public final EObject entryRuleInsert() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsert = null;


        try {
            // InternalQueryDsl.g:506:47: (iv_ruleInsert= ruleInsert EOF )
            // InternalQueryDsl.g:507:2: iv_ruleInsert= ruleInsert EOF
            {
             newCompositeNode(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsert=ruleInsert();

            state._fsp--;

             current =iv_ruleInsert; 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalQueryDsl.g:513:1: ruleInsert returns [EObject current=null] : (otherlv_0= 'INSERT' otherlv_1= 'INTO' (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription ) ) ;
    public final EObject ruleInsert() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_InsertMedicalRecord_2 = null;

        EObject this_InsertPatientMonitoring_3 = null;

        EObject this_InsertPrescription_4 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:519:2: ( (otherlv_0= 'INSERT' otherlv_1= 'INTO' (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription ) ) )
            // InternalQueryDsl.g:520:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription ) )
            {
            // InternalQueryDsl.g:520:2: (otherlv_0= 'INSERT' otherlv_1= 'INTO' (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription ) )
            // InternalQueryDsl.g:521:3: otherlv_0= 'INSERT' otherlv_1= 'INTO' (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertAccess().getINSERTKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertAccess().getINTOKeyword_1());
            		
            // InternalQueryDsl.g:529:3: (this_InsertMedicalRecord_2= ruleInsertMedicalRecord | this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring | this_InsertPrescription_4= ruleInsertPrescription )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 23:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQueryDsl.g:530:4: this_InsertMedicalRecord_2= ruleInsertMedicalRecord
                    {

                    				newCompositeNode(grammarAccess.getInsertAccess().getInsertMedicalRecordParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_InsertMedicalRecord_2=ruleInsertMedicalRecord();

                    state._fsp--;


                    				current = this_InsertMedicalRecord_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:539:4: this_InsertPatientMonitoring_3= ruleInsertPatientMonitoring
                    {

                    				newCompositeNode(grammarAccess.getInsertAccess().getInsertPatientMonitoringParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_InsertPatientMonitoring_3=ruleInsertPatientMonitoring();

                    state._fsp--;


                    				current = this_InsertPatientMonitoring_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:548:4: this_InsertPrescription_4= ruleInsertPrescription
                    {

                    				newCompositeNode(grammarAccess.getInsertAccess().getInsertPrescriptionParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_InsertPrescription_4=ruleInsertPrescription();

                    state._fsp--;


                    				current = this_InsertPrescription_4;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleInsertMedicalRecord"
    // InternalQueryDsl.g:561:1: entryRuleInsertMedicalRecord returns [EObject current=null] : iv_ruleInsertMedicalRecord= ruleInsertMedicalRecord EOF ;
    public final EObject entryRuleInsertMedicalRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertMedicalRecord = null;


        try {
            // InternalQueryDsl.g:561:60: (iv_ruleInsertMedicalRecord= ruleInsertMedicalRecord EOF )
            // InternalQueryDsl.g:562:2: iv_ruleInsertMedicalRecord= ruleInsertMedicalRecord EOF
            {
             newCompositeNode(grammarAccess.getInsertMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertMedicalRecord=ruleInsertMedicalRecord();

            state._fsp--;

             current =iv_ruleInsertMedicalRecord; 
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
    // $ANTLR end "entryRuleInsertMedicalRecord"


    // $ANTLR start "ruleInsertMedicalRecord"
    // InternalQueryDsl.g:568:1: ruleInsertMedicalRecord returns [EObject current=null] : (otherlv_0= 'MedicalRecord' otherlv_1= 'Values(' ( (lv_recordId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_doctorId_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_medicalCondition_8_0= ruleMedicalCondition ) ) otherlv_9= ',' ( (lv_date_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_price_12_0= RULE_DOUBLE ) ) otherlv_13= ',' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ';' ) ;
    public final EObject ruleInsertMedicalRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_recordId_2_0=null;
        Token otherlv_3=null;
        Token lv_patientId_4_0=null;
        Token otherlv_5=null;
        Token lv_doctorId_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_date_10_0=null;
        Token otherlv_11=null;
        Token lv_price_12_0=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_medicalCondition_8_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:574:2: ( (otherlv_0= 'MedicalRecord' otherlv_1= 'Values(' ( (lv_recordId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_doctorId_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_medicalCondition_8_0= ruleMedicalCondition ) ) otherlv_9= ',' ( (lv_date_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_price_12_0= RULE_DOUBLE ) ) otherlv_13= ',' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ';' ) )
            // InternalQueryDsl.g:575:2: (otherlv_0= 'MedicalRecord' otherlv_1= 'Values(' ( (lv_recordId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_doctorId_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_medicalCondition_8_0= ruleMedicalCondition ) ) otherlv_9= ',' ( (lv_date_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_price_12_0= RULE_DOUBLE ) ) otherlv_13= ',' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ';' )
            {
            // InternalQueryDsl.g:575:2: (otherlv_0= 'MedicalRecord' otherlv_1= 'Values(' ( (lv_recordId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_doctorId_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_medicalCondition_8_0= ruleMedicalCondition ) ) otherlv_9= ',' ( (lv_date_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_price_12_0= RULE_DOUBLE ) ) otherlv_13= ',' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ';' )
            // InternalQueryDsl.g:576:3: otherlv_0= 'MedicalRecord' otherlv_1= 'Values(' ( (lv_recordId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_doctorId_6_0= RULE_INT ) ) otherlv_7= ',' ( (lv_medicalCondition_8_0= ruleMedicalCondition ) ) otherlv_9= ',' ( (lv_date_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_price_12_0= RULE_DOUBLE ) ) otherlv_13= ',' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ')' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertMedicalRecordAccess().getMedicalRecordKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertMedicalRecordAccess().getValuesKeyword_1());
            		
            // InternalQueryDsl.g:584:3: ( (lv_recordId_2_0= RULE_INT ) )
            // InternalQueryDsl.g:585:4: (lv_recordId_2_0= RULE_INT )
            {
            // InternalQueryDsl.g:585:4: (lv_recordId_2_0= RULE_INT )
            // InternalQueryDsl.g:586:5: lv_recordId_2_0= RULE_INT
            {
            lv_recordId_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_recordId_2_0, grammarAccess.getInsertMedicalRecordAccess().getRecordIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"recordId",
            						lv_recordId_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_3());
            		
            // InternalQueryDsl.g:606:3: ( (lv_patientId_4_0= RULE_INT ) )
            // InternalQueryDsl.g:607:4: (lv_patientId_4_0= RULE_INT )
            {
            // InternalQueryDsl.g:607:4: (lv_patientId_4_0= RULE_INT )
            // InternalQueryDsl.g:608:5: lv_patientId_4_0= RULE_INT
            {
            lv_patientId_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_patientId_4_0, grammarAccess.getInsertMedicalRecordAccess().getPatientIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"patientId",
            						lv_patientId_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_5());
            		
            // InternalQueryDsl.g:628:3: ( (lv_doctorId_6_0= RULE_INT ) )
            // InternalQueryDsl.g:629:4: (lv_doctorId_6_0= RULE_INT )
            {
            // InternalQueryDsl.g:629:4: (lv_doctorId_6_0= RULE_INT )
            // InternalQueryDsl.g:630:5: lv_doctorId_6_0= RULE_INT
            {
            lv_doctorId_6_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_doctorId_6_0, grammarAccess.getInsertMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"doctorId",
            						lv_doctorId_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_7, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_7());
            		
            // InternalQueryDsl.g:650:3: ( (lv_medicalCondition_8_0= ruleMedicalCondition ) )
            // InternalQueryDsl.g:651:4: (lv_medicalCondition_8_0= ruleMedicalCondition )
            {
            // InternalQueryDsl.g:651:4: (lv_medicalCondition_8_0= ruleMedicalCondition )
            // InternalQueryDsl.g:652:5: lv_medicalCondition_8_0= ruleMedicalCondition
            {

            					newCompositeNode(grammarAccess.getInsertMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_20);
            lv_medicalCondition_8_0=ruleMedicalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertMedicalRecordRule());
            					}
            					set(
            						current,
            						"medicalCondition",
            						lv_medicalCondition_8_0,
            						"ase.QueryDsl.MedicalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_9());
            		
            // InternalQueryDsl.g:673:3: ( (lv_date_10_0= RULE_DATE ) )
            // InternalQueryDsl.g:674:4: (lv_date_10_0= RULE_DATE )
            {
            // InternalQueryDsl.g:674:4: (lv_date_10_0= RULE_DATE )
            // InternalQueryDsl.g:675:5: lv_date_10_0= RULE_DATE
            {
            lv_date_10_0=(Token)match(input,RULE_DATE,FOLLOW_20); 

            					newLeafNode(lv_date_10_0, grammarAccess.getInsertMedicalRecordAccess().getDateDATETerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_10_0,
            						"ase.QueryDsl.DATE");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_11());
            		
            // InternalQueryDsl.g:695:3: ( (lv_price_12_0= RULE_DOUBLE ) )
            // InternalQueryDsl.g:696:4: (lv_price_12_0= RULE_DOUBLE )
            {
            // InternalQueryDsl.g:696:4: (lv_price_12_0= RULE_DOUBLE )
            // InternalQueryDsl.g:697:5: lv_price_12_0= RULE_DOUBLE
            {
            lv_price_12_0=(Token)match(input,RULE_DOUBLE,FOLLOW_20); 

            					newLeafNode(lv_price_12_0, grammarAccess.getInsertMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_12_0,
            						"ase.QueryDsl.DOUBLE");
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_13, grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_13());
            		
            // InternalQueryDsl.g:717:3: ( (lv_description_14_0= RULE_STRING ) )
            // InternalQueryDsl.g:718:4: (lv_description_14_0= RULE_STRING )
            {
            // InternalQueryDsl.g:718:4: (lv_description_14_0= RULE_STRING )
            // InternalQueryDsl.g:719:5: lv_description_14_0= RULE_STRING
            {
            lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_description_14_0, grammarAccess.getInsertMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertMedicalRecordRule());
            					}
            					setWithLastConsumed(
            						current,
            						"description",
            						lv_description_14_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_15=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_15, grammarAccess.getInsertMedicalRecordAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInsertMedicalRecordAccess().getSemicolonKeyword_16());
            		

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
    // $ANTLR end "ruleInsertMedicalRecord"


    // $ANTLR start "entryRuleInsertPatientMonitoring"
    // InternalQueryDsl.g:747:1: entryRuleInsertPatientMonitoring returns [EObject current=null] : iv_ruleInsertPatientMonitoring= ruleInsertPatientMonitoring EOF ;
    public final EObject entryRuleInsertPatientMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertPatientMonitoring = null;


        try {
            // InternalQueryDsl.g:747:64: (iv_ruleInsertPatientMonitoring= ruleInsertPatientMonitoring EOF )
            // InternalQueryDsl.g:748:2: iv_ruleInsertPatientMonitoring= ruleInsertPatientMonitoring EOF
            {
             newCompositeNode(grammarAccess.getInsertPatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertPatientMonitoring=ruleInsertPatientMonitoring();

            state._fsp--;

             current =iv_ruleInsertPatientMonitoring; 
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
    // $ANTLR end "entryRuleInsertPatientMonitoring"


    // $ANTLR start "ruleInsertPatientMonitoring"
    // InternalQueryDsl.g:754:1: ruleInsertPatientMonitoring returns [EObject current=null] : (otherlv_0= 'PatientMonitoring' otherlv_1= 'Values(' ( (lv_monitoringId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_category_6_0= ruleMedicalCondition ) ) otherlv_7= ',' ( (lv_date_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_riskPerception_10_0= ruleRiskPerception ) ) otherlv_11= ',' ( (lv_treadted_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_deviceId_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= ';' ) ;
    public final EObject ruleInsertPatientMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_monitoringId_2_0=null;
        Token otherlv_3=null;
        Token lv_patientId_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_date_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_treadted_12_0=null;
        Token otherlv_13=null;
        Token lv_deviceId_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_category_6_0 = null;

        Enumerator lv_riskPerception_10_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:760:2: ( (otherlv_0= 'PatientMonitoring' otherlv_1= 'Values(' ( (lv_monitoringId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_category_6_0= ruleMedicalCondition ) ) otherlv_7= ',' ( (lv_date_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_riskPerception_10_0= ruleRiskPerception ) ) otherlv_11= ',' ( (lv_treadted_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_deviceId_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= ';' ) )
            // InternalQueryDsl.g:761:2: (otherlv_0= 'PatientMonitoring' otherlv_1= 'Values(' ( (lv_monitoringId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_category_6_0= ruleMedicalCondition ) ) otherlv_7= ',' ( (lv_date_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_riskPerception_10_0= ruleRiskPerception ) ) otherlv_11= ',' ( (lv_treadted_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_deviceId_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= ';' )
            {
            // InternalQueryDsl.g:761:2: (otherlv_0= 'PatientMonitoring' otherlv_1= 'Values(' ( (lv_monitoringId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_category_6_0= ruleMedicalCondition ) ) otherlv_7= ',' ( (lv_date_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_riskPerception_10_0= ruleRiskPerception ) ) otherlv_11= ',' ( (lv_treadted_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_deviceId_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= ';' )
            // InternalQueryDsl.g:762:3: otherlv_0= 'PatientMonitoring' otherlv_1= 'Values(' ( (lv_monitoringId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_patientId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_category_6_0= ruleMedicalCondition ) ) otherlv_7= ',' ( (lv_date_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_riskPerception_10_0= ruleRiskPerception ) ) otherlv_11= ',' ( (lv_treadted_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_deviceId_14_0= RULE_INT ) ) otherlv_15= ')' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertPatientMonitoringAccess().getPatientMonitoringKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertPatientMonitoringAccess().getValuesKeyword_1());
            		
            // InternalQueryDsl.g:770:3: ( (lv_monitoringId_2_0= RULE_INT ) )
            // InternalQueryDsl.g:771:4: (lv_monitoringId_2_0= RULE_INT )
            {
            // InternalQueryDsl.g:771:4: (lv_monitoringId_2_0= RULE_INT )
            // InternalQueryDsl.g:772:5: lv_monitoringId_2_0= RULE_INT
            {
            lv_monitoringId_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_monitoringId_2_0, grammarAccess.getInsertPatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"monitoringId",
            						lv_monitoringId_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_3());
            		
            // InternalQueryDsl.g:792:3: ( (lv_patientId_4_0= RULE_INT ) )
            // InternalQueryDsl.g:793:4: (lv_patientId_4_0= RULE_INT )
            {
            // InternalQueryDsl.g:793:4: (lv_patientId_4_0= RULE_INT )
            // InternalQueryDsl.g:794:5: lv_patientId_4_0= RULE_INT
            {
            lv_patientId_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_patientId_4_0, grammarAccess.getInsertPatientMonitoringAccess().getPatientIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"patientId",
            						lv_patientId_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_5());
            		
            // InternalQueryDsl.g:814:3: ( (lv_category_6_0= ruleMedicalCondition ) )
            // InternalQueryDsl.g:815:4: (lv_category_6_0= ruleMedicalCondition )
            {
            // InternalQueryDsl.g:815:4: (lv_category_6_0= ruleMedicalCondition )
            // InternalQueryDsl.g:816:5: lv_category_6_0= ruleMedicalCondition
            {

            					newCompositeNode(grammarAccess.getInsertPatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_20);
            lv_category_6_0=ruleMedicalCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					set(
            						current,
            						"category",
            						lv_category_6_0,
            						"ase.QueryDsl.MedicalCondition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_7());
            		
            // InternalQueryDsl.g:837:3: ( (lv_date_8_0= RULE_DATE ) )
            // InternalQueryDsl.g:838:4: (lv_date_8_0= RULE_DATE )
            {
            // InternalQueryDsl.g:838:4: (lv_date_8_0= RULE_DATE )
            // InternalQueryDsl.g:839:5: lv_date_8_0= RULE_DATE
            {
            lv_date_8_0=(Token)match(input,RULE_DATE,FOLLOW_20); 

            					newLeafNode(lv_date_8_0, grammarAccess.getInsertPatientMonitoringAccess().getDateDATETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"date",
            						lv_date_8_0,
            						"ase.QueryDsl.DATE");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_9());
            		
            // InternalQueryDsl.g:859:3: ( (lv_riskPerception_10_0= ruleRiskPerception ) )
            // InternalQueryDsl.g:860:4: (lv_riskPerception_10_0= ruleRiskPerception )
            {
            // InternalQueryDsl.g:860:4: (lv_riskPerception_10_0= ruleRiskPerception )
            // InternalQueryDsl.g:861:5: lv_riskPerception_10_0= ruleRiskPerception
            {

            					newCompositeNode(grammarAccess.getInsertPatientMonitoringAccess().getRiskPerceptionRiskPerceptionEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_20);
            lv_riskPerception_10_0=ruleRiskPerception();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					set(
            						current,
            						"riskPerception",
            						lv_riskPerception_10_0,
            						"ase.QueryDsl.RiskPerception");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_11());
            		
            // InternalQueryDsl.g:882:3: ( (lv_treadted_12_0= RULE_BOOLEAN ) )
            // InternalQueryDsl.g:883:4: (lv_treadted_12_0= RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:883:4: (lv_treadted_12_0= RULE_BOOLEAN )
            // InternalQueryDsl.g:884:5: lv_treadted_12_0= RULE_BOOLEAN
            {
            lv_treadted_12_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_20); 

            					newLeafNode(lv_treadted_12_0, grammarAccess.getInsertPatientMonitoringAccess().getTreadtedBOOLEANTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"treadted",
            						lv_treadted_12_0,
            						"ase.QueryDsl.BOOLEAN");
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_13());
            		
            // InternalQueryDsl.g:904:3: ( (lv_deviceId_14_0= RULE_INT ) )
            // InternalQueryDsl.g:905:4: (lv_deviceId_14_0= RULE_INT )
            {
            // InternalQueryDsl.g:905:4: (lv_deviceId_14_0= RULE_INT )
            // InternalQueryDsl.g:906:5: lv_deviceId_14_0= RULE_INT
            {
            lv_deviceId_14_0=(Token)match(input,RULE_INT,FOLLOW_25); 

            					newLeafNode(lv_deviceId_14_0, grammarAccess.getInsertPatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPatientMonitoringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"deviceId",
            						lv_deviceId_14_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_15=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_15, grammarAccess.getInsertPatientMonitoringAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInsertPatientMonitoringAccess().getSemicolonKeyword_16());
            		

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
    // $ANTLR end "ruleInsertPatientMonitoring"


    // $ANTLR start "entryRuleInsertPrescription"
    // InternalQueryDsl.g:934:1: entryRuleInsertPrescription returns [EObject current=null] : iv_ruleInsertPrescription= ruleInsertPrescription EOF ;
    public final EObject entryRuleInsertPrescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertPrescription = null;


        try {
            // InternalQueryDsl.g:934:59: (iv_ruleInsertPrescription= ruleInsertPrescription EOF )
            // InternalQueryDsl.g:935:2: iv_ruleInsertPrescription= ruleInsertPrescription EOF
            {
             newCompositeNode(grammarAccess.getInsertPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInsertPrescription=ruleInsertPrescription();

            state._fsp--;

             current =iv_ruleInsertPrescription; 
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
    // $ANTLR end "entryRuleInsertPrescription"


    // $ANTLR start "ruleInsertPrescription"
    // InternalQueryDsl.g:941:1: ruleInsertPrescription returns [EObject current=null] : (otherlv_0= 'Prescription' otherlv_1= 'Values(' ( (lv_prescriptionId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_recordId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_medicationName_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_start_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_ordered_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_price_14_0= RULE_DOUBLE ) ) otherlv_15= ')' otherlv_16= ';' ) ;
    public final EObject ruleInsertPrescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_prescriptionId_2_0=null;
        Token otherlv_3=null;
        Token lv_recordId_4_0=null;
        Token otherlv_5=null;
        Token lv_medicationName_6_0=null;
        Token otherlv_7=null;
        Token lv_start_8_0=null;
        Token otherlv_9=null;
        Token lv_end_10_0=null;
        Token otherlv_11=null;
        Token lv_ordered_12_0=null;
        Token otherlv_13=null;
        Token lv_price_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:947:2: ( (otherlv_0= 'Prescription' otherlv_1= 'Values(' ( (lv_prescriptionId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_recordId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_medicationName_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_start_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_ordered_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_price_14_0= RULE_DOUBLE ) ) otherlv_15= ')' otherlv_16= ';' ) )
            // InternalQueryDsl.g:948:2: (otherlv_0= 'Prescription' otherlv_1= 'Values(' ( (lv_prescriptionId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_recordId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_medicationName_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_start_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_ordered_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_price_14_0= RULE_DOUBLE ) ) otherlv_15= ')' otherlv_16= ';' )
            {
            // InternalQueryDsl.g:948:2: (otherlv_0= 'Prescription' otherlv_1= 'Values(' ( (lv_prescriptionId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_recordId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_medicationName_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_start_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_ordered_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_price_14_0= RULE_DOUBLE ) ) otherlv_15= ')' otherlv_16= ';' )
            // InternalQueryDsl.g:949:3: otherlv_0= 'Prescription' otherlv_1= 'Values(' ( (lv_prescriptionId_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_recordId_4_0= RULE_INT ) ) otherlv_5= ',' ( (lv_medicationName_6_0= RULE_STRING ) ) otherlv_7= ',' ( (lv_start_8_0= RULE_DATE ) ) otherlv_9= ',' ( (lv_end_10_0= RULE_DATE ) ) otherlv_11= ',' ( (lv_ordered_12_0= RULE_BOOLEAN ) ) otherlv_13= ',' ( (lv_price_14_0= RULE_DOUBLE ) ) otherlv_15= ')' otherlv_16= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getInsertPrescriptionAccess().getPrescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInsertPrescriptionAccess().getValuesKeyword_1());
            		
            // InternalQueryDsl.g:957:3: ( (lv_prescriptionId_2_0= RULE_INT ) )
            // InternalQueryDsl.g:958:4: (lv_prescriptionId_2_0= RULE_INT )
            {
            // InternalQueryDsl.g:958:4: (lv_prescriptionId_2_0= RULE_INT )
            // InternalQueryDsl.g:959:5: lv_prescriptionId_2_0= RULE_INT
            {
            lv_prescriptionId_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_prescriptionId_2_0, grammarAccess.getInsertPrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prescriptionId",
            						lv_prescriptionId_2_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_3());
            		
            // InternalQueryDsl.g:979:3: ( (lv_recordId_4_0= RULE_INT ) )
            // InternalQueryDsl.g:980:4: (lv_recordId_4_0= RULE_INT )
            {
            // InternalQueryDsl.g:980:4: (lv_recordId_4_0= RULE_INT )
            // InternalQueryDsl.g:981:5: lv_recordId_4_0= RULE_INT
            {
            lv_recordId_4_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_recordId_4_0, grammarAccess.getInsertPrescriptionAccess().getRecordIdINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"recordId",
            						lv_recordId_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_5());
            		
            // InternalQueryDsl.g:1001:3: ( (lv_medicationName_6_0= RULE_STRING ) )
            // InternalQueryDsl.g:1002:4: (lv_medicationName_6_0= RULE_STRING )
            {
            // InternalQueryDsl.g:1002:4: (lv_medicationName_6_0= RULE_STRING )
            // InternalQueryDsl.g:1003:5: lv_medicationName_6_0= RULE_STRING
            {
            lv_medicationName_6_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            					newLeafNode(lv_medicationName_6_0, grammarAccess.getInsertPrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"medicationName",
            						lv_medicationName_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_7());
            		
            // InternalQueryDsl.g:1023:3: ( (lv_start_8_0= RULE_DATE ) )
            // InternalQueryDsl.g:1024:4: (lv_start_8_0= RULE_DATE )
            {
            // InternalQueryDsl.g:1024:4: (lv_start_8_0= RULE_DATE )
            // InternalQueryDsl.g:1025:5: lv_start_8_0= RULE_DATE
            {
            lv_start_8_0=(Token)match(input,RULE_DATE,FOLLOW_20); 

            					newLeafNode(lv_start_8_0, grammarAccess.getInsertPrescriptionAccess().getStartDATETerminalRuleCall_8_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_8_0,
            						"ase.QueryDsl.DATE");
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_9());
            		
            // InternalQueryDsl.g:1045:3: ( (lv_end_10_0= RULE_DATE ) )
            // InternalQueryDsl.g:1046:4: (lv_end_10_0= RULE_DATE )
            {
            // InternalQueryDsl.g:1046:4: (lv_end_10_0= RULE_DATE )
            // InternalQueryDsl.g:1047:5: lv_end_10_0= RULE_DATE
            {
            lv_end_10_0=(Token)match(input,RULE_DATE,FOLLOW_20); 

            					newLeafNode(lv_end_10_0, grammarAccess.getInsertPrescriptionAccess().getEndDATETerminalRuleCall_10_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_10_0,
            						"ase.QueryDsl.DATE");
            				

            }


            }

            otherlv_11=(Token)match(input,18,FOLLOW_28); 

            			newLeafNode(otherlv_11, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_11());
            		
            // InternalQueryDsl.g:1067:3: ( (lv_ordered_12_0= RULE_BOOLEAN ) )
            // InternalQueryDsl.g:1068:4: (lv_ordered_12_0= RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:1068:4: (lv_ordered_12_0= RULE_BOOLEAN )
            // InternalQueryDsl.g:1069:5: lv_ordered_12_0= RULE_BOOLEAN
            {
            lv_ordered_12_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_20); 

            					newLeafNode(lv_ordered_12_0, grammarAccess.getInsertPrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ordered",
            						lv_ordered_12_0,
            						"ase.QueryDsl.BOOLEAN");
            				

            }


            }

            otherlv_13=(Token)match(input,18,FOLLOW_23); 

            			newLeafNode(otherlv_13, grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_13());
            		
            // InternalQueryDsl.g:1089:3: ( (lv_price_14_0= RULE_DOUBLE ) )
            // InternalQueryDsl.g:1090:4: (lv_price_14_0= RULE_DOUBLE )
            {
            // InternalQueryDsl.g:1090:4: (lv_price_14_0= RULE_DOUBLE )
            // InternalQueryDsl.g:1091:5: lv_price_14_0= RULE_DOUBLE
            {
            lv_price_14_0=(Token)match(input,RULE_DOUBLE,FOLLOW_25); 

            					newLeafNode(lv_price_14_0, grammarAccess.getInsertPrescriptionAccess().getPriceDOUBLETerminalRuleCall_14_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInsertPrescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"price",
            						lv_price_14_0,
            						"ase.QueryDsl.DOUBLE");
            				

            }


            }

            otherlv_15=(Token)match(input,28,FOLLOW_26); 

            			newLeafNode(otherlv_15, grammarAccess.getInsertPrescriptionAccess().getRightParenthesisKeyword_15());
            		
            otherlv_16=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getInsertPrescriptionAccess().getSemicolonKeyword_16());
            		

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
    // $ANTLR end "ruleInsertPrescription"


    // $ANTLR start "entryRuleDrop"
    // InternalQueryDsl.g:1119:1: entryRuleDrop returns [EObject current=null] : iv_ruleDrop= ruleDrop EOF ;
    public final EObject entryRuleDrop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDrop = null;


        try {
            // InternalQueryDsl.g:1119:45: (iv_ruleDrop= ruleDrop EOF )
            // InternalQueryDsl.g:1120:2: iv_ruleDrop= ruleDrop EOF
            {
             newCompositeNode(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDrop=ruleDrop();

            state._fsp--;

             current =iv_ruleDrop; 
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
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalQueryDsl.g:1126:1: ruleDrop returns [EObject current=null] : (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_table_name_2_0= ruleTableName ) ) otherlv_3= ';' ) ;
    public final EObject ruleDrop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_table_name_2_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1132:2: ( (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_table_name_2_0= ruleTableName ) ) otherlv_3= ';' ) )
            // InternalQueryDsl.g:1133:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_table_name_2_0= ruleTableName ) ) otherlv_3= ';' )
            {
            // InternalQueryDsl.g:1133:2: (otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_table_name_2_0= ruleTableName ) ) otherlv_3= ';' )
            // InternalQueryDsl.g:1134:3: otherlv_0= 'DROP' otherlv_1= 'TABLE' ( (lv_table_name_2_0= ruleTableName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getDropAccess().getDROPKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDropAccess().getTABLEKeyword_1());
            		
            // InternalQueryDsl.g:1142:3: ( (lv_table_name_2_0= ruleTableName ) )
            // InternalQueryDsl.g:1143:4: (lv_table_name_2_0= ruleTableName )
            {
            // InternalQueryDsl.g:1143:4: (lv_table_name_2_0= ruleTableName )
            // InternalQueryDsl.g:1144:5: lv_table_name_2_0= ruleTableName
            {

            					newCompositeNode(grammarAccess.getDropAccess().getTable_nameTableNameEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_table_name_2_0=ruleTableName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDropRule());
            					}
            					add(
            						current,
            						"table_name",
            						lv_table_name_2_0,
            						"ase.QueryDsl.TableName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getDropAccess().getSemicolonKeyword_3());
            		

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
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleDelete"
    // InternalQueryDsl.g:1169:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalQueryDsl.g:1169:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalQueryDsl.g:1170:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalQueryDsl.g:1176:1: ruleDelete returns [EObject current=null] : (otherlv_0= 'DELETE' otherlv_1= 'FROM' (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription ) ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject this_DeleteMedicalRecord_2 = null;

        EObject this_DeletePatientMonitoring_3 = null;

        EObject this_DeletePrescription_4 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1182:2: ( (otherlv_0= 'DELETE' otherlv_1= 'FROM' (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription ) ) )
            // InternalQueryDsl.g:1183:2: (otherlv_0= 'DELETE' otherlv_1= 'FROM' (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription ) )
            {
            // InternalQueryDsl.g:1183:2: (otherlv_0= 'DELETE' otherlv_1= 'FROM' (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription ) )
            // InternalQueryDsl.g:1184:3: otherlv_0= 'DELETE' otherlv_1= 'FROM' (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteAccess().getDELETEKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getFROMKeyword_1());
            		
            // InternalQueryDsl.g:1192:3: (this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord | this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring | this_DeletePrescription_4= ruleDeletePrescription )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt14=1;
                }
                break;
            case 23:
                {
                alt14=2;
                }
                break;
            case 24:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalQueryDsl.g:1193:4: this_DeleteMedicalRecord_2= ruleDeleteMedicalRecord
                    {

                    				newCompositeNode(grammarAccess.getDeleteAccess().getDeleteMedicalRecordParserRuleCall_2_0());
                    			
                    pushFollow(FOLLOW_2);
                    this_DeleteMedicalRecord_2=ruleDeleteMedicalRecord();

                    state._fsp--;


                    				current = this_DeleteMedicalRecord_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1202:4: this_DeletePatientMonitoring_3= ruleDeletePatientMonitoring
                    {

                    				newCompositeNode(grammarAccess.getDeleteAccess().getDeletePatientMonitoringParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_DeletePatientMonitoring_3=ruleDeletePatientMonitoring();

                    state._fsp--;


                    				current = this_DeletePatientMonitoring_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1211:4: this_DeletePrescription_4= ruleDeletePrescription
                    {

                    				newCompositeNode(grammarAccess.getDeleteAccess().getDeletePrescriptionParserRuleCall_2_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_DeletePrescription_4=ruleDeletePrescription();

                    state._fsp--;


                    				current = this_DeletePrescription_4;
                    				afterParserOrEnumRuleCall();
                    			

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleDeleteMedicalRecord"
    // InternalQueryDsl.g:1224:1: entryRuleDeleteMedicalRecord returns [EObject current=null] : iv_ruleDeleteMedicalRecord= ruleDeleteMedicalRecord EOF ;
    public final EObject entryRuleDeleteMedicalRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeleteMedicalRecord = null;


        try {
            // InternalQueryDsl.g:1224:60: (iv_ruleDeleteMedicalRecord= ruleDeleteMedicalRecord EOF )
            // InternalQueryDsl.g:1225:2: iv_ruleDeleteMedicalRecord= ruleDeleteMedicalRecord EOF
            {
             newCompositeNode(grammarAccess.getDeleteMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeleteMedicalRecord=ruleDeleteMedicalRecord();

            state._fsp--;

             current =iv_ruleDeleteMedicalRecord; 
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
    // $ANTLR end "entryRuleDeleteMedicalRecord"


    // $ANTLR start "ruleDeleteMedicalRecord"
    // InternalQueryDsl.g:1231:1: ruleDeleteMedicalRecord returns [EObject current=null] : (otherlv_0= 'MedicalRecord' otherlv_1= 'WHERE' ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) ) (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDeleteMedicalRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whereMedicalRecord_2_0 = null;

        EObject lv_whereMedicalRecord_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1237:2: ( (otherlv_0= 'MedicalRecord' otherlv_1= 'WHERE' ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) ) (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )* otherlv_5= ';' ) )
            // InternalQueryDsl.g:1238:2: (otherlv_0= 'MedicalRecord' otherlv_1= 'WHERE' ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) ) (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )* otherlv_5= ';' )
            {
            // InternalQueryDsl.g:1238:2: (otherlv_0= 'MedicalRecord' otherlv_1= 'WHERE' ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) ) (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )* otherlv_5= ';' )
            // InternalQueryDsl.g:1239:3: otherlv_0= 'MedicalRecord' otherlv_1= 'WHERE' ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) ) (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDeleteMedicalRecordAccess().getMedicalRecordKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteMedicalRecordAccess().getWHEREKeyword_1());
            		
            // InternalQueryDsl.g:1247:3: ( (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord ) )
            // InternalQueryDsl.g:1248:4: (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord )
            {
            // InternalQueryDsl.g:1248:4: (lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord )
            // InternalQueryDsl.g:1249:5: lv_whereMedicalRecord_2_0= ruleWhereMedicalRecord
            {

            					newCompositeNode(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_whereMedicalRecord_2_0=ruleWhereMedicalRecord();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeleteMedicalRecordRule());
            					}
            					add(
            						current,
            						"whereMedicalRecord",
            						lv_whereMedicalRecord_2_0,
            						"ase.QueryDsl.WhereMedicalRecord");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1266:3: (otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQueryDsl.g:1267:4: otherlv_3= 'and' ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_6); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeleteMedicalRecordAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQueryDsl.g:1271:4: ( (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord ) )
            	    // InternalQueryDsl.g:1272:5: (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord )
            	    {
            	    // InternalQueryDsl.g:1272:5: (lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord )
            	    // InternalQueryDsl.g:1273:6: lv_whereMedicalRecord_4_0= ruleWhereMedicalRecord
            	    {

            	    						newCompositeNode(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_whereMedicalRecord_4_0=ruleWhereMedicalRecord();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeleteMedicalRecordRule());
            	    						}
            	    						add(
            	    							current,
            	    							"whereMedicalRecord",
            	    							lv_whereMedicalRecord_4_0,
            	    							"ase.QueryDsl.WhereMedicalRecord");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeleteMedicalRecordAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeleteMedicalRecord"


    // $ANTLR start "entryRuleDeletePatientMonitoring"
    // InternalQueryDsl.g:1299:1: entryRuleDeletePatientMonitoring returns [EObject current=null] : iv_ruleDeletePatientMonitoring= ruleDeletePatientMonitoring EOF ;
    public final EObject entryRuleDeletePatientMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePatientMonitoring = null;


        try {
            // InternalQueryDsl.g:1299:64: (iv_ruleDeletePatientMonitoring= ruleDeletePatientMonitoring EOF )
            // InternalQueryDsl.g:1300:2: iv_ruleDeletePatientMonitoring= ruleDeletePatientMonitoring EOF
            {
             newCompositeNode(grammarAccess.getDeletePatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletePatientMonitoring=ruleDeletePatientMonitoring();

            state._fsp--;

             current =iv_ruleDeletePatientMonitoring; 
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
    // $ANTLR end "entryRuleDeletePatientMonitoring"


    // $ANTLR start "ruleDeletePatientMonitoring"
    // InternalQueryDsl.g:1306:1: ruleDeletePatientMonitoring returns [EObject current=null] : (otherlv_0= 'PatientMonitoring' otherlv_1= 'WHERE' ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) ) (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDeletePatientMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_wherepatientMonitoring_2_0 = null;

        EObject lv_wherepatientMonitoring_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1312:2: ( (otherlv_0= 'PatientMonitoring' otherlv_1= 'WHERE' ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) ) (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )* otherlv_5= ';' ) )
            // InternalQueryDsl.g:1313:2: (otherlv_0= 'PatientMonitoring' otherlv_1= 'WHERE' ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) ) (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )* otherlv_5= ';' )
            {
            // InternalQueryDsl.g:1313:2: (otherlv_0= 'PatientMonitoring' otherlv_1= 'WHERE' ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) ) (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )* otherlv_5= ';' )
            // InternalQueryDsl.g:1314:3: otherlv_0= 'PatientMonitoring' otherlv_1= 'WHERE' ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) ) (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePatientMonitoringAccess().getPatientMonitoringKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getDeletePatientMonitoringAccess().getWHEREKeyword_1());
            		
            // InternalQueryDsl.g:1322:3: ( (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring ) )
            // InternalQueryDsl.g:1323:4: (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring )
            {
            // InternalQueryDsl.g:1323:4: (lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring )
            // InternalQueryDsl.g:1324:5: lv_wherepatientMonitoring_2_0= ruleWherePatientMonitoring
            {

            					newCompositeNode(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_wherepatientMonitoring_2_0=ruleWherePatientMonitoring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeletePatientMonitoringRule());
            					}
            					add(
            						current,
            						"wherepatientMonitoring",
            						lv_wherepatientMonitoring_2_0,
            						"ase.QueryDsl.WherePatientMonitoring");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1341:3: (otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==33) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalQueryDsl.g:1342:4: otherlv_3= 'and' ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_10); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeletePatientMonitoringAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQueryDsl.g:1346:4: ( (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring ) )
            	    // InternalQueryDsl.g:1347:5: (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring )
            	    {
            	    // InternalQueryDsl.g:1347:5: (lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring )
            	    // InternalQueryDsl.g:1348:6: lv_wherepatientMonitoring_4_0= ruleWherePatientMonitoring
            	    {

            	    						newCompositeNode(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_wherepatientMonitoring_4_0=ruleWherePatientMonitoring();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeletePatientMonitoringRule());
            	    						}
            	    						add(
            	    							current,
            	    							"wherepatientMonitoring",
            	    							lv_wherepatientMonitoring_4_0,
            	    							"ase.QueryDsl.WherePatientMonitoring");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeletePatientMonitoringAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeletePatientMonitoring"


    // $ANTLR start "entryRuleDeletePrescription"
    // InternalQueryDsl.g:1374:1: entryRuleDeletePrescription returns [EObject current=null] : iv_ruleDeletePrescription= ruleDeletePrescription EOF ;
    public final EObject entryRuleDeletePrescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePrescription = null;


        try {
            // InternalQueryDsl.g:1374:59: (iv_ruleDeletePrescription= ruleDeletePrescription EOF )
            // InternalQueryDsl.g:1375:2: iv_ruleDeletePrescription= ruleDeletePrescription EOF
            {
             newCompositeNode(grammarAccess.getDeletePrescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletePrescription=ruleDeletePrescription();

            state._fsp--;

             current =iv_ruleDeletePrescription; 
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
    // $ANTLR end "entryRuleDeletePrescription"


    // $ANTLR start "ruleDeletePrescription"
    // InternalQueryDsl.g:1381:1: ruleDeletePrescription returns [EObject current=null] : (otherlv_0= 'Prescription' otherlv_1= 'WHERE' ( (lv_whereprescription_2_0= ruleWherePrescription ) ) (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDeletePrescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_whereprescription_2_0 = null;

        EObject lv_whereprescription_4_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1387:2: ( (otherlv_0= 'Prescription' otherlv_1= 'WHERE' ( (lv_whereprescription_2_0= ruleWherePrescription ) ) (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )* otherlv_5= ';' ) )
            // InternalQueryDsl.g:1388:2: (otherlv_0= 'Prescription' otherlv_1= 'WHERE' ( (lv_whereprescription_2_0= ruleWherePrescription ) ) (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )* otherlv_5= ';' )
            {
            // InternalQueryDsl.g:1388:2: (otherlv_0= 'Prescription' otherlv_1= 'WHERE' ( (lv_whereprescription_2_0= ruleWherePrescription ) ) (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )* otherlv_5= ';' )
            // InternalQueryDsl.g:1389:3: otherlv_0= 'Prescription' otherlv_1= 'WHERE' ( (lv_whereprescription_2_0= ruleWherePrescription ) ) (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_31); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePrescriptionAccess().getPrescriptionKeyword_0());
            		
            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDeletePrescriptionAccess().getWHEREKeyword_1());
            		
            // InternalQueryDsl.g:1397:3: ( (lv_whereprescription_2_0= ruleWherePrescription ) )
            // InternalQueryDsl.g:1398:4: (lv_whereprescription_2_0= ruleWherePrescription )
            {
            // InternalQueryDsl.g:1398:4: (lv_whereprescription_2_0= ruleWherePrescription )
            // InternalQueryDsl.g:1399:5: lv_whereprescription_2_0= ruleWherePrescription
            {

            					newCompositeNode(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
            lv_whereprescription_2_0=ruleWherePrescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeletePrescriptionRule());
            					}
            					add(
            						current,
            						"whereprescription",
            						lv_whereprescription_2_0,
            						"ase.QueryDsl.WherePrescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalQueryDsl.g:1416:3: (otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==33) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQueryDsl.g:1417:4: otherlv_3= 'and' ( (lv_whereprescription_4_0= ruleWherePrescription ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getDeletePrescriptionAccess().getAndKeyword_3_0());
            	    			
            	    // InternalQueryDsl.g:1421:4: ( (lv_whereprescription_4_0= ruleWherePrescription ) )
            	    // InternalQueryDsl.g:1422:5: (lv_whereprescription_4_0= ruleWherePrescription )
            	    {
            	    // InternalQueryDsl.g:1422:5: (lv_whereprescription_4_0= ruleWherePrescription )
            	    // InternalQueryDsl.g:1423:6: lv_whereprescription_4_0= ruleWherePrescription
            	    {

            	    						newCompositeNode(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_32);
            	    lv_whereprescription_4_0=ruleWherePrescription();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDeletePrescriptionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"whereprescription",
            	    							lv_whereprescription_4_0,
            	    							"ase.QueryDsl.WherePrescription");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeletePrescriptionAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleDeletePrescription"


    // $ANTLR start "entryRuleWhereMedicalRecord"
    // InternalQueryDsl.g:1449:1: entryRuleWhereMedicalRecord returns [EObject current=null] : iv_ruleWhereMedicalRecord= ruleWhereMedicalRecord EOF ;
    public final EObject entryRuleWhereMedicalRecord() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereMedicalRecord = null;


        try {
            // InternalQueryDsl.g:1449:59: (iv_ruleWhereMedicalRecord= ruleWhereMedicalRecord EOF )
            // InternalQueryDsl.g:1450:2: iv_ruleWhereMedicalRecord= ruleWhereMedicalRecord EOF
            {
             newCompositeNode(grammarAccess.getWhereMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereMedicalRecord=ruleWhereMedicalRecord();

            state._fsp--;

             current =iv_ruleWhereMedicalRecord; 
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
    // $ANTLR end "entryRuleWhereMedicalRecord"


    // $ANTLR start "ruleWhereMedicalRecord"
    // InternalQueryDsl.g:1456:1: ruleWhereMedicalRecord returns [EObject current=null] : ( (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) ) | (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) ) | (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) ) | (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) ) | (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleWhereMedicalRecord() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_recordId_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_patientId_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_doctorId_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_date_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_price_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_description_20_0=null;
        Enumerator lv_medicalCondition_11_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1462:2: ( ( (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) ) | (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) ) | (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) ) | (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) ) | (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) ) ) )
            // InternalQueryDsl.g:1463:2: ( (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) ) | (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) ) | (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) ) | (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) ) | (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) ) )
            {
            // InternalQueryDsl.g:1463:2: ( (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) ) | (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) ) | (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) ) | (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) ) | (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 37:
                {
                alt18=3;
                }
                break;
            case 38:
                {
                alt18=4;
                }
                break;
            case 39:
                {
                alt18=5;
                }
                break;
            case 40:
                {
                alt18=6;
                }
                break;
            case 41:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalQueryDsl.g:1464:3: (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1464:3: (otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1465:4: otherlv_0= 'recordId' otherlv_1= '=' ( (lv_recordId_2_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getWhereMedicalRecordAccess().getRecordIdKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalQueryDsl.g:1473:4: ( (lv_recordId_2_0= RULE_INT ) )
                    // InternalQueryDsl.g:1474:5: (lv_recordId_2_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1474:5: (lv_recordId_2_0= RULE_INT )
                    // InternalQueryDsl.g:1475:6: lv_recordId_2_0= RULE_INT
                    {
                    lv_recordId_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_recordId_2_0, grammarAccess.getWhereMedicalRecordAccess().getRecordIdINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"recordId",
                    							lv_recordId_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1493:3: (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1493:3: (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1494:4: otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhereMedicalRecordAccess().getPatientIdKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalQueryDsl.g:1502:4: ( (lv_patientId_5_0= RULE_INT ) )
                    // InternalQueryDsl.g:1503:5: (lv_patientId_5_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1503:5: (lv_patientId_5_0= RULE_INT )
                    // InternalQueryDsl.g:1504:6: lv_patientId_5_0= RULE_INT
                    {
                    lv_patientId_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_patientId_5_0, grammarAccess.getWhereMedicalRecordAccess().getPatientIdINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"patientId",
                    							lv_patientId_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1522:3: (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1522:3: (otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1523:4: otherlv_6= 'doctorId' otherlv_7= '=' ( (lv_doctorId_8_0= RULE_INT ) )
                    {
                    otherlv_6=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getWhereMedicalRecordAccess().getDoctorIdKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_7, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalQueryDsl.g:1531:4: ( (lv_doctorId_8_0= RULE_INT ) )
                    // InternalQueryDsl.g:1532:5: (lv_doctorId_8_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1532:5: (lv_doctorId_8_0= RULE_INT )
                    // InternalQueryDsl.g:1533:6: lv_doctorId_8_0= RULE_INT
                    {
                    lv_doctorId_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_doctorId_8_0, grammarAccess.getWhereMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"doctorId",
                    							lv_doctorId_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1551:3: (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) )
                    {
                    // InternalQueryDsl.g:1551:3: (otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) ) )
                    // InternalQueryDsl.g:1552:4: otherlv_9= 'medicalCondition' otherlv_10= '=' ( (lv_medicalCondition_11_0= ruleMedicalCondition ) )
                    {
                    otherlv_9=(Token)match(input,38,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_10, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalQueryDsl.g:1560:4: ( (lv_medicalCondition_11_0= ruleMedicalCondition ) )
                    // InternalQueryDsl.g:1561:5: (lv_medicalCondition_11_0= ruleMedicalCondition )
                    {
                    // InternalQueryDsl.g:1561:5: (lv_medicalCondition_11_0= ruleMedicalCondition )
                    // InternalQueryDsl.g:1562:6: lv_medicalCondition_11_0= ruleMedicalCondition
                    {

                    						newCompositeNode(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_medicalCondition_11_0=ruleMedicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						add(
                    							current,
                    							"medicalCondition",
                    							lv_medicalCondition_11_0,
                    							"ase.QueryDsl.MedicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1581:3: (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) )
                    {
                    // InternalQueryDsl.g:1581:3: (otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) ) )
                    // InternalQueryDsl.g:1582:4: otherlv_12= 'date' otherlv_13= '=' ( (lv_date_14_0= RULE_DATE ) )
                    {
                    otherlv_12=(Token)match(input,39,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getWhereMedicalRecordAccess().getDateKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalQueryDsl.g:1590:4: ( (lv_date_14_0= RULE_DATE ) )
                    // InternalQueryDsl.g:1591:5: (lv_date_14_0= RULE_DATE )
                    {
                    // InternalQueryDsl.g:1591:5: (lv_date_14_0= RULE_DATE )
                    // InternalQueryDsl.g:1592:6: lv_date_14_0= RULE_DATE
                    {
                    lv_date_14_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    						newLeafNode(lv_date_14_0, grammarAccess.getWhereMedicalRecordAccess().getDateDATETerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"date",
                    							lv_date_14_0,
                    							"ase.QueryDsl.DATE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:1610:3: (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) )
                    {
                    // InternalQueryDsl.g:1610:3: (otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) ) )
                    // InternalQueryDsl.g:1611:4: otherlv_15= 'price' otherlv_16= '=' ( (lv_price_17_0= RULE_DOUBLE ) )
                    {
                    otherlv_15=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getWhereMedicalRecordAccess().getPriceKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_16, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalQueryDsl.g:1619:4: ( (lv_price_17_0= RULE_DOUBLE ) )
                    // InternalQueryDsl.g:1620:5: (lv_price_17_0= RULE_DOUBLE )
                    {
                    // InternalQueryDsl.g:1620:5: (lv_price_17_0= RULE_DOUBLE )
                    // InternalQueryDsl.g:1621:6: lv_price_17_0= RULE_DOUBLE
                    {
                    lv_price_17_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_price_17_0, grammarAccess.getWhereMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"price",
                    							lv_price_17_0,
                    							"ase.QueryDsl.DOUBLE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:1639:3: (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) )
                    {
                    // InternalQueryDsl.g:1639:3: (otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) ) )
                    // InternalQueryDsl.g:1640:4: otherlv_18= 'description' otherlv_19= '=' ( (lv_description_20_0= RULE_STRING ) )
                    {
                    otherlv_18=(Token)match(input,41,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getWhereMedicalRecordAccess().getDescriptionKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,35,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalQueryDsl.g:1648:4: ( (lv_description_20_0= RULE_STRING ) )
                    // InternalQueryDsl.g:1649:5: (lv_description_20_0= RULE_STRING )
                    {
                    // InternalQueryDsl.g:1649:5: (lv_description_20_0= RULE_STRING )
                    // InternalQueryDsl.g:1650:6: lv_description_20_0= RULE_STRING
                    {
                    lv_description_20_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_20_0, grammarAccess.getWhereMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereMedicalRecordRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleWhereMedicalRecord"


    // $ANTLR start "entryRuleWherePatientMonitoring"
    // InternalQueryDsl.g:1671:1: entryRuleWherePatientMonitoring returns [EObject current=null] : iv_ruleWherePatientMonitoring= ruleWherePatientMonitoring EOF ;
    public final EObject entryRuleWherePatientMonitoring() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWherePatientMonitoring = null;


        try {
            // InternalQueryDsl.g:1671:63: (iv_ruleWherePatientMonitoring= ruleWherePatientMonitoring EOF )
            // InternalQueryDsl.g:1672:2: iv_ruleWherePatientMonitoring= ruleWherePatientMonitoring EOF
            {
             newCompositeNode(grammarAccess.getWherePatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWherePatientMonitoring=ruleWherePatientMonitoring();

            state._fsp--;

             current =iv_ruleWherePatientMonitoring; 
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
    // $ANTLR end "entryRuleWherePatientMonitoring"


    // $ANTLR start "ruleWherePatientMonitoring"
    // InternalQueryDsl.g:1678:1: ruleWherePatientMonitoring returns [EObject current=null] : ( (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) ) | (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) ) | (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) ) | (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) ) ) ;
    public final EObject ruleWherePatientMonitoring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_monitoringId_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_patientId_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_date_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_treated_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_deviceId_20_0=null;
        Enumerator lv_category_8_0 = null;

        Enumerator lv_riskperception_14_0 = null;



        	enterRule();

        try {
            // InternalQueryDsl.g:1684:2: ( ( (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) ) | (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) ) | (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) ) | (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) ) ) )
            // InternalQueryDsl.g:1685:2: ( (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) ) | (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) ) | (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) ) | (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) ) )
            {
            // InternalQueryDsl.g:1685:2: ( (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) ) | (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) ) | (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) ) | (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) ) | (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) ) | (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) ) )
            int alt19=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 43:
                {
                alt19=3;
                }
                break;
            case 39:
                {
                alt19=4;
                }
                break;
            case 44:
                {
                alt19=5;
                }
                break;
            case 45:
                {
                alt19=6;
                }
                break;
            case 46:
                {
                alt19=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalQueryDsl.g:1686:3: (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1686:3: (otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1687:4: otherlv_0= 'monitoringId' otherlv_1= '=' ( (lv_monitoringId_2_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,42,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalQueryDsl.g:1695:4: ( (lv_monitoringId_2_0= RULE_INT ) )
                    // InternalQueryDsl.g:1696:5: (lv_monitoringId_2_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1696:5: (lv_monitoringId_2_0= RULE_INT )
                    // InternalQueryDsl.g:1697:6: lv_monitoringId_2_0= RULE_INT
                    {
                    lv_monitoringId_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_monitoringId_2_0, grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"monitoringId",
                    							lv_monitoringId_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1715:3: (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1715:3: (otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1716:4: otherlv_3= 'patientId' otherlv_4= '=' ( (lv_patientId_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getWherePatientMonitoringAccess().getPatientIdKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalQueryDsl.g:1724:4: ( (lv_patientId_5_0= RULE_INT ) )
                    // InternalQueryDsl.g:1725:5: (lv_patientId_5_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1725:5: (lv_patientId_5_0= RULE_INT )
                    // InternalQueryDsl.g:1726:6: lv_patientId_5_0= RULE_INT
                    {
                    lv_patientId_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_patientId_5_0, grammarAccess.getWherePatientMonitoringAccess().getPatientIdINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"patientId",
                    							lv_patientId_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1744:3: (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) )
                    {
                    // InternalQueryDsl.g:1744:3: (otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) ) )
                    // InternalQueryDsl.g:1745:4: otherlv_6= 'category' otherlv_7= '=' ( (lv_category_8_0= ruleMedicalCondition ) )
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getWherePatientMonitoringAccess().getCategoryKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalQueryDsl.g:1753:4: ( (lv_category_8_0= ruleMedicalCondition ) )
                    // InternalQueryDsl.g:1754:5: (lv_category_8_0= ruleMedicalCondition )
                    {
                    // InternalQueryDsl.g:1754:5: (lv_category_8_0= ruleMedicalCondition )
                    // InternalQueryDsl.g:1755:6: lv_category_8_0= ruleMedicalCondition
                    {

                    						newCompositeNode(grammarAccess.getWherePatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_category_8_0=ruleMedicalCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						add(
                    							current,
                    							"category",
                    							lv_category_8_0,
                    							"ase.QueryDsl.MedicalCondition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1774:3: (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) )
                    {
                    // InternalQueryDsl.g:1774:3: (otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) ) )
                    // InternalQueryDsl.g:1775:4: otherlv_9= 'date' otherlv_10= '=' ( (lv_date_11_0= RULE_DATE ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getWherePatientMonitoringAccess().getDateKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalQueryDsl.g:1783:4: ( (lv_date_11_0= RULE_DATE ) )
                    // InternalQueryDsl.g:1784:5: (lv_date_11_0= RULE_DATE )
                    {
                    // InternalQueryDsl.g:1784:5: (lv_date_11_0= RULE_DATE )
                    // InternalQueryDsl.g:1785:6: lv_date_11_0= RULE_DATE
                    {
                    lv_date_11_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    						newLeafNode(lv_date_11_0, grammarAccess.getWherePatientMonitoringAccess().getDateDATETerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"date",
                    							lv_date_11_0,
                    							"ase.QueryDsl.DATE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1803:3: (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) )
                    {
                    // InternalQueryDsl.g:1803:3: (otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) ) )
                    // InternalQueryDsl.g:1804:4: otherlv_12= 'riskPerception' otherlv_13= '=' ( (lv_riskperception_14_0= ruleRiskPerception ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getWherePatientMonitoringAccess().getRiskPerceptionKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,35,FOLLOW_27); 

                    				newLeafNode(otherlv_13, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalQueryDsl.g:1812:4: ( (lv_riskperception_14_0= ruleRiskPerception ) )
                    // InternalQueryDsl.g:1813:5: (lv_riskperception_14_0= ruleRiskPerception )
                    {
                    // InternalQueryDsl.g:1813:5: (lv_riskperception_14_0= ruleRiskPerception )
                    // InternalQueryDsl.g:1814:6: lv_riskperception_14_0= ruleRiskPerception
                    {

                    						newCompositeNode(grammarAccess.getWherePatientMonitoringAccess().getRiskperceptionRiskPerceptionEnumRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_riskperception_14_0=ruleRiskPerception();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						add(
                    							current,
                    							"riskperception",
                    							lv_riskperception_14_0,
                    							"ase.QueryDsl.RiskPerception");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:1833:3: (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalQueryDsl.g:1833:3: (otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) ) )
                    // InternalQueryDsl.g:1834:4: otherlv_15= 'treated' otherlv_16= '=' ( (lv_treated_17_0= RULE_BOOLEAN ) )
                    {
                    otherlv_15=(Token)match(input,45,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getWherePatientMonitoringAccess().getTreatedKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalQueryDsl.g:1842:4: ( (lv_treated_17_0= RULE_BOOLEAN ) )
                    // InternalQueryDsl.g:1843:5: (lv_treated_17_0= RULE_BOOLEAN )
                    {
                    // InternalQueryDsl.g:1843:5: (lv_treated_17_0= RULE_BOOLEAN )
                    // InternalQueryDsl.g:1844:6: lv_treated_17_0= RULE_BOOLEAN
                    {
                    lv_treated_17_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_treated_17_0, grammarAccess.getWherePatientMonitoringAccess().getTreatedBOOLEANTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"treated",
                    							lv_treated_17_0,
                    							"ase.QueryDsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:1862:3: (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1862:3: (otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1863:4: otherlv_18= 'deviceId' otherlv_19= '=' ( (lv_deviceId_20_0= RULE_INT ) )
                    {
                    otherlv_18=(Token)match(input,46,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getWherePatientMonitoringAccess().getDeviceIdKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_19, grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalQueryDsl.g:1871:4: ( (lv_deviceId_20_0= RULE_INT ) )
                    // InternalQueryDsl.g:1872:5: (lv_deviceId_20_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1872:5: (lv_deviceId_20_0= RULE_INT )
                    // InternalQueryDsl.g:1873:6: lv_deviceId_20_0= RULE_INT
                    {
                    lv_deviceId_20_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_deviceId_20_0, grammarAccess.getWherePatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePatientMonitoringRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"deviceId",
                    							lv_deviceId_20_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


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
    // $ANTLR end "ruleWherePatientMonitoring"


    // $ANTLR start "entryRuleWherePrescription"
    // InternalQueryDsl.g:1894:1: entryRuleWherePrescription returns [EObject current=null] : iv_ruleWherePrescription= ruleWherePrescription EOF ;
    public final EObject entryRuleWherePrescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWherePrescription = null;


        try {
            // InternalQueryDsl.g:1894:58: (iv_ruleWherePrescription= ruleWherePrescription EOF )
            // InternalQueryDsl.g:1895:2: iv_ruleWherePrescription= ruleWherePrescription EOF
            {
             newCompositeNode(grammarAccess.getWherePrescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWherePrescription=ruleWherePrescription();

            state._fsp--;

             current =iv_ruleWherePrescription; 
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
    // $ANTLR end "entryRuleWherePrescription"


    // $ANTLR start "ruleWherePrescription"
    // InternalQueryDsl.g:1901:1: ruleWherePrescription returns [EObject current=null] : ( (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) ) | (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) ) | (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) ) | (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) ) | (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) ) ) ;
    public final EObject ruleWherePrescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_prescriptionId_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_recordId_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_medicationName_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_start_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_end_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_ordered_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token lv_price_20_0=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:1907:2: ( ( (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) ) | (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) ) | (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) ) | (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) ) | (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) ) ) )
            // InternalQueryDsl.g:1908:2: ( (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) ) | (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) ) | (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) ) | (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) ) | (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) ) )
            {
            // InternalQueryDsl.g:1908:2: ( (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) ) | (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) ) | (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) ) | (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) ) | (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) ) | (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) ) | (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) ) )
            int alt20=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt20=1;
                }
                break;
            case 34:
                {
                alt20=2;
                }
                break;
            case 48:
                {
                alt20=3;
                }
                break;
            case 49:
                {
                alt20=4;
                }
                break;
            case 50:
                {
                alt20=5;
                }
                break;
            case 51:
                {
                alt20=6;
                }
                break;
            case 40:
                {
                alt20=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalQueryDsl.g:1909:3: (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1909:3: (otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1910:4: otherlv_0= 'prescriptionId' otherlv_1= '=' ( (lv_prescriptionId_2_0= RULE_INT ) )
                    {
                    otherlv_0=(Token)match(input,47,FOLLOW_33); 

                    				newLeafNode(otherlv_0, grammarAccess.getWherePrescriptionAccess().getPrescriptionIdKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_1, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalQueryDsl.g:1918:4: ( (lv_prescriptionId_2_0= RULE_INT ) )
                    // InternalQueryDsl.g:1919:5: (lv_prescriptionId_2_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1919:5: (lv_prescriptionId_2_0= RULE_INT )
                    // InternalQueryDsl.g:1920:6: lv_prescriptionId_2_0= RULE_INT
                    {
                    lv_prescriptionId_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_prescriptionId_2_0, grammarAccess.getWherePrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"prescriptionId",
                    							lv_prescriptionId_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1938:3: (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) )
                    {
                    // InternalQueryDsl.g:1938:3: (otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) ) )
                    // InternalQueryDsl.g:1939:4: otherlv_3= 'recordId' otherlv_4= '=' ( (lv_recordId_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getWherePrescriptionAccess().getRecordIdKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,35,FOLLOW_19); 

                    				newLeafNode(otherlv_4, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_1_1());
                    			
                    // InternalQueryDsl.g:1947:4: ( (lv_recordId_5_0= RULE_INT ) )
                    // InternalQueryDsl.g:1948:5: (lv_recordId_5_0= RULE_INT )
                    {
                    // InternalQueryDsl.g:1948:5: (lv_recordId_5_0= RULE_INT )
                    // InternalQueryDsl.g:1949:6: lv_recordId_5_0= RULE_INT
                    {
                    lv_recordId_5_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_recordId_5_0, grammarAccess.getWherePrescriptionAccess().getRecordIdINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"recordId",
                    							lv_recordId_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1967:3: (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) )
                    {
                    // InternalQueryDsl.g:1967:3: (otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) ) )
                    // InternalQueryDsl.g:1968:4: otherlv_6= 'medicationName' otherlv_7= '=' ( (lv_medicationName_8_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,48,FOLLOW_33); 

                    				newLeafNode(otherlv_6, grammarAccess.getWherePrescriptionAccess().getMedicationNameKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,35,FOLLOW_24); 

                    				newLeafNode(otherlv_7, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_2_1());
                    			
                    // InternalQueryDsl.g:1976:4: ( (lv_medicationName_8_0= RULE_STRING ) )
                    // InternalQueryDsl.g:1977:5: (lv_medicationName_8_0= RULE_STRING )
                    {
                    // InternalQueryDsl.g:1977:5: (lv_medicationName_8_0= RULE_STRING )
                    // InternalQueryDsl.g:1978:6: lv_medicationName_8_0= RULE_STRING
                    {
                    lv_medicationName_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_medicationName_8_0, grammarAccess.getWherePrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"medicationName",
                    							lv_medicationName_8_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1996:3: (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) )
                    {
                    // InternalQueryDsl.g:1996:3: (otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) ) )
                    // InternalQueryDsl.g:1997:4: otherlv_9= 'start' otherlv_10= '=' ( (lv_start_11_0= RULE_DATE ) )
                    {
                    otherlv_9=(Token)match(input,49,FOLLOW_33); 

                    				newLeafNode(otherlv_9, grammarAccess.getWherePrescriptionAccess().getStartKeyword_3_0());
                    			
                    otherlv_10=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_10, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalQueryDsl.g:2005:4: ( (lv_start_11_0= RULE_DATE ) )
                    // InternalQueryDsl.g:2006:5: (lv_start_11_0= RULE_DATE )
                    {
                    // InternalQueryDsl.g:2006:5: (lv_start_11_0= RULE_DATE )
                    // InternalQueryDsl.g:2007:6: lv_start_11_0= RULE_DATE
                    {
                    lv_start_11_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    						newLeafNode(lv_start_11_0, grammarAccess.getWherePrescriptionAccess().getStartDATETerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"start",
                    							lv_start_11_0,
                    							"ase.QueryDsl.DATE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2025:3: (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) )
                    {
                    // InternalQueryDsl.g:2025:3: (otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) ) )
                    // InternalQueryDsl.g:2026:4: otherlv_12= 'end' otherlv_13= '=' ( (lv_end_14_0= RULE_DATE ) )
                    {
                    otherlv_12=(Token)match(input,50,FOLLOW_33); 

                    				newLeafNode(otherlv_12, grammarAccess.getWherePrescriptionAccess().getEndKeyword_4_0());
                    			
                    otherlv_13=(Token)match(input,35,FOLLOW_22); 

                    				newLeafNode(otherlv_13, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_4_1());
                    			
                    // InternalQueryDsl.g:2034:4: ( (lv_end_14_0= RULE_DATE ) )
                    // InternalQueryDsl.g:2035:5: (lv_end_14_0= RULE_DATE )
                    {
                    // InternalQueryDsl.g:2035:5: (lv_end_14_0= RULE_DATE )
                    // InternalQueryDsl.g:2036:6: lv_end_14_0= RULE_DATE
                    {
                    lv_end_14_0=(Token)match(input,RULE_DATE,FOLLOW_2); 

                    						newLeafNode(lv_end_14_0, grammarAccess.getWherePrescriptionAccess().getEndDATETerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"end",
                    							lv_end_14_0,
                    							"ase.QueryDsl.DATE");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:2054:3: (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) )
                    {
                    // InternalQueryDsl.g:2054:3: (otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) ) )
                    // InternalQueryDsl.g:2055:4: otherlv_15= 'ordered' otherlv_16= '=' ( (lv_ordered_17_0= RULE_BOOLEAN ) )
                    {
                    otherlv_15=(Token)match(input,51,FOLLOW_33); 

                    				newLeafNode(otherlv_15, grammarAccess.getWherePrescriptionAccess().getOrderedKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_16, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_5_1());
                    			
                    // InternalQueryDsl.g:2063:4: ( (lv_ordered_17_0= RULE_BOOLEAN ) )
                    // InternalQueryDsl.g:2064:5: (lv_ordered_17_0= RULE_BOOLEAN )
                    {
                    // InternalQueryDsl.g:2064:5: (lv_ordered_17_0= RULE_BOOLEAN )
                    // InternalQueryDsl.g:2065:6: lv_ordered_17_0= RULE_BOOLEAN
                    {
                    lv_ordered_17_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

                    						newLeafNode(lv_ordered_17_0, grammarAccess.getWherePrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_5_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"ordered",
                    							lv_ordered_17_0,
                    							"ase.QueryDsl.BOOLEAN");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:2083:3: (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) )
                    {
                    // InternalQueryDsl.g:2083:3: (otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) ) )
                    // InternalQueryDsl.g:2084:4: otherlv_18= 'price' otherlv_19= '=' ( (lv_price_20_0= RULE_DOUBLE ) )
                    {
                    otherlv_18=(Token)match(input,40,FOLLOW_33); 

                    				newLeafNode(otherlv_18, grammarAccess.getWherePrescriptionAccess().getPriceKeyword_6_0());
                    			
                    otherlv_19=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_19, grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_6_1());
                    			
                    // InternalQueryDsl.g:2092:4: ( (lv_price_20_0= RULE_DOUBLE ) )
                    // InternalQueryDsl.g:2093:5: (lv_price_20_0= RULE_DOUBLE )
                    {
                    // InternalQueryDsl.g:2093:5: (lv_price_20_0= RULE_DOUBLE )
                    // InternalQueryDsl.g:2094:6: lv_price_20_0= RULE_DOUBLE
                    {
                    lv_price_20_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_price_20_0, grammarAccess.getWherePrescriptionAccess().getPriceDOUBLETerminalRuleCall_6_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWherePrescriptionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"price",
                    							lv_price_20_0,
                    							"ase.QueryDsl.DOUBLE");
                    					

                    }


                    }


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
    // $ANTLR end "ruleWherePrescription"


    // $ANTLR start "ruleTableName"
    // InternalQueryDsl.g:2115:1: ruleTableName returns [Enumerator current=null] : ( (enumLiteral_0= 'MedicalRecord' ) | (enumLiteral_1= 'PatientMonitoring' ) | (enumLiteral_2= 'Prescription' ) ) ;
    public final Enumerator ruleTableName() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2121:2: ( ( (enumLiteral_0= 'MedicalRecord' ) | (enumLiteral_1= 'PatientMonitoring' ) | (enumLiteral_2= 'Prescription' ) ) )
            // InternalQueryDsl.g:2122:2: ( (enumLiteral_0= 'MedicalRecord' ) | (enumLiteral_1= 'PatientMonitoring' ) | (enumLiteral_2= 'Prescription' ) )
            {
            // InternalQueryDsl.g:2122:2: ( (enumLiteral_0= 'MedicalRecord' ) | (enumLiteral_1= 'PatientMonitoring' ) | (enumLiteral_2= 'Prescription' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt21=1;
                }
                break;
            case 23:
                {
                alt21=2;
                }
                break;
            case 24:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalQueryDsl.g:2123:3: (enumLiteral_0= 'MedicalRecord' )
                    {
                    // InternalQueryDsl.g:2123:3: (enumLiteral_0= 'MedicalRecord' )
                    // InternalQueryDsl.g:2124:4: enumLiteral_0= 'MedicalRecord'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getTableNameAccess().getMedicalRecordEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTableNameAccess().getMedicalRecordEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2131:3: (enumLiteral_1= 'PatientMonitoring' )
                    {
                    // InternalQueryDsl.g:2131:3: (enumLiteral_1= 'PatientMonitoring' )
                    // InternalQueryDsl.g:2132:4: enumLiteral_1= 'PatientMonitoring'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTableNameAccess().getPatientMonitoringEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTableNameAccess().getPatientMonitoringEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2139:3: (enumLiteral_2= 'Prescription' )
                    {
                    // InternalQueryDsl.g:2139:3: (enumLiteral_2= 'Prescription' )
                    // InternalQueryDsl.g:2140:4: enumLiteral_2= 'Prescription'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTableNameAccess().getPrescriptionEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTableNameAccess().getPrescriptionEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleTableName"


    // $ANTLR start "ruleVariableMedicalRecord"
    // InternalQueryDsl.g:2150:1: ruleVariableMedicalRecord returns [Enumerator current=null] : ( (enumLiteral_0= 'recordId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'doctorId' ) | (enumLiteral_3= 'medicalCondition' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'price' ) | (enumLiteral_6= 'description' ) ) ;
    public final Enumerator ruleVariableMedicalRecord() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2156:2: ( ( (enumLiteral_0= 'recordId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'doctorId' ) | (enumLiteral_3= 'medicalCondition' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'price' ) | (enumLiteral_6= 'description' ) ) )
            // InternalQueryDsl.g:2157:2: ( (enumLiteral_0= 'recordId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'doctorId' ) | (enumLiteral_3= 'medicalCondition' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'price' ) | (enumLiteral_6= 'description' ) )
            {
            // InternalQueryDsl.g:2157:2: ( (enumLiteral_0= 'recordId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'doctorId' ) | (enumLiteral_3= 'medicalCondition' ) | (enumLiteral_4= 'date' ) | (enumLiteral_5= 'price' ) | (enumLiteral_6= 'description' ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 36:
                {
                alt22=2;
                }
                break;
            case 37:
                {
                alt22=3;
                }
                break;
            case 38:
                {
                alt22=4;
                }
                break;
            case 39:
                {
                alt22=5;
                }
                break;
            case 40:
                {
                alt22=6;
                }
                break;
            case 41:
                {
                alt22=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalQueryDsl.g:2158:3: (enumLiteral_0= 'recordId' )
                    {
                    // InternalQueryDsl.g:2158:3: (enumLiteral_0= 'recordId' )
                    // InternalQueryDsl.g:2159:4: enumLiteral_0= 'recordId'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getRecordIdEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariableMedicalRecordAccess().getRecordIdEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2166:3: (enumLiteral_1= 'patientId' )
                    {
                    // InternalQueryDsl.g:2166:3: (enumLiteral_1= 'patientId' )
                    // InternalQueryDsl.g:2167:4: enumLiteral_1= 'patientId'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getPatientIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariableMedicalRecordAccess().getPatientIdEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2174:3: (enumLiteral_2= 'doctorId' )
                    {
                    // InternalQueryDsl.g:2174:3: (enumLiteral_2= 'doctorId' )
                    // InternalQueryDsl.g:2175:4: enumLiteral_2= 'doctorId'
                    {
                    enumLiteral_2=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getDoctorIdEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariableMedicalRecordAccess().getDoctorIdEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2182:3: (enumLiteral_3= 'medicalCondition' )
                    {
                    // InternalQueryDsl.g:2182:3: (enumLiteral_3= 'medicalCondition' )
                    // InternalQueryDsl.g:2183:4: enumLiteral_3= 'medicalCondition'
                    {
                    enumLiteral_3=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getMedicalConditionEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariableMedicalRecordAccess().getMedicalConditionEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2190:3: (enumLiteral_4= 'date' )
                    {
                    // InternalQueryDsl.g:2190:3: (enumLiteral_4= 'date' )
                    // InternalQueryDsl.g:2191:4: enumLiteral_4= 'date'
                    {
                    enumLiteral_4=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getDateEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVariableMedicalRecordAccess().getDateEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:2198:3: (enumLiteral_5= 'price' )
                    {
                    // InternalQueryDsl.g:2198:3: (enumLiteral_5= 'price' )
                    // InternalQueryDsl.g:2199:4: enumLiteral_5= 'price'
                    {
                    enumLiteral_5=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getPriceEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVariableMedicalRecordAccess().getPriceEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:2206:3: (enumLiteral_6= 'description' )
                    {
                    // InternalQueryDsl.g:2206:3: (enumLiteral_6= 'description' )
                    // InternalQueryDsl.g:2207:4: enumLiteral_6= 'description'
                    {
                    enumLiteral_6=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getVariableMedicalRecordAccess().getDescriptionEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVariableMedicalRecordAccess().getDescriptionEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleVariableMedicalRecord"


    // $ANTLR start "ruleVariablePatientMonitoring"
    // InternalQueryDsl.g:2217:1: ruleVariablePatientMonitoring returns [Enumerator current=null] : ( (enumLiteral_0= 'monitoringId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'category' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'riskPerception' ) | (enumLiteral_5= 'treated' ) | (enumLiteral_6= 'deviceId' ) ) ;
    public final Enumerator ruleVariablePatientMonitoring() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2223:2: ( ( (enumLiteral_0= 'monitoringId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'category' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'riskPerception' ) | (enumLiteral_5= 'treated' ) | (enumLiteral_6= 'deviceId' ) ) )
            // InternalQueryDsl.g:2224:2: ( (enumLiteral_0= 'monitoringId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'category' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'riskPerception' ) | (enumLiteral_5= 'treated' ) | (enumLiteral_6= 'deviceId' ) )
            {
            // InternalQueryDsl.g:2224:2: ( (enumLiteral_0= 'monitoringId' ) | (enumLiteral_1= 'patientId' ) | (enumLiteral_2= 'category' ) | (enumLiteral_3= 'date' ) | (enumLiteral_4= 'riskPerception' ) | (enumLiteral_5= 'treated' ) | (enumLiteral_6= 'deviceId' ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 43:
                {
                alt23=3;
                }
                break;
            case 39:
                {
                alt23=4;
                }
                break;
            case 44:
                {
                alt23=5;
                }
                break;
            case 45:
                {
                alt23=6;
                }
                break;
            case 46:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalQueryDsl.g:2225:3: (enumLiteral_0= 'monitoringId' )
                    {
                    // InternalQueryDsl.g:2225:3: (enumLiteral_0= 'monitoringId' )
                    // InternalQueryDsl.g:2226:4: enumLiteral_0= 'monitoringId'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getMonitoringIdEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariablePatientMonitoringAccess().getMonitoringIdEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2233:3: (enumLiteral_1= 'patientId' )
                    {
                    // InternalQueryDsl.g:2233:3: (enumLiteral_1= 'patientId' )
                    // InternalQueryDsl.g:2234:4: enumLiteral_1= 'patientId'
                    {
                    enumLiteral_1=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getPatientIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariablePatientMonitoringAccess().getPatientIdEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2241:3: (enumLiteral_2= 'category' )
                    {
                    // InternalQueryDsl.g:2241:3: (enumLiteral_2= 'category' )
                    // InternalQueryDsl.g:2242:4: enumLiteral_2= 'category'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getCategoryEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariablePatientMonitoringAccess().getCategoryEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2249:3: (enumLiteral_3= 'date' )
                    {
                    // InternalQueryDsl.g:2249:3: (enumLiteral_3= 'date' )
                    // InternalQueryDsl.g:2250:4: enumLiteral_3= 'date'
                    {
                    enumLiteral_3=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariablePatientMonitoringAccess().getDateEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2257:3: (enumLiteral_4= 'riskPerception' )
                    {
                    // InternalQueryDsl.g:2257:3: (enumLiteral_4= 'riskPerception' )
                    // InternalQueryDsl.g:2258:4: enumLiteral_4= 'riskPerception'
                    {
                    enumLiteral_4=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getRiskPerceptionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVariablePatientMonitoringAccess().getRiskPerceptionEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:2265:3: (enumLiteral_5= 'treated' )
                    {
                    // InternalQueryDsl.g:2265:3: (enumLiteral_5= 'treated' )
                    // InternalQueryDsl.g:2266:4: enumLiteral_5= 'treated'
                    {
                    enumLiteral_5=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getTreatedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVariablePatientMonitoringAccess().getTreatedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:2273:3: (enumLiteral_6= 'deviceId' )
                    {
                    // InternalQueryDsl.g:2273:3: (enumLiteral_6= 'deviceId' )
                    // InternalQueryDsl.g:2274:4: enumLiteral_6= 'deviceId'
                    {
                    enumLiteral_6=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getVariablePatientMonitoringAccess().getDeviceIdEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVariablePatientMonitoringAccess().getDeviceIdEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleVariablePatientMonitoring"


    // $ANTLR start "ruleVariablePrescription"
    // InternalQueryDsl.g:2284:1: ruleVariablePrescription returns [Enumerator current=null] : ( (enumLiteral_0= 'prescriptionId' ) | (enumLiteral_1= 'recordId' ) | (enumLiteral_2= 'medicationName' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'end' ) | (enumLiteral_5= 'ordered' ) | (enumLiteral_6= 'price' ) ) ;
    public final Enumerator ruleVariablePrescription() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2290:2: ( ( (enumLiteral_0= 'prescriptionId' ) | (enumLiteral_1= 'recordId' ) | (enumLiteral_2= 'medicationName' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'end' ) | (enumLiteral_5= 'ordered' ) | (enumLiteral_6= 'price' ) ) )
            // InternalQueryDsl.g:2291:2: ( (enumLiteral_0= 'prescriptionId' ) | (enumLiteral_1= 'recordId' ) | (enumLiteral_2= 'medicationName' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'end' ) | (enumLiteral_5= 'ordered' ) | (enumLiteral_6= 'price' ) )
            {
            // InternalQueryDsl.g:2291:2: ( (enumLiteral_0= 'prescriptionId' ) | (enumLiteral_1= 'recordId' ) | (enumLiteral_2= 'medicationName' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'end' ) | (enumLiteral_5= 'ordered' ) | (enumLiteral_6= 'price' ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt24=1;
                }
                break;
            case 34:
                {
                alt24=2;
                }
                break;
            case 48:
                {
                alt24=3;
                }
                break;
            case 49:
                {
                alt24=4;
                }
                break;
            case 50:
                {
                alt24=5;
                }
                break;
            case 51:
                {
                alt24=6;
                }
                break;
            case 40:
                {
                alt24=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalQueryDsl.g:2292:3: (enumLiteral_0= 'prescriptionId' )
                    {
                    // InternalQueryDsl.g:2292:3: (enumLiteral_0= 'prescriptionId' )
                    // InternalQueryDsl.g:2293:4: enumLiteral_0= 'prescriptionId'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getPrescriptionIdEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getVariablePrescriptionAccess().getPrescriptionIdEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2300:3: (enumLiteral_1= 'recordId' )
                    {
                    // InternalQueryDsl.g:2300:3: (enumLiteral_1= 'recordId' )
                    // InternalQueryDsl.g:2301:4: enumLiteral_1= 'recordId'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getRecordIdEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getVariablePrescriptionAccess().getRecordIdEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2308:3: (enumLiteral_2= 'medicationName' )
                    {
                    // InternalQueryDsl.g:2308:3: (enumLiteral_2= 'medicationName' )
                    // InternalQueryDsl.g:2309:4: enumLiteral_2= 'medicationName'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getMedicationNameEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getVariablePrescriptionAccess().getMedicationNameEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2316:3: (enumLiteral_3= 'start' )
                    {
                    // InternalQueryDsl.g:2316:3: (enumLiteral_3= 'start' )
                    // InternalQueryDsl.g:2317:4: enumLiteral_3= 'start'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getStartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getVariablePrescriptionAccess().getStartEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2324:3: (enumLiteral_4= 'end' )
                    {
                    // InternalQueryDsl.g:2324:3: (enumLiteral_4= 'end' )
                    // InternalQueryDsl.g:2325:4: enumLiteral_4= 'end'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getEndEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getVariablePrescriptionAccess().getEndEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:2332:3: (enumLiteral_5= 'ordered' )
                    {
                    // InternalQueryDsl.g:2332:3: (enumLiteral_5= 'ordered' )
                    // InternalQueryDsl.g:2333:4: enumLiteral_5= 'ordered'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getOrderedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getVariablePrescriptionAccess().getOrderedEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:2340:3: (enumLiteral_6= 'price' )
                    {
                    // InternalQueryDsl.g:2340:3: (enumLiteral_6= 'price' )
                    // InternalQueryDsl.g:2341:4: enumLiteral_6= 'price'
                    {
                    enumLiteral_6=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getVariablePrescriptionAccess().getPriceEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getVariablePrescriptionAccess().getPriceEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleVariablePrescription"


    // $ANTLR start "ruleMedicalCondition"
    // InternalQueryDsl.g:2351:1: ruleMedicalCondition returns [Enumerator current=null] : ( (enumLiteral_0= 'Bronchitis' ) | (enumLiteral_1= 'Asthma' ) | (enumLiteral_2= 'Diabetes' ) | (enumLiteral_3= 'Flu' ) | (enumLiteral_4= 'Hypertension' ) ) ;
    public final Enumerator ruleMedicalCondition() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2357:2: ( ( (enumLiteral_0= 'Bronchitis' ) | (enumLiteral_1= 'Asthma' ) | (enumLiteral_2= 'Diabetes' ) | (enumLiteral_3= 'Flu' ) | (enumLiteral_4= 'Hypertension' ) ) )
            // InternalQueryDsl.g:2358:2: ( (enumLiteral_0= 'Bronchitis' ) | (enumLiteral_1= 'Asthma' ) | (enumLiteral_2= 'Diabetes' ) | (enumLiteral_3= 'Flu' ) | (enumLiteral_4= 'Hypertension' ) )
            {
            // InternalQueryDsl.g:2358:2: ( (enumLiteral_0= 'Bronchitis' ) | (enumLiteral_1= 'Asthma' ) | (enumLiteral_2= 'Diabetes' ) | (enumLiteral_3= 'Flu' ) | (enumLiteral_4= 'Hypertension' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt25=1;
                }
                break;
            case 53:
                {
                alt25=2;
                }
                break;
            case 54:
                {
                alt25=3;
                }
                break;
            case 55:
                {
                alt25=4;
                }
                break;
            case 56:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalQueryDsl.g:2359:3: (enumLiteral_0= 'Bronchitis' )
                    {
                    // InternalQueryDsl.g:2359:3: (enumLiteral_0= 'Bronchitis' )
                    // InternalQueryDsl.g:2360:4: enumLiteral_0= 'Bronchitis'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getMedicalConditionAccess().getBronchitisEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMedicalConditionAccess().getBronchitisEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2367:3: (enumLiteral_1= 'Asthma' )
                    {
                    // InternalQueryDsl.g:2367:3: (enumLiteral_1= 'Asthma' )
                    // InternalQueryDsl.g:2368:4: enumLiteral_1= 'Asthma'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getMedicalConditionAccess().getAsthmaEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMedicalConditionAccess().getAsthmaEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2375:3: (enumLiteral_2= 'Diabetes' )
                    {
                    // InternalQueryDsl.g:2375:3: (enumLiteral_2= 'Diabetes' )
                    // InternalQueryDsl.g:2376:4: enumLiteral_2= 'Diabetes'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getMedicalConditionAccess().getDiabetesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMedicalConditionAccess().getDiabetesEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2383:3: (enumLiteral_3= 'Flu' )
                    {
                    // InternalQueryDsl.g:2383:3: (enumLiteral_3= 'Flu' )
                    // InternalQueryDsl.g:2384:4: enumLiteral_3= 'Flu'
                    {
                    enumLiteral_3=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getMedicalConditionAccess().getFluEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMedicalConditionAccess().getFluEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2391:3: (enumLiteral_4= 'Hypertension' )
                    {
                    // InternalQueryDsl.g:2391:3: (enumLiteral_4= 'Hypertension' )
                    // InternalQueryDsl.g:2392:4: enumLiteral_4= 'Hypertension'
                    {
                    enumLiteral_4=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getMedicalConditionAccess().getHypertensionEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMedicalConditionAccess().getHypertensionEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleMedicalCondition"


    // $ANTLR start "ruleRiskPerception"
    // InternalQueryDsl.g:2402:1: ruleRiskPerception returns [Enumerator current=null] : ( (enumLiteral_0= 'High' ) | (enumLiteral_1= 'Medium' ) | (enumLiteral_2= 'Low' ) ) ;
    public final Enumerator ruleRiskPerception() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalQueryDsl.g:2408:2: ( ( (enumLiteral_0= 'High' ) | (enumLiteral_1= 'Medium' ) | (enumLiteral_2= 'Low' ) ) )
            // InternalQueryDsl.g:2409:2: ( (enumLiteral_0= 'High' ) | (enumLiteral_1= 'Medium' ) | (enumLiteral_2= 'Low' ) )
            {
            // InternalQueryDsl.g:2409:2: ( (enumLiteral_0= 'High' ) | (enumLiteral_1= 'Medium' ) | (enumLiteral_2= 'Low' ) )
            int alt26=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt26=1;
                }
                break;
            case 58:
                {
                alt26=2;
                }
                break;
            case 59:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalQueryDsl.g:2410:3: (enumLiteral_0= 'High' )
                    {
                    // InternalQueryDsl.g:2410:3: (enumLiteral_0= 'High' )
                    // InternalQueryDsl.g:2411:4: enumLiteral_0= 'High'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getRiskPerceptionAccess().getHighEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRiskPerceptionAccess().getHighEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2418:3: (enumLiteral_1= 'Medium' )
                    {
                    // InternalQueryDsl.g:2418:3: (enumLiteral_1= 'Medium' )
                    // InternalQueryDsl.g:2419:4: enumLiteral_1= 'Medium'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getRiskPerceptionAccess().getMediumEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRiskPerceptionAccess().getMediumEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2426:3: (enumLiteral_2= 'Low' )
                    {
                    // InternalQueryDsl.g:2426:3: (enumLiteral_2= 'Low' )
                    // InternalQueryDsl.g:2427:4: enumLiteral_2= 'Low'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getRiskPerceptionAccess().getLowEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRiskPerceptionAccess().getLowEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleRiskPerception"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\42\2\22\1\uffff\2\22\2\uffff\1\42\1\24\1\42\1\24\4\22";
    static final String dfa_3s = "\1\63\2\23\1\uffff\2\23\2\uffff\1\63\1\30\1\56\1\27\4\23";
    static final String dfa_4s = "\3\uffff\1\1\2\uffff\1\2\1\3\10\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\2\2\3\1\4\1\5\1\3\5\6\5\7",
            "\1\10\1\11",
            "\1\12\1\13",
            "",
            "\1\12\1\13",
            "\1\10\1\11",
            "",
            "",
            "\1\14\1\uffff\4\3\1\15\1\3\5\uffff\5\7",
            "\1\3\3\uffff\1\7",
            "\1\3\1\uffff\1\16\2\3\1\17\2\3\5\6",
            "\1\3\2\uffff\1\6",
            "\1\10\1\11",
            "\1\10\1\11",
            "\1\12\1\13",
            "\1\12\1\13"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "174:3: (this_SelectMedicalRecord_1= ruleSelectMedicalRecord | this_SelectPatientMonitoring_2= ruleSelectPatientMonitoring | this_SelectPrescription_3= ruleSelectPrescription )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000A2020002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000FFFF400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000003F400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000003F400400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00007C9000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00007C9000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000F810400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000F810400400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001900000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x01F0000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});

}