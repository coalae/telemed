package presentationAndApplicationLayer;


import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Gender;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import domainLogic.UserMgmt;

import javax.swing.JPasswordField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

/**
 * Register as a Patient (user) to access the Telemed system
 */
public class RegisterAsPatient extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTextField username;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField svnr;
	private JTextField weight;
	private JTextField height;
	private JPasswordField passwordField;
	private UserMgmt userMgmt;
	private JTextField birthdate;
	private JTextField city;

	
	/**
	 * Create the application.
	 */
	public RegisterAsPatient() {
		userMgmt = new UserMgmt();
		setVisible(true);
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][grow][grow][][][]", "[][][][][][][][][][][][][grow][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Register as Patient");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		getContentPane().add(lblNewLabel, "cell 5 1");
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblUsername, "cell 4 3,alignx trailing");
		
		username = new JTextField();
		username.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(username, "cell 5 3,growx");
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 4 4,alignx trailing");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(passwordField, "cell 5 4,growx");
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblFirstName, "cell 4 6,alignx trailing");
		
		firstname = new JTextField();
		firstname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(firstname, "cell 5 6,growx");
		firstname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblLastName, "cell 4 7,alignx trailing");
		
		lastname = new JTextField();
		lastname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lastname, "cell 5 7,growx");
		lastname.setColumns(10);
		
		JLabel lblSvnr = new JLabel("SVNR:");
		lblSvnr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblSvnr, "cell 4 8,alignx trailing");
		
		svnr = new JTextField();
		svnr.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(svnr, "cell 5 8,growx");
		svnr.setColumns(10);
		
		JLabel lblAddress = new JLabel("City:");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblAddress, "cell 4 9,alignx trailing");
		
		city = new JTextField();
		city.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(city, "cell 5 9,growx");
		city.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblGender, "cell 4 11,alignx trailing");
		
		JComboBox<Gender> comboBoxGender = new JComboBox<Gender>();
		comboBoxGender.setModel(new DefaultComboBoxModel<Gender>(Gender.values()));
		getContentPane().add(comboBoxGender, "cell 5 11,growx");
		
		JLabel lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDateOfBirth, "cell 4 12,alignx trailing");
		
		UtilDateModel modelStartOfMedication = new UtilDateModel();
		Properties propertiesStartOfMedication = new Properties();
		propertiesStartOfMedication.put("text.today", "Today");
		propertiesStartOfMedication.put("text.month", "Month");
		propertiesStartOfMedication.put("text.year", "Year");
		JDatePanelImpl datePanelStartOfMedication = new JDatePanelImpl(modelStartOfMedication, propertiesStartOfMedication);
		JDatePickerImpl birthdate = new JDatePickerImpl(datePanelStartOfMedication, new DateComponentFormatter());
		getContentPane().add(birthdate, "cell 5 12,growx");
		
		
		JLabel lblWeightinKg = new JLabel("Weight (in kg):");
		lblWeightinKg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblWeightinKg, "cell 4 13,alignx trailing");
		
		weight = new JTextField();
		weight.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(weight, "cell 5 13,growx");
		weight.setColumns(10);
		
		JLabel lblHeightinCm = new JLabel("Height (in cm):");
		lblHeightinCm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblHeightinCm, "cell 4 14,alignx trailing");
		
		height = new JTextField();
		height.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(height, "cell 5 14,growx");
		height.setColumns(10);
		
		// go back to Login upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		
		// create a new user account upon click of button "Creae my Account"
		JButton btnCreateMyAccount = new JButton("Create my Account");
		btnCreateMyAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weightDouble, heightDouble;
				try {
					weightDouble = Double.parseDouble(weight.getText());
					heightDouble = Double.parseDouble(height.getText());
					if (checkUserInputs()) {
						Date date = (Date)birthdate.getModel().getValue();
						Calendar calBirthdate = Calendar.getInstance();
						calBirthdate.setTime(date);
						boolean isUseradded = userMgmt.addPatient(username.getText(), new String(passwordField.getPassword()), city.getText(), 
											firstname.getText(), lastname.getText(), svnr.getText(), weightDouble, heightDouble, ((Gender)comboBoxGender.getSelectedItem()), calBirthdate);
						if (isUseradded) {
							JOptionPane.showMessageDialog(null,
		            		    "You are registered.",
		            		    "Create Patient Information",
		            		    JOptionPane.INFORMATION_MESSAGE); 
							setVisible(false);
							new Login();
						}else {
							JOptionPane.showMessageDialog(null,
			            		    "Username exist! \n You have to change your username.",
			            		    "Create Patient Information",
			            		    JOptionPane.ERROR_MESSAGE); 
						}
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Empty fields are not allowed.",
		            		    "Create Patient Information",
		            		    JOptionPane.WARNING_MESSAGE); 
					}
				}catch(NumberFormatException exception) {
					JOptionPane.showMessageDialog(null,
	            		    "Weight or Height cannot contains charackter!",
	            		    "Create Patient Information",
	            		    JOptionPane.ERROR_MESSAGE); 
				}
				
			}
		});
		btnCreateMyAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreateMyAccount.setForeground(new Color(0, 0, 0));
		btnCreateMyAccount.setBackground(new Color(0, 153, 51));
		getContentPane().add(btnCreateMyAccount, "cell 5 17,alignx center");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 7 17");
	}
	
	/** check inputs of user if they were empty
	 * @return boolean
	 */
	private boolean checkUserInputs() {
		if(username.getText().isEmpty() || passwordField.getPassword().length == 0|| city.getText().isEmpty() || firstname.getText().isEmpty() || 
				lastname.getText().isEmpty() || svnr.getText().isEmpty() || weight.getText().isEmpty() || height.getText().isEmpty())
			return false;
		else
			return true;
	}
	
}
