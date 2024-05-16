/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concatenate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Concatenate#getAxis <em>Axis</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getConcatenate()
 * @model
 * @generated
 */
public interface Concatenate extends Layer {

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * The default value is <code>"-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(int)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getConcatenate_Axis()
	 * @model default="-1"
	 * @generated
	 */
	int getAxis();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Concatenate#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(int value);

} // Concatenate
