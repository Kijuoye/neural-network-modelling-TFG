/**
 */
package neuralnetwork.neuralnetwork;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.Layer#getName <em>Name</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.Layer#getPreviousLayers <em>Previous Layers</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getLayer()
 * @model abstract="true"
 * @generated
 */
public interface Layer extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getLayer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.Layer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Previous Layers</b></em>' reference list.
	 * The list contents are of type {@link neuralnetwork.neuralnetwork.Layer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Layers</em>' reference list.
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getLayer_PreviousLayers()
	 * @model
	 * @generated
	 */
	EList<Layer> getPreviousLayers();
} // Layer
