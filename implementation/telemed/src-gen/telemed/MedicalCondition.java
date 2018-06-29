/**
 */
package telemed;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Medical Condition</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see telemed.TelemedPackage#getMedicalCondition()
 * @model
 * @generated
 */
public enum MedicalCondition implements Enumerator {
	/**
	 * The '<em><b>Bronchitis</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRONCHITIS_VALUE
	 * @generated
	 * @ordered
	 */
	BRONCHITIS(0, "Bronchitis", "Bronchitis"),

	/**
	 * The '<em><b>Asthma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASTHMA_VALUE
	 * @generated
	 * @ordered
	 */
	ASTHMA(1, "Asthma", "Asthma"),

	/**
	 * The '<em><b>Diabetes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIABETES_VALUE
	 * @generated
	 * @ordered
	 */
	DIABETES(2, "Diabetes", "Diabetes"),

	/**
	 * The '<em><b>Flu</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLU_VALUE
	 * @generated
	 * @ordered
	 */
	FLU(3, "Flu", "Flu"),

	/**
	 * The '<em><b>Hypertension</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HYPERTENSION_VALUE
	 * @generated
	 * @ordered
	 */
	HYPERTENSION(4, "Hypertension", "Hypertension");

	/**
	 * The '<em><b>Bronchitis</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bronchitis</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRONCHITIS
	 * @model name="Bronchitis"
	 * @generated
	 * @ordered
	 */
	public static final int BRONCHITIS_VALUE = 0;

	/**
	 * The '<em><b>Asthma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asthma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASTHMA
	 * @model name="Asthma"
	 * @generated
	 * @ordered
	 */
	public static final int ASTHMA_VALUE = 1;

	/**
	 * The '<em><b>Diabetes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Diabetes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIABETES
	 * @model name="Diabetes"
	 * @generated
	 * @ordered
	 */
	public static final int DIABETES_VALUE = 2;

	/**
	 * The '<em><b>Flu</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Flu</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLU
	 * @model name="Flu"
	 * @generated
	 * @ordered
	 */
	public static final int FLU_VALUE = 3;

	/**
	 * The '<em><b>Hypertension</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hypertension</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HYPERTENSION
	 * @model name="Hypertension"
	 * @generated
	 * @ordered
	 */
	public static final int HYPERTENSION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Medical Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicalCondition[] VALUES_ARRAY = new MedicalCondition[] { BRONCHITIS, ASTHMA, DIABETES, FLU,
			HYPERTENSION, };

	/**
	 * A public read-only list of all the '<em><b>Medical Condition</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicalCondition> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medical Condition</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicalCondition get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicalCondition result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medical Condition</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicalCondition getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicalCondition result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medical Condition</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MedicalCondition get(int value) {
		switch (value) {
		case BRONCHITIS_VALUE:
			return BRONCHITIS;
		case ASTHMA_VALUE:
			return ASTHMA;
		case DIABETES_VALUE:
			return DIABETES;
		case FLU_VALUE:
			return FLU;
		case HYPERTENSION_VALUE:
			return HYPERTENSION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MedicalCondition(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //MedicalCondition
