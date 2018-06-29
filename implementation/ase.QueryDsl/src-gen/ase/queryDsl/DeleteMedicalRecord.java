/**
 * generated by Xtext 2.12.0.M1
 */
package ase.queryDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delete Medical Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.DeleteMedicalRecord#getWhereMedicalRecord <em>Where Medical Record</em>}</li>
 * </ul>
 *
 * @see ase.queryDsl.QueryDslPackage#getDeleteMedicalRecord()
 * @model
 * @generated
 */
public interface DeleteMedicalRecord extends Delete
{
  /**
   * Returns the value of the '<em><b>Where Medical Record</b></em>' containment reference list.
   * The list contents are of type {@link ase.queryDsl.WhereMedicalRecord}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Where Medical Record</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Where Medical Record</em>' containment reference list.
   * @see ase.queryDsl.QueryDslPackage#getDeleteMedicalRecord_WhereMedicalRecord()
   * @model containment="true"
   * @generated
   */
  EList<WhereMedicalRecord> getWhereMedicalRecord();

} // DeleteMedicalRecord
