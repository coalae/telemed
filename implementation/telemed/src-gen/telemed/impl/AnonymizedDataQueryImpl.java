/**
 */
package telemed.impl;

import java.io.Serializable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import telemed.AnonymizedDataQuery;
import telemed.Gender;
import telemed.MedicalCondition;
import telemed.TelemedPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymized Data Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getGender <em>Gender</em>}</li>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getMedicalCondition <em>Medical Condition</em>}</li>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getCity <em>City</em>}</li>
 *   <li>{@link telemed.impl.AnonymizedDataQueryImpl#getBirthYear <em>Birth Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymizedDataQueryImpl extends MinimalEObjectImpl.Container implements AnonymizedDataQuery, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected static final int BIRTH_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBirthYear() <em>Birth Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthYear()
	 * @generated
	 * @ordered
	 */
	protected int birthYear = BIRTH_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymizedDataQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelemedPackage.Literals.ANONYMIZED_DATA_QUERY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.ANONYMIZED_DATA_QUERY__GENDER,
					oldGender, gender));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicalCondition getMedicalCondition() {
		return medicalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedicalCondition(MedicalCondition newMedicalCondition) {
		MedicalCondition oldMedicalCondition = medicalCondition;
		medicalCondition = newMedicalCondition == null ? MEDICAL_CONDITION_EDEFAULT : newMedicalCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TelemedPackage.ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION, oldMedicalCondition, medicalCondition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.ANONYMIZED_DATA_QUERY__HEIGHT,
					oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.ANONYMIZED_DATA_QUERY__WEIGHT,
					oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.ANONYMIZED_DATA_QUERY__CITY, oldCity,
					city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBirthYear() {
		return birthYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthYear(int newBirthYear) {
		int oldBirthYear = birthYear;
		birthYear = newBirthYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelemedPackage.ANONYMIZED_DATA_QUERY__BIRTH_YEAR,
					oldBirthYear, birthYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TelemedPackage.ANONYMIZED_DATA_QUERY__GENDER:
			return getGender();
		case TelemedPackage.ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION:
			return getMedicalCondition();
		case TelemedPackage.ANONYMIZED_DATA_QUERY__HEIGHT:
			return getHeight();
		case TelemedPackage.ANONYMIZED_DATA_QUERY__WEIGHT:
			return getWeight();
		case TelemedPackage.ANONYMIZED_DATA_QUERY__CITY:
			return getCity();
		case TelemedPackage.ANONYMIZED_DATA_QUERY__BIRTH_YEAR:
			return getBirthYear();
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
		case TelemedPackage.ANONYMIZED_DATA_QUERY__GENDER:
			setGender((Gender) newValue);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION:
			setMedicalCondition((MedicalCondition) newValue);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__HEIGHT:
			setHeight((Double) newValue);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__WEIGHT:
			setWeight((Double) newValue);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__CITY:
			setCity((String) newValue);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__BIRTH_YEAR:
			setBirthYear((Integer) newValue);
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
		case TelemedPackage.ANONYMIZED_DATA_QUERY__GENDER:
			setGender(GENDER_EDEFAULT);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION:
			setMedicalCondition(MEDICAL_CONDITION_EDEFAULT);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__BIRTH_YEAR:
			setBirthYear(BIRTH_YEAR_EDEFAULT);
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
		case TelemedPackage.ANONYMIZED_DATA_QUERY__GENDER:
			return gender != GENDER_EDEFAULT;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__MEDICAL_CONDITION:
			return medicalCondition != MEDICAL_CONDITION_EDEFAULT;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case TelemedPackage.ANONYMIZED_DATA_QUERY__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case TelemedPackage.ANONYMIZED_DATA_QUERY__BIRTH_YEAR:
			return birthYear != BIRTH_YEAR_EDEFAULT;
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
		result.append(" (gender: ");
		result.append(gender);
		result.append(", medicalCondition: ");
		result.append(medicalCondition);
		result.append(", height: ");
		result.append(height);
		result.append(", weight: ");
		result.append(weight);
		result.append(", city: ");
		result.append(city);
		result.append(", birthYear: ");
		result.append(birthYear);
		result.append(')');
		return result.toString();
	}

} //AnonymizedDataQueryImpl
