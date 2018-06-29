package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.MedicalRecord;
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
import domainLogic.MedicalRecordMgmt;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.List;
import java.awt.event.ActionEvent;

/**
 * View the list of Medical Records
 */
public class ViewAllMedicalRecords extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private User user;
	private MedicalRecordMgmt medicalRecordMgmt;
	private ExportMgmt exportMgmt;
	

	/**
	 * Create the application.
	 */
	public ViewAllMedicalRecords(User user) {
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
		getContentPane().setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][][][][][][][][][][]", "[][][][grow][][][][][][][][][][][]"));
		
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
		getContentPane().add(btnLogout, "cell 22 0");
		
		JLabel lblListOfMedical = new JLabel("List of Medical Records");
		lblListOfMedical.setForeground(new Color(0, 0, 255));
		lblListOfMedical.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblListOfMedical, "cell 13 1,growx");
		
		// show table of Medical Records
		String tableTitle[] = {"Record ID","Patient ID", "Medical Condition", "Date of Record"};
		String data[][] = setTheDataInTheTable();
		
		
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
			        //int col = table.getSelectedColumn();
			        int recordID = Integer.parseInt((String)model.getValueAt(row, 0));
			        
			        setVisible(false);
			        new ViewMedicalRecordDetails(user, recordID);
			  }
		});
		
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 0 3 23 10,grow");
		
		// export all medical records listed upon click of "Export all"
		JButton buttonExport = new JButton("Export all as...");
				
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
				
		JMenuItem mntmExportAsCSV = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCSV);
				
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XSLX");
		popupMenu.add(mntmExportAsXslx);
				
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportMedicalRecordByDoctorId(user.getId(), "XLSX");
			}
		});
				
		mntmExportAsCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportMedicalRecordByDoctorId(user.getId(), "CSV");
			}
		});
				
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(buttonExport, "cell 13 14,growx");
		
		// go back to DoctorMainPage upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new DoctorMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 22 14");
	}
	
	
	/**
	 * set the medicalrecord data in the table
	 * @return String[][]
	 */
	private String[][] setTheDataInTheTable(){
		
		
		List<MedicalRecord> medicalRecordsList = medicalRecordMgmt.getAllMedicalRecords();
		String medicalRecordData[][] = new String[medicalRecordsList.size()][4];
		for (int i = 0; i < medicalRecordsList.size(); i++) {
			// doctor who is currently logged in can only see medical record which have his doctorId
			if(medicalRecordsList.get(i).getDoctorId() == user.getId()) { 
				medicalRecordData[i][0] = medicalRecordsList.get(i).getRecordId() + "";
				medicalRecordData[i][1] = medicalRecordsList.get(i).getPatientId() + "";
				medicalRecordData[i][2] = medicalRecordsList.get(i).getMedicalCondition().getName();
				Calendar medicalRecordDate = medicalRecordsList.get(i).getDate();
				medicalRecordData[i][3] = medicalRecordDate.get(Calendar.DAY_OF_MONTH) + "." + 
											medicalRecordDate.get(Calendar.MONTH) + "." + medicalRecordDate.get(Calendar.YEAR);
			}
		}
		return medicalRecordData;
		
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