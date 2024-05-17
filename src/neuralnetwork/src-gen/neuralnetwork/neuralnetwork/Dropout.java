/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dropout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Dropout#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDropout()
 * @model
 * @generated
 */
public interface Dropout extends Layer {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(float)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDropout_Rate()
	 * @model default="0.5"
	 * @generated
	 */
	float getRate();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dropout#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(float value);

} // Dropout
