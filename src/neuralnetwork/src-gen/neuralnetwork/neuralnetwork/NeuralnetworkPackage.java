/**
 */
package neuralnetwork.neuralnetwork;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see neuralnetwork.neuralnetwork.NeuralnetworkFactory
 * @model kind="package"
 * @generated
 */
public interface NeuralnetworkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "neuralnetwork";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/neuralnetwork";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "neuralnetwork";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NeuralnetworkPackage eINSTANCE = neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl.init();

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.ModelImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LAYERS = 1;

	/**
	 * The feature id for the '<em><b>Optimizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPTIMIZER = 2;

	/**
	 * The feature id for the '<em><b>Loss</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__LOSS = 3;

	/**
	 * The feature id for the '<em><b>Output Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OUTPUT_LAYERS = 4;

	/**
	 * The feature id for the '<em><b>Input Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__INPUT_LAYERS = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Order Of Layers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL___ORDER_OF_LAYERS = 0;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.LayerImpl <em>Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.LayerImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getLayer()
	 * @generated
	 */
	int LAYER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER__PREVIOUS_LAYERS = 1;

	/**
	 * The number of structural features of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.InputImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SHAPE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__DTYPE = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sparse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SPARSE = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.DenseImpl <em>Dense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.DenseImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getDense()
	 * @generated
	 */
	int DENSE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__UNITS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__ACTIVATION_FUNCTION = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kernel Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__KERNEL_INITIALIZER = LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__BIAS_INITIALIZER = LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE__USE_BIAS = LAYER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Dense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DENSE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.ConcatenateImpl <em>Concatenate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.ConcatenateImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getConcatenate()
	 * @generated
	 */
	int CONCATENATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__AXIS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_FEATURE_COUNT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl <em>Embedding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.EmbeddingImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getEmbedding()
	 * @generated
	 */
	int EMBEDDING = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Input Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__INPUT_DIM = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Dim</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__OUTPUT_DIM = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mask Zero</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__MASK_ZERO = LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Embeddings Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__EMBEDDINGS_INITIALIZER = LAYER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_FEATURE_COUNT = LAYER_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.GRUImpl <em>GRU</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.GRUImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getGRU()
	 * @generated
	 */
	int GRU = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__UNITS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activation Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__ACTIVATION_FUNCTION = LAYER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Sequences</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__RETURN_SEQUENCES = LAYER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__INITIAL_STATE = LAYER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Recurrent Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__RECURRENT_ACTIVATION = LAYER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Use Bias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__USE_BIAS = LAYER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Kernel Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__KERNEL_INITIALIZER = LAYER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Recurrent Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__RECURRENT_INITIALIZER = LAYER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Bias Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU__BIAS_INITIALIZER = LAYER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>GRU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU_FEATURE_COUNT = LAYER_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>GRU</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRU_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.DropoutImpl <em>Dropout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.DropoutImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getDropout()
	 * @generated
	 */
	int DROPOUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT__RATE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_FEATURE_COUNT = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dropout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DROPOUT_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.BidirectionalImpl <em>Bidirectional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.BidirectionalImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getBidirectional()
	 * @generated
	 */
	int BIDIRECTIONAL = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Merge Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL__MERGE_MODE = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL__LAYER = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bidirectional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bidirectional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIDIRECTIONAL_OPERATION_COUNT = LAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.impl.CustomLayerImpl <em>Custom Layer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.impl.CustomLayerImpl
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getCustomLayer()
	 * @generated
	 */
	int CUSTOM_LAYER = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER__NAME = LAYER__NAME;

	/**
	 * The feature id for the '<em><b>Previous Layers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER__PREVIOUS_LAYERS = LAYER__PREVIOUS_LAYERS;

	/**
	 * The feature id for the '<em><b>Init Arguments</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER__INIT_ARGUMENTS = LAYER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER__CLASS_NAME = LAYER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Custom Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER_FEATURE_COUNT = LAYER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Init Arguments Parsed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER___GET_INIT_ARGUMENTS_PARSED = LAYER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Layer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LAYER_OPERATION_COUNT = LAYER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.ActivationFunction <em>Activation Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getActivationFunction()
	 * @generated
	 */
	int ACTIVATION_FUNCTION = 10;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.Optimizer <em>Optimizer</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.Optimizer
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getOptimizer()
	 * @generated
	 */
	int OPTIMIZER = 11;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.Loss <em>Loss</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.Loss
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getLoss()
	 * @generated
	 */
	int LOSS = 12;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.MergeMode <em>Merge Mode</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.MergeMode
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getMergeMode()
	 * @generated
	 */
	int MERGE_MODE = 13;

	/**
	 * The meta object id for the '{@link neuralnetwork.neuralnetwork.WeightInitializers <em>Weight Initializers</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getWeightInitializers()
	 * @generated
	 */
	int WEIGHT_INITIALIZERS = 14;

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see neuralnetwork.neuralnetwork.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Model#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getName()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link neuralnetwork.neuralnetwork.Model#getLayers <em>Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Layers</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getLayers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Layers();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Model#getOptimizer <em>Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optimizer</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getOptimizer()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Optimizer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Model#getLoss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loss</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getLoss()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_Loss();

	/**
	 * Returns the meta object for the reference list '{@link neuralnetwork.neuralnetwork.Model#getOutputLayers <em>Output Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Layers</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getOutputLayers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_OutputLayers();

	/**
	 * Returns the meta object for the reference list '{@link neuralnetwork.neuralnetwork.Model#getInputLayers <em>Input Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Layers</em>'.
	 * @see neuralnetwork.neuralnetwork.Model#getInputLayers()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_InputLayers();

	/**
	 * Returns the meta object for the '{@link neuralnetwork.neuralnetwork.Model#orderOfLayers() <em>Order Of Layers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Order Of Layers</em>' operation.
	 * @see neuralnetwork.neuralnetwork.Model#orderOfLayers()
	 * @generated
	 */
	EOperation getModel__OrderOfLayers();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Layer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layer</em>'.
	 * @see neuralnetwork.neuralnetwork.Layer
	 * @generated
	 */
	EClass getLayer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Layer#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see neuralnetwork.neuralnetwork.Layer#getName()
	 * @see #getLayer()
	 * @generated
	 */
	EAttribute getLayer_Name();

	/**
	 * Returns the meta object for the reference list '{@link neuralnetwork.neuralnetwork.Layer#getPreviousLayers <em>Previous Layers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Previous Layers</em>'.
	 * @see neuralnetwork.neuralnetwork.Layer#getPreviousLayers()
	 * @see #getLayer()
	 * @generated
	 */
	EReference getLayer_PreviousLayers();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see neuralnetwork.neuralnetwork.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Input#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see neuralnetwork.neuralnetwork.Input#getShape()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Shape();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Input#getDtype <em>Dtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dtype</em>'.
	 * @see neuralnetwork.neuralnetwork.Input#getDtype()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Dtype();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Input#isSparse <em>Sparse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sparse</em>'.
	 * @see neuralnetwork.neuralnetwork.Input#isSparse()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Sparse();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Dense <em>Dense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dense</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense
	 * @generated
	 */
	EClass getDense();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dense#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense#getUnits()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_Units();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dense#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Function</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense#getActivationFunction()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_ActivationFunction();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dense#getKernelInitializer <em>Kernel Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense#getKernelInitializer()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_KernelInitializer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dense#getBiasInitializer <em>Bias Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bias Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense#getBiasInitializer()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_BiasInitializer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dense#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see neuralnetwork.neuralnetwork.Dense#isUseBias()
	 * @see #getDense()
	 * @generated
	 */
	EAttribute getDense_UseBias();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Concatenate <em>Concatenate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenate</em>'.
	 * @see neuralnetwork.neuralnetwork.Concatenate
	 * @generated
	 */
	EClass getConcatenate();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Concatenate#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see neuralnetwork.neuralnetwork.Concatenate#getAxis()
	 * @see #getConcatenate()
	 * @generated
	 */
	EAttribute getConcatenate_Axis();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Embedding <em>Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedding</em>'.
	 * @see neuralnetwork.neuralnetwork.Embedding
	 * @generated
	 */
	EClass getEmbedding();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Embedding#getInputDim <em>Input Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Dim</em>'.
	 * @see neuralnetwork.neuralnetwork.Embedding#getInputDim()
	 * @see #getEmbedding()
	 * @generated
	 */
	EAttribute getEmbedding_InputDim();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Embedding#getOutputDim <em>Output Dim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Dim</em>'.
	 * @see neuralnetwork.neuralnetwork.Embedding#getOutputDim()
	 * @see #getEmbedding()
	 * @generated
	 */
	EAttribute getEmbedding_OutputDim();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Embedding#isMaskZero <em>Mask Zero</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask Zero</em>'.
	 * @see neuralnetwork.neuralnetwork.Embedding#isMaskZero()
	 * @see #getEmbedding()
	 * @generated
	 */
	EAttribute getEmbedding_MaskZero();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Embedding#getEmbeddingsInitializer <em>Embeddings Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embeddings Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.Embedding#getEmbeddingsInitializer()
	 * @see #getEmbedding()
	 * @generated
	 */
	EAttribute getEmbedding_EmbeddingsInitializer();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.GRU <em>GRU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRU</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU
	 * @generated
	 */
	EClass getGRU();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getUnits()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_Units();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Activation Function</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getActivationFunction()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_ActivationFunction();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#isReturnSequences <em>Return Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Sequences</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#isReturnSequences()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_ReturnSequences();

	/**
	 * Returns the meta object for the reference '{@link neuralnetwork.neuralnetwork.GRU#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getInitialState()
	 * @see #getGRU()
	 * @generated
	 */
	EReference getGRU_InitialState();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getRecurrentActivation <em>Recurrent Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrent Activation</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getRecurrentActivation()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_RecurrentActivation();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#isUseBias <em>Use Bias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Bias</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#isUseBias()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_UseBias();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getKernelInitializer <em>Kernel Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernel Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getKernelInitializer()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_KernelInitializer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getRecurrentInitializer <em>Recurrent Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recurrent Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getRecurrentInitializer()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_RecurrentInitializer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.GRU#getBiasInitializer <em>Bias Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bias Initializer</em>'.
	 * @see neuralnetwork.neuralnetwork.GRU#getBiasInitializer()
	 * @see #getGRU()
	 * @generated
	 */
	EAttribute getGRU_BiasInitializer();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Dropout <em>Dropout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dropout</em>'.
	 * @see neuralnetwork.neuralnetwork.Dropout
	 * @generated
	 */
	EClass getDropout();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Dropout#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see neuralnetwork.neuralnetwork.Dropout#getRate()
	 * @see #getDropout()
	 * @generated
	 */
	EAttribute getDropout_Rate();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.Bidirectional <em>Bidirectional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bidirectional</em>'.
	 * @see neuralnetwork.neuralnetwork.Bidirectional
	 * @generated
	 */
	EClass getBidirectional();

	/**
	 * Returns the meta object for the reference '{@link neuralnetwork.neuralnetwork.Bidirectional#getLayer <em>Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Layer</em>'.
	 * @see neuralnetwork.neuralnetwork.Bidirectional#getLayer()
	 * @see #getBidirectional()
	 * @generated
	 */
	EReference getBidirectional_Layer();

	/**
	 * Returns the meta object for class '{@link neuralnetwork.neuralnetwork.CustomLayer <em>Custom Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Layer</em>'.
	 * @see neuralnetwork.neuralnetwork.CustomLayer
	 * @generated
	 */
	EClass getCustomLayer();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.CustomLayer#getInitArguments <em>Init Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Init Arguments</em>'.
	 * @see neuralnetwork.neuralnetwork.CustomLayer#getInitArguments()
	 * @see #getCustomLayer()
	 * @generated
	 */
	EAttribute getCustomLayer_InitArguments();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.CustomLayer#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see neuralnetwork.neuralnetwork.CustomLayer#getClassName()
	 * @see #getCustomLayer()
	 * @generated
	 */
	EAttribute getCustomLayer_ClassName();

	/**
	 * Returns the meta object for the '{@link neuralnetwork.neuralnetwork.CustomLayer#getInitArgumentsParsed() <em>Get Init Arguments Parsed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Init Arguments Parsed</em>' operation.
	 * @see neuralnetwork.neuralnetwork.CustomLayer#getInitArgumentsParsed()
	 * @generated
	 */
	EOperation getCustomLayer__GetInitArgumentsParsed();

	/**
	 * Returns the meta object for the attribute '{@link neuralnetwork.neuralnetwork.Bidirectional#getMergeMode <em>Merge Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merge Mode</em>'.
	 * @see neuralnetwork.neuralnetwork.Bidirectional#getMergeMode()
	 * @see #getBidirectional()
	 * @generated
	 */
	EAttribute getBidirectional_MergeMode();

	/**
	 * Returns the meta object for enum '{@link neuralnetwork.neuralnetwork.ActivationFunction <em>Activation Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Activation Function</em>'.
	 * @see neuralnetwork.neuralnetwork.ActivationFunction
	 * @generated
	 */
	EEnum getActivationFunction();

	/**
	 * Returns the meta object for enum '{@link neuralnetwork.neuralnetwork.Optimizer <em>Optimizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Optimizer</em>'.
	 * @see neuralnetwork.neuralnetwork.Optimizer
	 * @generated
	 */
	EEnum getOptimizer();

	/**
	 * Returns the meta object for enum '{@link neuralnetwork.neuralnetwork.Loss <em>Loss</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Loss</em>'.
	 * @see neuralnetwork.neuralnetwork.Loss
	 * @generated
	 */
	EEnum getLoss();

	/**
	 * Returns the meta object for enum '{@link neuralnetwork.neuralnetwork.MergeMode <em>Merge Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Merge Mode</em>'.
	 * @see neuralnetwork.neuralnetwork.MergeMode
	 * @generated
	 */
	EEnum getMergeMode();

	/**
	 * Returns the meta object for enum '{@link neuralnetwork.neuralnetwork.WeightInitializers <em>Weight Initializers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Weight Initializers</em>'.
	 * @see neuralnetwork.neuralnetwork.WeightInitializers
	 * @generated
	 */
	EEnum getWeightInitializers();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NeuralnetworkFactory getNeuralnetworkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.ModelImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

		/**
		 * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__LAYERS = eINSTANCE.getModel_Layers();

		/**
		 * The meta object literal for the '<em><b>Optimizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__OPTIMIZER = eINSTANCE.getModel_Optimizer();

		/**
		 * The meta object literal for the '<em><b>Loss</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__LOSS = eINSTANCE.getModel_Loss();

		/**
		 * The meta object literal for the '<em><b>Output Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OUTPUT_LAYERS = eINSTANCE.getModel_OutputLayers();

		/**
		 * The meta object literal for the '<em><b>Input Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__INPUT_LAYERS = eINSTANCE.getModel_InputLayers();

		/**
		 * The meta object literal for the '<em><b>Order Of Layers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MODEL___ORDER_OF_LAYERS = eINSTANCE.getModel__OrderOfLayers();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.LayerImpl <em>Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.LayerImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getLayer()
		 * @generated
		 */
		EClass LAYER = eINSTANCE.getLayer();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYER__NAME = eINSTANCE.getLayer_Name();

		/**
		 * The meta object literal for the '<em><b>Previous Layers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYER__PREVIOUS_LAYERS = eINSTANCE.getLayer_PreviousLayers();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.InputImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SHAPE = eINSTANCE.getInput_Shape();

		/**
		 * The meta object literal for the '<em><b>Dtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__DTYPE = eINSTANCE.getInput_Dtype();

		/**
		 * The meta object literal for the '<em><b>Sparse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__SPARSE = eINSTANCE.getInput_Sparse();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.DenseImpl <em>Dense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.DenseImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getDense()
		 * @generated
		 */
		EClass DENSE = eINSTANCE.getDense();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__UNITS = eINSTANCE.getDense_Units();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__ACTIVATION_FUNCTION = eINSTANCE.getDense_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Kernel Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__KERNEL_INITIALIZER = eINSTANCE.getDense_KernelInitializer();

		/**
		 * The meta object literal for the '<em><b>Bias Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__BIAS_INITIALIZER = eINSTANCE.getDense_BiasInitializer();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DENSE__USE_BIAS = eINSTANCE.getDense_UseBias();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.ConcatenateImpl <em>Concatenate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.ConcatenateImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getConcatenate()
		 * @generated
		 */
		EClass CONCATENATE = eINSTANCE.getConcatenate();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONCATENATE__AXIS = eINSTANCE.getConcatenate_Axis();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl <em>Embedding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.EmbeddingImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getEmbedding()
		 * @generated
		 */
		EClass EMBEDDING = eINSTANCE.getEmbedding();

		/**
		 * The meta object literal for the '<em><b>Input Dim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDING__INPUT_DIM = eINSTANCE.getEmbedding_InputDim();

		/**
		 * The meta object literal for the '<em><b>Output Dim</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDING__OUTPUT_DIM = eINSTANCE.getEmbedding_OutputDim();

		/**
		 * The meta object literal for the '<em><b>Mask Zero</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDING__MASK_ZERO = eINSTANCE.getEmbedding_MaskZero();

		/**
		 * The meta object literal for the '<em><b>Embeddings Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMBEDDING__EMBEDDINGS_INITIALIZER = eINSTANCE.getEmbedding_EmbeddingsInitializer();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.GRUImpl <em>GRU</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.GRUImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getGRU()
		 * @generated
		 */
		EClass GRU = eINSTANCE.getGRU();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__UNITS = eINSTANCE.getGRU_Units();

		/**
		 * The meta object literal for the '<em><b>Activation Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__ACTIVATION_FUNCTION = eINSTANCE.getGRU_ActivationFunction();

		/**
		 * The meta object literal for the '<em><b>Return Sequences</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__RETURN_SEQUENCES = eINSTANCE.getGRU_ReturnSequences();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRU__INITIAL_STATE = eINSTANCE.getGRU_InitialState();

		/**
		 * The meta object literal for the '<em><b>Recurrent Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__RECURRENT_ACTIVATION = eINSTANCE.getGRU_RecurrentActivation();

		/**
		 * The meta object literal for the '<em><b>Use Bias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__USE_BIAS = eINSTANCE.getGRU_UseBias();

		/**
		 * The meta object literal for the '<em><b>Kernel Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__KERNEL_INITIALIZER = eINSTANCE.getGRU_KernelInitializer();

		/**
		 * The meta object literal for the '<em><b>Recurrent Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__RECURRENT_INITIALIZER = eINSTANCE.getGRU_RecurrentInitializer();

		/**
		 * The meta object literal for the '<em><b>Bias Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRU__BIAS_INITIALIZER = eINSTANCE.getGRU_BiasInitializer();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.DropoutImpl <em>Dropout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.DropoutImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getDropout()
		 * @generated
		 */
		EClass DROPOUT = eINSTANCE.getDropout();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DROPOUT__RATE = eINSTANCE.getDropout_Rate();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.BidirectionalImpl <em>Bidirectional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.BidirectionalImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getBidirectional()
		 * @generated
		 */
		EClass BIDIRECTIONAL = eINSTANCE.getBidirectional();

		/**
		 * The meta object literal for the '<em><b>Layer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIDIRECTIONAL__LAYER = eINSTANCE.getBidirectional_Layer();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.impl.CustomLayerImpl <em>Custom Layer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.impl.CustomLayerImpl
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getCustomLayer()
		 * @generated
		 */
		EClass CUSTOM_LAYER = eINSTANCE.getCustomLayer();

		/**
		 * The meta object literal for the '<em><b>Init Arguments</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LAYER__INIT_ARGUMENTS = eINSTANCE.getCustomLayer_InitArguments();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LAYER__CLASS_NAME = eINSTANCE.getCustomLayer_ClassName();

		/**
		 * The meta object literal for the '<em><b>Get Init Arguments Parsed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOM_LAYER___GET_INIT_ARGUMENTS_PARSED = eINSTANCE.getCustomLayer__GetInitArgumentsParsed();

		/**
		 * The meta object literal for the '<em><b>Merge Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIDIRECTIONAL__MERGE_MODE = eINSTANCE.getBidirectional_MergeMode();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.ActivationFunction <em>Activation Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.ActivationFunction
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getActivationFunction()
		 * @generated
		 */
		EEnum ACTIVATION_FUNCTION = eINSTANCE.getActivationFunction();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.Optimizer <em>Optimizer</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.Optimizer
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getOptimizer()
		 * @generated
		 */
		EEnum OPTIMIZER = eINSTANCE.getOptimizer();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.Loss <em>Loss</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.Loss
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getLoss()
		 * @generated
		 */
		EEnum LOSS = eINSTANCE.getLoss();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.MergeMode <em>Merge Mode</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.MergeMode
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getMergeMode()
		 * @generated
		 */
		EEnum MERGE_MODE = eINSTANCE.getMergeMode();

		/**
		 * The meta object literal for the '{@link neuralnetwork.neuralnetwork.WeightInitializers <em>Weight Initializers</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see neuralnetwork.neuralnetwork.WeightInitializers
		 * @see neuralnetwork.neuralnetwork.impl.NeuralnetworkPackageImpl#getWeightInitializers()
		 * @generated
		 */
		EEnum WEIGHT_INITIALIZERS = eINSTANCE.getWeightInitializers();

	}

} //NeuralnetworkPackage
