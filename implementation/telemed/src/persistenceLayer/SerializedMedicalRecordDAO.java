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

import telemed.MedicalRecord;
import telemed.Prescription;

/**
* Methods to read and write MedicalRecord objects from/to a file.
* Implements the interfaces Serializable and MedicalRecordDAO
*/
public class SerializedMedicalRecordDAO implements MedicalRecordDAO, Serializable {

	
	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private String filepathMedicalRecord;
	private String filepathPrescription;
	private ArrayList<MedicalRecord> medicalrecordlist;
	private ArrayList<Prescription> prescriptionlist;
	
	/**
	 * constructor
	 * @param filepath
	 */	
	public SerializedMedicalRecordDAO() {
		this.filepathMedicalRecord = "medicalrecord.ser"; 
		this.filepathPrescription = "prescription.ser";
		medicalrecordlist=new ArrayList<MedicalRecord>();
		prescriptionlist = new ArrayList<Prescription>();
	}
	

	/**
	 * get a list of all Medical Records  
	 * @return ArrayList list of all Medical Records
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<MedicalRecord> getMedicalRecordList() {

		File datei = new File(filepathMedicalRecord);

		if(datei.exists()&& datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepathMedicalRecord);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				medicalrecordlist = (ArrayList<MedicalRecord>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return medicalrecordlist;
	}

	
	/**
	 * add a new Medical Record 
	 * @param mr  
	 */
	@Override
	public void addMedicalRecord(MedicalRecord mr) {

		ArrayList<MedicalRecord> neueliste = new ArrayList<MedicalRecord>();
		neueliste.addAll(getMedicalRecordList());
		neueliste.add(mr);	
			
		try {
			FileOutputStream fileoutput = new FileOutputStream(filepathMedicalRecord);
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
	 * deletes the indicated Medical Record
	 * @param mr  
	 */
	@Override
	public void deleteMedicalRecord(MedicalRecord mr) {
		if(mr==null) {
			throw new IllegalArgumentException ("medical record is null, cannot be deleted!");
		}
		
		boolean checkMedicalRecordToDeleteExists = false;
		for(int i=0; i<getMedicalRecordList().size();i++){
			if ( (getMedicalRecordList().get(i).getRecordId() == (mr.getRecordId()))){
				checkMedicalRecordToDeleteExists=true;
			}
		}
		
		if (checkMedicalRecordToDeleteExists) {
			ArrayList<MedicalRecord> neueliste = new ArrayList<MedicalRecord>();
			neueliste.addAll(this.getMedicalRecordList());
			
			for(int i=0; i<neueliste.size();i++) {
				if(neueliste.get(i).getRecordId() == (mr.getRecordId())) {
					neueliste.remove(neueliste.get(i));	 
				}
			}
			
			try {
				FileOutputStream fileoutput = new FileOutputStream(filepathMedicalRecord);
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
			throw new IllegalArgumentException ("medical record does not exist, cannot be deleted!");
		}				
	}

	
	/**
	 * updates the indicated Medical Record
	 * @param mr
	 */
	@Override
	public void updateMedicalRecord(MedicalRecord mr) {
		
		deleteMedicalRecord(mr);
		addMedicalRecord(mr);
		
	}

	
	/**
	 * get prescription from a Medical Record
	 * @param medicalRecordId
	 * @return Prescription
	 */
	@Override
	public Prescription getPrescription(int medicalRecordId) {
		
		return null;
	}
	
	
	/**
	 * get a list of all Prescription
	 * @return ArrayList list of all Prescription
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Prescription> getPrescriptionList() {

		File datei = new File(filepathPrescription);

		if(datei.exists()&& datei.canRead()) {
			try {
			FileInputStream fileinput = new FileInputStream(filepathPrescription);
			ObjectInputStream objectinput = new ObjectInputStream(fileinput);
			
			if(objectinput!=null) {
				prescriptionlist = (ArrayList<Prescription>) objectinput.readObject(); 
				objectinput.close();
				fileinput.close();  
			}
			
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		return prescriptionlist;
	}

	
	/**
	 * add a new Prescription 
	 * @param pres  
	 */
	@Override
	public void addPrescription(Prescription pres) {

		ArrayList<Prescription> neueliste = new ArrayList<Prescription>();
		neueliste.addAll(getPrescriptionList());
		neueliste.add(pres);	
			
		try {
			FileOutputStream fileoutput = new FileOutputStream(filepathPrescription);
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
	 * deletes the indicated Prescription
	 * @param pres  
	 */
	@Override
	public void deletePrescription(Prescription pres) {
		if(pres==null) {
			throw new IllegalArgumentException ("medical record is null, cannot be deleted!");
		}
		
		boolean checkPrescriptionToDeleteExists = false;
		for(int i=0; i<getPrescriptionList().size();i++){
			if ( (getPrescriptionList().get(i).getRecordId() == (pres.getRecordId()))){
				checkPrescriptionToDeleteExists=true;
			}
		}
		
		if (checkPrescriptionToDeleteExists) {
			ArrayList<Prescription> neueliste = new ArrayList<Prescription>();
			neueliste.addAll(this.getPrescriptionList());
			
			for(int i=0; i<neueliste.size();i++) {
				if(neueliste.get(i).getRecordId() == (pres.getRecordId())) {
					neueliste.remove(neueliste.get(i));	 
				}
			}
			
			try {
				FileOutputStream fileoutput = new FileOutputStream(filepathPrescription);
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
			throw new IllegalArgumentException ("medical record does not exist, cannot be deleted!");
		}				
	}

	
	/**
	 * updates the indicated Prescription
	 * @param pres
	 */
	@Override
	public void updatePrescription(Prescription pres) {
		
		deletePrescription(pres);
		addPrescription(pres);
		
	}

}
