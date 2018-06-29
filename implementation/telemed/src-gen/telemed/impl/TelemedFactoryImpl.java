/**
 */
package telemed.impl;

import java.util.Calendar;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import telemed.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelemedFactoryImpl extends EFactoryImpl implements TelemedFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TelemedFactory init() {
		try {
			TelemedFactory theTelemedFactory = (TelemedFactory) EPackage.Registry.INSTANCE
					.getEFactory(TelemedPackage.eNS_URI);
			if (theTelemedFactory != null) {
				return theTelemedFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TelemedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemedFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case TelemedPackage.PATIENT:
			return createPatient();
		case TelemedPackage.DOCTOR:
			return createDoctor();
		case TelemedPackage.MEDICAL_RECORD:
			return createMedicalRecord();
		case TelemedPackage.PRESCRIPTION:
			return createPrescription();
		case TelemedPackage.INVOICE:
			return createInvoice();
		case TelemedPackage.NATIONAL_HEALTH_ORGANIZATION:
			return createNationalHealthOrganization();
		case TelemedPackage.PHARMACY:
			return createPharmacy();
		case TelemedPackage.PATIENT_MONITORING:
			return createPatientMonitoring();
		case TelemedPackage.DEVICE:
			return createDevice();
		case TelemedPackage.INSURANCE:
			return createInsurance();
		case TelemedPackage.ANONYMIZED_DATA_QUERY:
			return createAnonymizedDataQuery();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case TelemedPackage.GENDER:
			return createGenderFromString(eDataType, initialValue);
		case TelemedPackage.MEDICAL_CONDITION:
			return createMedicalConditionFromString(eDataType, initialValue);
		case TelemedPackage.RISK_PERCEPTION:
			return createRiskPerceptionFromString(eDataType, initialValue);
		case TelemedPackage.DEVICE_TYPE:
			return createDeviceTypeFromString(eDataType, initialValue);
		case TelemedPackage.CALENDAR:
			return createCalendarFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case TelemedPackage.GENDER:
			return convertGenderToString(eDataType, instanceValue);
		case TelemedPackage.MEDICAL_CONDITION:
			return convertMedicalConditionToString(eDataType, instanceValue);
		case TelemedPackage.RISK_PERCEPTION:
			return convertRiskPerceptionToString(eDataType, instanceValue);
		case TelemedPackage.DEVICE_TYPE:
			return convertDeviceTypeToString(eDataType, instanceValue);
		case TelemedPackage.CALENDAR:
			return convertCalendarToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Doctor createDoctor() {
		DoctorImpl doctor = new DoctorImpl();
		return doctor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalRecord createMedicalRecord() {
		MedicalRecordImpl medicalRecord = new MedicalRecordImpl();
		return medicalRecord;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription createPrescription() {
		PrescriptionImpl prescription = new PrescriptionImpl();
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice createInvoice() {
		InvoiceImpl invoice = new InvoiceImpl();
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NationalHealthOrganization createNationalHealthOrganization() {
		NationalHealthOrganizationImpl nationalHealthOrganization = new NationalHealthOrganizationImpl();
		return nationalHealthOrganization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pharmacy createPharmacy() {
		PharmacyImpl pharmacy = new PharmacyImpl();
		return pharmacy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientMonitoring createPatientMonitoring() {
		PatientMonitoringImpl patientMonitoring = new PatientMonitoringImpl();
		return patientMonitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Insurance createInsurance() {
		InsuranceImpl insurance = new InsuranceImpl();
		return insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymizedDataQuery createAnonymizedDataQuery() {
		AnonymizedDataQueryImpl anonymizedDataQuery = new AnonymizedDataQueryImpl();
		return anonymizedDataQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCondition createMedicalConditionFromString(EDataType eDataType, String initialValue) {
		MedicalCondition result = MedicalCondition.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicalConditionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskPerception createRiskPerceptionFromString(EDataType eDataType, String initialValue) {
		RiskPerception result = RiskPerception.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRiskPerceptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceTypeFromString(EDataType eDataType, String initialValue) {
		DeviceType result = DeviceType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar createCalendarFromString(EDataType eDataType, String initialValue) {
		return (Calendar) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalendarToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemedPackage getTelemedPackage() {
		return (TelemedPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TelemedPackage getPackage() {
		return TelemedPackage.eINSTANCE;
	}

} //TelemedFactoryImpl
