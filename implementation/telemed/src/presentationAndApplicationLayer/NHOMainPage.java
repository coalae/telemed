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
 * Main Menu Page of the NHO user role, which displays the functionalities available to this user group.
 */
public class NHOMainPage extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private NotificationMgmt notificationmgmt;
	/**
	 * Create the application.
	 */
	public NHOMainPage(User user) {
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
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][][][][]"));
		
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
		getContentPane().add(btnLogout, "cell 18 0");
		
		JLabel lblNhoMainPage = new JLabel("NHO Main Page");
		lblNhoMainPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNhoMainPage.setForeground(new Color(0, 0, 255));
		getContentPane().add(lblNhoMainPage, "cell 10 1,alignx center");
		
		JLabel lblYouAreLogged = new JLabel("You are logged in as: " + user.getUsername());
		lblYouAreLogged.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblYouAreLogged, "cell 10 2,alignx center");
		
		JButton btnGatherAnonymizedData = new JButton("Gather Anonymized Data");
		btnGatherAnonymizedData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new AnonymizedDataOptions(user);
			}
		});
		btnGatherAnonymizedData.setBackground(new Color(0, 153, 0));
		btnGatherAnonymizedData.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnGatherAnonymizedData, "cell 10 4,growx");
		
		// register a new doctor upon click of button "Register New Doctor"
		JButton btnRegisterNewDoctor = new JButton("Register New Doctor");
		btnRegisterNewDoctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterNewDoctor(user);
			}
		});
		btnRegisterNewDoctor.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRegisterNewDoctor.setBackground(new Color(0, 153, 0));
		getContentPane().add(btnRegisterNewDoctor, "cell 10 6,growx");
		
		// register a new pharmacy upon click of button "Register New Pharmacy"
		JButton btnRegisterNewPharmacy = new JButton("Register New Pharmacy");
		btnRegisterNewPharmacy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new RegisterNewPharmacy(user);
			}
		});
		btnRegisterNewPharmacy.setBackground(new Color(0, 153, 0));
		btnRegisterNewPharmacy.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnRegisterNewPharmacy, "cell 10 8,growx");
		
		JLabel lblNofitications = new JLabel("Nofitications:");
		lblNofitications.setFont(new Font("Tahoma", Font.ITALIC, 13));
		getContentPane().add(lblNofitications, "cell 10 10");
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < notificationmgmt.getAllNotificationsNHO().length ; i++)
			model.addElement(notificationmgmt.getAllNotificationsNHO()[i]);
		JList<String> myList = new JList<String>(model);
		JScrollPane scrollPane = new JScrollPane(myList);
		getContentPane().add(scrollPane, "cell 10 10, growx");
	}

}
