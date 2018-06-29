package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.MedicalRecord;
import telemed.PatientMonitoring;
import telemed.Prescription;
import telemed.User;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JMenuItem;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import domainLogic.ExportMgmt;
import domainLogic.MedicalRecordMgmt;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

/**
 * Patient views his personal Medical Records and can export the list of his personal Medical Records
 */
public class ViewPersonalMedicalRecords extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private JTable table;
	private MedicalRecordMgmt medicalRecordMgmt;
	private List<MedicalRecord> list;
	private ExportMgmt exportMgmt;

	/**
	 * Create the application.
	 */
	public ViewPersonalMedicalRecords(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		medicalRecordMgmt = new MedicalRecordMgmt();
		exportMgmt = new ExportMgmt();
		
		initialize();
	}

	/**
	 * Initialize the contents
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][][][][][][]", "[][][][grow][][][][][][][][][][]"));
		
		// logout upon click ofbutton "Logout" and set back to Login page
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
		
		JLabel lblMyMedicalRecords = new JLabel("My Medical Records");
		lblMyMedicalRecords.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMyMedicalRecords.setForeground(new Color(0, 0, 255));
		getContentPane().add(lblMyMedicalRecords, "cell 0 1 19 1,alignx center");
		
		
		// show the user's personal medical records in a table
		String tableTitle[] = {"Patient Id", "Doctor Id", "Price", "Medical Condition", "Description", "Date", "Record Id", "Prescription Info"};
		String data[][] = setTheDataInTheTable(); 
		DefaultTableModel model = new DefaultTableModel(data,tableTitle) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
		    public boolean isCellEditable(int row, int column) {
				return false;
		    }
		};
		table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 0 3 19 9,grow");
		
		// order prescription (medicatioN) if user clicks on a medical record row and selects yes to place the order
		table.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
				  
			        int row = table.getSelectedRow();
			        List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(row).getRecordId()).collect(Collectors.toList());
			        if (presList != null && presList.size() > 0 && !presList.get(0).isOrdered()) {
				        int reply = JOptionPane.showConfirmDialog(null, 
				        						"Do you really want to order now?", 
				        						"View Personal Medical Information", 
				        						JOptionPane.YES_NO_OPTION);
				        if (reply == JOptionPane.YES_OPTION) {
				        	medicalRecordMgmt.orderPrescription(presList.get(0));
				        	model.setValueAt("Ordered", row, 7);
				        }
				        
			        }
			  }
		});
		
		// export all personal medical records of the user if he clicks on "Export all"
		JButton buttonExport = new JButton("Export all as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
				
		JMenuItem mntmExportAsCSV = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCSV);
				
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XSLX");
		popupMenu.add(mntmExportAsXslx);
				
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list = medicalRecordMgmt.getMedicalRecordByPatientId(user.getId());
				if (list.size() != 0 ) {
					exportMgmt.exportMedicalRecordByPatientId(user.getId(), "XLSX");
				}else {
					JOptionPane.showMessageDialog(null,
		        		    "Sorry! There is no data available for export.",
		        		    "Export Error",
		        		    JOptionPane.ERROR_MESSAGE);
				}
			}
		});
				
		mntmExportAsCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list = medicalRecordMgmt.getMedicalRecordByPatientId(user.getId());
				if (list.size() != 0 ) {
					exportMgmt.exportMedicalRecordByPatientId(user.getId(), "CSV");
				}else {
					JOptionPane.showMessageDialog(null,
		        		    "Sorry! There is no data available for export.",
		        		    "Export Error",
		        		    JOptionPane.ERROR_MESSAGE);
				}
			}
		});						
		
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(buttonExport, "cell 11 13,growx");
		
		// go back to PatientMain page upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new PatientMain(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 18 13");
	}

	/** set the data to show in the table
	 * @return String[][]
	 */
	private String[][] setTheDataInTheTable(){
		list = medicalRecordMgmt.getMedicalRecordByPatientId(user.getId());
		String result[][] = new String[list.size()][8];
		for (int i = 0; i < list.size(); i++) {
			result[i][0] = list.get(i).getPatientId() + "";
			result[i][1] = list.get(i).getDoctorId() + "";
			result[i][2] = list.get(i).getPrice() + "";
			result[i][3] = list.get(i).getMedicalCondition().getName();
			result[i][4] = list.get(i).getDescription();
			Calendar date = list.get(i).getDate();
			result[i][5] = date.get(Calendar.YEAR) + "-" + date.get(Calendar.MONTH) + "-" + date.get(Calendar.DAY_OF_MONTH);
			result[i][6] = list.get(i).getRecordId() + "";
			final int index = i;
			List<Prescription> presList = medicalRecordMgmt.getAllPrescription().stream().filter(pred -> pred.getRecordId() == list.get(index).getRecordId()).collect(Collectors.toList());
			if (presList != null && presList.size() > 0)
				if (presList.get(0).isOrdered())
					result[i][7] = "Ordered";
				else
					result[i][7] = "Not Ordered";
			else
				result[i][7] = "No Prescription";
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
