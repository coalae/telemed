/**
 */
package telemed.impl;

import java.io.Serializable;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.Invoice;
import telemed.MedicalCondition;
import telemed.MedicalRecord;
import telemed.Prescription;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medical Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getDoctorId <em>Doctor Id</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getMedicalCondition <em>Medical Condition</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getDate <em>Date</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link telemed.impl.MedicalRecordImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MedicalRecordImpl extends MinimalEObjectImpl.Container implements MedicalRecord, Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getRecordId() <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordId()
	 * @generated
	 * @ordered
	 */
	protected static final int RECORD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRecordId() <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordId()
	 * @generated
	 * @ordered
	 */
	protected int recordId = RECORD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected static final int PATIENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected int patientId = PATIENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoctorId() <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctorId()
	 * @generated
	 * @ordered
	 */
	protected static final int DOCTOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDoctorId() <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoctorId()
	 * @generated
	 * @ordered
	 */
	protected int doctorId = DOCTOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedicalCondition() <em>Medical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalCondition()
	 * @generated
	 * @ordered
	 */
	protected static final MedicalCondition MEDICAL_CONDITION_EDEFAULT = MedicalCondition.BRONCHITIS;

	/**
	 * The cached value of the '{@link #getMedicalCondition() <em>Medical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalCondition()
	 * @generated
	 * @ordered
	 */
	protected MedicalCondition medicalCondition = MEDICAL_CONDITION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrescription() <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescription()
	 * @generated
	 * @ordered
	 */
	protected Prescription prescription;

	/**
	 * The cached value of the '{@link #getInvoice() <em>Invoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoice()
	 * @generated
	 * @ordered
	 */
	protected Invoice invoice;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final double PRICE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected double price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicalRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.MEDICAL_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRecordId() {
		return recordId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecordId(int newRecordId) {
		int oldRecordId = recordId;
		recordId = newRecordId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__RECORD_ID, oldRecordId,
					recordId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPatientId() {
		return patientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientId(int newPatientId) {
		int oldPatientId = patientId;
		patientId = newPatientId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__PATIENT_ID,
					oldPatientId, patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDoctorId() {
		return doctorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoctorId(int newDoctorId) {
		int oldDoctorId = doctorId;
		doctorId = newDoctorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__DOCTOR_ID, oldDoctorId,
					doctorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicalCondition(MedicalCondition newMedicalCondition) {
		MedicalCondition oldMedicalCondition = medicalCondition;
		medicalCondition = newMedicalCondition == null ? MEDICAL_CONDITION_EDEFAULT : newMedicalCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__MEDICAL_CONDITION,
					oldMedicalCondition, medicalCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription getPrescription() {
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescription(Prescription newPrescription, NotificationChain msgs) {
		Prescription oldPrescription = prescription;
		prescription = newPrescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TelemedPackage.MEDICAL_RECORD__PRESCRIPTION, oldPrescription, newPrescription);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescription(Prescription newPrescription) {
		if (newPrescription != prescription) {
			NotificationChain msgs = null;
			if (prescription != null)
				msgs = ((InternalEObject) prescription).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TelemedPackage.MEDICAL_RECORD__PRESCRIPTION, null, msgs);
			if (newPrescription != null)
				msgs = ((InternalEObject) newPrescription).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TelemedPackage.MEDICAL_RECORD__PRESCRIPTION, null, msgs);
			msgs = basicSetPrescription(newPrescription, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__PRESCRIPTION,
					newPrescription, newPrescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvoice(Invoice newInvoice, NotificationChain msgs) {
		Invoice oldInvoice = invoice;
		invoice = newInvoice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					TelemedPackage.MEDICAL_RECORD__INVOICE, oldInvoice, newInvoice);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoice(Invoice newInvoice) {
		if (newInvoice != invoice) {
			NotificationChain msgs = null;
			if (invoice != null)
				msgs = ((InternalEObject) invoice).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TelemedPackage.MEDICAL_RECORD__INVOICE, null, msgs);
			if (newInvoice != null)
				msgs = ((InternalEObject) newInvoice).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TelemedPackage.MEDICAL_RECORD__INVOICE, null, msgs);
			msgs = basicSetInvoice(newInvoice, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__INVOICE, newInvoice,
					newInvoice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Calendar newDate) {
		Calendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(double newPrice) {
		double oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__PRICE, oldPrice,
					price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.MEDICAL_RECORD__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TelemedPackage.MEDICAL_RECORD__PRESCRIPTION:
			return basicSetPrescription(null, msgs);
		case TelemedPackage.MEDICAL_RECORD__INVOICE:
			return basicSetInvoice(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.MEDICAL_RECORD__RECORD_ID:
			return getRecordId();
		case TelemedPackage.MEDICAL_RECORD__PATIENT_ID:
			return getPatientId();
		case TelemedPackage.MEDICAL_RECORD__DOCTOR_ID:
			return getDoctorId();
		case TelemedPackage.MEDICAL_RECORD__MEDICAL_CONDITION:
			return getMedicalCondition();
		case TelemedPackage.MEDICAL_RECORD__PRESCRIPTION:
			return getPrescription();
		case TelemedPackage.MEDICAL_RECORD__INVOICE:
			return getInvoice();
		case TelemedPackage.MEDICAL_RECORD__DATE:
			return getDate();
		case TelemedPackage.MEDICAL_RECORD__PRICE:
			return getPrice();
		case TelemedPackage.MEDICAL_RECORD__DESCRIPTION:
			return getDescription();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TelemedPackage.MEDICAL_RECORD__RECORD_ID:
			setRecordId((Integer) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__DOCTOR_ID:
			setDoctorId((Integer) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__MEDICAL_CONDITION:
			setMedicalCondition((MedicalCondition) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__PRESCRIPTION:
			setPrescription((Prescription) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__INVOICE:
			setInvoice((Invoice) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__DATE:
			setDate((Calendar) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__PRICE:
			setPrice((Double) newValue);
			return;
		case TelemedPackage.MEDICAL_RECORD__DESCRIPTION:
			setDescription((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TelemedPackage.MEDICAL_RECORD__RECORD_ID:
			setRecordId(RECORD_ID_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__DOCTOR_ID:
			setDoctorId(DOCTOR_ID_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__MEDICAL_CONDITION:
			setMedicalCondition(MEDICAL_CONDITION_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__PRESCRIPTION:
			setPrescription((Prescription) null);
			return;
		case TelemedPackage.MEDICAL_RECORD__INVOICE:
			setInvoice((Invoice) null);
			return;
		case TelemedPackage.MEDICAL_RECORD__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case TelemedPackage.MEDICAL_RECORD__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TelemedPackage.MEDICAL_RECORD__RECORD_ID:
			return recordId != RECORD_ID_EDEFAULT;
		case TelemedPackage.MEDICAL_RECORD__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case TelemedPackage.MEDICAL_RECORD__DOCTOR_ID:
			return doctorId != DOCTOR_ID_EDEFAULT;
		case TelemedPackage.MEDICAL_RECORD__MEDICAL_CONDITION:
			return medicalCondition != MEDICAL_CONDITION_EDEFAULT;
		case TelemedPackage.MEDICAL_RECORD__PRESCRIPTION:
			return prescription != null;
		case TelemedPackage.MEDICAL_RECORD__INVOICE:
			return invoice != null;
		case TelemedPackage.MEDICAL_RECORD__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case TelemedPackage.MEDICAL_RECORD__PRICE:
			return price != PRICE_EDEFAULT;
		case TelemedPackage.MEDICAL_RECORD__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (recordId: ");
		result.append(recordId);
		result.append(", patientId: ");
		result.append(patientId);
		result.append(", doctorId: ");
		result.append(doctorId);
		result.append(", medicalCondition: ");
		result.append(medicalCondition);
		result.append(", date: ");
		result.append(date);
		result.append(", price: ");
		result.append(price);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MedicalRecordImpl
