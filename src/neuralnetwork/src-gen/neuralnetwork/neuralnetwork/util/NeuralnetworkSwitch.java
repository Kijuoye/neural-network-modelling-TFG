/**
 */
package neuralnetwork.neuralnetwork.util;

import neuralnetwork.neuralnetwork.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage
 * @generated
 */
public class NeuralnetworkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NeuralnetworkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralnetworkSwitch() {
		if (modelPackage == null) {
			modelPackage = NeuralnetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case NeuralnetworkPackage.MODEL: {
			Model model = (Model) theEObject;
			T result = caseModel(model);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.LAYER: {
			Layer layer = (Layer) theEObject;
			T result = caseLayer(layer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = caseLayer(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.DENSE: {
			Dense dense = (Dense) theEObject;
			T result = caseDense(dense);
			if (result == null)
				result = caseLayer(dense);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.CONCATENATE: {
			Concatenate concatenate = (Concatenate) theEObject;
			T result = caseConcatenate(concatenate);
			if (result == null)
				result = caseLayer(concatenate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.EMBEDDING: {
			Embedding embedding = (Embedding) theEObject;
			T result = caseEmbedding(embedding);
			if (result == null)
				result = caseLayer(embedding);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.GRU: {
			GRU gru = (GRU) theEObject;
			T result = caseGRU(gru);
			if (result == null)
				result = caseLayer(gru);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.DROPOUT: {
			Dropout dropout = (Dropout) theEObject;
			T result = caseDropout(dropout);
			if (result == null)
				result = caseLayer(dropout);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.BIDIRECTIONAL: {
			Bidirectional bidirectional = (Bidirectional) theEObject;
			T result = caseBidirectional(bidirectional);
			if (result == null)
				result = caseLayer(bidirectional);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case NeuralnetworkPackage.CUSTOM_LAYER: {
			CustomLayer customLayer = (CustomLayer) theEObject;
			T result = caseCustomLayer(customLayer);
			if (result == null)
				result = caseLayer(customLayer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLayer(Layer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDense(Dense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenate(Concatenate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbedding(Embedding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GRU</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GRU</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGRU(GRU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dropout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dropout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDropout(Dropout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bidirectional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bidirectional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBidirectional(Bidirectional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Layer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Layer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLayer(CustomLayer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NeuralnetworkSwitch
