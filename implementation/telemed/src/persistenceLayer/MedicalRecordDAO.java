package persistenceLayer;

import java.util.ArrayList;

import telemed.MedicalRecord;
import telemed.Prescription;
import telemed.User;

/**
* Methods to read and write MedicalRecord and Prescription objects from/to a file.
*/
public interface MedicalRecordDAO {

	/**
	 * get a list of all Medical Records  
	 * @return ArrayList list of all Medical Records
	 */
	public ArrayList<MedicalRecord> getMedicalRecordList(); 
	
	
	/**
	 * add a new Medical Record 
	 * @param mr  
	 */
	public void addMedicalRecord(MedicalRecord mr);  
	
	
	/**
	 * deletes the indicated Medical Record
	 * @param mr  
	 */
	public void deleteMedicalRecord(MedicalRecord mr);
	
	
	/**
	 * updates the indicated Medical Record
	 * @param mr
	 */
	public void updateMedicalRecord(MedicalRecord mr);

	
	/**
	 * get prescription from a Medical Record
	 * @param medicalRecordId
	 * @return Prescription
	 */
	public Prescription getPrescription(int medicalRecordId);
	
	/**
	 * get a list of all Prescriptions  
	 * @return ArrayList list of all Prescriptions
	 */
	public ArrayList<Prescription> getPrescriptionList();
	
	/**
	 * add a new Prescription
	 * @param pres  
	 */
	public void addPrescription(Prescription pres);
	
	/**
	 * delete a Prescription
	 * @param pres  
	 */
	public void deletePrescription(Prescription pres);
	
	/**
	 * update a Prescription
	 * @param pres  
	 */
	public void updatePrescription(Prescription pres);
	
}
