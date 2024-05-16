/**
 */
package neuralnetwork.neuralnetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Loss</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getLoss()
 * @model
 * @generated
 */
public enum Loss implements Enumerator {
	/**
	 * The '<em><b>BINARY CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_CROSSENTROPY(0, "BINARY_CROSSENTROPY", "BINARY_CROSSENTROPY"),
	/**
	 * The '<em><b>BINARY FOCAL CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #BINARY_FOCAL_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	BINARY_FOCAL_CROSSENTROPY(1, "BINARY_FOCAL_CROSSENTROPY", "BINARY_FOCAL_CROSSENTROPY"),
	/**
	 * The '<em><b>CATEGORICAL CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #CATEGORICAL_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	CATEGORICAL_CROSSENTROPY(2, "CATEGORICAL_CROSSENTROPY", "CATEGORICAL_CROSSENTROPY"),
	/**
	 * The '<em><b>SPARSE CATEGORICAL CROSSENTROPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SPARSE_CATEGORICAL_CROSSENTROPY_VALUE
	 * @generated
	 * @ordered
	 */
	SPARSE_CATEGORICAL_CROSSENTROPY(3, "SPARSE_CATEGORICAL_CROSSENTROPY", "SPARSE_CATEGORICAL_CROSSENTROPY");

	/**
	 * The '<em><b>BINARY CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_CROSSENTROPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_CROSSENTROPY_VALUE = 0;

	/**
	 * The '<em><b>BINARY FOCAL CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BINARY_FOCAL_CROSSENTROPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BINARY_FOCAL_CROSSENTROPY_VALUE = 1;

	/**
	 * The '<em><b>CATEGORICAL CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CATEGORICAL_CROSSENTROPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CATEGORICAL_CROSSENTROPY_VALUE = 2;

	/**
	 * The '<em><b>SPARSE CATEGORICAL CROSSENTROPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARSE_CATEGORICAL_CROSSENTROPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPARSE_CATEGORICAL_CROSSENTROPY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Loss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Loss[] VALUES_ARRAY = new Loss[] { BINARY_CROSSENTROPY, BINARY_FOCAL_CROSSENTROPY,
			CATEGORICAL_CROSSENTROPY, SPARSE_CATEGORICAL_CROSSENTROPY, };

	/**
	 * A public read-only list of all the '<em><b>Loss</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Loss> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Loss get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Loss result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Loss getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Loss result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Loss</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Loss get(int value) {
		switch (value) {
		case BINARY_CROSSENTROPY_VALUE:
			return BINARY_CROSSENTROPY;
		case BINARY_FOCAL_CROSSENTROPY_VALUE:
			return BINARY_FOCAL_CROSSENTROPY;
		case CATEGORICAL_CROSSENTROPY_VALUE:
			return CATEGORICAL_CROSSENTROPY;
		case SPARSE_CATEGORICAL_CROSSENTROPY_VALUE:
			return SPARSE_CATEGORICAL_CROSSENTROPY;
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
	private Loss(int value, String name, String literal) {
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

} //Loss
