package ase.ide.contentassist.antlr.internal;

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
import ase.services.QueryDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_DATE", "RULE_DOUBLE", "RULE_STRING", "RULE_BOOLEAN", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MedicalRecord'", "'PatientMonitoring'", "'Prescription'", "'recordId'", "'patientId'", "'doctorId'", "'medicalCondition'", "'date'", "'price'", "'description'", "'monitoringId'", "'category'", "'riskPerception'", "'treated'", "'deviceId'", "'prescriptionId'", "'medicationName'", "'start'", "'end'", "'ordered'", "'Bronchitis'", "'Asthma'", "'Diabetes'", "'Flu'", "'Hypertension'", "'High'", "'Medium'", "'Low'", "'SELECT'", "'From'", "';'", "','", "'WHERE'", "'INSERT'", "'INTO'", "'Values('", "')'", "'DROP'", "'TABLE'", "'DELETE'", "'FROM'", "'and'", "'='"
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

    	public void setGrammarAccess(QueryDslGrammarAccess grammarAccess) {
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
    // InternalQueryDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalQueryDsl.g:54:1: ( ruleModel EOF )
            // InternalQueryDsl.g:55:1: ruleModel EOF
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
    // InternalQueryDsl.g:62:1: ruleModel : ( ( rule__Model__QueryTypeAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:66:2: ( ( ( rule__Model__QueryTypeAssignment )* ) )
            // InternalQueryDsl.g:67:2: ( ( rule__Model__QueryTypeAssignment )* )
            {
            // InternalQueryDsl.g:67:2: ( ( rule__Model__QueryTypeAssignment )* )
            // InternalQueryDsl.g:68:3: ( rule__Model__QueryTypeAssignment )*
            {
             before(grammarAccess.getModelAccess().getQueryTypeAssignment()); 
            // InternalQueryDsl.g:69:3: ( rule__Model__QueryTypeAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45||LA1_0==50||LA1_0==54||LA1_0==56) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalQueryDsl.g:69:4: rule__Model__QueryTypeAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__QueryTypeAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getQueryTypeAssignment()); 

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


    // $ANTLR start "entryRuleQueryType"
    // InternalQueryDsl.g:78:1: entryRuleQueryType : ruleQueryType EOF ;
    public final void entryRuleQueryType() throws RecognitionException {
        try {
            // InternalQueryDsl.g:79:1: ( ruleQueryType EOF )
            // InternalQueryDsl.g:80:1: ruleQueryType EOF
            {
             before(grammarAccess.getQueryTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getQueryTypeRule()); 
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
    // $ANTLR end "entryRuleQueryType"


    // $ANTLR start "ruleQueryType"
    // InternalQueryDsl.g:87:1: ruleQueryType : ( ( rule__QueryType__Alternatives ) ) ;
    public final void ruleQueryType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:91:2: ( ( ( rule__QueryType__Alternatives ) ) )
            // InternalQueryDsl.g:92:2: ( ( rule__QueryType__Alternatives ) )
            {
            // InternalQueryDsl.g:92:2: ( ( rule__QueryType__Alternatives ) )
            // InternalQueryDsl.g:93:3: ( rule__QueryType__Alternatives )
            {
             before(grammarAccess.getQueryTypeAccess().getAlternatives()); 
            // InternalQueryDsl.g:94:3: ( rule__QueryType__Alternatives )
            // InternalQueryDsl.g:94:4: rule__QueryType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getQueryTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleQueryType"


    // $ANTLR start "entryRuleSelect"
    // InternalQueryDsl.g:103:1: entryRuleSelect : ruleSelect EOF ;
    public final void entryRuleSelect() throws RecognitionException {
        try {
            // InternalQueryDsl.g:104:1: ( ruleSelect EOF )
            // InternalQueryDsl.g:105:1: ruleSelect EOF
            {
             before(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_1);
            ruleSelect();

            state._fsp--;

             after(grammarAccess.getSelectRule()); 
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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // InternalQueryDsl.g:112:1: ruleSelect : ( ( rule__Select__Group__0 ) ) ;
    public final void ruleSelect() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:116:2: ( ( ( rule__Select__Group__0 ) ) )
            // InternalQueryDsl.g:117:2: ( ( rule__Select__Group__0 ) )
            {
            // InternalQueryDsl.g:117:2: ( ( rule__Select__Group__0 ) )
            // InternalQueryDsl.g:118:3: ( rule__Select__Group__0 )
            {
             before(grammarAccess.getSelectAccess().getGroup()); 
            // InternalQueryDsl.g:119:3: ( rule__Select__Group__0 )
            // InternalQueryDsl.g:119:4: rule__Select__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getGroup()); 

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleSelectMedicalRecord"
    // InternalQueryDsl.g:128:1: entryRuleSelectMedicalRecord : ruleSelectMedicalRecord EOF ;
    public final void entryRuleSelectMedicalRecord() throws RecognitionException {
        try {
            // InternalQueryDsl.g:129:1: ( ruleSelectMedicalRecord EOF )
            // InternalQueryDsl.g:130:1: ruleSelectMedicalRecord EOF
            {
             before(grammarAccess.getSelectMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectMedicalRecord();

            state._fsp--;

             after(grammarAccess.getSelectMedicalRecordRule()); 
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
    // $ANTLR end "entryRuleSelectMedicalRecord"


    // $ANTLR start "ruleSelectMedicalRecord"
    // InternalQueryDsl.g:137:1: ruleSelectMedicalRecord : ( ( rule__SelectMedicalRecord__Group__0 ) ) ;
    public final void ruleSelectMedicalRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:141:2: ( ( ( rule__SelectMedicalRecord__Group__0 ) ) )
            // InternalQueryDsl.g:142:2: ( ( rule__SelectMedicalRecord__Group__0 ) )
            {
            // InternalQueryDsl.g:142:2: ( ( rule__SelectMedicalRecord__Group__0 ) )
            // InternalQueryDsl.g:143:3: ( rule__SelectMedicalRecord__Group__0 )
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getGroup()); 
            // InternalQueryDsl.g:144:3: ( rule__SelectMedicalRecord__Group__0 )
            // InternalQueryDsl.g:144:4: rule__SelectMedicalRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectMedicalRecordAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectMedicalRecord"


    // $ANTLR start "entryRuleSelectPatientMonitoring"
    // InternalQueryDsl.g:153:1: entryRuleSelectPatientMonitoring : ruleSelectPatientMonitoring EOF ;
    public final void entryRuleSelectPatientMonitoring() throws RecognitionException {
        try {
            // InternalQueryDsl.g:154:1: ( ruleSelectPatientMonitoring EOF )
            // InternalQueryDsl.g:155:1: ruleSelectPatientMonitoring EOF
            {
             before(grammarAccess.getSelectPatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectPatientMonitoring();

            state._fsp--;

             after(grammarAccess.getSelectPatientMonitoringRule()); 
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
    // $ANTLR end "entryRuleSelectPatientMonitoring"


    // $ANTLR start "ruleSelectPatientMonitoring"
    // InternalQueryDsl.g:162:1: ruleSelectPatientMonitoring : ( ( rule__SelectPatientMonitoring__Group__0 ) ) ;
    public final void ruleSelectPatientMonitoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:166:2: ( ( ( rule__SelectPatientMonitoring__Group__0 ) ) )
            // InternalQueryDsl.g:167:2: ( ( rule__SelectPatientMonitoring__Group__0 ) )
            {
            // InternalQueryDsl.g:167:2: ( ( rule__SelectPatientMonitoring__Group__0 ) )
            // InternalQueryDsl.g:168:3: ( rule__SelectPatientMonitoring__Group__0 )
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getGroup()); 
            // InternalQueryDsl.g:169:3: ( rule__SelectPatientMonitoring__Group__0 )
            // InternalQueryDsl.g:169:4: rule__SelectPatientMonitoring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectPatientMonitoringAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectPatientMonitoring"


    // $ANTLR start "entryRuleSelectPrescription"
    // InternalQueryDsl.g:178:1: entryRuleSelectPrescription : ruleSelectPrescription EOF ;
    public final void entryRuleSelectPrescription() throws RecognitionException {
        try {
            // InternalQueryDsl.g:179:1: ( ruleSelectPrescription EOF )
            // InternalQueryDsl.g:180:1: ruleSelectPrescription EOF
            {
             before(grammarAccess.getSelectPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectPrescription();

            state._fsp--;

             after(grammarAccess.getSelectPrescriptionRule()); 
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
    // $ANTLR end "entryRuleSelectPrescription"


    // $ANTLR start "ruleSelectPrescription"
    // InternalQueryDsl.g:187:1: ruleSelectPrescription : ( ( rule__SelectPrescription__Group__0 ) ) ;
    public final void ruleSelectPrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:191:2: ( ( ( rule__SelectPrescription__Group__0 ) ) )
            // InternalQueryDsl.g:192:2: ( ( rule__SelectPrescription__Group__0 ) )
            {
            // InternalQueryDsl.g:192:2: ( ( rule__SelectPrescription__Group__0 ) )
            // InternalQueryDsl.g:193:3: ( rule__SelectPrescription__Group__0 )
            {
             before(grammarAccess.getSelectPrescriptionAccess().getGroup()); 
            // InternalQueryDsl.g:194:3: ( rule__SelectPrescription__Group__0 )
            // InternalQueryDsl.g:194:4: rule__SelectPrescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectPrescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleSelectPrescription"


    // $ANTLR start "entryRuleInsert"
    // InternalQueryDsl.g:203:1: entryRuleInsert : ruleInsert EOF ;
    public final void entryRuleInsert() throws RecognitionException {
        try {
            // InternalQueryDsl.g:204:1: ( ruleInsert EOF )
            // InternalQueryDsl.g:205:1: ruleInsert EOF
            {
             before(grammarAccess.getInsertRule()); 
            pushFollow(FOLLOW_1);
            ruleInsert();

            state._fsp--;

             after(grammarAccess.getInsertRule()); 
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
    // $ANTLR end "entryRuleInsert"


    // $ANTLR start "ruleInsert"
    // InternalQueryDsl.g:212:1: ruleInsert : ( ( rule__Insert__Group__0 ) ) ;
    public final void ruleInsert() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:216:2: ( ( ( rule__Insert__Group__0 ) ) )
            // InternalQueryDsl.g:217:2: ( ( rule__Insert__Group__0 ) )
            {
            // InternalQueryDsl.g:217:2: ( ( rule__Insert__Group__0 ) )
            // InternalQueryDsl.g:218:3: ( rule__Insert__Group__0 )
            {
             before(grammarAccess.getInsertAccess().getGroup()); 
            // InternalQueryDsl.g:219:3: ( rule__Insert__Group__0 )
            // InternalQueryDsl.g:219:4: rule__Insert__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getGroup()); 

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
    // $ANTLR end "ruleInsert"


    // $ANTLR start "entryRuleInsertMedicalRecord"
    // InternalQueryDsl.g:228:1: entryRuleInsertMedicalRecord : ruleInsertMedicalRecord EOF ;
    public final void entryRuleInsertMedicalRecord() throws RecognitionException {
        try {
            // InternalQueryDsl.g:229:1: ( ruleInsertMedicalRecord EOF )
            // InternalQueryDsl.g:230:1: ruleInsertMedicalRecord EOF
            {
             before(grammarAccess.getInsertMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertMedicalRecord();

            state._fsp--;

             after(grammarAccess.getInsertMedicalRecordRule()); 
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
    // $ANTLR end "entryRuleInsertMedicalRecord"


    // $ANTLR start "ruleInsertMedicalRecord"
    // InternalQueryDsl.g:237:1: ruleInsertMedicalRecord : ( ( rule__InsertMedicalRecord__Group__0 ) ) ;
    public final void ruleInsertMedicalRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:241:2: ( ( ( rule__InsertMedicalRecord__Group__0 ) ) )
            // InternalQueryDsl.g:242:2: ( ( rule__InsertMedicalRecord__Group__0 ) )
            {
            // InternalQueryDsl.g:242:2: ( ( rule__InsertMedicalRecord__Group__0 ) )
            // InternalQueryDsl.g:243:3: ( rule__InsertMedicalRecord__Group__0 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getGroup()); 
            // InternalQueryDsl.g:244:3: ( rule__InsertMedicalRecord__Group__0 )
            // InternalQueryDsl.g:244:4: rule__InsertMedicalRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertMedicalRecord"


    // $ANTLR start "entryRuleInsertPatientMonitoring"
    // InternalQueryDsl.g:253:1: entryRuleInsertPatientMonitoring : ruleInsertPatientMonitoring EOF ;
    public final void entryRuleInsertPatientMonitoring() throws RecognitionException {
        try {
            // InternalQueryDsl.g:254:1: ( ruleInsertPatientMonitoring EOF )
            // InternalQueryDsl.g:255:1: ruleInsertPatientMonitoring EOF
            {
             before(grammarAccess.getInsertPatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertPatientMonitoring();

            state._fsp--;

             after(grammarAccess.getInsertPatientMonitoringRule()); 
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
    // $ANTLR end "entryRuleInsertPatientMonitoring"


    // $ANTLR start "ruleInsertPatientMonitoring"
    // InternalQueryDsl.g:262:1: ruleInsertPatientMonitoring : ( ( rule__InsertPatientMonitoring__Group__0 ) ) ;
    public final void ruleInsertPatientMonitoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:266:2: ( ( ( rule__InsertPatientMonitoring__Group__0 ) ) )
            // InternalQueryDsl.g:267:2: ( ( rule__InsertPatientMonitoring__Group__0 ) )
            {
            // InternalQueryDsl.g:267:2: ( ( rule__InsertPatientMonitoring__Group__0 ) )
            // InternalQueryDsl.g:268:3: ( rule__InsertPatientMonitoring__Group__0 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getGroup()); 
            // InternalQueryDsl.g:269:3: ( rule__InsertPatientMonitoring__Group__0 )
            // InternalQueryDsl.g:269:4: rule__InsertPatientMonitoring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertPatientMonitoring"


    // $ANTLR start "entryRuleInsertPrescription"
    // InternalQueryDsl.g:278:1: entryRuleInsertPrescription : ruleInsertPrescription EOF ;
    public final void entryRuleInsertPrescription() throws RecognitionException {
        try {
            // InternalQueryDsl.g:279:1: ( ruleInsertPrescription EOF )
            // InternalQueryDsl.g:280:1: ruleInsertPrescription EOF
            {
             before(grammarAccess.getInsertPrescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleInsertPrescription();

            state._fsp--;

             after(grammarAccess.getInsertPrescriptionRule()); 
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
    // $ANTLR end "entryRuleInsertPrescription"


    // $ANTLR start "ruleInsertPrescription"
    // InternalQueryDsl.g:287:1: ruleInsertPrescription : ( ( rule__InsertPrescription__Group__0 ) ) ;
    public final void ruleInsertPrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:291:2: ( ( ( rule__InsertPrescription__Group__0 ) ) )
            // InternalQueryDsl.g:292:2: ( ( rule__InsertPrescription__Group__0 ) )
            {
            // InternalQueryDsl.g:292:2: ( ( rule__InsertPrescription__Group__0 ) )
            // InternalQueryDsl.g:293:3: ( rule__InsertPrescription__Group__0 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getGroup()); 
            // InternalQueryDsl.g:294:3: ( rule__InsertPrescription__Group__0 )
            // InternalQueryDsl.g:294:4: rule__InsertPrescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleInsertPrescription"


    // $ANTLR start "entryRuleDrop"
    // InternalQueryDsl.g:303:1: entryRuleDrop : ruleDrop EOF ;
    public final void entryRuleDrop() throws RecognitionException {
        try {
            // InternalQueryDsl.g:304:1: ( ruleDrop EOF )
            // InternalQueryDsl.g:305:1: ruleDrop EOF
            {
             before(grammarAccess.getDropRule()); 
            pushFollow(FOLLOW_1);
            ruleDrop();

            state._fsp--;

             after(grammarAccess.getDropRule()); 
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
    // $ANTLR end "entryRuleDrop"


    // $ANTLR start "ruleDrop"
    // InternalQueryDsl.g:312:1: ruleDrop : ( ( rule__Drop__Group__0 ) ) ;
    public final void ruleDrop() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:316:2: ( ( ( rule__Drop__Group__0 ) ) )
            // InternalQueryDsl.g:317:2: ( ( rule__Drop__Group__0 ) )
            {
            // InternalQueryDsl.g:317:2: ( ( rule__Drop__Group__0 ) )
            // InternalQueryDsl.g:318:3: ( rule__Drop__Group__0 )
            {
             before(grammarAccess.getDropAccess().getGroup()); 
            // InternalQueryDsl.g:319:3: ( rule__Drop__Group__0 )
            // InternalQueryDsl.g:319:4: rule__Drop__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getGroup()); 

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
    // $ANTLR end "ruleDrop"


    // $ANTLR start "entryRuleDelete"
    // InternalQueryDsl.g:328:1: entryRuleDelete : ruleDelete EOF ;
    public final void entryRuleDelete() throws RecognitionException {
        try {
            // InternalQueryDsl.g:329:1: ( ruleDelete EOF )
            // InternalQueryDsl.g:330:1: ruleDelete EOF
            {
             before(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            ruleDelete();

            state._fsp--;

             after(grammarAccess.getDeleteRule()); 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalQueryDsl.g:337:1: ruleDelete : ( ( rule__Delete__Group__0 ) ) ;
    public final void ruleDelete() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:341:2: ( ( ( rule__Delete__Group__0 ) ) )
            // InternalQueryDsl.g:342:2: ( ( rule__Delete__Group__0 ) )
            {
            // InternalQueryDsl.g:342:2: ( ( rule__Delete__Group__0 ) )
            // InternalQueryDsl.g:343:3: ( rule__Delete__Group__0 )
            {
             before(grammarAccess.getDeleteAccess().getGroup()); 
            // InternalQueryDsl.g:344:3: ( rule__Delete__Group__0 )
            // InternalQueryDsl.g:344:4: rule__Delete__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getGroup()); 

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleDeleteMedicalRecord"
    // InternalQueryDsl.g:353:1: entryRuleDeleteMedicalRecord : ruleDeleteMedicalRecord EOF ;
    public final void entryRuleDeleteMedicalRecord() throws RecognitionException {
        try {
            // InternalQueryDsl.g:354:1: ( ruleDeleteMedicalRecord EOF )
            // InternalQueryDsl.g:355:1: ruleDeleteMedicalRecord EOF
            {
             before(grammarAccess.getDeleteMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleDeleteMedicalRecord();

            state._fsp--;

             after(grammarAccess.getDeleteMedicalRecordRule()); 
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
    // $ANTLR end "entryRuleDeleteMedicalRecord"


    // $ANTLR start "ruleDeleteMedicalRecord"
    // InternalQueryDsl.g:362:1: ruleDeleteMedicalRecord : ( ( rule__DeleteMedicalRecord__Group__0 ) ) ;
    public final void ruleDeleteMedicalRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:366:2: ( ( ( rule__DeleteMedicalRecord__Group__0 ) ) )
            // InternalQueryDsl.g:367:2: ( ( rule__DeleteMedicalRecord__Group__0 ) )
            {
            // InternalQueryDsl.g:367:2: ( ( rule__DeleteMedicalRecord__Group__0 ) )
            // InternalQueryDsl.g:368:3: ( rule__DeleteMedicalRecord__Group__0 )
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getGroup()); 
            // InternalQueryDsl.g:369:3: ( rule__DeleteMedicalRecord__Group__0 )
            // InternalQueryDsl.g:369:4: rule__DeleteMedicalRecord__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMedicalRecordAccess().getGroup()); 

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
    // $ANTLR end "ruleDeleteMedicalRecord"


    // $ANTLR start "entryRuleDeletePatientMonitoring"
    // InternalQueryDsl.g:378:1: entryRuleDeletePatientMonitoring : ruleDeletePatientMonitoring EOF ;
    public final void entryRuleDeletePatientMonitoring() throws RecognitionException {
        try {
            // InternalQueryDsl.g:379:1: ( ruleDeletePatientMonitoring EOF )
            // InternalQueryDsl.g:380:1: ruleDeletePatientMonitoring EOF
            {
             before(grammarAccess.getDeletePatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            ruleDeletePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getDeletePatientMonitoringRule()); 
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
    // $ANTLR end "entryRuleDeletePatientMonitoring"


    // $ANTLR start "ruleDeletePatientMonitoring"
    // InternalQueryDsl.g:387:1: ruleDeletePatientMonitoring : ( ( rule__DeletePatientMonitoring__Group__0 ) ) ;
    public final void ruleDeletePatientMonitoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:391:2: ( ( ( rule__DeletePatientMonitoring__Group__0 ) ) )
            // InternalQueryDsl.g:392:2: ( ( rule__DeletePatientMonitoring__Group__0 ) )
            {
            // InternalQueryDsl.g:392:2: ( ( rule__DeletePatientMonitoring__Group__0 ) )
            // InternalQueryDsl.g:393:3: ( rule__DeletePatientMonitoring__Group__0 )
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getGroup()); 
            // InternalQueryDsl.g:394:3: ( rule__DeletePatientMonitoring__Group__0 )
            // InternalQueryDsl.g:394:4: rule__DeletePatientMonitoring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeletePatientMonitoringAccess().getGroup()); 

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
    // $ANTLR end "ruleDeletePatientMonitoring"


    // $ANTLR start "entryRuleDeletePrescription"
    // InternalQueryDsl.g:403:1: entryRuleDeletePrescription : ruleDeletePrescription EOF ;
    public final void entryRuleDeletePrescription() throws RecognitionException {
        try {
            // InternalQueryDsl.g:404:1: ( ruleDeletePrescription EOF )
            // InternalQueryDsl.g:405:1: ruleDeletePrescription EOF
            {
             before(grammarAccess.getDeletePrescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDeletePrescription();

            state._fsp--;

             after(grammarAccess.getDeletePrescriptionRule()); 
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
    // $ANTLR end "entryRuleDeletePrescription"


    // $ANTLR start "ruleDeletePrescription"
    // InternalQueryDsl.g:412:1: ruleDeletePrescription : ( ( rule__DeletePrescription__Group__0 ) ) ;
    public final void ruleDeletePrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:416:2: ( ( ( rule__DeletePrescription__Group__0 ) ) )
            // InternalQueryDsl.g:417:2: ( ( rule__DeletePrescription__Group__0 ) )
            {
            // InternalQueryDsl.g:417:2: ( ( rule__DeletePrescription__Group__0 ) )
            // InternalQueryDsl.g:418:3: ( rule__DeletePrescription__Group__0 )
            {
             before(grammarAccess.getDeletePrescriptionAccess().getGroup()); 
            // InternalQueryDsl.g:419:3: ( rule__DeletePrescription__Group__0 )
            // InternalQueryDsl.g:419:4: rule__DeletePrescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeletePrescriptionAccess().getGroup()); 

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
    // $ANTLR end "ruleDeletePrescription"


    // $ANTLR start "entryRuleWhereMedicalRecord"
    // InternalQueryDsl.g:428:1: entryRuleWhereMedicalRecord : ruleWhereMedicalRecord EOF ;
    public final void entryRuleWhereMedicalRecord() throws RecognitionException {
        try {
            // InternalQueryDsl.g:429:1: ( ruleWhereMedicalRecord EOF )
            // InternalQueryDsl.g:430:1: ruleWhereMedicalRecord EOF
            {
             before(grammarAccess.getWhereMedicalRecordRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereMedicalRecord();

            state._fsp--;

             after(grammarAccess.getWhereMedicalRecordRule()); 
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
    // $ANTLR end "entryRuleWhereMedicalRecord"


    // $ANTLR start "ruleWhereMedicalRecord"
    // InternalQueryDsl.g:437:1: ruleWhereMedicalRecord : ( ( rule__WhereMedicalRecord__Alternatives ) ) ;
    public final void ruleWhereMedicalRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:441:2: ( ( ( rule__WhereMedicalRecord__Alternatives ) ) )
            // InternalQueryDsl.g:442:2: ( ( rule__WhereMedicalRecord__Alternatives ) )
            {
            // InternalQueryDsl.g:442:2: ( ( rule__WhereMedicalRecord__Alternatives ) )
            // InternalQueryDsl.g:443:3: ( rule__WhereMedicalRecord__Alternatives )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getAlternatives()); 
            // InternalQueryDsl.g:444:3: ( rule__WhereMedicalRecord__Alternatives )
            // InternalQueryDsl.g:444:4: rule__WhereMedicalRecord__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWhereMedicalRecord"


    // $ANTLR start "entryRuleWherePatientMonitoring"
    // InternalQueryDsl.g:453:1: entryRuleWherePatientMonitoring : ruleWherePatientMonitoring EOF ;
    public final void entryRuleWherePatientMonitoring() throws RecognitionException {
        try {
            // InternalQueryDsl.g:454:1: ( ruleWherePatientMonitoring EOF )
            // InternalQueryDsl.g:455:1: ruleWherePatientMonitoring EOF
            {
             before(grammarAccess.getWherePatientMonitoringRule()); 
            pushFollow(FOLLOW_1);
            ruleWherePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getWherePatientMonitoringRule()); 
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
    // $ANTLR end "entryRuleWherePatientMonitoring"


    // $ANTLR start "ruleWherePatientMonitoring"
    // InternalQueryDsl.g:462:1: ruleWherePatientMonitoring : ( ( rule__WherePatientMonitoring__Alternatives ) ) ;
    public final void ruleWherePatientMonitoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:466:2: ( ( ( rule__WherePatientMonitoring__Alternatives ) ) )
            // InternalQueryDsl.g:467:2: ( ( rule__WherePatientMonitoring__Alternatives ) )
            {
            // InternalQueryDsl.g:467:2: ( ( rule__WherePatientMonitoring__Alternatives ) )
            // InternalQueryDsl.g:468:3: ( rule__WherePatientMonitoring__Alternatives )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getAlternatives()); 
            // InternalQueryDsl.g:469:3: ( rule__WherePatientMonitoring__Alternatives )
            // InternalQueryDsl.g:469:4: rule__WherePatientMonitoring__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWherePatientMonitoring"


    // $ANTLR start "entryRuleWherePrescription"
    // InternalQueryDsl.g:478:1: entryRuleWherePrescription : ruleWherePrescription EOF ;
    public final void entryRuleWherePrescription() throws RecognitionException {
        try {
            // InternalQueryDsl.g:479:1: ( ruleWherePrescription EOF )
            // InternalQueryDsl.g:480:1: ruleWherePrescription EOF
            {
             before(grammarAccess.getWherePrescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleWherePrescription();

            state._fsp--;

             after(grammarAccess.getWherePrescriptionRule()); 
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
    // $ANTLR end "entryRuleWherePrescription"


    // $ANTLR start "ruleWherePrescription"
    // InternalQueryDsl.g:487:1: ruleWherePrescription : ( ( rule__WherePrescription__Alternatives ) ) ;
    public final void ruleWherePrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:491:2: ( ( ( rule__WherePrescription__Alternatives ) ) )
            // InternalQueryDsl.g:492:2: ( ( rule__WherePrescription__Alternatives ) )
            {
            // InternalQueryDsl.g:492:2: ( ( rule__WherePrescription__Alternatives ) )
            // InternalQueryDsl.g:493:3: ( rule__WherePrescription__Alternatives )
            {
             before(grammarAccess.getWherePrescriptionAccess().getAlternatives()); 
            // InternalQueryDsl.g:494:3: ( rule__WherePrescription__Alternatives )
            // InternalQueryDsl.g:494:4: rule__WherePrescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWherePrescription"


    // $ANTLR start "ruleTableName"
    // InternalQueryDsl.g:503:1: ruleTableName : ( ( rule__TableName__Alternatives ) ) ;
    public final void ruleTableName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:507:1: ( ( ( rule__TableName__Alternatives ) ) )
            // InternalQueryDsl.g:508:2: ( ( rule__TableName__Alternatives ) )
            {
            // InternalQueryDsl.g:508:2: ( ( rule__TableName__Alternatives ) )
            // InternalQueryDsl.g:509:3: ( rule__TableName__Alternatives )
            {
             before(grammarAccess.getTableNameAccess().getAlternatives()); 
            // InternalQueryDsl.g:510:3: ( rule__TableName__Alternatives )
            // InternalQueryDsl.g:510:4: rule__TableName__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TableName__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTableNameAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTableName"


    // $ANTLR start "ruleVariableMedicalRecord"
    // InternalQueryDsl.g:519:1: ruleVariableMedicalRecord : ( ( rule__VariableMedicalRecord__Alternatives ) ) ;
    public final void ruleVariableMedicalRecord() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:523:1: ( ( ( rule__VariableMedicalRecord__Alternatives ) ) )
            // InternalQueryDsl.g:524:2: ( ( rule__VariableMedicalRecord__Alternatives ) )
            {
            // InternalQueryDsl.g:524:2: ( ( rule__VariableMedicalRecord__Alternatives ) )
            // InternalQueryDsl.g:525:3: ( rule__VariableMedicalRecord__Alternatives )
            {
             before(grammarAccess.getVariableMedicalRecordAccess().getAlternatives()); 
            // InternalQueryDsl.g:526:3: ( rule__VariableMedicalRecord__Alternatives )
            // InternalQueryDsl.g:526:4: rule__VariableMedicalRecord__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableMedicalRecord__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableMedicalRecordAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableMedicalRecord"


    // $ANTLR start "ruleVariablePatientMonitoring"
    // InternalQueryDsl.g:535:1: ruleVariablePatientMonitoring : ( ( rule__VariablePatientMonitoring__Alternatives ) ) ;
    public final void ruleVariablePatientMonitoring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:539:1: ( ( ( rule__VariablePatientMonitoring__Alternatives ) ) )
            // InternalQueryDsl.g:540:2: ( ( rule__VariablePatientMonitoring__Alternatives ) )
            {
            // InternalQueryDsl.g:540:2: ( ( rule__VariablePatientMonitoring__Alternatives ) )
            // InternalQueryDsl.g:541:3: ( rule__VariablePatientMonitoring__Alternatives )
            {
             before(grammarAccess.getVariablePatientMonitoringAccess().getAlternatives()); 
            // InternalQueryDsl.g:542:3: ( rule__VariablePatientMonitoring__Alternatives )
            // InternalQueryDsl.g:542:4: rule__VariablePatientMonitoring__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariablePatientMonitoring__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariablePatientMonitoringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariablePatientMonitoring"


    // $ANTLR start "ruleVariablePrescription"
    // InternalQueryDsl.g:551:1: ruleVariablePrescription : ( ( rule__VariablePrescription__Alternatives ) ) ;
    public final void ruleVariablePrescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:555:1: ( ( ( rule__VariablePrescription__Alternatives ) ) )
            // InternalQueryDsl.g:556:2: ( ( rule__VariablePrescription__Alternatives ) )
            {
            // InternalQueryDsl.g:556:2: ( ( rule__VariablePrescription__Alternatives ) )
            // InternalQueryDsl.g:557:3: ( rule__VariablePrescription__Alternatives )
            {
             before(grammarAccess.getVariablePrescriptionAccess().getAlternatives()); 
            // InternalQueryDsl.g:558:3: ( rule__VariablePrescription__Alternatives )
            // InternalQueryDsl.g:558:4: rule__VariablePrescription__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariablePrescription__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariablePrescriptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariablePrescription"


    // $ANTLR start "ruleMedicalCondition"
    // InternalQueryDsl.g:567:1: ruleMedicalCondition : ( ( rule__MedicalCondition__Alternatives ) ) ;
    public final void ruleMedicalCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:571:1: ( ( ( rule__MedicalCondition__Alternatives ) ) )
            // InternalQueryDsl.g:572:2: ( ( rule__MedicalCondition__Alternatives ) )
            {
            // InternalQueryDsl.g:572:2: ( ( rule__MedicalCondition__Alternatives ) )
            // InternalQueryDsl.g:573:3: ( rule__MedicalCondition__Alternatives )
            {
             before(grammarAccess.getMedicalConditionAccess().getAlternatives()); 
            // InternalQueryDsl.g:574:3: ( rule__MedicalCondition__Alternatives )
            // InternalQueryDsl.g:574:4: rule__MedicalCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MedicalCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMedicalConditionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMedicalCondition"


    // $ANTLR start "ruleRiskPerception"
    // InternalQueryDsl.g:583:1: ruleRiskPerception : ( ( rule__RiskPerception__Alternatives ) ) ;
    public final void ruleRiskPerception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:587:1: ( ( ( rule__RiskPerception__Alternatives ) ) )
            // InternalQueryDsl.g:588:2: ( ( rule__RiskPerception__Alternatives ) )
            {
            // InternalQueryDsl.g:588:2: ( ( rule__RiskPerception__Alternatives ) )
            // InternalQueryDsl.g:589:3: ( rule__RiskPerception__Alternatives )
            {
             before(grammarAccess.getRiskPerceptionAccess().getAlternatives()); 
            // InternalQueryDsl.g:590:3: ( rule__RiskPerception__Alternatives )
            // InternalQueryDsl.g:590:4: rule__RiskPerception__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RiskPerception__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRiskPerceptionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRiskPerception"


    // $ANTLR start "rule__QueryType__Alternatives"
    // InternalQueryDsl.g:598:1: rule__QueryType__Alternatives : ( ( ruleSelect ) | ( ruleInsert ) | ( ruleDrop ) | ( ruleDelete ) );
    public final void rule__QueryType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:602:1: ( ( ruleSelect ) | ( ruleInsert ) | ( ruleDrop ) | ( ruleDelete ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 54:
                {
                alt2=3;
                }
                break;
            case 56:
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
                    // InternalQueryDsl.g:603:2: ( ruleSelect )
                    {
                    // InternalQueryDsl.g:603:2: ( ruleSelect )
                    // InternalQueryDsl.g:604:3: ruleSelect
                    {
                     before(grammarAccess.getQueryTypeAccess().getSelectParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelect();

                    state._fsp--;

                     after(grammarAccess.getQueryTypeAccess().getSelectParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:609:2: ( ruleInsert )
                    {
                    // InternalQueryDsl.g:609:2: ( ruleInsert )
                    // InternalQueryDsl.g:610:3: ruleInsert
                    {
                     before(grammarAccess.getQueryTypeAccess().getInsertParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsert();

                    state._fsp--;

                     after(grammarAccess.getQueryTypeAccess().getInsertParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:615:2: ( ruleDrop )
                    {
                    // InternalQueryDsl.g:615:2: ( ruleDrop )
                    // InternalQueryDsl.g:616:3: ruleDrop
                    {
                     before(grammarAccess.getQueryTypeAccess().getDropParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDrop();

                    state._fsp--;

                     after(grammarAccess.getQueryTypeAccess().getDropParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:621:2: ( ruleDelete )
                    {
                    // InternalQueryDsl.g:621:2: ( ruleDelete )
                    // InternalQueryDsl.g:622:3: ruleDelete
                    {
                     before(grammarAccess.getQueryTypeAccess().getDeleteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDelete();

                    state._fsp--;

                     after(grammarAccess.getQueryTypeAccess().getDeleteParserRuleCall_3()); 

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
    // $ANTLR end "rule__QueryType__Alternatives"


    // $ANTLR start "rule__Select__Alternatives_1"
    // InternalQueryDsl.g:631:1: rule__Select__Alternatives_1 : ( ( ruleSelectMedicalRecord ) | ( ruleSelectPatientMonitoring ) | ( ruleSelectPrescription ) );
    public final void rule__Select__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:635:1: ( ( ruleSelectMedicalRecord ) | ( ruleSelectPatientMonitoring ) | ( ruleSelectPrescription ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:636:2: ( ruleSelectMedicalRecord )
                    {
                    // InternalQueryDsl.g:636:2: ( ruleSelectMedicalRecord )
                    // InternalQueryDsl.g:637:3: ruleSelectMedicalRecord
                    {
                     before(grammarAccess.getSelectAccess().getSelectMedicalRecordParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectMedicalRecord();

                    state._fsp--;

                     after(grammarAccess.getSelectAccess().getSelectMedicalRecordParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:642:2: ( ruleSelectPatientMonitoring )
                    {
                    // InternalQueryDsl.g:642:2: ( ruleSelectPatientMonitoring )
                    // InternalQueryDsl.g:643:3: ruleSelectPatientMonitoring
                    {
                     before(grammarAccess.getSelectAccess().getSelectPatientMonitoringParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectPatientMonitoring();

                    state._fsp--;

                     after(grammarAccess.getSelectAccess().getSelectPatientMonitoringParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:648:2: ( ruleSelectPrescription )
                    {
                    // InternalQueryDsl.g:648:2: ( ruleSelectPrescription )
                    // InternalQueryDsl.g:649:3: ruleSelectPrescription
                    {
                     before(grammarAccess.getSelectAccess().getSelectPrescriptionParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectPrescription();

                    state._fsp--;

                     after(grammarAccess.getSelectAccess().getSelectPrescriptionParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__Select__Alternatives_1"


    // $ANTLR start "rule__Insert__Alternatives_2"
    // InternalQueryDsl.g:658:1: rule__Insert__Alternatives_2 : ( ( ruleInsertMedicalRecord ) | ( ruleInsertPatientMonitoring ) | ( ruleInsertPrescription ) );
    public final void rule__Insert__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:662:1: ( ( ruleInsertMedicalRecord ) | ( ruleInsertPatientMonitoring ) | ( ruleInsertPrescription ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalQueryDsl.g:663:2: ( ruleInsertMedicalRecord )
                    {
                    // InternalQueryDsl.g:663:2: ( ruleInsertMedicalRecord )
                    // InternalQueryDsl.g:664:3: ruleInsertMedicalRecord
                    {
                     before(grammarAccess.getInsertAccess().getInsertMedicalRecordParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertMedicalRecord();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getInsertMedicalRecordParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:669:2: ( ruleInsertPatientMonitoring )
                    {
                    // InternalQueryDsl.g:669:2: ( ruleInsertPatientMonitoring )
                    // InternalQueryDsl.g:670:3: ruleInsertPatientMonitoring
                    {
                     before(grammarAccess.getInsertAccess().getInsertPatientMonitoringParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertPatientMonitoring();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getInsertPatientMonitoringParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:675:2: ( ruleInsertPrescription )
                    {
                    // InternalQueryDsl.g:675:2: ( ruleInsertPrescription )
                    // InternalQueryDsl.g:676:3: ruleInsertPrescription
                    {
                     before(grammarAccess.getInsertAccess().getInsertPrescriptionParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInsertPrescription();

                    state._fsp--;

                     after(grammarAccess.getInsertAccess().getInsertPrescriptionParserRuleCall_2_2()); 

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
    // $ANTLR end "rule__Insert__Alternatives_2"


    // $ANTLR start "rule__Delete__Alternatives_2"
    // InternalQueryDsl.g:685:1: rule__Delete__Alternatives_2 : ( ( ruleDeleteMedicalRecord ) | ( ruleDeletePatientMonitoring ) | ( ruleDeletePrescription ) );
    public final void rule__Delete__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:689:1: ( ( ruleDeleteMedicalRecord ) | ( ruleDeletePatientMonitoring ) | ( ruleDeletePrescription ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalQueryDsl.g:690:2: ( ruleDeleteMedicalRecord )
                    {
                    // InternalQueryDsl.g:690:2: ( ruleDeleteMedicalRecord )
                    // InternalQueryDsl.g:691:3: ruleDeleteMedicalRecord
                    {
                     before(grammarAccess.getDeleteAccess().getDeleteMedicalRecordParserRuleCall_2_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDeleteMedicalRecord();

                    state._fsp--;

                     after(grammarAccess.getDeleteAccess().getDeleteMedicalRecordParserRuleCall_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:696:2: ( ruleDeletePatientMonitoring )
                    {
                    // InternalQueryDsl.g:696:2: ( ruleDeletePatientMonitoring )
                    // InternalQueryDsl.g:697:3: ruleDeletePatientMonitoring
                    {
                     before(grammarAccess.getDeleteAccess().getDeletePatientMonitoringParserRuleCall_2_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletePatientMonitoring();

                    state._fsp--;

                     after(grammarAccess.getDeleteAccess().getDeletePatientMonitoringParserRuleCall_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:702:2: ( ruleDeletePrescription )
                    {
                    // InternalQueryDsl.g:702:2: ( ruleDeletePrescription )
                    // InternalQueryDsl.g:703:3: ruleDeletePrescription
                    {
                     before(grammarAccess.getDeleteAccess().getDeletePrescriptionParserRuleCall_2_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDeletePrescription();

                    state._fsp--;

                     after(grammarAccess.getDeleteAccess().getDeletePrescriptionParserRuleCall_2_2()); 

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
    // $ANTLR end "rule__Delete__Alternatives_2"


    // $ANTLR start "rule__WhereMedicalRecord__Alternatives"
    // InternalQueryDsl.g:712:1: rule__WhereMedicalRecord__Alternatives : ( ( ( rule__WhereMedicalRecord__Group_0__0 ) ) | ( ( rule__WhereMedicalRecord__Group_1__0 ) ) | ( ( rule__WhereMedicalRecord__Group_2__0 ) ) | ( ( rule__WhereMedicalRecord__Group_3__0 ) ) | ( ( rule__WhereMedicalRecord__Group_4__0 ) ) | ( ( rule__WhereMedicalRecord__Group_5__0 ) ) | ( ( rule__WhereMedicalRecord__Group_6__0 ) ) );
    public final void rule__WhereMedicalRecord__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:716:1: ( ( ( rule__WhereMedicalRecord__Group_0__0 ) ) | ( ( rule__WhereMedicalRecord__Group_1__0 ) ) | ( ( rule__WhereMedicalRecord__Group_2__0 ) ) | ( ( rule__WhereMedicalRecord__Group_3__0 ) ) | ( ( rule__WhereMedicalRecord__Group_4__0 ) ) | ( ( rule__WhereMedicalRecord__Group_5__0 ) ) | ( ( rule__WhereMedicalRecord__Group_6__0 ) ) )
            int alt6=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 21:
                {
                alt6=2;
                }
                break;
            case 22:
                {
                alt6=3;
                }
                break;
            case 23:
                {
                alt6=4;
                }
                break;
            case 24:
                {
                alt6=5;
                }
                break;
            case 25:
                {
                alt6=6;
                }
                break;
            case 26:
                {
                alt6=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalQueryDsl.g:717:2: ( ( rule__WhereMedicalRecord__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:717:2: ( ( rule__WhereMedicalRecord__Group_0__0 ) )
                    // InternalQueryDsl.g:718:3: ( rule__WhereMedicalRecord__Group_0__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_0()); 
                    // InternalQueryDsl.g:719:3: ( rule__WhereMedicalRecord__Group_0__0 )
                    // InternalQueryDsl.g:719:4: rule__WhereMedicalRecord__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:723:2: ( ( rule__WhereMedicalRecord__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:723:2: ( ( rule__WhereMedicalRecord__Group_1__0 ) )
                    // InternalQueryDsl.g:724:3: ( rule__WhereMedicalRecord__Group_1__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_1()); 
                    // InternalQueryDsl.g:725:3: ( rule__WhereMedicalRecord__Group_1__0 )
                    // InternalQueryDsl.g:725:4: rule__WhereMedicalRecord__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:729:2: ( ( rule__WhereMedicalRecord__Group_2__0 ) )
                    {
                    // InternalQueryDsl.g:729:2: ( ( rule__WhereMedicalRecord__Group_2__0 ) )
                    // InternalQueryDsl.g:730:3: ( rule__WhereMedicalRecord__Group_2__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_2()); 
                    // InternalQueryDsl.g:731:3: ( rule__WhereMedicalRecord__Group_2__0 )
                    // InternalQueryDsl.g:731:4: rule__WhereMedicalRecord__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:735:2: ( ( rule__WhereMedicalRecord__Group_3__0 ) )
                    {
                    // InternalQueryDsl.g:735:2: ( ( rule__WhereMedicalRecord__Group_3__0 ) )
                    // InternalQueryDsl.g:736:3: ( rule__WhereMedicalRecord__Group_3__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_3()); 
                    // InternalQueryDsl.g:737:3: ( rule__WhereMedicalRecord__Group_3__0 )
                    // InternalQueryDsl.g:737:4: rule__WhereMedicalRecord__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:741:2: ( ( rule__WhereMedicalRecord__Group_4__0 ) )
                    {
                    // InternalQueryDsl.g:741:2: ( ( rule__WhereMedicalRecord__Group_4__0 ) )
                    // InternalQueryDsl.g:742:3: ( rule__WhereMedicalRecord__Group_4__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_4()); 
                    // InternalQueryDsl.g:743:3: ( rule__WhereMedicalRecord__Group_4__0 )
                    // InternalQueryDsl.g:743:4: rule__WhereMedicalRecord__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:747:2: ( ( rule__WhereMedicalRecord__Group_5__0 ) )
                    {
                    // InternalQueryDsl.g:747:2: ( ( rule__WhereMedicalRecord__Group_5__0 ) )
                    // InternalQueryDsl.g:748:3: ( rule__WhereMedicalRecord__Group_5__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_5()); 
                    // InternalQueryDsl.g:749:3: ( rule__WhereMedicalRecord__Group_5__0 )
                    // InternalQueryDsl.g:749:4: rule__WhereMedicalRecord__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:753:2: ( ( rule__WhereMedicalRecord__Group_6__0 ) )
                    {
                    // InternalQueryDsl.g:753:2: ( ( rule__WhereMedicalRecord__Group_6__0 ) )
                    // InternalQueryDsl.g:754:3: ( rule__WhereMedicalRecord__Group_6__0 )
                    {
                     before(grammarAccess.getWhereMedicalRecordAccess().getGroup_6()); 
                    // InternalQueryDsl.g:755:3: ( rule__WhereMedicalRecord__Group_6__0 )
                    // InternalQueryDsl.g:755:4: rule__WhereMedicalRecord__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereMedicalRecord__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWhereMedicalRecordAccess().getGroup_6()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Alternatives"


    // $ANTLR start "rule__WherePatientMonitoring__Alternatives"
    // InternalQueryDsl.g:763:1: rule__WherePatientMonitoring__Alternatives : ( ( ( rule__WherePatientMonitoring__Group_0__0 ) ) | ( ( rule__WherePatientMonitoring__Group_1__0 ) ) | ( ( rule__WherePatientMonitoring__Group_2__0 ) ) | ( ( rule__WherePatientMonitoring__Group_3__0 ) ) | ( ( rule__WherePatientMonitoring__Group_4__0 ) ) | ( ( rule__WherePatientMonitoring__Group_5__0 ) ) | ( ( rule__WherePatientMonitoring__Group_6__0 ) ) );
    public final void rule__WherePatientMonitoring__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:767:1: ( ( ( rule__WherePatientMonitoring__Group_0__0 ) ) | ( ( rule__WherePatientMonitoring__Group_1__0 ) ) | ( ( rule__WherePatientMonitoring__Group_2__0 ) ) | ( ( rule__WherePatientMonitoring__Group_3__0 ) ) | ( ( rule__WherePatientMonitoring__Group_4__0 ) ) | ( ( rule__WherePatientMonitoring__Group_5__0 ) ) | ( ( rule__WherePatientMonitoring__Group_6__0 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 28:
                {
                alt7=3;
                }
                break;
            case 24:
                {
                alt7=4;
                }
                break;
            case 29:
                {
                alt7=5;
                }
                break;
            case 30:
                {
                alt7=6;
                }
                break;
            case 31:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalQueryDsl.g:768:2: ( ( rule__WherePatientMonitoring__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:768:2: ( ( rule__WherePatientMonitoring__Group_0__0 ) )
                    // InternalQueryDsl.g:769:3: ( rule__WherePatientMonitoring__Group_0__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_0()); 
                    // InternalQueryDsl.g:770:3: ( rule__WherePatientMonitoring__Group_0__0 )
                    // InternalQueryDsl.g:770:4: rule__WherePatientMonitoring__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:774:2: ( ( rule__WherePatientMonitoring__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:774:2: ( ( rule__WherePatientMonitoring__Group_1__0 ) )
                    // InternalQueryDsl.g:775:3: ( rule__WherePatientMonitoring__Group_1__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_1()); 
                    // InternalQueryDsl.g:776:3: ( rule__WherePatientMonitoring__Group_1__0 )
                    // InternalQueryDsl.g:776:4: rule__WherePatientMonitoring__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:780:2: ( ( rule__WherePatientMonitoring__Group_2__0 ) )
                    {
                    // InternalQueryDsl.g:780:2: ( ( rule__WherePatientMonitoring__Group_2__0 ) )
                    // InternalQueryDsl.g:781:3: ( rule__WherePatientMonitoring__Group_2__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_2()); 
                    // InternalQueryDsl.g:782:3: ( rule__WherePatientMonitoring__Group_2__0 )
                    // InternalQueryDsl.g:782:4: rule__WherePatientMonitoring__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:786:2: ( ( rule__WherePatientMonitoring__Group_3__0 ) )
                    {
                    // InternalQueryDsl.g:786:2: ( ( rule__WherePatientMonitoring__Group_3__0 ) )
                    // InternalQueryDsl.g:787:3: ( rule__WherePatientMonitoring__Group_3__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_3()); 
                    // InternalQueryDsl.g:788:3: ( rule__WherePatientMonitoring__Group_3__0 )
                    // InternalQueryDsl.g:788:4: rule__WherePatientMonitoring__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:792:2: ( ( rule__WherePatientMonitoring__Group_4__0 ) )
                    {
                    // InternalQueryDsl.g:792:2: ( ( rule__WherePatientMonitoring__Group_4__0 ) )
                    // InternalQueryDsl.g:793:3: ( rule__WherePatientMonitoring__Group_4__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_4()); 
                    // InternalQueryDsl.g:794:3: ( rule__WherePatientMonitoring__Group_4__0 )
                    // InternalQueryDsl.g:794:4: rule__WherePatientMonitoring__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:798:2: ( ( rule__WherePatientMonitoring__Group_5__0 ) )
                    {
                    // InternalQueryDsl.g:798:2: ( ( rule__WherePatientMonitoring__Group_5__0 ) )
                    // InternalQueryDsl.g:799:3: ( rule__WherePatientMonitoring__Group_5__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_5()); 
                    // InternalQueryDsl.g:800:3: ( rule__WherePatientMonitoring__Group_5__0 )
                    // InternalQueryDsl.g:800:4: rule__WherePatientMonitoring__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:804:2: ( ( rule__WherePatientMonitoring__Group_6__0 ) )
                    {
                    // InternalQueryDsl.g:804:2: ( ( rule__WherePatientMonitoring__Group_6__0 ) )
                    // InternalQueryDsl.g:805:3: ( rule__WherePatientMonitoring__Group_6__0 )
                    {
                     before(grammarAccess.getWherePatientMonitoringAccess().getGroup_6()); 
                    // InternalQueryDsl.g:806:3: ( rule__WherePatientMonitoring__Group_6__0 )
                    // InternalQueryDsl.g:806:4: rule__WherePatientMonitoring__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePatientMonitoring__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePatientMonitoringAccess().getGroup_6()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Alternatives"


    // $ANTLR start "rule__WherePrescription__Alternatives"
    // InternalQueryDsl.g:814:1: rule__WherePrescription__Alternatives : ( ( ( rule__WherePrescription__Group_0__0 ) ) | ( ( rule__WherePrescription__Group_1__0 ) ) | ( ( rule__WherePrescription__Group_2__0 ) ) | ( ( rule__WherePrescription__Group_3__0 ) ) | ( ( rule__WherePrescription__Group_4__0 ) ) | ( ( rule__WherePrescription__Group_5__0 ) ) | ( ( rule__WherePrescription__Group_6__0 ) ) );
    public final void rule__WherePrescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:818:1: ( ( ( rule__WherePrescription__Group_0__0 ) ) | ( ( rule__WherePrescription__Group_1__0 ) ) | ( ( rule__WherePrescription__Group_2__0 ) ) | ( ( rule__WherePrescription__Group_3__0 ) ) | ( ( rule__WherePrescription__Group_4__0 ) ) | ( ( rule__WherePrescription__Group_5__0 ) ) | ( ( rule__WherePrescription__Group_6__0 ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 33:
                {
                alt8=3;
                }
                break;
            case 34:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            case 36:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalQueryDsl.g:819:2: ( ( rule__WherePrescription__Group_0__0 ) )
                    {
                    // InternalQueryDsl.g:819:2: ( ( rule__WherePrescription__Group_0__0 ) )
                    // InternalQueryDsl.g:820:3: ( rule__WherePrescription__Group_0__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_0()); 
                    // InternalQueryDsl.g:821:3: ( rule__WherePrescription__Group_0__0 )
                    // InternalQueryDsl.g:821:4: rule__WherePrescription__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:825:2: ( ( rule__WherePrescription__Group_1__0 ) )
                    {
                    // InternalQueryDsl.g:825:2: ( ( rule__WherePrescription__Group_1__0 ) )
                    // InternalQueryDsl.g:826:3: ( rule__WherePrescription__Group_1__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_1()); 
                    // InternalQueryDsl.g:827:3: ( rule__WherePrescription__Group_1__0 )
                    // InternalQueryDsl.g:827:4: rule__WherePrescription__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:831:2: ( ( rule__WherePrescription__Group_2__0 ) )
                    {
                    // InternalQueryDsl.g:831:2: ( ( rule__WherePrescription__Group_2__0 ) )
                    // InternalQueryDsl.g:832:3: ( rule__WherePrescription__Group_2__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_2()); 
                    // InternalQueryDsl.g:833:3: ( rule__WherePrescription__Group_2__0 )
                    // InternalQueryDsl.g:833:4: rule__WherePrescription__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:837:2: ( ( rule__WherePrescription__Group_3__0 ) )
                    {
                    // InternalQueryDsl.g:837:2: ( ( rule__WherePrescription__Group_3__0 ) )
                    // InternalQueryDsl.g:838:3: ( rule__WherePrescription__Group_3__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_3()); 
                    // InternalQueryDsl.g:839:3: ( rule__WherePrescription__Group_3__0 )
                    // InternalQueryDsl.g:839:4: rule__WherePrescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:843:2: ( ( rule__WherePrescription__Group_4__0 ) )
                    {
                    // InternalQueryDsl.g:843:2: ( ( rule__WherePrescription__Group_4__0 ) )
                    // InternalQueryDsl.g:844:3: ( rule__WherePrescription__Group_4__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_4()); 
                    // InternalQueryDsl.g:845:3: ( rule__WherePrescription__Group_4__0 )
                    // InternalQueryDsl.g:845:4: rule__WherePrescription__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:849:2: ( ( rule__WherePrescription__Group_5__0 ) )
                    {
                    // InternalQueryDsl.g:849:2: ( ( rule__WherePrescription__Group_5__0 ) )
                    // InternalQueryDsl.g:850:3: ( rule__WherePrescription__Group_5__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_5()); 
                    // InternalQueryDsl.g:851:3: ( rule__WherePrescription__Group_5__0 )
                    // InternalQueryDsl.g:851:4: rule__WherePrescription__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:855:2: ( ( rule__WherePrescription__Group_6__0 ) )
                    {
                    // InternalQueryDsl.g:855:2: ( ( rule__WherePrescription__Group_6__0 ) )
                    // InternalQueryDsl.g:856:3: ( rule__WherePrescription__Group_6__0 )
                    {
                     before(grammarAccess.getWherePrescriptionAccess().getGroup_6()); 
                    // InternalQueryDsl.g:857:3: ( rule__WherePrescription__Group_6__0 )
                    // InternalQueryDsl.g:857:4: rule__WherePrescription__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WherePrescription__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWherePrescriptionAccess().getGroup_6()); 

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
    // $ANTLR end "rule__WherePrescription__Alternatives"


    // $ANTLR start "rule__TableName__Alternatives"
    // InternalQueryDsl.g:865:1: rule__TableName__Alternatives : ( ( ( 'MedicalRecord' ) ) | ( ( 'PatientMonitoring' ) ) | ( ( 'Prescription' ) ) );
    public final void rule__TableName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:869:1: ( ( ( 'MedicalRecord' ) ) | ( ( 'PatientMonitoring' ) ) | ( ( 'Prescription' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:870:2: ( ( 'MedicalRecord' ) )
                    {
                    // InternalQueryDsl.g:870:2: ( ( 'MedicalRecord' ) )
                    // InternalQueryDsl.g:871:3: ( 'MedicalRecord' )
                    {
                     before(grammarAccess.getTableNameAccess().getMedicalRecordEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:872:3: ( 'MedicalRecord' )
                    // InternalQueryDsl.g:872:4: 'MedicalRecord'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTableNameAccess().getMedicalRecordEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:876:2: ( ( 'PatientMonitoring' ) )
                    {
                    // InternalQueryDsl.g:876:2: ( ( 'PatientMonitoring' ) )
                    // InternalQueryDsl.g:877:3: ( 'PatientMonitoring' )
                    {
                     before(grammarAccess.getTableNameAccess().getPatientMonitoringEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:878:3: ( 'PatientMonitoring' )
                    // InternalQueryDsl.g:878:4: 'PatientMonitoring'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTableNameAccess().getPatientMonitoringEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:882:2: ( ( 'Prescription' ) )
                    {
                    // InternalQueryDsl.g:882:2: ( ( 'Prescription' ) )
                    // InternalQueryDsl.g:883:3: ( 'Prescription' )
                    {
                     before(grammarAccess.getTableNameAccess().getPrescriptionEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:884:3: ( 'Prescription' )
                    // InternalQueryDsl.g:884:4: 'Prescription'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTableNameAccess().getPrescriptionEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TableName__Alternatives"


    // $ANTLR start "rule__VariableMedicalRecord__Alternatives"
    // InternalQueryDsl.g:892:1: rule__VariableMedicalRecord__Alternatives : ( ( ( 'recordId' ) ) | ( ( 'patientId' ) ) | ( ( 'doctorId' ) ) | ( ( 'medicalCondition' ) ) | ( ( 'date' ) ) | ( ( 'price' ) ) | ( ( 'description' ) ) );
    public final void rule__VariableMedicalRecord__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:896:1: ( ( ( 'recordId' ) ) | ( ( 'patientId' ) ) | ( ( 'doctorId' ) ) | ( ( 'medicalCondition' ) ) | ( ( 'date' ) ) | ( ( 'price' ) ) | ( ( 'description' ) ) )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            case 23:
                {
                alt10=4;
                }
                break;
            case 24:
                {
                alt10=5;
                }
                break;
            case 25:
                {
                alt10=6;
                }
                break;
            case 26:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalQueryDsl.g:897:2: ( ( 'recordId' ) )
                    {
                    // InternalQueryDsl.g:897:2: ( ( 'recordId' ) )
                    // InternalQueryDsl.g:898:3: ( 'recordId' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getRecordIdEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:899:3: ( 'recordId' )
                    // InternalQueryDsl.g:899:4: 'recordId'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getRecordIdEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:903:2: ( ( 'patientId' ) )
                    {
                    // InternalQueryDsl.g:903:2: ( ( 'patientId' ) )
                    // InternalQueryDsl.g:904:3: ( 'patientId' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getPatientIdEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:905:3: ( 'patientId' )
                    // InternalQueryDsl.g:905:4: 'patientId'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getPatientIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:909:2: ( ( 'doctorId' ) )
                    {
                    // InternalQueryDsl.g:909:2: ( ( 'doctorId' ) )
                    // InternalQueryDsl.g:910:3: ( 'doctorId' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getDoctorIdEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:911:3: ( 'doctorId' )
                    // InternalQueryDsl.g:911:4: 'doctorId'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getDoctorIdEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:915:2: ( ( 'medicalCondition' ) )
                    {
                    // InternalQueryDsl.g:915:2: ( ( 'medicalCondition' ) )
                    // InternalQueryDsl.g:916:3: ( 'medicalCondition' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getMedicalConditionEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:917:3: ( 'medicalCondition' )
                    // InternalQueryDsl.g:917:4: 'medicalCondition'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getMedicalConditionEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:921:2: ( ( 'date' ) )
                    {
                    // InternalQueryDsl.g:921:2: ( ( 'date' ) )
                    // InternalQueryDsl.g:922:3: ( 'date' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getDateEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:923:3: ( 'date' )
                    // InternalQueryDsl.g:923:4: 'date'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getDateEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:927:2: ( ( 'price' ) )
                    {
                    // InternalQueryDsl.g:927:2: ( ( 'price' ) )
                    // InternalQueryDsl.g:928:3: ( 'price' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getPriceEnumLiteralDeclaration_5()); 
                    // InternalQueryDsl.g:929:3: ( 'price' )
                    // InternalQueryDsl.g:929:4: 'price'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getPriceEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:933:2: ( ( 'description' ) )
                    {
                    // InternalQueryDsl.g:933:2: ( ( 'description' ) )
                    // InternalQueryDsl.g:934:3: ( 'description' )
                    {
                     before(grammarAccess.getVariableMedicalRecordAccess().getDescriptionEnumLiteralDeclaration_6()); 
                    // InternalQueryDsl.g:935:3: ( 'description' )
                    // InternalQueryDsl.g:935:4: 'description'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariableMedicalRecordAccess().getDescriptionEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__VariableMedicalRecord__Alternatives"


    // $ANTLR start "rule__VariablePatientMonitoring__Alternatives"
    // InternalQueryDsl.g:943:1: rule__VariablePatientMonitoring__Alternatives : ( ( ( 'monitoringId' ) ) | ( ( 'patientId' ) ) | ( ( 'category' ) ) | ( ( 'date' ) ) | ( ( 'riskPerception' ) ) | ( ( 'treated' ) ) | ( ( 'deviceId' ) ) );
    public final void rule__VariablePatientMonitoring__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:947:1: ( ( ( 'monitoringId' ) ) | ( ( 'patientId' ) ) | ( ( 'category' ) ) | ( ( 'date' ) ) | ( ( 'riskPerception' ) ) | ( ( 'treated' ) ) | ( ( 'deviceId' ) ) )
            int alt11=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 21:
                {
                alt11=2;
                }
                break;
            case 28:
                {
                alt11=3;
                }
                break;
            case 24:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 30:
                {
                alt11=6;
                }
                break;
            case 31:
                {
                alt11=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalQueryDsl.g:948:2: ( ( 'monitoringId' ) )
                    {
                    // InternalQueryDsl.g:948:2: ( ( 'monitoringId' ) )
                    // InternalQueryDsl.g:949:3: ( 'monitoringId' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getMonitoringIdEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:950:3: ( 'monitoringId' )
                    // InternalQueryDsl.g:950:4: 'monitoringId'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getMonitoringIdEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:954:2: ( ( 'patientId' ) )
                    {
                    // InternalQueryDsl.g:954:2: ( ( 'patientId' ) )
                    // InternalQueryDsl.g:955:3: ( 'patientId' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getPatientIdEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:956:3: ( 'patientId' )
                    // InternalQueryDsl.g:956:4: 'patientId'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getPatientIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:960:2: ( ( 'category' ) )
                    {
                    // InternalQueryDsl.g:960:2: ( ( 'category' ) )
                    // InternalQueryDsl.g:961:3: ( 'category' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getCategoryEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:962:3: ( 'category' )
                    // InternalQueryDsl.g:962:4: 'category'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getCategoryEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:966:2: ( ( 'date' ) )
                    {
                    // InternalQueryDsl.g:966:2: ( ( 'date' ) )
                    // InternalQueryDsl.g:967:3: ( 'date' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getDateEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:968:3: ( 'date' )
                    // InternalQueryDsl.g:968:4: 'date'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getDateEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:972:2: ( ( 'riskPerception' ) )
                    {
                    // InternalQueryDsl.g:972:2: ( ( 'riskPerception' ) )
                    // InternalQueryDsl.g:973:3: ( 'riskPerception' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getRiskPerceptionEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:974:3: ( 'riskPerception' )
                    // InternalQueryDsl.g:974:4: 'riskPerception'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getRiskPerceptionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:978:2: ( ( 'treated' ) )
                    {
                    // InternalQueryDsl.g:978:2: ( ( 'treated' ) )
                    // InternalQueryDsl.g:979:3: ( 'treated' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getTreatedEnumLiteralDeclaration_5()); 
                    // InternalQueryDsl.g:980:3: ( 'treated' )
                    // InternalQueryDsl.g:980:4: 'treated'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getTreatedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:984:2: ( ( 'deviceId' ) )
                    {
                    // InternalQueryDsl.g:984:2: ( ( 'deviceId' ) )
                    // InternalQueryDsl.g:985:3: ( 'deviceId' )
                    {
                     before(grammarAccess.getVariablePatientMonitoringAccess().getDeviceIdEnumLiteralDeclaration_6()); 
                    // InternalQueryDsl.g:986:3: ( 'deviceId' )
                    // InternalQueryDsl.g:986:4: 'deviceId'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePatientMonitoringAccess().getDeviceIdEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__VariablePatientMonitoring__Alternatives"


    // $ANTLR start "rule__VariablePrescription__Alternatives"
    // InternalQueryDsl.g:994:1: rule__VariablePrescription__Alternatives : ( ( ( 'prescriptionId' ) ) | ( ( 'recordId' ) ) | ( ( 'medicationName' ) ) | ( ( 'start' ) ) | ( ( 'end' ) ) | ( ( 'ordered' ) ) | ( ( 'price' ) ) );
    public final void rule__VariablePrescription__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:998:1: ( ( ( 'prescriptionId' ) ) | ( ( 'recordId' ) ) | ( ( 'medicationName' ) ) | ( ( 'start' ) ) | ( ( 'end' ) ) | ( ( 'ordered' ) ) | ( ( 'price' ) ) )
            int alt12=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt12=1;
                }
                break;
            case 20:
                {
                alt12=2;
                }
                break;
            case 33:
                {
                alt12=3;
                }
                break;
            case 34:
                {
                alt12=4;
                }
                break;
            case 35:
                {
                alt12=5;
                }
                break;
            case 36:
                {
                alt12=6;
                }
                break;
            case 25:
                {
                alt12=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalQueryDsl.g:999:2: ( ( 'prescriptionId' ) )
                    {
                    // InternalQueryDsl.g:999:2: ( ( 'prescriptionId' ) )
                    // InternalQueryDsl.g:1000:3: ( 'prescriptionId' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getPrescriptionIdEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:1001:3: ( 'prescriptionId' )
                    // InternalQueryDsl.g:1001:4: 'prescriptionId'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getPrescriptionIdEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1005:2: ( ( 'recordId' ) )
                    {
                    // InternalQueryDsl.g:1005:2: ( ( 'recordId' ) )
                    // InternalQueryDsl.g:1006:3: ( 'recordId' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getRecordIdEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:1007:3: ( 'recordId' )
                    // InternalQueryDsl.g:1007:4: 'recordId'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getRecordIdEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1011:2: ( ( 'medicationName' ) )
                    {
                    // InternalQueryDsl.g:1011:2: ( ( 'medicationName' ) )
                    // InternalQueryDsl.g:1012:3: ( 'medicationName' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getMedicationNameEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:1013:3: ( 'medicationName' )
                    // InternalQueryDsl.g:1013:4: 'medicationName'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getMedicationNameEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1017:2: ( ( 'start' ) )
                    {
                    // InternalQueryDsl.g:1017:2: ( ( 'start' ) )
                    // InternalQueryDsl.g:1018:3: ( 'start' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getStartEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:1019:3: ( 'start' )
                    // InternalQueryDsl.g:1019:4: 'start'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getStartEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1023:2: ( ( 'end' ) )
                    {
                    // InternalQueryDsl.g:1023:2: ( ( 'end' ) )
                    // InternalQueryDsl.g:1024:3: ( 'end' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getEndEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:1025:3: ( 'end' )
                    // InternalQueryDsl.g:1025:4: 'end'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getEndEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:1029:2: ( ( 'ordered' ) )
                    {
                    // InternalQueryDsl.g:1029:2: ( ( 'ordered' ) )
                    // InternalQueryDsl.g:1030:3: ( 'ordered' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getOrderedEnumLiteralDeclaration_5()); 
                    // InternalQueryDsl.g:1031:3: ( 'ordered' )
                    // InternalQueryDsl.g:1031:4: 'ordered'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getOrderedEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:1035:2: ( ( 'price' ) )
                    {
                    // InternalQueryDsl.g:1035:2: ( ( 'price' ) )
                    // InternalQueryDsl.g:1036:3: ( 'price' )
                    {
                     before(grammarAccess.getVariablePrescriptionAccess().getPriceEnumLiteralDeclaration_6()); 
                    // InternalQueryDsl.g:1037:3: ( 'price' )
                    // InternalQueryDsl.g:1037:4: 'price'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getVariablePrescriptionAccess().getPriceEnumLiteralDeclaration_6()); 

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
    // $ANTLR end "rule__VariablePrescription__Alternatives"


    // $ANTLR start "rule__MedicalCondition__Alternatives"
    // InternalQueryDsl.g:1045:1: rule__MedicalCondition__Alternatives : ( ( ( 'Bronchitis' ) ) | ( ( 'Asthma' ) ) | ( ( 'Diabetes' ) ) | ( ( 'Flu' ) ) | ( ( 'Hypertension' ) ) );
    public final void rule__MedicalCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1049:1: ( ( ( 'Bronchitis' ) ) | ( ( 'Asthma' ) ) | ( ( 'Diabetes' ) ) | ( ( 'Flu' ) ) | ( ( 'Hypertension' ) ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            case 40:
                {
                alt13=4;
                }
                break;
            case 41:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalQueryDsl.g:1050:2: ( ( 'Bronchitis' ) )
                    {
                    // InternalQueryDsl.g:1050:2: ( ( 'Bronchitis' ) )
                    // InternalQueryDsl.g:1051:3: ( 'Bronchitis' )
                    {
                     before(grammarAccess.getMedicalConditionAccess().getBronchitisEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:1052:3: ( 'Bronchitis' )
                    // InternalQueryDsl.g:1052:4: 'Bronchitis'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getMedicalConditionAccess().getBronchitisEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1056:2: ( ( 'Asthma' ) )
                    {
                    // InternalQueryDsl.g:1056:2: ( ( 'Asthma' ) )
                    // InternalQueryDsl.g:1057:3: ( 'Asthma' )
                    {
                     before(grammarAccess.getMedicalConditionAccess().getAsthmaEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:1058:3: ( 'Asthma' )
                    // InternalQueryDsl.g:1058:4: 'Asthma'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getMedicalConditionAccess().getAsthmaEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1062:2: ( ( 'Diabetes' ) )
                    {
                    // InternalQueryDsl.g:1062:2: ( ( 'Diabetes' ) )
                    // InternalQueryDsl.g:1063:3: ( 'Diabetes' )
                    {
                     before(grammarAccess.getMedicalConditionAccess().getDiabetesEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:1064:3: ( 'Diabetes' )
                    // InternalQueryDsl.g:1064:4: 'Diabetes'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getMedicalConditionAccess().getDiabetesEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:1068:2: ( ( 'Flu' ) )
                    {
                    // InternalQueryDsl.g:1068:2: ( ( 'Flu' ) )
                    // InternalQueryDsl.g:1069:3: ( 'Flu' )
                    {
                     before(grammarAccess.getMedicalConditionAccess().getFluEnumLiteralDeclaration_3()); 
                    // InternalQueryDsl.g:1070:3: ( 'Flu' )
                    // InternalQueryDsl.g:1070:4: 'Flu'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getMedicalConditionAccess().getFluEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:1074:2: ( ( 'Hypertension' ) )
                    {
                    // InternalQueryDsl.g:1074:2: ( ( 'Hypertension' ) )
                    // InternalQueryDsl.g:1075:3: ( 'Hypertension' )
                    {
                     before(grammarAccess.getMedicalConditionAccess().getHypertensionEnumLiteralDeclaration_4()); 
                    // InternalQueryDsl.g:1076:3: ( 'Hypertension' )
                    // InternalQueryDsl.g:1076:4: 'Hypertension'
                    {
                    match(input,41,FOLLOW_2); 

                    }

                     after(grammarAccess.getMedicalConditionAccess().getHypertensionEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__MedicalCondition__Alternatives"


    // $ANTLR start "rule__RiskPerception__Alternatives"
    // InternalQueryDsl.g:1084:1: rule__RiskPerception__Alternatives : ( ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) );
    public final void rule__RiskPerception__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1088:1: ( ( ( 'High' ) ) | ( ( 'Medium' ) ) | ( ( 'Low' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt14=1;
                }
                break;
            case 43:
                {
                alt14=2;
                }
                break;
            case 44:
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
                    // InternalQueryDsl.g:1089:2: ( ( 'High' ) )
                    {
                    // InternalQueryDsl.g:1089:2: ( ( 'High' ) )
                    // InternalQueryDsl.g:1090:3: ( 'High' )
                    {
                     before(grammarAccess.getRiskPerceptionAccess().getHighEnumLiteralDeclaration_0()); 
                    // InternalQueryDsl.g:1091:3: ( 'High' )
                    // InternalQueryDsl.g:1091:4: 'High'
                    {
                    match(input,42,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiskPerceptionAccess().getHighEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:1095:2: ( ( 'Medium' ) )
                    {
                    // InternalQueryDsl.g:1095:2: ( ( 'Medium' ) )
                    // InternalQueryDsl.g:1096:3: ( 'Medium' )
                    {
                     before(grammarAccess.getRiskPerceptionAccess().getMediumEnumLiteralDeclaration_1()); 
                    // InternalQueryDsl.g:1097:3: ( 'Medium' )
                    // InternalQueryDsl.g:1097:4: 'Medium'
                    {
                    match(input,43,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiskPerceptionAccess().getMediumEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:1101:2: ( ( 'Low' ) )
                    {
                    // InternalQueryDsl.g:1101:2: ( ( 'Low' ) )
                    // InternalQueryDsl.g:1102:3: ( 'Low' )
                    {
                     before(grammarAccess.getRiskPerceptionAccess().getLowEnumLiteralDeclaration_2()); 
                    // InternalQueryDsl.g:1103:3: ( 'Low' )
                    // InternalQueryDsl.g:1103:4: 'Low'
                    {
                    match(input,44,FOLLOW_2); 

                    }

                     after(grammarAccess.getRiskPerceptionAccess().getLowEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__RiskPerception__Alternatives"


    // $ANTLR start "rule__Select__Group__0"
    // InternalQueryDsl.g:1111:1: rule__Select__Group__0 : rule__Select__Group__0__Impl rule__Select__Group__1 ;
    public final void rule__Select__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1115:1: ( rule__Select__Group__0__Impl rule__Select__Group__1 )
            // InternalQueryDsl.g:1116:2: rule__Select__Group__0__Impl rule__Select__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Select__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Select__Group__1();

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
    // $ANTLR end "rule__Select__Group__0"


    // $ANTLR start "rule__Select__Group__0__Impl"
    // InternalQueryDsl.g:1123:1: rule__Select__Group__0__Impl : ( 'SELECT' ) ;
    public final void rule__Select__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1127:1: ( ( 'SELECT' ) )
            // InternalQueryDsl.g:1128:1: ( 'SELECT' )
            {
            // InternalQueryDsl.g:1128:1: ( 'SELECT' )
            // InternalQueryDsl.g:1129:2: 'SELECT'
            {
             before(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSelectAccess().getSELECTKeyword_0()); 

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
    // $ANTLR end "rule__Select__Group__0__Impl"


    // $ANTLR start "rule__Select__Group__1"
    // InternalQueryDsl.g:1138:1: rule__Select__Group__1 : rule__Select__Group__1__Impl ;
    public final void rule__Select__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1142:1: ( rule__Select__Group__1__Impl )
            // InternalQueryDsl.g:1143:2: rule__Select__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Select__Group__1__Impl();

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
    // $ANTLR end "rule__Select__Group__1"


    // $ANTLR start "rule__Select__Group__1__Impl"
    // InternalQueryDsl.g:1149:1: rule__Select__Group__1__Impl : ( ( rule__Select__Alternatives_1 ) ) ;
    public final void rule__Select__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1153:1: ( ( ( rule__Select__Alternatives_1 ) ) )
            // InternalQueryDsl.g:1154:1: ( ( rule__Select__Alternatives_1 ) )
            {
            // InternalQueryDsl.g:1154:1: ( ( rule__Select__Alternatives_1 ) )
            // InternalQueryDsl.g:1155:2: ( rule__Select__Alternatives_1 )
            {
             before(grammarAccess.getSelectAccess().getAlternatives_1()); 
            // InternalQueryDsl.g:1156:2: ( rule__Select__Alternatives_1 )
            // InternalQueryDsl.g:1156:3: rule__Select__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Select__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Select__Group__1__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__0"
    // InternalQueryDsl.g:1165:1: rule__SelectMedicalRecord__Group__0 : rule__SelectMedicalRecord__Group__0__Impl rule__SelectMedicalRecord__Group__1 ;
    public final void rule__SelectMedicalRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1169:1: ( rule__SelectMedicalRecord__Group__0__Impl rule__SelectMedicalRecord__Group__1 )
            // InternalQueryDsl.g:1170:2: rule__SelectMedicalRecord__Group__0__Impl rule__SelectMedicalRecord__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectMedicalRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__1();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__0"


    // $ANTLR start "rule__SelectMedicalRecord__Group__0__Impl"
    // InternalQueryDsl.g:1177:1: rule__SelectMedicalRecord__Group__0__Impl : ( ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 ) ) ;
    public final void rule__SelectMedicalRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1181:1: ( ( ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 ) ) )
            // InternalQueryDsl.g:1182:1: ( ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 ) )
            {
            // InternalQueryDsl.g:1182:1: ( ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 ) )
            // InternalQueryDsl.g:1183:2: ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 )
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordAssignment_0()); 
            // InternalQueryDsl.g:1184:2: ( rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 )
            // InternalQueryDsl.g:1184:3: rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordAssignment_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__0__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__1"
    // InternalQueryDsl.g:1192:1: rule__SelectMedicalRecord__Group__1 : rule__SelectMedicalRecord__Group__1__Impl rule__SelectMedicalRecord__Group__2 ;
    public final void rule__SelectMedicalRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1196:1: ( rule__SelectMedicalRecord__Group__1__Impl rule__SelectMedicalRecord__Group__2 )
            // InternalQueryDsl.g:1197:2: rule__SelectMedicalRecord__Group__1__Impl rule__SelectMedicalRecord__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SelectMedicalRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__2();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__1"


    // $ANTLR start "rule__SelectMedicalRecord__Group__1__Impl"
    // InternalQueryDsl.g:1204:1: rule__SelectMedicalRecord__Group__1__Impl : ( ( rule__SelectMedicalRecord__Group_1__0 )* ) ;
    public final void rule__SelectMedicalRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1208:1: ( ( ( rule__SelectMedicalRecord__Group_1__0 )* ) )
            // InternalQueryDsl.g:1209:1: ( ( rule__SelectMedicalRecord__Group_1__0 )* )
            {
            // InternalQueryDsl.g:1209:1: ( ( rule__SelectMedicalRecord__Group_1__0 )* )
            // InternalQueryDsl.g:1210:2: ( rule__SelectMedicalRecord__Group_1__0 )*
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getGroup_1()); 
            // InternalQueryDsl.g:1211:2: ( rule__SelectMedicalRecord__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalQueryDsl.g:1211:3: rule__SelectMedicalRecord__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SelectMedicalRecord__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSelectMedicalRecordAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__1__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__2"
    // InternalQueryDsl.g:1219:1: rule__SelectMedicalRecord__Group__2 : rule__SelectMedicalRecord__Group__2__Impl rule__SelectMedicalRecord__Group__3 ;
    public final void rule__SelectMedicalRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1223:1: ( rule__SelectMedicalRecord__Group__2__Impl rule__SelectMedicalRecord__Group__3 )
            // InternalQueryDsl.g:1224:2: rule__SelectMedicalRecord__Group__2__Impl rule__SelectMedicalRecord__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__SelectMedicalRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__3();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__2"


    // $ANTLR start "rule__SelectMedicalRecord__Group__2__Impl"
    // InternalQueryDsl.g:1231:1: rule__SelectMedicalRecord__Group__2__Impl : ( 'From' ) ;
    public final void rule__SelectMedicalRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1235:1: ( ( 'From' ) )
            // InternalQueryDsl.g:1236:1: ( 'From' )
            {
            // InternalQueryDsl.g:1236:1: ( 'From' )
            // InternalQueryDsl.g:1237:2: 'From'
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getFromKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectMedicalRecordAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__2__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__3"
    // InternalQueryDsl.g:1246:1: rule__SelectMedicalRecord__Group__3 : rule__SelectMedicalRecord__Group__3__Impl rule__SelectMedicalRecord__Group__4 ;
    public final void rule__SelectMedicalRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1250:1: ( rule__SelectMedicalRecord__Group__3__Impl rule__SelectMedicalRecord__Group__4 )
            // InternalQueryDsl.g:1251:2: rule__SelectMedicalRecord__Group__3__Impl rule__SelectMedicalRecord__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SelectMedicalRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__4();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__3"


    // $ANTLR start "rule__SelectMedicalRecord__Group__3__Impl"
    // InternalQueryDsl.g:1258:1: rule__SelectMedicalRecord__Group__3__Impl : ( 'MedicalRecord' ) ;
    public final void rule__SelectMedicalRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1262:1: ( ( 'MedicalRecord' ) )
            // InternalQueryDsl.g:1263:1: ( 'MedicalRecord' )
            {
            // InternalQueryDsl.g:1263:1: ( 'MedicalRecord' )
            // InternalQueryDsl.g:1264:2: 'MedicalRecord'
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getMedicalRecordKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSelectMedicalRecordAccess().getMedicalRecordKeyword_3()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__3__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__4"
    // InternalQueryDsl.g:1273:1: rule__SelectMedicalRecord__Group__4 : rule__SelectMedicalRecord__Group__4__Impl rule__SelectMedicalRecord__Group__5 ;
    public final void rule__SelectMedicalRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1277:1: ( rule__SelectMedicalRecord__Group__4__Impl rule__SelectMedicalRecord__Group__5 )
            // InternalQueryDsl.g:1278:2: rule__SelectMedicalRecord__Group__4__Impl rule__SelectMedicalRecord__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SelectMedicalRecord__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__5();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__4"


    // $ANTLR start "rule__SelectMedicalRecord__Group__4__Impl"
    // InternalQueryDsl.g:1285:1: rule__SelectMedicalRecord__Group__4__Impl : ( ( rule__SelectMedicalRecord__Group_4__0 )? ) ;
    public final void rule__SelectMedicalRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1289:1: ( ( ( rule__SelectMedicalRecord__Group_4__0 )? ) )
            // InternalQueryDsl.g:1290:1: ( ( rule__SelectMedicalRecord__Group_4__0 )? )
            {
            // InternalQueryDsl.g:1290:1: ( ( rule__SelectMedicalRecord__Group_4__0 )? )
            // InternalQueryDsl.g:1291:2: ( rule__SelectMedicalRecord__Group_4__0 )?
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getGroup_4()); 
            // InternalQueryDsl.g:1292:2: ( rule__SelectMedicalRecord__Group_4__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==49) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalQueryDsl.g:1292:3: rule__SelectMedicalRecord__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectMedicalRecord__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectMedicalRecordAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__4__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group__5"
    // InternalQueryDsl.g:1300:1: rule__SelectMedicalRecord__Group__5 : rule__SelectMedicalRecord__Group__5__Impl ;
    public final void rule__SelectMedicalRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1304:1: ( rule__SelectMedicalRecord__Group__5__Impl )
            // InternalQueryDsl.g:1305:2: rule__SelectMedicalRecord__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group__5__Impl();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__5"


    // $ANTLR start "rule__SelectMedicalRecord__Group__5__Impl"
    // InternalQueryDsl.g:1311:1: rule__SelectMedicalRecord__Group__5__Impl : ( ';' ) ;
    public final void rule__SelectMedicalRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1315:1: ( ( ';' ) )
            // InternalQueryDsl.g:1316:1: ( ';' )
            {
            // InternalQueryDsl.g:1316:1: ( ';' )
            // InternalQueryDsl.g:1317:2: ';'
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getSemicolonKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectMedicalRecordAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group__5__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group_1__0"
    // InternalQueryDsl.g:1327:1: rule__SelectMedicalRecord__Group_1__0 : rule__SelectMedicalRecord__Group_1__0__Impl rule__SelectMedicalRecord__Group_1__1 ;
    public final void rule__SelectMedicalRecord__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1331:1: ( rule__SelectMedicalRecord__Group_1__0__Impl rule__SelectMedicalRecord__Group_1__1 )
            // InternalQueryDsl.g:1332:2: rule__SelectMedicalRecord__Group_1__0__Impl rule__SelectMedicalRecord__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectMedicalRecord__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group_1__1();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_1__0"


    // $ANTLR start "rule__SelectMedicalRecord__Group_1__0__Impl"
    // InternalQueryDsl.g:1339:1: rule__SelectMedicalRecord__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectMedicalRecord__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1343:1: ( ( ',' ) )
            // InternalQueryDsl.g:1344:1: ( ',' )
            {
            // InternalQueryDsl.g:1344:1: ( ',' )
            // InternalQueryDsl.g:1345:2: ','
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getCommaKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSelectMedicalRecordAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_1__0__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group_1__1"
    // InternalQueryDsl.g:1354:1: rule__SelectMedicalRecord__Group_1__1 : rule__SelectMedicalRecord__Group_1__1__Impl ;
    public final void rule__SelectMedicalRecord__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1358:1: ( rule__SelectMedicalRecord__Group_1__1__Impl )
            // InternalQueryDsl.g:1359:2: rule__SelectMedicalRecord__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_1__1"


    // $ANTLR start "rule__SelectMedicalRecord__Group_1__1__Impl"
    // InternalQueryDsl.g:1365:1: rule__SelectMedicalRecord__Group_1__1__Impl : ( ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 ) ) ;
    public final void rule__SelectMedicalRecord__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1369:1: ( ( ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 ) ) )
            // InternalQueryDsl.g:1370:1: ( ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:1370:1: ( ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 ) )
            // InternalQueryDsl.g:1371:2: ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 )
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordNextAssignment_1_1()); 
            // InternalQueryDsl.g:1372:2: ( rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 )
            // InternalQueryDsl.g:1372:3: rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordNextAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_1__1__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group_4__0"
    // InternalQueryDsl.g:1381:1: rule__SelectMedicalRecord__Group_4__0 : rule__SelectMedicalRecord__Group_4__0__Impl rule__SelectMedicalRecord__Group_4__1 ;
    public final void rule__SelectMedicalRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1385:1: ( rule__SelectMedicalRecord__Group_4__0__Impl rule__SelectMedicalRecord__Group_4__1 )
            // InternalQueryDsl.g:1386:2: rule__SelectMedicalRecord__Group_4__0__Impl rule__SelectMedicalRecord__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__SelectMedicalRecord__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group_4__1();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_4__0"


    // $ANTLR start "rule__SelectMedicalRecord__Group_4__0__Impl"
    // InternalQueryDsl.g:1393:1: rule__SelectMedicalRecord__Group_4__0__Impl : ( 'WHERE' ) ;
    public final void rule__SelectMedicalRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1397:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:1398:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:1398:1: ( 'WHERE' )
            // InternalQueryDsl.g:1399:2: 'WHERE'
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getWHEREKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSelectMedicalRecordAccess().getWHEREKeyword_4_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_4__0__Impl"


    // $ANTLR start "rule__SelectMedicalRecord__Group_4__1"
    // InternalQueryDsl.g:1408:1: rule__SelectMedicalRecord__Group_4__1 : rule__SelectMedicalRecord__Group_4__1__Impl ;
    public final void rule__SelectMedicalRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1412:1: ( rule__SelectMedicalRecord__Group_4__1__Impl )
            // InternalQueryDsl.g:1413:2: rule__SelectMedicalRecord__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectMedicalRecord__Group_4__1__Impl();

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_4__1"


    // $ANTLR start "rule__SelectMedicalRecord__Group_4__1__Impl"
    // InternalQueryDsl.g:1419:1: rule__SelectMedicalRecord__Group_4__1__Impl : ( ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) ) ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* ) ) ;
    public final void rule__SelectMedicalRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1423:1: ( ( ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) ) ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* ) ) )
            // InternalQueryDsl.g:1424:1: ( ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) ) ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* ) )
            {
            // InternalQueryDsl.g:1424:1: ( ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) ) ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* ) )
            // InternalQueryDsl.g:1425:2: ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) ) ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* )
            {
            // InternalQueryDsl.g:1425:2: ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 ) )
            // InternalQueryDsl.g:1426:3: ( rule__SelectMedicalRecord__WhereAssignment_4_1 )
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1427:3: ( rule__SelectMedicalRecord__WhereAssignment_4_1 )
            // InternalQueryDsl.g:1427:4: rule__SelectMedicalRecord__WhereAssignment_4_1
            {
            pushFollow(FOLLOW_10);
            rule__SelectMedicalRecord__WhereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectMedicalRecordAccess().getWhereAssignment_4_1()); 

            }

            // InternalQueryDsl.g:1430:2: ( ( rule__SelectMedicalRecord__WhereAssignment_4_1 )* )
            // InternalQueryDsl.g:1431:3: ( rule__SelectMedicalRecord__WhereAssignment_4_1 )*
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1432:3: ( rule__SelectMedicalRecord__WhereAssignment_4_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=20 && LA17_0<=26)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalQueryDsl.g:1432:4: rule__SelectMedicalRecord__WhereAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__SelectMedicalRecord__WhereAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getSelectMedicalRecordAccess().getWhereAssignment_4_1()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__Group_4__1__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__0"
    // InternalQueryDsl.g:1442:1: rule__SelectPatientMonitoring__Group__0 : rule__SelectPatientMonitoring__Group__0__Impl rule__SelectPatientMonitoring__Group__1 ;
    public final void rule__SelectPatientMonitoring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1446:1: ( rule__SelectPatientMonitoring__Group__0__Impl rule__SelectPatientMonitoring__Group__1 )
            // InternalQueryDsl.g:1447:2: rule__SelectPatientMonitoring__Group__0__Impl rule__SelectPatientMonitoring__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectPatientMonitoring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__1();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__0"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__0__Impl"
    // InternalQueryDsl.g:1454:1: rule__SelectPatientMonitoring__Group__0__Impl : ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 ) ) ;
    public final void rule__SelectPatientMonitoring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1458:1: ( ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 ) ) )
            // InternalQueryDsl.g:1459:1: ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 ) )
            {
            // InternalQueryDsl.g:1459:1: ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 ) )
            // InternalQueryDsl.g:1460:2: ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 )
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringAssignment_0()); 
            // InternalQueryDsl.g:1461:2: ( rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 )
            // InternalQueryDsl.g:1461:3: rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringAssignment_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__0__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__1"
    // InternalQueryDsl.g:1469:1: rule__SelectPatientMonitoring__Group__1 : rule__SelectPatientMonitoring__Group__1__Impl rule__SelectPatientMonitoring__Group__2 ;
    public final void rule__SelectPatientMonitoring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1473:1: ( rule__SelectPatientMonitoring__Group__1__Impl rule__SelectPatientMonitoring__Group__2 )
            // InternalQueryDsl.g:1474:2: rule__SelectPatientMonitoring__Group__1__Impl rule__SelectPatientMonitoring__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SelectPatientMonitoring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__2();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__1"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__1__Impl"
    // InternalQueryDsl.g:1481:1: rule__SelectPatientMonitoring__Group__1__Impl : ( ( rule__SelectPatientMonitoring__Group_1__0 )* ) ;
    public final void rule__SelectPatientMonitoring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1485:1: ( ( ( rule__SelectPatientMonitoring__Group_1__0 )* ) )
            // InternalQueryDsl.g:1486:1: ( ( rule__SelectPatientMonitoring__Group_1__0 )* )
            {
            // InternalQueryDsl.g:1486:1: ( ( rule__SelectPatientMonitoring__Group_1__0 )* )
            // InternalQueryDsl.g:1487:2: ( rule__SelectPatientMonitoring__Group_1__0 )*
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getGroup_1()); 
            // InternalQueryDsl.g:1488:2: ( rule__SelectPatientMonitoring__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==48) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalQueryDsl.g:1488:3: rule__SelectPatientMonitoring__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SelectPatientMonitoring__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getSelectPatientMonitoringAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__1__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__2"
    // InternalQueryDsl.g:1496:1: rule__SelectPatientMonitoring__Group__2 : rule__SelectPatientMonitoring__Group__2__Impl rule__SelectPatientMonitoring__Group__3 ;
    public final void rule__SelectPatientMonitoring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1500:1: ( rule__SelectPatientMonitoring__Group__2__Impl rule__SelectPatientMonitoring__Group__3 )
            // InternalQueryDsl.g:1501:2: rule__SelectPatientMonitoring__Group__2__Impl rule__SelectPatientMonitoring__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__SelectPatientMonitoring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__3();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__2"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__2__Impl"
    // InternalQueryDsl.g:1508:1: rule__SelectPatientMonitoring__Group__2__Impl : ( 'From' ) ;
    public final void rule__SelectPatientMonitoring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1512:1: ( ( 'From' ) )
            // InternalQueryDsl.g:1513:1: ( 'From' )
            {
            // InternalQueryDsl.g:1513:1: ( 'From' )
            // InternalQueryDsl.g:1514:2: 'From'
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getFromKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectPatientMonitoringAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__2__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__3"
    // InternalQueryDsl.g:1523:1: rule__SelectPatientMonitoring__Group__3 : rule__SelectPatientMonitoring__Group__3__Impl rule__SelectPatientMonitoring__Group__4 ;
    public final void rule__SelectPatientMonitoring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1527:1: ( rule__SelectPatientMonitoring__Group__3__Impl rule__SelectPatientMonitoring__Group__4 )
            // InternalQueryDsl.g:1528:2: rule__SelectPatientMonitoring__Group__3__Impl rule__SelectPatientMonitoring__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SelectPatientMonitoring__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__4();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__3"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__3__Impl"
    // InternalQueryDsl.g:1535:1: rule__SelectPatientMonitoring__Group__3__Impl : ( 'PatientMonitoring' ) ;
    public final void rule__SelectPatientMonitoring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1539:1: ( ( 'PatientMonitoring' ) )
            // InternalQueryDsl.g:1540:1: ( 'PatientMonitoring' )
            {
            // InternalQueryDsl.g:1540:1: ( 'PatientMonitoring' )
            // InternalQueryDsl.g:1541:2: 'PatientMonitoring'
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getPatientMonitoringKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getSelectPatientMonitoringAccess().getPatientMonitoringKeyword_3()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__3__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__4"
    // InternalQueryDsl.g:1550:1: rule__SelectPatientMonitoring__Group__4 : rule__SelectPatientMonitoring__Group__4__Impl rule__SelectPatientMonitoring__Group__5 ;
    public final void rule__SelectPatientMonitoring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1554:1: ( rule__SelectPatientMonitoring__Group__4__Impl rule__SelectPatientMonitoring__Group__5 )
            // InternalQueryDsl.g:1555:2: rule__SelectPatientMonitoring__Group__4__Impl rule__SelectPatientMonitoring__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SelectPatientMonitoring__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__5();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__4"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__4__Impl"
    // InternalQueryDsl.g:1562:1: rule__SelectPatientMonitoring__Group__4__Impl : ( ( rule__SelectPatientMonitoring__Group_4__0 )? ) ;
    public final void rule__SelectPatientMonitoring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1566:1: ( ( ( rule__SelectPatientMonitoring__Group_4__0 )? ) )
            // InternalQueryDsl.g:1567:1: ( ( rule__SelectPatientMonitoring__Group_4__0 )? )
            {
            // InternalQueryDsl.g:1567:1: ( ( rule__SelectPatientMonitoring__Group_4__0 )? )
            // InternalQueryDsl.g:1568:2: ( rule__SelectPatientMonitoring__Group_4__0 )?
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getGroup_4()); 
            // InternalQueryDsl.g:1569:2: ( rule__SelectPatientMonitoring__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==49) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalQueryDsl.g:1569:3: rule__SelectPatientMonitoring__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectPatientMonitoring__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectPatientMonitoringAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__4__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__5"
    // InternalQueryDsl.g:1577:1: rule__SelectPatientMonitoring__Group__5 : rule__SelectPatientMonitoring__Group__5__Impl ;
    public final void rule__SelectPatientMonitoring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1581:1: ( rule__SelectPatientMonitoring__Group__5__Impl )
            // InternalQueryDsl.g:1582:2: rule__SelectPatientMonitoring__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group__5__Impl();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__5"


    // $ANTLR start "rule__SelectPatientMonitoring__Group__5__Impl"
    // InternalQueryDsl.g:1588:1: rule__SelectPatientMonitoring__Group__5__Impl : ( ';' ) ;
    public final void rule__SelectPatientMonitoring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1592:1: ( ( ';' ) )
            // InternalQueryDsl.g:1593:1: ( ';' )
            {
            // InternalQueryDsl.g:1593:1: ( ';' )
            // InternalQueryDsl.g:1594:2: ';'
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getSemicolonKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectPatientMonitoringAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group__5__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_1__0"
    // InternalQueryDsl.g:1604:1: rule__SelectPatientMonitoring__Group_1__0 : rule__SelectPatientMonitoring__Group_1__0__Impl rule__SelectPatientMonitoring__Group_1__1 ;
    public final void rule__SelectPatientMonitoring__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1608:1: ( rule__SelectPatientMonitoring__Group_1__0__Impl rule__SelectPatientMonitoring__Group_1__1 )
            // InternalQueryDsl.g:1609:2: rule__SelectPatientMonitoring__Group_1__0__Impl rule__SelectPatientMonitoring__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__SelectPatientMonitoring__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group_1__1();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_1__0"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_1__0__Impl"
    // InternalQueryDsl.g:1616:1: rule__SelectPatientMonitoring__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectPatientMonitoring__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1620:1: ( ( ',' ) )
            // InternalQueryDsl.g:1621:1: ( ',' )
            {
            // InternalQueryDsl.g:1621:1: ( ',' )
            // InternalQueryDsl.g:1622:2: ','
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getCommaKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSelectPatientMonitoringAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_1__0__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_1__1"
    // InternalQueryDsl.g:1631:1: rule__SelectPatientMonitoring__Group_1__1 : rule__SelectPatientMonitoring__Group_1__1__Impl ;
    public final void rule__SelectPatientMonitoring__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1635:1: ( rule__SelectPatientMonitoring__Group_1__1__Impl )
            // InternalQueryDsl.g:1636:2: rule__SelectPatientMonitoring__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_1__1"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_1__1__Impl"
    // InternalQueryDsl.g:1642:1: rule__SelectPatientMonitoring__Group_1__1__Impl : ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 ) ) ;
    public final void rule__SelectPatientMonitoring__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1646:1: ( ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 ) ) )
            // InternalQueryDsl.g:1647:1: ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:1647:1: ( ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 ) )
            // InternalQueryDsl.g:1648:2: ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 )
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringNextAssignment_1_1()); 
            // InternalQueryDsl.g:1649:2: ( rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 )
            // InternalQueryDsl.g:1649:3: rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringNextAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_1__1__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_4__0"
    // InternalQueryDsl.g:1658:1: rule__SelectPatientMonitoring__Group_4__0 : rule__SelectPatientMonitoring__Group_4__0__Impl rule__SelectPatientMonitoring__Group_4__1 ;
    public final void rule__SelectPatientMonitoring__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1662:1: ( rule__SelectPatientMonitoring__Group_4__0__Impl rule__SelectPatientMonitoring__Group_4__1 )
            // InternalQueryDsl.g:1663:2: rule__SelectPatientMonitoring__Group_4__0__Impl rule__SelectPatientMonitoring__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__SelectPatientMonitoring__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group_4__1();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_4__0"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_4__0__Impl"
    // InternalQueryDsl.g:1670:1: rule__SelectPatientMonitoring__Group_4__0__Impl : ( 'WHERE' ) ;
    public final void rule__SelectPatientMonitoring__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1674:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:1675:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:1675:1: ( 'WHERE' )
            // InternalQueryDsl.g:1676:2: 'WHERE'
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getWHEREKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSelectPatientMonitoringAccess().getWHEREKeyword_4_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_4__0__Impl"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_4__1"
    // InternalQueryDsl.g:1685:1: rule__SelectPatientMonitoring__Group_4__1 : rule__SelectPatientMonitoring__Group_4__1__Impl ;
    public final void rule__SelectPatientMonitoring__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1689:1: ( rule__SelectPatientMonitoring__Group_4__1__Impl )
            // InternalQueryDsl.g:1690:2: rule__SelectPatientMonitoring__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPatientMonitoring__Group_4__1__Impl();

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_4__1"


    // $ANTLR start "rule__SelectPatientMonitoring__Group_4__1__Impl"
    // InternalQueryDsl.g:1696:1: rule__SelectPatientMonitoring__Group_4__1__Impl : ( ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) ) ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* ) ) ;
    public final void rule__SelectPatientMonitoring__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1700:1: ( ( ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) ) ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* ) ) )
            // InternalQueryDsl.g:1701:1: ( ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) ) ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* ) )
            {
            // InternalQueryDsl.g:1701:1: ( ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) ) ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* ) )
            // InternalQueryDsl.g:1702:2: ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) ) ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* )
            {
            // InternalQueryDsl.g:1702:2: ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 ) )
            // InternalQueryDsl.g:1703:3: ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1704:3: ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )
            // InternalQueryDsl.g:1704:4: rule__SelectPatientMonitoring__WhereAssignment_4_1
            {
            pushFollow(FOLLOW_13);
            rule__SelectPatientMonitoring__WhereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectPatientMonitoringAccess().getWhereAssignment_4_1()); 

            }

            // InternalQueryDsl.g:1707:2: ( ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )* )
            // InternalQueryDsl.g:1708:3: ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )*
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1709:3: ( rule__SelectPatientMonitoring__WhereAssignment_4_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21||LA20_0==24||(LA20_0>=27 && LA20_0<=31)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalQueryDsl.g:1709:4: rule__SelectPatientMonitoring__WhereAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SelectPatientMonitoring__WhereAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getSelectPatientMonitoringAccess().getWhereAssignment_4_1()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__Group_4__1__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__0"
    // InternalQueryDsl.g:1719:1: rule__SelectPrescription__Group__0 : rule__SelectPrescription__Group__0__Impl rule__SelectPrescription__Group__1 ;
    public final void rule__SelectPrescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1723:1: ( rule__SelectPrescription__Group__0__Impl rule__SelectPrescription__Group__1 )
            // InternalQueryDsl.g:1724:2: rule__SelectPrescription__Group__0__Impl rule__SelectPrescription__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SelectPrescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__1();

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
    // $ANTLR end "rule__SelectPrescription__Group__0"


    // $ANTLR start "rule__SelectPrescription__Group__0__Impl"
    // InternalQueryDsl.g:1731:1: rule__SelectPrescription__Group__0__Impl : ( ( rule__SelectPrescription__VariablePrescriptionAssignment_0 ) ) ;
    public final void rule__SelectPrescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1735:1: ( ( ( rule__SelectPrescription__VariablePrescriptionAssignment_0 ) ) )
            // InternalQueryDsl.g:1736:1: ( ( rule__SelectPrescription__VariablePrescriptionAssignment_0 ) )
            {
            // InternalQueryDsl.g:1736:1: ( ( rule__SelectPrescription__VariablePrescriptionAssignment_0 ) )
            // InternalQueryDsl.g:1737:2: ( rule__SelectPrescription__VariablePrescriptionAssignment_0 )
            {
             before(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionAssignment_0()); 
            // InternalQueryDsl.g:1738:2: ( rule__SelectPrescription__VariablePrescriptionAssignment_0 )
            // InternalQueryDsl.g:1738:3: rule__SelectPrescription__VariablePrescriptionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__VariablePrescriptionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionAssignment_0()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__0__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__1"
    // InternalQueryDsl.g:1746:1: rule__SelectPrescription__Group__1 : rule__SelectPrescription__Group__1__Impl rule__SelectPrescription__Group__2 ;
    public final void rule__SelectPrescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1750:1: ( rule__SelectPrescription__Group__1__Impl rule__SelectPrescription__Group__2 )
            // InternalQueryDsl.g:1751:2: rule__SelectPrescription__Group__1__Impl rule__SelectPrescription__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SelectPrescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__2();

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
    // $ANTLR end "rule__SelectPrescription__Group__1"


    // $ANTLR start "rule__SelectPrescription__Group__1__Impl"
    // InternalQueryDsl.g:1758:1: rule__SelectPrescription__Group__1__Impl : ( ( rule__SelectPrescription__Group_1__0 )* ) ;
    public final void rule__SelectPrescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1762:1: ( ( ( rule__SelectPrescription__Group_1__0 )* ) )
            // InternalQueryDsl.g:1763:1: ( ( rule__SelectPrescription__Group_1__0 )* )
            {
            // InternalQueryDsl.g:1763:1: ( ( rule__SelectPrescription__Group_1__0 )* )
            // InternalQueryDsl.g:1764:2: ( rule__SelectPrescription__Group_1__0 )*
            {
             before(grammarAccess.getSelectPrescriptionAccess().getGroup_1()); 
            // InternalQueryDsl.g:1765:2: ( rule__SelectPrescription__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==48) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalQueryDsl.g:1765:3: rule__SelectPrescription__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__SelectPrescription__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSelectPrescriptionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__1__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__2"
    // InternalQueryDsl.g:1773:1: rule__SelectPrescription__Group__2 : rule__SelectPrescription__Group__2__Impl rule__SelectPrescription__Group__3 ;
    public final void rule__SelectPrescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1777:1: ( rule__SelectPrescription__Group__2__Impl rule__SelectPrescription__Group__3 )
            // InternalQueryDsl.g:1778:2: rule__SelectPrescription__Group__2__Impl rule__SelectPrescription__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SelectPrescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__3();

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
    // $ANTLR end "rule__SelectPrescription__Group__2"


    // $ANTLR start "rule__SelectPrescription__Group__2__Impl"
    // InternalQueryDsl.g:1785:1: rule__SelectPrescription__Group__2__Impl : ( 'From' ) ;
    public final void rule__SelectPrescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1789:1: ( ( 'From' ) )
            // InternalQueryDsl.g:1790:1: ( 'From' )
            {
            // InternalQueryDsl.g:1790:1: ( 'From' )
            // InternalQueryDsl.g:1791:2: 'From'
            {
             before(grammarAccess.getSelectPrescriptionAccess().getFromKeyword_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSelectPrescriptionAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__2__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__3"
    // InternalQueryDsl.g:1800:1: rule__SelectPrescription__Group__3 : rule__SelectPrescription__Group__3__Impl rule__SelectPrescription__Group__4 ;
    public final void rule__SelectPrescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1804:1: ( rule__SelectPrescription__Group__3__Impl rule__SelectPrescription__Group__4 )
            // InternalQueryDsl.g:1805:2: rule__SelectPrescription__Group__3__Impl rule__SelectPrescription__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__SelectPrescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__4();

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
    // $ANTLR end "rule__SelectPrescription__Group__3"


    // $ANTLR start "rule__SelectPrescription__Group__3__Impl"
    // InternalQueryDsl.g:1812:1: rule__SelectPrescription__Group__3__Impl : ( 'Prescription' ) ;
    public final void rule__SelectPrescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1816:1: ( ( 'Prescription' ) )
            // InternalQueryDsl.g:1817:1: ( 'Prescription' )
            {
            // InternalQueryDsl.g:1817:1: ( 'Prescription' )
            // InternalQueryDsl.g:1818:2: 'Prescription'
            {
             before(grammarAccess.getSelectPrescriptionAccess().getPrescriptionKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSelectPrescriptionAccess().getPrescriptionKeyword_3()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__3__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__4"
    // InternalQueryDsl.g:1827:1: rule__SelectPrescription__Group__4 : rule__SelectPrescription__Group__4__Impl rule__SelectPrescription__Group__5 ;
    public final void rule__SelectPrescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1831:1: ( rule__SelectPrescription__Group__4__Impl rule__SelectPrescription__Group__5 )
            // InternalQueryDsl.g:1832:2: rule__SelectPrescription__Group__4__Impl rule__SelectPrescription__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__SelectPrescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__5();

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
    // $ANTLR end "rule__SelectPrescription__Group__4"


    // $ANTLR start "rule__SelectPrescription__Group__4__Impl"
    // InternalQueryDsl.g:1839:1: rule__SelectPrescription__Group__4__Impl : ( ( rule__SelectPrescription__Group_4__0 )? ) ;
    public final void rule__SelectPrescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1843:1: ( ( ( rule__SelectPrescription__Group_4__0 )? ) )
            // InternalQueryDsl.g:1844:1: ( ( rule__SelectPrescription__Group_4__0 )? )
            {
            // InternalQueryDsl.g:1844:1: ( ( rule__SelectPrescription__Group_4__0 )? )
            // InternalQueryDsl.g:1845:2: ( rule__SelectPrescription__Group_4__0 )?
            {
             before(grammarAccess.getSelectPrescriptionAccess().getGroup_4()); 
            // InternalQueryDsl.g:1846:2: ( rule__SelectPrescription__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==49) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalQueryDsl.g:1846:3: rule__SelectPrescription__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectPrescription__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectPrescriptionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__4__Impl"


    // $ANTLR start "rule__SelectPrescription__Group__5"
    // InternalQueryDsl.g:1854:1: rule__SelectPrescription__Group__5 : rule__SelectPrescription__Group__5__Impl ;
    public final void rule__SelectPrescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1858:1: ( rule__SelectPrescription__Group__5__Impl )
            // InternalQueryDsl.g:1859:2: rule__SelectPrescription__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group__5__Impl();

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
    // $ANTLR end "rule__SelectPrescription__Group__5"


    // $ANTLR start "rule__SelectPrescription__Group__5__Impl"
    // InternalQueryDsl.g:1865:1: rule__SelectPrescription__Group__5__Impl : ( ';' ) ;
    public final void rule__SelectPrescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1869:1: ( ( ';' ) )
            // InternalQueryDsl.g:1870:1: ( ';' )
            {
            // InternalQueryDsl.g:1870:1: ( ';' )
            // InternalQueryDsl.g:1871:2: ';'
            {
             before(grammarAccess.getSelectPrescriptionAccess().getSemicolonKeyword_5()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSelectPrescriptionAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__SelectPrescription__Group__5__Impl"


    // $ANTLR start "rule__SelectPrescription__Group_1__0"
    // InternalQueryDsl.g:1881:1: rule__SelectPrescription__Group_1__0 : rule__SelectPrescription__Group_1__0__Impl rule__SelectPrescription__Group_1__1 ;
    public final void rule__SelectPrescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1885:1: ( rule__SelectPrescription__Group_1__0__Impl rule__SelectPrescription__Group_1__1 )
            // InternalQueryDsl.g:1886:2: rule__SelectPrescription__Group_1__0__Impl rule__SelectPrescription__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__SelectPrescription__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group_1__1();

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
    // $ANTLR end "rule__SelectPrescription__Group_1__0"


    // $ANTLR start "rule__SelectPrescription__Group_1__0__Impl"
    // InternalQueryDsl.g:1893:1: rule__SelectPrescription__Group_1__0__Impl : ( ',' ) ;
    public final void rule__SelectPrescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1897:1: ( ( ',' ) )
            // InternalQueryDsl.g:1898:1: ( ',' )
            {
            // InternalQueryDsl.g:1898:1: ( ',' )
            // InternalQueryDsl.g:1899:2: ','
            {
             before(grammarAccess.getSelectPrescriptionAccess().getCommaKeyword_1_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getSelectPrescriptionAccess().getCommaKeyword_1_0()); 

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
    // $ANTLR end "rule__SelectPrescription__Group_1__0__Impl"


    // $ANTLR start "rule__SelectPrescription__Group_1__1"
    // InternalQueryDsl.g:1908:1: rule__SelectPrescription__Group_1__1 : rule__SelectPrescription__Group_1__1__Impl ;
    public final void rule__SelectPrescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1912:1: ( rule__SelectPrescription__Group_1__1__Impl )
            // InternalQueryDsl.g:1913:2: rule__SelectPrescription__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group_1__1__Impl();

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
    // $ANTLR end "rule__SelectPrescription__Group_1__1"


    // $ANTLR start "rule__SelectPrescription__Group_1__1__Impl"
    // InternalQueryDsl.g:1919:1: rule__SelectPrescription__Group_1__1__Impl : ( ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 ) ) ;
    public final void rule__SelectPrescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1923:1: ( ( ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 ) ) )
            // InternalQueryDsl.g:1924:1: ( ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 ) )
            {
            // InternalQueryDsl.g:1924:1: ( ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 ) )
            // InternalQueryDsl.g:1925:2: ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 )
            {
             before(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionNextAssignment_1_1()); 
            // InternalQueryDsl.g:1926:2: ( rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 )
            // InternalQueryDsl.g:1926:3: rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionNextAssignment_1_1()); 

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
    // $ANTLR end "rule__SelectPrescription__Group_1__1__Impl"


    // $ANTLR start "rule__SelectPrescription__Group_4__0"
    // InternalQueryDsl.g:1935:1: rule__SelectPrescription__Group_4__0 : rule__SelectPrescription__Group_4__0__Impl rule__SelectPrescription__Group_4__1 ;
    public final void rule__SelectPrescription__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1939:1: ( rule__SelectPrescription__Group_4__0__Impl rule__SelectPrescription__Group_4__1 )
            // InternalQueryDsl.g:1940:2: rule__SelectPrescription__Group_4__0__Impl rule__SelectPrescription__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__SelectPrescription__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group_4__1();

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
    // $ANTLR end "rule__SelectPrescription__Group_4__0"


    // $ANTLR start "rule__SelectPrescription__Group_4__0__Impl"
    // InternalQueryDsl.g:1947:1: rule__SelectPrescription__Group_4__0__Impl : ( 'WHERE' ) ;
    public final void rule__SelectPrescription__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1951:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:1952:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:1952:1: ( 'WHERE' )
            // InternalQueryDsl.g:1953:2: 'WHERE'
            {
             before(grammarAccess.getSelectPrescriptionAccess().getWHEREKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSelectPrescriptionAccess().getWHEREKeyword_4_0()); 

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
    // $ANTLR end "rule__SelectPrescription__Group_4__0__Impl"


    // $ANTLR start "rule__SelectPrescription__Group_4__1"
    // InternalQueryDsl.g:1962:1: rule__SelectPrescription__Group_4__1 : rule__SelectPrescription__Group_4__1__Impl ;
    public final void rule__SelectPrescription__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1966:1: ( rule__SelectPrescription__Group_4__1__Impl )
            // InternalQueryDsl.g:1967:2: rule__SelectPrescription__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectPrescription__Group_4__1__Impl();

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
    // $ANTLR end "rule__SelectPrescription__Group_4__1"


    // $ANTLR start "rule__SelectPrescription__Group_4__1__Impl"
    // InternalQueryDsl.g:1973:1: rule__SelectPrescription__Group_4__1__Impl : ( ( ( rule__SelectPrescription__WhereAssignment_4_1 ) ) ( ( rule__SelectPrescription__WhereAssignment_4_1 )* ) ) ;
    public final void rule__SelectPrescription__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:1977:1: ( ( ( ( rule__SelectPrescription__WhereAssignment_4_1 ) ) ( ( rule__SelectPrescription__WhereAssignment_4_1 )* ) ) )
            // InternalQueryDsl.g:1978:1: ( ( ( rule__SelectPrescription__WhereAssignment_4_1 ) ) ( ( rule__SelectPrescription__WhereAssignment_4_1 )* ) )
            {
            // InternalQueryDsl.g:1978:1: ( ( ( rule__SelectPrescription__WhereAssignment_4_1 ) ) ( ( rule__SelectPrescription__WhereAssignment_4_1 )* ) )
            // InternalQueryDsl.g:1979:2: ( ( rule__SelectPrescription__WhereAssignment_4_1 ) ) ( ( rule__SelectPrescription__WhereAssignment_4_1 )* )
            {
            // InternalQueryDsl.g:1979:2: ( ( rule__SelectPrescription__WhereAssignment_4_1 ) )
            // InternalQueryDsl.g:1980:3: ( rule__SelectPrescription__WhereAssignment_4_1 )
            {
             before(grammarAccess.getSelectPrescriptionAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1981:3: ( rule__SelectPrescription__WhereAssignment_4_1 )
            // InternalQueryDsl.g:1981:4: rule__SelectPrescription__WhereAssignment_4_1
            {
            pushFollow(FOLLOW_16);
            rule__SelectPrescription__WhereAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectPrescriptionAccess().getWhereAssignment_4_1()); 

            }

            // InternalQueryDsl.g:1984:2: ( ( rule__SelectPrescription__WhereAssignment_4_1 )* )
            // InternalQueryDsl.g:1985:3: ( rule__SelectPrescription__WhereAssignment_4_1 )*
            {
             before(grammarAccess.getSelectPrescriptionAccess().getWhereAssignment_4_1()); 
            // InternalQueryDsl.g:1986:3: ( rule__SelectPrescription__WhereAssignment_4_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20||LA23_0==25||(LA23_0>=32 && LA23_0<=36)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalQueryDsl.g:1986:4: rule__SelectPrescription__WhereAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__SelectPrescription__WhereAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getSelectPrescriptionAccess().getWhereAssignment_4_1()); 

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
    // $ANTLR end "rule__SelectPrescription__Group_4__1__Impl"


    // $ANTLR start "rule__Insert__Group__0"
    // InternalQueryDsl.g:1996:1: rule__Insert__Group__0 : rule__Insert__Group__0__Impl rule__Insert__Group__1 ;
    public final void rule__Insert__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2000:1: ( rule__Insert__Group__0__Impl rule__Insert__Group__1 )
            // InternalQueryDsl.g:2001:2: rule__Insert__Group__0__Impl rule__Insert__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Insert__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__1();

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
    // $ANTLR end "rule__Insert__Group__0"


    // $ANTLR start "rule__Insert__Group__0__Impl"
    // InternalQueryDsl.g:2008:1: rule__Insert__Group__0__Impl : ( 'INSERT' ) ;
    public final void rule__Insert__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2012:1: ( ( 'INSERT' ) )
            // InternalQueryDsl.g:2013:1: ( 'INSERT' )
            {
            // InternalQueryDsl.g:2013:1: ( 'INSERT' )
            // InternalQueryDsl.g:2014:2: 'INSERT'
            {
             before(grammarAccess.getInsertAccess().getINSERTKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getINSERTKeyword_0()); 

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
    // $ANTLR end "rule__Insert__Group__0__Impl"


    // $ANTLR start "rule__Insert__Group__1"
    // InternalQueryDsl.g:2023:1: rule__Insert__Group__1 : rule__Insert__Group__1__Impl rule__Insert__Group__2 ;
    public final void rule__Insert__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2027:1: ( rule__Insert__Group__1__Impl rule__Insert__Group__2 )
            // InternalQueryDsl.g:2028:2: rule__Insert__Group__1__Impl rule__Insert__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Insert__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Insert__Group__2();

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
    // $ANTLR end "rule__Insert__Group__1"


    // $ANTLR start "rule__Insert__Group__1__Impl"
    // InternalQueryDsl.g:2035:1: rule__Insert__Group__1__Impl : ( 'INTO' ) ;
    public final void rule__Insert__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2039:1: ( ( 'INTO' ) )
            // InternalQueryDsl.g:2040:1: ( 'INTO' )
            {
            // InternalQueryDsl.g:2040:1: ( 'INTO' )
            // InternalQueryDsl.g:2041:2: 'INTO'
            {
             before(grammarAccess.getInsertAccess().getINTOKeyword_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getInsertAccess().getINTOKeyword_1()); 

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
    // $ANTLR end "rule__Insert__Group__1__Impl"


    // $ANTLR start "rule__Insert__Group__2"
    // InternalQueryDsl.g:2050:1: rule__Insert__Group__2 : rule__Insert__Group__2__Impl ;
    public final void rule__Insert__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2054:1: ( rule__Insert__Group__2__Impl )
            // InternalQueryDsl.g:2055:2: rule__Insert__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Group__2__Impl();

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
    // $ANTLR end "rule__Insert__Group__2"


    // $ANTLR start "rule__Insert__Group__2__Impl"
    // InternalQueryDsl.g:2061:1: rule__Insert__Group__2__Impl : ( ( rule__Insert__Alternatives_2 ) ) ;
    public final void rule__Insert__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2065:1: ( ( ( rule__Insert__Alternatives_2 ) ) )
            // InternalQueryDsl.g:2066:1: ( ( rule__Insert__Alternatives_2 ) )
            {
            // InternalQueryDsl.g:2066:1: ( ( rule__Insert__Alternatives_2 ) )
            // InternalQueryDsl.g:2067:2: ( rule__Insert__Alternatives_2 )
            {
             before(grammarAccess.getInsertAccess().getAlternatives_2()); 
            // InternalQueryDsl.g:2068:2: ( rule__Insert__Alternatives_2 )
            // InternalQueryDsl.g:2068:3: rule__Insert__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Insert__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Insert__Group__2__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__0"
    // InternalQueryDsl.g:2077:1: rule__InsertMedicalRecord__Group__0 : rule__InsertMedicalRecord__Group__0__Impl rule__InsertMedicalRecord__Group__1 ;
    public final void rule__InsertMedicalRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2081:1: ( rule__InsertMedicalRecord__Group__0__Impl rule__InsertMedicalRecord__Group__1 )
            // InternalQueryDsl.g:2082:2: rule__InsertMedicalRecord__Group__0__Impl rule__InsertMedicalRecord__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InsertMedicalRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__1();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__0"


    // $ANTLR start "rule__InsertMedicalRecord__Group__0__Impl"
    // InternalQueryDsl.g:2089:1: rule__InsertMedicalRecord__Group__0__Impl : ( 'MedicalRecord' ) ;
    public final void rule__InsertMedicalRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2093:1: ( ( 'MedicalRecord' ) )
            // InternalQueryDsl.g:2094:1: ( 'MedicalRecord' )
            {
            // InternalQueryDsl.g:2094:1: ( 'MedicalRecord' )
            // InternalQueryDsl.g:2095:2: 'MedicalRecord'
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getMedicalRecordKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getMedicalRecordKeyword_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__0__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__1"
    // InternalQueryDsl.g:2104:1: rule__InsertMedicalRecord__Group__1 : rule__InsertMedicalRecord__Group__1__Impl rule__InsertMedicalRecord__Group__2 ;
    public final void rule__InsertMedicalRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2108:1: ( rule__InsertMedicalRecord__Group__1__Impl rule__InsertMedicalRecord__Group__2 )
            // InternalQueryDsl.g:2109:2: rule__InsertMedicalRecord__Group__1__Impl rule__InsertMedicalRecord__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InsertMedicalRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__2();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__1"


    // $ANTLR start "rule__InsertMedicalRecord__Group__1__Impl"
    // InternalQueryDsl.g:2116:1: rule__InsertMedicalRecord__Group__1__Impl : ( 'Values(' ) ;
    public final void rule__InsertMedicalRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2120:1: ( ( 'Values(' ) )
            // InternalQueryDsl.g:2121:1: ( 'Values(' )
            {
            // InternalQueryDsl.g:2121:1: ( 'Values(' )
            // InternalQueryDsl.g:2122:2: 'Values('
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getValuesKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getValuesKeyword_1()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__1__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__2"
    // InternalQueryDsl.g:2131:1: rule__InsertMedicalRecord__Group__2 : rule__InsertMedicalRecord__Group__2__Impl rule__InsertMedicalRecord__Group__3 ;
    public final void rule__InsertMedicalRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2135:1: ( rule__InsertMedicalRecord__Group__2__Impl rule__InsertMedicalRecord__Group__3 )
            // InternalQueryDsl.g:2136:2: rule__InsertMedicalRecord__Group__2__Impl rule__InsertMedicalRecord__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__3();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__2"


    // $ANTLR start "rule__InsertMedicalRecord__Group__2__Impl"
    // InternalQueryDsl.g:2143:1: rule__InsertMedicalRecord__Group__2__Impl : ( ( rule__InsertMedicalRecord__RecordIdAssignment_2 ) ) ;
    public final void rule__InsertMedicalRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2147:1: ( ( ( rule__InsertMedicalRecord__RecordIdAssignment_2 ) ) )
            // InternalQueryDsl.g:2148:1: ( ( rule__InsertMedicalRecord__RecordIdAssignment_2 ) )
            {
            // InternalQueryDsl.g:2148:1: ( ( rule__InsertMedicalRecord__RecordIdAssignment_2 ) )
            // InternalQueryDsl.g:2149:2: ( rule__InsertMedicalRecord__RecordIdAssignment_2 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getRecordIdAssignment_2()); 
            // InternalQueryDsl.g:2150:2: ( rule__InsertMedicalRecord__RecordIdAssignment_2 )
            // InternalQueryDsl.g:2150:3: rule__InsertMedicalRecord__RecordIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__RecordIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getRecordIdAssignment_2()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__2__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__3"
    // InternalQueryDsl.g:2158:1: rule__InsertMedicalRecord__Group__3 : rule__InsertMedicalRecord__Group__3__Impl rule__InsertMedicalRecord__Group__4 ;
    public final void rule__InsertMedicalRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2162:1: ( rule__InsertMedicalRecord__Group__3__Impl rule__InsertMedicalRecord__Group__4 )
            // InternalQueryDsl.g:2163:2: rule__InsertMedicalRecord__Group__3__Impl rule__InsertMedicalRecord__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__InsertMedicalRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__4();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__3"


    // $ANTLR start "rule__InsertMedicalRecord__Group__3__Impl"
    // InternalQueryDsl.g:2170:1: rule__InsertMedicalRecord__Group__3__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2174:1: ( ( ',' ) )
            // InternalQueryDsl.g:2175:1: ( ',' )
            {
            // InternalQueryDsl.g:2175:1: ( ',' )
            // InternalQueryDsl.g:2176:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__3__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__4"
    // InternalQueryDsl.g:2185:1: rule__InsertMedicalRecord__Group__4 : rule__InsertMedicalRecord__Group__4__Impl rule__InsertMedicalRecord__Group__5 ;
    public final void rule__InsertMedicalRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2189:1: ( rule__InsertMedicalRecord__Group__4__Impl rule__InsertMedicalRecord__Group__5 )
            // InternalQueryDsl.g:2190:2: rule__InsertMedicalRecord__Group__4__Impl rule__InsertMedicalRecord__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__5();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__4"


    // $ANTLR start "rule__InsertMedicalRecord__Group__4__Impl"
    // InternalQueryDsl.g:2197:1: rule__InsertMedicalRecord__Group__4__Impl : ( ( rule__InsertMedicalRecord__PatientIdAssignment_4 ) ) ;
    public final void rule__InsertMedicalRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2201:1: ( ( ( rule__InsertMedicalRecord__PatientIdAssignment_4 ) ) )
            // InternalQueryDsl.g:2202:1: ( ( rule__InsertMedicalRecord__PatientIdAssignment_4 ) )
            {
            // InternalQueryDsl.g:2202:1: ( ( rule__InsertMedicalRecord__PatientIdAssignment_4 ) )
            // InternalQueryDsl.g:2203:2: ( rule__InsertMedicalRecord__PatientIdAssignment_4 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getPatientIdAssignment_4()); 
            // InternalQueryDsl.g:2204:2: ( rule__InsertMedicalRecord__PatientIdAssignment_4 )
            // InternalQueryDsl.g:2204:3: rule__InsertMedicalRecord__PatientIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__PatientIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getPatientIdAssignment_4()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__4__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__5"
    // InternalQueryDsl.g:2212:1: rule__InsertMedicalRecord__Group__5 : rule__InsertMedicalRecord__Group__5__Impl rule__InsertMedicalRecord__Group__6 ;
    public final void rule__InsertMedicalRecord__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2216:1: ( rule__InsertMedicalRecord__Group__5__Impl rule__InsertMedicalRecord__Group__6 )
            // InternalQueryDsl.g:2217:2: rule__InsertMedicalRecord__Group__5__Impl rule__InsertMedicalRecord__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__InsertMedicalRecord__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__6();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__5"


    // $ANTLR start "rule__InsertMedicalRecord__Group__5__Impl"
    // InternalQueryDsl.g:2224:1: rule__InsertMedicalRecord__Group__5__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2228:1: ( ( ',' ) )
            // InternalQueryDsl.g:2229:1: ( ',' )
            {
            // InternalQueryDsl.g:2229:1: ( ',' )
            // InternalQueryDsl.g:2230:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__5__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__6"
    // InternalQueryDsl.g:2239:1: rule__InsertMedicalRecord__Group__6 : rule__InsertMedicalRecord__Group__6__Impl rule__InsertMedicalRecord__Group__7 ;
    public final void rule__InsertMedicalRecord__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2243:1: ( rule__InsertMedicalRecord__Group__6__Impl rule__InsertMedicalRecord__Group__7 )
            // InternalQueryDsl.g:2244:2: rule__InsertMedicalRecord__Group__6__Impl rule__InsertMedicalRecord__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__7();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__6"


    // $ANTLR start "rule__InsertMedicalRecord__Group__6__Impl"
    // InternalQueryDsl.g:2251:1: rule__InsertMedicalRecord__Group__6__Impl : ( ( rule__InsertMedicalRecord__DoctorIdAssignment_6 ) ) ;
    public final void rule__InsertMedicalRecord__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2255:1: ( ( ( rule__InsertMedicalRecord__DoctorIdAssignment_6 ) ) )
            // InternalQueryDsl.g:2256:1: ( ( rule__InsertMedicalRecord__DoctorIdAssignment_6 ) )
            {
            // InternalQueryDsl.g:2256:1: ( ( rule__InsertMedicalRecord__DoctorIdAssignment_6 ) )
            // InternalQueryDsl.g:2257:2: ( rule__InsertMedicalRecord__DoctorIdAssignment_6 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDoctorIdAssignment_6()); 
            // InternalQueryDsl.g:2258:2: ( rule__InsertMedicalRecord__DoctorIdAssignment_6 )
            // InternalQueryDsl.g:2258:3: rule__InsertMedicalRecord__DoctorIdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__DoctorIdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getDoctorIdAssignment_6()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__6__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__7"
    // InternalQueryDsl.g:2266:1: rule__InsertMedicalRecord__Group__7 : rule__InsertMedicalRecord__Group__7__Impl rule__InsertMedicalRecord__Group__8 ;
    public final void rule__InsertMedicalRecord__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2270:1: ( rule__InsertMedicalRecord__Group__7__Impl rule__InsertMedicalRecord__Group__8 )
            // InternalQueryDsl.g:2271:2: rule__InsertMedicalRecord__Group__7__Impl rule__InsertMedicalRecord__Group__8
            {
            pushFollow(FOLLOW_22);
            rule__InsertMedicalRecord__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__8();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__7"


    // $ANTLR start "rule__InsertMedicalRecord__Group__7__Impl"
    // InternalQueryDsl.g:2278:1: rule__InsertMedicalRecord__Group__7__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2282:1: ( ( ',' ) )
            // InternalQueryDsl.g:2283:1: ( ',' )
            {
            // InternalQueryDsl.g:2283:1: ( ',' )
            // InternalQueryDsl.g:2284:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__7__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__8"
    // InternalQueryDsl.g:2293:1: rule__InsertMedicalRecord__Group__8 : rule__InsertMedicalRecord__Group__8__Impl rule__InsertMedicalRecord__Group__9 ;
    public final void rule__InsertMedicalRecord__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2297:1: ( rule__InsertMedicalRecord__Group__8__Impl rule__InsertMedicalRecord__Group__9 )
            // InternalQueryDsl.g:2298:2: rule__InsertMedicalRecord__Group__8__Impl rule__InsertMedicalRecord__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__9();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__8"


    // $ANTLR start "rule__InsertMedicalRecord__Group__8__Impl"
    // InternalQueryDsl.g:2305:1: rule__InsertMedicalRecord__Group__8__Impl : ( ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 ) ) ;
    public final void rule__InsertMedicalRecord__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2309:1: ( ( ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 ) ) )
            // InternalQueryDsl.g:2310:1: ( ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 ) )
            {
            // InternalQueryDsl.g:2310:1: ( ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 ) )
            // InternalQueryDsl.g:2311:2: ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getMedicalConditionAssignment_8()); 
            // InternalQueryDsl.g:2312:2: ( rule__InsertMedicalRecord__MedicalConditionAssignment_8 )
            // InternalQueryDsl.g:2312:3: rule__InsertMedicalRecord__MedicalConditionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__MedicalConditionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getMedicalConditionAssignment_8()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__8__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__9"
    // InternalQueryDsl.g:2320:1: rule__InsertMedicalRecord__Group__9 : rule__InsertMedicalRecord__Group__9__Impl rule__InsertMedicalRecord__Group__10 ;
    public final void rule__InsertMedicalRecord__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2324:1: ( rule__InsertMedicalRecord__Group__9__Impl rule__InsertMedicalRecord__Group__10 )
            // InternalQueryDsl.g:2325:2: rule__InsertMedicalRecord__Group__9__Impl rule__InsertMedicalRecord__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__InsertMedicalRecord__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__10();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__9"


    // $ANTLR start "rule__InsertMedicalRecord__Group__9__Impl"
    // InternalQueryDsl.g:2332:1: rule__InsertMedicalRecord__Group__9__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2336:1: ( ( ',' ) )
            // InternalQueryDsl.g:2337:1: ( ',' )
            {
            // InternalQueryDsl.g:2337:1: ( ',' )
            // InternalQueryDsl.g:2338:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_9()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__9__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__10"
    // InternalQueryDsl.g:2347:1: rule__InsertMedicalRecord__Group__10 : rule__InsertMedicalRecord__Group__10__Impl rule__InsertMedicalRecord__Group__11 ;
    public final void rule__InsertMedicalRecord__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2351:1: ( rule__InsertMedicalRecord__Group__10__Impl rule__InsertMedicalRecord__Group__11 )
            // InternalQueryDsl.g:2352:2: rule__InsertMedicalRecord__Group__10__Impl rule__InsertMedicalRecord__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__11();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__10"


    // $ANTLR start "rule__InsertMedicalRecord__Group__10__Impl"
    // InternalQueryDsl.g:2359:1: rule__InsertMedicalRecord__Group__10__Impl : ( ( rule__InsertMedicalRecord__DateAssignment_10 ) ) ;
    public final void rule__InsertMedicalRecord__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2363:1: ( ( ( rule__InsertMedicalRecord__DateAssignment_10 ) ) )
            // InternalQueryDsl.g:2364:1: ( ( rule__InsertMedicalRecord__DateAssignment_10 ) )
            {
            // InternalQueryDsl.g:2364:1: ( ( rule__InsertMedicalRecord__DateAssignment_10 ) )
            // InternalQueryDsl.g:2365:2: ( rule__InsertMedicalRecord__DateAssignment_10 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDateAssignment_10()); 
            // InternalQueryDsl.g:2366:2: ( rule__InsertMedicalRecord__DateAssignment_10 )
            // InternalQueryDsl.g:2366:3: rule__InsertMedicalRecord__DateAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__DateAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getDateAssignment_10()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__10__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__11"
    // InternalQueryDsl.g:2374:1: rule__InsertMedicalRecord__Group__11 : rule__InsertMedicalRecord__Group__11__Impl rule__InsertMedicalRecord__Group__12 ;
    public final void rule__InsertMedicalRecord__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2378:1: ( rule__InsertMedicalRecord__Group__11__Impl rule__InsertMedicalRecord__Group__12 )
            // InternalQueryDsl.g:2379:2: rule__InsertMedicalRecord__Group__11__Impl rule__InsertMedicalRecord__Group__12
            {
            pushFollow(FOLLOW_24);
            rule__InsertMedicalRecord__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__12();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__11"


    // $ANTLR start "rule__InsertMedicalRecord__Group__11__Impl"
    // InternalQueryDsl.g:2386:1: rule__InsertMedicalRecord__Group__11__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2390:1: ( ( ',' ) )
            // InternalQueryDsl.g:2391:1: ( ',' )
            {
            // InternalQueryDsl.g:2391:1: ( ',' )
            // InternalQueryDsl.g:2392:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_11()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__11__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__12"
    // InternalQueryDsl.g:2401:1: rule__InsertMedicalRecord__Group__12 : rule__InsertMedicalRecord__Group__12__Impl rule__InsertMedicalRecord__Group__13 ;
    public final void rule__InsertMedicalRecord__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2405:1: ( rule__InsertMedicalRecord__Group__12__Impl rule__InsertMedicalRecord__Group__13 )
            // InternalQueryDsl.g:2406:2: rule__InsertMedicalRecord__Group__12__Impl rule__InsertMedicalRecord__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__InsertMedicalRecord__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__13();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__12"


    // $ANTLR start "rule__InsertMedicalRecord__Group__12__Impl"
    // InternalQueryDsl.g:2413:1: rule__InsertMedicalRecord__Group__12__Impl : ( ( rule__InsertMedicalRecord__PriceAssignment_12 ) ) ;
    public final void rule__InsertMedicalRecord__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2417:1: ( ( ( rule__InsertMedicalRecord__PriceAssignment_12 ) ) )
            // InternalQueryDsl.g:2418:1: ( ( rule__InsertMedicalRecord__PriceAssignment_12 ) )
            {
            // InternalQueryDsl.g:2418:1: ( ( rule__InsertMedicalRecord__PriceAssignment_12 ) )
            // InternalQueryDsl.g:2419:2: ( rule__InsertMedicalRecord__PriceAssignment_12 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getPriceAssignment_12()); 
            // InternalQueryDsl.g:2420:2: ( rule__InsertMedicalRecord__PriceAssignment_12 )
            // InternalQueryDsl.g:2420:3: rule__InsertMedicalRecord__PriceAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__PriceAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getPriceAssignment_12()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__12__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__13"
    // InternalQueryDsl.g:2428:1: rule__InsertMedicalRecord__Group__13 : rule__InsertMedicalRecord__Group__13__Impl rule__InsertMedicalRecord__Group__14 ;
    public final void rule__InsertMedicalRecord__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2432:1: ( rule__InsertMedicalRecord__Group__13__Impl rule__InsertMedicalRecord__Group__14 )
            // InternalQueryDsl.g:2433:2: rule__InsertMedicalRecord__Group__13__Impl rule__InsertMedicalRecord__Group__14
            {
            pushFollow(FOLLOW_25);
            rule__InsertMedicalRecord__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__14();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__13"


    // $ANTLR start "rule__InsertMedicalRecord__Group__13__Impl"
    // InternalQueryDsl.g:2440:1: rule__InsertMedicalRecord__Group__13__Impl : ( ',' ) ;
    public final void rule__InsertMedicalRecord__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2444:1: ( ( ',' ) )
            // InternalQueryDsl.g:2445:1: ( ',' )
            {
            // InternalQueryDsl.g:2445:1: ( ',' )
            // InternalQueryDsl.g:2446:2: ','
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getCommaKeyword_13()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__13__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__14"
    // InternalQueryDsl.g:2455:1: rule__InsertMedicalRecord__Group__14 : rule__InsertMedicalRecord__Group__14__Impl rule__InsertMedicalRecord__Group__15 ;
    public final void rule__InsertMedicalRecord__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2459:1: ( rule__InsertMedicalRecord__Group__14__Impl rule__InsertMedicalRecord__Group__15 )
            // InternalQueryDsl.g:2460:2: rule__InsertMedicalRecord__Group__14__Impl rule__InsertMedicalRecord__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__InsertMedicalRecord__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__15();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__14"


    // $ANTLR start "rule__InsertMedicalRecord__Group__14__Impl"
    // InternalQueryDsl.g:2467:1: rule__InsertMedicalRecord__Group__14__Impl : ( ( rule__InsertMedicalRecord__DescriptionAssignment_14 ) ) ;
    public final void rule__InsertMedicalRecord__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2471:1: ( ( ( rule__InsertMedicalRecord__DescriptionAssignment_14 ) ) )
            // InternalQueryDsl.g:2472:1: ( ( rule__InsertMedicalRecord__DescriptionAssignment_14 ) )
            {
            // InternalQueryDsl.g:2472:1: ( ( rule__InsertMedicalRecord__DescriptionAssignment_14 ) )
            // InternalQueryDsl.g:2473:2: ( rule__InsertMedicalRecord__DescriptionAssignment_14 )
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDescriptionAssignment_14()); 
            // InternalQueryDsl.g:2474:2: ( rule__InsertMedicalRecord__DescriptionAssignment_14 )
            // InternalQueryDsl.g:2474:3: rule__InsertMedicalRecord__DescriptionAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__DescriptionAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getInsertMedicalRecordAccess().getDescriptionAssignment_14()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__14__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__15"
    // InternalQueryDsl.g:2482:1: rule__InsertMedicalRecord__Group__15 : rule__InsertMedicalRecord__Group__15__Impl rule__InsertMedicalRecord__Group__16 ;
    public final void rule__InsertMedicalRecord__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2486:1: ( rule__InsertMedicalRecord__Group__15__Impl rule__InsertMedicalRecord__Group__16 )
            // InternalQueryDsl.g:2487:2: rule__InsertMedicalRecord__Group__15__Impl rule__InsertMedicalRecord__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__InsertMedicalRecord__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__16();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__15"


    // $ANTLR start "rule__InsertMedicalRecord__Group__15__Impl"
    // InternalQueryDsl.g:2494:1: rule__InsertMedicalRecord__Group__15__Impl : ( ')' ) ;
    public final void rule__InsertMedicalRecord__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2498:1: ( ( ')' ) )
            // InternalQueryDsl.g:2499:1: ( ')' )
            {
            // InternalQueryDsl.g:2499:1: ( ')' )
            // InternalQueryDsl.g:2500:2: ')'
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getRightParenthesisKeyword_15()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__15__Impl"


    // $ANTLR start "rule__InsertMedicalRecord__Group__16"
    // InternalQueryDsl.g:2509:1: rule__InsertMedicalRecord__Group__16 : rule__InsertMedicalRecord__Group__16__Impl ;
    public final void rule__InsertMedicalRecord__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2513:1: ( rule__InsertMedicalRecord__Group__16__Impl )
            // InternalQueryDsl.g:2514:2: rule__InsertMedicalRecord__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertMedicalRecord__Group__16__Impl();

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__16"


    // $ANTLR start "rule__InsertMedicalRecord__Group__16__Impl"
    // InternalQueryDsl.g:2520:1: rule__InsertMedicalRecord__Group__16__Impl : ( ';' ) ;
    public final void rule__InsertMedicalRecord__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2524:1: ( ( ';' ) )
            // InternalQueryDsl.g:2525:1: ( ';' )
            {
            // InternalQueryDsl.g:2525:1: ( ';' )
            // InternalQueryDsl.g:2526:2: ';'
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getSemicolonKeyword_16()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getSemicolonKeyword_16()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__Group__16__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__0"
    // InternalQueryDsl.g:2536:1: rule__InsertPatientMonitoring__Group__0 : rule__InsertPatientMonitoring__Group__0__Impl rule__InsertPatientMonitoring__Group__1 ;
    public final void rule__InsertPatientMonitoring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2540:1: ( rule__InsertPatientMonitoring__Group__0__Impl rule__InsertPatientMonitoring__Group__1 )
            // InternalQueryDsl.g:2541:2: rule__InsertPatientMonitoring__Group__0__Impl rule__InsertPatientMonitoring__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InsertPatientMonitoring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__1();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__0"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__0__Impl"
    // InternalQueryDsl.g:2548:1: rule__InsertPatientMonitoring__Group__0__Impl : ( 'PatientMonitoring' ) ;
    public final void rule__InsertPatientMonitoring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2552:1: ( ( 'PatientMonitoring' ) )
            // InternalQueryDsl.g:2553:1: ( 'PatientMonitoring' )
            {
            // InternalQueryDsl.g:2553:1: ( 'PatientMonitoring' )
            // InternalQueryDsl.g:2554:2: 'PatientMonitoring'
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getPatientMonitoringKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getPatientMonitoringKeyword_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__0__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__1"
    // InternalQueryDsl.g:2563:1: rule__InsertPatientMonitoring__Group__1 : rule__InsertPatientMonitoring__Group__1__Impl rule__InsertPatientMonitoring__Group__2 ;
    public final void rule__InsertPatientMonitoring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2567:1: ( rule__InsertPatientMonitoring__Group__1__Impl rule__InsertPatientMonitoring__Group__2 )
            // InternalQueryDsl.g:2568:2: rule__InsertPatientMonitoring__Group__1__Impl rule__InsertPatientMonitoring__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InsertPatientMonitoring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__2();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__1"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__1__Impl"
    // InternalQueryDsl.g:2575:1: rule__InsertPatientMonitoring__Group__1__Impl : ( 'Values(' ) ;
    public final void rule__InsertPatientMonitoring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2579:1: ( ( 'Values(' ) )
            // InternalQueryDsl.g:2580:1: ( 'Values(' )
            {
            // InternalQueryDsl.g:2580:1: ( 'Values(' )
            // InternalQueryDsl.g:2581:2: 'Values('
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getValuesKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getValuesKeyword_1()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__1__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__2"
    // InternalQueryDsl.g:2590:1: rule__InsertPatientMonitoring__Group__2 : rule__InsertPatientMonitoring__Group__2__Impl rule__InsertPatientMonitoring__Group__3 ;
    public final void rule__InsertPatientMonitoring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2594:1: ( rule__InsertPatientMonitoring__Group__2__Impl rule__InsertPatientMonitoring__Group__3 )
            // InternalQueryDsl.g:2595:2: rule__InsertPatientMonitoring__Group__2__Impl rule__InsertPatientMonitoring__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__3();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__2"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__2__Impl"
    // InternalQueryDsl.g:2602:1: rule__InsertPatientMonitoring__Group__2__Impl : ( ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2606:1: ( ( ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 ) ) )
            // InternalQueryDsl.g:2607:1: ( ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 ) )
            {
            // InternalQueryDsl.g:2607:1: ( ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 ) )
            // InternalQueryDsl.g:2608:2: ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getMonitoringIdAssignment_2()); 
            // InternalQueryDsl.g:2609:2: ( rule__InsertPatientMonitoring__MonitoringIdAssignment_2 )
            // InternalQueryDsl.g:2609:3: rule__InsertPatientMonitoring__MonitoringIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__MonitoringIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getMonitoringIdAssignment_2()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__2__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__3"
    // InternalQueryDsl.g:2617:1: rule__InsertPatientMonitoring__Group__3 : rule__InsertPatientMonitoring__Group__3__Impl rule__InsertPatientMonitoring__Group__4 ;
    public final void rule__InsertPatientMonitoring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2621:1: ( rule__InsertPatientMonitoring__Group__3__Impl rule__InsertPatientMonitoring__Group__4 )
            // InternalQueryDsl.g:2622:2: rule__InsertPatientMonitoring__Group__3__Impl rule__InsertPatientMonitoring__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__InsertPatientMonitoring__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__4();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__3"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__3__Impl"
    // InternalQueryDsl.g:2629:1: rule__InsertPatientMonitoring__Group__3__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2633:1: ( ( ',' ) )
            // InternalQueryDsl.g:2634:1: ( ',' )
            {
            // InternalQueryDsl.g:2634:1: ( ',' )
            // InternalQueryDsl.g:2635:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__3__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__4"
    // InternalQueryDsl.g:2644:1: rule__InsertPatientMonitoring__Group__4 : rule__InsertPatientMonitoring__Group__4__Impl rule__InsertPatientMonitoring__Group__5 ;
    public final void rule__InsertPatientMonitoring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2648:1: ( rule__InsertPatientMonitoring__Group__4__Impl rule__InsertPatientMonitoring__Group__5 )
            // InternalQueryDsl.g:2649:2: rule__InsertPatientMonitoring__Group__4__Impl rule__InsertPatientMonitoring__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__5();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__4"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__4__Impl"
    // InternalQueryDsl.g:2656:1: rule__InsertPatientMonitoring__Group__4__Impl : ( ( rule__InsertPatientMonitoring__PatientIdAssignment_4 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2660:1: ( ( ( rule__InsertPatientMonitoring__PatientIdAssignment_4 ) ) )
            // InternalQueryDsl.g:2661:1: ( ( rule__InsertPatientMonitoring__PatientIdAssignment_4 ) )
            {
            // InternalQueryDsl.g:2661:1: ( ( rule__InsertPatientMonitoring__PatientIdAssignment_4 ) )
            // InternalQueryDsl.g:2662:2: ( rule__InsertPatientMonitoring__PatientIdAssignment_4 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getPatientIdAssignment_4()); 
            // InternalQueryDsl.g:2663:2: ( rule__InsertPatientMonitoring__PatientIdAssignment_4 )
            // InternalQueryDsl.g:2663:3: rule__InsertPatientMonitoring__PatientIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__PatientIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getPatientIdAssignment_4()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__4__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__5"
    // InternalQueryDsl.g:2671:1: rule__InsertPatientMonitoring__Group__5 : rule__InsertPatientMonitoring__Group__5__Impl rule__InsertPatientMonitoring__Group__6 ;
    public final void rule__InsertPatientMonitoring__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2675:1: ( rule__InsertPatientMonitoring__Group__5__Impl rule__InsertPatientMonitoring__Group__6 )
            // InternalQueryDsl.g:2676:2: rule__InsertPatientMonitoring__Group__5__Impl rule__InsertPatientMonitoring__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__InsertPatientMonitoring__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__6();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__5"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__5__Impl"
    // InternalQueryDsl.g:2683:1: rule__InsertPatientMonitoring__Group__5__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2687:1: ( ( ',' ) )
            // InternalQueryDsl.g:2688:1: ( ',' )
            {
            // InternalQueryDsl.g:2688:1: ( ',' )
            // InternalQueryDsl.g:2689:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__5__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__6"
    // InternalQueryDsl.g:2698:1: rule__InsertPatientMonitoring__Group__6 : rule__InsertPatientMonitoring__Group__6__Impl rule__InsertPatientMonitoring__Group__7 ;
    public final void rule__InsertPatientMonitoring__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2702:1: ( rule__InsertPatientMonitoring__Group__6__Impl rule__InsertPatientMonitoring__Group__7 )
            // InternalQueryDsl.g:2703:2: rule__InsertPatientMonitoring__Group__6__Impl rule__InsertPatientMonitoring__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__7();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__6"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__6__Impl"
    // InternalQueryDsl.g:2710:1: rule__InsertPatientMonitoring__Group__6__Impl : ( ( rule__InsertPatientMonitoring__CategoryAssignment_6 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2714:1: ( ( ( rule__InsertPatientMonitoring__CategoryAssignment_6 ) ) )
            // InternalQueryDsl.g:2715:1: ( ( rule__InsertPatientMonitoring__CategoryAssignment_6 ) )
            {
            // InternalQueryDsl.g:2715:1: ( ( rule__InsertPatientMonitoring__CategoryAssignment_6 ) )
            // InternalQueryDsl.g:2716:2: ( rule__InsertPatientMonitoring__CategoryAssignment_6 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCategoryAssignment_6()); 
            // InternalQueryDsl.g:2717:2: ( rule__InsertPatientMonitoring__CategoryAssignment_6 )
            // InternalQueryDsl.g:2717:3: rule__InsertPatientMonitoring__CategoryAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__CategoryAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getCategoryAssignment_6()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__6__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__7"
    // InternalQueryDsl.g:2725:1: rule__InsertPatientMonitoring__Group__7 : rule__InsertPatientMonitoring__Group__7__Impl rule__InsertPatientMonitoring__Group__8 ;
    public final void rule__InsertPatientMonitoring__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2729:1: ( rule__InsertPatientMonitoring__Group__7__Impl rule__InsertPatientMonitoring__Group__8 )
            // InternalQueryDsl.g:2730:2: rule__InsertPatientMonitoring__Group__7__Impl rule__InsertPatientMonitoring__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__InsertPatientMonitoring__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__8();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__7"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__7__Impl"
    // InternalQueryDsl.g:2737:1: rule__InsertPatientMonitoring__Group__7__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2741:1: ( ( ',' ) )
            // InternalQueryDsl.g:2742:1: ( ',' )
            {
            // InternalQueryDsl.g:2742:1: ( ',' )
            // InternalQueryDsl.g:2743:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__7__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__8"
    // InternalQueryDsl.g:2752:1: rule__InsertPatientMonitoring__Group__8 : rule__InsertPatientMonitoring__Group__8__Impl rule__InsertPatientMonitoring__Group__9 ;
    public final void rule__InsertPatientMonitoring__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2756:1: ( rule__InsertPatientMonitoring__Group__8__Impl rule__InsertPatientMonitoring__Group__9 )
            // InternalQueryDsl.g:2757:2: rule__InsertPatientMonitoring__Group__8__Impl rule__InsertPatientMonitoring__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__9();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__8"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__8__Impl"
    // InternalQueryDsl.g:2764:1: rule__InsertPatientMonitoring__Group__8__Impl : ( ( rule__InsertPatientMonitoring__DateAssignment_8 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2768:1: ( ( ( rule__InsertPatientMonitoring__DateAssignment_8 ) ) )
            // InternalQueryDsl.g:2769:1: ( ( rule__InsertPatientMonitoring__DateAssignment_8 ) )
            {
            // InternalQueryDsl.g:2769:1: ( ( rule__InsertPatientMonitoring__DateAssignment_8 ) )
            // InternalQueryDsl.g:2770:2: ( rule__InsertPatientMonitoring__DateAssignment_8 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getDateAssignment_8()); 
            // InternalQueryDsl.g:2771:2: ( rule__InsertPatientMonitoring__DateAssignment_8 )
            // InternalQueryDsl.g:2771:3: rule__InsertPatientMonitoring__DateAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__DateAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getDateAssignment_8()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__8__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__9"
    // InternalQueryDsl.g:2779:1: rule__InsertPatientMonitoring__Group__9 : rule__InsertPatientMonitoring__Group__9__Impl rule__InsertPatientMonitoring__Group__10 ;
    public final void rule__InsertPatientMonitoring__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2783:1: ( rule__InsertPatientMonitoring__Group__9__Impl rule__InsertPatientMonitoring__Group__10 )
            // InternalQueryDsl.g:2784:2: rule__InsertPatientMonitoring__Group__9__Impl rule__InsertPatientMonitoring__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__InsertPatientMonitoring__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__10();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__9"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__9__Impl"
    // InternalQueryDsl.g:2791:1: rule__InsertPatientMonitoring__Group__9__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2795:1: ( ( ',' ) )
            // InternalQueryDsl.g:2796:1: ( ',' )
            {
            // InternalQueryDsl.g:2796:1: ( ',' )
            // InternalQueryDsl.g:2797:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_9()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__9__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__10"
    // InternalQueryDsl.g:2806:1: rule__InsertPatientMonitoring__Group__10 : rule__InsertPatientMonitoring__Group__10__Impl rule__InsertPatientMonitoring__Group__11 ;
    public final void rule__InsertPatientMonitoring__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2810:1: ( rule__InsertPatientMonitoring__Group__10__Impl rule__InsertPatientMonitoring__Group__11 )
            // InternalQueryDsl.g:2811:2: rule__InsertPatientMonitoring__Group__10__Impl rule__InsertPatientMonitoring__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__11();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__10"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__10__Impl"
    // InternalQueryDsl.g:2818:1: rule__InsertPatientMonitoring__Group__10__Impl : ( ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2822:1: ( ( ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 ) ) )
            // InternalQueryDsl.g:2823:1: ( ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 ) )
            {
            // InternalQueryDsl.g:2823:1: ( ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 ) )
            // InternalQueryDsl.g:2824:2: ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getRiskPerceptionAssignment_10()); 
            // InternalQueryDsl.g:2825:2: ( rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 )
            // InternalQueryDsl.g:2825:3: rule__InsertPatientMonitoring__RiskPerceptionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__RiskPerceptionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getRiskPerceptionAssignment_10()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__10__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__11"
    // InternalQueryDsl.g:2833:1: rule__InsertPatientMonitoring__Group__11 : rule__InsertPatientMonitoring__Group__11__Impl rule__InsertPatientMonitoring__Group__12 ;
    public final void rule__InsertPatientMonitoring__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2837:1: ( rule__InsertPatientMonitoring__Group__11__Impl rule__InsertPatientMonitoring__Group__12 )
            // InternalQueryDsl.g:2838:2: rule__InsertPatientMonitoring__Group__11__Impl rule__InsertPatientMonitoring__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__InsertPatientMonitoring__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__12();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__11"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__11__Impl"
    // InternalQueryDsl.g:2845:1: rule__InsertPatientMonitoring__Group__11__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2849:1: ( ( ',' ) )
            // InternalQueryDsl.g:2850:1: ( ',' )
            {
            // InternalQueryDsl.g:2850:1: ( ',' )
            // InternalQueryDsl.g:2851:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_11()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__11__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__12"
    // InternalQueryDsl.g:2860:1: rule__InsertPatientMonitoring__Group__12 : rule__InsertPatientMonitoring__Group__12__Impl rule__InsertPatientMonitoring__Group__13 ;
    public final void rule__InsertPatientMonitoring__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2864:1: ( rule__InsertPatientMonitoring__Group__12__Impl rule__InsertPatientMonitoring__Group__13 )
            // InternalQueryDsl.g:2865:2: rule__InsertPatientMonitoring__Group__12__Impl rule__InsertPatientMonitoring__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__InsertPatientMonitoring__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__13();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__12"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__12__Impl"
    // InternalQueryDsl.g:2872:1: rule__InsertPatientMonitoring__Group__12__Impl : ( ( rule__InsertPatientMonitoring__TreadtedAssignment_12 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2876:1: ( ( ( rule__InsertPatientMonitoring__TreadtedAssignment_12 ) ) )
            // InternalQueryDsl.g:2877:1: ( ( rule__InsertPatientMonitoring__TreadtedAssignment_12 ) )
            {
            // InternalQueryDsl.g:2877:1: ( ( rule__InsertPatientMonitoring__TreadtedAssignment_12 ) )
            // InternalQueryDsl.g:2878:2: ( rule__InsertPatientMonitoring__TreadtedAssignment_12 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getTreadtedAssignment_12()); 
            // InternalQueryDsl.g:2879:2: ( rule__InsertPatientMonitoring__TreadtedAssignment_12 )
            // InternalQueryDsl.g:2879:3: rule__InsertPatientMonitoring__TreadtedAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__TreadtedAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getTreadtedAssignment_12()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__12__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__13"
    // InternalQueryDsl.g:2887:1: rule__InsertPatientMonitoring__Group__13 : rule__InsertPatientMonitoring__Group__13__Impl rule__InsertPatientMonitoring__Group__14 ;
    public final void rule__InsertPatientMonitoring__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2891:1: ( rule__InsertPatientMonitoring__Group__13__Impl rule__InsertPatientMonitoring__Group__14 )
            // InternalQueryDsl.g:2892:2: rule__InsertPatientMonitoring__Group__13__Impl rule__InsertPatientMonitoring__Group__14
            {
            pushFollow(FOLLOW_20);
            rule__InsertPatientMonitoring__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__14();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__13"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__13__Impl"
    // InternalQueryDsl.g:2899:1: rule__InsertPatientMonitoring__Group__13__Impl : ( ',' ) ;
    public final void rule__InsertPatientMonitoring__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2903:1: ( ( ',' ) )
            // InternalQueryDsl.g:2904:1: ( ',' )
            {
            // InternalQueryDsl.g:2904:1: ( ',' )
            // InternalQueryDsl.g:2905:2: ','
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getCommaKeyword_13()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__13__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__14"
    // InternalQueryDsl.g:2914:1: rule__InsertPatientMonitoring__Group__14 : rule__InsertPatientMonitoring__Group__14__Impl rule__InsertPatientMonitoring__Group__15 ;
    public final void rule__InsertPatientMonitoring__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2918:1: ( rule__InsertPatientMonitoring__Group__14__Impl rule__InsertPatientMonitoring__Group__15 )
            // InternalQueryDsl.g:2919:2: rule__InsertPatientMonitoring__Group__14__Impl rule__InsertPatientMonitoring__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__InsertPatientMonitoring__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__15();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__14"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__14__Impl"
    // InternalQueryDsl.g:2926:1: rule__InsertPatientMonitoring__Group__14__Impl : ( ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 ) ) ;
    public final void rule__InsertPatientMonitoring__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2930:1: ( ( ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 ) ) )
            // InternalQueryDsl.g:2931:1: ( ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 ) )
            {
            // InternalQueryDsl.g:2931:1: ( ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 ) )
            // InternalQueryDsl.g:2932:2: ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 )
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getDeviceIdAssignment_14()); 
            // InternalQueryDsl.g:2933:2: ( rule__InsertPatientMonitoring__DeviceIdAssignment_14 )
            // InternalQueryDsl.g:2933:3: rule__InsertPatientMonitoring__DeviceIdAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__DeviceIdAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getInsertPatientMonitoringAccess().getDeviceIdAssignment_14()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__14__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__15"
    // InternalQueryDsl.g:2941:1: rule__InsertPatientMonitoring__Group__15 : rule__InsertPatientMonitoring__Group__15__Impl rule__InsertPatientMonitoring__Group__16 ;
    public final void rule__InsertPatientMonitoring__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2945:1: ( rule__InsertPatientMonitoring__Group__15__Impl rule__InsertPatientMonitoring__Group__16 )
            // InternalQueryDsl.g:2946:2: rule__InsertPatientMonitoring__Group__15__Impl rule__InsertPatientMonitoring__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__InsertPatientMonitoring__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__16();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__15"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__15__Impl"
    // InternalQueryDsl.g:2953:1: rule__InsertPatientMonitoring__Group__15__Impl : ( ')' ) ;
    public final void rule__InsertPatientMonitoring__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2957:1: ( ( ')' ) )
            // InternalQueryDsl.g:2958:1: ( ')' )
            {
            // InternalQueryDsl.g:2958:1: ( ')' )
            // InternalQueryDsl.g:2959:2: ')'
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getRightParenthesisKeyword_15()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__15__Impl"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__16"
    // InternalQueryDsl.g:2968:1: rule__InsertPatientMonitoring__Group__16 : rule__InsertPatientMonitoring__Group__16__Impl ;
    public final void rule__InsertPatientMonitoring__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2972:1: ( rule__InsertPatientMonitoring__Group__16__Impl )
            // InternalQueryDsl.g:2973:2: rule__InsertPatientMonitoring__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertPatientMonitoring__Group__16__Impl();

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__16"


    // $ANTLR start "rule__InsertPatientMonitoring__Group__16__Impl"
    // InternalQueryDsl.g:2979:1: rule__InsertPatientMonitoring__Group__16__Impl : ( ';' ) ;
    public final void rule__InsertPatientMonitoring__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2983:1: ( ( ';' ) )
            // InternalQueryDsl.g:2984:1: ( ';' )
            {
            // InternalQueryDsl.g:2984:1: ( ';' )
            // InternalQueryDsl.g:2985:2: ';'
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getSemicolonKeyword_16()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getSemicolonKeyword_16()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__Group__16__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__0"
    // InternalQueryDsl.g:2995:1: rule__InsertPrescription__Group__0 : rule__InsertPrescription__Group__0__Impl rule__InsertPrescription__Group__1 ;
    public final void rule__InsertPrescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:2999:1: ( rule__InsertPrescription__Group__0__Impl rule__InsertPrescription__Group__1 )
            // InternalQueryDsl.g:3000:2: rule__InsertPrescription__Group__0__Impl rule__InsertPrescription__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__InsertPrescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__1();

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
    // $ANTLR end "rule__InsertPrescription__Group__0"


    // $ANTLR start "rule__InsertPrescription__Group__0__Impl"
    // InternalQueryDsl.g:3007:1: rule__InsertPrescription__Group__0__Impl : ( 'Prescription' ) ;
    public final void rule__InsertPrescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3011:1: ( ( 'Prescription' ) )
            // InternalQueryDsl.g:3012:1: ( 'Prescription' )
            {
            // InternalQueryDsl.g:3012:1: ( 'Prescription' )
            // InternalQueryDsl.g:3013:2: 'Prescription'
            {
             before(grammarAccess.getInsertPrescriptionAccess().getPrescriptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getPrescriptionKeyword_0()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__0__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__1"
    // InternalQueryDsl.g:3022:1: rule__InsertPrescription__Group__1 : rule__InsertPrescription__Group__1__Impl rule__InsertPrescription__Group__2 ;
    public final void rule__InsertPrescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3026:1: ( rule__InsertPrescription__Group__1__Impl rule__InsertPrescription__Group__2 )
            // InternalQueryDsl.g:3027:2: rule__InsertPrescription__Group__1__Impl rule__InsertPrescription__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InsertPrescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__2();

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
    // $ANTLR end "rule__InsertPrescription__Group__1"


    // $ANTLR start "rule__InsertPrescription__Group__1__Impl"
    // InternalQueryDsl.g:3034:1: rule__InsertPrescription__Group__1__Impl : ( 'Values(' ) ;
    public final void rule__InsertPrescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3038:1: ( ( 'Values(' ) )
            // InternalQueryDsl.g:3039:1: ( 'Values(' )
            {
            // InternalQueryDsl.g:3039:1: ( 'Values(' )
            // InternalQueryDsl.g:3040:2: 'Values('
            {
             before(grammarAccess.getInsertPrescriptionAccess().getValuesKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getValuesKeyword_1()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__1__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__2"
    // InternalQueryDsl.g:3049:1: rule__InsertPrescription__Group__2 : rule__InsertPrescription__Group__2__Impl rule__InsertPrescription__Group__3 ;
    public final void rule__InsertPrescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3053:1: ( rule__InsertPrescription__Group__2__Impl rule__InsertPrescription__Group__3 )
            // InternalQueryDsl.g:3054:2: rule__InsertPrescription__Group__2__Impl rule__InsertPrescription__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__3();

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
    // $ANTLR end "rule__InsertPrescription__Group__2"


    // $ANTLR start "rule__InsertPrescription__Group__2__Impl"
    // InternalQueryDsl.g:3061:1: rule__InsertPrescription__Group__2__Impl : ( ( rule__InsertPrescription__PrescriptionIdAssignment_2 ) ) ;
    public final void rule__InsertPrescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3065:1: ( ( ( rule__InsertPrescription__PrescriptionIdAssignment_2 ) ) )
            // InternalQueryDsl.g:3066:1: ( ( rule__InsertPrescription__PrescriptionIdAssignment_2 ) )
            {
            // InternalQueryDsl.g:3066:1: ( ( rule__InsertPrescription__PrescriptionIdAssignment_2 ) )
            // InternalQueryDsl.g:3067:2: ( rule__InsertPrescription__PrescriptionIdAssignment_2 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getPrescriptionIdAssignment_2()); 
            // InternalQueryDsl.g:3068:2: ( rule__InsertPrescription__PrescriptionIdAssignment_2 )
            // InternalQueryDsl.g:3068:3: rule__InsertPrescription__PrescriptionIdAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__PrescriptionIdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getPrescriptionIdAssignment_2()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__2__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__3"
    // InternalQueryDsl.g:3076:1: rule__InsertPrescription__Group__3 : rule__InsertPrescription__Group__3__Impl rule__InsertPrescription__Group__4 ;
    public final void rule__InsertPrescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3080:1: ( rule__InsertPrescription__Group__3__Impl rule__InsertPrescription__Group__4 )
            // InternalQueryDsl.g:3081:2: rule__InsertPrescription__Group__3__Impl rule__InsertPrescription__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__InsertPrescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__4();

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
    // $ANTLR end "rule__InsertPrescription__Group__3"


    // $ANTLR start "rule__InsertPrescription__Group__3__Impl"
    // InternalQueryDsl.g:3088:1: rule__InsertPrescription__Group__3__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3092:1: ( ( ',' ) )
            // InternalQueryDsl.g:3093:1: ( ',' )
            {
            // InternalQueryDsl.g:3093:1: ( ',' )
            // InternalQueryDsl.g:3094:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_3()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__3__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__4"
    // InternalQueryDsl.g:3103:1: rule__InsertPrescription__Group__4 : rule__InsertPrescription__Group__4__Impl rule__InsertPrescription__Group__5 ;
    public final void rule__InsertPrescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3107:1: ( rule__InsertPrescription__Group__4__Impl rule__InsertPrescription__Group__5 )
            // InternalQueryDsl.g:3108:2: rule__InsertPrescription__Group__4__Impl rule__InsertPrescription__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__5();

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
    // $ANTLR end "rule__InsertPrescription__Group__4"


    // $ANTLR start "rule__InsertPrescription__Group__4__Impl"
    // InternalQueryDsl.g:3115:1: rule__InsertPrescription__Group__4__Impl : ( ( rule__InsertPrescription__RecordIdAssignment_4 ) ) ;
    public final void rule__InsertPrescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3119:1: ( ( ( rule__InsertPrescription__RecordIdAssignment_4 ) ) )
            // InternalQueryDsl.g:3120:1: ( ( rule__InsertPrescription__RecordIdAssignment_4 ) )
            {
            // InternalQueryDsl.g:3120:1: ( ( rule__InsertPrescription__RecordIdAssignment_4 ) )
            // InternalQueryDsl.g:3121:2: ( rule__InsertPrescription__RecordIdAssignment_4 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getRecordIdAssignment_4()); 
            // InternalQueryDsl.g:3122:2: ( rule__InsertPrescription__RecordIdAssignment_4 )
            // InternalQueryDsl.g:3122:3: rule__InsertPrescription__RecordIdAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__RecordIdAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getRecordIdAssignment_4()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__4__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__5"
    // InternalQueryDsl.g:3130:1: rule__InsertPrescription__Group__5 : rule__InsertPrescription__Group__5__Impl rule__InsertPrescription__Group__6 ;
    public final void rule__InsertPrescription__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3134:1: ( rule__InsertPrescription__Group__5__Impl rule__InsertPrescription__Group__6 )
            // InternalQueryDsl.g:3135:2: rule__InsertPrescription__Group__5__Impl rule__InsertPrescription__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__InsertPrescription__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__6();

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
    // $ANTLR end "rule__InsertPrescription__Group__5"


    // $ANTLR start "rule__InsertPrescription__Group__5__Impl"
    // InternalQueryDsl.g:3142:1: rule__InsertPrescription__Group__5__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3146:1: ( ( ',' ) )
            // InternalQueryDsl.g:3147:1: ( ',' )
            {
            // InternalQueryDsl.g:3147:1: ( ',' )
            // InternalQueryDsl.g:3148:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_5()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_5()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__5__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__6"
    // InternalQueryDsl.g:3157:1: rule__InsertPrescription__Group__6 : rule__InsertPrescription__Group__6__Impl rule__InsertPrescription__Group__7 ;
    public final void rule__InsertPrescription__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3161:1: ( rule__InsertPrescription__Group__6__Impl rule__InsertPrescription__Group__7 )
            // InternalQueryDsl.g:3162:2: rule__InsertPrescription__Group__6__Impl rule__InsertPrescription__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__7();

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
    // $ANTLR end "rule__InsertPrescription__Group__6"


    // $ANTLR start "rule__InsertPrescription__Group__6__Impl"
    // InternalQueryDsl.g:3169:1: rule__InsertPrescription__Group__6__Impl : ( ( rule__InsertPrescription__MedicationNameAssignment_6 ) ) ;
    public final void rule__InsertPrescription__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3173:1: ( ( ( rule__InsertPrescription__MedicationNameAssignment_6 ) ) )
            // InternalQueryDsl.g:3174:1: ( ( rule__InsertPrescription__MedicationNameAssignment_6 ) )
            {
            // InternalQueryDsl.g:3174:1: ( ( rule__InsertPrescription__MedicationNameAssignment_6 ) )
            // InternalQueryDsl.g:3175:2: ( rule__InsertPrescription__MedicationNameAssignment_6 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getMedicationNameAssignment_6()); 
            // InternalQueryDsl.g:3176:2: ( rule__InsertPrescription__MedicationNameAssignment_6 )
            // InternalQueryDsl.g:3176:3: rule__InsertPrescription__MedicationNameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__MedicationNameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getMedicationNameAssignment_6()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__6__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__7"
    // InternalQueryDsl.g:3184:1: rule__InsertPrescription__Group__7 : rule__InsertPrescription__Group__7__Impl rule__InsertPrescription__Group__8 ;
    public final void rule__InsertPrescription__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3188:1: ( rule__InsertPrescription__Group__7__Impl rule__InsertPrescription__Group__8 )
            // InternalQueryDsl.g:3189:2: rule__InsertPrescription__Group__7__Impl rule__InsertPrescription__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__InsertPrescription__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__8();

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
    // $ANTLR end "rule__InsertPrescription__Group__7"


    // $ANTLR start "rule__InsertPrescription__Group__7__Impl"
    // InternalQueryDsl.g:3196:1: rule__InsertPrescription__Group__7__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3200:1: ( ( ',' ) )
            // InternalQueryDsl.g:3201:1: ( ',' )
            {
            // InternalQueryDsl.g:3201:1: ( ',' )
            // InternalQueryDsl.g:3202:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_7()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_7()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__7__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__8"
    // InternalQueryDsl.g:3211:1: rule__InsertPrescription__Group__8 : rule__InsertPrescription__Group__8__Impl rule__InsertPrescription__Group__9 ;
    public final void rule__InsertPrescription__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3215:1: ( rule__InsertPrescription__Group__8__Impl rule__InsertPrescription__Group__9 )
            // InternalQueryDsl.g:3216:2: rule__InsertPrescription__Group__8__Impl rule__InsertPrescription__Group__9
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__9();

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
    // $ANTLR end "rule__InsertPrescription__Group__8"


    // $ANTLR start "rule__InsertPrescription__Group__8__Impl"
    // InternalQueryDsl.g:3223:1: rule__InsertPrescription__Group__8__Impl : ( ( rule__InsertPrescription__StartAssignment_8 ) ) ;
    public final void rule__InsertPrescription__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3227:1: ( ( ( rule__InsertPrescription__StartAssignment_8 ) ) )
            // InternalQueryDsl.g:3228:1: ( ( rule__InsertPrescription__StartAssignment_8 ) )
            {
            // InternalQueryDsl.g:3228:1: ( ( rule__InsertPrescription__StartAssignment_8 ) )
            // InternalQueryDsl.g:3229:2: ( rule__InsertPrescription__StartAssignment_8 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getStartAssignment_8()); 
            // InternalQueryDsl.g:3230:2: ( rule__InsertPrescription__StartAssignment_8 )
            // InternalQueryDsl.g:3230:3: rule__InsertPrescription__StartAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__StartAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getStartAssignment_8()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__8__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__9"
    // InternalQueryDsl.g:3238:1: rule__InsertPrescription__Group__9 : rule__InsertPrescription__Group__9__Impl rule__InsertPrescription__Group__10 ;
    public final void rule__InsertPrescription__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3242:1: ( rule__InsertPrescription__Group__9__Impl rule__InsertPrescription__Group__10 )
            // InternalQueryDsl.g:3243:2: rule__InsertPrescription__Group__9__Impl rule__InsertPrescription__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__InsertPrescription__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__10();

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
    // $ANTLR end "rule__InsertPrescription__Group__9"


    // $ANTLR start "rule__InsertPrescription__Group__9__Impl"
    // InternalQueryDsl.g:3250:1: rule__InsertPrescription__Group__9__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3254:1: ( ( ',' ) )
            // InternalQueryDsl.g:3255:1: ( ',' )
            {
            // InternalQueryDsl.g:3255:1: ( ',' )
            // InternalQueryDsl.g:3256:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_9()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_9()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__9__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__10"
    // InternalQueryDsl.g:3265:1: rule__InsertPrescription__Group__10 : rule__InsertPrescription__Group__10__Impl rule__InsertPrescription__Group__11 ;
    public final void rule__InsertPrescription__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3269:1: ( rule__InsertPrescription__Group__10__Impl rule__InsertPrescription__Group__11 )
            // InternalQueryDsl.g:3270:2: rule__InsertPrescription__Group__10__Impl rule__InsertPrescription__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__11();

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
    // $ANTLR end "rule__InsertPrescription__Group__10"


    // $ANTLR start "rule__InsertPrescription__Group__10__Impl"
    // InternalQueryDsl.g:3277:1: rule__InsertPrescription__Group__10__Impl : ( ( rule__InsertPrescription__EndAssignment_10 ) ) ;
    public final void rule__InsertPrescription__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3281:1: ( ( ( rule__InsertPrescription__EndAssignment_10 ) ) )
            // InternalQueryDsl.g:3282:1: ( ( rule__InsertPrescription__EndAssignment_10 ) )
            {
            // InternalQueryDsl.g:3282:1: ( ( rule__InsertPrescription__EndAssignment_10 ) )
            // InternalQueryDsl.g:3283:2: ( rule__InsertPrescription__EndAssignment_10 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getEndAssignment_10()); 
            // InternalQueryDsl.g:3284:2: ( rule__InsertPrescription__EndAssignment_10 )
            // InternalQueryDsl.g:3284:3: rule__InsertPrescription__EndAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__EndAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getEndAssignment_10()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__10__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__11"
    // InternalQueryDsl.g:3292:1: rule__InsertPrescription__Group__11 : rule__InsertPrescription__Group__11__Impl rule__InsertPrescription__Group__12 ;
    public final void rule__InsertPrescription__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3296:1: ( rule__InsertPrescription__Group__11__Impl rule__InsertPrescription__Group__12 )
            // InternalQueryDsl.g:3297:2: rule__InsertPrescription__Group__11__Impl rule__InsertPrescription__Group__12
            {
            pushFollow(FOLLOW_29);
            rule__InsertPrescription__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__12();

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
    // $ANTLR end "rule__InsertPrescription__Group__11"


    // $ANTLR start "rule__InsertPrescription__Group__11__Impl"
    // InternalQueryDsl.g:3304:1: rule__InsertPrescription__Group__11__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3308:1: ( ( ',' ) )
            // InternalQueryDsl.g:3309:1: ( ',' )
            {
            // InternalQueryDsl.g:3309:1: ( ',' )
            // InternalQueryDsl.g:3310:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_11()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_11()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__11__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__12"
    // InternalQueryDsl.g:3319:1: rule__InsertPrescription__Group__12 : rule__InsertPrescription__Group__12__Impl rule__InsertPrescription__Group__13 ;
    public final void rule__InsertPrescription__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3323:1: ( rule__InsertPrescription__Group__12__Impl rule__InsertPrescription__Group__13 )
            // InternalQueryDsl.g:3324:2: rule__InsertPrescription__Group__12__Impl rule__InsertPrescription__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__InsertPrescription__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__13();

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
    // $ANTLR end "rule__InsertPrescription__Group__12"


    // $ANTLR start "rule__InsertPrescription__Group__12__Impl"
    // InternalQueryDsl.g:3331:1: rule__InsertPrescription__Group__12__Impl : ( ( rule__InsertPrescription__OrderedAssignment_12 ) ) ;
    public final void rule__InsertPrescription__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3335:1: ( ( ( rule__InsertPrescription__OrderedAssignment_12 ) ) )
            // InternalQueryDsl.g:3336:1: ( ( rule__InsertPrescription__OrderedAssignment_12 ) )
            {
            // InternalQueryDsl.g:3336:1: ( ( rule__InsertPrescription__OrderedAssignment_12 ) )
            // InternalQueryDsl.g:3337:2: ( rule__InsertPrescription__OrderedAssignment_12 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getOrderedAssignment_12()); 
            // InternalQueryDsl.g:3338:2: ( rule__InsertPrescription__OrderedAssignment_12 )
            // InternalQueryDsl.g:3338:3: rule__InsertPrescription__OrderedAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__OrderedAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getOrderedAssignment_12()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__12__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__13"
    // InternalQueryDsl.g:3346:1: rule__InsertPrescription__Group__13 : rule__InsertPrescription__Group__13__Impl rule__InsertPrescription__Group__14 ;
    public final void rule__InsertPrescription__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3350:1: ( rule__InsertPrescription__Group__13__Impl rule__InsertPrescription__Group__14 )
            // InternalQueryDsl.g:3351:2: rule__InsertPrescription__Group__13__Impl rule__InsertPrescription__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__InsertPrescription__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__14();

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
    // $ANTLR end "rule__InsertPrescription__Group__13"


    // $ANTLR start "rule__InsertPrescription__Group__13__Impl"
    // InternalQueryDsl.g:3358:1: rule__InsertPrescription__Group__13__Impl : ( ',' ) ;
    public final void rule__InsertPrescription__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3362:1: ( ( ',' ) )
            // InternalQueryDsl.g:3363:1: ( ',' )
            {
            // InternalQueryDsl.g:3363:1: ( ',' )
            // InternalQueryDsl.g:3364:2: ','
            {
             before(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_13()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getCommaKeyword_13()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__13__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__14"
    // InternalQueryDsl.g:3373:1: rule__InsertPrescription__Group__14 : rule__InsertPrescription__Group__14__Impl rule__InsertPrescription__Group__15 ;
    public final void rule__InsertPrescription__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3377:1: ( rule__InsertPrescription__Group__14__Impl rule__InsertPrescription__Group__15 )
            // InternalQueryDsl.g:3378:2: rule__InsertPrescription__Group__14__Impl rule__InsertPrescription__Group__15
            {
            pushFollow(FOLLOW_26);
            rule__InsertPrescription__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__15();

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
    // $ANTLR end "rule__InsertPrescription__Group__14"


    // $ANTLR start "rule__InsertPrescription__Group__14__Impl"
    // InternalQueryDsl.g:3385:1: rule__InsertPrescription__Group__14__Impl : ( ( rule__InsertPrescription__PriceAssignment_14 ) ) ;
    public final void rule__InsertPrescription__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3389:1: ( ( ( rule__InsertPrescription__PriceAssignment_14 ) ) )
            // InternalQueryDsl.g:3390:1: ( ( rule__InsertPrescription__PriceAssignment_14 ) )
            {
            // InternalQueryDsl.g:3390:1: ( ( rule__InsertPrescription__PriceAssignment_14 ) )
            // InternalQueryDsl.g:3391:2: ( rule__InsertPrescription__PriceAssignment_14 )
            {
             before(grammarAccess.getInsertPrescriptionAccess().getPriceAssignment_14()); 
            // InternalQueryDsl.g:3392:2: ( rule__InsertPrescription__PriceAssignment_14 )
            // InternalQueryDsl.g:3392:3: rule__InsertPrescription__PriceAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__PriceAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getInsertPrescriptionAccess().getPriceAssignment_14()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__14__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__15"
    // InternalQueryDsl.g:3400:1: rule__InsertPrescription__Group__15 : rule__InsertPrescription__Group__15__Impl rule__InsertPrescription__Group__16 ;
    public final void rule__InsertPrescription__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3404:1: ( rule__InsertPrescription__Group__15__Impl rule__InsertPrescription__Group__16 )
            // InternalQueryDsl.g:3405:2: rule__InsertPrescription__Group__15__Impl rule__InsertPrescription__Group__16
            {
            pushFollow(FOLLOW_27);
            rule__InsertPrescription__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__16();

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
    // $ANTLR end "rule__InsertPrescription__Group__15"


    // $ANTLR start "rule__InsertPrescription__Group__15__Impl"
    // InternalQueryDsl.g:3412:1: rule__InsertPrescription__Group__15__Impl : ( ')' ) ;
    public final void rule__InsertPrescription__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3416:1: ( ( ')' ) )
            // InternalQueryDsl.g:3417:1: ( ')' )
            {
            // InternalQueryDsl.g:3417:1: ( ')' )
            // InternalQueryDsl.g:3418:2: ')'
            {
             before(grammarAccess.getInsertPrescriptionAccess().getRightParenthesisKeyword_15()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getRightParenthesisKeyword_15()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__15__Impl"


    // $ANTLR start "rule__InsertPrescription__Group__16"
    // InternalQueryDsl.g:3427:1: rule__InsertPrescription__Group__16 : rule__InsertPrescription__Group__16__Impl ;
    public final void rule__InsertPrescription__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3431:1: ( rule__InsertPrescription__Group__16__Impl )
            // InternalQueryDsl.g:3432:2: rule__InsertPrescription__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InsertPrescription__Group__16__Impl();

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
    // $ANTLR end "rule__InsertPrescription__Group__16"


    // $ANTLR start "rule__InsertPrescription__Group__16__Impl"
    // InternalQueryDsl.g:3438:1: rule__InsertPrescription__Group__16__Impl : ( ';' ) ;
    public final void rule__InsertPrescription__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3442:1: ( ( ';' ) )
            // InternalQueryDsl.g:3443:1: ( ';' )
            {
            // InternalQueryDsl.g:3443:1: ( ';' )
            // InternalQueryDsl.g:3444:2: ';'
            {
             before(grammarAccess.getInsertPrescriptionAccess().getSemicolonKeyword_16()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getSemicolonKeyword_16()); 

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
    // $ANTLR end "rule__InsertPrescription__Group__16__Impl"


    // $ANTLR start "rule__Drop__Group__0"
    // InternalQueryDsl.g:3454:1: rule__Drop__Group__0 : rule__Drop__Group__0__Impl rule__Drop__Group__1 ;
    public final void rule__Drop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3458:1: ( rule__Drop__Group__0__Impl rule__Drop__Group__1 )
            // InternalQueryDsl.g:3459:2: rule__Drop__Group__0__Impl rule__Drop__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__Drop__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group__1();

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
    // $ANTLR end "rule__Drop__Group__0"


    // $ANTLR start "rule__Drop__Group__0__Impl"
    // InternalQueryDsl.g:3466:1: rule__Drop__Group__0__Impl : ( 'DROP' ) ;
    public final void rule__Drop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3470:1: ( ( 'DROP' ) )
            // InternalQueryDsl.g:3471:1: ( 'DROP' )
            {
            // InternalQueryDsl.g:3471:1: ( 'DROP' )
            // InternalQueryDsl.g:3472:2: 'DROP'
            {
             before(grammarAccess.getDropAccess().getDROPKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getDROPKeyword_0()); 

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
    // $ANTLR end "rule__Drop__Group__0__Impl"


    // $ANTLR start "rule__Drop__Group__1"
    // InternalQueryDsl.g:3481:1: rule__Drop__Group__1 : rule__Drop__Group__1__Impl rule__Drop__Group__2 ;
    public final void rule__Drop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3485:1: ( rule__Drop__Group__1__Impl rule__Drop__Group__2 )
            // InternalQueryDsl.g:3486:2: rule__Drop__Group__1__Impl rule__Drop__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Drop__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group__2();

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
    // $ANTLR end "rule__Drop__Group__1"


    // $ANTLR start "rule__Drop__Group__1__Impl"
    // InternalQueryDsl.g:3493:1: rule__Drop__Group__1__Impl : ( 'TABLE' ) ;
    public final void rule__Drop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3497:1: ( ( 'TABLE' ) )
            // InternalQueryDsl.g:3498:1: ( 'TABLE' )
            {
            // InternalQueryDsl.g:3498:1: ( 'TABLE' )
            // InternalQueryDsl.g:3499:2: 'TABLE'
            {
             before(grammarAccess.getDropAccess().getTABLEKeyword_1()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getTABLEKeyword_1()); 

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
    // $ANTLR end "rule__Drop__Group__1__Impl"


    // $ANTLR start "rule__Drop__Group__2"
    // InternalQueryDsl.g:3508:1: rule__Drop__Group__2 : rule__Drop__Group__2__Impl rule__Drop__Group__3 ;
    public final void rule__Drop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3512:1: ( rule__Drop__Group__2__Impl rule__Drop__Group__3 )
            // InternalQueryDsl.g:3513:2: rule__Drop__Group__2__Impl rule__Drop__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Drop__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Drop__Group__3();

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
    // $ANTLR end "rule__Drop__Group__2"


    // $ANTLR start "rule__Drop__Group__2__Impl"
    // InternalQueryDsl.g:3520:1: rule__Drop__Group__2__Impl : ( ( rule__Drop__Table_nameAssignment_2 ) ) ;
    public final void rule__Drop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3524:1: ( ( ( rule__Drop__Table_nameAssignment_2 ) ) )
            // InternalQueryDsl.g:3525:1: ( ( rule__Drop__Table_nameAssignment_2 ) )
            {
            // InternalQueryDsl.g:3525:1: ( ( rule__Drop__Table_nameAssignment_2 ) )
            // InternalQueryDsl.g:3526:2: ( rule__Drop__Table_nameAssignment_2 )
            {
             before(grammarAccess.getDropAccess().getTable_nameAssignment_2()); 
            // InternalQueryDsl.g:3527:2: ( rule__Drop__Table_nameAssignment_2 )
            // InternalQueryDsl.g:3527:3: rule__Drop__Table_nameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Table_nameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDropAccess().getTable_nameAssignment_2()); 

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
    // $ANTLR end "rule__Drop__Group__2__Impl"


    // $ANTLR start "rule__Drop__Group__3"
    // InternalQueryDsl.g:3535:1: rule__Drop__Group__3 : rule__Drop__Group__3__Impl ;
    public final void rule__Drop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3539:1: ( rule__Drop__Group__3__Impl )
            // InternalQueryDsl.g:3540:2: rule__Drop__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Drop__Group__3__Impl();

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
    // $ANTLR end "rule__Drop__Group__3"


    // $ANTLR start "rule__Drop__Group__3__Impl"
    // InternalQueryDsl.g:3546:1: rule__Drop__Group__3__Impl : ( ';' ) ;
    public final void rule__Drop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3550:1: ( ( ';' ) )
            // InternalQueryDsl.g:3551:1: ( ';' )
            {
            // InternalQueryDsl.g:3551:1: ( ';' )
            // InternalQueryDsl.g:3552:2: ';'
            {
             before(grammarAccess.getDropAccess().getSemicolonKeyword_3()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDropAccess().getSemicolonKeyword_3()); 

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
    // $ANTLR end "rule__Drop__Group__3__Impl"


    // $ANTLR start "rule__Delete__Group__0"
    // InternalQueryDsl.g:3562:1: rule__Delete__Group__0 : rule__Delete__Group__0__Impl rule__Delete__Group__1 ;
    public final void rule__Delete__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3566:1: ( rule__Delete__Group__0__Impl rule__Delete__Group__1 )
            // InternalQueryDsl.g:3567:2: rule__Delete__Group__0__Impl rule__Delete__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Delete__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__1();

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
    // $ANTLR end "rule__Delete__Group__0"


    // $ANTLR start "rule__Delete__Group__0__Impl"
    // InternalQueryDsl.g:3574:1: rule__Delete__Group__0__Impl : ( 'DELETE' ) ;
    public final void rule__Delete__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3578:1: ( ( 'DELETE' ) )
            // InternalQueryDsl.g:3579:1: ( 'DELETE' )
            {
            // InternalQueryDsl.g:3579:1: ( 'DELETE' )
            // InternalQueryDsl.g:3580:2: 'DELETE'
            {
             before(grammarAccess.getDeleteAccess().getDELETEKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getDELETEKeyword_0()); 

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
    // $ANTLR end "rule__Delete__Group__0__Impl"


    // $ANTLR start "rule__Delete__Group__1"
    // InternalQueryDsl.g:3589:1: rule__Delete__Group__1 : rule__Delete__Group__1__Impl rule__Delete__Group__2 ;
    public final void rule__Delete__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3593:1: ( rule__Delete__Group__1__Impl rule__Delete__Group__2 )
            // InternalQueryDsl.g:3594:2: rule__Delete__Group__1__Impl rule__Delete__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Delete__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delete__Group__2();

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
    // $ANTLR end "rule__Delete__Group__1"


    // $ANTLR start "rule__Delete__Group__1__Impl"
    // InternalQueryDsl.g:3601:1: rule__Delete__Group__1__Impl : ( 'FROM' ) ;
    public final void rule__Delete__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3605:1: ( ( 'FROM' ) )
            // InternalQueryDsl.g:3606:1: ( 'FROM' )
            {
            // InternalQueryDsl.g:3606:1: ( 'FROM' )
            // InternalQueryDsl.g:3607:2: 'FROM'
            {
             before(grammarAccess.getDeleteAccess().getFROMKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getDeleteAccess().getFROMKeyword_1()); 

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
    // $ANTLR end "rule__Delete__Group__1__Impl"


    // $ANTLR start "rule__Delete__Group__2"
    // InternalQueryDsl.g:3616:1: rule__Delete__Group__2 : rule__Delete__Group__2__Impl ;
    public final void rule__Delete__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3620:1: ( rule__Delete__Group__2__Impl )
            // InternalQueryDsl.g:3621:2: rule__Delete__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Group__2__Impl();

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
    // $ANTLR end "rule__Delete__Group__2"


    // $ANTLR start "rule__Delete__Group__2__Impl"
    // InternalQueryDsl.g:3627:1: rule__Delete__Group__2__Impl : ( ( rule__Delete__Alternatives_2 ) ) ;
    public final void rule__Delete__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3631:1: ( ( ( rule__Delete__Alternatives_2 ) ) )
            // InternalQueryDsl.g:3632:1: ( ( rule__Delete__Alternatives_2 ) )
            {
            // InternalQueryDsl.g:3632:1: ( ( rule__Delete__Alternatives_2 ) )
            // InternalQueryDsl.g:3633:2: ( rule__Delete__Alternatives_2 )
            {
             before(grammarAccess.getDeleteAccess().getAlternatives_2()); 
            // InternalQueryDsl.g:3634:2: ( rule__Delete__Alternatives_2 )
            // InternalQueryDsl.g:3634:3: rule__Delete__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Delete__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Delete__Group__2__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__0"
    // InternalQueryDsl.g:3643:1: rule__DeleteMedicalRecord__Group__0 : rule__DeleteMedicalRecord__Group__0__Impl rule__DeleteMedicalRecord__Group__1 ;
    public final void rule__DeleteMedicalRecord__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3647:1: ( rule__DeleteMedicalRecord__Group__0__Impl rule__DeleteMedicalRecord__Group__1 )
            // InternalQueryDsl.g:3648:2: rule__DeleteMedicalRecord__Group__0__Impl rule__DeleteMedicalRecord__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DeleteMedicalRecord__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__1();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__0"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__0__Impl"
    // InternalQueryDsl.g:3655:1: rule__DeleteMedicalRecord__Group__0__Impl : ( 'MedicalRecord' ) ;
    public final void rule__DeleteMedicalRecord__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3659:1: ( ( 'MedicalRecord' ) )
            // InternalQueryDsl.g:3660:1: ( 'MedicalRecord' )
            {
            // InternalQueryDsl.g:3660:1: ( 'MedicalRecord' )
            // InternalQueryDsl.g:3661:2: 'MedicalRecord'
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getMedicalRecordKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDeleteMedicalRecordAccess().getMedicalRecordKeyword_0()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__0__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__1"
    // InternalQueryDsl.g:3670:1: rule__DeleteMedicalRecord__Group__1 : rule__DeleteMedicalRecord__Group__1__Impl rule__DeleteMedicalRecord__Group__2 ;
    public final void rule__DeleteMedicalRecord__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3674:1: ( rule__DeleteMedicalRecord__Group__1__Impl rule__DeleteMedicalRecord__Group__2 )
            // InternalQueryDsl.g:3675:2: rule__DeleteMedicalRecord__Group__1__Impl rule__DeleteMedicalRecord__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__DeleteMedicalRecord__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__2();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__1"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__1__Impl"
    // InternalQueryDsl.g:3682:1: rule__DeleteMedicalRecord__Group__1__Impl : ( 'WHERE' ) ;
    public final void rule__DeleteMedicalRecord__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3686:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:3687:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:3687:1: ( 'WHERE' )
            // InternalQueryDsl.g:3688:2: 'WHERE'
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getWHEREKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDeleteMedicalRecordAccess().getWHEREKeyword_1()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__1__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__2"
    // InternalQueryDsl.g:3697:1: rule__DeleteMedicalRecord__Group__2 : rule__DeleteMedicalRecord__Group__2__Impl rule__DeleteMedicalRecord__Group__3 ;
    public final void rule__DeleteMedicalRecord__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3701:1: ( rule__DeleteMedicalRecord__Group__2__Impl rule__DeleteMedicalRecord__Group__3 )
            // InternalQueryDsl.g:3702:2: rule__DeleteMedicalRecord__Group__2__Impl rule__DeleteMedicalRecord__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__DeleteMedicalRecord__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__3();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__2"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__2__Impl"
    // InternalQueryDsl.g:3709:1: rule__DeleteMedicalRecord__Group__2__Impl : ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 ) ) ;
    public final void rule__DeleteMedicalRecord__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3713:1: ( ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 ) ) )
            // InternalQueryDsl.g:3714:1: ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 ) )
            {
            // InternalQueryDsl.g:3714:1: ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 ) )
            // InternalQueryDsl.g:3715:2: ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 )
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordAssignment_2()); 
            // InternalQueryDsl.g:3716:2: ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 )
            // InternalQueryDsl.g:3716:3: rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordAssignment_2()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__2__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__3"
    // InternalQueryDsl.g:3724:1: rule__DeleteMedicalRecord__Group__3 : rule__DeleteMedicalRecord__Group__3__Impl rule__DeleteMedicalRecord__Group__4 ;
    public final void rule__DeleteMedicalRecord__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3728:1: ( rule__DeleteMedicalRecord__Group__3__Impl rule__DeleteMedicalRecord__Group__4 )
            // InternalQueryDsl.g:3729:2: rule__DeleteMedicalRecord__Group__3__Impl rule__DeleteMedicalRecord__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__DeleteMedicalRecord__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__4();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__3"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__3__Impl"
    // InternalQueryDsl.g:3736:1: rule__DeleteMedicalRecord__Group__3__Impl : ( ( rule__DeleteMedicalRecord__Group_3__0 )* ) ;
    public final void rule__DeleteMedicalRecord__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3740:1: ( ( ( rule__DeleteMedicalRecord__Group_3__0 )* ) )
            // InternalQueryDsl.g:3741:1: ( ( rule__DeleteMedicalRecord__Group_3__0 )* )
            {
            // InternalQueryDsl.g:3741:1: ( ( rule__DeleteMedicalRecord__Group_3__0 )* )
            // InternalQueryDsl.g:3742:2: ( rule__DeleteMedicalRecord__Group_3__0 )*
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getGroup_3()); 
            // InternalQueryDsl.g:3743:2: ( rule__DeleteMedicalRecord__Group_3__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==58) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalQueryDsl.g:3743:3: rule__DeleteMedicalRecord__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DeleteMedicalRecord__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDeleteMedicalRecordAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__3__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__4"
    // InternalQueryDsl.g:3751:1: rule__DeleteMedicalRecord__Group__4 : rule__DeleteMedicalRecord__Group__4__Impl ;
    public final void rule__DeleteMedicalRecord__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3755:1: ( rule__DeleteMedicalRecord__Group__4__Impl )
            // InternalQueryDsl.g:3756:2: rule__DeleteMedicalRecord__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group__4__Impl();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__4"


    // $ANTLR start "rule__DeleteMedicalRecord__Group__4__Impl"
    // InternalQueryDsl.g:3762:1: rule__DeleteMedicalRecord__Group__4__Impl : ( ';' ) ;
    public final void rule__DeleteMedicalRecord__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3766:1: ( ( ';' ) )
            // InternalQueryDsl.g:3767:1: ( ';' )
            {
            // InternalQueryDsl.g:3767:1: ( ';' )
            // InternalQueryDsl.g:3768:2: ';'
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getSemicolonKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeleteMedicalRecordAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group__4__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group_3__0"
    // InternalQueryDsl.g:3778:1: rule__DeleteMedicalRecord__Group_3__0 : rule__DeleteMedicalRecord__Group_3__0__Impl rule__DeleteMedicalRecord__Group_3__1 ;
    public final void rule__DeleteMedicalRecord__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3782:1: ( rule__DeleteMedicalRecord__Group_3__0__Impl rule__DeleteMedicalRecord__Group_3__1 )
            // InternalQueryDsl.g:3783:2: rule__DeleteMedicalRecord__Group_3__0__Impl rule__DeleteMedicalRecord__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__DeleteMedicalRecord__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group_3__1();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group_3__0"


    // $ANTLR start "rule__DeleteMedicalRecord__Group_3__0__Impl"
    // InternalQueryDsl.g:3790:1: rule__DeleteMedicalRecord__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__DeleteMedicalRecord__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3794:1: ( ( 'and' ) )
            // InternalQueryDsl.g:3795:1: ( 'and' )
            {
            // InternalQueryDsl.g:3795:1: ( 'and' )
            // InternalQueryDsl.g:3796:2: 'and'
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getAndKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeleteMedicalRecordAccess().getAndKeyword_3_0()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group_3__0__Impl"


    // $ANTLR start "rule__DeleteMedicalRecord__Group_3__1"
    // InternalQueryDsl.g:3805:1: rule__DeleteMedicalRecord__Group_3__1 : rule__DeleteMedicalRecord__Group_3__1__Impl ;
    public final void rule__DeleteMedicalRecord__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3809:1: ( rule__DeleteMedicalRecord__Group_3__1__Impl )
            // InternalQueryDsl.g:3810:2: rule__DeleteMedicalRecord__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__Group_3__1__Impl();

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group_3__1"


    // $ANTLR start "rule__DeleteMedicalRecord__Group_3__1__Impl"
    // InternalQueryDsl.g:3816:1: rule__DeleteMedicalRecord__Group_3__1__Impl : ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 ) ) ;
    public final void rule__DeleteMedicalRecord__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3820:1: ( ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 ) ) )
            // InternalQueryDsl.g:3821:1: ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 ) )
            {
            // InternalQueryDsl.g:3821:1: ( ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 ) )
            // InternalQueryDsl.g:3822:2: ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 )
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordAssignment_3_1()); 
            // InternalQueryDsl.g:3823:2: ( rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 )
            // InternalQueryDsl.g:3823:3: rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordAssignment_3_1()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__Group_3__1__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__0"
    // InternalQueryDsl.g:3832:1: rule__DeletePatientMonitoring__Group__0 : rule__DeletePatientMonitoring__Group__0__Impl rule__DeletePatientMonitoring__Group__1 ;
    public final void rule__DeletePatientMonitoring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3836:1: ( rule__DeletePatientMonitoring__Group__0__Impl rule__DeletePatientMonitoring__Group__1 )
            // InternalQueryDsl.g:3837:2: rule__DeletePatientMonitoring__Group__0__Impl rule__DeletePatientMonitoring__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DeletePatientMonitoring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__1();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__0"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__0__Impl"
    // InternalQueryDsl.g:3844:1: rule__DeletePatientMonitoring__Group__0__Impl : ( 'PatientMonitoring' ) ;
    public final void rule__DeletePatientMonitoring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3848:1: ( ( 'PatientMonitoring' ) )
            // InternalQueryDsl.g:3849:1: ( 'PatientMonitoring' )
            {
            // InternalQueryDsl.g:3849:1: ( 'PatientMonitoring' )
            // InternalQueryDsl.g:3850:2: 'PatientMonitoring'
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getPatientMonitoringKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDeletePatientMonitoringAccess().getPatientMonitoringKeyword_0()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__0__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__1"
    // InternalQueryDsl.g:3859:1: rule__DeletePatientMonitoring__Group__1 : rule__DeletePatientMonitoring__Group__1__Impl rule__DeletePatientMonitoring__Group__2 ;
    public final void rule__DeletePatientMonitoring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3863:1: ( rule__DeletePatientMonitoring__Group__1__Impl rule__DeletePatientMonitoring__Group__2 )
            // InternalQueryDsl.g:3864:2: rule__DeletePatientMonitoring__Group__1__Impl rule__DeletePatientMonitoring__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DeletePatientMonitoring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__2();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__1"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__1__Impl"
    // InternalQueryDsl.g:3871:1: rule__DeletePatientMonitoring__Group__1__Impl : ( 'WHERE' ) ;
    public final void rule__DeletePatientMonitoring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3875:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:3876:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:3876:1: ( 'WHERE' )
            // InternalQueryDsl.g:3877:2: 'WHERE'
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getWHEREKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDeletePatientMonitoringAccess().getWHEREKeyword_1()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__1__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__2"
    // InternalQueryDsl.g:3886:1: rule__DeletePatientMonitoring__Group__2 : rule__DeletePatientMonitoring__Group__2__Impl rule__DeletePatientMonitoring__Group__3 ;
    public final void rule__DeletePatientMonitoring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3890:1: ( rule__DeletePatientMonitoring__Group__2__Impl rule__DeletePatientMonitoring__Group__3 )
            // InternalQueryDsl.g:3891:2: rule__DeletePatientMonitoring__Group__2__Impl rule__DeletePatientMonitoring__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__DeletePatientMonitoring__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__3();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__2"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__2__Impl"
    // InternalQueryDsl.g:3898:1: rule__DeletePatientMonitoring__Group__2__Impl : ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 ) ) ;
    public final void rule__DeletePatientMonitoring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3902:1: ( ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 ) ) )
            // InternalQueryDsl.g:3903:1: ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 ) )
            {
            // InternalQueryDsl.g:3903:1: ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 ) )
            // InternalQueryDsl.g:3904:2: ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 )
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringAssignment_2()); 
            // InternalQueryDsl.g:3905:2: ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 )
            // InternalQueryDsl.g:3905:3: rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringAssignment_2()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__2__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__3"
    // InternalQueryDsl.g:3913:1: rule__DeletePatientMonitoring__Group__3 : rule__DeletePatientMonitoring__Group__3__Impl rule__DeletePatientMonitoring__Group__4 ;
    public final void rule__DeletePatientMonitoring__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3917:1: ( rule__DeletePatientMonitoring__Group__3__Impl rule__DeletePatientMonitoring__Group__4 )
            // InternalQueryDsl.g:3918:2: rule__DeletePatientMonitoring__Group__3__Impl rule__DeletePatientMonitoring__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__DeletePatientMonitoring__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__4();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__3"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__3__Impl"
    // InternalQueryDsl.g:3925:1: rule__DeletePatientMonitoring__Group__3__Impl : ( ( rule__DeletePatientMonitoring__Group_3__0 )* ) ;
    public final void rule__DeletePatientMonitoring__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3929:1: ( ( ( rule__DeletePatientMonitoring__Group_3__0 )* ) )
            // InternalQueryDsl.g:3930:1: ( ( rule__DeletePatientMonitoring__Group_3__0 )* )
            {
            // InternalQueryDsl.g:3930:1: ( ( rule__DeletePatientMonitoring__Group_3__0 )* )
            // InternalQueryDsl.g:3931:2: ( rule__DeletePatientMonitoring__Group_3__0 )*
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getGroup_3()); 
            // InternalQueryDsl.g:3932:2: ( rule__DeletePatientMonitoring__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==58) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalQueryDsl.g:3932:3: rule__DeletePatientMonitoring__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DeletePatientMonitoring__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDeletePatientMonitoringAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__3__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__4"
    // InternalQueryDsl.g:3940:1: rule__DeletePatientMonitoring__Group__4 : rule__DeletePatientMonitoring__Group__4__Impl ;
    public final void rule__DeletePatientMonitoring__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3944:1: ( rule__DeletePatientMonitoring__Group__4__Impl )
            // InternalQueryDsl.g:3945:2: rule__DeletePatientMonitoring__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group__4__Impl();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__4"


    // $ANTLR start "rule__DeletePatientMonitoring__Group__4__Impl"
    // InternalQueryDsl.g:3951:1: rule__DeletePatientMonitoring__Group__4__Impl : ( ';' ) ;
    public final void rule__DeletePatientMonitoring__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3955:1: ( ( ';' ) )
            // InternalQueryDsl.g:3956:1: ( ';' )
            {
            // InternalQueryDsl.g:3956:1: ( ';' )
            // InternalQueryDsl.g:3957:2: ';'
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getSemicolonKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeletePatientMonitoringAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group__4__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group_3__0"
    // InternalQueryDsl.g:3967:1: rule__DeletePatientMonitoring__Group_3__0 : rule__DeletePatientMonitoring__Group_3__0__Impl rule__DeletePatientMonitoring__Group_3__1 ;
    public final void rule__DeletePatientMonitoring__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3971:1: ( rule__DeletePatientMonitoring__Group_3__0__Impl rule__DeletePatientMonitoring__Group_3__1 )
            // InternalQueryDsl.g:3972:2: rule__DeletePatientMonitoring__Group_3__0__Impl rule__DeletePatientMonitoring__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DeletePatientMonitoring__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group_3__1();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group_3__0"


    // $ANTLR start "rule__DeletePatientMonitoring__Group_3__0__Impl"
    // InternalQueryDsl.g:3979:1: rule__DeletePatientMonitoring__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__DeletePatientMonitoring__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3983:1: ( ( 'and' ) )
            // InternalQueryDsl.g:3984:1: ( 'and' )
            {
            // InternalQueryDsl.g:3984:1: ( 'and' )
            // InternalQueryDsl.g:3985:2: 'and'
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getAndKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeletePatientMonitoringAccess().getAndKeyword_3_0()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group_3__0__Impl"


    // $ANTLR start "rule__DeletePatientMonitoring__Group_3__1"
    // InternalQueryDsl.g:3994:1: rule__DeletePatientMonitoring__Group_3__1 : rule__DeletePatientMonitoring__Group_3__1__Impl ;
    public final void rule__DeletePatientMonitoring__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:3998:1: ( rule__DeletePatientMonitoring__Group_3__1__Impl )
            // InternalQueryDsl.g:3999:2: rule__DeletePatientMonitoring__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__Group_3__1__Impl();

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group_3__1"


    // $ANTLR start "rule__DeletePatientMonitoring__Group_3__1__Impl"
    // InternalQueryDsl.g:4005:1: rule__DeletePatientMonitoring__Group_3__1__Impl : ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 ) ) ;
    public final void rule__DeletePatientMonitoring__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4009:1: ( ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 ) ) )
            // InternalQueryDsl.g:4010:1: ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 ) )
            {
            // InternalQueryDsl.g:4010:1: ( ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 ) )
            // InternalQueryDsl.g:4011:2: ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 )
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringAssignment_3_1()); 
            // InternalQueryDsl.g:4012:2: ( rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 )
            // InternalQueryDsl.g:4012:3: rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringAssignment_3_1()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__Group_3__1__Impl"


    // $ANTLR start "rule__DeletePrescription__Group__0"
    // InternalQueryDsl.g:4021:1: rule__DeletePrescription__Group__0 : rule__DeletePrescription__Group__0__Impl rule__DeletePrescription__Group__1 ;
    public final void rule__DeletePrescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4025:1: ( rule__DeletePrescription__Group__0__Impl rule__DeletePrescription__Group__1 )
            // InternalQueryDsl.g:4026:2: rule__DeletePrescription__Group__0__Impl rule__DeletePrescription__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__DeletePrescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__1();

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
    // $ANTLR end "rule__DeletePrescription__Group__0"


    // $ANTLR start "rule__DeletePrescription__Group__0__Impl"
    // InternalQueryDsl.g:4033:1: rule__DeletePrescription__Group__0__Impl : ( 'Prescription' ) ;
    public final void rule__DeletePrescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4037:1: ( ( 'Prescription' ) )
            // InternalQueryDsl.g:4038:1: ( 'Prescription' )
            {
            // InternalQueryDsl.g:4038:1: ( 'Prescription' )
            // InternalQueryDsl.g:4039:2: 'Prescription'
            {
             before(grammarAccess.getDeletePrescriptionAccess().getPrescriptionKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getDeletePrescriptionAccess().getPrescriptionKeyword_0()); 

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
    // $ANTLR end "rule__DeletePrescription__Group__0__Impl"


    // $ANTLR start "rule__DeletePrescription__Group__1"
    // InternalQueryDsl.g:4048:1: rule__DeletePrescription__Group__1 : rule__DeletePrescription__Group__1__Impl rule__DeletePrescription__Group__2 ;
    public final void rule__DeletePrescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4052:1: ( rule__DeletePrescription__Group__1__Impl rule__DeletePrescription__Group__2 )
            // InternalQueryDsl.g:4053:2: rule__DeletePrescription__Group__1__Impl rule__DeletePrescription__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__DeletePrescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__2();

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
    // $ANTLR end "rule__DeletePrescription__Group__1"


    // $ANTLR start "rule__DeletePrescription__Group__1__Impl"
    // InternalQueryDsl.g:4060:1: rule__DeletePrescription__Group__1__Impl : ( 'WHERE' ) ;
    public final void rule__DeletePrescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4064:1: ( ( 'WHERE' ) )
            // InternalQueryDsl.g:4065:1: ( 'WHERE' )
            {
            // InternalQueryDsl.g:4065:1: ( 'WHERE' )
            // InternalQueryDsl.g:4066:2: 'WHERE'
            {
             before(grammarAccess.getDeletePrescriptionAccess().getWHEREKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getDeletePrescriptionAccess().getWHEREKeyword_1()); 

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
    // $ANTLR end "rule__DeletePrescription__Group__1__Impl"


    // $ANTLR start "rule__DeletePrescription__Group__2"
    // InternalQueryDsl.g:4075:1: rule__DeletePrescription__Group__2 : rule__DeletePrescription__Group__2__Impl rule__DeletePrescription__Group__3 ;
    public final void rule__DeletePrescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4079:1: ( rule__DeletePrescription__Group__2__Impl rule__DeletePrescription__Group__3 )
            // InternalQueryDsl.g:4080:2: rule__DeletePrescription__Group__2__Impl rule__DeletePrescription__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__DeletePrescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__3();

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
    // $ANTLR end "rule__DeletePrescription__Group__2"


    // $ANTLR start "rule__DeletePrescription__Group__2__Impl"
    // InternalQueryDsl.g:4087:1: rule__DeletePrescription__Group__2__Impl : ( ( rule__DeletePrescription__WhereprescriptionAssignment_2 ) ) ;
    public final void rule__DeletePrescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4091:1: ( ( ( rule__DeletePrescription__WhereprescriptionAssignment_2 ) ) )
            // InternalQueryDsl.g:4092:1: ( ( rule__DeletePrescription__WhereprescriptionAssignment_2 ) )
            {
            // InternalQueryDsl.g:4092:1: ( ( rule__DeletePrescription__WhereprescriptionAssignment_2 ) )
            // InternalQueryDsl.g:4093:2: ( rule__DeletePrescription__WhereprescriptionAssignment_2 )
            {
             before(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionAssignment_2()); 
            // InternalQueryDsl.g:4094:2: ( rule__DeletePrescription__WhereprescriptionAssignment_2 )
            // InternalQueryDsl.g:4094:3: rule__DeletePrescription__WhereprescriptionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeletePrescription__WhereprescriptionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionAssignment_2()); 

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
    // $ANTLR end "rule__DeletePrescription__Group__2__Impl"


    // $ANTLR start "rule__DeletePrescription__Group__3"
    // InternalQueryDsl.g:4102:1: rule__DeletePrescription__Group__3 : rule__DeletePrescription__Group__3__Impl rule__DeletePrescription__Group__4 ;
    public final void rule__DeletePrescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4106:1: ( rule__DeletePrescription__Group__3__Impl rule__DeletePrescription__Group__4 )
            // InternalQueryDsl.g:4107:2: rule__DeletePrescription__Group__3__Impl rule__DeletePrescription__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__DeletePrescription__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__4();

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
    // $ANTLR end "rule__DeletePrescription__Group__3"


    // $ANTLR start "rule__DeletePrescription__Group__3__Impl"
    // InternalQueryDsl.g:4114:1: rule__DeletePrescription__Group__3__Impl : ( ( rule__DeletePrescription__Group_3__0 )* ) ;
    public final void rule__DeletePrescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4118:1: ( ( ( rule__DeletePrescription__Group_3__0 )* ) )
            // InternalQueryDsl.g:4119:1: ( ( rule__DeletePrescription__Group_3__0 )* )
            {
            // InternalQueryDsl.g:4119:1: ( ( rule__DeletePrescription__Group_3__0 )* )
            // InternalQueryDsl.g:4120:2: ( rule__DeletePrescription__Group_3__0 )*
            {
             before(grammarAccess.getDeletePrescriptionAccess().getGroup_3()); 
            // InternalQueryDsl.g:4121:2: ( rule__DeletePrescription__Group_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==58) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalQueryDsl.g:4121:3: rule__DeletePrescription__Group_3__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__DeletePrescription__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDeletePrescriptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__DeletePrescription__Group__3__Impl"


    // $ANTLR start "rule__DeletePrescription__Group__4"
    // InternalQueryDsl.g:4129:1: rule__DeletePrescription__Group__4 : rule__DeletePrescription__Group__4__Impl ;
    public final void rule__DeletePrescription__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4133:1: ( rule__DeletePrescription__Group__4__Impl )
            // InternalQueryDsl.g:4134:2: rule__DeletePrescription__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group__4__Impl();

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
    // $ANTLR end "rule__DeletePrescription__Group__4"


    // $ANTLR start "rule__DeletePrescription__Group__4__Impl"
    // InternalQueryDsl.g:4140:1: rule__DeletePrescription__Group__4__Impl : ( ';' ) ;
    public final void rule__DeletePrescription__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4144:1: ( ( ';' ) )
            // InternalQueryDsl.g:4145:1: ( ';' )
            {
            // InternalQueryDsl.g:4145:1: ( ';' )
            // InternalQueryDsl.g:4146:2: ';'
            {
             before(grammarAccess.getDeletePrescriptionAccess().getSemicolonKeyword_4()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDeletePrescriptionAccess().getSemicolonKeyword_4()); 

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
    // $ANTLR end "rule__DeletePrescription__Group__4__Impl"


    // $ANTLR start "rule__DeletePrescription__Group_3__0"
    // InternalQueryDsl.g:4156:1: rule__DeletePrescription__Group_3__0 : rule__DeletePrescription__Group_3__0__Impl rule__DeletePrescription__Group_3__1 ;
    public final void rule__DeletePrescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4160:1: ( rule__DeletePrescription__Group_3__0__Impl rule__DeletePrescription__Group_3__1 )
            // InternalQueryDsl.g:4161:2: rule__DeletePrescription__Group_3__0__Impl rule__DeletePrescription__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__DeletePrescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group_3__1();

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
    // $ANTLR end "rule__DeletePrescription__Group_3__0"


    // $ANTLR start "rule__DeletePrescription__Group_3__0__Impl"
    // InternalQueryDsl.g:4168:1: rule__DeletePrescription__Group_3__0__Impl : ( 'and' ) ;
    public final void rule__DeletePrescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4172:1: ( ( 'and' ) )
            // InternalQueryDsl.g:4173:1: ( 'and' )
            {
            // InternalQueryDsl.g:4173:1: ( 'and' )
            // InternalQueryDsl.g:4174:2: 'and'
            {
             before(grammarAccess.getDeletePrescriptionAccess().getAndKeyword_3_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getDeletePrescriptionAccess().getAndKeyword_3_0()); 

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
    // $ANTLR end "rule__DeletePrescription__Group_3__0__Impl"


    // $ANTLR start "rule__DeletePrescription__Group_3__1"
    // InternalQueryDsl.g:4183:1: rule__DeletePrescription__Group_3__1 : rule__DeletePrescription__Group_3__1__Impl ;
    public final void rule__DeletePrescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4187:1: ( rule__DeletePrescription__Group_3__1__Impl )
            // InternalQueryDsl.g:4188:2: rule__DeletePrescription__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeletePrescription__Group_3__1__Impl();

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
    // $ANTLR end "rule__DeletePrescription__Group_3__1"


    // $ANTLR start "rule__DeletePrescription__Group_3__1__Impl"
    // InternalQueryDsl.g:4194:1: rule__DeletePrescription__Group_3__1__Impl : ( ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 ) ) ;
    public final void rule__DeletePrescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4198:1: ( ( ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 ) ) )
            // InternalQueryDsl.g:4199:1: ( ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 ) )
            {
            // InternalQueryDsl.g:4199:1: ( ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 ) )
            // InternalQueryDsl.g:4200:2: ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 )
            {
             before(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionAssignment_3_1()); 
            // InternalQueryDsl.g:4201:2: ( rule__DeletePrescription__WhereprescriptionAssignment_3_1 )
            // InternalQueryDsl.g:4201:3: rule__DeletePrescription__WhereprescriptionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DeletePrescription__WhereprescriptionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionAssignment_3_1()); 

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
    // $ANTLR end "rule__DeletePrescription__Group_3__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__0"
    // InternalQueryDsl.g:4210:1: rule__WhereMedicalRecord__Group_0__0 : rule__WhereMedicalRecord__Group_0__0__Impl rule__WhereMedicalRecord__Group_0__1 ;
    public final void rule__WhereMedicalRecord__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4214:1: ( rule__WhereMedicalRecord__Group_0__0__Impl rule__WhereMedicalRecord__Group_0__1 )
            // InternalQueryDsl.g:4215:2: rule__WhereMedicalRecord__Group_0__0__Impl rule__WhereMedicalRecord__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_0__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__0__Impl"
    // InternalQueryDsl.g:4222:1: rule__WhereMedicalRecord__Group_0__0__Impl : ( 'recordId' ) ;
    public final void rule__WhereMedicalRecord__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4226:1: ( ( 'recordId' ) )
            // InternalQueryDsl.g:4227:1: ( 'recordId' )
            {
            // InternalQueryDsl.g:4227:1: ( 'recordId' )
            // InternalQueryDsl.g:4228:2: 'recordId'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getRecordIdKeyword_0_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getRecordIdKeyword_0_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__1"
    // InternalQueryDsl.g:4237:1: rule__WhereMedicalRecord__Group_0__1 : rule__WhereMedicalRecord__Group_0__1__Impl rule__WhereMedicalRecord__Group_0__2 ;
    public final void rule__WhereMedicalRecord__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4241:1: ( rule__WhereMedicalRecord__Group_0__1__Impl rule__WhereMedicalRecord__Group_0__2 )
            // InternalQueryDsl.g:4242:2: rule__WhereMedicalRecord__Group_0__1__Impl rule__WhereMedicalRecord__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__WhereMedicalRecord__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_0__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__1__Impl"
    // InternalQueryDsl.g:4249:1: rule__WhereMedicalRecord__Group_0__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4253:1: ( ( '=' ) )
            // InternalQueryDsl.g:4254:1: ( '=' )
            {
            // InternalQueryDsl.g:4254:1: ( '=' )
            // InternalQueryDsl.g:4255:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_0_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__2"
    // InternalQueryDsl.g:4264:1: rule__WhereMedicalRecord__Group_0__2 : rule__WhereMedicalRecord__Group_0__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4268:1: ( rule__WhereMedicalRecord__Group_0__2__Impl )
            // InternalQueryDsl.g:4269:2: rule__WhereMedicalRecord__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_0__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_0__2__Impl"
    // InternalQueryDsl.g:4275:1: rule__WhereMedicalRecord__Group_0__2__Impl : ( ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4279:1: ( ( ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 ) ) )
            // InternalQueryDsl.g:4280:1: ( ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 ) )
            {
            // InternalQueryDsl.g:4280:1: ( ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 ) )
            // InternalQueryDsl.g:4281:2: ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getRecordIdAssignment_0_2()); 
            // InternalQueryDsl.g:4282:2: ( rule__WhereMedicalRecord__RecordIdAssignment_0_2 )
            // InternalQueryDsl.g:4282:3: rule__WhereMedicalRecord__RecordIdAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__RecordIdAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getRecordIdAssignment_0_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_0__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__0"
    // InternalQueryDsl.g:4291:1: rule__WhereMedicalRecord__Group_1__0 : rule__WhereMedicalRecord__Group_1__0__Impl rule__WhereMedicalRecord__Group_1__1 ;
    public final void rule__WhereMedicalRecord__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4295:1: ( rule__WhereMedicalRecord__Group_1__0__Impl rule__WhereMedicalRecord__Group_1__1 )
            // InternalQueryDsl.g:4296:2: rule__WhereMedicalRecord__Group_1__0__Impl rule__WhereMedicalRecord__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_1__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__0__Impl"
    // InternalQueryDsl.g:4303:1: rule__WhereMedicalRecord__Group_1__0__Impl : ( 'patientId' ) ;
    public final void rule__WhereMedicalRecord__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4307:1: ( ( 'patientId' ) )
            // InternalQueryDsl.g:4308:1: ( 'patientId' )
            {
            // InternalQueryDsl.g:4308:1: ( 'patientId' )
            // InternalQueryDsl.g:4309:2: 'patientId'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPatientIdKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getPatientIdKeyword_1_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__1"
    // InternalQueryDsl.g:4318:1: rule__WhereMedicalRecord__Group_1__1 : rule__WhereMedicalRecord__Group_1__1__Impl rule__WhereMedicalRecord__Group_1__2 ;
    public final void rule__WhereMedicalRecord__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4322:1: ( rule__WhereMedicalRecord__Group_1__1__Impl rule__WhereMedicalRecord__Group_1__2 )
            // InternalQueryDsl.g:4323:2: rule__WhereMedicalRecord__Group_1__1__Impl rule__WhereMedicalRecord__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__WhereMedicalRecord__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_1__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__1__Impl"
    // InternalQueryDsl.g:4330:1: rule__WhereMedicalRecord__Group_1__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4334:1: ( ( '=' ) )
            // InternalQueryDsl.g:4335:1: ( '=' )
            {
            // InternalQueryDsl.g:4335:1: ( '=' )
            // InternalQueryDsl.g:4336:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__2"
    // InternalQueryDsl.g:4345:1: rule__WhereMedicalRecord__Group_1__2 : rule__WhereMedicalRecord__Group_1__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4349:1: ( rule__WhereMedicalRecord__Group_1__2__Impl )
            // InternalQueryDsl.g:4350:2: rule__WhereMedicalRecord__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_1__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_1__2__Impl"
    // InternalQueryDsl.g:4356:1: rule__WhereMedicalRecord__Group_1__2__Impl : ( ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4360:1: ( ( ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 ) ) )
            // InternalQueryDsl.g:4361:1: ( ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:4361:1: ( ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 ) )
            // InternalQueryDsl.g:4362:2: ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPatientIdAssignment_1_2()); 
            // InternalQueryDsl.g:4363:2: ( rule__WhereMedicalRecord__PatientIdAssignment_1_2 )
            // InternalQueryDsl.g:4363:3: rule__WhereMedicalRecord__PatientIdAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__PatientIdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getPatientIdAssignment_1_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_1__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__0"
    // InternalQueryDsl.g:4372:1: rule__WhereMedicalRecord__Group_2__0 : rule__WhereMedicalRecord__Group_2__0__Impl rule__WhereMedicalRecord__Group_2__1 ;
    public final void rule__WhereMedicalRecord__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4376:1: ( rule__WhereMedicalRecord__Group_2__0__Impl rule__WhereMedicalRecord__Group_2__1 )
            // InternalQueryDsl.g:4377:2: rule__WhereMedicalRecord__Group_2__0__Impl rule__WhereMedicalRecord__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_2__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__0__Impl"
    // InternalQueryDsl.g:4384:1: rule__WhereMedicalRecord__Group_2__0__Impl : ( 'doctorId' ) ;
    public final void rule__WhereMedicalRecord__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4388:1: ( ( 'doctorId' ) )
            // InternalQueryDsl.g:4389:1: ( 'doctorId' )
            {
            // InternalQueryDsl.g:4389:1: ( 'doctorId' )
            // InternalQueryDsl.g:4390:2: 'doctorId'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdKeyword_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__1"
    // InternalQueryDsl.g:4399:1: rule__WhereMedicalRecord__Group_2__1 : rule__WhereMedicalRecord__Group_2__1__Impl rule__WhereMedicalRecord__Group_2__2 ;
    public final void rule__WhereMedicalRecord__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4403:1: ( rule__WhereMedicalRecord__Group_2__1__Impl rule__WhereMedicalRecord__Group_2__2 )
            // InternalQueryDsl.g:4404:2: rule__WhereMedicalRecord__Group_2__1__Impl rule__WhereMedicalRecord__Group_2__2
            {
            pushFollow(FOLLOW_20);
            rule__WhereMedicalRecord__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_2__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__1__Impl"
    // InternalQueryDsl.g:4411:1: rule__WhereMedicalRecord__Group_2__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4415:1: ( ( '=' ) )
            // InternalQueryDsl.g:4416:1: ( '=' )
            {
            // InternalQueryDsl.g:4416:1: ( '=' )
            // InternalQueryDsl.g:4417:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_2_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__2"
    // InternalQueryDsl.g:4426:1: rule__WhereMedicalRecord__Group_2__2 : rule__WhereMedicalRecord__Group_2__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4430:1: ( rule__WhereMedicalRecord__Group_2__2__Impl )
            // InternalQueryDsl.g:4431:2: rule__WhereMedicalRecord__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_2__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_2__2__Impl"
    // InternalQueryDsl.g:4437:1: rule__WhereMedicalRecord__Group_2__2__Impl : ( ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4441:1: ( ( ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 ) ) )
            // InternalQueryDsl.g:4442:1: ( ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 ) )
            {
            // InternalQueryDsl.g:4442:1: ( ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 ) )
            // InternalQueryDsl.g:4443:2: ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdAssignment_2_2()); 
            // InternalQueryDsl.g:4444:2: ( rule__WhereMedicalRecord__DoctorIdAssignment_2_2 )
            // InternalQueryDsl.g:4444:3: rule__WhereMedicalRecord__DoctorIdAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__DoctorIdAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdAssignment_2_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_2__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__0"
    // InternalQueryDsl.g:4453:1: rule__WhereMedicalRecord__Group_3__0 : rule__WhereMedicalRecord__Group_3__0__Impl rule__WhereMedicalRecord__Group_3__1 ;
    public final void rule__WhereMedicalRecord__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4457:1: ( rule__WhereMedicalRecord__Group_3__0__Impl rule__WhereMedicalRecord__Group_3__1 )
            // InternalQueryDsl.g:4458:2: rule__WhereMedicalRecord__Group_3__0__Impl rule__WhereMedicalRecord__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_3__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__0__Impl"
    // InternalQueryDsl.g:4465:1: rule__WhereMedicalRecord__Group_3__0__Impl : ( 'medicalCondition' ) ;
    public final void rule__WhereMedicalRecord__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4469:1: ( ( 'medicalCondition' ) )
            // InternalQueryDsl.g:4470:1: ( 'medicalCondition' )
            {
            // InternalQueryDsl.g:4470:1: ( 'medicalCondition' )
            // InternalQueryDsl.g:4471:2: 'medicalCondition'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionKeyword_3_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__1"
    // InternalQueryDsl.g:4480:1: rule__WhereMedicalRecord__Group_3__1 : rule__WhereMedicalRecord__Group_3__1__Impl rule__WhereMedicalRecord__Group_3__2 ;
    public final void rule__WhereMedicalRecord__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4484:1: ( rule__WhereMedicalRecord__Group_3__1__Impl rule__WhereMedicalRecord__Group_3__2 )
            // InternalQueryDsl.g:4485:2: rule__WhereMedicalRecord__Group_3__1__Impl rule__WhereMedicalRecord__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__WhereMedicalRecord__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_3__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__1__Impl"
    // InternalQueryDsl.g:4492:1: rule__WhereMedicalRecord__Group_3__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4496:1: ( ( '=' ) )
            // InternalQueryDsl.g:4497:1: ( '=' )
            {
            // InternalQueryDsl.g:4497:1: ( '=' )
            // InternalQueryDsl.g:4498:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_3_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__2"
    // InternalQueryDsl.g:4507:1: rule__WhereMedicalRecord__Group_3__2 : rule__WhereMedicalRecord__Group_3__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4511:1: ( rule__WhereMedicalRecord__Group_3__2__Impl )
            // InternalQueryDsl.g:4512:2: rule__WhereMedicalRecord__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_3__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_3__2__Impl"
    // InternalQueryDsl.g:4518:1: rule__WhereMedicalRecord__Group_3__2__Impl : ( ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4522:1: ( ( ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 ) ) )
            // InternalQueryDsl.g:4523:1: ( ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 ) )
            {
            // InternalQueryDsl.g:4523:1: ( ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 ) )
            // InternalQueryDsl.g:4524:2: ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionAssignment_3_2()); 
            // InternalQueryDsl.g:4525:2: ( rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 )
            // InternalQueryDsl.g:4525:3: rule__WhereMedicalRecord__MedicalConditionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__MedicalConditionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionAssignment_3_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_3__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__0"
    // InternalQueryDsl.g:4534:1: rule__WhereMedicalRecord__Group_4__0 : rule__WhereMedicalRecord__Group_4__0__Impl rule__WhereMedicalRecord__Group_4__1 ;
    public final void rule__WhereMedicalRecord__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4538:1: ( rule__WhereMedicalRecord__Group_4__0__Impl rule__WhereMedicalRecord__Group_4__1 )
            // InternalQueryDsl.g:4539:2: rule__WhereMedicalRecord__Group_4__0__Impl rule__WhereMedicalRecord__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_4__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__0__Impl"
    // InternalQueryDsl.g:4546:1: rule__WhereMedicalRecord__Group_4__0__Impl : ( 'date' ) ;
    public final void rule__WhereMedicalRecord__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4550:1: ( ( 'date' ) )
            // InternalQueryDsl.g:4551:1: ( 'date' )
            {
            // InternalQueryDsl.g:4551:1: ( 'date' )
            // InternalQueryDsl.g:4552:2: 'date'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDateKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDateKeyword_4_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__1"
    // InternalQueryDsl.g:4561:1: rule__WhereMedicalRecord__Group_4__1 : rule__WhereMedicalRecord__Group_4__1__Impl rule__WhereMedicalRecord__Group_4__2 ;
    public final void rule__WhereMedicalRecord__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4565:1: ( rule__WhereMedicalRecord__Group_4__1__Impl rule__WhereMedicalRecord__Group_4__2 )
            // InternalQueryDsl.g:4566:2: rule__WhereMedicalRecord__Group_4__1__Impl rule__WhereMedicalRecord__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__WhereMedicalRecord__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_4__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__1__Impl"
    // InternalQueryDsl.g:4573:1: rule__WhereMedicalRecord__Group_4__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4577:1: ( ( '=' ) )
            // InternalQueryDsl.g:4578:1: ( '=' )
            {
            // InternalQueryDsl.g:4578:1: ( '=' )
            // InternalQueryDsl.g:4579:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_4_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__2"
    // InternalQueryDsl.g:4588:1: rule__WhereMedicalRecord__Group_4__2 : rule__WhereMedicalRecord__Group_4__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4592:1: ( rule__WhereMedicalRecord__Group_4__2__Impl )
            // InternalQueryDsl.g:4593:2: rule__WhereMedicalRecord__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_4__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_4__2__Impl"
    // InternalQueryDsl.g:4599:1: rule__WhereMedicalRecord__Group_4__2__Impl : ( ( rule__WhereMedicalRecord__DateAssignment_4_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4603:1: ( ( ( rule__WhereMedicalRecord__DateAssignment_4_2 ) ) )
            // InternalQueryDsl.g:4604:1: ( ( rule__WhereMedicalRecord__DateAssignment_4_2 ) )
            {
            // InternalQueryDsl.g:4604:1: ( ( rule__WhereMedicalRecord__DateAssignment_4_2 ) )
            // InternalQueryDsl.g:4605:2: ( rule__WhereMedicalRecord__DateAssignment_4_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDateAssignment_4_2()); 
            // InternalQueryDsl.g:4606:2: ( rule__WhereMedicalRecord__DateAssignment_4_2 )
            // InternalQueryDsl.g:4606:3: rule__WhereMedicalRecord__DateAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__DateAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getDateAssignment_4_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_4__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__0"
    // InternalQueryDsl.g:4615:1: rule__WhereMedicalRecord__Group_5__0 : rule__WhereMedicalRecord__Group_5__0__Impl rule__WhereMedicalRecord__Group_5__1 ;
    public final void rule__WhereMedicalRecord__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4619:1: ( rule__WhereMedicalRecord__Group_5__0__Impl rule__WhereMedicalRecord__Group_5__1 )
            // InternalQueryDsl.g:4620:2: rule__WhereMedicalRecord__Group_5__0__Impl rule__WhereMedicalRecord__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_5__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__0__Impl"
    // InternalQueryDsl.g:4627:1: rule__WhereMedicalRecord__Group_5__0__Impl : ( 'price' ) ;
    public final void rule__WhereMedicalRecord__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4631:1: ( ( 'price' ) )
            // InternalQueryDsl.g:4632:1: ( 'price' )
            {
            // InternalQueryDsl.g:4632:1: ( 'price' )
            // InternalQueryDsl.g:4633:2: 'price'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPriceKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getPriceKeyword_5_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__1"
    // InternalQueryDsl.g:4642:1: rule__WhereMedicalRecord__Group_5__1 : rule__WhereMedicalRecord__Group_5__1__Impl rule__WhereMedicalRecord__Group_5__2 ;
    public final void rule__WhereMedicalRecord__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4646:1: ( rule__WhereMedicalRecord__Group_5__1__Impl rule__WhereMedicalRecord__Group_5__2 )
            // InternalQueryDsl.g:4647:2: rule__WhereMedicalRecord__Group_5__1__Impl rule__WhereMedicalRecord__Group_5__2
            {
            pushFollow(FOLLOW_24);
            rule__WhereMedicalRecord__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_5__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__1__Impl"
    // InternalQueryDsl.g:4654:1: rule__WhereMedicalRecord__Group_5__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4658:1: ( ( '=' ) )
            // InternalQueryDsl.g:4659:1: ( '=' )
            {
            // InternalQueryDsl.g:4659:1: ( '=' )
            // InternalQueryDsl.g:4660:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_5_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__2"
    // InternalQueryDsl.g:4669:1: rule__WhereMedicalRecord__Group_5__2 : rule__WhereMedicalRecord__Group_5__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4673:1: ( rule__WhereMedicalRecord__Group_5__2__Impl )
            // InternalQueryDsl.g:4674:2: rule__WhereMedicalRecord__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_5__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_5__2__Impl"
    // InternalQueryDsl.g:4680:1: rule__WhereMedicalRecord__Group_5__2__Impl : ( ( rule__WhereMedicalRecord__PriceAssignment_5_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4684:1: ( ( ( rule__WhereMedicalRecord__PriceAssignment_5_2 ) ) )
            // InternalQueryDsl.g:4685:1: ( ( rule__WhereMedicalRecord__PriceAssignment_5_2 ) )
            {
            // InternalQueryDsl.g:4685:1: ( ( rule__WhereMedicalRecord__PriceAssignment_5_2 ) )
            // InternalQueryDsl.g:4686:2: ( rule__WhereMedicalRecord__PriceAssignment_5_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPriceAssignment_5_2()); 
            // InternalQueryDsl.g:4687:2: ( rule__WhereMedicalRecord__PriceAssignment_5_2 )
            // InternalQueryDsl.g:4687:3: rule__WhereMedicalRecord__PriceAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__PriceAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getPriceAssignment_5_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_5__2__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__0"
    // InternalQueryDsl.g:4696:1: rule__WhereMedicalRecord__Group_6__0 : rule__WhereMedicalRecord__Group_6__0__Impl rule__WhereMedicalRecord__Group_6__1 ;
    public final void rule__WhereMedicalRecord__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4700:1: ( rule__WhereMedicalRecord__Group_6__0__Impl rule__WhereMedicalRecord__Group_6__1 )
            // InternalQueryDsl.g:4701:2: rule__WhereMedicalRecord__Group_6__0__Impl rule__WhereMedicalRecord__Group_6__1
            {
            pushFollow(FOLLOW_35);
            rule__WhereMedicalRecord__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_6__1();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__0"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__0__Impl"
    // InternalQueryDsl.g:4708:1: rule__WhereMedicalRecord__Group_6__0__Impl : ( 'description' ) ;
    public final void rule__WhereMedicalRecord__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4712:1: ( ( 'description' ) )
            // InternalQueryDsl.g:4713:1: ( 'description' )
            {
            // InternalQueryDsl.g:4713:1: ( 'description' )
            // InternalQueryDsl.g:4714:2: 'description'
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDescriptionKeyword_6_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDescriptionKeyword_6_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__0__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__1"
    // InternalQueryDsl.g:4723:1: rule__WhereMedicalRecord__Group_6__1 : rule__WhereMedicalRecord__Group_6__1__Impl rule__WhereMedicalRecord__Group_6__2 ;
    public final void rule__WhereMedicalRecord__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4727:1: ( rule__WhereMedicalRecord__Group_6__1__Impl rule__WhereMedicalRecord__Group_6__2 )
            // InternalQueryDsl.g:4728:2: rule__WhereMedicalRecord__Group_6__1__Impl rule__WhereMedicalRecord__Group_6__2
            {
            pushFollow(FOLLOW_25);
            rule__WhereMedicalRecord__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_6__2();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__1"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__1__Impl"
    // InternalQueryDsl.g:4735:1: rule__WhereMedicalRecord__Group_6__1__Impl : ( '=' ) ;
    public final void rule__WhereMedicalRecord__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4739:1: ( ( '=' ) )
            // InternalQueryDsl.g:4740:1: ( '=' )
            {
            // InternalQueryDsl.g:4740:1: ( '=' )
            // InternalQueryDsl.g:4741:2: '='
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_6_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__1__Impl"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__2"
    // InternalQueryDsl.g:4750:1: rule__WhereMedicalRecord__Group_6__2 : rule__WhereMedicalRecord__Group_6__2__Impl ;
    public final void rule__WhereMedicalRecord__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4754:1: ( rule__WhereMedicalRecord__Group_6__2__Impl )
            // InternalQueryDsl.g:4755:2: rule__WhereMedicalRecord__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__Group_6__2__Impl();

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__2"


    // $ANTLR start "rule__WhereMedicalRecord__Group_6__2__Impl"
    // InternalQueryDsl.g:4761:1: rule__WhereMedicalRecord__Group_6__2__Impl : ( ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 ) ) ;
    public final void rule__WhereMedicalRecord__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4765:1: ( ( ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 ) ) )
            // InternalQueryDsl.g:4766:1: ( ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 ) )
            {
            // InternalQueryDsl.g:4766:1: ( ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 ) )
            // InternalQueryDsl.g:4767:2: ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 )
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDescriptionAssignment_6_2()); 
            // InternalQueryDsl.g:4768:2: ( rule__WhereMedicalRecord__DescriptionAssignment_6_2 )
            // InternalQueryDsl.g:4768:3: rule__WhereMedicalRecord__DescriptionAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereMedicalRecord__DescriptionAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereMedicalRecordAccess().getDescriptionAssignment_6_2()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__Group_6__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__0"
    // InternalQueryDsl.g:4777:1: rule__WherePatientMonitoring__Group_0__0 : rule__WherePatientMonitoring__Group_0__0__Impl rule__WherePatientMonitoring__Group_0__1 ;
    public final void rule__WherePatientMonitoring__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4781:1: ( rule__WherePatientMonitoring__Group_0__0__Impl rule__WherePatientMonitoring__Group_0__1 )
            // InternalQueryDsl.g:4782:2: rule__WherePatientMonitoring__Group_0__0__Impl rule__WherePatientMonitoring__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_0__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__0__Impl"
    // InternalQueryDsl.g:4789:1: rule__WherePatientMonitoring__Group_0__0__Impl : ( 'monitoringId' ) ;
    public final void rule__WherePatientMonitoring__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4793:1: ( ( 'monitoringId' ) )
            // InternalQueryDsl.g:4794:1: ( 'monitoringId' )
            {
            // InternalQueryDsl.g:4794:1: ( 'monitoringId' )
            // InternalQueryDsl.g:4795:2: 'monitoringId'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdKeyword_0_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__1"
    // InternalQueryDsl.g:4804:1: rule__WherePatientMonitoring__Group_0__1 : rule__WherePatientMonitoring__Group_0__1__Impl rule__WherePatientMonitoring__Group_0__2 ;
    public final void rule__WherePatientMonitoring__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4808:1: ( rule__WherePatientMonitoring__Group_0__1__Impl rule__WherePatientMonitoring__Group_0__2 )
            // InternalQueryDsl.g:4809:2: rule__WherePatientMonitoring__Group_0__1__Impl rule__WherePatientMonitoring__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__WherePatientMonitoring__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_0__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__1__Impl"
    // InternalQueryDsl.g:4816:1: rule__WherePatientMonitoring__Group_0__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4820:1: ( ( '=' ) )
            // InternalQueryDsl.g:4821:1: ( '=' )
            {
            // InternalQueryDsl.g:4821:1: ( '=' )
            // InternalQueryDsl.g:4822:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_0_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__2"
    // InternalQueryDsl.g:4831:1: rule__WherePatientMonitoring__Group_0__2 : rule__WherePatientMonitoring__Group_0__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4835:1: ( rule__WherePatientMonitoring__Group_0__2__Impl )
            // InternalQueryDsl.g:4836:2: rule__WherePatientMonitoring__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_0__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_0__2__Impl"
    // InternalQueryDsl.g:4842:1: rule__WherePatientMonitoring__Group_0__2__Impl : ( ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4846:1: ( ( ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 ) ) )
            // InternalQueryDsl.g:4847:1: ( ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 ) )
            {
            // InternalQueryDsl.g:4847:1: ( ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 ) )
            // InternalQueryDsl.g:4848:2: ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdAssignment_0_2()); 
            // InternalQueryDsl.g:4849:2: ( rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 )
            // InternalQueryDsl.g:4849:3: rule__WherePatientMonitoring__MonitoringIdAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__MonitoringIdAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdAssignment_0_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_0__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__0"
    // InternalQueryDsl.g:4858:1: rule__WherePatientMonitoring__Group_1__0 : rule__WherePatientMonitoring__Group_1__0__Impl rule__WherePatientMonitoring__Group_1__1 ;
    public final void rule__WherePatientMonitoring__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4862:1: ( rule__WherePatientMonitoring__Group_1__0__Impl rule__WherePatientMonitoring__Group_1__1 )
            // InternalQueryDsl.g:4863:2: rule__WherePatientMonitoring__Group_1__0__Impl rule__WherePatientMonitoring__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_1__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__0__Impl"
    // InternalQueryDsl.g:4870:1: rule__WherePatientMonitoring__Group_1__0__Impl : ( 'patientId' ) ;
    public final void rule__WherePatientMonitoring__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4874:1: ( ( 'patientId' ) )
            // InternalQueryDsl.g:4875:1: ( 'patientId' )
            {
            // InternalQueryDsl.g:4875:1: ( 'patientId' )
            // InternalQueryDsl.g:4876:2: 'patientId'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getPatientIdKeyword_1_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getPatientIdKeyword_1_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__1"
    // InternalQueryDsl.g:4885:1: rule__WherePatientMonitoring__Group_1__1 : rule__WherePatientMonitoring__Group_1__1__Impl rule__WherePatientMonitoring__Group_1__2 ;
    public final void rule__WherePatientMonitoring__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4889:1: ( rule__WherePatientMonitoring__Group_1__1__Impl rule__WherePatientMonitoring__Group_1__2 )
            // InternalQueryDsl.g:4890:2: rule__WherePatientMonitoring__Group_1__1__Impl rule__WherePatientMonitoring__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__WherePatientMonitoring__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_1__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__1__Impl"
    // InternalQueryDsl.g:4897:1: rule__WherePatientMonitoring__Group_1__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4901:1: ( ( '=' ) )
            // InternalQueryDsl.g:4902:1: ( '=' )
            {
            // InternalQueryDsl.g:4902:1: ( '=' )
            // InternalQueryDsl.g:4903:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__2"
    // InternalQueryDsl.g:4912:1: rule__WherePatientMonitoring__Group_1__2 : rule__WherePatientMonitoring__Group_1__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4916:1: ( rule__WherePatientMonitoring__Group_1__2__Impl )
            // InternalQueryDsl.g:4917:2: rule__WherePatientMonitoring__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_1__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_1__2__Impl"
    // InternalQueryDsl.g:4923:1: rule__WherePatientMonitoring__Group_1__2__Impl : ( ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4927:1: ( ( ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 ) ) )
            // InternalQueryDsl.g:4928:1: ( ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:4928:1: ( ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 ) )
            // InternalQueryDsl.g:4929:2: ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getPatientIdAssignment_1_2()); 
            // InternalQueryDsl.g:4930:2: ( rule__WherePatientMonitoring__PatientIdAssignment_1_2 )
            // InternalQueryDsl.g:4930:3: rule__WherePatientMonitoring__PatientIdAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__PatientIdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getPatientIdAssignment_1_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_1__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__0"
    // InternalQueryDsl.g:4939:1: rule__WherePatientMonitoring__Group_2__0 : rule__WherePatientMonitoring__Group_2__0__Impl rule__WherePatientMonitoring__Group_2__1 ;
    public final void rule__WherePatientMonitoring__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4943:1: ( rule__WherePatientMonitoring__Group_2__0__Impl rule__WherePatientMonitoring__Group_2__1 )
            // InternalQueryDsl.g:4944:2: rule__WherePatientMonitoring__Group_2__0__Impl rule__WherePatientMonitoring__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_2__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__0__Impl"
    // InternalQueryDsl.g:4951:1: rule__WherePatientMonitoring__Group_2__0__Impl : ( 'category' ) ;
    public final void rule__WherePatientMonitoring__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4955:1: ( ( 'category' ) )
            // InternalQueryDsl.g:4956:1: ( 'category' )
            {
            // InternalQueryDsl.g:4956:1: ( 'category' )
            // InternalQueryDsl.g:4957:2: 'category'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getCategoryKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getCategoryKeyword_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__1"
    // InternalQueryDsl.g:4966:1: rule__WherePatientMonitoring__Group_2__1 : rule__WherePatientMonitoring__Group_2__1__Impl rule__WherePatientMonitoring__Group_2__2 ;
    public final void rule__WherePatientMonitoring__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4970:1: ( rule__WherePatientMonitoring__Group_2__1__Impl rule__WherePatientMonitoring__Group_2__2 )
            // InternalQueryDsl.g:4971:2: rule__WherePatientMonitoring__Group_2__1__Impl rule__WherePatientMonitoring__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__WherePatientMonitoring__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_2__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__1__Impl"
    // InternalQueryDsl.g:4978:1: rule__WherePatientMonitoring__Group_2__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4982:1: ( ( '=' ) )
            // InternalQueryDsl.g:4983:1: ( '=' )
            {
            // InternalQueryDsl.g:4983:1: ( '=' )
            // InternalQueryDsl.g:4984:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_2_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__2"
    // InternalQueryDsl.g:4993:1: rule__WherePatientMonitoring__Group_2__2 : rule__WherePatientMonitoring__Group_2__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:4997:1: ( rule__WherePatientMonitoring__Group_2__2__Impl )
            // InternalQueryDsl.g:4998:2: rule__WherePatientMonitoring__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_2__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_2__2__Impl"
    // InternalQueryDsl.g:5004:1: rule__WherePatientMonitoring__Group_2__2__Impl : ( ( rule__WherePatientMonitoring__CategoryAssignment_2_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5008:1: ( ( ( rule__WherePatientMonitoring__CategoryAssignment_2_2 ) ) )
            // InternalQueryDsl.g:5009:1: ( ( rule__WherePatientMonitoring__CategoryAssignment_2_2 ) )
            {
            // InternalQueryDsl.g:5009:1: ( ( rule__WherePatientMonitoring__CategoryAssignment_2_2 ) )
            // InternalQueryDsl.g:5010:2: ( rule__WherePatientMonitoring__CategoryAssignment_2_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getCategoryAssignment_2_2()); 
            // InternalQueryDsl.g:5011:2: ( rule__WherePatientMonitoring__CategoryAssignment_2_2 )
            // InternalQueryDsl.g:5011:3: rule__WherePatientMonitoring__CategoryAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__CategoryAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getCategoryAssignment_2_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_2__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__0"
    // InternalQueryDsl.g:5020:1: rule__WherePatientMonitoring__Group_3__0 : rule__WherePatientMonitoring__Group_3__0__Impl rule__WherePatientMonitoring__Group_3__1 ;
    public final void rule__WherePatientMonitoring__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5024:1: ( rule__WherePatientMonitoring__Group_3__0__Impl rule__WherePatientMonitoring__Group_3__1 )
            // InternalQueryDsl.g:5025:2: rule__WherePatientMonitoring__Group_3__0__Impl rule__WherePatientMonitoring__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_3__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__0__Impl"
    // InternalQueryDsl.g:5032:1: rule__WherePatientMonitoring__Group_3__0__Impl : ( 'date' ) ;
    public final void rule__WherePatientMonitoring__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5036:1: ( ( 'date' ) )
            // InternalQueryDsl.g:5037:1: ( 'date' )
            {
            // InternalQueryDsl.g:5037:1: ( 'date' )
            // InternalQueryDsl.g:5038:2: 'date'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDateKeyword_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getDateKeyword_3_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__1"
    // InternalQueryDsl.g:5047:1: rule__WherePatientMonitoring__Group_3__1 : rule__WherePatientMonitoring__Group_3__1__Impl rule__WherePatientMonitoring__Group_3__2 ;
    public final void rule__WherePatientMonitoring__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5051:1: ( rule__WherePatientMonitoring__Group_3__1__Impl rule__WherePatientMonitoring__Group_3__2 )
            // InternalQueryDsl.g:5052:2: rule__WherePatientMonitoring__Group_3__1__Impl rule__WherePatientMonitoring__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__WherePatientMonitoring__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_3__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__1__Impl"
    // InternalQueryDsl.g:5059:1: rule__WherePatientMonitoring__Group_3__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5063:1: ( ( '=' ) )
            // InternalQueryDsl.g:5064:1: ( '=' )
            {
            // InternalQueryDsl.g:5064:1: ( '=' )
            // InternalQueryDsl.g:5065:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_3_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__2"
    // InternalQueryDsl.g:5074:1: rule__WherePatientMonitoring__Group_3__2 : rule__WherePatientMonitoring__Group_3__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5078:1: ( rule__WherePatientMonitoring__Group_3__2__Impl )
            // InternalQueryDsl.g:5079:2: rule__WherePatientMonitoring__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_3__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_3__2__Impl"
    // InternalQueryDsl.g:5085:1: rule__WherePatientMonitoring__Group_3__2__Impl : ( ( rule__WherePatientMonitoring__DateAssignment_3_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5089:1: ( ( ( rule__WherePatientMonitoring__DateAssignment_3_2 ) ) )
            // InternalQueryDsl.g:5090:1: ( ( rule__WherePatientMonitoring__DateAssignment_3_2 ) )
            {
            // InternalQueryDsl.g:5090:1: ( ( rule__WherePatientMonitoring__DateAssignment_3_2 ) )
            // InternalQueryDsl.g:5091:2: ( rule__WherePatientMonitoring__DateAssignment_3_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDateAssignment_3_2()); 
            // InternalQueryDsl.g:5092:2: ( rule__WherePatientMonitoring__DateAssignment_3_2 )
            // InternalQueryDsl.g:5092:3: rule__WherePatientMonitoring__DateAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__DateAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getDateAssignment_3_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_3__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__0"
    // InternalQueryDsl.g:5101:1: rule__WherePatientMonitoring__Group_4__0 : rule__WherePatientMonitoring__Group_4__0__Impl rule__WherePatientMonitoring__Group_4__1 ;
    public final void rule__WherePatientMonitoring__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5105:1: ( rule__WherePatientMonitoring__Group_4__0__Impl rule__WherePatientMonitoring__Group_4__1 )
            // InternalQueryDsl.g:5106:2: rule__WherePatientMonitoring__Group_4__0__Impl rule__WherePatientMonitoring__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_4__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__0__Impl"
    // InternalQueryDsl.g:5113:1: rule__WherePatientMonitoring__Group_4__0__Impl : ( 'riskPerception' ) ;
    public final void rule__WherePatientMonitoring__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5117:1: ( ( 'riskPerception' ) )
            // InternalQueryDsl.g:5118:1: ( 'riskPerception' )
            {
            // InternalQueryDsl.g:5118:1: ( 'riskPerception' )
            // InternalQueryDsl.g:5119:2: 'riskPerception'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getRiskPerceptionKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getRiskPerceptionKeyword_4_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__1"
    // InternalQueryDsl.g:5128:1: rule__WherePatientMonitoring__Group_4__1 : rule__WherePatientMonitoring__Group_4__1__Impl rule__WherePatientMonitoring__Group_4__2 ;
    public final void rule__WherePatientMonitoring__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5132:1: ( rule__WherePatientMonitoring__Group_4__1__Impl rule__WherePatientMonitoring__Group_4__2 )
            // InternalQueryDsl.g:5133:2: rule__WherePatientMonitoring__Group_4__1__Impl rule__WherePatientMonitoring__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__WherePatientMonitoring__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_4__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__1__Impl"
    // InternalQueryDsl.g:5140:1: rule__WherePatientMonitoring__Group_4__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5144:1: ( ( '=' ) )
            // InternalQueryDsl.g:5145:1: ( '=' )
            {
            // InternalQueryDsl.g:5145:1: ( '=' )
            // InternalQueryDsl.g:5146:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_4_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__2"
    // InternalQueryDsl.g:5155:1: rule__WherePatientMonitoring__Group_4__2 : rule__WherePatientMonitoring__Group_4__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5159:1: ( rule__WherePatientMonitoring__Group_4__2__Impl )
            // InternalQueryDsl.g:5160:2: rule__WherePatientMonitoring__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_4__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_4__2__Impl"
    // InternalQueryDsl.g:5166:1: rule__WherePatientMonitoring__Group_4__2__Impl : ( ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5170:1: ( ( ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 ) ) )
            // InternalQueryDsl.g:5171:1: ( ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 ) )
            {
            // InternalQueryDsl.g:5171:1: ( ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 ) )
            // InternalQueryDsl.g:5172:2: ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getRiskperceptionAssignment_4_2()); 
            // InternalQueryDsl.g:5173:2: ( rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 )
            // InternalQueryDsl.g:5173:3: rule__WherePatientMonitoring__RiskperceptionAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__RiskperceptionAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getRiskperceptionAssignment_4_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_4__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__0"
    // InternalQueryDsl.g:5182:1: rule__WherePatientMonitoring__Group_5__0 : rule__WherePatientMonitoring__Group_5__0__Impl rule__WherePatientMonitoring__Group_5__1 ;
    public final void rule__WherePatientMonitoring__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5186:1: ( rule__WherePatientMonitoring__Group_5__0__Impl rule__WherePatientMonitoring__Group_5__1 )
            // InternalQueryDsl.g:5187:2: rule__WherePatientMonitoring__Group_5__0__Impl rule__WherePatientMonitoring__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_5__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__0__Impl"
    // InternalQueryDsl.g:5194:1: rule__WherePatientMonitoring__Group_5__0__Impl : ( 'treated' ) ;
    public final void rule__WherePatientMonitoring__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5198:1: ( ( 'treated' ) )
            // InternalQueryDsl.g:5199:1: ( 'treated' )
            {
            // InternalQueryDsl.g:5199:1: ( 'treated' )
            // InternalQueryDsl.g:5200:2: 'treated'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getTreatedKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getTreatedKeyword_5_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__1"
    // InternalQueryDsl.g:5209:1: rule__WherePatientMonitoring__Group_5__1 : rule__WherePatientMonitoring__Group_5__1__Impl rule__WherePatientMonitoring__Group_5__2 ;
    public final void rule__WherePatientMonitoring__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5213:1: ( rule__WherePatientMonitoring__Group_5__1__Impl rule__WherePatientMonitoring__Group_5__2 )
            // InternalQueryDsl.g:5214:2: rule__WherePatientMonitoring__Group_5__1__Impl rule__WherePatientMonitoring__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__WherePatientMonitoring__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_5__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__1__Impl"
    // InternalQueryDsl.g:5221:1: rule__WherePatientMonitoring__Group_5__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5225:1: ( ( '=' ) )
            // InternalQueryDsl.g:5226:1: ( '=' )
            {
            // InternalQueryDsl.g:5226:1: ( '=' )
            // InternalQueryDsl.g:5227:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_5_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__2"
    // InternalQueryDsl.g:5236:1: rule__WherePatientMonitoring__Group_5__2 : rule__WherePatientMonitoring__Group_5__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5240:1: ( rule__WherePatientMonitoring__Group_5__2__Impl )
            // InternalQueryDsl.g:5241:2: rule__WherePatientMonitoring__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_5__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_5__2__Impl"
    // InternalQueryDsl.g:5247:1: rule__WherePatientMonitoring__Group_5__2__Impl : ( ( rule__WherePatientMonitoring__TreatedAssignment_5_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5251:1: ( ( ( rule__WherePatientMonitoring__TreatedAssignment_5_2 ) ) )
            // InternalQueryDsl.g:5252:1: ( ( rule__WherePatientMonitoring__TreatedAssignment_5_2 ) )
            {
            // InternalQueryDsl.g:5252:1: ( ( rule__WherePatientMonitoring__TreatedAssignment_5_2 ) )
            // InternalQueryDsl.g:5253:2: ( rule__WherePatientMonitoring__TreatedAssignment_5_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getTreatedAssignment_5_2()); 
            // InternalQueryDsl.g:5254:2: ( rule__WherePatientMonitoring__TreatedAssignment_5_2 )
            // InternalQueryDsl.g:5254:3: rule__WherePatientMonitoring__TreatedAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__TreatedAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getTreatedAssignment_5_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_5__2__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__0"
    // InternalQueryDsl.g:5263:1: rule__WherePatientMonitoring__Group_6__0 : rule__WherePatientMonitoring__Group_6__0__Impl rule__WherePatientMonitoring__Group_6__1 ;
    public final void rule__WherePatientMonitoring__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5267:1: ( rule__WherePatientMonitoring__Group_6__0__Impl rule__WherePatientMonitoring__Group_6__1 )
            // InternalQueryDsl.g:5268:2: rule__WherePatientMonitoring__Group_6__0__Impl rule__WherePatientMonitoring__Group_6__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePatientMonitoring__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_6__1();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__0"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__0__Impl"
    // InternalQueryDsl.g:5275:1: rule__WherePatientMonitoring__Group_6__0__Impl : ( 'deviceId' ) ;
    public final void rule__WherePatientMonitoring__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5279:1: ( ( 'deviceId' ) )
            // InternalQueryDsl.g:5280:1: ( 'deviceId' )
            {
            // InternalQueryDsl.g:5280:1: ( 'deviceId' )
            // InternalQueryDsl.g:5281:2: 'deviceId'
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdKeyword_6_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdKeyword_6_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__0__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__1"
    // InternalQueryDsl.g:5290:1: rule__WherePatientMonitoring__Group_6__1 : rule__WherePatientMonitoring__Group_6__1__Impl rule__WherePatientMonitoring__Group_6__2 ;
    public final void rule__WherePatientMonitoring__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5294:1: ( rule__WherePatientMonitoring__Group_6__1__Impl rule__WherePatientMonitoring__Group_6__2 )
            // InternalQueryDsl.g:5295:2: rule__WherePatientMonitoring__Group_6__1__Impl rule__WherePatientMonitoring__Group_6__2
            {
            pushFollow(FOLLOW_20);
            rule__WherePatientMonitoring__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_6__2();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__1"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__1__Impl"
    // InternalQueryDsl.g:5302:1: rule__WherePatientMonitoring__Group_6__1__Impl : ( '=' ) ;
    public final void rule__WherePatientMonitoring__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5306:1: ( ( '=' ) )
            // InternalQueryDsl.g:5307:1: ( '=' )
            {
            // InternalQueryDsl.g:5307:1: ( '=' )
            // InternalQueryDsl.g:5308:2: '='
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_6_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__1__Impl"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__2"
    // InternalQueryDsl.g:5317:1: rule__WherePatientMonitoring__Group_6__2 : rule__WherePatientMonitoring__Group_6__2__Impl ;
    public final void rule__WherePatientMonitoring__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5321:1: ( rule__WherePatientMonitoring__Group_6__2__Impl )
            // InternalQueryDsl.g:5322:2: rule__WherePatientMonitoring__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__Group_6__2__Impl();

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__2"


    // $ANTLR start "rule__WherePatientMonitoring__Group_6__2__Impl"
    // InternalQueryDsl.g:5328:1: rule__WherePatientMonitoring__Group_6__2__Impl : ( ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 ) ) ;
    public final void rule__WherePatientMonitoring__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5332:1: ( ( ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 ) ) )
            // InternalQueryDsl.g:5333:1: ( ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 ) )
            {
            // InternalQueryDsl.g:5333:1: ( ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 ) )
            // InternalQueryDsl.g:5334:2: ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 )
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdAssignment_6_2()); 
            // InternalQueryDsl.g:5335:2: ( rule__WherePatientMonitoring__DeviceIdAssignment_6_2 )
            // InternalQueryDsl.g:5335:3: rule__WherePatientMonitoring__DeviceIdAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePatientMonitoring__DeviceIdAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdAssignment_6_2()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__Group_6__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_0__0"
    // InternalQueryDsl.g:5344:1: rule__WherePrescription__Group_0__0 : rule__WherePrescription__Group_0__0__Impl rule__WherePrescription__Group_0__1 ;
    public final void rule__WherePrescription__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5348:1: ( rule__WherePrescription__Group_0__0__Impl rule__WherePrescription__Group_0__1 )
            // InternalQueryDsl.g:5349:2: rule__WherePrescription__Group_0__0__Impl rule__WherePrescription__Group_0__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_0__1();

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
    // $ANTLR end "rule__WherePrescription__Group_0__0"


    // $ANTLR start "rule__WherePrescription__Group_0__0__Impl"
    // InternalQueryDsl.g:5356:1: rule__WherePrescription__Group_0__0__Impl : ( 'prescriptionId' ) ;
    public final void rule__WherePrescription__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5360:1: ( ( 'prescriptionId' ) )
            // InternalQueryDsl.g:5361:1: ( 'prescriptionId' )
            {
            // InternalQueryDsl.g:5361:1: ( 'prescriptionId' )
            // InternalQueryDsl.g:5362:2: 'prescriptionId'
            {
             before(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdKeyword_0_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_0__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_0__1"
    // InternalQueryDsl.g:5371:1: rule__WherePrescription__Group_0__1 : rule__WherePrescription__Group_0__1__Impl rule__WherePrescription__Group_0__2 ;
    public final void rule__WherePrescription__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5375:1: ( rule__WherePrescription__Group_0__1__Impl rule__WherePrescription__Group_0__2 )
            // InternalQueryDsl.g:5376:2: rule__WherePrescription__Group_0__1__Impl rule__WherePrescription__Group_0__2
            {
            pushFollow(FOLLOW_20);
            rule__WherePrescription__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_0__2();

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
    // $ANTLR end "rule__WherePrescription__Group_0__1"


    // $ANTLR start "rule__WherePrescription__Group_0__1__Impl"
    // InternalQueryDsl.g:5383:1: rule__WherePrescription__Group_0__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5387:1: ( ( '=' ) )
            // InternalQueryDsl.g:5388:1: ( '=' )
            {
            // InternalQueryDsl.g:5388:1: ( '=' )
            // InternalQueryDsl.g:5389:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_0_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_0_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_0__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_0__2"
    // InternalQueryDsl.g:5398:1: rule__WherePrescription__Group_0__2 : rule__WherePrescription__Group_0__2__Impl ;
    public final void rule__WherePrescription__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5402:1: ( rule__WherePrescription__Group_0__2__Impl )
            // InternalQueryDsl.g:5403:2: rule__WherePrescription__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_0__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_0__2"


    // $ANTLR start "rule__WherePrescription__Group_0__2__Impl"
    // InternalQueryDsl.g:5409:1: rule__WherePrescription__Group_0__2__Impl : ( ( rule__WherePrescription__PrescriptionIdAssignment_0_2 ) ) ;
    public final void rule__WherePrescription__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5413:1: ( ( ( rule__WherePrescription__PrescriptionIdAssignment_0_2 ) ) )
            // InternalQueryDsl.g:5414:1: ( ( rule__WherePrescription__PrescriptionIdAssignment_0_2 ) )
            {
            // InternalQueryDsl.g:5414:1: ( ( rule__WherePrescription__PrescriptionIdAssignment_0_2 ) )
            // InternalQueryDsl.g:5415:2: ( rule__WherePrescription__PrescriptionIdAssignment_0_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdAssignment_0_2()); 
            // InternalQueryDsl.g:5416:2: ( rule__WherePrescription__PrescriptionIdAssignment_0_2 )
            // InternalQueryDsl.g:5416:3: rule__WherePrescription__PrescriptionIdAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__PrescriptionIdAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdAssignment_0_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_0__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_1__0"
    // InternalQueryDsl.g:5425:1: rule__WherePrescription__Group_1__0 : rule__WherePrescription__Group_1__0__Impl rule__WherePrescription__Group_1__1 ;
    public final void rule__WherePrescription__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5429:1: ( rule__WherePrescription__Group_1__0__Impl rule__WherePrescription__Group_1__1 )
            // InternalQueryDsl.g:5430:2: rule__WherePrescription__Group_1__0__Impl rule__WherePrescription__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_1__1();

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
    // $ANTLR end "rule__WherePrescription__Group_1__0"


    // $ANTLR start "rule__WherePrescription__Group_1__0__Impl"
    // InternalQueryDsl.g:5437:1: rule__WherePrescription__Group_1__0__Impl : ( 'recordId' ) ;
    public final void rule__WherePrescription__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5441:1: ( ( 'recordId' ) )
            // InternalQueryDsl.g:5442:1: ( 'recordId' )
            {
            // InternalQueryDsl.g:5442:1: ( 'recordId' )
            // InternalQueryDsl.g:5443:2: 'recordId'
            {
             before(grammarAccess.getWherePrescriptionAccess().getRecordIdKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getRecordIdKeyword_1_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_1__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_1__1"
    // InternalQueryDsl.g:5452:1: rule__WherePrescription__Group_1__1 : rule__WherePrescription__Group_1__1__Impl rule__WherePrescription__Group_1__2 ;
    public final void rule__WherePrescription__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5456:1: ( rule__WherePrescription__Group_1__1__Impl rule__WherePrescription__Group_1__2 )
            // InternalQueryDsl.g:5457:2: rule__WherePrescription__Group_1__1__Impl rule__WherePrescription__Group_1__2
            {
            pushFollow(FOLLOW_20);
            rule__WherePrescription__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_1__2();

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
    // $ANTLR end "rule__WherePrescription__Group_1__1"


    // $ANTLR start "rule__WherePrescription__Group_1__1__Impl"
    // InternalQueryDsl.g:5464:1: rule__WherePrescription__Group_1__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5468:1: ( ( '=' ) )
            // InternalQueryDsl.g:5469:1: ( '=' )
            {
            // InternalQueryDsl.g:5469:1: ( '=' )
            // InternalQueryDsl.g:5470:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_1_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_1_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_1__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_1__2"
    // InternalQueryDsl.g:5479:1: rule__WherePrescription__Group_1__2 : rule__WherePrescription__Group_1__2__Impl ;
    public final void rule__WherePrescription__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5483:1: ( rule__WherePrescription__Group_1__2__Impl )
            // InternalQueryDsl.g:5484:2: rule__WherePrescription__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_1__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_1__2"


    // $ANTLR start "rule__WherePrescription__Group_1__2__Impl"
    // InternalQueryDsl.g:5490:1: rule__WherePrescription__Group_1__2__Impl : ( ( rule__WherePrescription__RecordIdAssignment_1_2 ) ) ;
    public final void rule__WherePrescription__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5494:1: ( ( ( rule__WherePrescription__RecordIdAssignment_1_2 ) ) )
            // InternalQueryDsl.g:5495:1: ( ( rule__WherePrescription__RecordIdAssignment_1_2 ) )
            {
            // InternalQueryDsl.g:5495:1: ( ( rule__WherePrescription__RecordIdAssignment_1_2 ) )
            // InternalQueryDsl.g:5496:2: ( rule__WherePrescription__RecordIdAssignment_1_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getRecordIdAssignment_1_2()); 
            // InternalQueryDsl.g:5497:2: ( rule__WherePrescription__RecordIdAssignment_1_2 )
            // InternalQueryDsl.g:5497:3: rule__WherePrescription__RecordIdAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__RecordIdAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getRecordIdAssignment_1_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_1__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_2__0"
    // InternalQueryDsl.g:5506:1: rule__WherePrescription__Group_2__0 : rule__WherePrescription__Group_2__0__Impl rule__WherePrescription__Group_2__1 ;
    public final void rule__WherePrescription__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5510:1: ( rule__WherePrescription__Group_2__0__Impl rule__WherePrescription__Group_2__1 )
            // InternalQueryDsl.g:5511:2: rule__WherePrescription__Group_2__0__Impl rule__WherePrescription__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_2__1();

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
    // $ANTLR end "rule__WherePrescription__Group_2__0"


    // $ANTLR start "rule__WherePrescription__Group_2__0__Impl"
    // InternalQueryDsl.g:5518:1: rule__WherePrescription__Group_2__0__Impl : ( 'medicationName' ) ;
    public final void rule__WherePrescription__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5522:1: ( ( 'medicationName' ) )
            // InternalQueryDsl.g:5523:1: ( 'medicationName' )
            {
            // InternalQueryDsl.g:5523:1: ( 'medicationName' )
            // InternalQueryDsl.g:5524:2: 'medicationName'
            {
             before(grammarAccess.getWherePrescriptionAccess().getMedicationNameKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getMedicationNameKeyword_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_2__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_2__1"
    // InternalQueryDsl.g:5533:1: rule__WherePrescription__Group_2__1 : rule__WherePrescription__Group_2__1__Impl rule__WherePrescription__Group_2__2 ;
    public final void rule__WherePrescription__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5537:1: ( rule__WherePrescription__Group_2__1__Impl rule__WherePrescription__Group_2__2 )
            // InternalQueryDsl.g:5538:2: rule__WherePrescription__Group_2__1__Impl rule__WherePrescription__Group_2__2
            {
            pushFollow(FOLLOW_25);
            rule__WherePrescription__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_2__2();

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
    // $ANTLR end "rule__WherePrescription__Group_2__1"


    // $ANTLR start "rule__WherePrescription__Group_2__1__Impl"
    // InternalQueryDsl.g:5545:1: rule__WherePrescription__Group_2__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5549:1: ( ( '=' ) )
            // InternalQueryDsl.g:5550:1: ( '=' )
            {
            // InternalQueryDsl.g:5550:1: ( '=' )
            // InternalQueryDsl.g:5551:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_2_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_2_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_2__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_2__2"
    // InternalQueryDsl.g:5560:1: rule__WherePrescription__Group_2__2 : rule__WherePrescription__Group_2__2__Impl ;
    public final void rule__WherePrescription__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5564:1: ( rule__WherePrescription__Group_2__2__Impl )
            // InternalQueryDsl.g:5565:2: rule__WherePrescription__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_2__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_2__2"


    // $ANTLR start "rule__WherePrescription__Group_2__2__Impl"
    // InternalQueryDsl.g:5571:1: rule__WherePrescription__Group_2__2__Impl : ( ( rule__WherePrescription__MedicationNameAssignment_2_2 ) ) ;
    public final void rule__WherePrescription__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5575:1: ( ( ( rule__WherePrescription__MedicationNameAssignment_2_2 ) ) )
            // InternalQueryDsl.g:5576:1: ( ( rule__WherePrescription__MedicationNameAssignment_2_2 ) )
            {
            // InternalQueryDsl.g:5576:1: ( ( rule__WherePrescription__MedicationNameAssignment_2_2 ) )
            // InternalQueryDsl.g:5577:2: ( rule__WherePrescription__MedicationNameAssignment_2_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getMedicationNameAssignment_2_2()); 
            // InternalQueryDsl.g:5578:2: ( rule__WherePrescription__MedicationNameAssignment_2_2 )
            // InternalQueryDsl.g:5578:3: rule__WherePrescription__MedicationNameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__MedicationNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getMedicationNameAssignment_2_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_2__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_3__0"
    // InternalQueryDsl.g:5587:1: rule__WherePrescription__Group_3__0 : rule__WherePrescription__Group_3__0__Impl rule__WherePrescription__Group_3__1 ;
    public final void rule__WherePrescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5591:1: ( rule__WherePrescription__Group_3__0__Impl rule__WherePrescription__Group_3__1 )
            // InternalQueryDsl.g:5592:2: rule__WherePrescription__Group_3__0__Impl rule__WherePrescription__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_3__1();

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
    // $ANTLR end "rule__WherePrescription__Group_3__0"


    // $ANTLR start "rule__WherePrescription__Group_3__0__Impl"
    // InternalQueryDsl.g:5599:1: rule__WherePrescription__Group_3__0__Impl : ( 'start' ) ;
    public final void rule__WherePrescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5603:1: ( ( 'start' ) )
            // InternalQueryDsl.g:5604:1: ( 'start' )
            {
            // InternalQueryDsl.g:5604:1: ( 'start' )
            // InternalQueryDsl.g:5605:2: 'start'
            {
             before(grammarAccess.getWherePrescriptionAccess().getStartKeyword_3_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getStartKeyword_3_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_3__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_3__1"
    // InternalQueryDsl.g:5614:1: rule__WherePrescription__Group_3__1 : rule__WherePrescription__Group_3__1__Impl rule__WherePrescription__Group_3__2 ;
    public final void rule__WherePrescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5618:1: ( rule__WherePrescription__Group_3__1__Impl rule__WherePrescription__Group_3__2 )
            // InternalQueryDsl.g:5619:2: rule__WherePrescription__Group_3__1__Impl rule__WherePrescription__Group_3__2
            {
            pushFollow(FOLLOW_23);
            rule__WherePrescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_3__2();

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
    // $ANTLR end "rule__WherePrescription__Group_3__1"


    // $ANTLR start "rule__WherePrescription__Group_3__1__Impl"
    // InternalQueryDsl.g:5626:1: rule__WherePrescription__Group_3__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5630:1: ( ( '=' ) )
            // InternalQueryDsl.g:5631:1: ( '=' )
            {
            // InternalQueryDsl.g:5631:1: ( '=' )
            // InternalQueryDsl.g:5632:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_3_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_3_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_3__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_3__2"
    // InternalQueryDsl.g:5641:1: rule__WherePrescription__Group_3__2 : rule__WherePrescription__Group_3__2__Impl ;
    public final void rule__WherePrescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5645:1: ( rule__WherePrescription__Group_3__2__Impl )
            // InternalQueryDsl.g:5646:2: rule__WherePrescription__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_3__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_3__2"


    // $ANTLR start "rule__WherePrescription__Group_3__2__Impl"
    // InternalQueryDsl.g:5652:1: rule__WherePrescription__Group_3__2__Impl : ( ( rule__WherePrescription__StartAssignment_3_2 ) ) ;
    public final void rule__WherePrescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5656:1: ( ( ( rule__WherePrescription__StartAssignment_3_2 ) ) )
            // InternalQueryDsl.g:5657:1: ( ( rule__WherePrescription__StartAssignment_3_2 ) )
            {
            // InternalQueryDsl.g:5657:1: ( ( rule__WherePrescription__StartAssignment_3_2 ) )
            // InternalQueryDsl.g:5658:2: ( rule__WherePrescription__StartAssignment_3_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getStartAssignment_3_2()); 
            // InternalQueryDsl.g:5659:2: ( rule__WherePrescription__StartAssignment_3_2 )
            // InternalQueryDsl.g:5659:3: rule__WherePrescription__StartAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__StartAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getStartAssignment_3_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_3__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_4__0"
    // InternalQueryDsl.g:5668:1: rule__WherePrescription__Group_4__0 : rule__WherePrescription__Group_4__0__Impl rule__WherePrescription__Group_4__1 ;
    public final void rule__WherePrescription__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5672:1: ( rule__WherePrescription__Group_4__0__Impl rule__WherePrescription__Group_4__1 )
            // InternalQueryDsl.g:5673:2: rule__WherePrescription__Group_4__0__Impl rule__WherePrescription__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_4__1();

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
    // $ANTLR end "rule__WherePrescription__Group_4__0"


    // $ANTLR start "rule__WherePrescription__Group_4__0__Impl"
    // InternalQueryDsl.g:5680:1: rule__WherePrescription__Group_4__0__Impl : ( 'end' ) ;
    public final void rule__WherePrescription__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5684:1: ( ( 'end' ) )
            // InternalQueryDsl.g:5685:1: ( 'end' )
            {
            // InternalQueryDsl.g:5685:1: ( 'end' )
            // InternalQueryDsl.g:5686:2: 'end'
            {
             before(grammarAccess.getWherePrescriptionAccess().getEndKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEndKeyword_4_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_4__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_4__1"
    // InternalQueryDsl.g:5695:1: rule__WherePrescription__Group_4__1 : rule__WherePrescription__Group_4__1__Impl rule__WherePrescription__Group_4__2 ;
    public final void rule__WherePrescription__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5699:1: ( rule__WherePrescription__Group_4__1__Impl rule__WherePrescription__Group_4__2 )
            // InternalQueryDsl.g:5700:2: rule__WherePrescription__Group_4__1__Impl rule__WherePrescription__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__WherePrescription__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_4__2();

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
    // $ANTLR end "rule__WherePrescription__Group_4__1"


    // $ANTLR start "rule__WherePrescription__Group_4__1__Impl"
    // InternalQueryDsl.g:5707:1: rule__WherePrescription__Group_4__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5711:1: ( ( '=' ) )
            // InternalQueryDsl.g:5712:1: ( '=' )
            {
            // InternalQueryDsl.g:5712:1: ( '=' )
            // InternalQueryDsl.g:5713:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_4_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_4_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_4__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_4__2"
    // InternalQueryDsl.g:5722:1: rule__WherePrescription__Group_4__2 : rule__WherePrescription__Group_4__2__Impl ;
    public final void rule__WherePrescription__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5726:1: ( rule__WherePrescription__Group_4__2__Impl )
            // InternalQueryDsl.g:5727:2: rule__WherePrescription__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_4__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_4__2"


    // $ANTLR start "rule__WherePrescription__Group_4__2__Impl"
    // InternalQueryDsl.g:5733:1: rule__WherePrescription__Group_4__2__Impl : ( ( rule__WherePrescription__EndAssignment_4_2 ) ) ;
    public final void rule__WherePrescription__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5737:1: ( ( ( rule__WherePrescription__EndAssignment_4_2 ) ) )
            // InternalQueryDsl.g:5738:1: ( ( rule__WherePrescription__EndAssignment_4_2 ) )
            {
            // InternalQueryDsl.g:5738:1: ( ( rule__WherePrescription__EndAssignment_4_2 ) )
            // InternalQueryDsl.g:5739:2: ( rule__WherePrescription__EndAssignment_4_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getEndAssignment_4_2()); 
            // InternalQueryDsl.g:5740:2: ( rule__WherePrescription__EndAssignment_4_2 )
            // InternalQueryDsl.g:5740:3: rule__WherePrescription__EndAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__EndAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getEndAssignment_4_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_4__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_5__0"
    // InternalQueryDsl.g:5749:1: rule__WherePrescription__Group_5__0 : rule__WherePrescription__Group_5__0__Impl rule__WherePrescription__Group_5__1 ;
    public final void rule__WherePrescription__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5753:1: ( rule__WherePrescription__Group_5__0__Impl rule__WherePrescription__Group_5__1 )
            // InternalQueryDsl.g:5754:2: rule__WherePrescription__Group_5__0__Impl rule__WherePrescription__Group_5__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_5__1();

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
    // $ANTLR end "rule__WherePrescription__Group_5__0"


    // $ANTLR start "rule__WherePrescription__Group_5__0__Impl"
    // InternalQueryDsl.g:5761:1: rule__WherePrescription__Group_5__0__Impl : ( 'ordered' ) ;
    public final void rule__WherePrescription__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5765:1: ( ( 'ordered' ) )
            // InternalQueryDsl.g:5766:1: ( 'ordered' )
            {
            // InternalQueryDsl.g:5766:1: ( 'ordered' )
            // InternalQueryDsl.g:5767:2: 'ordered'
            {
             before(grammarAccess.getWherePrescriptionAccess().getOrderedKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getOrderedKeyword_5_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_5__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_5__1"
    // InternalQueryDsl.g:5776:1: rule__WherePrescription__Group_5__1 : rule__WherePrescription__Group_5__1__Impl rule__WherePrescription__Group_5__2 ;
    public final void rule__WherePrescription__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5780:1: ( rule__WherePrescription__Group_5__1__Impl rule__WherePrescription__Group_5__2 )
            // InternalQueryDsl.g:5781:2: rule__WherePrescription__Group_5__1__Impl rule__WherePrescription__Group_5__2
            {
            pushFollow(FOLLOW_29);
            rule__WherePrescription__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_5__2();

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
    // $ANTLR end "rule__WherePrescription__Group_5__1"


    // $ANTLR start "rule__WherePrescription__Group_5__1__Impl"
    // InternalQueryDsl.g:5788:1: rule__WherePrescription__Group_5__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5792:1: ( ( '=' ) )
            // InternalQueryDsl.g:5793:1: ( '=' )
            {
            // InternalQueryDsl.g:5793:1: ( '=' )
            // InternalQueryDsl.g:5794:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_5_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_5_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_5__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_5__2"
    // InternalQueryDsl.g:5803:1: rule__WherePrescription__Group_5__2 : rule__WherePrescription__Group_5__2__Impl ;
    public final void rule__WherePrescription__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5807:1: ( rule__WherePrescription__Group_5__2__Impl )
            // InternalQueryDsl.g:5808:2: rule__WherePrescription__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_5__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_5__2"


    // $ANTLR start "rule__WherePrescription__Group_5__2__Impl"
    // InternalQueryDsl.g:5814:1: rule__WherePrescription__Group_5__2__Impl : ( ( rule__WherePrescription__OrderedAssignment_5_2 ) ) ;
    public final void rule__WherePrescription__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5818:1: ( ( ( rule__WherePrescription__OrderedAssignment_5_2 ) ) )
            // InternalQueryDsl.g:5819:1: ( ( rule__WherePrescription__OrderedAssignment_5_2 ) )
            {
            // InternalQueryDsl.g:5819:1: ( ( rule__WherePrescription__OrderedAssignment_5_2 ) )
            // InternalQueryDsl.g:5820:2: ( rule__WherePrescription__OrderedAssignment_5_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getOrderedAssignment_5_2()); 
            // InternalQueryDsl.g:5821:2: ( rule__WherePrescription__OrderedAssignment_5_2 )
            // InternalQueryDsl.g:5821:3: rule__WherePrescription__OrderedAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__OrderedAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getOrderedAssignment_5_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_5__2__Impl"


    // $ANTLR start "rule__WherePrescription__Group_6__0"
    // InternalQueryDsl.g:5830:1: rule__WherePrescription__Group_6__0 : rule__WherePrescription__Group_6__0__Impl rule__WherePrescription__Group_6__1 ;
    public final void rule__WherePrescription__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5834:1: ( rule__WherePrescription__Group_6__0__Impl rule__WherePrescription__Group_6__1 )
            // InternalQueryDsl.g:5835:2: rule__WherePrescription__Group_6__0__Impl rule__WherePrescription__Group_6__1
            {
            pushFollow(FOLLOW_35);
            rule__WherePrescription__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_6__1();

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
    // $ANTLR end "rule__WherePrescription__Group_6__0"


    // $ANTLR start "rule__WherePrescription__Group_6__0__Impl"
    // InternalQueryDsl.g:5842:1: rule__WherePrescription__Group_6__0__Impl : ( 'price' ) ;
    public final void rule__WherePrescription__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5846:1: ( ( 'price' ) )
            // InternalQueryDsl.g:5847:1: ( 'price' )
            {
            // InternalQueryDsl.g:5847:1: ( 'price' )
            // InternalQueryDsl.g:5848:2: 'price'
            {
             before(grammarAccess.getWherePrescriptionAccess().getPriceKeyword_6_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getPriceKeyword_6_0()); 

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
    // $ANTLR end "rule__WherePrescription__Group_6__0__Impl"


    // $ANTLR start "rule__WherePrescription__Group_6__1"
    // InternalQueryDsl.g:5857:1: rule__WherePrescription__Group_6__1 : rule__WherePrescription__Group_6__1__Impl rule__WherePrescription__Group_6__2 ;
    public final void rule__WherePrescription__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5861:1: ( rule__WherePrescription__Group_6__1__Impl rule__WherePrescription__Group_6__2 )
            // InternalQueryDsl.g:5862:2: rule__WherePrescription__Group_6__1__Impl rule__WherePrescription__Group_6__2
            {
            pushFollow(FOLLOW_24);
            rule__WherePrescription__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_6__2();

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
    // $ANTLR end "rule__WherePrescription__Group_6__1"


    // $ANTLR start "rule__WherePrescription__Group_6__1__Impl"
    // InternalQueryDsl.g:5869:1: rule__WherePrescription__Group_6__1__Impl : ( '=' ) ;
    public final void rule__WherePrescription__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5873:1: ( ( '=' ) )
            // InternalQueryDsl.g:5874:1: ( '=' )
            {
            // InternalQueryDsl.g:5874:1: ( '=' )
            // InternalQueryDsl.g:5875:2: '='
            {
             before(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_6_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEqualsSignKeyword_6_1()); 

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
    // $ANTLR end "rule__WherePrescription__Group_6__1__Impl"


    // $ANTLR start "rule__WherePrescription__Group_6__2"
    // InternalQueryDsl.g:5884:1: rule__WherePrescription__Group_6__2 : rule__WherePrescription__Group_6__2__Impl ;
    public final void rule__WherePrescription__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5888:1: ( rule__WherePrescription__Group_6__2__Impl )
            // InternalQueryDsl.g:5889:2: rule__WherePrescription__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__Group_6__2__Impl();

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
    // $ANTLR end "rule__WherePrescription__Group_6__2"


    // $ANTLR start "rule__WherePrescription__Group_6__2__Impl"
    // InternalQueryDsl.g:5895:1: rule__WherePrescription__Group_6__2__Impl : ( ( rule__WherePrescription__PriceAssignment_6_2 ) ) ;
    public final void rule__WherePrescription__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5899:1: ( ( ( rule__WherePrescription__PriceAssignment_6_2 ) ) )
            // InternalQueryDsl.g:5900:1: ( ( rule__WherePrescription__PriceAssignment_6_2 ) )
            {
            // InternalQueryDsl.g:5900:1: ( ( rule__WherePrescription__PriceAssignment_6_2 ) )
            // InternalQueryDsl.g:5901:2: ( rule__WherePrescription__PriceAssignment_6_2 )
            {
             before(grammarAccess.getWherePrescriptionAccess().getPriceAssignment_6_2()); 
            // InternalQueryDsl.g:5902:2: ( rule__WherePrescription__PriceAssignment_6_2 )
            // InternalQueryDsl.g:5902:3: rule__WherePrescription__PriceAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__WherePrescription__PriceAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getWherePrescriptionAccess().getPriceAssignment_6_2()); 

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
    // $ANTLR end "rule__WherePrescription__Group_6__2__Impl"


    // $ANTLR start "rule__Model__QueryTypeAssignment"
    // InternalQueryDsl.g:5911:1: rule__Model__QueryTypeAssignment : ( ruleQueryType ) ;
    public final void rule__Model__QueryTypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5915:1: ( ( ruleQueryType ) )
            // InternalQueryDsl.g:5916:2: ( ruleQueryType )
            {
            // InternalQueryDsl.g:5916:2: ( ruleQueryType )
            // InternalQueryDsl.g:5917:3: ruleQueryType
            {
             before(grammarAccess.getModelAccess().getQueryTypeQueryTypeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQueryType();

            state._fsp--;

             after(grammarAccess.getModelAccess().getQueryTypeQueryTypeParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__QueryTypeAssignment"


    // $ANTLR start "rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0"
    // InternalQueryDsl.g:5926:1: rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0 : ( ruleVariableMedicalRecord ) ;
    public final void rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5930:1: ( ( ruleVariableMedicalRecord ) )
            // InternalQueryDsl.g:5931:2: ( ruleVariableMedicalRecord )
            {
            // InternalQueryDsl.g:5931:2: ( ruleVariableMedicalRecord )
            // InternalQueryDsl.g:5932:3: ruleVariableMedicalRecord
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordVariableMedicalRecordEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableMedicalRecord();

            state._fsp--;

             after(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordVariableMedicalRecordEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__VariableMedicalRecordAssignment_0"


    // $ANTLR start "rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1"
    // InternalQueryDsl.g:5941:1: rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1 : ( ruleVariableMedicalRecord ) ;
    public final void rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5945:1: ( ( ruleVariableMedicalRecord ) )
            // InternalQueryDsl.g:5946:2: ( ruleVariableMedicalRecord )
            {
            // InternalQueryDsl.g:5946:2: ( ruleVariableMedicalRecord )
            // InternalQueryDsl.g:5947:3: ruleVariableMedicalRecord
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordNextVariableMedicalRecordEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableMedicalRecord();

            state._fsp--;

             after(grammarAccess.getSelectMedicalRecordAccess().getVariableMedicalRecordNextVariableMedicalRecordEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__VariableMedicalRecordNextAssignment_1_1"


    // $ANTLR start "rule__SelectMedicalRecord__WhereAssignment_4_1"
    // InternalQueryDsl.g:5956:1: rule__SelectMedicalRecord__WhereAssignment_4_1 : ( ruleWhereMedicalRecord ) ;
    public final void rule__SelectMedicalRecord__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5960:1: ( ( ruleWhereMedicalRecord ) )
            // InternalQueryDsl.g:5961:2: ( ruleWhereMedicalRecord )
            {
            // InternalQueryDsl.g:5961:2: ( ruleWhereMedicalRecord )
            // InternalQueryDsl.g:5962:3: ruleWhereMedicalRecord
            {
             before(grammarAccess.getSelectMedicalRecordAccess().getWhereWhereMedicalRecordParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereMedicalRecord();

            state._fsp--;

             after(grammarAccess.getSelectMedicalRecordAccess().getWhereWhereMedicalRecordParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SelectMedicalRecord__WhereAssignment_4_1"


    // $ANTLR start "rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0"
    // InternalQueryDsl.g:5971:1: rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0 : ( ruleVariablePatientMonitoring ) ;
    public final void rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5975:1: ( ( ruleVariablePatientMonitoring ) )
            // InternalQueryDsl.g:5976:2: ( ruleVariablePatientMonitoring )
            {
            // InternalQueryDsl.g:5976:2: ( ruleVariablePatientMonitoring )
            // InternalQueryDsl.g:5977:3: ruleVariablePatientMonitoring
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringVariablePatientMonitoringEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariablePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringVariablePatientMonitoringEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__VariablePatientMonitoringAssignment_0"


    // $ANTLR start "rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1"
    // InternalQueryDsl.g:5986:1: rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1 : ( ruleVariablePatientMonitoring ) ;
    public final void rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:5990:1: ( ( ruleVariablePatientMonitoring ) )
            // InternalQueryDsl.g:5991:2: ( ruleVariablePatientMonitoring )
            {
            // InternalQueryDsl.g:5991:2: ( ruleVariablePatientMonitoring )
            // InternalQueryDsl.g:5992:3: ruleVariablePatientMonitoring
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringNextVariablePatientMonitoringEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariablePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getSelectPatientMonitoringAccess().getVariablePatientMonitoringNextVariablePatientMonitoringEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__VariablePatientMonitoringNextAssignment_1_1"


    // $ANTLR start "rule__SelectPatientMonitoring__WhereAssignment_4_1"
    // InternalQueryDsl.g:6001:1: rule__SelectPatientMonitoring__WhereAssignment_4_1 : ( ruleWherePatientMonitoring ) ;
    public final void rule__SelectPatientMonitoring__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6005:1: ( ( ruleWherePatientMonitoring ) )
            // InternalQueryDsl.g:6006:2: ( ruleWherePatientMonitoring )
            {
            // InternalQueryDsl.g:6006:2: ( ruleWherePatientMonitoring )
            // InternalQueryDsl.g:6007:3: ruleWherePatientMonitoring
            {
             before(grammarAccess.getSelectPatientMonitoringAccess().getWhereWherePatientMonitoringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getSelectPatientMonitoringAccess().getWhereWherePatientMonitoringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SelectPatientMonitoring__WhereAssignment_4_1"


    // $ANTLR start "rule__SelectPrescription__VariablePrescriptionAssignment_0"
    // InternalQueryDsl.g:6016:1: rule__SelectPrescription__VariablePrescriptionAssignment_0 : ( ruleVariablePrescription ) ;
    public final void rule__SelectPrescription__VariablePrescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6020:1: ( ( ruleVariablePrescription ) )
            // InternalQueryDsl.g:6021:2: ( ruleVariablePrescription )
            {
            // InternalQueryDsl.g:6021:2: ( ruleVariablePrescription )
            // InternalQueryDsl.g:6022:3: ruleVariablePrescription
            {
             before(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionVariablePrescriptionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVariablePrescription();

            state._fsp--;

             after(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionVariablePrescriptionEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__SelectPrescription__VariablePrescriptionAssignment_0"


    // $ANTLR start "rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1"
    // InternalQueryDsl.g:6031:1: rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1 : ( ruleVariablePrescription ) ;
    public final void rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6035:1: ( ( ruleVariablePrescription ) )
            // InternalQueryDsl.g:6036:2: ( ruleVariablePrescription )
            {
            // InternalQueryDsl.g:6036:2: ( ruleVariablePrescription )
            // InternalQueryDsl.g:6037:3: ruleVariablePrescription
            {
             before(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionNextVariablePrescriptionEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariablePrescription();

            state._fsp--;

             after(grammarAccess.getSelectPrescriptionAccess().getVariablePrescriptionNextVariablePrescriptionEnumRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__SelectPrescription__VariablePrescriptionNextAssignment_1_1"


    // $ANTLR start "rule__SelectPrescription__WhereAssignment_4_1"
    // InternalQueryDsl.g:6046:1: rule__SelectPrescription__WhereAssignment_4_1 : ( ruleWherePrescription ) ;
    public final void rule__SelectPrescription__WhereAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6050:1: ( ( ruleWherePrescription ) )
            // InternalQueryDsl.g:6051:2: ( ruleWherePrescription )
            {
            // InternalQueryDsl.g:6051:2: ( ruleWherePrescription )
            // InternalQueryDsl.g:6052:3: ruleWherePrescription
            {
             before(grammarAccess.getSelectPrescriptionAccess().getWhereWherePrescriptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePrescription();

            state._fsp--;

             after(grammarAccess.getSelectPrescriptionAccess().getWhereWherePrescriptionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SelectPrescription__WhereAssignment_4_1"


    // $ANTLR start "rule__InsertMedicalRecord__RecordIdAssignment_2"
    // InternalQueryDsl.g:6061:1: rule__InsertMedicalRecord__RecordIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__InsertMedicalRecord__RecordIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6065:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6066:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6066:2: ( RULE_INT )
            // InternalQueryDsl.g:6067:3: RULE_INT
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getRecordIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getRecordIdINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__RecordIdAssignment_2"


    // $ANTLR start "rule__InsertMedicalRecord__PatientIdAssignment_4"
    // InternalQueryDsl.g:6076:1: rule__InsertMedicalRecord__PatientIdAssignment_4 : ( RULE_INT ) ;
    public final void rule__InsertMedicalRecord__PatientIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6080:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6081:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6081:2: ( RULE_INT )
            // InternalQueryDsl.g:6082:3: RULE_INT
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getPatientIdINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getPatientIdINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__PatientIdAssignment_4"


    // $ANTLR start "rule__InsertMedicalRecord__DoctorIdAssignment_6"
    // InternalQueryDsl.g:6091:1: rule__InsertMedicalRecord__DoctorIdAssignment_6 : ( RULE_INT ) ;
    public final void rule__InsertMedicalRecord__DoctorIdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6095:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6096:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6096:2: ( RULE_INT )
            // InternalQueryDsl.g:6097:3: RULE_INT
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__DoctorIdAssignment_6"


    // $ANTLR start "rule__InsertMedicalRecord__MedicalConditionAssignment_8"
    // InternalQueryDsl.g:6106:1: rule__InsertMedicalRecord__MedicalConditionAssignment_8 : ( ruleMedicalCondition ) ;
    public final void rule__InsertMedicalRecord__MedicalConditionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6110:1: ( ( ruleMedicalCondition ) )
            // InternalQueryDsl.g:6111:2: ( ruleMedicalCondition )
            {
            // InternalQueryDsl.g:6111:2: ( ruleMedicalCondition )
            // InternalQueryDsl.g:6112:3: ruleMedicalCondition
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicalCondition();

            state._fsp--;

             after(grammarAccess.getInsertMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_8_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__MedicalConditionAssignment_8"


    // $ANTLR start "rule__InsertMedicalRecord__DateAssignment_10"
    // InternalQueryDsl.g:6121:1: rule__InsertMedicalRecord__DateAssignment_10 : ( RULE_DATE ) ;
    public final void rule__InsertMedicalRecord__DateAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6125:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6126:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6126:2: ( RULE_DATE )
            // InternalQueryDsl.g:6127:3: RULE_DATE
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDateDATETerminalRuleCall_10_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getDateDATETerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__DateAssignment_10"


    // $ANTLR start "rule__InsertMedicalRecord__PriceAssignment_12"
    // InternalQueryDsl.g:6136:1: rule__InsertMedicalRecord__PriceAssignment_12 : ( RULE_DOUBLE ) ;
    public final void rule__InsertMedicalRecord__PriceAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6140:1: ( ( RULE_DOUBLE ) )
            // InternalQueryDsl.g:6141:2: ( RULE_DOUBLE )
            {
            // InternalQueryDsl.g:6141:2: ( RULE_DOUBLE )
            // InternalQueryDsl.g:6142:3: RULE_DOUBLE
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_12_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__PriceAssignment_12"


    // $ANTLR start "rule__InsertMedicalRecord__DescriptionAssignment_14"
    // InternalQueryDsl.g:6151:1: rule__InsertMedicalRecord__DescriptionAssignment_14 : ( RULE_STRING ) ;
    public final void rule__InsertMedicalRecord__DescriptionAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6155:1: ( ( RULE_STRING ) )
            // InternalQueryDsl.g:6156:2: ( RULE_STRING )
            {
            // InternalQueryDsl.g:6156:2: ( RULE_STRING )
            // InternalQueryDsl.g:6157:3: RULE_STRING
            {
             before(grammarAccess.getInsertMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_14_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__InsertMedicalRecord__DescriptionAssignment_14"


    // $ANTLR start "rule__InsertPatientMonitoring__MonitoringIdAssignment_2"
    // InternalQueryDsl.g:6166:1: rule__InsertPatientMonitoring__MonitoringIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__InsertPatientMonitoring__MonitoringIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6170:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6171:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6171:2: ( RULE_INT )
            // InternalQueryDsl.g:6172:3: RULE_INT
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__MonitoringIdAssignment_2"


    // $ANTLR start "rule__InsertPatientMonitoring__PatientIdAssignment_4"
    // InternalQueryDsl.g:6181:1: rule__InsertPatientMonitoring__PatientIdAssignment_4 : ( RULE_INT ) ;
    public final void rule__InsertPatientMonitoring__PatientIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6185:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6186:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6186:2: ( RULE_INT )
            // InternalQueryDsl.g:6187:3: RULE_INT
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getPatientIdINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getPatientIdINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__PatientIdAssignment_4"


    // $ANTLR start "rule__InsertPatientMonitoring__CategoryAssignment_6"
    // InternalQueryDsl.g:6196:1: rule__InsertPatientMonitoring__CategoryAssignment_6 : ( ruleMedicalCondition ) ;
    public final void rule__InsertPatientMonitoring__CategoryAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6200:1: ( ( ruleMedicalCondition ) )
            // InternalQueryDsl.g:6201:2: ( ruleMedicalCondition )
            {
            // InternalQueryDsl.g:6201:2: ( ruleMedicalCondition )
            // InternalQueryDsl.g:6202:3: ruleMedicalCondition
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicalCondition();

            state._fsp--;

             after(grammarAccess.getInsertPatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_6_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__CategoryAssignment_6"


    // $ANTLR start "rule__InsertPatientMonitoring__DateAssignment_8"
    // InternalQueryDsl.g:6211:1: rule__InsertPatientMonitoring__DateAssignment_8 : ( RULE_DATE ) ;
    public final void rule__InsertPatientMonitoring__DateAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6215:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6216:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6216:2: ( RULE_DATE )
            // InternalQueryDsl.g:6217:3: RULE_DATE
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getDateDATETerminalRuleCall_8_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getDateDATETerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__DateAssignment_8"


    // $ANTLR start "rule__InsertPatientMonitoring__RiskPerceptionAssignment_10"
    // InternalQueryDsl.g:6226:1: rule__InsertPatientMonitoring__RiskPerceptionAssignment_10 : ( ruleRiskPerception ) ;
    public final void rule__InsertPatientMonitoring__RiskPerceptionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6230:1: ( ( ruleRiskPerception ) )
            // InternalQueryDsl.g:6231:2: ( ruleRiskPerception )
            {
            // InternalQueryDsl.g:6231:2: ( ruleRiskPerception )
            // InternalQueryDsl.g:6232:3: ruleRiskPerception
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getRiskPerceptionRiskPerceptionEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleRiskPerception();

            state._fsp--;

             after(grammarAccess.getInsertPatientMonitoringAccess().getRiskPerceptionRiskPerceptionEnumRuleCall_10_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__RiskPerceptionAssignment_10"


    // $ANTLR start "rule__InsertPatientMonitoring__TreadtedAssignment_12"
    // InternalQueryDsl.g:6241:1: rule__InsertPatientMonitoring__TreadtedAssignment_12 : ( RULE_BOOLEAN ) ;
    public final void rule__InsertPatientMonitoring__TreadtedAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6245:1: ( ( RULE_BOOLEAN ) )
            // InternalQueryDsl.g:6246:2: ( RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:6246:2: ( RULE_BOOLEAN )
            // InternalQueryDsl.g:6247:3: RULE_BOOLEAN
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getTreadtedBOOLEANTerminalRuleCall_12_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getTreadtedBOOLEANTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__TreadtedAssignment_12"


    // $ANTLR start "rule__InsertPatientMonitoring__DeviceIdAssignment_14"
    // InternalQueryDsl.g:6256:1: rule__InsertPatientMonitoring__DeviceIdAssignment_14 : ( RULE_INT ) ;
    public final void rule__InsertPatientMonitoring__DeviceIdAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6260:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6261:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6261:2: ( RULE_INT )
            // InternalQueryDsl.g:6262:3: RULE_INT
            {
             before(grammarAccess.getInsertPatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_14_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertPatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__InsertPatientMonitoring__DeviceIdAssignment_14"


    // $ANTLR start "rule__InsertPrescription__PrescriptionIdAssignment_2"
    // InternalQueryDsl.g:6271:1: rule__InsertPrescription__PrescriptionIdAssignment_2 : ( RULE_INT ) ;
    public final void rule__InsertPrescription__PrescriptionIdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6275:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6276:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6276:2: ( RULE_INT )
            // InternalQueryDsl.g:6277:3: RULE_INT
            {
             before(grammarAccess.getInsertPrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__InsertPrescription__PrescriptionIdAssignment_2"


    // $ANTLR start "rule__InsertPrescription__RecordIdAssignment_4"
    // InternalQueryDsl.g:6286:1: rule__InsertPrescription__RecordIdAssignment_4 : ( RULE_INT ) ;
    public final void rule__InsertPrescription__RecordIdAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6290:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6291:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6291:2: ( RULE_INT )
            // InternalQueryDsl.g:6292:3: RULE_INT
            {
             before(grammarAccess.getInsertPrescriptionAccess().getRecordIdINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getRecordIdINTTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__InsertPrescription__RecordIdAssignment_4"


    // $ANTLR start "rule__InsertPrescription__MedicationNameAssignment_6"
    // InternalQueryDsl.g:6301:1: rule__InsertPrescription__MedicationNameAssignment_6 : ( RULE_STRING ) ;
    public final void rule__InsertPrescription__MedicationNameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6305:1: ( ( RULE_STRING ) )
            // InternalQueryDsl.g:6306:2: ( RULE_STRING )
            {
            // InternalQueryDsl.g:6306:2: ( RULE_STRING )
            // InternalQueryDsl.g:6307:3: RULE_STRING
            {
             before(grammarAccess.getInsertPrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_6_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_6_0()); 

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
    // $ANTLR end "rule__InsertPrescription__MedicationNameAssignment_6"


    // $ANTLR start "rule__InsertPrescription__StartAssignment_8"
    // InternalQueryDsl.g:6316:1: rule__InsertPrescription__StartAssignment_8 : ( RULE_DATE ) ;
    public final void rule__InsertPrescription__StartAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6320:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6321:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6321:2: ( RULE_DATE )
            // InternalQueryDsl.g:6322:3: RULE_DATE
            {
             before(grammarAccess.getInsertPrescriptionAccess().getStartDATETerminalRuleCall_8_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getStartDATETerminalRuleCall_8_0()); 

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
    // $ANTLR end "rule__InsertPrescription__StartAssignment_8"


    // $ANTLR start "rule__InsertPrescription__EndAssignment_10"
    // InternalQueryDsl.g:6331:1: rule__InsertPrescription__EndAssignment_10 : ( RULE_DATE ) ;
    public final void rule__InsertPrescription__EndAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6335:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6336:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6336:2: ( RULE_DATE )
            // InternalQueryDsl.g:6337:3: RULE_DATE
            {
             before(grammarAccess.getInsertPrescriptionAccess().getEndDATETerminalRuleCall_10_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getEndDATETerminalRuleCall_10_0()); 

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
    // $ANTLR end "rule__InsertPrescription__EndAssignment_10"


    // $ANTLR start "rule__InsertPrescription__OrderedAssignment_12"
    // InternalQueryDsl.g:6346:1: rule__InsertPrescription__OrderedAssignment_12 : ( RULE_BOOLEAN ) ;
    public final void rule__InsertPrescription__OrderedAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6350:1: ( ( RULE_BOOLEAN ) )
            // InternalQueryDsl.g:6351:2: ( RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:6351:2: ( RULE_BOOLEAN )
            // InternalQueryDsl.g:6352:3: RULE_BOOLEAN
            {
             before(grammarAccess.getInsertPrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_12_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_12_0()); 

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
    // $ANTLR end "rule__InsertPrescription__OrderedAssignment_12"


    // $ANTLR start "rule__InsertPrescription__PriceAssignment_14"
    // InternalQueryDsl.g:6361:1: rule__InsertPrescription__PriceAssignment_14 : ( RULE_DOUBLE ) ;
    public final void rule__InsertPrescription__PriceAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6365:1: ( ( RULE_DOUBLE ) )
            // InternalQueryDsl.g:6366:2: ( RULE_DOUBLE )
            {
            // InternalQueryDsl.g:6366:2: ( RULE_DOUBLE )
            // InternalQueryDsl.g:6367:3: RULE_DOUBLE
            {
             before(grammarAccess.getInsertPrescriptionAccess().getPriceDOUBLETerminalRuleCall_14_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getInsertPrescriptionAccess().getPriceDOUBLETerminalRuleCall_14_0()); 

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
    // $ANTLR end "rule__InsertPrescription__PriceAssignment_14"


    // $ANTLR start "rule__Drop__Table_nameAssignment_2"
    // InternalQueryDsl.g:6376:1: rule__Drop__Table_nameAssignment_2 : ( ruleTableName ) ;
    public final void rule__Drop__Table_nameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6380:1: ( ( ruleTableName ) )
            // InternalQueryDsl.g:6381:2: ( ruleTableName )
            {
            // InternalQueryDsl.g:6381:2: ( ruleTableName )
            // InternalQueryDsl.g:6382:3: ruleTableName
            {
             before(grammarAccess.getDropAccess().getTable_nameTableNameEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTableName();

            state._fsp--;

             after(grammarAccess.getDropAccess().getTable_nameTableNameEnumRuleCall_2_0()); 

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
    // $ANTLR end "rule__Drop__Table_nameAssignment_2"


    // $ANTLR start "rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2"
    // InternalQueryDsl.g:6391:1: rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2 : ( ruleWhereMedicalRecord ) ;
    public final void rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6395:1: ( ( ruleWhereMedicalRecord ) )
            // InternalQueryDsl.g:6396:2: ( ruleWhereMedicalRecord )
            {
            // InternalQueryDsl.g:6396:2: ( ruleWhereMedicalRecord )
            // InternalQueryDsl.g:6397:3: ruleWhereMedicalRecord
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereMedicalRecord();

            state._fsp--;

             after(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_2"


    // $ANTLR start "rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1"
    // InternalQueryDsl.g:6406:1: rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1 : ( ruleWhereMedicalRecord ) ;
    public final void rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6410:1: ( ( ruleWhereMedicalRecord ) )
            // InternalQueryDsl.g:6411:2: ( ruleWhereMedicalRecord )
            {
            // InternalQueryDsl.g:6411:2: ( ruleWhereMedicalRecord )
            // InternalQueryDsl.g:6412:3: ruleWhereMedicalRecord
            {
             before(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereMedicalRecord();

            state._fsp--;

             after(grammarAccess.getDeleteMedicalRecordAccess().getWhereMedicalRecordWhereMedicalRecordParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DeleteMedicalRecord__WhereMedicalRecordAssignment_3_1"


    // $ANTLR start "rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2"
    // InternalQueryDsl.g:6421:1: rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2 : ( ruleWherePatientMonitoring ) ;
    public final void rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6425:1: ( ( ruleWherePatientMonitoring ) )
            // InternalQueryDsl.g:6426:2: ( ruleWherePatientMonitoring )
            {
            // InternalQueryDsl.g:6426:2: ( ruleWherePatientMonitoring )
            // InternalQueryDsl.g:6427:3: ruleWherePatientMonitoring
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_2"


    // $ANTLR start "rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1"
    // InternalQueryDsl.g:6436:1: rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1 : ( ruleWherePatientMonitoring ) ;
    public final void rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6440:1: ( ( ruleWherePatientMonitoring ) )
            // InternalQueryDsl.g:6441:2: ( ruleWherePatientMonitoring )
            {
            // InternalQueryDsl.g:6441:2: ( ruleWherePatientMonitoring )
            // InternalQueryDsl.g:6442:3: ruleWherePatientMonitoring
            {
             before(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePatientMonitoring();

            state._fsp--;

             after(grammarAccess.getDeletePatientMonitoringAccess().getWherepatientMonitoringWherePatientMonitoringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DeletePatientMonitoring__WherepatientMonitoringAssignment_3_1"


    // $ANTLR start "rule__DeletePrescription__WhereprescriptionAssignment_2"
    // InternalQueryDsl.g:6451:1: rule__DeletePrescription__WhereprescriptionAssignment_2 : ( ruleWherePrescription ) ;
    public final void rule__DeletePrescription__WhereprescriptionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6455:1: ( ( ruleWherePrescription ) )
            // InternalQueryDsl.g:6456:2: ( ruleWherePrescription )
            {
            // InternalQueryDsl.g:6456:2: ( ruleWherePrescription )
            // InternalQueryDsl.g:6457:3: ruleWherePrescription
            {
             before(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePrescription();

            state._fsp--;

             after(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DeletePrescription__WhereprescriptionAssignment_2"


    // $ANTLR start "rule__DeletePrescription__WhereprescriptionAssignment_3_1"
    // InternalQueryDsl.g:6466:1: rule__DeletePrescription__WhereprescriptionAssignment_3_1 : ( ruleWherePrescription ) ;
    public final void rule__DeletePrescription__WhereprescriptionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6470:1: ( ( ruleWherePrescription ) )
            // InternalQueryDsl.g:6471:2: ( ruleWherePrescription )
            {
            // InternalQueryDsl.g:6471:2: ( ruleWherePrescription )
            // InternalQueryDsl.g:6472:3: ruleWherePrescription
            {
             before(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWherePrescription();

            state._fsp--;

             after(grammarAccess.getDeletePrescriptionAccess().getWhereprescriptionWherePrescriptionParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__DeletePrescription__WhereprescriptionAssignment_3_1"


    // $ANTLR start "rule__WhereMedicalRecord__RecordIdAssignment_0_2"
    // InternalQueryDsl.g:6481:1: rule__WhereMedicalRecord__RecordIdAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__WhereMedicalRecord__RecordIdAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6485:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6486:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6486:2: ( RULE_INT )
            // InternalQueryDsl.g:6487:3: RULE_INT
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getRecordIdINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getRecordIdINTTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__RecordIdAssignment_0_2"


    // $ANTLR start "rule__WhereMedicalRecord__PatientIdAssignment_1_2"
    // InternalQueryDsl.g:6496:1: rule__WhereMedicalRecord__PatientIdAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__WhereMedicalRecord__PatientIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6500:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6501:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6501:2: ( RULE_INT )
            // InternalQueryDsl.g:6502:3: RULE_INT
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPatientIdINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getPatientIdINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__PatientIdAssignment_1_2"


    // $ANTLR start "rule__WhereMedicalRecord__DoctorIdAssignment_2_2"
    // InternalQueryDsl.g:6511:1: rule__WhereMedicalRecord__DoctorIdAssignment_2_2 : ( RULE_INT ) ;
    public final void rule__WhereMedicalRecord__DoctorIdAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6515:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6516:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6516:2: ( RULE_INT )
            // InternalQueryDsl.g:6517:3: RULE_INT
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_2_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDoctorIdINTTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__DoctorIdAssignment_2_2"


    // $ANTLR start "rule__WhereMedicalRecord__MedicalConditionAssignment_3_2"
    // InternalQueryDsl.g:6526:1: rule__WhereMedicalRecord__MedicalConditionAssignment_3_2 : ( ruleMedicalCondition ) ;
    public final void rule__WhereMedicalRecord__MedicalConditionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6530:1: ( ( ruleMedicalCondition ) )
            // InternalQueryDsl.g:6531:2: ( ruleMedicalCondition )
            {
            // InternalQueryDsl.g:6531:2: ( ruleMedicalCondition )
            // InternalQueryDsl.g:6532:3: ruleMedicalCondition
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicalCondition();

            state._fsp--;

             after(grammarAccess.getWhereMedicalRecordAccess().getMedicalConditionMedicalConditionEnumRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__MedicalConditionAssignment_3_2"


    // $ANTLR start "rule__WhereMedicalRecord__DateAssignment_4_2"
    // InternalQueryDsl.g:6541:1: rule__WhereMedicalRecord__DateAssignment_4_2 : ( RULE_DATE ) ;
    public final void rule__WhereMedicalRecord__DateAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6545:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6546:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6546:2: ( RULE_DATE )
            // InternalQueryDsl.g:6547:3: RULE_DATE
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDateDATETerminalRuleCall_4_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDateDATETerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__DateAssignment_4_2"


    // $ANTLR start "rule__WhereMedicalRecord__PriceAssignment_5_2"
    // InternalQueryDsl.g:6556:1: rule__WhereMedicalRecord__PriceAssignment_5_2 : ( RULE_DOUBLE ) ;
    public final void rule__WhereMedicalRecord__PriceAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6560:1: ( ( RULE_DOUBLE ) )
            // InternalQueryDsl.g:6561:2: ( RULE_DOUBLE )
            {
            // InternalQueryDsl.g:6561:2: ( RULE_DOUBLE )
            // InternalQueryDsl.g:6562:3: RULE_DOUBLE
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_5_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getPriceDOUBLETerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__PriceAssignment_5_2"


    // $ANTLR start "rule__WhereMedicalRecord__DescriptionAssignment_6_2"
    // InternalQueryDsl.g:6571:1: rule__WhereMedicalRecord__DescriptionAssignment_6_2 : ( RULE_STRING ) ;
    public final void rule__WhereMedicalRecord__DescriptionAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6575:1: ( ( RULE_STRING ) )
            // InternalQueryDsl.g:6576:2: ( RULE_STRING )
            {
            // InternalQueryDsl.g:6576:2: ( RULE_STRING )
            // InternalQueryDsl.g:6577:3: RULE_STRING
            {
             before(grammarAccess.getWhereMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWhereMedicalRecordAccess().getDescriptionSTRINGTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__WhereMedicalRecord__DescriptionAssignment_6_2"


    // $ANTLR start "rule__WherePatientMonitoring__MonitoringIdAssignment_0_2"
    // InternalQueryDsl.g:6586:1: rule__WherePatientMonitoring__MonitoringIdAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__WherePatientMonitoring__MonitoringIdAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6590:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6591:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6591:2: ( RULE_INT )
            // InternalQueryDsl.g:6592:3: RULE_INT
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getMonitoringIdINTTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__MonitoringIdAssignment_0_2"


    // $ANTLR start "rule__WherePatientMonitoring__PatientIdAssignment_1_2"
    // InternalQueryDsl.g:6601:1: rule__WherePatientMonitoring__PatientIdAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__WherePatientMonitoring__PatientIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6605:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6606:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6606:2: ( RULE_INT )
            // InternalQueryDsl.g:6607:3: RULE_INT
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getPatientIdINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getPatientIdINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__PatientIdAssignment_1_2"


    // $ANTLR start "rule__WherePatientMonitoring__CategoryAssignment_2_2"
    // InternalQueryDsl.g:6616:1: rule__WherePatientMonitoring__CategoryAssignment_2_2 : ( ruleMedicalCondition ) ;
    public final void rule__WherePatientMonitoring__CategoryAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6620:1: ( ( ruleMedicalCondition ) )
            // InternalQueryDsl.g:6621:2: ( ruleMedicalCondition )
            {
            // InternalQueryDsl.g:6621:2: ( ruleMedicalCondition )
            // InternalQueryDsl.g:6622:3: ruleMedicalCondition
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicalCondition();

            state._fsp--;

             after(grammarAccess.getWherePatientMonitoringAccess().getCategoryMedicalConditionEnumRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__CategoryAssignment_2_2"


    // $ANTLR start "rule__WherePatientMonitoring__DateAssignment_3_2"
    // InternalQueryDsl.g:6631:1: rule__WherePatientMonitoring__DateAssignment_3_2 : ( RULE_DATE ) ;
    public final void rule__WherePatientMonitoring__DateAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6635:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6636:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6636:2: ( RULE_DATE )
            // InternalQueryDsl.g:6637:3: RULE_DATE
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDateDATETerminalRuleCall_3_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getDateDATETerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__DateAssignment_3_2"


    // $ANTLR start "rule__WherePatientMonitoring__RiskperceptionAssignment_4_2"
    // InternalQueryDsl.g:6646:1: rule__WherePatientMonitoring__RiskperceptionAssignment_4_2 : ( ruleRiskPerception ) ;
    public final void rule__WherePatientMonitoring__RiskperceptionAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6650:1: ( ( ruleRiskPerception ) )
            // InternalQueryDsl.g:6651:2: ( ruleRiskPerception )
            {
            // InternalQueryDsl.g:6651:2: ( ruleRiskPerception )
            // InternalQueryDsl.g:6652:3: ruleRiskPerception
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getRiskperceptionRiskPerceptionEnumRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRiskPerception();

            state._fsp--;

             after(grammarAccess.getWherePatientMonitoringAccess().getRiskperceptionRiskPerceptionEnumRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__RiskperceptionAssignment_4_2"


    // $ANTLR start "rule__WherePatientMonitoring__TreatedAssignment_5_2"
    // InternalQueryDsl.g:6661:1: rule__WherePatientMonitoring__TreatedAssignment_5_2 : ( RULE_BOOLEAN ) ;
    public final void rule__WherePatientMonitoring__TreatedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6665:1: ( ( RULE_BOOLEAN ) )
            // InternalQueryDsl.g:6666:2: ( RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:6666:2: ( RULE_BOOLEAN )
            // InternalQueryDsl.g:6667:3: RULE_BOOLEAN
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getTreatedBOOLEANTerminalRuleCall_5_2_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getTreatedBOOLEANTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__TreatedAssignment_5_2"


    // $ANTLR start "rule__WherePatientMonitoring__DeviceIdAssignment_6_2"
    // InternalQueryDsl.g:6676:1: rule__WherePatientMonitoring__DeviceIdAssignment_6_2 : ( RULE_INT ) ;
    public final void rule__WherePatientMonitoring__DeviceIdAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6680:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6681:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6681:2: ( RULE_INT )
            // InternalQueryDsl.g:6682:3: RULE_INT
            {
             before(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_6_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWherePatientMonitoringAccess().getDeviceIdINTTerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__WherePatientMonitoring__DeviceIdAssignment_6_2"


    // $ANTLR start "rule__WherePrescription__PrescriptionIdAssignment_0_2"
    // InternalQueryDsl.g:6691:1: rule__WherePrescription__PrescriptionIdAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__WherePrescription__PrescriptionIdAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6695:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6696:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6696:2: ( RULE_INT )
            // InternalQueryDsl.g:6697:3: RULE_INT
            {
             before(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getPrescriptionIdINTTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__PrescriptionIdAssignment_0_2"


    // $ANTLR start "rule__WherePrescription__RecordIdAssignment_1_2"
    // InternalQueryDsl.g:6706:1: rule__WherePrescription__RecordIdAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__WherePrescription__RecordIdAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6710:1: ( ( RULE_INT ) )
            // InternalQueryDsl.g:6711:2: ( RULE_INT )
            {
            // InternalQueryDsl.g:6711:2: ( RULE_INT )
            // InternalQueryDsl.g:6712:3: RULE_INT
            {
             before(grammarAccess.getWherePrescriptionAccess().getRecordIdINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getRecordIdINTTerminalRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__RecordIdAssignment_1_2"


    // $ANTLR start "rule__WherePrescription__MedicationNameAssignment_2_2"
    // InternalQueryDsl.g:6721:1: rule__WherePrescription__MedicationNameAssignment_2_2 : ( RULE_STRING ) ;
    public final void rule__WherePrescription__MedicationNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6725:1: ( ( RULE_STRING ) )
            // InternalQueryDsl.g:6726:2: ( RULE_STRING )
            {
            // InternalQueryDsl.g:6726:2: ( RULE_STRING )
            // InternalQueryDsl.g:6727:3: RULE_STRING
            {
             before(grammarAccess.getWherePrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_2_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getMedicationNameSTRINGTerminalRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__MedicationNameAssignment_2_2"


    // $ANTLR start "rule__WherePrescription__StartAssignment_3_2"
    // InternalQueryDsl.g:6736:1: rule__WherePrescription__StartAssignment_3_2 : ( RULE_DATE ) ;
    public final void rule__WherePrescription__StartAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6740:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6741:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6741:2: ( RULE_DATE )
            // InternalQueryDsl.g:6742:3: RULE_DATE
            {
             before(grammarAccess.getWherePrescriptionAccess().getStartDATETerminalRuleCall_3_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getStartDATETerminalRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__StartAssignment_3_2"


    // $ANTLR start "rule__WherePrescription__EndAssignment_4_2"
    // InternalQueryDsl.g:6751:1: rule__WherePrescription__EndAssignment_4_2 : ( RULE_DATE ) ;
    public final void rule__WherePrescription__EndAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6755:1: ( ( RULE_DATE ) )
            // InternalQueryDsl.g:6756:2: ( RULE_DATE )
            {
            // InternalQueryDsl.g:6756:2: ( RULE_DATE )
            // InternalQueryDsl.g:6757:3: RULE_DATE
            {
             before(grammarAccess.getWherePrescriptionAccess().getEndDATETerminalRuleCall_4_2_0()); 
            match(input,RULE_DATE,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getEndDATETerminalRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__EndAssignment_4_2"


    // $ANTLR start "rule__WherePrescription__OrderedAssignment_5_2"
    // InternalQueryDsl.g:6766:1: rule__WherePrescription__OrderedAssignment_5_2 : ( RULE_BOOLEAN ) ;
    public final void rule__WherePrescription__OrderedAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6770:1: ( ( RULE_BOOLEAN ) )
            // InternalQueryDsl.g:6771:2: ( RULE_BOOLEAN )
            {
            // InternalQueryDsl.g:6771:2: ( RULE_BOOLEAN )
            // InternalQueryDsl.g:6772:3: RULE_BOOLEAN
            {
             before(grammarAccess.getWherePrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_5_2_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getOrderedBOOLEANTerminalRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__OrderedAssignment_5_2"


    // $ANTLR start "rule__WherePrescription__PriceAssignment_6_2"
    // InternalQueryDsl.g:6781:1: rule__WherePrescription__PriceAssignment_6_2 : ( RULE_DOUBLE ) ;
    public final void rule__WherePrescription__PriceAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalQueryDsl.g:6785:1: ( ( RULE_DOUBLE ) )
            // InternalQueryDsl.g:6786:2: ( RULE_DOUBLE )
            {
            // InternalQueryDsl.g:6786:2: ( RULE_DOUBLE )
            // InternalQueryDsl.g:6787:3: RULE_DOUBLE
            {
             before(grammarAccess.getWherePrescriptionAccess().getPriceDOUBLETerminalRuleCall_6_2_0()); 
            match(input,RULE_DOUBLE,FOLLOW_2); 
             after(grammarAccess.getWherePrescriptionAccess().getPriceDOUBLETerminalRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__WherePrescription__PriceAssignment_6_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\24\2\56\1\uffff\2\56\2\uffff\1\24\1\21\1\24\1\21\4\56";
    static final String dfa_3s = "\1\44\2\60\1\uffff\2\60\2\uffff\1\44\1\23\1\37\1\22\4\60";
    static final String dfa_4s = "\3\uffff\1\1\2\uffff\1\2\1\3\10\uffff";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\2\3\1\4\1\5\1\3\5\6\5\7",
            "\1\11\1\uffff\1\10",
            "\1\13\1\uffff\1\12",
            "",
            "\1\13\1\uffff\1\12",
            "\1\11\1\uffff\1\10",
            "",
            "",
            "\1\14\4\3\1\15\1\3\5\uffff\5\7",
            "\1\3\1\uffff\1\7",
            "\1\3\1\16\2\3\1\17\2\3\5\6",
            "\1\3\1\6",
            "\1\11\1\uffff\1\10",
            "\1\11\1\uffff\1\10",
            "\1\13\1\uffff\1\12",
            "\1\13\1\uffff\1\12"
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
            return "631:1: rule__Select__Alternatives_1 : ( ( ruleSelectMedicalRecord ) | ( ruleSelectPatientMonitoring ) | ( ruleSelectPrescription ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0144200000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000001FFFF00000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0002800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007F00002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000F9200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000F9200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001F02100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001F02100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000E0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0400800000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0800000000000000L});

}