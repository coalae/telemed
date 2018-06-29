package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Invoice;
import telemed.User;

import javax.swing.JLabel;
import javax.swing.JTextField;

import domainLogic.InvoiceMgmt;
import domainLogic.UserMgmt;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

/**
 * View detailed information on a specific transaction (i.e. paid Invoice) from the transactions list
 */

public class ViewTransactionDetails extends JFrame{


	/**
	 * serialization UID
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private InvoiceMgmt invoiceMgmt;
	private UserMgmt userMgmt;
	private Invoice invoice;
	private JTextField textFieldInvoiceId, textFieldPatientId, textFieldPatientName, textFieldInvoiceDate, textFieldDueDae, textFieldTopic, textFieldInvoicePrice, textFieldPaymentDate; 
	/**
	 * Create the application.
	 */
	public ViewTransactionDetails(User user, int invoiceId) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		this.invoiceMgmt = new InvoiceMgmt();
		this.userMgmt = new UserMgmt();
		this.invoice = invoiceMgmt.getInvoiceByInvoiceId(invoiceId);
		initialize();
		addInvoiceDetails();
	}

	private void addInvoiceDetails() {
		textFieldInvoiceId.setText(invoice.getInvoiceID() + "");
		textFieldInvoiceId.setEditable(false);
		Calendar date = invoice.getInvoiceDate();
		textFieldInvoiceDate.setText(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH) + "");
		textFieldInvoiceDate.setEditable(false);
		date = invoice.getDueDate();
		textFieldDueDae.setText(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH) + "");
		textFieldDueDae.setEditable(false);
		textFieldInvoicePrice.setText(invoice.getPrice()+ "");
		textFieldInvoicePrice.setEditable(false);
		textFieldPatientId.setText(invoice.getPatientId()+ "");
		textFieldPatientId.setEditable(false);
		textFieldPatientName.setText(userMgmt.getUserById(invoice.getPatientId()).getUsername() + "");
		textFieldTopic.setText(invoice.getTopic() + "");
		textFieldTopic.setEditable(false);
		setPaymentDate();
	}

	private void setPaymentDate() {
		if(invoice.isPaid()) {
			Calendar date = invoice.getPaidDate();
			textFieldPaymentDate.setText(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH) + "");
		}
		else
			textFieldPaymentDate.setText("Not paid yet" + "");
		textFieldPaymentDate.setEditable(false);	
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][]", "[][][][][][][][][][][][][][][][]"));
		
		JButton btnLgout = new JButton("Logout");
		btnLgout.setBackground(new Color(153, 0, 0));
		btnLgout.setForeground(new Color(0, 0, 0));
		btnLgout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLgout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		getContentPane().add(btnLgout, "cell 13 0");
		
		JLabel lblTransactionDetails = new JLabel("Transaction Details");
		lblTransactionDetails.setForeground(new Color(0, 0, 255));
		lblTransactionDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblTransactionDetails, "cell 7 1,alignx center");
		
//		JLabel lblTransactionXx = new JLabel("Transaction xx");
//		lblTransactionXx.setForeground(new Color(0, 0, 153));
//		lblTransactionXx.setFont(new Font("Tahoma", Font.ITALIC, 14));
//		getContentPane().add(lblTransactionXx, "cell 7 3,alignx center");
		
		JLabel lblInvoiceId = new JLabel("Invoice ID: ");
		lblInvoiceId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblInvoiceId, "cell 6 5");
		
		textFieldInvoiceId = new JTextField();
		getContentPane().add(textFieldInvoiceId, "cell 12 5,growx");
		textFieldInvoiceId.setColumns(13);
		
		JLabel lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPatientId, "cell 6 6");
		
		textFieldPatientId = new JTextField();
		getContentPane().add(textFieldPatientId, "cell 12 6,growx");
		textFieldPatientId.setColumns(13);
		
		JLabel lblNewLabel = new JLabel("Patient name: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblNewLabel, "cell 6 7");
		
		textFieldPatientName = new JTextField();
		getContentPane().add(textFieldPatientName, "cell 12 7,growx");
		textFieldPatientName.setColumns(13);
		

		JLabel lblInvoiceDate = new JLabel("Invoice Date: ");
		lblInvoiceDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblInvoiceDate, "cell 6 8");
		
		textFieldInvoiceDate = new JTextField();
		getContentPane().add(textFieldInvoiceDate, "cell 12 8,growx");
		textFieldInvoiceDate.setColumns(13);
		
		JLabel lblDueDate = new JLabel("Invoice Due Date: ");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDueDate, "cell 6 9");
		
		textFieldDueDae = new JTextField();
		getContentPane().add(textFieldDueDae, "cell 12 9,growx");
		textFieldDueDae.setColumns(13);
		
		JLabel lblTopic = new JLabel("Topic");
		lblTopic.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblTopic, "cell 6 10");
		
		textFieldTopic = new JTextField();
		getContentPane().add(textFieldTopic, "cell 12 10,growx");
		textFieldTopic.setColumns(13);
		
		JLabel lblPriceinEur = new JLabel("Price (in EUR)");
		lblPriceinEur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPriceinEur, "cell 6 11");
		
		textFieldInvoicePrice = new JTextField();
		getContentPane().add(textFieldInvoicePrice, "cell 12 11,growx");
		textFieldInvoicePrice.setColumns(13);
		
		JLabel lblPaidDate = new JLabel("Date of payment: ");
		lblPaidDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPaidDate, "cell 6 12");
		
		textFieldPaymentDate = new JTextField();
		getContentPane().add(textFieldPaymentDate, "cell 12 12,growx");
		textFieldPaymentDate.setColumns(13);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewTransactionAccount(user);
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 13 15,growx");
	}

}
