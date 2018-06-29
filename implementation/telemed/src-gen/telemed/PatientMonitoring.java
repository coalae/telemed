/**
 */
package telemed;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Monitoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.PatientMonitoring#getMonitoringId <em>Monitoring Id</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#getCategory <em>Category</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#getDate <em>Date</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#getRiskPerception <em>Risk Perception</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#isTreated <em>Treated</em>}</li>
 *   <li>{@link telemed.PatientMonitoring#getDeviceId <em>Device Id</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getPatientMonitoring()
 * @model
 * @generated
 */
public interface PatientMonitoring extends EObject {
	/**
	 * Returns the value of the '<em><b>Monitoring Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring Id</em>' attribute.
	 * @see #setMonitoringId(int)
	 * @see telemed.TelemedPackage#getPatientMonitoring_MonitoringId()
	 * @model id="true"
	 * @generated
	 */
	int getMonitoringId();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getMonitoringId <em>Monitoring Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring Id</em>' attribute.
	 * @see #getMonitoringId()
	 * @generated
	 */
	void setMonitoringId(int value);

	/**
	 * Returns the value of the '<em><b>Patient Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Id</em>' attribute.
	 * @see #setPatientId(int)
	 * @see telemed.TelemedPackage#getPatientMonitoring_PatientId()
	 * @model unique="false"
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * The literals are from the enumeration {@link telemed.MedicalCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see telemed.MedicalCondition
	 * @see #setCategory(MedicalCondition)
	 * @see telemed.TelemedPackage#getPatientMonitoring_Category()
	 * @model unique="false"
	 * @generated
	 */
	MedicalCondition getCategory();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see telemed.MedicalCondition
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(MedicalCondition value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Calendar)
	 * @see telemed.TelemedPackage#getPatientMonitoring_Date()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getDate();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Risk Perception</b></em>' attribute.
	 * The literals are from the enumeration {@link telemed.RiskPerception}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk Perception</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk Perception</em>' attribute.
	 * @see telemed.RiskPerception
	 * @see #setRiskPerception(RiskPerception)
	 * @see telemed.TelemedPackage#getPatientMonitoring_RiskPerception()
	 * @model unique="false"
	 * @generated
	 */
	RiskPerception getRiskPerception();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getRiskPerception <em>Risk Perception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Perception</em>' attribute.
	 * @see telemed.RiskPerception
	 * @see #getRiskPerception()
	 * @generated
	 */
	void setRiskPerception(RiskPerception value);

	/**
	 * Returns the value of the '<em><b>Treated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Treated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Treated</em>' attribute.
	 * @see #setTreated(boolean)
	 * @see telemed.TelemedPackage#getPatientMonitoring_Treated()
	 * @model
	 * @generated
	 */
	boolean isTreated();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#isTreated <em>Treated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Treated</em>' attribute.
	 * @see #isTreated()
	 * @generated
	 */
	void setTreated(boolean value);

	/**
	 * Returns the value of the '<em><b>Device Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Id</em>' attribute.
	 * @see #setDeviceId(int)
	 * @see telemed.TelemedPackage#getPatientMonitoring_DeviceId()
	 * @model
	 * @generated
	 */
	int getDeviceId();

	/**
	 * Sets the value of the '{@link telemed.PatientMonitoring#getDeviceId <em>Device Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Id</em>' attribute.
	 * @see #getDeviceId()
	 * @generated
	 */
	void setDeviceId(int value);

} // PatientMonitoring
