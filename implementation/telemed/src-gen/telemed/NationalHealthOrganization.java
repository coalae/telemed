/**
 */
package telemed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>National Health Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link telemed.NationalHealthOrganization#getContact <em>Contact</em>}</li>
 * </ul>
 *
 * @see telemed.TelemedPackage#getNationalHealthOrganization()
 * @model
 * @generated
 */
public interface NationalHealthOrganization extends User {
	/**
	 * Returns the value of the '<em><b>Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact</em>' attribute.
	 * @see #setContact(String)
	 * @see telemed.TelemedPackage#getNationalHealthOrganization_Contact()
	 * @model unique="false"
	 * @generated
	 */
	String getContact();

	/**
	 * Sets the value of the '{@link telemed.NationalHealthOrganization#getContact <em>Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contact</em>' attribute.
	 * @see #getContact()
	 * @generated
	 */
	void setContact(String value);

} // NationalHealthOrganization
