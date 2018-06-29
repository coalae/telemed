package domainLogic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import persistenceLayer.InvoiceDAO;
import persistenceLayer.MedicalRecordDAO;
import persistenceLayer.SerializedInvoiceDAO;
import persistenceLayer.SerializedMedicalRecordDAO;
import persistenceLayer.SerializedUserDAO;
import persistenceLayer.UserDAO;
import telemed.AnonymizedDataQuery;
import telemed.Gender;
import telemed.Invoice;
import telemed.MedicalCondition;
import telemed.MedicalRecord;
import telemed.Patient;
import telemed.Prescription;
import telemed.TelemedFactory;
import telemed.User;


/**
* The class provides the operations to manage the MedicalRecords (incl. Prescriptions): add, delete, change, get list of Medical Records. 
*/
public class MedicalRecordMgmt {

	/**
	 * Instance variables 
	 */	
	private MedicalRecordDAO mrdao;
	private InvoiceDAO invoiceDAO;
	private UserDAO userdao;
	private TelemedFactory factory;
	
	/**
	 * Constructor
	 */	
	public MedicalRecordMgmt(){
		this.mrdao = new SerializedMedicalRecordDAO();
		this.invoiceDAO = new SerializedInvoiceDAO();
		this.userdao = new SerializedUserDAO();
		factory = TelemedFactory.eINSTANCE;
	}
	
	/**
	 * get mrdao
	 * @return UserDAO
	 */
	public MedicalRecordDAO getMedicalRecordDAO() {
		return mrdao;
	}
	
	
	
	/**
	 * get anonymized medical data BY YEAR OF BIRTH (for NHO purposes)
	 * @param birthYear
	 * @return ArrayList
	 */
	public ArrayList<AnonymizedDataQuery> getAnonymizedMedicalDataByYearOfBirth(int birthYear) {
		ArrayList<MedicalRecord> medList = mrdao.getMedicalRecordList();
		ArrayList<AnonymizedDataQuery> anonymizedList = new ArrayList<AnonymizedDataQuery>();
		TelemedFactory factory = TelemedFactory.eINSTANCE;
		for (User user : userdao.getUserList()) {
			if (user instanceof Patient) {
				for (MedicalRecord mr : medList) {
					if (mr.getPatientId() == user.getId() && ((Patient)user).getBirthdate().get(Calendar.YEAR) == birthYear) {
						AnonymizedDataQuery anonymizedData = factory.createAnonymizedDataQuery();
						anonymizedData.setBirthYear(((Patient)user).getBirthdate().get(Calendar.YEAR));
						anonymizedData.setCity(user.getCity());
						anonymizedData.setGender(((Patient) user).getGender());
						anonymizedData.setHeight(((Patient) user).getHeight());
						anonymizedData.setWeight(((Patient) user).getWeight());
						anonymizedData.setMedicalCondition(mr.getMedicalCondition());
						anonymizedList.add(anonymizedData);
					}
				}
				
			}
		}
		return anonymizedList;
	}
	
	/**
	 * get anonymized medical data BY GENDER (for NHO purposes)
	 * @param gender
	 * @return ArrayList
	 */
	public ArrayList<AnonymizedDataQuery> getAnonymizedMedicalDataByGender(Gender gender) {
		ArrayList<MedicalRecord> medList = mrdao.getMedicalRecordList();
		ArrayList<AnonymizedDataQuery> anonymizedList = new ArrayList<AnonymizedDataQuery>();
		TelemedFactory factory = TelemedFactory.eINSTANCE;
		for (User user : userdao.getUserList()) {
			if (user instanceof Patient) {
				for (MedicalRecord mr : medList) {
					if (mr.getPatientId() == user.getId() && ((Patient)user).getGender() == gender) {
						AnonymizedDataQuery anonymizedData = factory.createAnonymizedDataQuery();
						anonymizedData.setBirthYear(((Patient)user).getBirthdate().get(Calendar.YEAR));
						anonymizedData.setCity(user.getCity());
						anonymizedData.setGender(((Patient) user).getGender());
						anonymizedData.setHeight(((Patient) user).getHeight());
						anonymizedData.setWeight(((Patient) user).getWeight());
						anonymizedData.setMedicalCondition(mr.getMedicalCondition());
						anonymizedList.add(anonymizedData);
					}
				}
				
			}
		}
		return anonymizedList;
	}
	
	
	/**
	 * get medical record list
	 * @return ArrayList
	 */
	public ArrayList<MedicalRecord> getAllMedicalRecords(){
		
		ArrayList<MedicalRecord> records = new ArrayList<MedicalRecord>();
		records = mrdao.getMedicalRecordList();	
		
		return records;
	}
	
