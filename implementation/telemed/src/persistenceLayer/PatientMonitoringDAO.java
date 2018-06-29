package persistenceLayer;

import java.util.ArrayList;

import telemed.PatientMonitoring;
import telemed.User;

/**
* Methods to read and write PatientMonitoring objects from/to a file.
*/
public interface PatientMonitoringDAO {

	/**
	 * get a list of all PatientMonitoring items  
	 * @return ArrayList list of all PatientMonitoring items
	 */
	public ArrayList<PatientMonitoring> getPatientMonitoringList(); 
	
	
	/**
	 * add a new PatientMonitoring item 
	 * @param pm  
	 */
	public void addPatientMonitoring(PatientMonitoring pm);  
	
	
	/**
	 * deletes the indicated PatientMonitoring
	 * @param pm  
	 */
	public void deletePatientMonitoring(PatientMonitoring pm);
	
	
	/** 
	 * updates the indicated PatientMonitoring
	 * @param pm
	 */
	public void updatePatientMonitoring(PatientMonitoring pm);
	
}
