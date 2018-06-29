/**
 */
package telemed;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymized Data Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.AnonymizedDataQuery#getGender <em>Gender</em>}</li>
 *   <li>{@link telemed.AnonymizedDataQuery#getMedicalCondition <em>Medical Condition</em>}</li>
 *   <li>{@link telemed.AnonymizedDataQuery#getHeight <em>Height</em>}</li>
 *   <li>{@link telemed.AnonymizedDataQuery#getWeight <em>Weight</em>}</li>
 *   <li>{@link telemed.AnonymizedDataQuery#getCity <em>City</em>}</li>
 *   <li>{@link telemed.AnonymizedDataQuery#getBirthYear <em>Birth Year</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getAnonymizedDataQuery()
 * @model
 * @generated
 */
public interface AnonymizedDataQuery extends EObject {
	/**
	 * Returns the value of the '<em><b>Gender</b></em>' attribute.
	 * The literals are from the enumeration {@link telemed.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gender</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gender</em>' attribute.
	 * @see telemed.Gender
	 * @see #setGender(Gender)
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_Gender()
	 * @model
	 * @generated
	 */
	Gender getGender();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getGender <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gender</em>' attribute.
	 * @see telemed.Gender
	 * @see #getGender()
	 * @generated
	 */
	void setGender(Gender value);

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
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_MedicalCondition()
	 * @model
	 * @generated
	 */
	MedicalCondition getMedicalCondition();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getMedicalCondition <em>Medical Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Medical Condition</em>' attribute.
	 * @see telemed.MedicalCondition
	 * @see #getMedicalCondition()
	 * @generated
	 */
	void setMedicalCondition(MedicalCondition value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>City</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Birth Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Birth Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Birth Year</em>' attribute.
	 * @see #setBirthYear(int)
	 * @see telemed.TelemedPackage#getAnonymizedDataQuery_BirthYear()
	 * @model
	 * @generated
	 */
	int getBirthYear();

	/**
	 * Sets the value of the '{@link telemed.AnonymizedDataQuery#getBirthYear <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Birth Year</em>' attribute.
	 * @see #getBirthYear()
	 * @generated
	 */
	void setBirthYear(int value);

} // AnonymizedDataQuery
