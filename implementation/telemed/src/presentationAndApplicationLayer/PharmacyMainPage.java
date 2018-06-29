package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.User;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

import domainLogic.NotificationMgmt;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Main Menu Page for the Pharmacy (user), which displays the available functionality for the Pharmacy.
 */
public class PharmacyMainPage extends JFrame{


	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private NotificationMgmt notificationmgmt;

	/**
	 * Create the application.
	 */
	public PharmacyMainPage(User user) {
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
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 51, 0));
		getContentPane().add(btnLogout, "cell 21 0");
		
		JLabel lblPharmacyMainPage = new JLabel("Pharmacy Main Page");
		lblPharmacyMainPage.setForeground(new Color(0, 0, 255));
		lblPharmacyMainPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblPharmacyMainPage, "cell 12 1,alignx center");
		
		JLabel lblYouAreLogged = new JLabel("You are logged in as: ");
		lblYouAreLogged.setFont(new Font("Tahoma", Font.ITALIC, 12));
		getContentPane().add(lblYouAreLogged, "cell 12 2,alignx center");
		
		// show transaction (invoices for which payment has already been received) main page
		JButton btnViewTransactionAccount = new JButton("View Transaction Account");
		btnViewTransactionAccount.setBackground(new Color(0, 153, 51));
		btnViewTransactionAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewTransactionAccount, "cell 12 5");
		btnViewTransactionAccount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewTransactionAccount(user);
			}
		});
		
		JLabel lblNotifications = new JLabel("Notifications:");
		lblNotifications.setFont(new Font("Tahoma", Font.ITALIC, 13));
		getContentPane().add(lblNotifications, "cell 12 8");
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < notificationmgmt.getAllNotificationsPharmacy().length ; i++)
			model.addElement(notificationmgmt.getAllNotificationsPharmacy()[i]);
		JList<String> myList = new JList<String>(model);
		JScrollPane scrollPane = new JScrollPane(myList);
		getContentPane().add(scrollPane, "cell 12 18, growx");	
	}

}
