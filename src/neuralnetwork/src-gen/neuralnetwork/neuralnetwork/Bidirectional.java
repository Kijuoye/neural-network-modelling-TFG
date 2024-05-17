/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bidirectional</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Bidirectional#getMergeMode <em>Merge Mode</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Bidirectional#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getBidirectional()
 * @model
 * @generated
 */
public interface Bidirectional extends Layer {
	/**
	 * Returns the value of the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' reference.
	 * @see #setLayer(Layer)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getBidirectional_Layer()
	 * @model
	 * @generated
	 */
	Layer getLayer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Bidirectional#getLayer <em>Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Merge Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.MergeMode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Mode</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.MergeMode
	 * @see #setMergeMode(MergeMode)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getBidirectional_MergeMode()
	 * @model
	 * @generated
	 */
	MergeMode getMergeMode();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Bidirectional#getMergeMode <em>Merge Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merge Mode</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.MergeMode
	 * @see #getMergeMode()
	 * @generated
	 */
	void setMergeMode(MergeMode value);

} // Bidirectional
