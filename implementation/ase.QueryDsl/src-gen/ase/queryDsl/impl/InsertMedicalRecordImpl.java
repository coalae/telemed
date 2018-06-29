/**
 * generated by Xtext 2.12.0.M1
 */
package ase.queryDsl.impl;

import ase.queryDsl.InsertMedicalRecord;
import ase.queryDsl.MedicalCondition;
import ase.queryDsl.QueryDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Medical Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getRecordId <em>Record Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getDoctorId <em>Doctor Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getMedicalCondition <em>Medical Condition</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link ase.queryDsl.impl.InsertMedicalRecordImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertMedicalRecordImpl extends InsertImpl implements InsertMedicalRecord
{
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
   * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected static final String DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected String date = DATE_EDEFAULT;

  /**
   * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected static final String PRICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrice()
   * @generated
   * @ordered
   */
  protected String price = PRICE_EDEFAULT;

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
  protected InsertMedicalRecordImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return QueryDslPackage.Literals.INSERT_MEDICAL_RECORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRecordId()
  {
    return recordId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRecordId(int newRecordId)
  {
    int oldRecordId = recordId;
    recordId = newRecordId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__RECORD_ID, oldRecordId, recordId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPatientId()
  {
    return patientId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPatientId(int newPatientId)
  {
    int oldPatientId = patientId;
    patientId = newPatientId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__PATIENT_ID, oldPatientId, patientId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDoctorId()
  {
    return doctorId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoctorId(int newDoctorId)
  {
    int oldDoctorId = doctorId;
    doctorId = newDoctorId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__DOCTOR_ID, oldDoctorId, doctorId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicalCondition getMedicalCondition()
  {
    return medicalCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMedicalCondition(MedicalCondition newMedicalCondition)
  {
    MedicalCondition oldMedicalCondition = medicalCondition;
    medicalCondition = newMedicalCondition == null ? MEDICAL_CONDITION_EDEFAULT : newMedicalCondition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__MEDICAL_CONDITION, oldMedicalCondition, medicalCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDate()
  {
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDate(String newDate)
  {
    String oldDate = date;
    date = newDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__DATE, oldDate, date));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrice()
  {
    return price;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrice(String newPrice)
  {
    String oldPrice = price;
    price = newPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__PRICE, oldPrice, price));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.INSERT_MEDICAL_RECORD__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case QueryDslPackage.INSERT_MEDICAL_RECORD__RECORD_ID:
        return getRecordId();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PATIENT_ID:
        return getPatientId();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DOCTOR_ID:
        return getDoctorId();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__MEDICAL_CONDITION:
        return getMedicalCondition();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DATE:
        return getDate();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PRICE:
        return getPrice();
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DESCRIPTION:
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QueryDslPackage.INSERT_MEDICAL_RECORD__RECORD_ID:
        setRecordId((Integer)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PATIENT_ID:
        setPatientId((Integer)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DOCTOR_ID:
        setDoctorId((Integer)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__MEDICAL_CONDITION:
        setMedicalCondition((MedicalCondition)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DATE:
        setDate((String)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PRICE:
        setPrice((String)newValue);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DESCRIPTION:
        setDescription((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case QueryDslPackage.INSERT_MEDICAL_RECORD__RECORD_ID:
        setRecordId(RECORD_ID_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PATIENT_ID:
        setPatientId(PATIENT_ID_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DOCTOR_ID:
        setDoctorId(DOCTOR_ID_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__MEDICAL_CONDITION:
        setMedicalCondition(MEDICAL_CONDITION_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DATE:
        setDate(DATE_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PRICE:
        setPrice(PRICE_EDEFAULT);
        return;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DESCRIPTION:
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case QueryDslPackage.INSERT_MEDICAL_RECORD__RECORD_ID:
        return recordId != RECORD_ID_EDEFAULT;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PATIENT_ID:
        return patientId != PATIENT_ID_EDEFAULT;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DOCTOR_ID:
        return doctorId != DOCTOR_ID_EDEFAULT;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__MEDICAL_CONDITION:
        return medicalCondition != MEDICAL_CONDITION_EDEFAULT;
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DATE:
        return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
      case QueryDslPackage.INSERT_MEDICAL_RECORD__PRICE:
        return PRICE_EDEFAULT == null ? price != null : !PRICE_EDEFAULT.equals(price);
      case QueryDslPackage.INSERT_MEDICAL_RECORD__DESCRIPTION:
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
  public String toString()
  {
    if (eIsProxy()) return super.toString();

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

} //InsertMedicalRecordImpl
