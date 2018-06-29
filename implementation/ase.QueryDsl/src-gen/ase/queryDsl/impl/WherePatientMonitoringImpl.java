/**
 * generated by Xtext 2.12.0.M1
 */
package ase.queryDsl.impl;

import ase.queryDsl.MedicalCondition;
import ase.queryDsl.QueryDslPackage;
import ase.queryDsl.RiskPerception;
import ase.queryDsl.WherePatientMonitoring;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Where Patient Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getMonitoringId <em>Monitoring Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getDate <em>Date</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getRiskperception <em>Riskperception</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getTreated <em>Treated</em>}</li>
 *   <li>{@link ase.queryDsl.impl.WherePatientMonitoringImpl#getDeviceId <em>Device Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WherePatientMonitoringImpl extends MinimalEObjectImpl.Container implements WherePatientMonitoring
{
  /**
   * The cached value of the '{@link #getMonitoringId() <em>Monitoring Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonitoringId()
   * @generated
   * @ordered
   */
  protected EList<Integer> monitoringId;

  /**
   * The cached value of the '{@link #getPatientId() <em>Patient Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPatientId()
   * @generated
   * @ordered
   */
  protected EList<Integer> patientId;

  /**
   * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected EList<MedicalCondition> category;

  /**
   * The cached value of the '{@link #getDate() <em>Date</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDate()
   * @generated
   * @ordered
   */
  protected EList<String> date;

  /**
   * The cached value of the '{@link #getRiskperception() <em>Riskperception</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskperception()
   * @generated
   * @ordered
   */
  protected EList<RiskPerception> riskperception;

  /**
   * The cached value of the '{@link #getTreated() <em>Treated</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTreated()
   * @generated
   * @ordered
   */
  protected EList<String> treated;

  /**
   * The cached value of the '{@link #getDeviceId() <em>Device Id</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeviceId()
   * @generated
   * @ordered
   */
  protected EList<Integer> deviceId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WherePatientMonitoringImpl()
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
    return QueryDslPackage.Literals.WHERE_PATIENT_MONITORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getMonitoringId()
  {
    if (monitoringId == null)
    {
      monitoringId = new EDataTypeEList<Integer>(Integer.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__MONITORING_ID);
    }
    return monitoringId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getPatientId()
  {
    if (patientId == null)
    {
      patientId = new EDataTypeEList<Integer>(Integer.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__PATIENT_ID);
    }
    return patientId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicalCondition> getCategory()
  {
    if (category == null)
    {
      category = new EDataTypeEList<MedicalCondition>(MedicalCondition.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__CATEGORY);
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDate()
  {
    if (date == null)
    {
      date = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__DATE);
    }
    return date;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RiskPerception> getRiskperception()
  {
    if (riskperception == null)
    {
      riskperception = new EDataTypeEList<RiskPerception>(RiskPerception.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__RISKPERCEPTION);
    }
    return riskperception;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getTreated()
  {
    if (treated == null)
    {
      treated = new EDataTypeEList<String>(String.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__TREATED);
    }
    return treated;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getDeviceId()
  {
    if (deviceId == null)
    {
      deviceId = new EDataTypeEList<Integer>(Integer.class, this, QueryDslPackage.WHERE_PATIENT_MONITORING__DEVICE_ID);
    }
    return deviceId;
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
      case QueryDslPackage.WHERE_PATIENT_MONITORING__MONITORING_ID:
        return getMonitoringId();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__PATIENT_ID:
        return getPatientId();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__CATEGORY:
        return getCategory();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DATE:
        return getDate();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__RISKPERCEPTION:
        return getRiskperception();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__TREATED:
        return getTreated();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DEVICE_ID:
        return getDeviceId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case QueryDslPackage.WHERE_PATIENT_MONITORING__MONITORING_ID:
        getMonitoringId().clear();
        getMonitoringId().addAll((Collection<? extends Integer>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__PATIENT_ID:
        getPatientId().clear();
        getPatientId().addAll((Collection<? extends Integer>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__CATEGORY:
        getCategory().clear();
        getCategory().addAll((Collection<? extends MedicalCondition>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DATE:
        getDate().clear();
        getDate().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__RISKPERCEPTION:
        getRiskperception().clear();
        getRiskperception().addAll((Collection<? extends RiskPerception>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__TREATED:
        getTreated().clear();
        getTreated().addAll((Collection<? extends String>)newValue);
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DEVICE_ID:
        getDeviceId().clear();
        getDeviceId().addAll((Collection<? extends Integer>)newValue);
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
      case QueryDslPackage.WHERE_PATIENT_MONITORING__MONITORING_ID:
        getMonitoringId().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__PATIENT_ID:
        getPatientId().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__CATEGORY:
        getCategory().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DATE:
        getDate().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__RISKPERCEPTION:
        getRiskperception().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__TREATED:
        getTreated().clear();
        return;
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DEVICE_ID:
        getDeviceId().clear();
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
      case QueryDslPackage.WHERE_PATIENT_MONITORING__MONITORING_ID:
        return monitoringId != null && !monitoringId.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__PATIENT_ID:
        return patientId != null && !patientId.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__CATEGORY:
        return category != null && !category.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DATE:
        return date != null && !date.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__RISKPERCEPTION:
        return riskperception != null && !riskperception.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__TREATED:
        return treated != null && !treated.isEmpty();
      case QueryDslPackage.WHERE_PATIENT_MONITORING__DEVICE_ID:
        return deviceId != null && !deviceId.isEmpty();
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
    result.append(" (monitoringId: ");
    result.append(monitoringId);
    result.append(", patientId: ");
    result.append(patientId);
    result.append(", category: ");
    result.append(category);
    result.append(", date: ");
    result.append(date);
    result.append(", riskperception: ");
    result.append(riskperception);
    result.append(", treated: ");
    result.append(treated);
    result.append(", deviceId: ");
    result.append(deviceId);
    result.append(')');
    return result.toString();
  }

} //WherePatientMonitoringImpl
