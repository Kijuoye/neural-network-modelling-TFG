/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.ActivationFunction;
import neuralnetwork.neuralnetwork.Bidirectional;
import neuralnetwork.neuralnetwork.Concatenate;
import neuralnetwork.neuralnetwork.CustomLayer;
import neuralnetwork.neuralnetwork.Dense;
import neuralnetwork.neuralnetwork.Dropout;
import neuralnetwork.neuralnetwork.Embedding;
import neuralnetwork.neuralnetwork.Input;
import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.Loss;
import neuralnetwork.neuralnetwork.MergeMode;
import neuralnetwork.neuralnetwork.Model;
import neuralnetwork.neuralnetwork.NeuralnetworkFactory;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import neuralnetwork.neuralnetwork.Optimizer;
import neuralnetwork.neuralnetwork.WeightInitializers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NeuralnetworkPackageImpl extends EPackageImpl implements NeuralnetworkPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass denseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concatenateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gruEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bidirectionalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum activationFunctionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum optimizerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lossEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mergeModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weightInitializersEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see neuralnetwork.neuralnetwork.NeuralnetworkPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NeuralnetworkPackageImpl() {
		super(eNS_URI, NeuralnetworkFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NeuralnetworkPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NeuralnetworkPackage init() {
		if (isInited)
			return (NeuralnetworkPackage) EPackage.Registry.INSTANCE.getEPackage(NeuralnetworkPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNeuralnetworkPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NeuralnetworkPackageImpl theNeuralnetworkPackage = registeredNeuralnetworkPackage instanceof NeuralnetworkPackageImpl
				? (NeuralnetworkPackageImpl) registeredNeuralnetworkPackage
				: new NeuralnetworkPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNeuralnetworkPackage.createPackageContents();

		// Initialize created meta-data
		theNeuralnetworkPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNeuralnetworkPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NeuralnetworkPackage.eNS_URI, theNeuralnetworkPackage);
		return theNeuralnetworkPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Name() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_Layers() {
		return (EReference) modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Optimizer() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModel_Loss() {
		return (EAttribute) modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_OutputLayers() {
		return (EReference) modelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModel_InputLayers() {
		return (EReference) modelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getModel__OrderOfLayers() {
		return modelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLayer() {
		return layerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLayer_Name() {
		return (EAttribute) layerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLayer_PreviousLayers() {
		return (EReference) layerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Shape() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Dtype() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Sparse() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDense() {
		return denseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDense_Units() {
		return (EAttribute) denseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDense_ActivationFunction() {
		return (EAttribute) denseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDense_KernelInitializer() {
		return (EAttribute) denseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDense_BiasInitializer() {
		return (EAttribute) denseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDense_UseBias() {
		return (EAttribute) denseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcatenate() {
		return concatenateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcatenate_Axis() {
		return (EAttribute) concatenateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmbedding() {
		return embeddingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmbedding_InputDim() {
		return (EAttribute) embeddingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmbedding_OutputDim() {
		return (EAttribute) embeddingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmbedding_MaskZero() {
		return (EAttribute) embeddingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEmbedding_EmbeddingsInitializer() {
		return (EAttribute) embeddingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGRU() {
		return gruEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_Units() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_ActivationFunction() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_ReturnSequences() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGRU_InitialState() {
		return (EReference) gruEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_RecurrentActivation() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_UseBias() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_KernelInitializer() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_RecurrentInitializer() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGRU_BiasInitializer() {
		return (EAttribute) gruEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDropout() {
		return dropoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDropout_Rate() {
		return (EAttribute) dropoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBidirectional() {
		return bidirectionalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBidirectional_Layer() {
		return (EReference) bidirectionalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomLayer() {
		return customLayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLayer_InitArguments() {
		return (EAttribute) customLayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCustomLayer_ClassName() {
		return (EAttribute) customLayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustomLayer__GetInitArgumentsParsed() {
		return customLayerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBidirectional_MergeMode() {
		return (EAttribute) bidirectionalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActivationFunction() {
		return activationFunctionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOptimizer() {
		return optimizerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLoss() {
		return lossEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMergeMode() {
		return mergeModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getWeightInitializers() {
		return weightInitializersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeuralnetworkFactory getNeuralnetworkFactory() {
		return (NeuralnetworkFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__NAME);
		createEReference(modelEClass, MODEL__LAYERS);
		createEAttribute(modelEClass, MODEL__OPTIMIZER);
		createEAttribute(modelEClass, MODEL__LOSS);
		createEReference(modelEClass, MODEL__OUTPUT_LAYERS);
		createEReference(modelEClass, MODEL__INPUT_LAYERS);
		createEOperation(modelEClass, MODEL___ORDER_OF_LAYERS);

		layerEClass = createEClass(LAYER);
		createEAttribute(layerEClass, LAYER__NAME);
		createEReference(layerEClass, LAYER__PREVIOUS_LAYERS);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__SHAPE);
		createEAttribute(inputEClass, INPUT__DTYPE);
		createEAttribute(inputEClass, INPUT__SPARSE);

		denseEClass = createEClass(DENSE);
		createEAttribute(denseEClass, DENSE__UNITS);
		createEAttribute(denseEClass, DENSE__ACTIVATION_FUNCTION);
		createEAttribute(denseEClass, DENSE__KERNEL_INITIALIZER);
		createEAttribute(denseEClass, DENSE__BIAS_INITIALIZER);
		createEAttribute(denseEClass, DENSE__USE_BIAS);

		concatenateEClass = createEClass(CONCATENATE);
		createEAttribute(concatenateEClass, CONCATENATE__AXIS);

		embeddingEClass = createEClass(EMBEDDING);
		createEAttribute(embeddingEClass, EMBEDDING__INPUT_DIM);
		createEAttribute(embeddingEClass, EMBEDDING__OUTPUT_DIM);
		createEAttribute(embeddingEClass, EMBEDDING__MASK_ZERO);
		createEAttribute(embeddingEClass, EMBEDDING__EMBEDDINGS_INITIALIZER);

		gruEClass = createEClass(GRU);
		createEAttribute(gruEClass, GRU__UNITS);
		createEAttribute(gruEClass, GRU__ACTIVATION_FUNCTION);
		createEAttribute(gruEClass, GRU__RETURN_SEQUENCES);
		createEReference(gruEClass, GRU__INITIAL_STATE);
		createEAttribute(gruEClass, GRU__RECURRENT_ACTIVATION);
		createEAttribute(gruEClass, GRU__USE_BIAS);
		createEAttribute(gruEClass, GRU__KERNEL_INITIALIZER);
		createEAttribute(gruEClass, GRU__RECURRENT_INITIALIZER);
		createEAttribute(gruEClass, GRU__BIAS_INITIALIZER);

		dropoutEClass = createEClass(DROPOUT);
		createEAttribute(dropoutEClass, DROPOUT__RATE);

		bidirectionalEClass = createEClass(BIDIRECTIONAL);
		createEAttribute(bidirectionalEClass, BIDIRECTIONAL__MERGE_MODE);
		createEReference(bidirectionalEClass, BIDIRECTIONAL__LAYER);

		customLayerEClass = createEClass(CUSTOM_LAYER);
		createEAttribute(customLayerEClass, CUSTOM_LAYER__INIT_ARGUMENTS);
		createEAttribute(customLayerEClass, CUSTOM_LAYER__CLASS_NAME);
		createEOperation(customLayerEClass, CUSTOM_LAYER___GET_INIT_ARGUMENTS_PARSED);

		// Create enums
		activationFunctionEEnum = createEEnum(ACTIVATION_FUNCTION);
		optimizerEEnum = createEEnum(OPTIMIZER);
		lossEEnum = createEEnum(LOSS);
		mergeModeEEnum = createEEnum(MERGE_MODE);
		weightInitializersEEnum = createEEnum(WEIGHT_INITIALIZERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputEClass.getESuperTypes().add(this.getLayer());
		denseEClass.getESuperTypes().add(this.getLayer());
		concatenateEClass.getESuperTypes().add(this.getLayer());
		embeddingEClass.getESuperTypes().add(this.getLayer());
		gruEClass.getESuperTypes().add(this.getLayer());
		dropoutEClass.getESuperTypes().add(this.getLayer());
		bidirectionalEClass.getESuperTypes().add(this.getLayer());
		customLayerEClass.getESuperTypes().add(this.getLayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Layers(), this.getLayer(), null, "layers", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getModel_Optimizer(), this.getOptimizer(), "optimizer", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModel_Loss(), this.getLoss(), "loss", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_OutputLayers(), this.getLayer(), null, "outputLayers", null, 1, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_InputLayers(), this.getLayer(), null, "inputLayers", null, 1, -1, Model.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getModel__OrderOfLayers(), this.getLayer(), "orderOfLayers", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLayer_Name(), ecorePackage.getEString(), "name", null, 0, 1, Layer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLayer_PreviousLayers(), this.getLayer(), null, "previousLayers", null, 0, -1, Layer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Dtype(), ecorePackage.getEString(), "dtype", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Sparse(), ecorePackage.getEBoolean(), "sparse", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denseEClass, Dense.class, "Dense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDense_Units(), ecorePackage.getEInt(), "units", null, 0, 1, Dense.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDense_ActivationFunction(), this.getActivationFunction(), "activationFunction", null, 0, 1,
				Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDense_KernelInitializer(), this.getWeightInitializers(), "kernelInitializer",
				"GLOROT_UNIFORM", 0, 1, Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDense_BiasInitializer(), this.getWeightInitializers(), "biasInitializer", "ZEROS", 0, 1,
				Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getDense_UseBias(), ecorePackage.getEBoolean(), "useBias", "true", 0, 1, Dense.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concatenateEClass, Concatenate.class, "Concatenate", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcatenate_Axis(), ecorePackage.getEInt(), "axis", "-1", 0, 1, Concatenate.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(embeddingEClass, Embedding.class, "Embedding", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmbedding_InputDim(), ecorePackage.getEString(), "inputDim", null, 0, 1, Embedding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedding_OutputDim(), ecorePackage.getEString(), "outputDim", null, 0, 1, Embedding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedding_MaskZero(), ecorePackage.getEBoolean(), "maskZero", null, 0, 1, Embedding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmbedding_EmbeddingsInitializer(), this.getWeightInitializers(), "embeddingsInitializer",
				"RANDOM_UNIFORM", 0, 1, Embedding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gruEClass, neuralnetwork.neuralnetwork.GRU.class, "GRU", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGRU_Units(), ecorePackage.getEInt(), "units", null, 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_ActivationFunction(), this.getActivationFunction(), "activationFunction", "TANH", 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_ReturnSequences(), ecorePackage.getEBoolean(), "returnSequences", null, 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGRU_InitialState(), this.getLayer(), null, "initialState", null, 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_RecurrentActivation(), this.getActivationFunction(), "recurrentActivation", "SIGMOID", 0,
				1, neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_UseBias(), ecorePackage.getEBoolean(), "useBias", "true", 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_KernelInitializer(), this.getWeightInitializers(), "kernelInitializer", "GLOROT_UNIFORM",
				0, 1, neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_RecurrentInitializer(), this.getWeightInitializers(), "recurrentInitializer",
				"ORTHOGONAL", 0, 1, neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGRU_BiasInitializer(), this.getWeightInitializers(), "biasInitializer", "ZEROS", 0, 1,
				neuralnetwork.neuralnetwork.GRU.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropoutEClass, Dropout.class, "Dropout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropout_Rate(), ecorePackage.getEFloat(), "rate", "0.5", 0, 1, Dropout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bidirectionalEClass, Bidirectional.class, "Bidirectional", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBidirectional_MergeMode(), this.getMergeMode(), "mergeMode", null, 0, 1, Bidirectional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBidirectional_Layer(), this.getLayer(), null, "layer", null, 0, 1, Bidirectional.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLayerEClass, CustomLayer.class, "CustomLayer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomLayer_InitArguments(), ecorePackage.getEString(), "initArguments", null, 0, 1,
				CustomLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCustomLayer_ClassName(), ecorePackage.getEString(), "className", null, 1, 1,
				CustomLayer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getCustomLayer__GetInitArgumentsParsed(), ecorePackage.getEString(), "getInitArgumentsParsed", 0,
				-1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activationFunctionEEnum, ActivationFunction.class, "ActivationFunction");
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.LINEAR);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.RELU);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.SOFTMAX);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.SIGMOID);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.TANH);

		initEEnum(optimizerEEnum, Optimizer.class, "Optimizer");
		addEEnumLiteral(optimizerEEnum, Optimizer.SGD);
		addEEnumLiteral(optimizerEEnum, Optimizer.RMSPROP);
		addEEnumLiteral(optimizerEEnum, Optimizer.ADAM);

		initEEnum(lossEEnum, Loss.class, "Loss");
		addEEnumLiteral(lossEEnum, Loss.BINARY_CROSSENTROPY);
		addEEnumLiteral(lossEEnum, Loss.BINARY_FOCAL_CROSSENTROPY);
		addEEnumLiteral(lossEEnum, Loss.CATEGORICAL_CROSSENTROPY);
		addEEnumLiteral(lossEEnum, Loss.SPARSE_CATEGORICAL_CROSSENTROPY);

		initEEnum(mergeModeEEnum, MergeMode.class, "MergeMode");
		addEEnumLiteral(mergeModeEEnum, MergeMode.SUM);
		addEEnumLiteral(mergeModeEEnum, MergeMode.MUL);
		addEEnumLiteral(mergeModeEEnum, MergeMode.CONCAT);
		addEEnumLiteral(mergeModeEEnum, MergeMode.AVE);

		initEEnum(weightInitializersEEnum, WeightInitializers.class, "WeightInitializers");
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.RANDOM_UNIFORM);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.RANDOM_NORMAL);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.CONSTANT);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.TRUNCATED_NORMAL);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.ORTHOGONAL);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.IDENTITY);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.ONES);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.ZEROS);
		addEEnumLiteral(weightInitializersEEnum, WeightInitializers.GLOROT_UNIFORM);

		// Create resource
		createResource(eNS_URI);
	}

} //NeuralnetworkPackageImpl
