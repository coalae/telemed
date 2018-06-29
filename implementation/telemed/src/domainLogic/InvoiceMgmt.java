package domainLogic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import persistenceLayer.InvoiceDAO;
import persistenceLayer.SerializedInvoiceDAO;
import telemed.Invoice;
import telemed.Patient;
import telemed.TelemedFactory;
import telemed.User;


/**
* The class provides the operations to manage the Invoices: add, delete, change, get list of Invoices. 
*/
public class InvoiceMgmt {
	
	/**
	 * Instance variables 
	 */	
	private InvoiceDAO invoicedao;
	private TelemedFactory factory;
	private UserMgmt userMgmt;
	/**
	 * Constructor
	 */	
	public InvoiceMgmt(){
		this.invoicedao = new SerializedInvoiceDAO();
		this.userMgmt = new UserMgmt();
		this.factory = TelemedFactory.eINSTANCE;
	}
	
	/**
	 * get invoicedao
	 * @return UserDAO
	 */
	public InvoiceDAO invoicedao() {
		return invoicedao;
	}


	/**
	 * get invoicelist
	 * @return ArrayList
	 */
	public ArrayList<Invoice> getAllInvoices(){
		
		ArrayList<Invoice> invoicelist = invoicedao.getInvoiceList();
		return invoicelist;
		
	}
	
	
	/**
	 * get invoices by patient id
	 * @param patientId
	 * @return ArrayList
	 */
	public ArrayList <Invoice> getInvoiceByPatientId(int patientId){
		
		ArrayList<Invoice> invoicelist = invoicedao.getInvoiceList();
		ArrayList <Invoice> invoices = new ArrayList<>();
		
		for (Invoice invoice : invoicelist) {
			if(invoice.getPatientId() == patientId)
				invoices.add(invoice);
		}
		
		return invoices;
	}
	
	
	/**
	 * get invoices by creditor id (i.e. NHO, Doctor, Pharmacy who receives the money) 
	 * @param creditorId
	 * @return ArrayList
	 */
	public ArrayList <Invoice> getInvoiceByCreditorId(int creditorId){
		
		ArrayList<Invoice> invoicelist = invoicedao.getInvoiceList();
		ArrayList <Invoice> invoices = new ArrayList<>();
		
		for (Invoice invoice : invoicelist) {
			if(invoice.getCreditorId() == creditorId)
				invoices.add(invoice);
		}
		
		return invoices;
	}
	
	
	/**
	 * get invoices by invoice id
	 * @param invoiceId
	 * @return ArrayList
	 */
	public Invoice getInvoiceByInvoiceId(int invoiceId){
		
		ArrayList<Invoice> invoicelist = invoicedao.getInvoiceList();
		for (Invoice invoice : invoicelist) {
			if(invoice.getInvoiceID() == invoiceId)
				return invoice;
		}
		
		return null;
	}
	
	
	/**
	 * add invoice
	 * @param invoiceId
	 * @param patientId
	 * @param invoiceDate
	 * @param dueDate
	 * @param price
	 * @param creditorId
	 * @param topic
	 * @param paid
	 * @param paidDate
	 */
	public void addInvoice(int patientId, Calendar invoiceDate, Calendar dueDate, double price, int creditorId, 
			String topic, boolean paid, Calendar paidDate){
		  
		Invoice invoice = factory.createInvoice();
		invoice.setInvoiceID(generateNewInvoiceID());
		invoice.setPatientId(patientId);
		invoice.setInvoiceDate(invoiceDate);
		invoice.setDueDate(dueDate);
		invoice.setPrice(price);
		invoice.setCreditorId(creditorId);
		invoice.setTopic(topic);
		invoice.setPaid(paid);
		invoice.setPaidDate(paidDate);
		
		invoicedao.addInvoice(invoice);
	}
	
	
	
	/** 
	 * pay invoice (set boolean paid=True)
	 * @param invoiceId
	 */
	public void payInvoice(int invoiceId) {
		Calendar date = Calendar.getInstance();
		
		Invoice invoice = getInvoiceByInvoiceId(invoiceId);
		invoice.setPaid(true);
		invoice.setPaidDate(date);
		invoicedao.updateInvoice(invoice);
		
	}

	
	/**
	 * add Insurance contribution invoice for all patients
	 */
	public void addInsuranceContributionInvoiceForAllPatients(User user) {
		
		ArrayList<Patient> patients = userMgmt.getPatientList();
		int insuranceId = user.getId();

		for (Patient patient : patients) {
			addInsuranceInvoice(patient.getId(), insuranceId);
		}
		
	}
	
	public void addInsuranceInvoice(int patientId, int insuranceId) {
		
		Calendar date = Calendar.getInstance();
		Calendar dueDate = new GregorianCalendar(date.get(Calendar.YEAR), date.get(Calendar.MONTH), date.get(Calendar.DAY_OF_MONTH)+15);
		double price = 388.85;
		
		addInvoice(patientId, date, dueDate, price, insuranceId, "NHO Contribution", false, null);

	}
	
	private int generateNewInvoiceID() {
		return invoicedao.getInvoiceList().size() + 1;
	}
	
	
}
