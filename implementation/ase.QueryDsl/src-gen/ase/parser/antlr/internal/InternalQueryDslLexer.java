package ase.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalQueryDslLexer extends Lexer {
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

    public InternalQueryDslLexer() {;} 
    public InternalQueryDslLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalQueryDslLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalQueryDsl.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:11:7: ( 'SELECT' )
            // InternalQueryDsl.g:11:9: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:12:7: ( ',' )
            // InternalQueryDsl.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:13:7: ( 'From' )
            // InternalQueryDsl.g:13:9: 'From'
            {
            match("From"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:14:7: ( 'MedicalRecord' )
            // InternalQueryDsl.g:14:9: 'MedicalRecord'
            {
            match("MedicalRecord"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:15:7: ( 'WHERE' )
            // InternalQueryDsl.g:15:9: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:16:7: ( ';' )
            // InternalQueryDsl.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:17:7: ( 'PatientMonitoring' )
            // InternalQueryDsl.g:17:9: 'PatientMonitoring'
            {
            match("PatientMonitoring"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:18:7: ( 'Prescription' )
            // InternalQueryDsl.g:18:9: 'Prescription'
            {
            match("Prescription"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:19:7: ( 'INSERT' )
            // InternalQueryDsl.g:19:9: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:20:7: ( 'INTO' )
            // InternalQueryDsl.g:20:9: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:21:7: ( 'Values(' )
            // InternalQueryDsl.g:21:9: 'Values('
            {
            match("Values("); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:22:7: ( ')' )
            // InternalQueryDsl.g:22:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:23:7: ( 'DROP' )
            // InternalQueryDsl.g:23:9: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:24:7: ( 'TABLE' )
            // InternalQueryDsl.g:24:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:25:7: ( 'DELETE' )
            // InternalQueryDsl.g:25:9: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:26:7: ( 'FROM' )
            // InternalQueryDsl.g:26:9: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:27:7: ( 'and' )
            // InternalQueryDsl.g:27:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:28:7: ( 'recordId' )
            // InternalQueryDsl.g:28:9: 'recordId'
            {
            match("recordId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:29:7: ( '=' )
            // InternalQueryDsl.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:30:7: ( 'patientId' )
            // InternalQueryDsl.g:30:9: 'patientId'
            {
            match("patientId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:31:7: ( 'doctorId' )
            // InternalQueryDsl.g:31:9: 'doctorId'
            {
            match("doctorId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:32:7: ( 'medicalCondition' )
            // InternalQueryDsl.g:32:9: 'medicalCondition'
            {
            match("medicalCondition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:33:7: ( 'date' )
            // InternalQueryDsl.g:33:9: 'date'
            {
            match("date"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:34:7: ( 'price' )
            // InternalQueryDsl.g:34:9: 'price'
            {
            match("price"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:35:7: ( 'description' )
            // InternalQueryDsl.g:35:9: 'description'
            {
            match("description"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:36:7: ( 'monitoringId' )
            // InternalQueryDsl.g:36:9: 'monitoringId'
            {
            match("monitoringId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:37:7: ( 'category' )
            // InternalQueryDsl.g:37:9: 'category'
            {
            match("category"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:38:7: ( 'riskPerception' )
            // InternalQueryDsl.g:38:9: 'riskPerception'
            {
            match("riskPerception"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:39:7: ( 'treated' )
            // InternalQueryDsl.g:39:9: 'treated'
            {
            match("treated"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:40:7: ( 'deviceId' )
            // InternalQueryDsl.g:40:9: 'deviceId'
            {
            match("deviceId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:41:7: ( 'prescriptionId' )
            // InternalQueryDsl.g:41:9: 'prescriptionId'
            {
            match("prescriptionId"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:42:7: ( 'medicationName' )
            // InternalQueryDsl.g:42:9: 'medicationName'
            {
            match("medicationName"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:43:7: ( 'start' )
            // InternalQueryDsl.g:43:9: 'start'
            {
            match("start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:44:7: ( 'end' )
            // InternalQueryDsl.g:44:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:45:7: ( 'ordered' )
            // InternalQueryDsl.g:45:9: 'ordered'
            {
            match("ordered"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:46:7: ( 'Bronchitis' )
            // InternalQueryDsl.g:46:9: 'Bronchitis'
            {
            match("Bronchitis"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:47:7: ( 'Asthma' )
            // InternalQueryDsl.g:47:9: 'Asthma'
            {
            match("Asthma"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:48:7: ( 'Diabetes' )
            // InternalQueryDsl.g:48:9: 'Diabetes'
            {
            match("Diabetes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:49:7: ( 'Flu' )
            // InternalQueryDsl.g:49:9: 'Flu'
            {
            match("Flu"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:50:7: ( 'Hypertension' )
            // InternalQueryDsl.g:50:9: 'Hypertension'
            {
            match("Hypertension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:51:7: ( 'High' )
            // InternalQueryDsl.g:51:9: 'High'
            {
            match("High"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:52:7: ( 'Medium' )
            // InternalQueryDsl.g:52:9: 'Medium'
            {
            match("Medium"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:53:7: ( 'Low' )
            // InternalQueryDsl.g:53:9: 'Low'
            {
            match("Low"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "RULE_DATE"
    public final void mRULE_DATE() throws RecognitionException {
        try {
            int _type = RULE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2436:11: ( RULE_DAY '.' RULE_MONTH '.' RULE_YEAR )
            // InternalQueryDsl.g:2436:13: RULE_DAY '.' RULE_MONTH '.' RULE_YEAR
            {
            mRULE_DAY(); 
            match('.'); 
            mRULE_MONTH(); 
            match('.'); 
            mRULE_YEAR(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DATE"

    // $ANTLR start "RULE_DAY"
    public final void mRULE_DAY() throws RecognitionException {
        try {
            // InternalQueryDsl.g:2438:19: ( ( '1' .. '9' | '1' .. '3' '0' .. '9' ) )
            // InternalQueryDsl.g:2438:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            {
            // InternalQueryDsl.g:2438:21: ( '1' .. '9' | '1' .. '3' '0' .. '9' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>='1' && LA1_0<='3')) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>='0' && LA1_1<='9')) ) {
                    alt1=2;
                }
                else {
                    alt1=1;}
            }
            else if ( ((LA1_0>='4' && LA1_0<='9')) ) {
                alt1=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalQueryDsl.g:2438:22: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2438:31: '1' .. '3' '0' .. '9'
                    {
                    matchRange('1','3'); 
                    matchRange('0','9'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DAY"

    // $ANTLR start "RULE_MONTH"
    public final void mRULE_MONTH() throws RecognitionException {
        try {
            // InternalQueryDsl.g:2440:21: ( ( 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' ) )
            // InternalQueryDsl.g:2440:23: ( 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' )
            {
            // InternalQueryDsl.g:2440:23: ( 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' )
            int alt2=12;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalQueryDsl.g:2440:24: 'Jan'
                    {
                    match("Jan"); 


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2440:30: 'Feb'
                    {
                    match("Feb"); 


                    }
                    break;
                case 3 :
                    // InternalQueryDsl.g:2440:36: 'Mar'
                    {
                    match("Mar"); 


                    }
                    break;
                case 4 :
                    // InternalQueryDsl.g:2440:42: 'Apr'
                    {
                    match("Apr"); 


                    }
                    break;
                case 5 :
                    // InternalQueryDsl.g:2440:48: 'May'
                    {
                    match("May"); 


                    }
                    break;
                case 6 :
                    // InternalQueryDsl.g:2440:54: 'Jun'
                    {
                    match("Jun"); 


                    }
                    break;
                case 7 :
                    // InternalQueryDsl.g:2440:60: 'Jul'
                    {
                    match("Jul"); 


                    }
                    break;
                case 8 :
                    // InternalQueryDsl.g:2440:66: 'Aug'
                    {
                    match("Aug"); 


                    }
                    break;
                case 9 :
                    // InternalQueryDsl.g:2440:72: 'Sep'
                    {
                    match("Sep"); 


                    }
                    break;
                case 10 :
                    // InternalQueryDsl.g:2440:78: 'Oct'
                    {
                    match("Oct"); 


                    }
                    break;
                case 11 :
                    // InternalQueryDsl.g:2440:84: 'Nov'
                    {
                    match("Nov"); 


                    }
                    break;
                case 12 :
                    // InternalQueryDsl.g:2440:90: 'Dec'
                    {
                    match("Dec"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_MONTH"

    // $ANTLR start "RULE_YEAR"
    public final void mRULE_YEAR() throws RecognitionException {
        try {
            // InternalQueryDsl.g:2442:20: ( '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9' )
            // InternalQueryDsl.g:2442:22: '0' .. '2' '0' .. '9' '0' .. '9' '0' .. '9'
            {
            matchRange('0','2'); 
            matchRange('0','9'); 
            matchRange('0','9'); 
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_YEAR"

    // $ANTLR start "RULE_DOUBLE"
    public final void mRULE_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2444:13: ( RULE_INT '.' RULE_INT )
            // InternalQueryDsl.g:2444:15: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE"

    // $ANTLR start "RULE_BOOLEAN"
    public final void mRULE_BOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2446:14: ( ( 'true' | 'false' ) )
            // InternalQueryDsl.g:2446:16: ( 'true' | 'false' )
            {
            // InternalQueryDsl.g:2446:16: ( 'true' | 'false' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='t') ) {
                alt3=1;
            }
            else if ( (LA3_0=='f') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalQueryDsl.g:2446:17: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2446:24: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2448:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalQueryDsl.g:2448:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalQueryDsl.g:2448:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalQueryDsl.g:2448:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalQueryDsl.g:2448:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalQueryDsl.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2450:10: ( ( '0' .. '9' )+ )
            // InternalQueryDsl.g:2450:12: ( '0' .. '9' )+
            {
            // InternalQueryDsl.g:2450:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalQueryDsl.g:2450:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2452:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalQueryDsl.g:2452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalQueryDsl.g:2452:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalQueryDsl.g:2452:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalQueryDsl.g:2452:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalQueryDsl.g:2452:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQueryDsl.g:2452:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalQueryDsl.g:2452:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalQueryDsl.g:2452:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalQueryDsl.g:2452:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalQueryDsl.g:2452:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2454:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalQueryDsl.g:2454:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalQueryDsl.g:2454:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalQueryDsl.g:2454:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2456:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalQueryDsl.g:2456:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalQueryDsl.g:2456:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalQueryDsl.g:2456:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalQueryDsl.g:2456:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalQueryDsl.g:2456:41: ( '\\r' )? '\\n'
                    {
                    // InternalQueryDsl.g:2456:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalQueryDsl.g:2456:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2458:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalQueryDsl.g:2458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalQueryDsl.g:2458:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalQueryDsl.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalQueryDsl.g:2460:16: ( . )
            // InternalQueryDsl.g:2460:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalQueryDsl.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DATE | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=53;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalQueryDsl.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // InternalQueryDsl.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // InternalQueryDsl.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // InternalQueryDsl.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // InternalQueryDsl.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // InternalQueryDsl.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // InternalQueryDsl.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // InternalQueryDsl.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // InternalQueryDsl.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // InternalQueryDsl.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // InternalQueryDsl.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // InternalQueryDsl.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // InternalQueryDsl.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // InternalQueryDsl.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // InternalQueryDsl.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // InternalQueryDsl.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // InternalQueryDsl.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // InternalQueryDsl.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // InternalQueryDsl.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // InternalQueryDsl.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // InternalQueryDsl.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // InternalQueryDsl.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // InternalQueryDsl.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // InternalQueryDsl.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // InternalQueryDsl.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // InternalQueryDsl.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // InternalQueryDsl.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // InternalQueryDsl.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // InternalQueryDsl.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // InternalQueryDsl.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // InternalQueryDsl.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // InternalQueryDsl.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // InternalQueryDsl.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // InternalQueryDsl.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // InternalQueryDsl.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // InternalQueryDsl.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // InternalQueryDsl.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // InternalQueryDsl.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // InternalQueryDsl.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // InternalQueryDsl.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // InternalQueryDsl.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // InternalQueryDsl.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // InternalQueryDsl.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // InternalQueryDsl.g:1:268: RULE_DATE
                {
                mRULE_DATE(); 

                }
                break;
            case 45 :
                // InternalQueryDsl.g:1:278: RULE_DOUBLE
                {
                mRULE_DOUBLE(); 

                }
                break;
            case 46 :
                // InternalQueryDsl.g:1:290: RULE_BOOLEAN
                {
                mRULE_BOOLEAN(); 

                }
                break;
            case 47 :
                // InternalQueryDsl.g:1:303: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 48 :
                // InternalQueryDsl.g:1:311: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 49 :
                // InternalQueryDsl.g:1:320: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 50 :
                // InternalQueryDsl.g:1:332: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 51 :
                // InternalQueryDsl.g:1:348: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 52 :
                // InternalQueryDsl.g:1:364: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 53 :
                // InternalQueryDsl.g:1:372: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA2_eotS =
        "\22\uffff";
    static final String DFA2_eofS =
        "\22\uffff";
    static final String DFA2_minS =
        "\1\101\1\141\1\uffff\1\141\1\160\5\uffff\1\154\1\162\6\uffff";
    static final String DFA2_maxS =
        "\1\123\1\165\1\uffff\1\141\1\165\5\uffff\1\156\1\171\6\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\2\uffff\1\11\1\12\1\13\1\14\1\1\2\uffff\1\4\1\10\1\6\1\7\1\3\1\5";
    static final String DFA2_specialS =
        "\22\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\4\2\uffff\1\10\1\uffff\1\2\3\uffff\1\1\2\uffff\1\3\1\7\1\6\3\uffff\1\5",
            "\1\11\23\uffff\1\12",
            "",
            "\1\13",
            "\1\14\4\uffff\1\15",
            "",
            "",
            "",
            "",
            "",
            "\1\17\1\uffff\1\16",
            "\1\20\6\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "2440:23: ( 'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 'Aug' | 'Sep' | 'Oct' | 'Nov' | 'Dec' )";
        }
    }
    static final String DFA15_eotS =
        "\1\uffff\1\50\1\uffff\3\50\1\uffff\3\50\1\uffff\4\50\1\uffff\14\50\3\117\1\50\1\46\1\uffff\3\46\2\uffff\1\50\2\uffff\5\50\1\uffff\4\50\1\uffff\7\50\1\uffff\21\50\1\117\2\uffff\1\117\1\uffff\1\50\4\uffff\3\50\1\u0083\13\50\1\u008f\17\50\1\u009f\5\50\1\u00a5\1\uffff\2\50\1\u00a8\1\u00a9\1\uffff\5\50\1\u00b0\1\50\1\u00b2\3\50\1\uffff\6\50\1\u00bc\6\50\1\u00c3\1\50\1\uffff\4\50\1\u00c9\1\uffff\2\50\2\uffff\2\50\1\u00ce\3\50\1\uffff\1\50\1\uffff\2\50\1\u00d5\3\50\1\u00d9\2\50\1\uffff\6\50\1\uffff\1\u00e2\4\50\1\uffff\1\u00c3\1\u00e7\1\50\1\u00e9\1\uffff\2\50\1\u00ec\1\50\1\u00ee\1\50\1\uffff\3\50\1\uffff\10\50\1\uffff\2\50\1\u00fe\1\50\1\uffff\1\50\1\uffff\2\50\3\uffff\14\50\1\u010f\1\u0110\1\50\1\uffff\4\50\1\u0116\1\u0117\3\50\1\u011b\1\50\1\u011d\3\50\1\u0121\2\uffff\5\50\2\uffff\1\50\1\u0128\1\50\1\uffff\1\50\1\uffff\3\50\1\uffff\6\50\1\uffff\5\50\1\u0139\6\50\1\u0140\3\50\1\uffff\3\50\1\u0147\2\50\1\uffff\2\50\1\u014c\1\u014d\1\u014e\1\50\1\uffff\4\50\3\uffff\1\50\1\u0155\1\u0156\1\50\1\u0158\1\50\2\uffff\1\50\1\uffff\1\50\1\u015c\1\u015d\2\uffff";
    static final String DFA15_eofS =
        "\u015e\uffff";
    static final String DFA15_minS =
        "\1\0\1\105\1\uffff\1\122\1\145\1\110\1\uffff\1\141\1\116\1\141\1\uffff\1\105\1\101\1\156\1\145\1\uffff\2\141\1\145\1\141\1\162\1\164\1\156\2\162\1\163\1\151\1\157\3\56\1\141\1\101\1\uffff\2\0\1\52\2\uffff\1\114\2\uffff\1\157\1\117\1\165\1\144\1\105\1\uffff\1\164\1\145\1\123\1\154\1\uffff\1\117\1\114\1\141\1\102\1\144\1\143\1\163\1\uffff\1\164\1\145\1\143\1\164\1\163\1\144\1\156\1\164\1\145\1\141\2\144\1\157\1\164\1\160\1\147\1\167\1\56\1\uffff\1\60\1\56\1\uffff\1\154\4\uffff\1\105\1\155\1\115\1\60\1\151\1\122\1\151\1\163\1\105\1\117\1\165\1\120\1\105\1\142\1\114\1\60\1\157\1\153\1\151\1\143\1\163\1\164\1\145\1\143\3\151\1\145\1\141\1\145\1\162\1\60\1\145\1\156\1\150\1\145\1\150\1\60\1\uffff\1\163\1\103\2\60\1\uffff\1\143\1\105\1\145\1\143\1\122\1\60\1\145\1\60\1\124\1\145\1\105\1\uffff\1\162\1\120\2\145\1\143\1\157\1\60\1\162\2\143\1\164\1\147\1\164\1\60\1\164\1\uffff\1\162\1\143\1\155\1\162\1\60\1\uffff\1\145\1\124\2\uffff\1\141\1\155\1\60\1\156\1\162\1\124\1\uffff\1\163\1\uffff\1\105\1\164\1\60\1\144\1\145\1\156\1\60\2\162\1\uffff\1\151\1\145\1\141\2\157\1\145\1\uffff\1\60\1\145\1\150\1\141\1\164\1\uffff\2\60\1\154\1\60\1\uffff\1\164\1\151\1\60\1\50\1\60\1\145\1\uffff\1\111\1\162\1\164\1\uffff\1\151\1\111\1\160\1\111\1\154\2\162\1\144\1\uffff\1\144\1\151\1\60\1\145\1\uffff\1\122\1\uffff\1\115\1\160\3\uffff\1\163\1\144\1\143\1\111\1\160\1\144\1\164\1\144\1\103\2\151\1\171\2\60\1\164\1\uffff\1\156\1\145\1\157\1\164\2\60\1\145\1\144\1\164\1\60\1\151\1\60\2\157\1\156\1\60\2\uffff\1\151\1\163\1\143\1\156\1\151\2\uffff\1\160\1\60\1\151\1\uffff\1\157\1\uffff\2\156\1\147\1\uffff\1\163\1\151\1\157\1\151\1\157\1\164\1\uffff\1\157\1\156\1\144\1\116\1\111\1\60\1\157\1\162\1\164\1\156\1\151\1\156\1\60\1\151\1\141\1\144\1\uffff\1\156\1\144\1\157\1\60\1\157\1\111\1\uffff\1\164\1\155\3\60\1\162\1\uffff\1\156\1\144\1\151\1\145\3\uffff\1\151\2\60\1\157\1\60\1\156\2\uffff\1\156\1\uffff\1\147\2\60\2\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\105\1\uffff\1\162\1\145\1\110\1\uffff\1\162\1\116\1\141\1\uffff\1\151\1\101\1\156\1\151\1\uffff\1\162\2\157\1\141\1\162\1\164\1\156\2\162\1\163\1\171\1\157\3\71\1\141\1\172\1\uffff\2\uffff\1\57\2\uffff\1\114\2\uffff\1\157\1\117\1\165\1\144\1\105\1\uffff\1\164\1\145\1\124\1\154\1\uffff\1\117\1\114\1\141\1\102\1\144\1\143\1\163\1\uffff\1\164\1\151\1\143\1\164\1\166\1\144\1\156\1\164\1\165\1\141\2\144\1\157\1\164\1\160\1\147\1\167\1\71\1\uffff\1\123\1\71\1\uffff\1\154\4\uffff\1\105\1\155\1\115\1\172\1\151\1\122\1\151\1\163\1\105\1\117\1\165\1\120\1\105\1\142\1\114\1\172\1\157\1\153\1\151\1\143\1\163\1\164\1\145\1\143\3\151\1\145\1\141\1\145\1\162\1\172\1\145\1\156\1\150\1\145\1\150\1\172\1\uffff\1\163\1\103\2\172\1\uffff\1\165\1\105\1\145\1\143\1\122\1\172\1\145\1\172\1\124\1\145\1\105\1\uffff\1\162\1\120\2\145\1\143\1\157\1\172\1\162\2\143\1\164\1\147\1\164\1\172\1\164\1\uffff\1\162\1\143\1\155\1\162\1\172\1\uffff\1\145\1\124\2\uffff\1\141\1\155\1\172\1\156\1\162\1\124\1\uffff\1\163\1\uffff\1\105\1\164\1\172\1\144\1\145\1\156\1\172\2\162\1\uffff\1\151\1\145\1\141\2\157\1\145\1\uffff\1\172\1\145\1\150\1\141\1\164\1\uffff\2\172\1\154\1\172\1\uffff\1\164\1\151\1\172\1\50\1\172\1\145\1\uffff\1\111\1\162\1\164\1\uffff\1\151\1\111\1\160\1\111\1\164\2\162\1\144\1\uffff\1\144\1\151\1\172\1\145\1\uffff\1\122\1\uffff\1\115\1\160\3\uffff\1\163\1\144\1\143\1\111\1\160\1\144\1\164\1\144\1\103\2\151\1\171\2\172\1\164\1\uffff\1\156\1\145\1\157\1\164\2\172\1\145\1\144\1\164\1\172\1\151\1\172\2\157\1\156\1\172\2\uffff\1\151\1\163\1\143\1\156\1\151\2\uffff\1\160\1\172\1\151\1\uffff\1\157\1\uffff\2\156\1\147\1\uffff\1\163\1\151\1\157\1\151\1\157\1\164\1\uffff\1\157\1\156\1\144\1\116\1\111\1\172\1\157\1\162\1\164\1\156\1\151\1\156\1\172\1\151\1\141\1\144\1\uffff\1\156\1\144\1\157\1\172\1\157\1\111\1\uffff\1\164\1\155\3\172\1\162\1\uffff\1\156\1\144\1\151\1\145\3\uffff\1\151\2\172\1\157\1\172\1\156\2\uffff\1\156\1\uffff\1\147\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\3\uffff\1\6\3\uffff\1\14\4\uffff\1\23\21\uffff\1\57\3\uffff\1\64\1\65\1\uffff\1\57\1\2\5\uffff\1\6\4\uffff\1\14\7\uffff\1\23\22\uffff\1\60\2\uffff\1\55\1\uffff\1\61\1\62\1\63\1\64\46\uffff\1\54\4\uffff\1\47\13\uffff\1\21\17\uffff\1\42\5\uffff\1\53\2\uffff\1\3\1\20\6\uffff\1\12\1\uffff\1\15\11\uffff\1\27\6\uffff\1\56\5\uffff\1\51\4\uffff\1\5\6\uffff\1\16\3\uffff\1\30\10\uffff\1\41\4\uffff\1\1\1\uffff\1\52\2\uffff\1\11\1\13\1\17\17\uffff\1\45\20\uffff\1\35\1\43\5\uffff\1\46\1\22\3\uffff\1\25\1\uffff\1\36\3\uffff\1\33\6\uffff\1\24\20\uffff\1\44\6\uffff\1\31\6\uffff\1\10\4\uffff\1\32\1\50\1\4\6\uffff\1\34\1\37\1\uffff\1\40\3\uffff\1\26\1\7";
    static final String DFA15_specialS =
        "\1\1\41\uffff\1\0\1\2\u013a\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\46\2\45\2\46\1\45\22\46\1\45\1\46\1\42\4\46\1\43\1\46\1\12\2\46\1\2\2\46\1\44\1\36\3\34\6\35\1\46\1\6\1\46\1\17\3\46\1\31\1\30\1\41\1\13\1\41\1\3\1\41\1\32\1\10\2\41\1\33\1\4\2\41\1\7\2\41\1\1\1\14\1\41\1\11\1\5\3\41\3\46\1\40\1\41\1\46\1\15\1\41\1\23\1\21\1\26\1\37\6\41\1\22\1\41\1\27\1\20\1\41\1\16\1\25\1\24\6\41\uff85\46",
            "\1\47",
            "",
            "\1\53\31\uffff\1\54\5\uffff\1\52",
            "\1\55",
            "\1\56",
            "",
            "\1\60\20\uffff\1\61",
            "\1\62",
            "\1\63",
            "",
            "\1\66\14\uffff\1\65\26\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72\3\uffff\1\73",
            "",
            "\1\75\20\uffff\1\76",
            "\1\100\3\uffff\1\101\11\uffff\1\77",
            "\1\102\11\uffff\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\114\17\uffff\1\113",
            "\1\115",
            "\1\120\1\uffff\12\116",
            "\1\120\1\uffff\12\121",
            "\1\122\1\uffff\12\121",
            "\1\123",
            "\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\0\124",
            "\0\124",
            "\1\125\4\uffff\1\126",
            "",
            "",
            "\1\130",
            "",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "\1\136",
            "\1\137",
            "\1\140\1\141",
            "\1\142",
            "",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "",
            "\1\152",
            "\1\154\3\uffff\1\153",
            "\1\155",
            "\1\156",
            "\1\157\2\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164\17\uffff\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\120\1\uffff\12\121",
            "",
            "\12\122\7\uffff\1\176\2\uffff\1\176\1\uffff\1\176\3\uffff\1\176\2\uffff\3\176\3\uffff\1\176",
            "\1\122\1\uffff\12\121",
            "",
            "\1\177",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00a6",
            "\1\u00a7",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00aa\21\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b1",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00c4",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "",
            "",
            "\1\u00cc",
            "\1\u00cd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00e8",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u00ea",
            "\1\u00eb",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ed",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7\7\uffff\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "",
            "\1\u00fc",
            "\1\u00fd",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ff",
            "",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "",
            "",
            "",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0111",
            "",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u011c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "",
            "",
            "\1\u0127",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0129",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0148",
            "\1\u0149",
            "",
            "\1\u014a",
            "\1\u014b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u014f",
            "",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "",
            "",
            "",
            "\1\u0154",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0157",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0159",
            "",
            "",
            "\1\u015a",
            "",
            "\1\u015b",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | RULE_DATE | RULE_DOUBLE | RULE_BOOLEAN | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_34 = input.LA(1);

                        s = -1;
                        if ( ((LA15_34>='\u0000' && LA15_34<='\uFFFF')) ) {s = 84;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='S') ) {s = 1;}

                        else if ( (LA15_0==',') ) {s = 2;}

                        else if ( (LA15_0=='F') ) {s = 3;}

                        else if ( (LA15_0=='M') ) {s = 4;}

                        else if ( (LA15_0=='W') ) {s = 5;}

                        else if ( (LA15_0==';') ) {s = 6;}

                        else if ( (LA15_0=='P') ) {s = 7;}

                        else if ( (LA15_0=='I') ) {s = 8;}

                        else if ( (LA15_0=='V') ) {s = 9;}

                        else if ( (LA15_0==')') ) {s = 10;}

                        else if ( (LA15_0=='D') ) {s = 11;}

                        else if ( (LA15_0=='T') ) {s = 12;}

                        else if ( (LA15_0=='a') ) {s = 13;}

                        else if ( (LA15_0=='r') ) {s = 14;}

                        else if ( (LA15_0=='=') ) {s = 15;}

                        else if ( (LA15_0=='p') ) {s = 16;}

                        else if ( (LA15_0=='d') ) {s = 17;}

                        else if ( (LA15_0=='m') ) {s = 18;}

                        else if ( (LA15_0=='c') ) {s = 19;}

                        else if ( (LA15_0=='t') ) {s = 20;}

                        else if ( (LA15_0=='s') ) {s = 21;}

                        else if ( (LA15_0=='e') ) {s = 22;}

                        else if ( (LA15_0=='o') ) {s = 23;}

                        else if ( (LA15_0=='B') ) {s = 24;}

                        else if ( (LA15_0=='A') ) {s = 25;}

                        else if ( (LA15_0=='H') ) {s = 26;}

                        else if ( (LA15_0=='L') ) {s = 27;}

                        else if ( ((LA15_0>='1' && LA15_0<='3')) ) {s = 28;}

                        else if ( ((LA15_0>='4' && LA15_0<='9')) ) {s = 29;}

                        else if ( (LA15_0=='0') ) {s = 30;}

                        else if ( (LA15_0=='f') ) {s = 31;}

                        else if ( (LA15_0=='^') ) {s = 32;}

                        else if ( (LA15_0=='C'||LA15_0=='E'||LA15_0=='G'||(LA15_0>='J' && LA15_0<='K')||(LA15_0>='N' && LA15_0<='O')||(LA15_0>='Q' && LA15_0<='R')||LA15_0=='U'||(LA15_0>='X' && LA15_0<='Z')||LA15_0=='_'||LA15_0=='b'||(LA15_0>='g' && LA15_0<='l')||LA15_0=='n'||LA15_0=='q'||(LA15_0>='u' && LA15_0<='z')) ) {s = 33;}

                        else if ( (LA15_0=='\"') ) {s = 34;}

                        else if ( (LA15_0=='\'') ) {s = 35;}

                        else if ( (LA15_0=='/') ) {s = 36;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 37;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||LA15_0=='!'||(LA15_0>='#' && LA15_0<='&')||LA15_0=='('||(LA15_0>='*' && LA15_0<='+')||(LA15_0>='-' && LA15_0<='.')||LA15_0==':'||LA15_0=='<'||(LA15_0>='>' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||(LA15_0>='{' && LA15_0<='\uFFFF')) ) {s = 38;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_35 = input.LA(1);

                        s = -1;
                        if ( ((LA15_35>='\u0000' && LA15_35<='\uFFFF')) ) {s = 84;}

                        else s = 38;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}