package persistenceLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import telemed.PatientMonitoring;
import telemed.User;

/**
* Methods to read and write PatientMonitoring objects from/to a file.
* Implements the interfaces Serializable and PatientMonitoringDAO
*/
public class SerializedPatientMonitoringDAO implements PatientMonitoringDAO, Serializable {

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private String filepath;
	private ArrayList<PatientMonitoring> patientmonitoringlist; 
	
	/**
	 * constructor
	 * @param filepath
	 */	
	public SerializedPatientMonitoringDAO() {
		this.filepath="patientmonitoring.ser"; 
		patientmonitoringlist=new ArrayList<PatientMonitoring>();
	}
	
	
	// implement methods from interface PatientMonitoringDAO
	/**
	 * get patientmonitoringlist
	 * @return ArrayList
	 */
    @SuppressWarnings("unchecked")
	@Override
	public ArrayList<PatientMonitoring> getPatientMonitoringList() {

		File datei = new File(filepath);

		if(datei.exists()&& datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepath);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				patientmonitoringlist = (ArrayList<PatientMonitoring>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return patientmonitoringlist;
    	
	}

    
	/**
	 * add a new PatientMonitoring
	 * @param pm (PatientMonitoring)
	 */
	@Override
	public void addPatientMonitoring(PatientMonitoring pm) {
		if(pm==null) {
			// throw new IllegalArgumentException ("PatientMonitoring is null, cannot be added!");
			// to be checked in GUI
		}

			ArrayList<PatientMonitoring> neueliste = new ArrayList<PatientMonitoring>();
			neueliste.addAll(getPatientMonitoringList());
			neueliste.add(pm);	
			
			try {
				FileOutputStream fileoutput = new FileOutputStream(filepath);
				ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
				objectoutput.writeObject(neueliste);
				objectoutput.close();
				fileoutput.close();  
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			} 				
	}

	
	/**
	 * delete a PatientMonitoring
	 * @param pm (PatientMonitoring)
	 */
	@Override
	public void deletePatientMonitoring(PatientMonitoring pm) {
		if(pm==null) {
			throw new IllegalArgumentException ("pm is null, cannot be deleted!");
		}
		
		boolean checkPatientMonitoringToDeleteExists = false;
		for(int i=0; i<getPatientMonitoringList().size();i++){
			if ( (getPatientMonitoringList().get(i).getMonitoringId() == (pm.getMonitoringId())) ){
				checkPatientMonitoringToDeleteExists=true;
			}
		}
		
		if (checkPatientMonitoringToDeleteExists) {
			ArrayList<PatientMonitoring> neueliste = new ArrayList<PatientMonitoring>();
			neueliste.addAll(this.getPatientMonitoringList());
			
			for(int i=0; i<neueliste.size();i++) {
				if(neueliste.get(i).getMonitoringId() == (pm.getMonitoringId())) {
					neueliste.remove(neueliste.get(i));	 
				}
			}
			
			try {
				FileOutputStream fileoutput = new FileOutputStream(filepath);
				ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
				objectoutput.writeObject(neueliste);
				objectoutput.close();
				fileoutput.close();  
			} catch (FileNotFoundException e) {
					e.printStackTrace();
			} catch (IOException e) {
					e.printStackTrace();
			} 
		}
		else {
			throw new IllegalArgumentException ("pm does not exist, cannot be deleted!");
		}				
	}

	@Override
	public void updatePatientMonitoring(PatientMonitoring pm) {
		deletePatientMonitoring(pm);
		addPatientMonitoring(pm);		
	}

	
}
