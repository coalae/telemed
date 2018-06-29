/**
 */
package telemed.impl;

import java.util.Calendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import telemed.AnonymizedDataQuery;
import telemed.Device;
import telemed.DeviceType;
import telemed.Doctor;
import telemed.Gender;
import telemed.Insurance;
import telemed.Invoice;
import telemed.MedicalCondition;
import telemed.MedicalRecord;
import telemed.NationalHealthOrganization;
import telemed.Patient;
import telemed.PatientMonitoring;
import telemed.Pharmacy;
import telemed.Prescription;
import telemed.RiskPerception;
import telemed.TelemedFactory;
import telemed.TelemedPackage;
import telemed.User;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelemedPackageImpl extends EPackageImpl implements TelemedPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doctorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicalRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invoiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nationalHealthOrganizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pharmacyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientMonitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymizedDataQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicalConditionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskPerceptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deviceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType calendarEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see telemed.TelemedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TelemedPackageImpl() {
		super(eNS_URI, TelemedFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TelemedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TelemedPackage init() {
		if (isInited)
			return (TelemedPackage) EPackage.Registry.INSTANCE.getEPackage(TelemedPackage.eNS_URI);

		// Obtain or create and register package
		TelemedPackageImpl theTelemedPackage = (TelemedPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof TelemedPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new TelemedPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTelemedPackage.createPackageContents();

		// Initialize created meta-data
		theTelemedPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTelemedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TelemedPackage.eNS_URI, theTelemedPackage);
		return theTelemedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Id() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Username() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Password() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_City() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Firstname() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Lastname() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Svnr() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Weight() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Height() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Gender() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Birthdate() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDoctor() {
		return doctorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Firstname() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Lastname() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDoctor_Clinic() {
		return (EAttribute) doctorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedicalRecord() {
		return medicalRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_RecordId() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_PatientId() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_DoctorId() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_MedicalCondition() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalRecord_Prescription() {
		return (EReference) medicalRecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedicalRecord_Invoice() {
		return (EReference) medicalRecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_Date() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_Price() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedicalRecord_Description() {
		return (EAttribute) medicalRecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescription() {
		return prescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_PrescriptionId() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_RecordId() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_MedicationName() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Start() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_End() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Ordered() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Price() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoice() {
		return invoiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_InvoiceID() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_PatientId() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_InvoiceDate() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_DueDate() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Price() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_CreditorId() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Topic() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_Paid() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInvoice_PaidDate() {
		return (EAttribute) invoiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNationalHealthOrganization() {
		return nationalHealthOrganizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNationalHealthOrganization_Contact() {
		return (EAttribute) nationalHealthOrganizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPharmacy() {
		return pharmacyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPharmacy_Name() {
		return (EAttribute) pharmacyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientMonitoring() {
		return patientMonitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_MonitoringId() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_PatientId() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_Category() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_Date() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_RiskPerception() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_Treated() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientMonitoring_DeviceId() {
		return (EAttribute) patientMonitoringEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Id() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_Type() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_PatientId() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevice_MedicalRecordId() {
		return (EAttribute) deviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsurance() {
		return insuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsurance_Department() {
		return (EAttribute) insuranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnonymizedDataQuery() {
		return anonymizedDataQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_Gender() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_MedicalCondition() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_Height() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_Weight() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_City() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnonymizedDataQuery_BirthYear() {
		return (EAttribute) anonymizedDataQueryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicalCondition() {
		return medicalConditionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskPerception() {
		return riskPerceptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeviceType() {
		return deviceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCalendar() {
		return calendarEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemedFactory getTelemedFactory() {
		return (TelemedFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__ID);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__PASSWORD);
		createEAttribute(userEClass, USER__CITY);

		patientEClass = createEClass(PATIENT);
		createEAttribute(patientEClass, PATIENT__FIRSTNAME);
		createEAttribute(patientEClass, PATIENT__LASTNAME);
		createEAttribute(patientEClass, PATIENT__SVNR);
		createEAttribute(patientEClass, PATIENT__WEIGHT);
		createEAttribute(patientEClass, PATIENT__HEIGHT);
		createEAttribute(patientEClass, PATIENT__GENDER);
		createEAttribute(patientEClass, PATIENT__BIRTHDATE);

		doctorEClass = createEClass(DOCTOR);
		createEAttribute(doctorEClass, DOCTOR__FIRSTNAME);
		createEAttribute(doctorEClass, DOCTOR__LASTNAME);
		createEAttribute(doctorEClass, DOCTOR__CLINIC);

		medicalRecordEClass = createEClass(MEDICAL_RECORD);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__RECORD_ID);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__PATIENT_ID);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__DOCTOR_ID);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__MEDICAL_CONDITION);
		createEReference(medicalRecordEClass, MEDICAL_RECORD__PRESCRIPTION);
		createEReference(medicalRecordEClass, MEDICAL_RECORD__INVOICE);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__DATE);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__PRICE);
		createEAttribute(medicalRecordEClass, MEDICAL_RECORD__DESCRIPTION);

		prescriptionEClass = createEClass(PRESCRIPTION);
		createEAttribute(prescriptionEClass, PRESCRIPTION__PRESCRIPTION_ID);
		createEAttribute(prescriptionEClass, PRESCRIPTION__RECORD_ID);
		createEAttribute(prescriptionEClass, PRESCRIPTION__MEDICATION_NAME);
		createEAttribute(prescriptionEClass, PRESCRIPTION__START);
		createEAttribute(prescriptionEClass, PRESCRIPTION__END);
		createEAttribute(prescriptionEClass, PRESCRIPTION__ORDERED);
		createEAttribute(prescriptionEClass, PRESCRIPTION__PRICE);

		invoiceEClass = createEClass(INVOICE);
		createEAttribute(invoiceEClass, INVOICE__INVOICE_ID);
		createEAttribute(invoiceEClass, INVOICE__PATIENT_ID);
		createEAttribute(invoiceEClass, INVOICE__INVOICE_DATE);
		createEAttribute(invoiceEClass, INVOICE__DUE_DATE);
		createEAttribute(invoiceEClass, INVOICE__PRICE);
		createEAttribute(invoiceEClass, INVOICE__CREDITOR_ID);
		createEAttribute(invoiceEClass, INVOICE__TOPIC);
		createEAttribute(invoiceEClass, INVOICE__PAID);
		createEAttribute(invoiceEClass, INVOICE__PAID_DATE);

		nationalHealthOrganizationEClass = createEClass(NATIONAL_HEALTH_ORGANIZATION);
		createEAttribute(nationalHealthOrganizationEClass, NATIONAL_HEALTH_ORGANIZATION__CONTACT);

		pharmacyEClass = createEClass(PHARMACY);
		createEAttribute(pharmacyEClass, PHARMACY__NAME);

		patientMonitoringEClass = createEClass(PATIENT_MONITORING);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__MONITORING_ID);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__PATIENT_ID);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__CATEGORY);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__DATE);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__RISK_PERCEPTION);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__TREATED);
		createEAttribute(patientMonitoringEClass, PATIENT_MONITORING__DEVICE_ID);

		deviceEClass = createEClass(DEVICE);
		createEAttribute(deviceEClass, DEVICE__ID);
		createEAttribute(deviceEClass, DEVICE__TYPE);
		createEAttribute(deviceEClass, DEVICE__PATIENT_ID);
		createEAttribute(deviceEClass, DEVICE__MEDICAL_RECORD_ID);

		insuranceEClass = createEClass(INSURANCE);
		createEAttribute(insuranceEClass, INSURANCE__DEPARTMENT);

		anonymizedDataQueryEClass = createEClass(ANONYMIZED_DATA_QUERY);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__GENDER);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__HEIGHT);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__WEIGHT);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__CITY);
		createEAttribute(anonymizedDataQueryEClass, ANONYMIZED_DATA_QUERY__BIRTH_YEAR);

		// Create enums
		genderEEnum = createEEnum(GENDER);
		medicalConditionEEnum = createEEnum(MEDICAL_CONDITION);
		riskPerceptionEEnum = createEEnum(RISK_PERCEPTION);
		deviceTypeEEnum = createEEnum(DEVICE_TYPE);

		// Create data types
		calendarEDataType = createEDataType(CALENDAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		patientEClass.getESuperTypes().add(this.getUser());
		doctorEClass.getESuperTypes().add(this.getUser());
		nationalHealthOrganizationEClass.getESuperTypes().add(this.getUser());
		pharmacyEClass.getESuperTypes().add(this.getUser());
		insuranceEClass.getESuperTypes().add(this.getUser());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Id(), ecorePackage.getEInt(), "id", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Password(), ecorePackage.getEString(), "password", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_City(), ecorePackage.getEString(), "city", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatient_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPatient_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPatient_Svnr(), ecorePackage.getEString(), "svnr", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPatient_Height(), ecorePackage.getEDouble(), "height", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPatient_Gender(), this.getGender(), "gender", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Birthdate(), this.getCalendar(), "birthdate", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doctorEClass, Doctor.class, "Doctor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoctor_Firstname(), ecorePackage.getEString(), "firstname", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDoctor_Lastname(), ecorePackage.getEString(), "lastname", null, 0, 1, Doctor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDoctor_Clinic(), ecorePackage.getEString(), "clinic", null, 0, 1, Doctor.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicalRecordEClass, MedicalRecord.class, "MedicalRecord", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedicalRecord_RecordId(), ecorePackage.getEInt(), "recordId", null, 0, 1, MedicalRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalRecord_PatientId(), ecorePackage.getEInt(), "patientId", null, 0, 1,
				MedicalRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalRecord_DoctorId(), ecorePackage.getEInt(), "doctorId", null, 0, 1, MedicalRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMedicalRecord_MedicalCondition(), this.getMedicalCondition(), "medicalCondition", null, 0, 1,
				MedicalRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMedicalRecord_Prescription(), this.getPrescription(), null, "prescription", null, 0, 1,
				MedicalRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedicalRecord_Invoice(), this.getInvoice(), null, "invoice", null, 1, 1, MedicalRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedicalRecord_Date(), this.getCalendar(), "date", null, 0, 1, MedicalRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMedicalRecord_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, MedicalRecord.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getMedicalRecord_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				MedicalRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(prescriptionEClass, Prescription.class, "Prescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescription_PrescriptionId(), ecorePackage.getEInt(), "prescriptionId", null, 0, 1,
				Prescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_RecordId(), ecorePackage.getEInt(), "recordId", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPrescription_MedicationName(), ecorePackage.getEString(), "medicationName", null, 0, 1,
				Prescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Start(), this.getCalendar(), "start", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPrescription_End(), this.getCalendar(), "end", null, 0, 1, Prescription.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Ordered(), ecorePackage.getEBoolean(), "ordered", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPrescription_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(invoiceEClass, Invoice.class, "Invoice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvoice_InvoiceID(), ecorePackage.getEInt(), "invoiceID", null, 0, 1, Invoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_PatientId(), ecorePackage.getEInt(), "patientId", null, 0, 1, Invoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInvoice_InvoiceDate(), this.getCalendar(), "invoiceDate", null, 0, 1, Invoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInvoice_DueDate(), this.getCalendar(), "dueDate", null, 0, 1, Invoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_Price(), ecorePackage.getEDouble(), "price", null, 0, 1, Invoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_CreditorId(), ecorePackage.getEInt(), "creditorId", null, 0, 1, Invoice.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getInvoice_Topic(), ecorePackage.getEString(), "topic", null, 0, 1, Invoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_Paid(), ecorePackage.getEBoolean(), "paid", null, 0, 1, Invoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvoice_PaidDate(), this.getCalendar(), "paidDate", null, 0, 1, Invoice.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nationalHealthOrganizationEClass, NationalHealthOrganization.class, "NationalHealthOrganization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNationalHealthOrganization_Contact(), ecorePackage.getEString(), "contact", null, 0, 1,
				NationalHealthOrganization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				!IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pharmacyEClass, Pharmacy.class, "Pharmacy", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPharmacy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pharmacy.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientMonitoringEClass, PatientMonitoring.class, "PatientMonitoring", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatientMonitoring_MonitoringId(), ecorePackage.getEInt(), "monitoringId", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientMonitoring_PatientId(), ecorePackage.getEInt(), "patientId", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientMonitoring_Category(), this.getMedicalCondition(), "category", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientMonitoring_Date(), this.getCalendar(), "date", null, 0, 1, PatientMonitoring.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getPatientMonitoring_RiskPerception(), this.getRiskPerception(), "riskPerception", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientMonitoring_Treated(), ecorePackage.getEBoolean(), "treated", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatientMonitoring_DeviceId(), ecorePackage.getEInt(), "deviceId", null, 0, 1,
				PatientMonitoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevice_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_Type(), this.getDeviceType(), "type", null, 0, 1, Device.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_PatientId(), ecorePackage.getEInt(), "patientId", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDevice_MedicalRecordId(), ecorePackage.getEInt(), "medicalRecordId", null, 0, 1, Device.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insuranceEClass, Insurance.class, "Insurance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsurance_Department(), ecorePackage.getEString(), "department", null, 0, 1, Insurance.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anonymizedDataQueryEClass, AnonymizedDataQuery.class, "AnonymizedDataQuery", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnonymizedDataQuery_Gender(), this.getGender(), "gender", null, 0, 1,
				AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizedDataQuery_MedicalCondition(), this.getMedicalCondition(), "medicalCondition", null,
				0, 1, AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizedDataQuery_Height(), ecorePackage.getEDouble(), "height", null, 0, 1,
				AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizedDataQuery_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1,
				AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizedDataQuery_City(), ecorePackage.getEString(), "city", null, 0, 1,
				AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnonymizedDataQuery_BirthYear(), ecorePackage.getEInt(), "birthYear", null, 0, 1,
				AnonymizedDataQuery.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.FEMALE);
		addEEnumLiteral(genderEEnum, Gender.MALE);

		initEEnum(medicalConditionEEnum, MedicalCondition.class, "MedicalCondition");
		addEEnumLiteral(medicalConditionEEnum, MedicalCondition.BRONCHITIS);
		addEEnumLiteral(medicalConditionEEnum, MedicalCondition.ASTHMA);
		addEEnumLiteral(medicalConditionEEnum, MedicalCondition.DIABETES);
		addEEnumLiteral(medicalConditionEEnum, MedicalCondition.FLU);
		addEEnumLiteral(medicalConditionEEnum, MedicalCondition.HYPERTENSION);

		initEEnum(riskPerceptionEEnum, RiskPerception.class, "RiskPerception");
		addEEnumLiteral(riskPerceptionEEnum, RiskPerception.HIGH);
		addEEnumLiteral(riskPerceptionEEnum, RiskPerception.MEDIUM);
		addEEnumLiteral(riskPerceptionEEnum, RiskPerception.LOW);

		initEEnum(deviceTypeEEnum, DeviceType.class, "DeviceType");
		addEEnumLiteral(deviceTypeEEnum, DeviceType.SENSOR);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.FIXED_PLACEMENT);
		addEEnumLiteral(deviceTypeEEnum, DeviceType.WEARABLE);

		// Initialize data types
		initEDataType(calendarEDataType, Calendar.class, "Calendar", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TelemedPackageImpl
