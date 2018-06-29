/**
 * generated by Xtext 2.12.0.M1
 */
package ase.queryDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ase.queryDsl.Model#getQueryType <em>Query Type</em>}</li>
 * </ul>
 *
 * @see ase.queryDsl.QueryDslPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Query Type</b></em>' containment reference list.
   * The list contents are of type {@link ase.queryDsl.QueryType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query Type</em>' containment reference list.
   * @see ase.queryDsl.QueryDslPackage#getModel_QueryType()
   * @model containment="true"
   * @generated
   */
  EList<QueryType> getQueryType();

} // Model