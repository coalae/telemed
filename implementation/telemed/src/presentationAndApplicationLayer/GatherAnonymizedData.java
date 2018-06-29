package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.AnonymizedDataQuery;
import telemed.Gender;
import telemed.User;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import domainLogic.ExportMgmt;
import domainLogic.MedicalRecordMgmt;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

/**
 * Gather anonymized data on medical records and patients (role info: done by the NHO only)
 */
public class GatherAnonymizedData extends JFrame{

	
	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private User user;
	private String type;
	private Gender gender;
	private int birthyear;
	private ArrayList<AnonymizedDataQuery> anonymizedList;
	private MedicalRecordMgmt medicalRecordMgmt;
	private ExportMgmt exportMgmt;

	/**
	 * Create the application.
	 */
	public GatherAnonymizedData(User user, Gender gender, int birthyear) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		medicalRecordMgmt = new MedicalRecordMgmt();
		exportMgmt = new ExportMgmt();
		if (birthyear == -1){
			anonymizedList = medicalRecordMgmt.getAnonymizedMedicalDataByGender(gender);
			this.type = "gender";
			this.gender = gender;
		}
		else{
			anonymizedList = medicalRecordMgmt.getAnonymizedMedicalDataByYearOfBirth(birthyear);
			this.type = "birthyear";
			this.birthyear = birthyear;
		}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][grow][][][][][][][][][][][][][][][][][][][]", "[][][][grow][][][][][][][][][][]"));
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnLogout, "cell 21 0");
		
		// get anonymized data report 
		JLabel lblAnonymizedDataReport = new JLabel("Anonymized Data Collection");
		lblAnonymizedDataReport.setForeground(new Color(0, 0, 255));
		lblAnonymizedDataReport.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblAnonymizedDataReport, "cell 12 1");
		
		
		String tableTitle[] = {"Gender", "Year of Birth", "Medical Condition", "Height", "Weight", "City"};
		String data[][] = setTheDataInTheTable(); 
		DefaultTableModel model = new DefaultTableModel(data,tableTitle);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 0 3 22 9,grow");
		
		// export anonymized data
		JButton buttonExport = new JButton("Export as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
		
		JMenuItem mntmExportAsCSV = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCSV);
		
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XSLX");
		popupMenu.add(mntmExportAsXslx);
		
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (type.equals("gender"))
					exportMgmt.exportAnonymizedDataQueryByGender(gender, "XLSX");
				else exportMgmt.exportAnonymizedDataQueryByYearOfBirth(birthyear, "XLSX");
			}
		});
		
		mntmExportAsCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (type.equals("gender"))
					exportMgmt.exportAnonymizedDataQueryByGender(gender, "CSV"); 
				else exportMgmt.exportAnonymizedDataQueryByYearOfBirth(birthyear, "CSV");
			}
		});
		
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(buttonExport, "cell 12 13,growx");
		
		
		// go back to NHOMainPage upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new NHOMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 21 13");
		
	}

	/**
	 * set data in table to be showed
	 * @return String[][]
	 */
	private String[][] setTheDataInTheTable() {
		String[][] list = new String[anonymizedList.size()][6];
		for (int i = 0; i < anonymizedList.size(); i++) {
			list[i][0] = anonymizedList.get(i).getGender().getName();
			list[i][1] = anonymizedList.get(i).getBirthYear() + "";
			list[i][2] = anonymizedList.get(i).getMedicalCondition().getName();
			list[i][3] = anonymizedList.get(i).getHeight() + "";
			list[i][4] = anonymizedList.get(i).getWeight() + "";
			list[i][5] = anonymizedList.get(i).getCity();
		}
		return list;
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
