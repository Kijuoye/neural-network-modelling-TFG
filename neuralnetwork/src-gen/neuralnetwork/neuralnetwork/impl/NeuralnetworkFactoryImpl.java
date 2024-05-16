/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeuralnetworkFactoryImpl extends EFactoryImpl implements NeuralnetworkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NeuralnetworkFactory init() {
		try {
			NeuralnetworkFactory theNeuralnetworkFactory = (NeuralnetworkFactory) EPackage.Registry.INSTANCE
					.getEFactory(NeuralnetworkPackage.eNS_URI);
			if (theNeuralnetworkFactory != null) {
				return theNeuralnetworkFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NeuralnetworkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NeuralnetworkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NeuralnetworkPackage.MODEL:
			return createModel();
		case NeuralnetworkPackage.INPUT:
			return createInput();
		case NeuralnetworkPackage.DENSE:
			return createDense();
		case NeuralnetworkPackage.CONCATENATE:
			return createConcatenate();
		case NeuralnetworkPackage.EMBEDDING:
			return createEmbedding();
		case NeuralnetworkPackage.GRU:
			return createGRU();
		case NeuralnetworkPackage.DROPOUT:
			return createDropout();
		case NeuralnetworkPackage.BIDIRECTIONAL:
			return createBidirectional();
		case NeuralnetworkPackage.CUSTOM_LAYER:
			return createCustomLayer();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case NeuralnetworkPackage.ACTIVATION_FUNCTION:
			return createActivationFunctionFromString(eDataType, initialValue);
		case NeuralnetworkPackage.OPTIMIZER:
			return createOptimizerFromString(eDataType, initialValue);
		case NeuralnetworkPackage.LOSS:
			return createLossFromString(eDataType, initialValue);
		case NeuralnetworkPackage.MERGE_MODE:
			return createMergeModeFromString(eDataType, initialValue);
		case NeuralnetworkPackage.WEIGHT_INITIALIZERS:
			return createWeightInitializersFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case NeuralnetworkPackage.ACTIVATION_FUNCTION:
			return convertActivationFunctionToString(eDataType, instanceValue);
		case NeuralnetworkPackage.OPTIMIZER:
			return convertOptimizerToString(eDataType, instanceValue);
		case NeuralnetworkPackage.LOSS:
			return convertLossToString(eDataType, instanceValue);
		case NeuralnetworkPackage.MERGE_MODE:
			return convertMergeModeToString(eDataType, instanceValue);
		case NeuralnetworkPackage.WEIGHT_INITIALIZERS:
			return convertWeightInitializersToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel() {
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dense createDense() {
		DenseImpl dense = new DenseImpl();
		return dense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concatenate createConcatenate() {
		ConcatenateImpl concatenate = new ConcatenateImpl();
		return concatenate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Embedding createEmbedding() {
		EmbeddingImpl embedding = new EmbeddingImpl();
		return embedding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GRU createGRU() {
		GRUImpl gru = new GRUImpl();
		return gru;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dropout createDropout() {
		DropoutImpl dropout = new DropoutImpl();
		return dropout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bidirectional createBidirectional() {
		BidirectionalImpl bidirectional = new BidirectionalImpl();
		return bidirectional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomLayer createCustomLayer() {
		CustomLayerImpl customLayer = new CustomLayerImpl();
		return customLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivationFunction createActivationFunctionFromString(EDataType eDataType, String initialValue) {
		ActivationFunction result = ActivationFunction.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActivationFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Optimizer createOptimizerFromString(EDataType eDataType, String initialValue) {
		Optimizer result = Optimizer.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOptimizerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loss createLossFromString(EDataType eDataType, String initialValue) {
		Loss result = Loss.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLossToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MergeMode createMergeModeFromString(EDataType eDataType, String initialValue) {
		MergeMode result = MergeMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMergeModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeightInitializers createWeightInitializersFromString(EDataType eDataType, String initialValue) {
		WeightInitializers result = WeightInitializers.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeightInitializersToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeuralnetworkPackage getNeuralnetworkPackage() {
		return (NeuralnetworkPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NeuralnetworkPackage getPackage() {
		return NeuralnetworkPackage.eINSTANCE;
	}

} //NeuralnetworkFactoryImpl
