/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dense</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Dense#getUnits <em>Units</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Dense#getActivationFunction <em>Activation Function</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense()
 * @model
 * @generated
 */
public interface Dense extends Layer {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(int)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense_Units()
	 * @model
	 * @generated
	 */
	int getUnits();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dense#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(int value);

	/**
	 * Returns the value of the '<em><b>Activation Function</b></em>' attribute.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.ActivationFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Function</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #setActivationFunction(ActivationFunction)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense_ActivationFunction()
	 * @model
	 * @generated
	 */
	ActivationFunction getActivationFunction();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dense#getActivationFunction <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Function</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #getActivationFunction()
	 * @generated
	 */
	void setActivationFunction(ActivationFunction value);

} // Dense
