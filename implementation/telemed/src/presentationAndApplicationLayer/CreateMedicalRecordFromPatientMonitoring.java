package presentationAndApplicationLayer;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import domainLogic.DeviceMgmt;
import domainLogic.InvoiceMgmt;
import domainLogic.MedicalRecordMgmt;
import domainLogic.PatientMonitoringMgmt;
import domainLogic.UserMgmt;
import telemed.DeviceType;
import telemed.MedicalCondition;
import telemed.Patient;
import telemed.PatientMonitoring;
import telemed.RiskPerception;
import telemed.User;
import net.miginfocom.swing.MigLayout;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * Doctor create a medical record from patient monitoring data
 */
public class CreateMedicalRecordFromPatientMonitoring extends JFrame{
	
	/**
	 * instance variables
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private PatientMonitoring patientMonitoring;
	private JTextField tFPrice;
	private JTextField tFMedicationName;
	private JDatePickerImpl endOfMedication, startOfMedication;
	private JRadioButton rdbtnNo, rdbtnYes;
	private MedicalRecordMgmt medicalRecordMgmt;
	private PatientMonitoringMgmt patientMonitoringMgmt;
	private UserMgmt userMgmt;
	private DeviceMgmt deviceMgmt;
	private JTextField tFPriceOfMedication;
	private JLabel lblMedicationName, lblStartOfMedication, lblEndOfMedication, lblPriceOfMedication;
	private JComboBox<String> cBPatientId;
	private JButton btnAddDevice;
	private JComboBox<MedicalCondition> cbMedicalCondition;
	private JTextField textFieldDescription;
	private JLabel lblDescription;
	private int medicalRecordID;
	private InvoiceMgmt invoiceMgmt;
	
	/**
	 * Create the application.
	 */
	public CreateMedicalRecordFromPatientMonitoring(User user, PatientMonitoring patientMonitoring) {
		this.user = user;
		this.patientMonitoring = patientMonitoring;
		medicalRecordMgmt = new MedicalRecordMgmt();
		patientMonitoringMgmt = new PatientMonitoringMgmt();
		userMgmt = new UserMgmt();
		deviceMgmt = new DeviceMgmt();
		invoiceMgmt = new InvoiceMgmt();
		setVisible(true);

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		getContentPane().setFont(new Font("Dialog", Font.PLAIN, 14));
		setBounds(100, 100, 580, 450);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][][][][grow][grow][][][][][][][][]", "[][][][][][][][][][][][][][][]"));
		
		// logout upon click of button "Logout"
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Login();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBackground(new Color(153, 0, 0));
		getContentPane().add(btnLogout, "cell 24 0");
		
		JLabel lblCreateMedicalRecord = new JLabel("Create Medical Record");
		lblCreateMedicalRecord.setForeground(new Color(0, 0, 255));
		lblCreateMedicalRecord.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCreateMedicalRecord.setBackground(new Color(0, 0, 255));
		getContentPane().add(lblCreateMedicalRecord, "cell 15 1");
		
		JLabel lblPatientId = new JLabel("Patient ID: ");
		lblPatientId.setFont(new Font("Dialog", Font.PLAIN, 14));
		getContentPane().add(lblPatientId, "cell 14 3,alignx trailing");
		
		// add data of selected PatienMonitoring to MedicalRecord
		cBPatientId = new JComboBox<String>();
		cBPatientId.addItem("Id: "+patientMonitoring.getPatientId()+" - Username: "+userMgmt.getUserById(patientMonitoring.getPatientId()).getUsername()+"");
		getContentPane().add(cBPatientId, "cell 15 3,growx");
		
		// add a device to a medical record
		btnAddDevice = new JButton("Add Device");
		btnAddDevice.setEnabled(false);
		btnAddDevice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				deviceMgmt.addDevice(DeviceType.SENSOR, patientMonitoring.getPatientId(), medicalRecordID);
				JOptionPane.showMessageDialog(null,
            		    "Device added.",
            		    "Create Medical Record Information",
            		    JOptionPane.INFORMATION_MESSAGE); 
				
