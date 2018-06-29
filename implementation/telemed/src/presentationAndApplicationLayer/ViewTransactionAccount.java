package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.Invoice;
import telemed.User;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JButton;
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
import java.awt.event.ActionEvent;


/**
 * View the list of transactions (i.e. Invoices paid to the respective User group (NHO, Doctor or Pharmacy)
 */
public class ViewTransactionAccount extends JFrame{

	/**
	 * serialization UID
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private User user;
	private InvoiceMgmt invoiceMgmt;
	private JButton btnNewButton;
	private ExportMgmt exportMgmt;
	private UserMgmt userMgmt;


	/**
	 * Create the application.
	 */
	public ViewTransactionAccount(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		this.invoiceMgmt = new InvoiceMgmt();
		this.exportMgmt = new ExportMgmt();
		this.userMgmt = new UserMgmt();
		initialize();
	}

	/**
	 * Initialize the contents of the 
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][grow][][][]", "[][][][][][][][][grow][]"));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 0, 0));
		getContentPane().add(btnLogout, "cell 12 0,growx");
		
		JLabel lblMyTransactionAccount = new JLabel("My Transaction Account");
		lblMyTransactionAccount.setForeground(new Color(0, 51, 255));
		lblMyTransactionAccount.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblMyTransactionAccount, "cell 3 1 2 1,alignx center");
		
		createTable();
//		JScrollPane scrollPane = new JScrollPane();
//		getContentPane().add(scrollPane, "cell 1 3 6 6,grow");
//		
//		table = new JTable();
//		scrollPane.setColumnHeaderView(table);
		
		// go back to Main page upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
					if(userMgmt.getUserType(user.getId()).equals("Doctor"))
						new DoctorMainPage(user);
					else if(userMgmt.getUserType(user.getId()).equals("Pharmacy"))
						new PharmacyMainPage(user);
					else if(userMgmt.getUserType(user.getId()).equals("Insurance"))
						new InsuranceMainPage(user);
				}
			});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 9 0");
		
		JButton buttonExport = new JButton("Export as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
		
		JMenuItem mntmExportAsCsv = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCsv);
		
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XLSX");
		popupMenu.add(mntmExportAsXslx);
		
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByCreditorId(user.getId(), "XLSX");
			}
		});
		mntmExportAsCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportInvoiceByCreditorId(user.getId(), "CSV");
			}
		});
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(buttonExport, "cell 12 13,growx");
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnNewButton_1, "cell 7 9,growx");
	}
	
	private void createTable() {
		String tableTitle[] = {"Invoice Id", "Patient Id", "Invoice Date", "Due Date", "Price", "Topic", "Payment Date"};
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
			        new ViewTransactionDetails(user, invoiceId);
			  }
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 0 3 20 10,grow");
	}
	
	private String[][] fillTheTable(){
		List <Invoice> invoices = invoiceMgmt.getInvoiceByCreditorId(user.getId());
		
		String result[][] = new String[invoices.size()][7];
		for (int i = 0; i < invoices.size(); i++) {
			result[i][0] = invoices.get(i).getInvoiceID() + "";
			result[i][1] = invoices.get(i).getPatientId() + "";
			Calendar date = invoices.get(i).getInvoiceDate();
			result[i][2] = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			date = invoices.get(i).getDueDate();
			result[i][3] = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			result[i][4] = invoices.get(i).getPrice() + "";
			result[i][5] = invoices.get(i).getTopic() + "";
			if (invoices.get(i).isPaid()) {
				date = invoices.get(i).getPaidDate();
				result[i][6] = "Paid on " + date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			}
			else
					result[i][6] = "Not paid yet";
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
