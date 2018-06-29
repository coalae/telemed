package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.User;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

import domainLogic.InvoiceMgmt;
import domainLogic.NotificationMgmt;

public class InsuranceMainPage extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private InvoiceMgmt invoiceMgmt;
	private NotificationMgmt notificationmgmt;

	/**
	 * Create the application.
	 */
	public InsuranceMainPage(User user) {
		this.user = user;
		this.invoiceMgmt = new InvoiceMgmt();
		setVisible(true);
		notificationmgmt = new NotificationMgmt(user);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setBackground(new Color(165, 42, 42));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnLogout, "cell 20 0");
		
		JLabel lblInsuranceMainPage = new JLabel("Insurance Main Page");
		lblInsuranceMainPage.setForeground(new Color(0, 0, 255));
		lblInsuranceMainPage.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblInsuranceMainPage, "cell 10 1,alignx center");
		
		// claim the insurance contribution from the patients by click on "Claim Insurance Contribution" button
		JButton btnClaimInsuranceContribution = new JButton("Claim Insurance Contribution");
		btnClaimInsuranceContribution.setBackground(new Color(0, 128, 0));
		btnClaimInsuranceContribution.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnClaimInsuranceContribution, "cell 10 4,growx");
		btnClaimInsuranceContribution.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				invoiceMgmt.addInsuranceContributionInvoiceForAllPatients(user);
				JOptionPane.showMessageDialog(null,
            		    "Insurance contribution will be claimed",
            		    "Create Insurance Information",
            		    JOptionPane.INFORMATION_MESSAGE); 
			}
		});
		
		JButton btnViewTransactionAccount = new JButton("View My Transactions");
		btnViewTransactionAccount.setBackground(new Color(0, 128, 0));
		btnViewTransactionAccount.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewTransactionAccount(user);
			}
		});
		btnViewTransactionAccount.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnViewTransactionAccount, "cell 10 6,growx");
		
		JLabel lblNotifications = new JLabel("Notifications:");
		lblNotifications.setFont(new Font("Tahoma", Font.ITALIC, 13));
		getContentPane().add(lblNotifications, "cell 10 9");
		
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < notificationmgmt.getAllNotificationsInsurance().length ; i++)
			model.addElement(notificationmgmt.getAllNotificationsInsurance()[i]);
		JList<String> myList = new JList<String>(model);
		JScrollPane scrollPane = new JScrollPane(myList);
		getContentPane().add(scrollPane, "cell 10 9, growx");
	}

}
