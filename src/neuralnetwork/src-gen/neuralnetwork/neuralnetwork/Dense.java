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
 *   <li>{@link neuralnetwork.neuralnetwork.Dense#getKernelInitializer <em>Kernel Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Dense#getBiasInitializer <em>Bias Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Dense#isUseBias <em>Use Bias</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Kernel Initializer</b></em>' attribute.
	 * The default value is <code>"GLOROT_UNIFORM"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernel Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setKernelInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense_KernelInitializer()
	 * @model default="GLOROT_UNIFORM"
	 * @generated
	 */
	WeightInitializers getKernelInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dense#getKernelInitializer <em>Kernel Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernel Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getKernelInitializer()
	 * @generated
	 */
	void setKernelInitializer(WeightInitializers value);

	/**
	 * Returns the value of the '<em><b>Bias Initializer</b></em>' attribute.
	 * The default value is <code>"ZEROS"</code>.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.WeightInitializers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bias Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #setBiasInitializer(WeightInitializers)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense_BiasInitializer()
	 * @model default="ZEROS"
	 * @generated
	 */
	WeightInitializers getBiasInitializer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dense#getBiasInitializer <em>Bias Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bias Initializer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see #getBiasInitializer()
	 * @generated
	 */
	void setBiasInitializer(WeightInitializers value);

	/**
	 * Returns the value of the '<em><b>Use Bias</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Bias</em>' attribute.
	 * @see #setUseBias(boolean)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getDense_UseBias()
	 * @model default="true"
	 * @generated
	 */
	boolean isUseBias();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Dense#isUseBias <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Bias</em>' attribute.
	 * @see #isUseBias()
	 * @generated
	 */
	void setUseBias(boolean value);

} // Dense
