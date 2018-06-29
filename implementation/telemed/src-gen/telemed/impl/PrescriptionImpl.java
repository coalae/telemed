/**
 */
package telemed.impl;

import java.io.Serializable;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.Prescription;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.PrescriptionImpl#getPrescriptionId <em>Prescription Id</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#getMedicationName <em>Medication Name</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#getEnd <em>End</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link telemed.impl.PrescriptionImpl#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrescriptionImpl extends MinimalEObjectImpl.Container implements Prescription, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getPrescriptionId() <em>Prescription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionId()
	 * @generated
	 * @ordered
	 */
	protected static final int PRESCRIPTION_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrescriptionId() <em>Prescription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionId()
	 * @generated
	 * @ordered
	 */
	protected int prescriptionId = PRESCRIPTION_ID_EDEFAULT;

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
	 * The default value of the '{@link #getMedicationName() <em>Medication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationName()
	 * @generated
	 * @ordered
	 */
	protected static final String MEDICATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedicationName() <em>Medication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationName()
	 * @generated
	 * @ordered
	 */
	protected String medicationName = MEDICATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Calendar start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Calendar end = END_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean ordered = ORDERED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.PRESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrescriptionId() {
		return prescriptionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriptionId(int newPrescriptionId) {
		int oldPrescriptionId = prescriptionId;
		prescriptionId = newPrescriptionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__PRESCRIPTION_ID,
					oldPrescriptionId, prescriptionId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__RECORD_ID, oldRecordId,
					recordId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMedicationName() {
		return medicationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicationName(String newMedicationName) {
		String oldMedicationName = medicationName;
		medicationName = newMedicationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__MEDICATION_NAME,
					oldMedicationName, medicationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Calendar newStart) {
		Calendar oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Calendar newEnd) {
		Calendar oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOrdered() {
		return ordered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdered(boolean newOrdered) {
		boolean oldOrdered = ordered;
		ordered = newOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__ORDERED, oldOrdered,
					ordered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PRESCRIPTION__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.PRESCRIPTION__PRESCRIPTION_ID:
			return getPrescriptionId();
		case TelemedPackage.PRESCRIPTION__RECORD_ID:
			return getRecordId();
		case TelemedPackage.PRESCRIPTION__MEDICATION_NAME:
			return getMedicationName();
		case TelemedPackage.PRESCRIPTION__START:
			return getStart();
		case TelemedPackage.PRESCRIPTION__END:
			return getEnd();
		case TelemedPackage.PRESCRIPTION__ORDERED:
			return isOrdered();
		case TelemedPackage.PRESCRIPTION__PRICE:
			return getPrice();
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
		case TelemedPackage.PRESCRIPTION__PRESCRIPTION_ID:
			setPrescriptionId((Integer) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__RECORD_ID:
			setRecordId((Integer) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__MEDICATION_NAME:
			setMedicationName((String) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__START:
			setStart((Calendar) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__END:
			setEnd((Calendar) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__ORDERED:
			setOrdered((Boolean) newValue);
			return;
		case TelemedPackage.PRESCRIPTION__PRICE:
			setPrice((Double) newValue);
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
		case TelemedPackage.PRESCRIPTION__PRESCRIPTION_ID:
			setPrescriptionId(PRESCRIPTION_ID_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__RECORD_ID:
			setRecordId(RECORD_ID_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__MEDICATION_NAME:
			setMedicationName(MEDICATION_NAME_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__START:
			setStart(START_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__END:
			setEnd(END_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__ORDERED:
			setOrdered(ORDERED_EDEFAULT);
			return;
		case TelemedPackage.PRESCRIPTION__PRICE:
			setPrice(PRICE_EDEFAULT);
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
		case TelemedPackage.PRESCRIPTION__PRESCRIPTION_ID:
			return prescriptionId != PRESCRIPTION_ID_EDEFAULT;
		case TelemedPackage.PRESCRIPTION__RECORD_ID:
			return recordId != RECORD_ID_EDEFAULT;
		case TelemedPackage.PRESCRIPTION__MEDICATION_NAME:
			return MEDICATION_NAME_EDEFAULT == null ? medicationName != null
					: !MEDICATION_NAME_EDEFAULT.equals(medicationName);
		case TelemedPackage.PRESCRIPTION__START:
			return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
		case TelemedPackage.PRESCRIPTION__END:
			return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
		case TelemedPackage.PRESCRIPTION__ORDERED:
			return ordered != ORDERED_EDEFAULT;
		case TelemedPackage.PRESCRIPTION__PRICE:
			return price != PRICE_EDEFAULT;
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
		result.append(" (prescriptionId: ");
		result.append(prescriptionId);
		result.append(", recordId: ");
		result.append(recordId);
		result.append(", medicationName: ");
		result.append(medicationName);
		result.append(", start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(", ordered: ");
		result.append(ordered);
		result.append(", price: ");
		result.append(price);
		result.append(')');
		return result.toString();
	}

} //PrescriptionImpl
