package domainLogic;

import java.util.ArrayList;
import java.util.Calendar;

import persistenceLayer.SerializedUserDAO;
import persistenceLayer.UserDAO;
import telemed.Doctor;
import telemed.Gender;
import telemed.Insurance;
import telemed.NationalHealthOrganization;
import telemed.Patient;
import telemed.Pharmacy;
import telemed.TelemedFactory;
import telemed.User;

/**
* The class provides the operations to manage the Users: add, delete, change, get list of Users. 
*/
public class UserMgmt {
	
	/**
	 * Instance variables 
	 */	
	private UserDAO userdao;
	private TelemedFactory factory;
	
	/**
	 * Constructor
	 */	
	public UserMgmt(){
		this.userdao = new SerializedUserDAO();
		factory = TelemedFactory.eINSTANCE;
	}
	
	/**
	 * get userdao
	 * @return UserDAO
	 */
	public UserDAO getUserDAO() {
		return userdao;
	}


	/**
	 * check if user exists and entered a valid password, which matches the user data, so the login can occur
	 * @param username
	 * @param password
	 * @return boolean
	 */
	public boolean checkUser(String username, String password) {
		
			if (username.isEmpty() || password.isEmpty())
				return false;
			
			User user = this.getUserByUsername(username);
			if (user != null && user.getPassword().equals(password)) {
				return true;
			}
			else {
				return false;	
			}
	}
	
	
	/**
	 * add a new Doctor
	 * @param id
	 * @param username
	 * @param password
	 * @param city
	 * @param firstname
	 * @param lastname
	 * @param clinic
	 */
	public boolean addDoctor(String username, String password, String city, String firstname, String lastname, String clinic) {
		
		if (userdao.getUserByUsername(username) == null) {
			Doctor doctor = factory.createDoctor();
			doctor.setId(userdao.getUserList().size() + 1);
			doctor.setUsername(username);
			doctor.setPassword(password);
			doctor.setCity(city);
			doctor.setFirstname(firstname);
			doctor.setLastname(lastname);
			doctor.setClinic(clinic);
			userdao.addUser(doctor);
			return true;
		}
		else
			return false;
		
	}
	
	
	/**
	 * add a new Pharmacy
	 * @param id
	 * @param username
	 * @param password
	 * @param city
	 * @param pharmacyname
	 */
	public boolean addPharmacy(String username, String password, String city, String pharmacyname) {
		
		if (userdao.getUserByUsername(username) == null) {
			Pharmacy pharmacy = factory.createPharmacy();
			pharmacy.setId(userdao.getUserList().size() + 1);
			pharmacy.setUsername(username);
			pharmacy.setPassword(password);
			pharmacy.setCity(city);
			pharmacy.setName(pharmacyname);
			userdao.addUser(pharmacy);
			return true;
		}else
			return false;
		
	}
	
	
	/**
	 * add a new NHO Employee
	 * @param id
	 * @param username
	 * @param password
	 * @param city
	 * @param contact
	 */
	public boolean addNHO(String username, String password, String city, String contact) {
		
		if (userdao.getUserByUsername(username) != null) {
			return false;
		}else {
			NationalHealthOrganization nho = factory.createNationalHealthOrganization();
			nho.setId(userdao.getUserList().size() + 1);
			nho.setUsername(username);
			nho.setPassword(password);
			nho.setCity(city);
			nho.setContact(contact);
			userdao.addUser(nho);
			return true;
		}
		
	}
	
	
	/**
	 * add a new Patient
	 * @param id
	 * @param username
	 * @param password
	 * @param city
	 * @param firstname
	 * @param lastname
	 * @param svnr
	 * @param weight
	 * @param height
	 * @param gender
	 * @param birthdate
	 */
	public boolean addPatient(String username, String password, String city, String firstname, String lastname, String svnr, 
			double weight, double height, Gender gender, Calendar birthdate) {
		
		if (userdao.getUserByUsername(username) != null) {
			return false;
		}else {
			// Add dummyId 0 and change later in SerializedUserDAO
			Patient patient = factory.createPatient();
			patient.setId(userdao.getUserList().size() + 1);
			patient.setUsername(username);
			patient.setPassword(password);
			patient.setCity(city);
			patient.setFirstname(firstname);
			patient.setLastname(lastname);
			patient.setSvnr(svnr);
			patient.setWeight(weight);
			patient.setHeight(height);
			patient.setGender(gender);
			patient.setBirthdate(birthdate);
			userdao.addUser(patient);
			return true;
		}
	}
	
	
	/**
	 * add a new Insurance employee
	 * @param id
	 * @param username
	 * @param password
	 * @param city
	 * @param department
	 */
	public boolean addInsurance(String username, String password, String city, String department) {
		
		if (userdao.getUserByUsername(username) != null) {
			return false;
		}else {
			// Add dummyId 0 and change later in SerializedUserDAO
			Insurance insurance = factory.createInsurance();
			insurance.setId(userdao.getUserList().size() + 1);
			insurance.setUsername(username);
			insurance.setPassword(password);
			insurance.setCity(city);
			insurance.setDepartment(department);
			userdao.addUser(insurance);
			return true;
		}
	}
	
	
	/**
	 * get userlist
	 * @return ArrayList
	 */
	public ArrayList<User> getUserList(){
		
		ArrayList<User> users = new ArrayList<User>();
		users = userdao.getUserList();	
		
		return users;
	}
	
	public ArrayList<Patient> getPatientList(){
	
		ArrayList<User> users = userdao.getUserList();
		ArrayList<Patient> patients = new ArrayList<>();
		for (User user : users) {
			if(user instanceof Patient)
				patients.add((Patient) user);
				
		}
		
		return patients;
	}
	
	public ArrayList<Doctor> getDoctorList(){
		
		ArrayList<User> users = userdao.getUserList();
		ArrayList<Doctor> doctors = new ArrayList<>();
		for (User user : users) {
			if(user instanceof Doctor)
				doctors.add((Doctor) user);
				
		}
		
		return doctors;
	}
	
	public ArrayList<Pharmacy> getPharmacyList(){
		
		ArrayList<User> users = userdao.getUserList();
		ArrayList<Pharmacy> pharmacies = new ArrayList<>();
		for (User user : users) {
			if(user instanceof Pharmacy)
				pharmacies.add((Pharmacy) user);
				
		}
		
		return pharmacies;
	}
	
	
	/**
	 * get user by Id
	 * @param id
	 * @return User
	 */
	public User getUserById(int id) {
		
		User user = userdao.getUserById(id);
		
		return user;
	}

	
	/**
	 * get user by username
	 * @param username
	 * @return User
	 */
	public User getUserByUsername(String username) {
		
		User user = userdao.getUserByUsername(username);
		
		return user;
	}
	
	public String getUserType(int creditorId) {
		User user = getUserById(creditorId);
		if(user == null)
			return null;
		
		return user.getClass().getSimpleName().substring(0, user.getClass().getSimpleName().length() - 4);
	}
	
}
