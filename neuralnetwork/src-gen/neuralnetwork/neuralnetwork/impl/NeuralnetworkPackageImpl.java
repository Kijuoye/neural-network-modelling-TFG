/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.ActivationFunction;
import neuralnetwork.neuralnetwork.Dense;
import neuralnetwork.neuralnetwork.Input;
import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.Model;
import neuralnetwork.neuralnetwork.NeuralnetworkFactory;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	private EEnum activationFunctionEEnum = null;

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
	public EClass getLayer() {
		return layerEClass;
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
	public EAttribute getInput_Name() {
		return (EAttribute) inputEClass.getEStructuralFeatures().get(1);
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
	public EEnum getActivationFunction() {
		return activationFunctionEEnum;
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

		layerEClass = createEClass(LAYER);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__SHAPE);
		createEAttribute(inputEClass, INPUT__NAME);

		denseEClass = createEClass(DENSE);
		createEAttribute(denseEClass, DENSE__UNITS);
		createEAttribute(denseEClass, DENSE__ACTIVATION_FUNCTION);

		// Create enums
		activationFunctionEEnum = createEEnum(ACTIVATION_FUNCTION);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModel_Layers(), this.getLayer(), null, "layers", null, 0, -1, Model.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(layerEClass, Layer.class, "Layer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInput_Name(), ecorePackage.getEString(), "name", null, 0, 1, Input.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(denseEClass, Dense.class, "Dense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDense_Units(), ecorePackage.getEInt(), "units", null, 0, 1, Dense.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDense_ActivationFunction(), this.getActivationFunction(), "activationFunction", null, 0, 1,
				Dense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(activationFunctionEEnum, ActivationFunction.class, "ActivationFunction");
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.LINEAR);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.RELU);
		addEEnumLiteral(activationFunctionEEnum, ActivationFunction.SOFTMAX);

		// Create resource
		createResource(eNS_URI);
	}

} //NeuralnetworkPackageImpl
