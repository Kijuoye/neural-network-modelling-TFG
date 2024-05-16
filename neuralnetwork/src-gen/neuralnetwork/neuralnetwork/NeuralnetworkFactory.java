/**
 */
package neuralnetwork.neuralnetwork;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage
 * @generated
 */
public interface NeuralnetworkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeuralnetworkFactory eINSTANCE = neuralnetwork.neuralnetwork.impl.NeuralnetworkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input</em>'.
	 * @generated
	 */
	Input createInput();

	/**
	 * Returns a new object of class '<em>Dense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dense</em>'.
	 * @generated
	 */
	Dense createDense();

	/**
	 * Returns a new object of class '<em>Concatenate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concatenate</em>'.
	 * @generated
	 */
	Concatenate createConcatenate();

	/**
	 * Returns a new object of class '<em>Embedding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedding</em>'.
	 * @generated
	 */
	Embedding createEmbedding();

	/**
	 * Returns a new object of class '<em>GRU</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GRU</em>'.
	 * @generated
	 */
	GRU createGRU();

	/**
	 * Returns a new object of class '<em>Dropout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dropout</em>'.
	 * @generated
	 */
	Dropout createDropout();

	/**
	 * Returns a new object of class '<em>Bidirectional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bidirectional</em>'.
	 * @generated
	 */
	Bidirectional createBidirectional();

	/**
	 * Returns a new object of class '<em>Custom Layer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Layer</em>'.
	 * @generated
	 */
	CustomLayer createCustomLayer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NeuralnetworkPackage getNeuralnetworkPackage();

} //NeuralnetworkFactory
