/**
 */
package telemed;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.Device#getId <em>Id</em>}</li>
 *   <li>{@link telemed.Device#getType <em>Type</em>}</li>
 *   <li>{@link telemed.Device#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.Device#getMedicalRecordId <em>Medical Record Id</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see telemed.TelemedPackage#getDevice_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link telemed.Device#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link telemed.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see telemed.DeviceType
	 * @see #setType(DeviceType)
	 * @see telemed.TelemedPackage#getDevice_Type()
	 * @model
	 * @generated
	 */
	DeviceType getType();

	/**
	 * Sets the value of the '{@link telemed.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see telemed.DeviceType
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceType value);

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
	 * @see telemed.TelemedPackage#getDevice_PatientId()
	 * @model
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link telemed.Device#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * Returns the value of the '<em><b>Medical Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medical Record Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medical Record Id</em>' attribute.
	 * @see #setMedicalRecordId(int)
	 * @see telemed.TelemedPackage#getDevice_MedicalRecordId()
	 * @model
	 * @generated
	 */
	int getMedicalRecordId();

	/**
	 * Sets the value of the '{@link telemed.Device#getMedicalRecordId <em>Medical Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical Record Id</em>' attribute.
	 * @see #getMedicalRecordId()
	 * @generated
	 */
	void setMedicalRecordId(int value);

} // Device