				patientMonitoringMgmt.addPatientMonitoring(patientMonitoring.getPatientId(), 
						(MedicalCondition)cbMedicalCondition.getSelectedItem(), Calendar.getInstance(), 
						RiskPerception.MEDIUM, false, deviceMgmt.getLastDeviceID());
			}
		});
		getContentPane().add(btnAddDevice, "cell 24 3");
		
		JLabel lblDiagnosis = new JLabel("Medical Condition: ");
		lblDiagnosis.setFont(new Font("Dialog", Font.PLAIN, 14));
		getContentPane().add(lblDiagnosis, "cell 14 4,alignx trailing");
		
		cbMedicalCondition = new JComboBox<MedicalCondition>();
		cbMedicalCondition.addItem(MedicalCondition.get(patientMonitoring.getCategory().getValue()));
		//cbMedicalCondition.setModel(new DefaultComboBoxModel<MedicalCondition>(MedicalCondition.get(patientMonitoring.getCategory().getValue())));
		getContentPane().add(cbMedicalCondition, "cell 15 4,growx");
		
		JLabel lblPrice = new JLabel("Price (in EUR): ");
		lblPrice.setFont(new Font("Dialog", Font.PLAIN, 14));
		getContentPane().add(lblPrice, "cell 14 5,alignx trailing");
		
		tFPrice = new JTextField();
		tFPrice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(tFPrice, "cell 15 5,growx");
		tFPrice.setColumns(10);
		
		lblDescription = new JLabel("Description: ");
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(lblDescription, "cell 14 6,alignx trailing");
		
		textFieldDescription = new JTextField();
		textFieldDescription.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(textFieldDescription, "cell 15 6,growx");
		textFieldDescription.setColumns(10);
		
		JLabel lblPrescription = new JLabel("Prescription:");
		lblPrescription.setFont(new Font("Dialog", Font.PLAIN, 14));
		getContentPane().add(lblPrescription, "cell 14 7");
		
		ActionListener sliceActionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		        if (rdbtnYes.isSelected()) {
		        	lblMedicationName.setVisible(true);
		        	tFMedicationName.setVisible(true);
		        	lblStartOfMedication.setVisible(true);
		        	startOfMedication.setVisible(true);
		        	lblEndOfMedication.setVisible(true);
		        	endOfMedication.setVisible(true);
		        	lblPriceOfMedication.setVisible(true);
		        	tFPriceOfMedication.setVisible(true);
		        }else {
		        	lblMedicationName.setVisible(false);
		        	tFMedicationName.setVisible(false);
		        	lblStartOfMedication.setVisible(false);
		        	startOfMedication.setVisible(false);
		        	lblEndOfMedication.setVisible(false);
		        	endOfMedication.setVisible(false);
		        	lblPriceOfMedication.setVisible(false);
		        	tFPriceOfMedication.setVisible(false);
		        }
		      }
		    };
		
		rdbtnNo = new JRadioButton("no");
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(rdbtnNo, "cell 15 7");
		rdbtnNo.addActionListener(sliceActionListener);
		
		
		rdbtnYes = new JRadioButton("yes");
		rdbtnYes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(rdbtnYes, "cell 15 8");
		rdbtnYes.addActionListener(sliceActionListener);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNo);
		group.add(rdbtnYes);
		
		
		lblMedicationName = new JLabel("Medication Name: ");
		getContentPane().add(lblMedicationName, "cell 14 10,alignx trailing");
		
		tFMedicationName = new JTextField();
		getContentPane().add(tFMedicationName, "cell 15 10,growx");
		tFMedicationName.setColumns(10);
		
		lblStartOfMedication = new JLabel("Start of Medication:");
		getContentPane().add(lblStartOfMedication, "cell 14 11,alignx trailing");
		
		UtilDateModel modelStartOfMedication = new UtilDateModel();
		Properties propertiesStartOfMedication = new Properties();
		propertiesStartOfMedication.put("text.today", "Today");
		propertiesStartOfMedication.put("text.month", "Month");
		propertiesStartOfMedication.put("text.year", "Year");
		JDatePanelImpl datePanelStartOfMedication = new JDatePanelImpl(modelStartOfMedication, propertiesStartOfMedication);
		startOfMedication = new JDatePickerImpl(datePanelStartOfMedication, new DateComponentFormatter());
		getContentPane().add(startOfMedication, "cell 15 11,growx");
		
		lblEndOfMedication = new JLabel("End of Medication:");
		getContentPane().add(lblEndOfMedication, "cell 14 12,alignx trailing");
		
		
		UtilDateModel modelEndOfMedication = new UtilDateModel();
		Properties propertiesEndOfMedication = new Properties();
		propertiesEndOfMedication.put("text.today", "Today");
		propertiesEndOfMedication.put("text.month", "Month");
		propertiesEndOfMedication.put("text.year", "Year");
		JDatePanelImpl datePanelEndOfMedication = new JDatePanelImpl(modelEndOfMedication, propertiesEndOfMedication);
		endOfMedication = new JDatePickerImpl(datePanelEndOfMedication, new DateComponentFormatter());
		getContentPane().add(endOfMedication, "cell 15 12,growx");

		// submit new medical record to be saved
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Add MedicalRecord
				medicalRecordID = -1;
				if (checkUserInputs()) {
					medicalRecordID = medicalRecordMgmt.generateNewMedicalRecordId();
					
					double price = 0;
					int patientId = -1;
					try {
						price = Double.parseDouble(tFPrice.getText());
						String a = cBPatientId.getSelectedItem().toString().substring(4, cBPatientId.getSelectedItem().toString().indexOf('-')-1);
						patientId = Integer.parseInt(a);
						patientMonitoringMgmt.markPatientMonitoringAsTreated(patientMonitoring);
						medicalRecordMgmt.addMedicalRecord(medicalRecordID, patientId, user.getId(), ((MedicalCondition)cbMedicalCondition.getSelectedItem()), price, new GregorianCalendar(), textFieldDescription.getText());
						
						Calendar invoiceDate = Calendar.getInstance();
						Calendar dueDate = Calendar.getInstance();
						dueDate.set(invoiceDate.get(Calendar.YEAR), invoiceDate.get(Calendar.MONTH), invoiceDate.get(Calendar.DAY_OF_MONTH) + 14);
						invoiceMgmt.addInvoice(patientId, invoiceDate, dueDate, price, user.getId(), "Medical Record " + ((MedicalCondition)cbMedicalCondition.getSelectedItem()), false, null);
					}catch(NumberFormatException exception) {
						JOptionPane.showMessageDialog(null,
		            		    "Price or Patient Id must be a number!",
		            		    "Create Medical Record Information",
		            		    JOptionPane.ERROR_MESSAGE); 
						return;
					}
					
					
				}else {
					JOptionPane.showMessageDialog(null,
	            		    "Empty fields are not allowed.",
	            		    "Create Medical Record Information",
	            		    JOptionPane.WARNING_MESSAGE); 
					return;
				}
				
				//Add Prescription
				if (rdbtnYes.isSelected() && medicalRecordID != -1) {
					Date dateEndOfMed = (Date)endOfMedication.getModel().getValue();
					Date dateStartOfMed = (Date)startOfMedication.getModel().getValue();
					if (checkUserInputsPrescription(dateStartOfMed, dateEndOfMed)) {
						double priceOfMedication = 0;
						try {
							priceOfMedication = Double.parseDouble(tFPriceOfMedication.getText());
						}catch(NumberFormatException exception) {
							JOptionPane.showMessageDialog(null,
			            		    "Price Of Medication must be a number!",
			            		    "Create Prescription Information",
			            		    JOptionPane.ERROR_MESSAGE); 
							return;
						}
	
						Calendar startOfMed = new GregorianCalendar();
						startOfMed.setTime(dateStartOfMed);
								
						Calendar endOfMed = new GregorianCalendar();
						endOfMed.setTime(dateEndOfMed);
								
						int prescriptionId = medicalRecordMgmt.generateNewPrescriptionId();
						medicalRecordMgmt.addPrescriptionToMedicalRecord(medicalRecordID, prescriptionId, tFMedicationName.getText(),
								startOfMed, endOfMed, priceOfMedication, false);
						
					}else {
						JOptionPane.showMessageDialog(null,
		            		    "Empty fields are not allowed.",
		            		    "Create Prescription Information",
		            		    JOptionPane.WARNING_MESSAGE); 
						return;
					}
							
				}
				JOptionPane.showMessageDialog(null,
            		    "Medical Record is succesfuly added.\n You can add a device now.",
            		    "Create Medical Record Information",
            		    JOptionPane.INFORMATION_MESSAGE); 
				btnAddDevice.setEnabled(true);
				//setVisible(false);
				//new DoctorMainPage(user);
					
			}
		});
		
		lblPriceOfMedication = new JLabel("Price of Medication: ");
		getContentPane().add(lblPriceOfMedication, "cell 14 13,alignx trailing");
		
		tFPriceOfMedication = new JTextField();
		getContentPane().add(tFPriceOfMedication, "cell 15 13,growx");
		tFPriceOfMedication.setColumns(10);
		btnSubmit.setBackground(new Color(0, 153, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 14));
		getContentPane().add(btnSubmit, "cell 15 14,growx");
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new DoctorMainPage(user);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 14));
		getContentPane().add(btnBack, "cell 24 14");
		
		lblMedicationName.setVisible(false);
    	tFMedicationName.setVisible(false);
    	lblStartOfMedication.setVisible(false);
    	startOfMedication.setVisible(false);
    	lblEndOfMedication.setVisible(false);
    	endOfMedication.setVisible(false);
    	lblPriceOfMedication.setVisible(false);
    	tFPriceOfMedication.setVisible(false);
	}
	
	/** 
	 * check user inputs (for medical record)
	 * @return boolean
	 */
	private boolean checkUserInputs() {
			
		if (cBPatientId.getSelectedItem().toString().isEmpty() || cbMedicalCondition.getSelectedItem() == null ||
				tFPrice.getText().isEmpty() || (!rdbtnNo.isSelected() && !rdbtnYes.isSelected())) {
			return false;
		}
		return true;
	}
	
	/** 
	 * check user inputs (for prescription)
	 * @param dateStartOfMed
	 * @param dateEndOfMed
	 * @return boolean
	 */
	private boolean checkUserInputsPrescription(Date dateStartOfMed, Date dateEndOfMed) {
		if (dateStartOfMed == null || dateEndOfMed == null || tFMedicationName.getText().isEmpty() || tFPriceOfMedication.getText().isEmpty())
			return false;
		else
			return true;
	}

}
