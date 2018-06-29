/**
 */
package telemed.impl;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.Device;
import telemed.DeviceType;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.DeviceImpl#getId <em>Id</em>}</li>
 *   <li>{@link telemed.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link telemed.impl.DeviceImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.impl.DeviceImpl#getMedicalRecordId <em>Medical Record Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceType TYPE_EDEFAULT = DeviceType.SENSOR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getMedicalRecordId() <em>Medical Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalRecordId()
	 * @generated
	 * @ordered
	 */
	protected static final int MEDICAL_RECORD_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMedicalRecordId() <em>Medical Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalRecordId()
	 * @generated
	 * @ordered
	 */
	protected int medicalRecordId = MEDICAL_RECORD_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.DEVICE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeviceType newType) {
		DeviceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.DEVICE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.DEVICE__PATIENT_ID, oldPatientId,
					patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMedicalRecordId() {
		return medicalRecordId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicalRecordId(int newMedicalRecordId) {
		int oldMedicalRecordId = medicalRecordId;
		medicalRecordId = newMedicalRecordId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.DEVICE__MEDICAL_RECORD_ID,
					oldMedicalRecordId, medicalRecordId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.DEVICE__ID:
			return getId();
		case TelemedPackage.DEVICE__TYPE:
			return getType();
		case TelemedPackage.DEVICE__PATIENT_ID:
			return getPatientId();
		case TelemedPackage.DEVICE__MEDICAL_RECORD_ID:
			return getMedicalRecordId();
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
		case TelemedPackage.DEVICE__ID:
			setId((Integer) newValue);
			return;
		case TelemedPackage.DEVICE__TYPE:
			setType((DeviceType) newValue);
			return;
		case TelemedPackage.DEVICE__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case TelemedPackage.DEVICE__MEDICAL_RECORD_ID:
			setMedicalRecordId((Integer) newValue);
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
		case TelemedPackage.DEVICE__ID:
			setId(ID_EDEFAULT);
			return;
		case TelemedPackage.DEVICE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case TelemedPackage.DEVICE__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case TelemedPackage.DEVICE__MEDICAL_RECORD_ID:
			setMedicalRecordId(MEDICAL_RECORD_ID_EDEFAULT);
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
		case TelemedPackage.DEVICE__ID:
			return id != ID_EDEFAULT;
		case TelemedPackage.DEVICE__TYPE:
			return type != TYPE_EDEFAULT;
		case TelemedPackage.DEVICE__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case TelemedPackage.DEVICE__MEDICAL_RECORD_ID:
			return medicalRecordId != MEDICAL_RECORD_ID_EDEFAULT;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", type: ");
		result.append(type);
		result.append(", patientId: ");
		result.append(patientId);
		result.append(", medicalRecordId: ");
		result.append(medicalRecordId);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
