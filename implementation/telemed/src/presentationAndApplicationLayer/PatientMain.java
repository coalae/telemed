package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.User;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import domainLogic.NotificationMgmt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Patient Main Page with selection of use cases available for the Patient role
 */
public class PatientMain extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private NotificationMgmt notificationmgmt;


	/**
	 * Create the application.
	 */
	public PatientMain(User user) {
		this.user = user;
		setVisible(true);
		setResizable(false);
		notificationmgmt = new NotificationMgmt(user);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setBackground(new Color(153, 0, 0));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnLogout, "cell 17 0");
		
		JLabel lblNewLabel = new JLabel("Patient Main Page");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblNewLabel, "cell 10 1,alignx center");
		
		JLabel lblYouAreLogged = new JLabel("You are logged in as: " + user.getUsername());
		lblYouAreLogged.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblYouAreLogged, "cell 10 2,alignx center");
		
		// user can show his personal medical record upon click of button "View Personal Medical Record"
		JButton btnViewPersonalMedical = new JButton("View Personal Medical Record");
		btnViewPersonalMedical.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewPersonalMedicalRecords(user);
			}
		});
		btnViewPersonalMedical.setBackground(new Color(0, 153, 0));
		btnViewPersonalMedical.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewPersonalMedical, "cell 10 4,growx");
		
		// user sees personal invoices upon click of button "View Personal Invoices"
		JButton btnViewPersonalInvoices = new JButton("View Personal Invoices");
		btnViewPersonalInvoices.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewPersonalInvoices(user);
			}
		});
		btnViewPersonalInvoices.setBackground(new Color(51, 153, 0));
		btnViewPersonalInvoices.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewPersonalInvoices, "cell 10 6,growx");
		
		// user can add remote patient monitoring item upon click of appropriate button
		JButton btnCreateRemotePatient = new JButton("Create Remote Patient Monitoring Item");
		btnCreateRemotePatient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new CreatePatientMonitoringItem(user);
			}
		});
		btnCreateRemotePatient.setBackground(new Color(51, 153, 0));
		btnCreateRemotePatient.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnCreateRemotePatient, "cell 10 8");
		
		JLabel lblNotifications = new JLabel("Notifications:");
		lblNotifications.setFont(new Font("Tahoma", Font.ITALIC, 13));
		getContentPane().add(lblNotifications, "cell 10 10");
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < notificationmgmt.getAllNotificationsPatient().length ; i++)
			model.addElement(notificationmgmt.getAllNotificationsPatient()[i]);
		JList<String> myList = new JList<String>(model);
		JScrollPane scrollPane = new JScrollPane(myList);
		getContentPane().add(scrollPane, "cell 10 10, growx");
	}

}
