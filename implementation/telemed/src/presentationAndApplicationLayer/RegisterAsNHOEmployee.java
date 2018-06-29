package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import domainLogic.UserMgmt;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

/**
 * Register as an employee of the National Health Organization
 */
public class RegisterAsNHOEmployee extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldUsername;
	private JPasswordField passwordField;
	private JTextField textFieldContact;
	private UserMgmt userMgmt;
	private JTextField textFieldCity;


	/**
	 * Create the application.
	 */
	public RegisterAsNHOEmployee() {
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
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][grow][grow][][][][][][]", "[][][][][][][][][][][][][][][][]"));
		
		JLabel lblRegisterAsNho = new JLabel("Register as NHO Employee");
		lblRegisterAsNho.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegisterAsNho.setForeground(new Color(0, 51, 255));
		getContentPane().add(lblRegisterAsNho, "cell 6 1,grow");
		
		// go back to Login upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		
		// create a new User (NHO employee) upon click of button "Create My Account"
		JButton btnCreateMyAccount = new JButton("Create My Account");
		btnCreateMyAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkNHOInputs()) {
					boolean isNHOAddiert = userMgmt.addNHO(textFieldUsername.getText(), new String(passwordField.getPassword()), textFieldCity.getText(), textFieldContact.getText());
					if (isNHOAddiert) {
						JOptionPane.showMessageDialog(null,
		            		    "You are registered.",
		            		    "Create NHO Information",
		            		    JOptionPane.INFORMATION_MESSAGE); 
							setVisible(false);
							new Login();
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Username exist! \n You have to change your username.",
		            		    "Create NHO Information",
		            		    JOptionPane.ERROR_MESSAGE); 
					}
				}else {
					JOptionPane.showMessageDialog(null, "Empty fields are not allowed.",
		            		    "Create NHO Information",
		            		    JOptionPane.WARNING_MESSAGE); 
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNewLabel, "cell 5 6,alignx right");
		
		textFieldUsername = new JTextField();
		textFieldUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldUsername, "cell 6 6,growx");
		textFieldUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 5 7,alignx right");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(passwordField, "cell 6 7,growx");
		
		JLabel lblCity = new JLabel("City: ");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblCity, "cell 5 8,alignx right");
		
		textFieldCity = new JTextField();
		textFieldCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldCity, "cell 6 8,growx");
		textFieldCity.setColumns(10);
		
		JLabel lblContact = new JLabel("Contact: ");
		lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblContact, "cell 5 9,alignx right");
		
		textFieldContact = new JTextField();
		textFieldContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldContact, "cell 6 9,growx");
		textFieldContact.setColumns(10);
		btnCreateMyAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreateMyAccount.setBackground(new Color(0, 153, 51));
		getContentPane().add(btnCreateMyAccount, "cell 6 11,alignx center");
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 12 15");
	}
	
	/**
	 * check inputs if they are empty
	 * @return boolean 
	 */
	private boolean checkNHOInputs() {
		if (textFieldUsername.getText().isEmpty() || passwordField.getPassword().length == 0 || textFieldCity.getText().isEmpty() || textFieldContact.getText().isEmpty()) {
			return false;
		}else {
			return true;
		}
	}

}
