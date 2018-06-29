/**
 */
package telemed.impl;

import java.io.Serializable;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.MedicalCondition;
import telemed.PatientMonitoring;
import telemed.RiskPerception;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getMonitoringId <em>Monitoring Id</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getDate <em>Date</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getRiskPerception <em>Risk Perception</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#isTreated <em>Treated</em>}</li>
 *   <li>{@link telemed.impl.PatientMonitoringImpl#getDeviceId <em>Device Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientMonitoringImpl extends MinimalEObjectImpl.Container implements PatientMonitoring, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getMonitoringId() <em>Monitoring Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringId()
	 * @generated
	 * @ordered
	 */
	protected static final int MONITORING_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonitoringId() <em>Monitoring Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoringId()
	 * @generated
	 * @ordered
	 */
	protected int monitoringId = MONITORING_ID_EDEFAULT;

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
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final MedicalCondition CATEGORY_EDEFAULT = MedicalCondition.BRONCHITIS;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected MedicalCondition category = CATEGORY_EDEFAULT;

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
	 * The default value of the '{@link #getRiskPerception() <em>Risk Perception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskPerception()
	 * @generated
	 * @ordered
	 */
	protected static final RiskPerception RISK_PERCEPTION_EDEFAULT = RiskPerception.HIGH;

	/**
	 * The cached value of the '{@link #getRiskPerception() <em>Risk Perception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskPerception()
	 * @generated
	 * @ordered
	 */
	protected RiskPerception riskPerception = RISK_PERCEPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTreated() <em>Treated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TREATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTreated() <em>Treated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTreated()
	 * @generated
	 * @ordered
	 */
	protected boolean treated = TREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected static final int DEVICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceId()
	 * @generated
	 * @ordered
	 */
	protected int deviceId = DEVICE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientMonitoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.PATIENT_MONITORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonitoringId() {
		return monitoringId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoringId(int newMonitoringId) {
		int oldMonitoringId = monitoringId;
		monitoringId = newMonitoringId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__MONITORING_ID,
					oldMonitoringId, monitoringId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__PATIENT_ID,
					oldPatientId, patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCondition getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(MedicalCondition newCategory) {
		MedicalCondition oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__CATEGORY,
					oldCategory, category));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__DATE, oldDate,
					date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RiskPerception getRiskPerception() {
		return riskPerception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRiskPerception(RiskPerception newRiskPerception) {
		RiskPerception oldRiskPerception = riskPerception;
		riskPerception = newRiskPerception == null ? RISK_PERCEPTION_EDEFAULT : newRiskPerception;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__RISK_PERCEPTION,
					oldRiskPerception, riskPerception));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTreated() {
		return treated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreated(boolean newTreated) {
		boolean oldTreated = treated;
		treated = newTreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__TREATED,
					oldTreated, treated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDeviceId() {
		return deviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceId(int newDeviceId) {
		int oldDeviceId = deviceId;
		deviceId = newDeviceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT_MONITORING__DEVICE_ID,
					oldDeviceId, deviceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.PATIENT_MONITORING__MONITORING_ID:
			return getMonitoringId();
		case TelemedPackage.PATIENT_MONITORING__PATIENT_ID:
			return getPatientId();
		case TelemedPackage.PATIENT_MONITORING__CATEGORY:
			return getCategory();
		case TelemedPackage.PATIENT_MONITORING__DATE:
			return getDate();
		case TelemedPackage.PATIENT_MONITORING__RISK_PERCEPTION:
			return getRiskPerception();
		case TelemedPackage.PATIENT_MONITORING__TREATED:
			return isTreated();
		case TelemedPackage.PATIENT_MONITORING__DEVICE_ID:
			return getDeviceId();
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
		case TelemedPackage.PATIENT_MONITORING__MONITORING_ID:
			setMonitoringId((Integer) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__CATEGORY:
			setCategory((MedicalCondition) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__DATE:
			setDate((Calendar) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__RISK_PERCEPTION:
			setRiskPerception((RiskPerception) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__TREATED:
			setTreated((Boolean) newValue);
			return;
		case TelemedPackage.PATIENT_MONITORING__DEVICE_ID:
			setDeviceId((Integer) newValue);
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
		case TelemedPackage.PATIENT_MONITORING__MONITORING_ID:
			setMonitoringId(MONITORING_ID_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__CATEGORY:
			setCategory(CATEGORY_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__DATE:
			setDate(DATE_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__RISK_PERCEPTION:
			setRiskPerception(RISK_PERCEPTION_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__TREATED:
			setTreated(TREATED_EDEFAULT);
			return;
		case TelemedPackage.PATIENT_MONITORING__DEVICE_ID:
			setDeviceId(DEVICE_ID_EDEFAULT);
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
		case TelemedPackage.PATIENT_MONITORING__MONITORING_ID:
			return monitoringId != MONITORING_ID_EDEFAULT;
		case TelemedPackage.PATIENT_MONITORING__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case TelemedPackage.PATIENT_MONITORING__CATEGORY:
			return category != CATEGORY_EDEFAULT;
		case TelemedPackage.PATIENT_MONITORING__DATE:
			return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
		case TelemedPackage.PATIENT_MONITORING__RISK_PERCEPTION:
			return riskPerception != RISK_PERCEPTION_EDEFAULT;
		case TelemedPackage.PATIENT_MONITORING__TREATED:
			return treated != TREATED_EDEFAULT;
		case TelemedPackage.PATIENT_MONITORING__DEVICE_ID:
			return deviceId != DEVICE_ID_EDEFAULT;
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
		result.append(" (monitoringId: ");
		result.append(monitoringId);
		result.append(", patientId: ");
		result.append(patientId);
		result.append(", category: ");
		result.append(category);
		result.append(", date: ");
		result.append(date);
		result.append(", riskPerception: ");
		result.append(riskPerception);
		result.append(", treated: ");
		result.append(treated);
		result.append(", deviceId: ");
		result.append(deviceId);
		result.append(')');
		return result.toString();
	}

} //PatientMonitoringImpl
