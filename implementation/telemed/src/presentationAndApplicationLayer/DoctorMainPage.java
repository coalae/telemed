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
 * Main Page for the Doctor (user) and display of functionalities available for this role
 */
public class DoctorMainPage extends JFrame{
	
	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private NotificationMgmt notificationmgmt;
	
	/**
	 * Create the application.
	 */
	public DoctorMainPage(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		notificationmgmt = new NotificationMgmt(user);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][][][]"));
		
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
		getContentPane().add(btnLogout, "cell 20 0");
		
		JLabel lblDoctorMainPage = new JLabel("Doctor Main Page");
		lblDoctorMainPage.setForeground(new Color(0, 0, 255));
		lblDoctorMainPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblDoctorMainPage, "cell 11 1,alignx center");
		
		JLabel lblYouAreLogged = new JLabel("You are logged in as: " + user.getUsername());
		lblYouAreLogged.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblYouAreLogged, "cell 11 2,alignx center");
		
		// view medical records page
		JButton btnViewMedicalRecords = new JButton("View Medical Records");
		btnViewMedicalRecords.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewAllMedicalRecords(user);
			}
		});
		btnViewMedicalRecords.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnViewMedicalRecords.setBackground(new Color(51, 153, 0));
		getContentPane().add(btnViewMedicalRecords, "cell 11 4,growx");
		
		JButton btnCreateMedicalRecord = new JButton("Create Medical Record");
		btnCreateMedicalRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new CreateMedicalRecord(user);
			}
		});
		btnCreateMedicalRecord.setBackground(new Color(0, 153, 0));
		btnCreateMedicalRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnCreateMedicalRecord, "cell 11 6,growx");
		
		// view remote patient monitoring items (that patients or devices entered)
		JButton btnViewRemotePatientmonitoring = new JButton("View Remote Patient Monitoring Items");
		btnViewRemotePatientmonitoring.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewAllPatientMonitorings(user);
			}
		});
		btnViewRemotePatientmonitoring.setBackground(new Color(0, 153, 0));
		btnViewRemotePatientmonitoring.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewRemotePatientmonitoring, "cell 11 8, growx");
		
		// view the transaction account to see which invoices have been paid
		JButton btnViewTransactionAccout = new JButton("View My Transactions");
		btnViewTransactionAccout.setBackground(new Color(0, 153, 0));
		btnViewTransactionAccout.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewTransactionAccout, "cell 11 10,growx");
		btnViewTransactionAccout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewTransactionAccount(user);
			}
		});
		
		JLabel lblNotifications = new JLabel("Notifications:");
		lblNotifications.setFont(new Font("Tahoma", Font.ITALIC, 13));
		getContentPane().add(lblNotifications, "cell 11 12");
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < notificationmgmt.getAllNotificationsDoctor().length ; i++)
			model.addElement(notificationmgmt.getAllNotificationsDoctor()[i]);
		JList<String> myList = new JList<String>(model);
		JScrollPane scrollPane = new JScrollPane(myList);
		getContentPane().add(scrollPane, "cell 11 12, growx");		
	}

}
