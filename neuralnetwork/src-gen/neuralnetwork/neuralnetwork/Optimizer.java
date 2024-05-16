/**
 */
package neuralnetwork.neuralnetwork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Optimizer</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getOptimizer()
 * @model
 * @generated
 */
public enum Optimizer implements Enumerator {
	/**
	 * The '<em><b>SGD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGD_VALUE
	 * @generated
	 * @ordered
	 */
	SGD(0, "SGD", "SGD"),

	/**
	 * The '<em><b>RMSPROP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RMSPROP_VALUE
	 * @generated
	 * @ordered
	 */
	RMSPROP(1, "RMSPROP", "RMSPROP"),
	/**
	 * The '<em><b>ADAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #ADAM_VALUE
	 * @generated
	 * @ordered
	 */
	ADAM(2, "ADAM", "ADAM");

	/**
	 * The '<em><b>SGD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SGD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SGD_VALUE = 0;

	/**
	 * The '<em><b>RMSPROP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RMSPROP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RMSPROP_VALUE = 1;

	/**
	 * The '<em><b>ADAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADAM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Optimizer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Optimizer[] VALUES_ARRAY = new Optimizer[] { SGD, RMSPROP, ADAM, };

	/**
	 * A public read-only list of all the '<em><b>Optimizer</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Optimizer> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Optimizer</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimizer get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Optimizer result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimizer</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimizer getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Optimizer result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Optimizer</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Optimizer get(int value) {
		switch (value) {
		case SGD_VALUE:
			return SGD;
		case RMSPROP_VALUE:
			return RMSPROP;
		case ADAM_VALUE:
			return ADAM;
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
	private Optimizer(int value, String name, String literal) {
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

} //Optimizer
