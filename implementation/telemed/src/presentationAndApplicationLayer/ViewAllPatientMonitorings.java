package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.PatientMonitoring;
import telemed.User;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import domainLogic.PatientMonitoringMgmt;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;

/**
 * Display the list of Patient Monitoring items (role info: done by Doctor)
 */
public class ViewAllPatientMonitorings extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private JTable table;
	private User user;
	private PatientMonitoringMgmt patientMonitoringMgmt;
	private List<PatientMonitoring> patientMonitoringList;
	
	/**
	 * Create the application.
	 */
	public ViewAllPatientMonitorings(User user) {
		setVisible(true);
		setResizable(false);
		this.user = user;
		patientMonitoringMgmt = new PatientMonitoringMgmt();
		initialize();
	}

	/**
	 * Initialize the contents  
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][grow][][][][][][][][][][][][][][][][][][]", "[][][][grow][][][][][][][][][][]"));
		
		// logout upon click of the button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setBackground(new Color(153, 0, 0));
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnLogout, "cell 19 0");
		
		JLabel lblPatientMonitoringList = new JLabel("Remote Patient Monitoring List");
		lblPatientMonitoringList.setForeground(new Color(0, 0, 255));
		lblPatientMonitoringList.setBackground(new Color(0, 0, 255));
		lblPatientMonitoringList.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblPatientMonitoringList, "cell 11 1,alignx center");
		
		// generate the table of PatientMonitoring items
		String tableTitle[] = {"Monitoring Id", "Patient Id", "Category", "Date", "Risk Perception", "Treated", "Device Id"};
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
		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane, "cell 1 3 19 9,grow");

		// select an item from the list of patient monitorings and create a medical record for it
		JButton btnCreateMedicalRecord = new JButton("Create Medical Record for selected item");
		btnCreateMedicalRecord.setEnabled(false);
		table.addMouseListener(new MouseAdapter() {
			  public void mouseClicked(MouseEvent e) {
				  if(!table.getSelectionModel().isSelectionEmpty())
					  btnCreateMedicalRecord.setEnabled(true);
			  }
		});
		
		
		btnCreateMedicalRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				
				int monitoringId = Integer.parseInt(model.getValueAt(table.getSelectedRow(), 0).toString());
				PatientMonitoring monitoring = patientMonitoringMgmt.getAllPatientMonitoring().stream().filter(mon -> mon.getMonitoringId() == monitoringId).findAny().orElse(null);
				
				new CreateMedicalRecordFromPatientMonitoring(user, monitoring);
			}
		});
		btnCreateMedicalRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreateMedicalRecord.setBackground(new Color(0, 153, 51));
		getContentPane().add(btnCreateMedicalRecord, "cell 11 13");
		
		// go back to the DoctorMainPage upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new DoctorMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 19 13");
	}
	
	/** set the patientmonitoring data in the table to be showed to the doctor user 
	 * (i.e. show all patient monitoring items, which were not market as "treated" previously by some doctor)
	 * @return String[][]
	 */
	private String[][] setTheDataInTheTable(){
		patientMonitoringList= patientMonitoringMgmt.getAllPatientMonitoring().stream().filter(pM -> !pM.isTreated()).collect(Collectors.toList());
		String patientMonitorings[][] = new String[patientMonitoringList.size()][7];
		for(int i = 0; i < patientMonitoringList.size(); i++) {
			if(!patientMonitoringList.get(i).isTreated()) {
				patientMonitorings[i][0] = patientMonitoringList.get(i).getMonitoringId() + "";
				patientMonitorings[i][1] = patientMonitoringList.get(i).getPatientId() + "";
				patientMonitorings[i][2] = patientMonitoringList.get(i).getCategory().getName();
				Calendar date = patientMonitoringList.get(i).getDate();
				patientMonitorings[i][3] = date.get(Calendar.DAY_OF_MONTH) + "." + date.get(Calendar.MONTH) + "." + date.get(Calendar.YEAR);
				patientMonitorings[i][4] = patientMonitoringList.get(i).getRiskPerception().getName();
				patientMonitorings[i][5] = String.valueOf(patientMonitoringList.get(i).isTreated());
				patientMonitorings[i][6] = patientMonitoringList.get(i).getDeviceId() + "";
			}
		}
		return patientMonitorings;
	}

}
