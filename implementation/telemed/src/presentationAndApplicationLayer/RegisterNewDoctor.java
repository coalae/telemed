package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.User;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import domainLogic.UserMgmt;

import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A New Doctor is registered (role info: done by the NHO only)
 */
public class RegisterNewDoctor extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tFusername;
	private JTextField tFfirstname;
	private JTextField tFlastname;
	private JTextField tFclinic;
	private JPasswordField passwordField;
	private User user;
	private UserMgmt userMgmt;
	private JTextField city;

	/**
	 * Create the application.
	 */
	public RegisterNewDoctor(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		userMgmt = new UserMgmt();
		initialize();
	}

	/**
	 * Initialize the contents  
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][grow][][][][][][][][][][][][]", "[][][][][][][][][][grow][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 0, 0));
		getContentPane().add(btnLogout, "cell 26 0");
		
		JLabel lblRegisterNewDoctor = new JLabel("Register new Doctor");
		lblRegisterNewDoctor.setForeground(new Color(0, 0, 255));
		lblRegisterNewDoctor.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblRegisterNewDoctor, "cell 14 1");
		
		JLabel lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNewLabel, "cell 13 3,alignx trailing,aligny baseline");
		
		tFusername = new JTextField();
		tFusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFusername, "cell 14 3,grow");
		tFusername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 13 4,alignx trailing");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(passwordField, "cell 14 4,grow");
		
		JLabel lblFirstName = new JLabel("First name: ");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblFirstName, "cell 13 6");
		
		tFfirstname = new JTextField();
		tFfirstname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFfirstname, "cell 14 6,grow");
		tFfirstname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name: ");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblLastName, "cell 13 7,alignx trailing");
		
		tFlastname = new JTextField();
		tFlastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFlastname, "cell 14 7,grow");
		tFlastname.setColumns(10);
		
		JLabel lblClinic = new JLabel("Clinic:");
		lblClinic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblClinic, "cell 13 8,alignx right");
		
		tFclinic = new JTextField();
		tFclinic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFclinic, "cell 14 8,grow");
		tFclinic.setColumns(10);
		
		JLabel lblCity = new JLabel("City: ");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblCity, "cell 13 9,alignx trailing");
		
		// create a new Doctor upon click of button "Create Doctor"
		JButton btnCreateDoctor = new JButton("Create Doctor");
		btnCreateDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUserInputs()) {
					boolean isDoctoradded = userMgmt.addDoctor(tFusername.getText(), new String(passwordField.getPassword()), city.getText(),
							tFfirstname.getText(), tFlastname.getText(), tFclinic.getText());
					if (isDoctoradded) {
						JOptionPane.showMessageDialog(null,
	            		    "Doctor is added.",
	            		    "Create Doctor Information",
	            		    JOptionPane.INFORMATION_MESSAGE); 
						setVisible(false);
						new NHOMainPage(user);
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Username exist! \n You have to change your username.",
		            		    "Create Doctor Information",
		            		    JOptionPane.ERROR_MESSAGE); 
					}
				}else {
					JOptionPane.showMessageDialog(null,
	            		    "Empty fields are not allowed.",
	            		    "Create Doctor Information",
	            		    JOptionPane.WARNING_MESSAGE); 
				}
			}
		});
		
		city = new JTextField();
		getContentPane().add(city, "cell 14 9,grow");
		city.setColumns(10);
		btnCreateDoctor.setBackground(new Color(0, 153, 0));
		btnCreateDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnCreateDoctor, "cell 14 12,growx");
		
		// go to NHOMainPage upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NHOMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 26 14");
	}
	
	/**
	 * check inputs of user if they were empty
	 * @return boolean
	 */
	private boolean checkUserInputs() {
		if (tFusername.getText().isEmpty() || passwordField.getPassword().length == 0 || 
				tFfirstname.getText().isEmpty() || tFlastname.getText().isEmpty() || tFclinic.getText().isEmpty() || city.getText().isEmpty())
			return false;
		else
			return true;
	}

}
