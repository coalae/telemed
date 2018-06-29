/**
 */
package telemed.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import telemed.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see telemed.TelemedPackage
 * @generated
 */
public class TelemedAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TelemedPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelemedAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TelemedPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelemedSwitch<Adapter> modelSwitch = new TelemedSwitch<Adapter>() {
		@Override
		public Adapter caseUser(User object) {
			return createUserAdapter();
		}

		@Override
		public Adapter casePatient(Patient object) {
			return createPatientAdapter();
		}

		@Override
		public Adapter caseDoctor(Doctor object) {
			return createDoctorAdapter();
		}

		@Override
		public Adapter caseMedicalRecord(MedicalRecord object) {
			return createMedicalRecordAdapter();
		}

		@Override
		public Adapter casePrescription(Prescription object) {
			return createPrescriptionAdapter();
		}

		@Override
		public Adapter caseInvoice(Invoice object) {
			return createInvoiceAdapter();
		}

		@Override
		public Adapter caseNationalHealthOrganization(NationalHealthOrganization object) {
			return createNationalHealthOrganizationAdapter();
		}

		@Override
		public Adapter casePharmacy(Pharmacy object) {
			return createPharmacyAdapter();
		}

		@Override
		public Adapter casePatientMonitoring(PatientMonitoring object) {
			return createPatientMonitoringAdapter();
		}

		@Override
		public Adapter caseDevice(Device object) {
			return createDeviceAdapter();
		}

		@Override
		public Adapter caseInsurance(Insurance object) {
			return createInsuranceAdapter();
		}

		@Override
		public Adapter caseAnonymizedDataQuery(AnonymizedDataQuery object) {
			return createAnonymizedDataQueryAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Patient
	 * @generated
	 */
	public Adapter createPatientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Doctor <em>Doctor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Doctor
	 * @generated
	 */
	public Adapter createDoctorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.MedicalRecord <em>Medical Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.MedicalRecord
	 * @generated
	 */
	public Adapter createMedicalRecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Prescription
	 * @generated
	 */
	public Adapter createPrescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Invoice <em>Invoice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Invoice
	 * @generated
	 */
	public Adapter createInvoiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.NationalHealthOrganization <em>National Health Organization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.NationalHealthOrganization
	 * @generated
	 */
	public Adapter createNationalHealthOrganizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Pharmacy <em>Pharmacy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Pharmacy
	 * @generated
	 */
	public Adapter createPharmacyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.PatientMonitoring <em>Patient Monitoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.PatientMonitoring
	 * @generated
	 */
	public Adapter createPatientMonitoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Device
	 * @generated
	 */
	public Adapter createDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.Insurance <em>Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.Insurance
	 * @generated
	 */
	public Adapter createInsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link telemed.AnonymizedDataQuery <em>Anonymized Data Query</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see telemed.AnonymizedDataQuery
	 * @generated
	 */
	public Adapter createAnonymizedDataQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TelemedAdapterFactory
