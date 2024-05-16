/**
 */
package neuralnetwork.neuralnetwork;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getName <em>Name</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getLayers <em>Layers</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getLoss <em>Loss</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getOutputLayers <em>Output Layers</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Model#getInputLayers <em>Input Layers</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Model#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link neuralnetwork.neuralnetwork.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

	/**
	 * Returns the value of the '<em><b>Optimizer</b></em>' attribute.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.Optimizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optimizer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.Optimizer
	 * @see #setOptimizer(Optimizer)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_Optimizer()
	 * @model
	 * @generated
	 */
	Optimizer getOptimizer();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Model#getOptimizer <em>Optimizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optimizer</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.Optimizer
	 * @see #getOptimizer()
	 * @generated
	 */
	void setOptimizer(Optimizer value);

	/**
	 * Returns the value of the '<em><b>Loss</b></em>' attribute.
	 * The literals are from the enumeration {@link neuralnetwork.neuralnetwork.Loss}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loss</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.Loss
	 * @see #setLoss(Loss)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_Loss()
	 * @model
	 * @generated
	 */
	Loss getLoss();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Model#getLoss <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loss</em>' attribute.
	 * @see neuralnetwork.neuralnetwork.Loss
	 * @see #getLoss()
	 * @generated
	 */
	void setLoss(Loss value);

	/**
	 * Returns the value of the '<em><b>Output Layers</b></em>' reference list.
	 * The list contents are of type {@link neuralnetwork.neuralnetwork.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Layers</em>' reference list.
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_OutputLayers()
	 * @model required="true"
	 * @generated
	 */
	EList<Layer> getOutputLayers();

	/**
	 * Returns the value of the '<em><b>Input Layers</b></em>' reference list.
	 * The list contents are of type {@link neuralnetwork.neuralnetwork.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Layers</em>' reference list.
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getModel_InputLayers()
	 * @model required="true"
	 * @generated
	 */
	EList<Layer> getInputLayers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Layer> orderOfLayers();

} // Model
