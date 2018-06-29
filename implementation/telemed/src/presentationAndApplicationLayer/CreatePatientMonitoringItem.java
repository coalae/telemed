package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.MedicalCondition;
import telemed.RiskPerception;
import telemed.User;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;

import domainLogic.PatientMonitoringMgmt;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

/**
 * Patient creates a PatientMonitoringItem and submits data to be read by a Doctor. 
 */


public class CreatePatientMonitoringItem extends JFrame{
	
	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private PatientMonitoringMgmt patientMonitoringMgmt;

	// ACHTUNG: PatientID and Date of PatientMonitoringItem Creation will be filled out automatically (with data of user who is currently logged in)
	// ACHTUNG: set deviceId instancevariable of PatientMonitoringItem as "0" here! (because the Patient who enters the data is no device)

	/**
	 * Create the application.
	 */
	public CreatePatientMonitoringItem(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		patientMonitoringMgmt = new PatientMonitoringMgmt();
		initialize();
	}

	/**
	 * Initialize the contents of the frame. 
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][grow][][][][][]", "[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]"));
		
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
		getContentPane().add(btnLogout, "cell 10 0");
		
		// create new patient monitoring item
		JLabel lblCreatePatientMonitoring = new JLabel("Create Patient Monitoring Item");
		lblCreatePatientMonitoring.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCreatePatientMonitoring.setForeground(new Color(0, 0, 255));
		getContentPane().add(lblCreatePatientMonitoring, "cell 5 1");
		
		JLabel lblCategory = new JLabel("Category: ");
		lblCategory.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblCategory, "cell 5 8");
		
		JComboBox<MedicalCondition> category = new JComboBox<MedicalCondition>();
		category.setModel(new DefaultComboBoxModel<MedicalCondition>(MedicalCondition.values()));
		getContentPane().add(category, "cell 5 11,growx");
		
		
		JComboBox<RiskPerception> riskPerception = new JComboBox<RiskPerception>();
		riskPerception.setEnabled(true);
		riskPerception.setModel(new DefaultComboBoxModel<RiskPerception>(RiskPerception.values()));
		getContentPane().add(riskPerception, "cell 5 19,growx");
		
		
		JLabel lblRiskPerception = new JLabel("Risk perception:");
		lblRiskPerception.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblRiskPerception, "cell 5 17");
		
		// go back to PatientMain page upon click of button "Back"
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PatientMain(user);
				
			}
		});
		
		// submit the new patient monitoring item to be reviewed by a doctor
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (riskPerception.isEnabled() && !riskPerception.getSelectedItem().toString().isEmpty()) {
					Calendar date = Calendar.getInstance();
					//MonitoringId to be generated automatically later - add dummy id here
					patientMonitoringMgmt.addPatientMonitoring(user.getId(), ((MedicalCondition)category.getSelectedItem()), 
																date, ((RiskPerception)riskPerception.getSelectedItem()), false, 0);
					JOptionPane.showMessageDialog(null,
	            		    "Monitoring Item Created.",
	            		    "Create Patient Monitoring Item Information",
	            		    JOptionPane.INFORMATION_MESSAGE); 
					setVisible(false);
					new PatientMain(user);
				}else {
					JOptionPane.showMessageDialog(null,
	            		    "Empty fields are not allowed.",
	            		    "Create Patient Monitoring Item Information",
	            		    JOptionPane.WARNING_MESSAGE); 
				}
			}
		});
		btnSubmit.setBackground(new Color(51, 153, 51));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(btnSubmit, "cell 5 27,growx");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnNewButton, "cell 10 36,growx");
	}

}
