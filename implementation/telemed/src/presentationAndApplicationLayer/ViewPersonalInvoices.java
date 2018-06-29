package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Invoice;
import telemed.Prescription;
import telemed.User;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import domainLogic.ExportMgmt;
import domainLogic.InvoiceMgmt;
import domainLogic.UserMgmt;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

/**
 * Patient views his personal Invoices and can export the list of Invoices
 */
public class ViewPersonalInvoices extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private User user;
	//private List <Invoice> invoices;
	private InvoiceMgmt invoiceMgmt;
	private UserMgmt userMgmt;
	private ExportMgmt exportMgmt;
	
	/**
	 * Create the application.
	 */
	public ViewPersonalInvoices(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		this.invoiceMgmt = new InvoiceMgmt();
		this.userMgmt = new UserMgmt();
		this.exportMgmt = new ExportMgmt();
		initialize();
	}

	/**
	 * Initialize the contents 
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][][][][][][][][][][][][][]", "[][][][grow][][][][][][][][][][][]"));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 0, 0));
		getContentPane().add(btnLogout, "cell 25 0");
		
		JLabel lblMyInvoices = new JLabel("My Invoices");
		lblMyInvoices.setForeground(new Color(0, 0, 255));
		lblMyInvoices.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblMyInvoices, "cell 11 1,alignx center");
		
		createTable();
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PatientMain(user);
			}
		});
		
		JButton buttonExport = new JButton("Export as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
		
		JMenuItem mntmExportAsCsv = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCsv);
		
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XLSX");
		popupMenu.add(mntmExportAsXslx);
		
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByPatientId(user.getId(), "XLSX");
			}
		});
		mntmExportAsCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByPatientId(user.getId(), "CSV");
			}
		});
		buttonExport.setBackground(new Color(0, 153, 51));
		buttonExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(buttonExport, "cell 24 14,growx");	
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnNewButton, "cell 25 14");
		
	}
	
	private void createTable() {
		String tableTitle[] = {"Invoice Id", "Patient Id", "Invoice Date", "Due Date", "Price", "Creditor Id", "Creditor Type", "Topic", "Payment Date"};
		String data[][] = fillTheTable(); 
		DefaultTableModel model = new DefaultTableModel(data,tableTitle) {
			private static final long serialVersionUID = 1L;

			@Override
		    public boolean isCellEditable(int row, int column) {
				return false;
		    }
		};
		table = new JTable(model);
		table.setFillsViewportHeight(true);
		table.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {

			        int row = table.getSelectedRow();
			        int invoiceId = Integer.parseInt((String)model.getValueAt(row, 0));
			        
			        setVisible(false);
			        new ViewPersonalInvoiceDetails(user, invoiceId);
			  }
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 0 3 26 10,grow");
	}
	
	private String[][] fillTheTable(){
		List <Invoice> invoices = invoiceMgmt.getInvoiceByPatientId(user.getId());
		
		String result[][] = new String[invoices.size()][9];
		for (int i = 0; i < invoices.size(); i++) {
			result[i][0] = invoices.get(i).getInvoiceID() + "";
			result[i][1] = invoices.get(i).getPatientId() + "";
			Calendar date = invoices.get(i).getInvoiceDate();
			result[i][2] = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			date = invoices.get(i).getDueDate();
			result[i][3] = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			result[i][4] = invoices.get(i).getPrice() + "";
			result[i][5] = invoices.get(i).getCreditorId() + "";
			result[i][6] = userMgmt.getUserType(invoices.get(i).getCreditorId()) + "";
			result[i][7] = invoices.get(i).getTopic() + "";
			if (invoices.get(i).isPaid()) {
				date = invoices.get(i).getPaidDate();
				result[i][8] = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			}
			else
					result[i][8] = "Not paid yet";
		}
		
		return result;
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
