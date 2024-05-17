/**
 */
package neuralnetwork.neuralnetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Weight Initializers</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getWeightInitializers()
 * @model
 * @generated
 */
public enum WeightInitializers implements Enumerator {
	/**
	 * The '<em><b>RANDOM UNIFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_UNIFORM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_UNIFORM(0, "RANDOM_UNIFORM", "RANDOM_UNIFORM"),

	/**
	 * The '<em><b>RANDOM NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_NORMAL(1, "RANDOM_NORMAL", "RANDOM_NORMAL"),

	/**
	 * The '<em><b>CONSTANT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT_VALUE
	 * @generated
	 * @ordered
	 */
	CONSTANT(2, "CONSTANT", "CONSTANT"),

	/**
	 * The '<em><b>TRUNCATED NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNCATED_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	TRUNCATED_NORMAL(3, "TRUNCATED_NORMAL", "TRUNCATED_NORMAL"),

	/**
	 * The '<em><b>ORTHOGONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOGONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORTHOGONAL(5, "ORTHOGONAL", "ORTHOGONAL"),

	/**
	 * The '<em><b>IDENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY(6, "IDENTITY", "IDENTITY"),
	/**
	 * The '<em><b>ONES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ONES_VALUE
	 * @generated
	 * @ordered
	 */
	ONES(6, "ONES", "ONES"),
	/**
	 * The '<em><b>ZEROS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ZEROS_VALUE
	 * @generated
	 * @ordered
	 */
	ZEROS(7, "ZEROS", "ZEROS"),
	/**
	 * The '<em><b>GLOROT UNIFORM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #GLOROT_UNIFORM_VALUE
	 * @generated
	 * @ordered
	 */
	GLOROT_UNIFORM(8, "GLOROT_UNIFORM", "GLOROT_UNIFORM");

	/**
	 * The '<em><b>RANDOM UNIFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_UNIFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_UNIFORM_VALUE = 0;

	/**
	 * The '<em><b>RANDOM NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANDOM_NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_NORMAL_VALUE = 1;

	/**
	 * The '<em><b>CONSTANT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONSTANT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONSTANT_VALUE = 2;

	/**
	 * The '<em><b>TRUNCATED NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRUNCATED_NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRUNCATED_NORMAL_VALUE = 3;

	/**
	 * The '<em><b>ORTHOGONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORTHOGONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORTHOGONAL_VALUE = 5;

	/**
	 * The '<em><b>IDENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_VALUE = 6;

	/**
	 * The '<em><b>ONES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONES_VALUE = 6;

	/**
	 * The '<em><b>ZEROS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEROS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ZEROS_VALUE = 7;

	/**
	 * The '<em><b>GLOROT UNIFORM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLOROT_UNIFORM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GLOROT_UNIFORM_VALUE = 8;

	/**
	 * An array of all the '<em><b>Weight Initializers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WeightInitializers[] VALUES_ARRAY = new WeightInitializers[] { RANDOM_UNIFORM, RANDOM_NORMAL,
			CONSTANT, TRUNCATED_NORMAL, ORTHOGONAL, IDENTITY, ONES, ZEROS, GLOROT_UNIFORM, };

	/**
	 * A public read-only list of all the '<em><b>Weight Initializers</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WeightInitializers> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Weight Initializers</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeightInitializers get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeightInitializers result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight Initializers</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeightInitializers getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WeightInitializers result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Weight Initializers</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static WeightInitializers get(int value) {
		switch (value) {
		case RANDOM_UNIFORM_VALUE:
			return RANDOM_UNIFORM;
		case RANDOM_NORMAL_VALUE:
			return RANDOM_NORMAL;
		case CONSTANT_VALUE:
			return CONSTANT;
		case TRUNCATED_NORMAL_VALUE:
			return TRUNCATED_NORMAL;
		case ORTHOGONAL_VALUE:
			return ORTHOGONAL;
		case IDENTITY_VALUE:
			return IDENTITY;
		case ZEROS_VALUE:
			return ZEROS;
		case GLOROT_UNIFORM_VALUE:
			return GLOROT_UNIFORM;
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
	private WeightInitializers(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //WeightInitializers
