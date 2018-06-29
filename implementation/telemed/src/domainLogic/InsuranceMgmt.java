package domainLogic;

import persistenceLayer.InvoiceDAO;
import persistenceLayer.SerializedInvoiceDAO;
import persistenceLayer.SerializedUserDAO;
import persistenceLayer.UserDAO;
import telemed.Insurance;
import telemed.TelemedFactory;
import telemed.User;

/**
 * Manages the functionalities of the Insurance user
 */
public class InsuranceMgmt {

	/**
	 * Instance variables 
	 */	
	private UserDAO userdao;
	private InvoiceDAO invoicedao;
	private InvoiceMgmt invoicemgmt;
	private TelemedFactory factory;
	
	/**
	 * Constructor
	 */	
	public InsuranceMgmt(){
		this.userdao = new SerializedUserDAO();
		this.invoicedao = new SerializedInvoiceDAO();
		factory = TelemedFactory.eINSTANCE;
	}
	
	/**
	 * claim insurance contribution from patients
	 * i.e.: all patients get an invoice to pay the insurance contribution to the Insurance
	 */
	public void claimInsuranceContributionFromPatients(User user) {

		// call method from invoicemgmt
		invoicemgmt.addInsuranceContributionInvoiceForAllPatients(user);
		
	}
	
	/**
	 * adds a new Insurance to the Telemed system
	 * @param username
	 * @param password
	 * @param city
	 * @param department
	 * @return boolean
	 */
	public boolean addInsurance(String username, String password, String city, String department) {
		Insurance user = factory.createInsurance();
		user.setId(userdao.getUserList().size() + 1);
		user.setUsername(username);
		user.setPassword(password);
		user.setCity(city);
		user.setDepartment(department);
		userdao.addUser(user);
		return true;
	}
	
}

