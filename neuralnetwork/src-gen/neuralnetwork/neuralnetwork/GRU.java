/**
 */
package neuralnetwork.neuralnetwork;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GRU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getUnits <em>Units</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#isReturnSequences <em>Return Sequences</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getRecurrentActivation <em>Recurrent Activation</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getKernelInitializer <em>Kernel Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getRecurrentInitializer <em>Recurrent Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.GRU#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU()
 * @model
 * @generated
 */
public interface GRU extends Layer {
	/**
	 * Returns the value of the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' attribute.
	 * @see #setUnits(int)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_Units()
	 * @model
	 * @generated
	 */
	int getUnits();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getUnits <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' attribute.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(int value);

	/**
	 * Returns the value of the '<em><b>Activation Function</b></em>' attribute.
	 * The default value is <code>"TANH"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.ActivationFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Function</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #setActivationFunction(ActivationFunction)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_ActivationFunction()
	 * @model default="TANH"
	 * @generated
	 */
	ActivationFunction getActivationFunction();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getActivationFunction <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Function</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #getActivationFunction()
	 * @generated
	 */
	void setActivationFunction(ActivationFunction value);

	/**
	 * Returns the value of the '<em><b>Return Sequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Sequences</em>' attribute.
	 * @see #setReturnSequences(boolean)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_ReturnSequences()
	 * @model
	 * @generated
	 */
	boolean isReturnSequences();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#isReturnSequences <em>Return Sequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Sequences</em>' attribute.
	 * @see #isReturnSequences()
	 * @generated
	 */
	void setReturnSequences(boolean value);

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(Layer)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_InitialState()
	 * @model
	 * @generated
	 */
	Layer getInitialState();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(Layer value);

	/**
	 * Returns the value of the '<em><b>Recurrent Activation</b></em>' attribute.
	 * The default value is <code>"SIGMOID"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.ActivationFunction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrent Activation</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #setRecurrentActivation(ActivationFunction)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_RecurrentActivation()
	 * @model default="SIGMOID"
	 * @generated
	 */
	ActivationFunction getRecurrentActivation();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getRecurrentActivation <em>Recurrent Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrent Activation</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see #getRecurrentActivation()
	 * @generated
	 */
	void setRecurrentActivation(ActivationFunction value);

	/**
	 * Returns the value of the '<em><b>Use Bias</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bias</em>' attribute.
	 * @see #setUseBias(boolean)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_UseBias()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseBias();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#isUseBias <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bias</em>' attribute.
	 * @see #isUseBias()
	 * @generated
	 */
	void setUseBias(boolean value);

	/**
	 * Returns the value of the '<em><b>Kernel Initializer</b></em>' attribute.
	 * The default value is <code>"GLOROT_UNIFORM"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setKernelInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_KernelInitializer()
	 * @model default="GLOROT_UNIFORM"
	 * @generated
	 */
	WeightInitializers getKernelInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getKernelInitializer <em>Kernel Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getKernelInitializer()
	 * @generated
	 */
	void setKernelInitializer(WeightInitializers value);

	/**
	 * Returns the value of the '<em><b>Recurrent Initializer</b></em>' attribute.
	 * The default value is <code>"ORTHOGONAL"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recurrent Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setRecurrentInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_RecurrentInitializer()
	 * @model default="ORTHOGONAL"
	 * @generated
	 */
	WeightInitializers getRecurrentInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getRecurrentInitializer <em>Recurrent Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recurrent Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getRecurrentInitializer()
	 * @generated
	 */
	void setRecurrentInitializer(WeightInitializers value);

	/**
	 * Returns the value of the '<em><b>Bias Initializer</b></em>' attribute.
	 * The default value is <code>"ZEROS"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bias Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setBiasInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getGRU_BiasInitializer()
	 * @model default="ZEROS"
	 * @generated
	 */
	WeightInitializers getBiasInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.GRU#getBiasInitializer <em>Bias Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getBiasInitializer()
	 * @generated
	 */
	void setBiasInitializer(WeightInitializers value);

} // GRU
