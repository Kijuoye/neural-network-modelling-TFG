/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Embedding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Embedding#getInputDim <em>Input Dim</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Embedding#getOutputDim <em>Output Dim</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Embedding#isMaskZero <em>Mask Zero</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Embedding#getEmbeddingsInitializer <em>Embeddings Initializer</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getEmbedding()
 * @model
 * @generated
 */
public interface Embedding extends Layer {
	/**
	 * Returns the value of the '<em><b>Input Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Dim</em>' attribute.
	 * @see #setInputDim(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getEmbedding_InputDim()
	 * @model
	 * @generated
	 */
	String getInputDim();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Embedding#getInputDim <em>Input Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Dim</em>' attribute.
	 * @see #getInputDim()
	 * @generated
	 */
	void setInputDim(String value);

	/**
	 * Returns the value of the '<em><b>Output Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Dim</em>' attribute.
	 * @see #setOutputDim(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getEmbedding_OutputDim()
	 * @model
	 * @generated
	 */
	String getOutputDim();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Embedding#getOutputDim <em>Output Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Dim</em>' attribute.
	 * @see #getOutputDim()
	 * @generated
	 */
	void setOutputDim(String value);

	/**
	 * Returns the value of the '<em><b>Mask Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask Zero</em>' attribute.
	 * @see #setMaskZero(boolean)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getEmbedding_MaskZero()
	 * @model
	 * @generated
	 */
	boolean isMaskZero();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Embedding#isMaskZero <em>Mask Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask Zero</em>' attribute.
	 * @see #isMaskZero()
	 * @generated
	 */
	void setMaskZero(boolean value);

	/**
	 * Returns the value of the '<em><b>Embeddings Initializer</b></em>' attribute.
	 * The default value is <code>"RANDOM_UNIFORM"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embeddings Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setEmbeddingsInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getEmbedding_EmbeddingsInitializer()
	 * @model default="RANDOM_UNIFORM"
	 * @generated
	 */
	WeightInitializers getEmbeddingsInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Embedding#getEmbeddingsInitializer <em>Embeddings Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embeddings Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getEmbeddingsInitializer()
	 * @generated
	 */
	void setEmbeddingsInitializer(WeightInitializers value);

} // Embedding
