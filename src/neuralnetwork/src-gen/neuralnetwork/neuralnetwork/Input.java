/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Input#getShape <em>Shape</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Input#getDtype <em>Dtype</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Input#isSparse <em>Sparse</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getInput()
 * @model
 * @generated
 */
public interface Input extends Layer {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getInput_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Input#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

	/**
	 * Returns the value of the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dtype</em>' attribute.
	 * @see #setDtype(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getInput_Dtype()
	 * @model
	 * @generated
	 */
	String getDtype();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Input#getDtype <em>Dtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dtype</em>' attribute.
	 * @see #getDtype()
	 * @generated
	 */
	void setDtype(String value);

	/**
	 * Returns the value of the '<em><b>Sparse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sparse</em>' attribute.
	 * @see #setSparse(boolean)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getInput_Sparse()
	 * @model
	 * @generated
	 */
	boolean isSparse();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Input#isSparse <em>Sparse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sparse</em>' attribute.
	 * @see #isSparse()
	 * @generated
	 */
	void setSparse(boolean value);

} // Input
