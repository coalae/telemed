package domainLogic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import telemed.Doctor;
import telemed.Invoice;
import telemed.MedicalRecord;
import telemed.PatientMonitoring;
import telemed.Pharmacy;
import telemed.Prescription;
import telemed.RiskPerception;
import telemed.User;

public class NotificationMgmt {
	
	private User user;
	
	public NotificationMgmt(User user) {
		this.user = user;
	}
	
	public String[] getAllNotificationsPatient() {		
		ArrayList<String> mylist = new ArrayList<String>();
		
		for(Prescription prescription: getPrescription()) {			
			for(MedicalRecord record: getMedicalRecord()) {				
				if(record.getRecordId() == prescription.getRecordId() && prescription.getStart().before(Calendar.getInstance()) && prescription.getEnd().after(Calendar.getInstance())) {
					mylist.add("Take medication: " + prescription.getMedicationName());
				}	
			}		
		}
		
		for(PatientMonitoring patientMonitoring: getPatientMonitoringList()) {
			if (user.getId() == patientMonitoring.getPatientId() && patientMonitoring.isTreated() == false) {
				mylist.add("Non treated condition: " + patientMonitoring.getCategory());
			}
		}
		
		for(PatientMonitoring patientMonitoring: getPatientMonitoringList()) {
			if (user.getId() == patientMonitoring.getPatientId() && patientMonitoring.getRiskPerception().equals(RiskPerception.HIGH)) {
				mylist.add("High risk at condition: " + patientMonitoring.getCategory()); 
			}
		}
		
		for(Invoice invoice: getUnpaidInvoices()) {
			if (user.getId() == invoice.getPatientId() && invoice.isPaid() == false) {
				mylist.add("Unpaid invoice nr. " + Integer.toString(invoice.getInvoiceID()));
			}
		}	
		
		for(PatientMonitoring patientMonitoring: getPatientMonitoringList()) {
			if (user.getId() == patientMonitoring.getPatientId() && patientMonitoring.getDeviceId() != 0) {
				mylist.add("Used device nr. " + patientMonitoring.getDeviceId() + " for " + patientMonitoring.getCategory()); 
			}
		}
 
		String[] result = new String[mylist.size()];
		result = mylist.toArray(result);	
		return result;
	}
	
	public String[] getAllNotificationsDoctor() {
		ArrayList<String> mylist = new ArrayList<String>();
		
		for(PatientMonitoring patientMonitoring: getPatientMonitoringList()) {
			if (patientMonitoring.isTreated() == false && patientMonitoring.getRiskPerception().equals(RiskPerception.HIGH)) {
				mylist.add("Please treat patient nr. " + patientMonitoring.getPatientId() + " with condition " + patientMonitoring.getCategory() + " immediately!"); 
			}
		}
		
		for(Invoice invoice: getUnpaidInvoices()) {
			if (invoice.isPaid() == false) {
				mylist.add("Unpaid invoice nr. " + Integer.toString(invoice.getInvoiceID()) + " from patient nr. " + invoice.getPatientId());
			}
		}
		
		String[] result = new String[mylist.size()];
		result = mylist.toArray(result);	
		return result;
	}
	
	public String[] getAllNotificationsPharmacy() {
		ArrayList<String> mylist = new ArrayList<String>();
		
		for(Invoice invoice: getUnpaidInvoices()) {
			if (invoice.isPaid() == false) {
				mylist.add("Unpaid invoice nr. " + Integer.toString(invoice.getInvoiceID()) + " from patient nr. " + invoice.getPatientId());
			}
		}
		
		String[] result = new String[mylist.size()];
		result = mylist.toArray(result);	
		return result;
	}
	
	public String[] getAllNotificationsInsurance() {
		ArrayList<String> mylist = new ArrayList<String>();
		
		for(Invoice invoice: getUnpaidInvoices()) {
			if (invoice.isPaid() == false) {
				mylist.add("Unpaid invoice nr. " + Integer.toString(invoice.getInvoiceID()) + " from patient nr. " + invoice.getPatientId());
			}
		}
		
		String[] result = new String[mylist.size()];
		result = mylist.toArray(result);	
		return result;
	}
	
	public String[] getAllNotificationsNHO() {
		ArrayList<String> mylist = new ArrayList<String>();
		
		for(Doctor doctor: getDoctorList()) {
			mylist.add("Doctor " + doctor.getFirstname() + " " + doctor.getLastname() + " available");
		}
		
		for(Pharmacy pharmacy: getPharmacyList()) {
			mylist.add("Pharmacy " + pharmacy.getName() + " available");
		}
		
		String[] result = new String[mylist.size()];
		result = mylist.toArray(result);	
		return result;
	}
	
	private ArrayList<Invoice> getUnpaidInvoices() {
		return new InvoiceMgmt().getAllInvoices();
	}
	
	private List<MedicalRecord> getMedicalRecord() {
		return new MedicalRecordMgmt().getMedicalRecordByPatientId(user.getId());
	}
	
	private ArrayList<Prescription> getPrescription() {
		return new MedicalRecordMgmt().getAllPrescription();
	}
	
	private ArrayList<PatientMonitoring> getPatientMonitoringList() {
		return new PatientMonitoringMgmt().getAllPatientMonitoring();
	}
	
	private ArrayList<Doctor> getDoctorList() {
		return new UserMgmt().getDoctorList();
	}
	
	private ArrayList<Pharmacy> getPharmacyList() {
		return new UserMgmt().getPharmacyList();
	}
}
