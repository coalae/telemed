package presentationAndApplicationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Doctor;
import telemed.Insurance;
import telemed.NationalHealthOrganization;
import telemed.Patient;
import telemed.Pharmacy;
import telemed.User;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import domainLogic.UserMgmt;
import javax.swing.JPasswordField;

/**
 * Login for all users of the Telemed system
 */
public class Login extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldUsername;
	private UserMgmt usermgmt;
	private JPasswordField passwordField;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Login();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		usermgmt = new UserMgmt();
		setVisible(true);
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][grow][][][][][][grow][][][][][]", "[][][][][][][][][][][][][][][][][][]"));
		
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBackground(new Color(204, 204, 153));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblLogin.setForeground(Color.BLUE);
		getContentPane().add(lblLogin, "cell 20 1,alignx center");
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblUsername, "cell 15 5");
		
		textFieldUsername = new JTextField();
		getContentPane().add(textFieldUsername, "cell 20 5,growx");
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 15 7");
		
		// login upon click of button "Login"
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(153, 204, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textFieldUsername.getText();
				String password = new String(passwordField.getPassword());
				boolean correctLoginData = usermgmt.checkUser(username, password);
				if (correctLoginData) {
					setVisible(false);
					checkUserInstance(username, password);
				}else {
					JOptionPane.showMessageDialog(null,
	            		    "Username or Password incorrect",
	            		    "Login Error",
	            		    JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		passwordField = new JPasswordField();
		getContentPane().add(passwordField, "cell 20 7,growx");
		getContentPane().add(btnLogin, "cell 20 10,growx");
		
		// register as NHO employee
		JButton btnRegisterAsNho = new JButton("Register as NHO Employee");
		btnRegisterAsNho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterAsNHOEmployee();
			}
		});
		
		// register as patient
		JButton btnRegisterAsPatient = new JButton("Register as Patient");
		btnRegisterAsPatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
		      	setVisible(false);
		      	new RegisterAsPatient();
			}
		});
		getContentPane().add(btnRegisterAsPatient, "cell 23 13,growx");
		getContentPane().add(btnRegisterAsNho, "cell 23 14,growx");
		
		// register as insurance employee
		JButton btnRegisterAsInsurance = new JButton("Register as Insurance Employee");
		btnRegisterAsInsurance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterAsInsuranceEmployee();
			}
		});
		getContentPane().add(btnRegisterAsInsurance, "cell 23 15");
		//getBounds() //Window position
	}

	/**
	 * check user instance (i.e. what kind of user it is)
	 * @param username
	 * @param password
	 */
	private void checkUserInstance(String username, String password) {
		User user = usermgmt.getUserByUsername(username);
		if (user instanceof Patient) {
			new PatientMain(user);
		}else if (user instanceof Doctor) {
			new DoctorMainPage(user);
		}else if (user instanceof NationalHealthOrganization) {
			new NHOMainPage(user);
		}else if (user instanceof Pharmacy) {
			new PharmacyMainPage(user);
		}else if (user instanceof Insurance) {
			new InsuranceMainPage(user);
		}
	}
	
}
