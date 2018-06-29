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

import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * A New Pharmacy is registered (role info: done by the NHO only)
 */
public class RegisterNewPharmacy extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tFusername;
	private JPasswordField passwordField;
	private JTextField tFpharmacyName;
	private User user;
	private UserMgmt userMgmt;
	private JTextField city;


	/**
	 * Create the application.
	 */
	public RegisterNewPharmacy(User user) {
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
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][grow][][][][][][][][][][][]", "[][][][][][][][grow][][][][][][]"));
		
		// logout upon click of button "Logout" (navigate back to Login page)
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 0, 0));
		getContentPane().add(btnLogout, "cell 19 0");
		
		JLabel lblRegisterNewPharmacy = new JLabel("Register new Pharmacy");
		lblRegisterNewPharmacy.setForeground(new Color(0, 0, 255));
		lblRegisterNewPharmacy.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblRegisterNewPharmacy, "cell 8 1");
		
		JLabel lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblUsername, "cell 6 3,alignx right");
		
		tFusername = new JTextField();
		tFusername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFusername, "cell 8 3,growx");
		tFusername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPassword, "cell 6 4,alignx right");
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(passwordField, "cell 8 4,growx");
		
		JLabel lblPharmacyName = new JLabel("Pharmacy name: ");
		lblPharmacyName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPharmacyName, "cell 6 6,alignx right");
		
		tFpharmacyName = new JTextField();
		tFpharmacyName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFpharmacyName, "cell 8 6,growx");
		tFpharmacyName.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblCity, "cell 6 7,alignx right");
		
		// create the pharmacy upon click of button "Create Pharmacy"
		JButton btnCreatePharmacy = new JButton("Create Pharmacy");
		btnCreatePharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUserInputs()) {
					boolean isPharmacyadded = userMgmt.addPharmacy(tFusername.getText(), new String(passwordField.getPassword()), city.getText(), tFpharmacyName.getText());
					if (isPharmacyadded) {
						JOptionPane.showMessageDialog(null,
	            		    "Pharmacy is added.",
	            		    "Create Pharmacy Information",
	            		    JOptionPane.INFORMATION_MESSAGE); 
						setVisible(false);
						new NHOMainPage(user);
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Username exist! \n You have to change the username.",
		            		    "Create Pharmacy Information",
		            		    JOptionPane.ERROR_MESSAGE); 
					}
				}else {
					JOptionPane.showMessageDialog(null,
	            		    "Empty fields are not allowed.",
	            		    "Create Pharmacy Information",
	            		    JOptionPane.WARNING_MESSAGE); 
				}
			}
		});
		
		city = new JTextField();
		getContentPane().add(city, "cell 8 7,growx");
		city.setColumns(10);
		btnCreatePharmacy.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreatePharmacy.setBackground(new Color(0, 153, 0));
		getContentPane().add(btnCreatePharmacy, "cell 8 10,growx");
		
		// go back to NHOMainPage window upon click on button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NHOMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 19 13");
	}
	
	/**
	 * check the user's input if it is empty
	 * @return boolean
	 */
	private boolean checkUserInputs() {
		if (tFusername.getText().isEmpty() || passwordField.getPassword().length == 0 || 
				tFpharmacyName.getText().isEmpty() || city.getText().isEmpty())
			return false;
		else
			return true;
	}

}
