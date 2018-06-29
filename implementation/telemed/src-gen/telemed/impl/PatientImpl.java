/**
 */
package telemed.impl;

import java.io.Serializable;
import java.util.Calendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import telemed.Gender;
import telemed.Patient;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.PatientImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getSvnr <em>Svnr</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link telemed.impl.PatientImpl#getBirthdate <em>Birthdate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatientImpl extends UserImpl implements Patient, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSvnr() <em>Svnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvnr()
	 * @generated
	 * @ordered
	 */
	protected static final String SVNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSvnr() <em>Svnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSvnr()
	 * @generated
	 * @ordered
	 */
	protected String svnr = SVNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected static final Gender GENDER_EDEFAULT = Gender.FEMALE;

	/**
	 * The cached value of the '{@link #getGender() <em>Gender</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGender()
	 * @generated
	 * @ordered
	 */
	protected Gender gender = GENDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Calendar BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Calendar birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.PATIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__FIRSTNAME, oldFirstname,
					firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__LASTNAME, oldLastname,
					lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSvnr() {
		return svnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSvnr(String newSvnr) {
		String oldSvnr = svnr;
		svnr = newSvnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__SVNR, oldSvnr, svnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGender(Gender newGender) {
		Gender oldGender = gender;
		gender = newGender == null ? GENDER_EDEFAULT : newGender;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__GENDER, oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Calendar getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Calendar newBirthdate) {
		Calendar oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.PATIENT__BIRTHDATE, oldBirthdate,
					birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.PATIENT__FIRSTNAME:
			return getFirstname();
		case TelemedPackage.PATIENT__LASTNAME:
			return getLastname();
		case TelemedPackage.PATIENT__SVNR:
			return getSvnr();
		case TelemedPackage.PATIENT__WEIGHT:
			return getWeight();
		case TelemedPackage.PATIENT__HEIGHT:
			return getHeight();
		case TelemedPackage.PATIENT__GENDER:
			return getGender();
		case TelemedPackage.PATIENT__BIRTHDATE:
			return getBirthdate();
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
		case TelemedPackage.PATIENT__FIRSTNAME:
			setFirstname((String) newValue);
			return;
		case TelemedPackage.PATIENT__LASTNAME:
			setLastname((String) newValue);
			return;
		case TelemedPackage.PATIENT__SVNR:
			setSvnr((String) newValue);
			return;
		case TelemedPackage.PATIENT__WEIGHT:
			setWeight((Double) newValue);
			return;
		case TelemedPackage.PATIENT__HEIGHT:
			setHeight((Double) newValue);
			return;
		case TelemedPackage.PATIENT__GENDER:
			setGender((Gender) newValue);
			return;
		case TelemedPackage.PATIENT__BIRTHDATE:
			setBirthdate((Calendar) newValue);
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
		case TelemedPackage.PATIENT__FIRSTNAME:
			setFirstname(FIRSTNAME_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__LASTNAME:
			setLastname(LASTNAME_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__SVNR:
			setSvnr(SVNR_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case TelemedPackage.PATIENT__BIRTHDATE:
			setBirthdate(BIRTHDATE_EDEFAULT);
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
		case TelemedPackage.PATIENT__FIRSTNAME:
			return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
		case TelemedPackage.PATIENT__LASTNAME:
			return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
		case TelemedPackage.PATIENT__SVNR:
			return SVNR_EDEFAULT == null ? svnr != null : !SVNR_EDEFAULT.equals(svnr);
		case TelemedPackage.PATIENT__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case TelemedPackage.PATIENT__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case TelemedPackage.PATIENT__GENDER:
			return gender != GENDER_EDEFAULT;
		case TelemedPackage.PATIENT__BIRTHDATE:
			return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", svnr: ");
		result.append(svnr);
		result.append(", weight: ");
		result.append(weight);
		result.append(", height: ");
		result.append(height);
		result.append(", gender: ");
		result.append(gender);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(')');
		return result.toString();
	}

} //PatientImpl
