package domainLogic;

import java.util.ArrayList;
import java.util.Calendar;

import persistenceLayer.PatientMonitoringDAO;
import persistenceLayer.SerializedPatientMonitoringDAO;
import telemed.MedicalCondition;
import telemed.PatientMonitoring;
import telemed.RiskPerception;
import telemed.TelemedFactory;

/**
* The class provides the operations to manage the PatientMonitoring items: add, delete, change, get list of PatientMonitoring items. 
*/
public class PatientMonitoringMgmt {

	/**
	 * Instance variables 
	 */	
	private PatientMonitoringDAO pmdao;
	private TelemedFactory factory;
	
	/**
	 * Constructor
	 */	
	public PatientMonitoringMgmt(){
		factory = TelemedFactory.eINSTANCE;
		this.pmdao = new SerializedPatientMonitoringDAO();
	}
	
	/**
	 * get pmdao
	 * @return PatientMonitoringDAO
	 */
	public PatientMonitoringDAO getPatientMonitoringDAO() {
		return pmdao;
	}


	/**
	 * get pmlist
	 * @return ArrayList
	 */
	public ArrayList<PatientMonitoring> getAllPatientMonitoring(){
		
		ArrayList<PatientMonitoring> pmlist = new ArrayList<PatientMonitoring>();
		pmlist = pmdao.getPatientMonitoringList();	
		
		return pmlist;
	}
	
	
	/** 
	 * add PatientMonitoring
	 * @param monitoringId
	 * @param patientId
	 * @param category
	 * 			category of illness or symptom 	
	 * @param date
	 * @param riskPerception
	 * @param treated
	 * @param deviceId
	 */
	public void addPatientMonitoring(int patientId, MedicalCondition category, Calendar date, 
			RiskPerception riskPerception, boolean treated, int deviceId) {
		PatientMonitoring patientMonitoring = factory.createPatientMonitoring();
		patientMonitoring.setMonitoringId(getAllPatientMonitoring().size()+1);
		patientMonitoring.setPatientId(patientId);
		patientMonitoring.setCategory(category);
		patientMonitoring.setDate(date);
		patientMonitoring.setRiskPerception(riskPerception);
		patientMonitoring.setTreated(treated);
		patientMonitoring.setDeviceId(deviceId);
		pmdao.addPatientMonitoring(patientMonitoring);
		
	}
	
	
	/**
	 * mark PatientMonitoring as "treated" (set the boolean "treated"=True)
	 * @param pm
	 */
	public void markPatientMonitoringAsTreated(PatientMonitoring pm) {
		pm.setTreated(true);
		pmdao.updatePatientMonitoring(pm);
		
	}
	
	
	
}