	/**
	 * get Prescription list
	 * @return ArrayList
	 */
	public ArrayList<Prescription> getAllPrescription(){
		
		ArrayList<Prescription> records = new ArrayList<Prescription>();
		records = mrdao.getPrescriptionList();	
		
		return records;
	}
	
	
	/**
	 * update medical record
	 * @param mr
	 */
	public void modifyMedicalRecord(MedicalRecord mr) {
		
		mrdao.updateMedicalRecord(mr);
		
	}
	
	
	/**
	 * get medical record by patientId
	 * @param patientId
	 * @return List
	 */
	public List<MedicalRecord> getMedicalRecordByPatientId(int patientId) {
		ArrayList<MedicalRecord> medicalRecordList = mrdao.getMedicalRecordList();
		return medicalRecordList.stream().filter(mr -> mr.getPatientId() == patientId).collect(Collectors.toList());
	}
	
	/**
	 * get medical record by recordId
	 * @param patientId
	 * @return MedicalRecord
	 */
	public MedicalRecord getMedicalRecordByRecordId(int recordId) {
		List<MedicalRecord> medicalRecordList = mrdao.getMedicalRecordList();
		return medicalRecordList.stream().filter(mr -> mr.getRecordId() == recordId).findAny().orElse(null);
	}
	
	/**
	 * get medical record by doctorId
	 * @param doctorId
	 * @return List
	 */
	public List<MedicalRecord> getMedicalRecordByDoctorId(int doctorId) {
		ArrayList<MedicalRecord> medicalRecordList = mrdao.getMedicalRecordList();
		return medicalRecordList.stream().filter(mr -> mr.getDoctorId() == doctorId).collect(Collectors.toList());
	}
	
	
	/** 
	 * add medical record
	 * @param recordId
	 * @param patientId
	 * @param doctorId
	 * @param medicalCondition
	 * @param price
	 * @param date
	 * @param description
	 */
	public void addMedicalRecord(int recordId, int patientId, int doctorId, MedicalCondition medicalCondition, double price, 
			Calendar date, String description) {

		MedicalRecord medicalRecord = factory.createMedicalRecord();
		medicalRecord.setRecordId(recordId);
		medicalRecord.setPatientId(patientId);
		medicalRecord.setDoctorId(doctorId);
		medicalRecord.setMedicalCondition(medicalCondition);
		medicalRecord.setDate(date);
		medicalRecord.setPrice(price);
		medicalRecord.setDescription(description);
		mrdao.addMedicalRecord(medicalRecord);
		
		// upon completion of a medical record, the invoice for this record is prepared for the patient to pay
		Invoice invoice = factory.createInvoice();
		invoice.setCreditorId(doctorId);
		Calendar dueDate = new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH)+15);
		invoice.setDueDate(dueDate);
		invoice.setInvoiceDate(date);
		invoice.setInvoiceID(invoiceDAO.getInvoiceList().size()+1);
		invoice.setPaid(false);
		invoice.setPaidDate(null);
		invoice.setPatientId(patientId);
		invoice.setPrice(price);
		invoice.setTopic(medicalCondition.getName()); 
		invoiceDAO.addInvoice(invoice);
	}
	
	
	/** 
	 * add prescription to medical record
	 * @param mr
	 * @param prescriptionId
	 * @param medicationName
	 * @param start
	 * @param end
	 * @param price
	 * @param ordered
	 */
	public void addPrescriptionToMedicalRecord(int medicalRecordID, int prescriptionId, String medicationName, Calendar start, Calendar end, 
			double price, boolean ordered) {
		
		Prescription prescription = factory.createPrescription();
		prescription.setRecordId(medicalRecordID);
		prescription.setPrescriptionId(prescriptionId);
		prescription.setMedicationName(medicationName);
		prescription.setStart(start);
		prescription.setEnd(end);
		prescription.setPrice(price);
		prescription.setOrdered(ordered);
		mrdao.addPrescription(prescription);		
	}
	
	
	/**
	 * order prescription 
	 * @param pr
	 */
	public void orderPrescription(Prescription pr) {	
		pr.setOrdered(true);
		mrdao.updatePrescription(pr);
	}
	
	/**
	 * generates the id for a new medical record
	 * @return int 
	 */
	public int generateNewMedicalRecordId() {
		ArrayList<MedicalRecord> list = getAllMedicalRecords();
		if (list.size() == 0)
			return 1;
		else
			return list.size() + 1;
	}
	
	/**
	 * generates the id for a new prescription 
	 * @return int
	 */
	public int generateNewPrescriptionId() {
		ArrayList<Prescription> list = getAllPrescription();
		if (list.size() == 0)
			return 1;
		else
			return list.size() + 1;

	}
	
}
