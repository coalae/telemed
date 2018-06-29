package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import domainLogic.InsuranceMgmt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class RegisterAsInsuranceEmployee extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldUsername;
	private JTextField textFieldCity;
	private JTextField textFieldDepartment;
	private InsuranceMgmt insuranceMgmt;
	private JPasswordField passwordField;


	/**
	 * Create the application.
	 */
	public RegisterAsInsuranceEmployee() {
		insuranceMgmt = new InsuranceMgmt();
		setVisible(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][grow][][][][][][][][][]", "[][][][][][][][][][][][][][][]"));
		
		JLabel lblRegisterAsInsurance = new JLabel("Register as Insurance Employee");
		lblRegisterAsInsurance.setForeground(new Color(0, 0, 255));
		lblRegisterAsInsurance.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblRegisterAsInsurance, "cell 13 2");
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblUsername, "cell 12 4,alignx trailing");
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldUsername, "cell 13 4,growx");
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 12 5,alignx trailing");
		
		passwordField = new JPasswordField();
		getContentPane().add(passwordField, "cell 13 5,growx");
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblCity, "cell 12 7,alignx trailing");
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldCity, "cell 13 7,growx");
		textFieldCity.setColumns(10);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDepartment, "cell 12 8,alignx trailing");
		
		textFieldDepartment = new JTextField();
		textFieldDepartment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldDepartment, "cell 13 8,growx");
		textFieldDepartment.setColumns(10);
		
		// create account of new insurance user upon click of button "Create My Account"
		JButton btnCreateMyAccount = new JButton("Create My Account");
		btnCreateMyAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkInsuranceInputs()) {
					boolean isInsuranceAddiert = insuranceMgmt.addInsurance(textFieldUsername.getText(), new String(passwordField.getPassword()), 
																			textFieldCity.getText(), textFieldDepartment.getText());
					if (isInsuranceAddiert) {
						JOptionPane.showMessageDialog(null,
		            		    "You are registered.",
		            		    "Create Insurance Information",
		            		    JOptionPane.INFORMATION_MESSAGE); 
							setVisible(false);
							new Login();
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Username exist! \n You have to change your username.",
		            		    "Create Insurance Information",
		            		    JOptionPane.ERROR_MESSAGE); 
					}
				}else {
					JOptionPane.showMessageDialog(null, "Empty fields are not allowed.",
	            		    "Create Insurance Information",
	            		    JOptionPane.WARNING_MESSAGE); 
				}
			}
		});
		btnCreateMyAccount.setBackground(new Color(0, 128, 0));
		btnCreateMyAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnCreateMyAccount, "cell 13 10,growx");
		
		// go back to Login upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		getContentPane().add(btnBack, "cell 22 14");
	}
	
	/**
	 * check inputs of insurance user
	 * @return boolean
	 */
	private boolean checkInsuranceInputs() {
		if (textFieldUsername.getText().isEmpty() || passwordField.getPassword().length == 0 || textFieldCity.getText().isEmpty() || textFieldDepartment.getText().isEmpty()) {
			return false;
		}else {
			return true;
		}
	}
}
