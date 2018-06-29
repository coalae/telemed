/**
 */
package telemed;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medical Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.MedicalRecord#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getDoctorId <em>Doctor Id</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getMedicalCondition <em>Medical Condition</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getInvoice <em>Invoice</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getDate <em>Date</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getPrice <em>Price</em>}</li>
 *   <li>{@link telemed.MedicalRecord#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getMedicalRecord()
 * @model
 * @generated
 */
public interface MedicalRecord extends EObject {
	/**
	 * Returns the value of the '<em><b>Record Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Record Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record Id</em>' attribute.
	 * @see #setRecordId(int)
	 * @see telemed.TelemedPackage#getMedicalRecord_RecordId()
	 * @model id="true"
	 * @generated
	 */
	int getRecordId();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getRecordId <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Id</em>' attribute.
	 * @see #getRecordId()
	 * @generated
	 */
	void setRecordId(int value);

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
	 * @see telemed.TelemedPackage#getMedicalRecord_PatientId()
	 * @model unique="false"
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * Returns the value of the '<em><b>Doctor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Doctor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doctor Id</em>' attribute.
	 * @see #setDoctorId(int)
	 * @see telemed.TelemedPackage#getMedicalRecord_DoctorId()
	 * @model unique="false"
	 * @generated
	 */
	int getDoctorId();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getDoctorId <em>Doctor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doctor Id</em>' attribute.
	 * @see #getDoctorId()
	 * @generated
	 */
	void setDoctorId(int value);

	/**
	 * Returns the value of the '<em><b>Medical Condition</b></em>' attribute.
	 * The literals are from the enumeration {@link telemed.MedicalCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medical Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medical Condition</em>' attribute.
	 * @see telemed.MedicalCondition
	 * @see #setMedicalCondition(MedicalCondition)
	 * @see telemed.TelemedPackage#getMedicalRecord_MedicalCondition()
	 * @model unique="false"
	 * @generated
	 */
	MedicalCondition getMedicalCondition();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getMedicalCondition <em>Medical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical Condition</em>' attribute.
	 * @see telemed.MedicalCondition
	 * @see #getMedicalCondition()
	 * @generated
	 */
	void setMedicalCondition(MedicalCondition value);

	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference.
	 * @see #setPrescription(Prescription)
	 * @see telemed.TelemedPackage#getMedicalRecord_Prescription()
	 * @model containment="true"
	 * @generated
	 */
	Prescription getPrescription();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getPrescription <em>Prescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription</em>' containment reference.
	 * @see #getPrescription()
	 * @generated
	 */
	void setPrescription(Prescription value);

	/**
	 * Returns the value of the '<em><b>Invoice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice</em>' containment reference.
	 * @see #setInvoice(Invoice)
	 * @see telemed.TelemedPackage#getMedicalRecord_Invoice()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Invoice getInvoice();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getInvoice <em>Invoice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice</em>' containment reference.
	 * @see #getInvoice()
	 * @generated
	 */
	void setInvoice(Invoice value);

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
	 * @see telemed.TelemedPackage#getMedicalRecord_Date()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getDate();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Price</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Price</em>' attribute.
	 * @see #setPrice(double)
	 * @see telemed.TelemedPackage#getMedicalRecord_Price()
	 * @model unique="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see telemed.TelemedPackage#getMedicalRecord_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link telemed.MedicalRecord#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // MedicalRecord
