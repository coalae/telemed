/**
 * generated by Xtext 2.12.0.M1
 */
package ase.queryDsl.impl;

import ase.queryDsl.QueryDslPackage;
import ase.queryDsl.SelectPatientMonitoring;
import ase.queryDsl.VariablePatientMonitoring;
import ase.queryDsl.WherePatientMonitoring;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select Patient Monitoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.impl.SelectPatientMonitoringImpl#getVariablePatientMonitoring <em>Variable Patient Monitoring</em>}</li>
 *   <li>{@link ase.queryDsl.impl.SelectPatientMonitoringImpl#getVariablePatientMonitoringNext <em>Variable Patient Monitoring Next</em>}</li>
 *   <li>{@link ase.queryDsl.impl.SelectPatientMonitoringImpl#getWhere <em>Where</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectPatientMonitoringImpl extends SelectImpl implements SelectPatientMonitoring
{
  /**
   * The default value of the '{@link #getVariablePatientMonitoring() <em>Variable Patient Monitoring</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablePatientMonitoring()
   * @generated
   * @ordered
   */
  protected static final VariablePatientMonitoring VARIABLE_PATIENT_MONITORING_EDEFAULT = VariablePatientMonitoring.MONITORING_ID;

  /**
   * The cached value of the '{@link #getVariablePatientMonitoring() <em>Variable Patient Monitoring</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablePatientMonitoring()
   * @generated
   * @ordered
   */
  protected VariablePatientMonitoring variablePatientMonitoring = VARIABLE_PATIENT_MONITORING_EDEFAULT;

  /**
   * The cached value of the '{@link #getVariablePatientMonitoringNext() <em>Variable Patient Monitoring Next</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablePatientMonitoringNext()
   * @generated
   * @ordered
   */
  protected EList<VariablePatientMonitoring> variablePatientMonitoringNext;

  /**
   * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhere()
   * @generated
   * @ordered
   */
  protected EList<WherePatientMonitoring> where;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectPatientMonitoringImpl()
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
    return QueryDslPackage.Literals.SELECT_PATIENT_MONITORING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariablePatientMonitoring getVariablePatientMonitoring()
  {
    return variablePatientMonitoring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariablePatientMonitoring(VariablePatientMonitoring newVariablePatientMonitoring)
  {
    VariablePatientMonitoring oldVariablePatientMonitoring = variablePatientMonitoring;
    variablePatientMonitoring = newVariablePatientMonitoring == null ? VARIABLE_PATIENT_MONITORING_EDEFAULT : newVariablePatientMonitoring;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING, oldVariablePatientMonitoring, variablePatientMonitoring));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariablePatientMonitoring> getVariablePatientMonitoringNext()
  {
    if (variablePatientMonitoringNext == null)
    {
      variablePatientMonitoringNext = new EDataTypeEList<VariablePatientMonitoring>(VariablePatientMonitoring.class, this, QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING_NEXT);
    }
    return variablePatientMonitoringNext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WherePatientMonitoring> getWhere()
  {
    if (where == null)
    {
      where = new EObjectContainmentEList<WherePatientMonitoring>(WherePatientMonitoring.class, this, QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE);
    }
    return where;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE:
        return ((InternalEList<?>)getWhere()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING:
        return getVariablePatientMonitoring();
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING_NEXT:
        return getVariablePatientMonitoringNext();
      case QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE:
        return getWhere();
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
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING:
        setVariablePatientMonitoring((VariablePatientMonitoring)newValue);
        return;
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING_NEXT:
        getVariablePatientMonitoringNext().clear();
        getVariablePatientMonitoringNext().addAll((Collection<? extends VariablePatientMonitoring>)newValue);
        return;
      case QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE:
        getWhere().clear();
        getWhere().addAll((Collection<? extends WherePatientMonitoring>)newValue);
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
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING:
        setVariablePatientMonitoring(VARIABLE_PATIENT_MONITORING_EDEFAULT);
        return;
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING_NEXT:
        getVariablePatientMonitoringNext().clear();
        return;
      case QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE:
        getWhere().clear();
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
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING:
        return variablePatientMonitoring != VARIABLE_PATIENT_MONITORING_EDEFAULT;
      case QueryDslPackage.SELECT_PATIENT_MONITORING__VARIABLE_PATIENT_MONITORING_NEXT:
        return variablePatientMonitoringNext != null && !variablePatientMonitoringNext.isEmpty();
      case QueryDslPackage.SELECT_PATIENT_MONITORING__WHERE:
        return where != null && !where.isEmpty();
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
    result.append(" (variablePatientMonitoring: ");
    result.append(variablePatientMonitoring);
    result.append(", variablePatientMonitoringNext: ");
    result.append(variablePatientMonitoringNext);
    result.append(')');
    return result.toString();
  }

} //SelectPatientMonitoringImpl