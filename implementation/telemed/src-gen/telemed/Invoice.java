/**
 */
package telemed;

import java.util.Calendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.Invoice#getInvoiceID <em>Invoice ID</em>}</li>
 *   <li>{@link telemed.Invoice#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.Invoice#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link telemed.Invoice#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link telemed.Invoice#getPrice <em>Price</em>}</li>
 *   <li>{@link telemed.Invoice#getCreditorId <em>Creditor Id</em>}</li>
 *   <li>{@link telemed.Invoice#getTopic <em>Topic</em>}</li>
 *   <li>{@link telemed.Invoice#isPaid <em>Paid</em>}</li>
 *   <li>{@link telemed.Invoice#getPaidDate <em>Paid Date</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getInvoice()
 * @model
 * @generated
 */
public interface Invoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Invoice ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice ID</em>' attribute.
	 * @see #setInvoiceID(int)
	 * @see telemed.TelemedPackage#getInvoice_InvoiceID()
	 * @model id="true"
	 * @generated
	 */
	int getInvoiceID();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getInvoiceID <em>Invoice ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice ID</em>' attribute.
	 * @see #getInvoiceID()
	 * @generated
	 */
	void setInvoiceID(int value);

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
	 * @see telemed.TelemedPackage#getInvoice_PatientId()
	 * @model unique="false"
	 * @generated
	 */
	int getPatientId();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getPatientId <em>Patient Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Id</em>' attribute.
	 * @see #getPatientId()
	 * @generated
	 */
	void setPatientId(int value);

	/**
	 * Returns the value of the '<em><b>Invoice Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invoice Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invoice Date</em>' attribute.
	 * @see #setInvoiceDate(Calendar)
	 * @see telemed.TelemedPackage#getInvoice_InvoiceDate()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getInvoiceDate();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getInvoiceDate <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invoice Date</em>' attribute.
	 * @see #getInvoiceDate()
	 * @generated
	 */
	void setInvoiceDate(Calendar value);

	/**
	 * Returns the value of the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Due Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due Date</em>' attribute.
	 * @see #setDueDate(Calendar)
	 * @see telemed.TelemedPackage#getInvoice_DueDate()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getDueDate();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getDueDate <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due Date</em>' attribute.
	 * @see #getDueDate()
	 * @generated
	 */
	void setDueDate(Calendar value);

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
	 * @see telemed.TelemedPackage#getInvoice_Price()
	 * @model unique="false"
	 * @generated
	 */
	double getPrice();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getPrice <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Price</em>' attribute.
	 * @see #getPrice()
	 * @generated
	 */
	void setPrice(double value);

	/**
	 * Returns the value of the '<em><b>Creditor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Creditor Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Creditor Id</em>' attribute.
	 * @see #setCreditorId(int)
	 * @see telemed.TelemedPackage#getInvoice_CreditorId()
	 * @model unique="false"
	 * @generated
	 */
	int getCreditorId();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getCreditorId <em>Creditor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creditor Id</em>' attribute.
	 * @see #getCreditorId()
	 * @generated
	 */
	void setCreditorId(int value);

	/**
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topic</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see telemed.TelemedPackage#getInvoice_Topic()
	 * @model unique="false"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

	/**
	 * Returns the value of the '<em><b>Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid</em>' attribute.
	 * @see #setPaid(boolean)
	 * @see telemed.TelemedPackage#getInvoice_Paid()
	 * @model unique="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link telemed.Invoice#isPaid <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Paid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paid Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paid Date</em>' attribute.
	 * @see #setPaidDate(Calendar)
	 * @see telemed.TelemedPackage#getInvoice_PaidDate()
	 * @model unique="false" dataType="telemed.Calendar"
	 * @generated
	 */
	Calendar getPaidDate();

	/**
	 * Sets the value of the '{@link telemed.Invoice#getPaidDate <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paid Date</em>' attribute.
	 * @see #getPaidDate()
	 * @generated
	 */
	void setPaidDate(Calendar value);

} // Invoice
