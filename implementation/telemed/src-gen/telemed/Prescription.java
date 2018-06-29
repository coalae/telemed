/**
 */
package telemed;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.Prescription#getPrescriptionId <em>Prescription Id</em>}</li>
 *   <li>{@link telemed.Prescription#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link telemed.Prescription#getMedicationName <em>Medication Name</em>}</li>
 *   <li>{@link telemed.Prescription#getStart <em>Start</em>}</li>
 *   <li>{@link telemed.Prescription#getEnd <em>End</em>}</li>
 *   <li>{@link telemed.Prescription#isOrdered <em>Ordered</em>}</li>
 *   <li>{@link telemed.Prescription#getPrice <em>Price</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getPrescription()
 * @model
 * @generated
 */
public interface Prescription extends EObject {
	/**
	 * Returns the value of the '<em><b>Prescription Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Id</em>' attribute.
	 * @see #setPrescriptionId(int)
	 * @see telemed.TelemedPackage#getPrescription_PrescriptionId()
	 * @model id="true"
	 * @generated
	 */
	int getPrescriptionId();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getPrescriptionId <em>Prescription Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescription Id</em>' attribute.
	 * @see #getPrescriptionId()
	 * @generated
	 */
	void setPrescriptionId(int value);

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
	 * @see telemed.TelemedPackage#getPrescription_RecordId()
	 * @model unique="false"
	 * @generated
	 */
	int getRecordId();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getRecordId <em>Record Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record Id</em>' attribute.
	 * @see #getRecordId()
	 * @generated
	 */
	void setRecordId(int value);

	/**
	 * Returns the value of the '<em><b>Medication Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medication Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medication Name</em>' attribute.
	 * @see #setMedicationName(String)
	 * @see telemed.TelemedPackage#getPrescription_MedicationName()
	 * @model unique="false"
	 * @generated
	 */
	String getMedicationName();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getMedicationName <em>Medication Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medication Name</em>' attribute.
	 * @see #getMedicationName()
	 * @generated
	 */
	void setMedicationName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Calendar)
	 * @see telemed.TelemedPackage#getPrescription_Start()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getStart();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Calendar value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Calendar)
	 * @see telemed.TelemedPackage#getPrescription_End()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getEnd();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Calendar value);

	/**
	 * Returns the value of the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordered</em>' attribute.
	 * @see #setOrdered(boolean)
	 * @see telemed.TelemedPackage#getPrescription_Ordered()
	 * @model unique="false"
	 * @generated
	 */
	boolean isOrdered();

	/**
	 * Sets the value of the '{@link telemed.Prescription#isOrdered <em>Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordered</em>' attribute.
	 * @see #isOrdered()
	 * @generated
	 */
	void setOrdered(boolean value);

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
	 * @see telemed.TelemedPackage#getPrescription_Price()
	 * @model unique="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link telemed.Prescription#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

} // Prescription
