/**
 */
package telemed;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see telemed.TelemedFactory
 * @model kind="package"
 * @generated
 */
public interface TelemedPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "telemed";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/telemed";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "telemed";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelemedPackage eINSTANCE = telemed.impl.TelemedPackageImpl.init();

	/**
	 * The meta object id for the '{@link telemed.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.UserImpl
	 * @see telemed.impl.TelemedPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ID = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__CITY = 3;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.PatientImpl
	 * @see telemed.impl.TelemedPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CITY = USER__CITY;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__FIRSTNAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__LASTNAME = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Svnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__SVNR = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__WEIGHT = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__HEIGHT = USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__GENDER = USER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Birthdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__BIRTHDATE = USER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = USER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link telemed.impl.DoctorImpl <em>Doctor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.DoctorImpl
	 * @see telemed.impl.TelemedPackageImpl#getDoctor()
	 * @generated
	 */
	int DOCTOR = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CITY = USER__CITY;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__FIRSTNAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__LASTNAME = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clinic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR__CLINIC = USER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_FEATURE_COUNT = USER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Doctor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCTOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link telemed.impl.MedicalRecordImpl <em>Medical Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.MedicalRecordImpl
	 * @see telemed.impl.TelemedPackageImpl#getMedicalRecord()
	 * @generated
	 */
	int MEDICAL_RECORD = 3;

	/**
	 * The feature id for the '<em><b>Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__RECORD_ID = 0;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__PATIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Doctor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__DOCTOR_ID = 2;

	/**
	 * The feature id for the '<em><b>Medical Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__MEDICAL_CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__PRESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Invoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__INVOICE = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__DATE = 6;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__PRICE = 7;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD__DESCRIPTION = 8;

	/**
	 * The number of structural features of the '<em>Medical Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Medical Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICAL_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.PrescriptionImpl
	 * @see telemed.impl.TelemedPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 4;

	/**
	 * The feature id for the '<em><b>Prescription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRESCRIPTION_ID = 0;

	/**
	 * The feature id for the '<em><b>Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__RECORD_ID = 1;

	/**
	 * The feature id for the '<em><b>Medication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__MEDICATION_NAME = 2;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__START = 3;

	/**
	 * The feature id for the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__END = 4;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__ORDERED = 5;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PRICE = 6;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.InvoiceImpl <em>Invoice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.InvoiceImpl
	 * @see telemed.impl.TelemedPackageImpl#getInvoice()
	 * @generated
	 */
	int INVOICE = 5;

	/**
	 * The feature id for the '<em><b>Invoice ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_ID = 0;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PATIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__INVOICE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__DUE_DATE = 3;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PRICE = 4;

	/**
	 * The feature id for the '<em><b>Creditor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__CREDITOR_ID = 5;

	/**
	 * The feature id for the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__TOPIC = 6;

	/**
	 * The feature id for the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PAID = 7;

	/**
	 * The feature id for the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE__PAID_DATE = 8;

	/**
	 * The number of structural features of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Invoice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.NationalHealthOrganizationImpl <em>National Health Organization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.NationalHealthOrganizationImpl
	 * @see telemed.impl.TelemedPackageImpl#getNationalHealthOrganization()
	 * @generated
	 */
	int NATIONAL_HEALTH_ORGANIZATION = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION__CITY = USER__CITY;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION__CONTACT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>National Health Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>National Health Organization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIONAL_HEALTH_ORGANIZATION_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link telemed.impl.PharmacyImpl <em>Pharmacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.PharmacyImpl
	 * @see telemed.impl.TelemedPackageImpl#getPharmacy()
	 * @generated
	 */
	int PHARMACY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__CITY = USER__CITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY__NAME = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pharmacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pharmacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link telemed.impl.PatientMonitoringImpl <em>Patient Monitoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.PatientMonitoringImpl
	 * @see telemed.impl.TelemedPackageImpl#getPatientMonitoring()
	 * @generated
	 */
	int PATIENT_MONITORING = 8;

	/**
	 * The feature id for the '<em><b>Monitoring Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__MONITORING_ID = 0;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__PATIENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__DATE = 3;

	/**
	 * The feature id for the '<em><b>Risk Perception</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__RISK_PERCEPTION = 4;

	/**
	 * The feature id for the '<em><b>Treated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__TREATED = 5;

	/**
	 * The feature id for the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING__DEVICE_ID = 6;

	/**
	 * The number of structural features of the '<em>Patient Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Patient Monitoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_MONITORING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.DeviceImpl
	 * @see telemed.impl.TelemedPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__PATIENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Medical Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MEDICAL_RECORD_ID = 3;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.impl.InsuranceImpl <em>Insurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.InsuranceImpl
	 * @see telemed.impl.TelemedPackageImpl#getInsurance()
	 * @generated
	 */
	int INSURANCE = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE__ID = USER__ID;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE__USERNAME = USER__USERNAME;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE__PASSWORD = USER__PASSWORD;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE__CITY = USER__CITY;

	/**
	 * The feature id for the '<em><b>Department</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE__DEPARTMENT = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link telemed.impl.AnonymizedDataQueryImpl <em>Anonymized Data Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.impl.AnonymizedDataQueryImpl
	 * @see telemed.impl.TelemedPackageImpl#getAnonymizedDataQuery()
	 * @generated
	 */
	int ANONYMIZED_DATA_QUERY = 11;

	/**
	 * The feature id for the '<em><b>Gender</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__GENDER = 0;

	/**
	 * The feature id for the '<em><b>Medical Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__WEIGHT = 3;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__CITY = 4;

	/**
	 * The feature id for the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY__BIRTH_YEAR = 5;

	/**
	 * The number of structural features of the '<em>Anonymized Data Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Anonymized Data Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMIZED_DATA_QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link telemed.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.Gender
	 * @see telemed.impl.TelemedPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 12;

	/**
	 * The meta object id for the '{@link telemed.MedicalCondition <em>Medical Condition</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.MedicalCondition
	 * @see telemed.impl.TelemedPackageImpl#getMedicalCondition()
	 * @generated
	 */
	int MEDICAL_CONDITION = 13;

	/**
	 * The meta object id for the '{@link telemed.RiskPerception <em>Risk Perception</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.RiskPerception
	 * @see telemed.impl.TelemedPackageImpl#getRiskPerception()
	 * @generated
	 */
	int RISK_PERCEPTION = 14;

	/**
	 * The meta object id for the '{@link telemed.DeviceType <em>Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see telemed.DeviceType
	 * @see telemed.impl.TelemedPackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 15;

	/**
	 * The meta object id for the '<em>Calendar</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Calendar
	 * @see telemed.impl.TelemedPackageImpl#getCalendar()
	 * @generated
	 */
	int CALENDAR = 16;

	/**
	 * Returns the meta object for class '{@link telemed.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see telemed.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link telemed.User#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see telemed.User#getId()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Id();

	/**
	 * Returns the meta object for the attribute '{@link telemed.User#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see telemed.User#getUsername()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Username();

	/**
	 * Returns the meta object for the attribute '{@link telemed.User#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see telemed.User#getPassword()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Password();

	/**
	 * Returns the meta object for the attribute '{@link telemed.User#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see telemed.User#getCity()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_City();

	/**
	 * Returns the meta object for class '{@link telemed.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see telemed.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see telemed.Patient#getFirstname()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see telemed.Patient#getLastname()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getSvnr <em>Svnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svnr</em>'.
	 * @see telemed.Patient#getSvnr()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Svnr();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see telemed.Patient#getWeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Weight();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see telemed.Patient#getHeight()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Height();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see telemed.Patient#getGender()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Gender();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Patient#getBirthdate <em>Birthdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birthdate</em>'.
	 * @see telemed.Patient#getBirthdate()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Birthdate();

	/**
	 * Returns the meta object for class '{@link telemed.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Doctor</em>'.
	 * @see telemed.Doctor
	 * @generated
	 */
	EClass getDoctor();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Doctor#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see telemed.Doctor#getFirstname()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Doctor#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see telemed.Doctor#getLastname()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Doctor#getClinic <em>Clinic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clinic</em>'.
	 * @see telemed.Doctor#getClinic()
	 * @see #getDoctor()
	 * @generated
	 */
	EAttribute getDoctor_Clinic();

	/**
	 * Returns the meta object for class '{@link telemed.MedicalRecord <em>Medical Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medical Record</em>'.
	 * @see telemed.MedicalRecord
	 * @generated
	 */
	EClass getMedicalRecord();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getRecordId <em>Record Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Id</em>'.
	 * @see telemed.MedicalRecord#getRecordId()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_RecordId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see telemed.MedicalRecord#getPatientId()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_PatientId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getDoctorId <em>Doctor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doctor Id</em>'.
	 * @see telemed.MedicalRecord#getDoctorId()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_DoctorId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getMedicalCondition <em>Medical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical Condition</em>'.
	 * @see telemed.MedicalRecord#getMedicalCondition()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_MedicalCondition();

	/**
	 * Returns the meta object for the containment reference '{@link telemed.MedicalRecord#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescription</em>'.
	 * @see telemed.MedicalRecord#getPrescription()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EReference getMedicalRecord_Prescription();

	/**
	 * Returns the meta object for the containment reference '{@link telemed.MedicalRecord#getInvoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Invoice</em>'.
	 * @see telemed.MedicalRecord#getInvoice()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EReference getMedicalRecord_Invoice();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see telemed.MedicalRecord#getDate()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_Date();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see telemed.MedicalRecord#getPrice()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_Price();

	/**
	 * Returns the meta object for the attribute '{@link telemed.MedicalRecord#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see telemed.MedicalRecord#getDescription()
	 * @see #getMedicalRecord()
	 * @generated
	 */
	EAttribute getMedicalRecord_Description();

	/**
	 * Returns the meta object for class '{@link telemed.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescription</em>'.
	 * @see telemed.Prescription
	 * @generated
	 */
	EClass getPrescription();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getPrescriptionId <em>Prescription Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prescription Id</em>'.
	 * @see telemed.Prescription#getPrescriptionId()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_PrescriptionId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getRecordId <em>Record Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record Id</em>'.
	 * @see telemed.Prescription#getRecordId()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_RecordId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getMedicationName <em>Medication Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medication Name</em>'.
	 * @see telemed.Prescription#getMedicationName()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_MedicationName();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see telemed.Prescription#getStart()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Start();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End</em>'.
	 * @see telemed.Prescription#getEnd()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_End();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#isOrdered <em>Ordered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordered</em>'.
	 * @see telemed.Prescription#isOrdered()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Ordered();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Prescription#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see telemed.Prescription#getPrice()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Price();

	/**
	 * Returns the meta object for class '{@link telemed.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoice</em>'.
	 * @see telemed.Invoice
	 * @generated
	 */
	EClass getInvoice();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getInvoiceID <em>Invoice ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice ID</em>'.
	 * @see telemed.Invoice#getInvoiceID()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceID();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see telemed.Invoice#getPatientId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_PatientId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getInvoiceDate <em>Invoice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Invoice Date</em>'.
	 * @see telemed.Invoice#getInvoiceDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_InvoiceDate();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see telemed.Invoice#getDueDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_DueDate();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see telemed.Invoice#getPrice()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Price();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getCreditorId <em>Creditor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Creditor Id</em>'.
	 * @see telemed.Invoice#getCreditorId()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_CreditorId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getTopic <em>Topic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Topic</em>'.
	 * @see telemed.Invoice#getTopic()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Topic();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#isPaid <em>Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid</em>'.
	 * @see telemed.Invoice#isPaid()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_Paid();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Invoice#getPaidDate <em>Paid Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Paid Date</em>'.
	 * @see telemed.Invoice#getPaidDate()
	 * @see #getInvoice()
	 * @generated
	 */
	EAttribute getInvoice_PaidDate();

	/**
	 * Returns the meta object for class '{@link telemed.NationalHealthOrganization <em>National Health Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>National Health Organization</em>'.
	 * @see telemed.NationalHealthOrganization
	 * @generated
	 */
	EClass getNationalHealthOrganization();

	/**
	 * Returns the meta object for the attribute '{@link telemed.NationalHealthOrganization#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact</em>'.
	 * @see telemed.NationalHealthOrganization#getContact()
	 * @see #getNationalHealthOrganization()
	 * @generated
	 */
	EAttribute getNationalHealthOrganization_Contact();

	/**
	 * Returns the meta object for class '{@link telemed.Pharmacy <em>Pharmacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pharmacy</em>'.
	 * @see telemed.Pharmacy
	 * @generated
	 */
	EClass getPharmacy();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Pharmacy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see telemed.Pharmacy#getName()
	 * @see #getPharmacy()
	 * @generated
	 */
	EAttribute getPharmacy_Name();

	/**
	 * Returns the meta object for class '{@link telemed.PatientMonitoring <em>Patient Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Monitoring</em>'.
	 * @see telemed.PatientMonitoring
	 * @generated
	 */
	EClass getPatientMonitoring();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getMonitoringId <em>Monitoring Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monitoring Id</em>'.
	 * @see telemed.PatientMonitoring#getMonitoringId()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_MonitoringId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see telemed.PatientMonitoring#getPatientId()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_PatientId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see telemed.PatientMonitoring#getCategory()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_Category();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see telemed.PatientMonitoring#getDate()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_Date();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getRiskPerception <em>Risk Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Perception</em>'.
	 * @see telemed.PatientMonitoring#getRiskPerception()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_RiskPerception();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#isTreated <em>Treated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Treated</em>'.
	 * @see telemed.PatientMonitoring#isTreated()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_Treated();

	/**
	 * Returns the meta object for the attribute '{@link telemed.PatientMonitoring#getDeviceId <em>Device Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Id</em>'.
	 * @see telemed.PatientMonitoring#getDeviceId()
	 * @see #getPatientMonitoring()
	 * @generated
	 */
	EAttribute getPatientMonitoring_DeviceId();

	/**
	 * Returns the meta object for class '{@link telemed.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see telemed.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Device#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see telemed.Device#getId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Id();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see telemed.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Device#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Patient Id</em>'.
	 * @see telemed.Device#getPatientId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_PatientId();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Device#getMedicalRecordId <em>Medical Record Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical Record Id</em>'.
	 * @see telemed.Device#getMedicalRecordId()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_MedicalRecordId();

	/**
	 * Returns the meta object for class '{@link telemed.Insurance <em>Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance</em>'.
	 * @see telemed.Insurance
	 * @generated
	 */
	EClass getInsurance();

	/**
	 * Returns the meta object for the attribute '{@link telemed.Insurance#getDepartment <em>Department</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Department</em>'.
	 * @see telemed.Insurance#getDepartment()
	 * @see #getInsurance()
	 * @generated
	 */
	EAttribute getInsurance_Department();

	/**
	 * Returns the meta object for class '{@link telemed.AnonymizedDataQuery <em>Anonymized Data Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymized Data Query</em>'.
	 * @see telemed.AnonymizedDataQuery
	 * @generated
	 */
	EClass getAnonymizedDataQuery();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getGender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gender</em>'.
	 * @see telemed.AnonymizedDataQuery#getGender()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_Gender();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getMedicalCondition <em>Medical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medical Condition</em>'.
	 * @see telemed.AnonymizedDataQuery#getMedicalCondition()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_MedicalCondition();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see telemed.AnonymizedDataQuery#getHeight()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_Height();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see telemed.AnonymizedDataQuery#getWeight()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_Weight();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see telemed.AnonymizedDataQuery#getCity()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_City();

	/**
	 * Returns the meta object for the attribute '{@link telemed.AnonymizedDataQuery#getBirthYear <em>Birth Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth Year</em>'.
	 * @see telemed.AnonymizedDataQuery#getBirthYear()
	 * @see #getAnonymizedDataQuery()
	 * @generated
	 */
	EAttribute getAnonymizedDataQuery_BirthYear();

	/**
	 * Returns the meta object for enum '{@link telemed.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see telemed.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link telemed.MedicalCondition <em>Medical Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Medical Condition</em>'.
	 * @see telemed.MedicalCondition
	 * @generated
	 */
	EEnum getMedicalCondition();

	/**
	 * Returns the meta object for enum '{@link telemed.RiskPerception <em>Risk Perception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Risk Perception</em>'.
	 * @see telemed.RiskPerception
	 * @generated
	 */
	EEnum getRiskPerception();

	/**
	 * Returns the meta object for enum '{@link telemed.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type</em>'.
	 * @see telemed.DeviceType
	 * @generated
	 */
	EEnum getDeviceType();

	/**
	 * Returns the meta object for data type '{@link java.util.Calendar <em>Calendar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Calendar</em>'.
	 * @see java.util.Calendar
	 * @model instanceClass="java.util.Calendar"
	 * @generated
	 */
	EDataType getCalendar();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TelemedFactory getTelemedFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link telemed.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.UserImpl
		 * @see telemed.impl.TelemedPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__ID = eINSTANCE.getUser_Id();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USERNAME = eINSTANCE.getUser_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PASSWORD = eINSTANCE.getUser_Password();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__CITY = eINSTANCE.getUser_City();

		/**
		 * The meta object literal for the '{@link telemed.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.PatientImpl
		 * @see telemed.impl.TelemedPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__FIRSTNAME = eINSTANCE.getPatient_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__LASTNAME = eINSTANCE.getPatient_Lastname();

		/**
		 * The meta object literal for the '<em><b>Svnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__SVNR = eINSTANCE.getPatient_Svnr();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__WEIGHT = eINSTANCE.getPatient_Weight();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__HEIGHT = eINSTANCE.getPatient_Height();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__GENDER = eINSTANCE.getPatient_Gender();

		/**
		 * The meta object literal for the '<em><b>Birthdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__BIRTHDATE = eINSTANCE.getPatient_Birthdate();

		/**
		 * The meta object literal for the '{@link telemed.impl.DoctorImpl <em>Doctor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.DoctorImpl
		 * @see telemed.impl.TelemedPackageImpl#getDoctor()
		 * @generated
		 */
		EClass DOCTOR = eINSTANCE.getDoctor();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__FIRSTNAME = eINSTANCE.getDoctor_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__LASTNAME = eINSTANCE.getDoctor_Lastname();

		/**
		 * The meta object literal for the '<em><b>Clinic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCTOR__CLINIC = eINSTANCE.getDoctor_Clinic();

		/**
		 * The meta object literal for the '{@link telemed.impl.MedicalRecordImpl <em>Medical Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.MedicalRecordImpl
		 * @see telemed.impl.TelemedPackageImpl#getMedicalRecord()
		 * @generated
		 */
		EClass MEDICAL_RECORD = eINSTANCE.getMedicalRecord();

		/**
		 * The meta object literal for the '<em><b>Record Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__RECORD_ID = eINSTANCE.getMedicalRecord_RecordId();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__PATIENT_ID = eINSTANCE.getMedicalRecord_PatientId();

		/**
		 * The meta object literal for the '<em><b>Doctor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__DOCTOR_ID = eINSTANCE.getMedicalRecord_DoctorId();

		/**
		 * The meta object literal for the '<em><b>Medical Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__MEDICAL_CONDITION = eINSTANCE.getMedicalRecord_MedicalCondition();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICAL_RECORD__PRESCRIPTION = eINSTANCE.getMedicalRecord_Prescription();

		/**
		 * The meta object literal for the '<em><b>Invoice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICAL_RECORD__INVOICE = eINSTANCE.getMedicalRecord_Invoice();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__DATE = eINSTANCE.getMedicalRecord_Date();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__PRICE = eINSTANCE.getMedicalRecord_Price();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICAL_RECORD__DESCRIPTION = eINSTANCE.getMedicalRecord_Description();

		/**
		 * The meta object literal for the '{@link telemed.impl.PrescriptionImpl <em>Prescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.PrescriptionImpl
		 * @see telemed.impl.TelemedPackageImpl#getPrescription()
		 * @generated
		 */
		EClass PRESCRIPTION = eINSTANCE.getPrescription();

		/**
		 * The meta object literal for the '<em><b>Prescription Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__PRESCRIPTION_ID = eINSTANCE.getPrescription_PrescriptionId();

		/**
		 * The meta object literal for the '<em><b>Record Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__RECORD_ID = eINSTANCE.getPrescription_RecordId();

		/**
		 * The meta object literal for the '<em><b>Medication Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__MEDICATION_NAME = eINSTANCE.getPrescription_MedicationName();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__START = eINSTANCE.getPrescription_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__END = eINSTANCE.getPrescription_End();

		/**
		 * The meta object literal for the '<em><b>Ordered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__ORDERED = eINSTANCE.getPrescription_Ordered();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__PRICE = eINSTANCE.getPrescription_Price();

		/**
		 * The meta object literal for the '{@link telemed.impl.InvoiceImpl <em>Invoice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.InvoiceImpl
		 * @see telemed.impl.TelemedPackageImpl#getInvoice()
		 * @generated
		 */
		EClass INVOICE = eINSTANCE.getInvoice();

		/**
		 * The meta object literal for the '<em><b>Invoice ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_ID = eINSTANCE.getInvoice_InvoiceID();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PATIENT_ID = eINSTANCE.getInvoice_PatientId();

		/**
		 * The meta object literal for the '<em><b>Invoice Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__INVOICE_DATE = eINSTANCE.getInvoice_InvoiceDate();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__DUE_DATE = eINSTANCE.getInvoice_DueDate();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PRICE = eINSTANCE.getInvoice_Price();

		/**
		 * The meta object literal for the '<em><b>Creditor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__CREDITOR_ID = eINSTANCE.getInvoice_CreditorId();

		/**
		 * The meta object literal for the '<em><b>Topic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__TOPIC = eINSTANCE.getInvoice_Topic();

		/**
		 * The meta object literal for the '<em><b>Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PAID = eINSTANCE.getInvoice_Paid();

		/**
		 * The meta object literal for the '<em><b>Paid Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOICE__PAID_DATE = eINSTANCE.getInvoice_PaidDate();

		/**
		 * The meta object literal for the '{@link telemed.impl.NationalHealthOrganizationImpl <em>National Health Organization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.NationalHealthOrganizationImpl
		 * @see telemed.impl.TelemedPackageImpl#getNationalHealthOrganization()
		 * @generated
		 */
		EClass NATIONAL_HEALTH_ORGANIZATION = eINSTANCE.getNationalHealthOrganization();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIONAL_HEALTH_ORGANIZATION__CONTACT = eINSTANCE.getNationalHealthOrganization_Contact();

		/**
		 * The meta object literal for the '{@link telemed.impl.PharmacyImpl <em>Pharmacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.PharmacyImpl
		 * @see telemed.impl.TelemedPackageImpl#getPharmacy()
		 * @generated
		 */
		EClass PHARMACY = eINSTANCE.getPharmacy();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHARMACY__NAME = eINSTANCE.getPharmacy_Name();

		/**
		 * The meta object literal for the '{@link telemed.impl.PatientMonitoringImpl <em>Patient Monitoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.PatientMonitoringImpl
		 * @see telemed.impl.TelemedPackageImpl#getPatientMonitoring()
		 * @generated
		 */
		EClass PATIENT_MONITORING = eINSTANCE.getPatientMonitoring();

		/**
		 * The meta object literal for the '<em><b>Monitoring Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__MONITORING_ID = eINSTANCE.getPatientMonitoring_MonitoringId();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__PATIENT_ID = eINSTANCE.getPatientMonitoring_PatientId();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__CATEGORY = eINSTANCE.getPatientMonitoring_Category();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__DATE = eINSTANCE.getPatientMonitoring_Date();

		/**
		 * The meta object literal for the '<em><b>Risk Perception</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__RISK_PERCEPTION = eINSTANCE.getPatientMonitoring_RiskPerception();

		/**
		 * The meta object literal for the '<em><b>Treated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__TREATED = eINSTANCE.getPatientMonitoring_Treated();

		/**
		 * The meta object literal for the '<em><b>Device Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_MONITORING__DEVICE_ID = eINSTANCE.getPatientMonitoring_DeviceId();

		/**
		 * The meta object literal for the '{@link telemed.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.DeviceImpl
		 * @see telemed.impl.TelemedPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__ID = eINSTANCE.getDevice_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__PATIENT_ID = eINSTANCE.getDevice_PatientId();

		/**
		 * The meta object literal for the '<em><b>Medical Record Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__MEDICAL_RECORD_ID = eINSTANCE.getDevice_MedicalRecordId();

		/**
		 * The meta object literal for the '{@link telemed.impl.InsuranceImpl <em>Insurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.InsuranceImpl
		 * @see telemed.impl.TelemedPackageImpl#getInsurance()
		 * @generated
		 */
		EClass INSURANCE = eINSTANCE.getInsurance();

		/**
		 * The meta object literal for the '<em><b>Department</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE__DEPARTMENT = eINSTANCE.getInsurance_Department();

		/**
		 * The meta object literal for the '{@link telemed.impl.AnonymizedDataQueryImpl <em>Anonymized Data Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.impl.AnonymizedDataQueryImpl
		 * @see telemed.impl.TelemedPackageImpl#getAnonymizedDataQuery()
		 * @generated
		 */
		EClass ANONYMIZED_DATA_QUERY = eINSTANCE.getAnonymizedDataQuery();

		/**
		 * The meta object literal for the '<em><b>Gender</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__GENDER = eINSTANCE.getAnonymizedDataQuery_Gender();

		/**
		 * The meta object literal for the '<em><b>Medical Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION = eINSTANCE.getAnonymizedDataQuery_MedicalCondition();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__HEIGHT = eINSTANCE.getAnonymizedDataQuery_Height();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__WEIGHT = eINSTANCE.getAnonymizedDataQuery_Weight();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__CITY = eINSTANCE.getAnonymizedDataQuery_City();

		/**
		 * The meta object literal for the '<em><b>Birth Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANONYMIZED_DATA_QUERY__BIRTH_YEAR = eINSTANCE.getAnonymizedDataQuery_BirthYear();

		/**
		 * The meta object literal for the '{@link telemed.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.Gender
		 * @see telemed.impl.TelemedPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link telemed.MedicalCondition <em>Medical Condition</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.MedicalCondition
		 * @see telemed.impl.TelemedPackageImpl#getMedicalCondition()
		 * @generated
		 */
		EEnum MEDICAL_CONDITION = eINSTANCE.getMedicalCondition();

		/**
		 * The meta object literal for the '{@link telemed.RiskPerception <em>Risk Perception</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.RiskPerception
		 * @see telemed.impl.TelemedPackageImpl#getRiskPerception()
		 * @generated
		 */
		EEnum RISK_PERCEPTION = eINSTANCE.getRiskPerception();

		/**
		 * The meta object literal for the '{@link telemed.DeviceType <em>Device Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see telemed.DeviceType
		 * @see telemed.impl.TelemedPackageImpl#getDeviceType()
		 * @generated
		 */
		EEnum DEVICE_TYPE = eINSTANCE.getDeviceType();

		/**
		 * The meta object literal for the '<em>Calendar</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Calendar
		 * @see telemed.impl.TelemedPackageImpl#getCalendar()
		 * @generated
		 */
		EDataType CALENDAR = eINSTANCE.getCalendar();

	}

} //TelemedPackage
