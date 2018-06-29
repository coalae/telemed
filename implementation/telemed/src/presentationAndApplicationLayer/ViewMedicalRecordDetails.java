package presentationAndApplicationLayer;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import telemed.MedicalCondition;
import telemed.MedicalRecord;
import telemed.User;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import domainLogic.ExportMgmt;
import domainLogic.MedicalRecordMgmt;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;

/**
 * Display the detailed information on the selected Medical Record (from the list window)
 */
public class ViewMedicalRecordDetails extends JFrame{

	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private ExportMgmt exportMgmt;
	private MedicalRecordMgmt medicalRecordMgmt;
	private User user;
	private MedicalRecord medicalRecord;
	private JLabel lblMedicalRecordDetails, lblRecordId, lblPatientId, lblDoctorId, lblDiagnosis, lblPriceinEur, lblDate;
	private JTextField textFieldRecordId;
	private JTextField textFieldPatientId;
	private JTextField textFieldDoctorId;
	private JTextField textFieldPrice;
	private JTextField textFieldDate;
	private JComboBox comboBox;

	/**
	 * Create the application.
	 */
	public ViewMedicalRecordDetails(User user, int recordID) {
		setVisible(true);
		setResizable(false);
		medicalRecordMgmt = new MedicalRecordMgmt();
		exportMgmt = new ExportMgmt();
		medicalRecord = medicalRecordMgmt.getMedicalRecordByRecordId(recordID);
		this.user = user;
		initialize();
		addMedicalRecordDetails();
	}

	/**
	 * Initialize the contents
	 */
	private void initialize() {
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][grow][grow][][][][][][][][]", "[][][][][][][][][][][][][][][][][][]"));
		
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
		getContentPane().add(btnLogout, "cell 21 0");
		
		lblMedicalRecordDetails = new JLabel("Medical Record Details");
		lblMedicalRecordDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMedicalRecordDetails.setForeground(new Color(0, 0, 255));
		getContentPane().add(lblMedicalRecordDetails, "cell 12 1");
		
		lblRecordId = new JLabel("Record ID:");
		lblRecordId.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(lblRecordId, "cell 11 5,alignx trailing");
		
		textFieldRecordId = new JTextField();
		getContentPane().add(textFieldRecordId, "cell 12 5,growx");
		textFieldRecordId.setColumns(10);
		
		lblPatientId = new JLabel("Patient ID:");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPatientId, "cell 11 6,alignx trailing");
		
		textFieldPatientId = new JTextField();
		getContentPane().add(textFieldPatientId, "cell 12 6,growx");
		textFieldPatientId.setColumns(10);
		
		lblDoctorId = new JLabel("Doctor ID:");
		lblDoctorId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDoctorId, "cell 11 7,alignx trailing");
		
		textFieldDoctorId = new JTextField();
		getContentPane().add(textFieldDoctorId, "cell 12 7,growx");
		textFieldDoctorId.setColumns(10);
		
		lblDiagnosis = new JLabel("Medical Condition: ");
		lblDiagnosis.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDiagnosis, "cell 11 9,alignx trailing");
		
		comboBox = new JComboBox<MedicalCondition>();
		comboBox.setModel(new DefaultComboBoxModel<MedicalCondition>(MedicalCondition.values()));
		getContentPane().add(comboBox, "cell 12 9,growx");
		
		lblPriceinEur = new JLabel("Price (in EUR):");
		lblPriceinEur.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblPriceinEur, "cell 11 10,alignx trailing");
		
		textFieldPrice = new JTextField();
		getContentPane().add(textFieldPrice, "cell 12 10,growx");
		textFieldPrice.setColumns(10);
		
		lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDate, "cell 11 11,alignx trailing");
		
		// save changes to the medical record upon click of "Save Change"
		JButton btnSaveChange = new JButton("Save Change");
		btnSaveChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				medicalRecord.setMedicalCondition(MedicalCondition.getByName(comboBox.getSelectedItem().toString()));
				medicalRecordMgmt.modifyMedicalRecord(medicalRecord);
				setVisible(false);
				new ViewAllMedicalRecords(user);
			}
		});
		
		textFieldDate = new JTextField();
		getContentPane().add(textFieldDate, "cell 12 11,growx");
		textFieldDate.setColumns(10);
		btnSaveChange.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSaveChange.setBackground(new Color(0, 153, 51));
		getContentPane().add(btnSaveChange, "cell 12 14,growx");
		
		JButton buttonExport = new JButton("Export as...");
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(buttonExport, popupMenu);
				
		JMenuItem mntmExportAsCSV = new JMenuItem("Export as CSV");
		popupMenu.add(mntmExportAsCSV);
				
		JMenuItem mntmExportAsXslx = new JMenuItem("Export as XSLX");
		popupMenu.add(mntmExportAsXslx);
		
		JMenuItem mntmExportAsJpg= new JMenuItem("Export as JPG");
		popupMenu.add(mntmExportAsJpg);
				
		mntmExportAsXslx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportMedicalRecordByRecordId(medicalRecord.getRecordId(), "XLSX", null);
			}
		});
				
		mntmExportAsCSV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportMedicalRecordByRecordId(medicalRecord.getRecordId(), "CSV", null);
			}
		});
		
		mntmExportAsJpg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exportMgmt.exportMedicalRecordByRecordId(medicalRecord.getRecordId(), "JPG", new Rectangle( lblMedicalRecordDetails.getX() - 35, lblMedicalRecordDetails.getY() + 120, getContentPane().getWidth() - 200, getContentPane().getHeight() - 195 ));

			}
		});
				
		buttonExport.setBackground(new Color(0, 153, 0));
		buttonExport.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(buttonExport, "cell 12 16,growx");
		
		// go back to the view all medical records page upon click of button "Back"
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new ViewAllMedicalRecords(user);
			}
		});
		
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 21 16");
	}
	
	/**
	 * adds details to the medical record
	 */
	private void addMedicalRecordDetails() {
		

		textFieldRecordId.setText(medicalRecord.getRecordId() + "");
		textFieldRecordId.setEditable(false);
		textFieldPatientId.setText(medicalRecord.getPatientId() + "");
		textFieldPatientId.setEditable(false);
		textFieldDoctorId.setText(medicalRecord.getDoctorId() +"");
		textFieldDoctorId.setEditable(false);
		textFieldPrice.setText(medicalRecord.getPrice() + "");
		textFieldPrice.setEditable(false);
		Calendar date = medicalRecord.getDate();
		textFieldDate.setText(date.get(Calendar.DAY_OF_MONTH)+"."+date.get(Calendar.MONTH)+"."+date.get(Calendar.YEAR));
		textFieldDate.setEditable(false);
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
