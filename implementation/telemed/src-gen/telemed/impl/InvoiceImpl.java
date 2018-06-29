/**
 */
package telemed.impl;

import java.io.Serializable;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.Invoice;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.InvoiceImpl#getInvoiceID <em>Invoice ID</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getInvoiceDate <em>Invoice Date</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getCreditorId <em>Creditor Id</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getTopic <em>Topic</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#isPaid <em>Paid</em>}</li>
 *   <li>{@link telemed.impl.InvoiceImpl#getPaidDate <em>Paid Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvoiceImpl extends MinimalEObjectImpl.Container implements Invoice, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getInvoiceID() <em>Invoice ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceID()
	 * @generated
	 * @ordered
	 */
	protected static final int INVOICE_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInvoiceID() <em>Invoice ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceID()
	 * @generated
	 * @ordered
	 */
	protected int invoiceID = INVOICE_ID_EDEFAULT;

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
	 * The default value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar INVOICE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvoiceDate() <em>Invoice Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvoiceDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar invoiceDate = INVOICE_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar dueDate = DUE_DATE_EDEFAULT;

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
	 * The default value of the '{@link #getCreditorId() <em>Creditor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditorId()
	 * @generated
	 * @ordered
	 */
	protected static final int CREDITOR_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreditorId() <em>Creditor Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditorId()
	 * @generated
	 * @ordered
	 */
	protected int creditorId = CREDITOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected static final String TOPIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected String topic = TOPIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean paid = PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar PAID_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaidDate() <em>Paid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaidDate()
	 * @generated
	 * @ordered
	 */
	protected Calendar paidDate = PAID_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvoiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.INVOICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInvoiceID() {
		return invoiceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceID(int newInvoiceID) {
		int oldInvoiceID = invoiceID;
		invoiceID = newInvoiceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__INVOICE_ID, oldInvoiceID,
					invoiceID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__PATIENT_ID, oldPatientId,
					patientId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getInvoiceDate() {
		return invoiceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvoiceDate(Calendar newInvoiceDate) {
		Calendar oldInvoiceDate = invoiceDate;
		invoiceDate = newInvoiceDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__INVOICE_DATE, oldInvoiceDate,
					invoiceDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDueDate(Calendar newDueDate) {
		Calendar oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__DUE_DATE, oldDueDate,
					dueDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreditorId() {
		return creditorId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditorId(int newCreditorId) {
		int oldCreditorId = creditorId;
		creditorId = newCreditorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__CREDITOR_ID, oldCreditorId,
					creditorId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(String newTopic) {
		String oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return paid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaid(boolean newPaid) {
		boolean oldPaid = paid;
		paid = newPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__PAID, oldPaid, paid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getPaidDate() {
		return paidDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaidDate(Calendar newPaidDate) {
		Calendar oldPaidDate = paidDate;
		paidDate = newPaidDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.INVOICE__PAID_DATE, oldPaidDate,
					paidDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.INVOICE__INVOICE_ID:
			return getInvoiceID();
		case TelemedPackage.INVOICE__PATIENT_ID:
			return getPatientId();
		case TelemedPackage.INVOICE__INVOICE_DATE:
			return getInvoiceDate();
		case TelemedPackage.INVOICE__DUE_DATE:
			return getDueDate();
		case TelemedPackage.INVOICE__PRICE:
			return getPrice();
		case TelemedPackage.INVOICE__CREDITOR_ID:
			return getCreditorId();
		case TelemedPackage.INVOICE__TOPIC:
			return getTopic();
		case TelemedPackage.INVOICE__PAID:
			return isPaid();
		case TelemedPackage.INVOICE__PAID_DATE:
			return getPaidDate();
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
		case TelemedPackage.INVOICE__INVOICE_ID:
			setInvoiceID((Integer) newValue);
			return;
		case TelemedPackage.INVOICE__PATIENT_ID:
			setPatientId((Integer) newValue);
			return;
		case TelemedPackage.INVOICE__INVOICE_DATE:
			setInvoiceDate((Calendar) newValue);
			return;
		case TelemedPackage.INVOICE__DUE_DATE:
			setDueDate((Calendar) newValue);
			return;
		case TelemedPackage.INVOICE__PRICE:
			setPrice((Double) newValue);
			return;
		case TelemedPackage.INVOICE__CREDITOR_ID:
			setCreditorId((Integer) newValue);
			return;
		case TelemedPackage.INVOICE__TOPIC:
			setTopic((String) newValue);
			return;
		case TelemedPackage.INVOICE__PAID:
			setPaid((Boolean) newValue);
			return;
		case TelemedPackage.INVOICE__PAID_DATE:
			setPaidDate((Calendar) newValue);
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
		case TelemedPackage.INVOICE__INVOICE_ID:
			setInvoiceID(INVOICE_ID_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__PATIENT_ID:
			setPatientId(PATIENT_ID_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__INVOICE_DATE:
			setInvoiceDate(INVOICE_DATE_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__DUE_DATE:
			setDueDate(DUE_DATE_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__PRICE:
			setPrice(PRICE_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__CREDITOR_ID:
			setCreditorId(CREDITOR_ID_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__TOPIC:
			setTopic(TOPIC_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__PAID:
			setPaid(PAID_EDEFAULT);
			return;
		case TelemedPackage.INVOICE__PAID_DATE:
			setPaidDate(PAID_DATE_EDEFAULT);
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
		case TelemedPackage.INVOICE__INVOICE_ID:
			return invoiceID != INVOICE_ID_EDEFAULT;
		case TelemedPackage.INVOICE__PATIENT_ID:
			return patientId != PATIENT_ID_EDEFAULT;
		case TelemedPackage.INVOICE__INVOICE_DATE:
			return INVOICE_DATE_EDEFAULT == null ? invoiceDate != null : !INVOICE_DATE_EDEFAULT.equals(invoiceDate);
		case TelemedPackage.INVOICE__DUE_DATE:
			return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
		case TelemedPackage.INVOICE__PRICE:
			return price != PRICE_EDEFAULT;
		case TelemedPackage.INVOICE__CREDITOR_ID:
			return creditorId != CREDITOR_ID_EDEFAULT;
		case TelemedPackage.INVOICE__TOPIC:
			return TOPIC_EDEFAULT == null ? topic != null : !TOPIC_EDEFAULT.equals(topic);
		case TelemedPackage.INVOICE__PAID:
			return paid != PAID_EDEFAULT;
		case TelemedPackage.INVOICE__PAID_DATE:
			return PAID_DATE_EDEFAULT == null ? paidDate != null : !PAID_DATE_EDEFAULT.equals(paidDate);
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
		result.append(" (invoiceID: ");
		result.append(invoiceID);
		result.append(", patientId: ");
		result.append(patientId);
		result.append(", invoiceDate: ");
		result.append(invoiceDate);
		result.append(", dueDate: ");
		result.append(dueDate);
		result.append(", price: ");
		result.append(price);
		result.append(", creditorId: ");
		result.append(creditorId);
		result.append(", topic: ");
		result.append(topic);
		result.append(", paid: ");
		result.append(paid);
		result.append(", paidDate: ");
		result.append(paidDate);
		result.append(')');
		return result.toString();
	}

} //InvoiceImpl
