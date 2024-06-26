/**
 */
package neuralnetwork.neuralnetwork.util;

import neuralnetwork.neuralnetwork.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage
 * @generated
 */
public class NeuralnetworkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NeuralnetworkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralnetworkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NeuralnetworkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NeuralnetworkSwitch<Adapter> modelSwitch = new NeuralnetworkSwitch<Adapter>() {
		@Override
		public Adapter caseModel(Model object) {
			return createModelAdapter();
		}

		@Override
		public Adapter caseLayer(Layer object) {
			return createLayerAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseDense(Dense object) {
			return createDenseAdapter();
		}

		@Override
		public Adapter caseConcatenate(Concatenate object) {
			return createConcatenateAdapter();
		}

		@Override
		public Adapter caseEmbedding(Embedding object) {
			return createEmbeddingAdapter();
		}

		@Override
		public Adapter caseGRU(GRU object) {
			return createGRUAdapter();
		}

		@Override
		public Adapter caseDropout(Dropout object) {
			return createDropoutAdapter();
		}

		@Override
		public Adapter caseBidirectional(Bidirectional object) {
			return createBidirectionalAdapter();
		}

		@Override
		public Adapter caseCustomLayer(CustomLayer object) {
			return createCustomLayerAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Model
	 * @generated
	 */
	public Adapter createModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Layer
	 * @generated
	 */
	public Adapter createLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Dense <em>Dense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Dense
	 * @generated
	 */
	public Adapter createDenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Concatenate <em>Concatenate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Concatenate
	 * @generated
	 */
	public Adapter createConcatenateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Embedding <em>Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Embedding
	 * @generated
	 */
	public Adapter createEmbeddingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.GRU <em>GRU</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.GRU
	 * @generated
	 */
	public Adapter createGRUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Dropout <em>Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Dropout
	 * @generated
	 */
	public Adapter createDropoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.Bidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.Bidirectional
	 * @generated
	 */
	public Adapter createBidirectionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link neuralnetwork.neuralnetwork.CustomLayer <em>Custom Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see neuralnetwork.neuralnetwork.CustomLayer
	 * @generated
	 */
	public Adapter createCustomLayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NeuralnetworkAdapterFactory
