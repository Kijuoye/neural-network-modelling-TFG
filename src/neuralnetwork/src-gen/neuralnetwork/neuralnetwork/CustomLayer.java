/**
 */
package neuralnetwork.neuralnetwork;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.CustomLayer#getInitArguments <em>Init Arguments</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.CustomLayer#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getCustomLayer()
 * @model
 * @generated
 */
public interface CustomLayer extends Layer {

	/**
	 * Returns the value of the '<em><b>Init Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Arguments</em>' attribute.
	 * @see #setInitArguments(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getCustomLayer_InitArguments()
	 * @model
	 * @generated
	 */
	String getInitArguments();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.CustomLayer#getInitArguments <em>Init Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Arguments</em>' attribute.
	 * @see #getInitArguments()
	 * @generated
	 */
	void setInitArguments(String value);

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#getCustomLayer_ClassName()
	 * @model required="true"
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link neuralnetwork.neuralnetwork.CustomLayer#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getInitArgumentsParsed();
} // CustomLayer
