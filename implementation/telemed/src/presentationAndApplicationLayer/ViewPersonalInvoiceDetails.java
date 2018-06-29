package presentationAndApplicationLayer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import java.awt.Rectangle;
import telemed.Invoice;
import telemed.User;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;

import domainLogic.ExportMgmt;
import domainLogic.InvoiceMgmt;
import domainLogic.UserMgmt;
import javax.swing.JToggleButton;
import java.awt.Choice;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.HierarchyEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class ViewPersonalInvoiceDetails extends JFrame {

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private InvoiceMgmt invoicemgmt;
	private UserMgmt userMgmt;
	private ExportMgmt exportMgmt;
	private int invoiceId;
	private Invoice invoice;
	private JTextField textFieldInvoiceId, textFieldInvoiceDate, textFieldInvoiceDueDate, textFieldInvoicePrice, textFieldInvoiceCreditorId, textFieldInvoiceCreditorType, textFieldInvoiceCreditorUsername, textFieldInvoiceTopic, textFieldInvoicePaymentDate;

	/**
	 * Create the application.
	 */
	public ViewPersonalInvoiceDetails(User user, int invoiceId) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		this.invoicemgmt = new InvoiceMgmt();
		this.userMgmt = new UserMgmt();
		this.exportMgmt = new ExportMgmt();
		this.invoiceId = invoiceId;
		this.invoice = invoicemgmt.getInvoiceByInvoiceId(invoiceId);
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
		textFieldInvoiceDueDate.setText(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH) + "");
		textFieldInvoiceDueDate.setEditable(false);
		textFieldInvoicePrice.setText(invoice.getPrice()+ "");
		textFieldInvoicePrice.setEditable(false);
		textFieldInvoiceCreditorId.setText(invoice.getCreditorId()+ "");
		textFieldInvoiceCreditorId.setEditable(false);
		textFieldInvoiceCreditorType.setText(userMgmt.getUserType(invoice.getCreditorId()) + "");
		textFieldInvoiceCreditorType.setEditable(false);
		textFieldInvoiceCreditorUsername.setText(userMgmt.getUserById(invoice.getCreditorId()).getUsername() + "");
		textFieldInvoiceCreditorUsername.setEditable(false);
		textFieldInvoiceTopic.setText(invoice.getTopic() + "");
		textFieldInvoiceTopic.setEditable(false);
		setPaymentDate();
	}

	private void setPaymentDate() {
		if(invoice.isPaid()) {
			Calendar date = invoice.getPaidDate();
			textFieldInvoicePaymentDate.setText(date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH) + "");
		}
		else
			textFieldInvoicePaymentDate.setText("Not paid yet" + "");
		textFieldInvoicePaymentDate.setEditable(false);		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][grow][][][grow][][][][][]", "[][][][][][][][][][][][][][][][]"));
		
		JButton btnLgout = new JButton("Logout");
		btnLgout.setBackground(new Color(128, 0, 0));
		btnLgout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnLgout, "cell 17 0");
		btnLgout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		getContentPane().add(btnLgout, "cell 13 0");
		
		JLabel lblInvoiceDetails = new JLabel("Invoice Details");
		lblInvoiceDetails.setForeground(Color.BLUE);
		lblInvoiceDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblInvoiceDetails, "cell 9 1");
		
		JLabel lblInvoiceid = new JLabel("Invoice ID: ");
		getContentPane().add(lblInvoiceid, "cell 9 5");
		
		textFieldInvoiceId = new JTextField();
		getContentPane().add(textFieldInvoiceId, "cell 12 5,growx");
		textFieldInvoiceId.setColumns(13);
		
		JLabel lblInvoiceDate = new JLabel("Invoice Date:");
		getContentPane().add(lblInvoiceDate, "cell 9 6");
		
		textFieldInvoiceDate = new JTextField();
		getContentPane().add(textFieldInvoiceDate, "cell 12 6,growx");
		textFieldInvoiceDate.setColumns(13);
		
		JLabel lblDueDate = new JLabel("Due Date:");
		getContentPane().add(lblDueDate, "cell 9 7");
		
		textFieldInvoiceDueDate = new JTextField();
		getContentPane().add(textFieldInvoiceDueDate, "cell 12 7,growx");
		textFieldInvoiceDueDate.setColumns(13);
		
		JLabel lblPrice = new JLabel("Price:");
		getContentPane().add(lblPrice, "cell 9 8");
		
		textFieldInvoicePrice = new JTextField();
		getContentPane().add(textFieldInvoicePrice, "cell 12 8,growx");
		textFieldInvoicePrice.setColumns(13);
		
		JLabel lblCreditorid = new JLabel("CreditorID:");
		getContentPane().add(lblCreditorid, "cell 9 9");
		
		textFieldInvoiceCreditorId = new JTextField();
		getContentPane().add(textFieldInvoiceCreditorId, "cell 12 9,growx");
		textFieldInvoiceCreditorId.setColumns(13);
		
		JLabel lblCreditorType = new JLabel("Creditor Type:");
		getContentPane().add(lblCreditorType, "cell 9 10");
		
		textFieldInvoiceCreditorType = new JTextField();
		getContentPane().add(textFieldInvoiceCreditorType, "cell 12 10,growx");
		textFieldInvoiceCreditorType.setColumns(13);
		
		JLabel lblCreditorUsername = new JLabel("Creditor Username:");
		getContentPane().add(lblCreditorUsername, "cell 9 11");
		
		textFieldInvoiceCreditorUsername = new JTextField();
		getContentPane().add(textFieldInvoiceCreditorUsername, "cell 12 11,growx");
		textFieldInvoiceCreditorUsername.setColumns(13);
		
		JLabel lblTopic = new JLabel("Topic:");
		getContentPane().add(lblTopic, "cell 9 12");
		
		textFieldInvoiceTopic = new JTextField();
		getContentPane().add(textFieldInvoiceTopic, "cell 12 12,growx");
		textFieldInvoiceTopic.setColumns(13);
		
		JLabel lblPaymentDate = new JLabel("Payment Date:");
		getContentPane().add(lblPaymentDate, "cell 9 13");
		
		textFieldInvoicePaymentDate = new JTextField();
		getContentPane().add(textFieldInvoicePaymentDate, "cell 12 13,growx");
		textFieldInvoicePaymentDate.setColumns(13);
		
		JButton btnPayInvoice = new JButton("Pay Invoice");
		getContentPane().add(btnPayInvoice, "cell 9 15,growx");
		btnPayInvoice.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				invoicemgmt.payInvoice(invoiceId);
				JOptionPane.showMessageDialog(null,
            		    "Payment for the selected invoice was completed.",
            		    "Invoice Payment Information",
            		    JOptionPane.INFORMATION_MESSAGE); 
			}
			
		});
		
		JButton buttonExport = new JButton("Export as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
		
		JMenuItem mntmExportAsCsv = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCsv);
		
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XLSX");
		popupMenu.add(mntmExportAsXslx);
		
		JMenuItem mntmExportAsJPG = new JMenuItem("Export as JPG");
		popupMenu.add(mntmExportAsJPG);
		
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByInvoiceId(invoiceId, "XLSX", null);
			}
		});
		mntmExportAsCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByInvoiceId(invoiceId, "CSV", null);
			}
		});
		mntmExportAsJPG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByInvoiceId(invoiceId, "JPG", new Rectangle( lblInvoiceDetails.getX() + 70, lblInvoiceDetails.getY() + 115, getContentPane().getWidth() - 110, getContentPane().getHeight() - 115 ));
			}
		});
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(buttonExport, "cell 12 15,growx");	
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PatientMain(user);
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 13 15");
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if ( e.getButton() == 1 ){ // 1-left, 2-middle, 3-right button
					showMenu(e);
	            }
			}
			public void mouseReleased(MouseEvent e) {
				if ( e.getButton() == 1 ){ // 1-left, 2-middle, 3-right button
					showMenu(e);
	            }
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
