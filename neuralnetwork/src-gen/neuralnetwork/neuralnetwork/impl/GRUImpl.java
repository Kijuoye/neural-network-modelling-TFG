/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.ActivationFunction;
import neuralnetwork.neuralnetwork.GRU;
import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import neuralnetwork.neuralnetwork.WeightInitializers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GRU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#isReturnSequences <em>Return Sequences</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getRecurrentActivation <em>Recurrent Activation</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#isUseBias <em>Use Bias</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getKernelInitializer <em>Kernel Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getRecurrentInitializer <em>Recurrent Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.GRUImpl#getBiasInitializer <em>Bias Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GRUImpl extends LayerImpl implements GRU {
	/**
	 * The default value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected static final int UNITS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected int units = UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getActivationFunction() <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationFunction ACTIVATION_FUNCTION_EDEFAULT = ActivationFunction.TANH;

	/**
	 * The cached value of the '{@link #getActivationFunction() <em>Activation Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationFunction()
	 * @generated
	 * @ordered
	 */
	protected ActivationFunction activationFunction = ACTIVATION_FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isReturnSequences() <em>Return Sequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnSequences()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETURN_SEQUENCES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReturnSequences() <em>Return Sequences</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReturnSequences()
	 * @generated
	 * @ordered
	 */
	protected boolean returnSequences = RETURN_SEQUENCES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
	protected Layer initialState;

	/**
	 * The default value of the '{@link #getRecurrentActivation() <em>Recurrent Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrentActivation()
	 * @generated
	 * @ordered
	 */
	protected static final ActivationFunction RECURRENT_ACTIVATION_EDEFAULT = ActivationFunction.SIGMOID;

	/**
	 * The cached value of the '{@link #getRecurrentActivation() <em>Recurrent Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrentActivation()
	 * @generated
	 * @ordered
	 */
	protected ActivationFunction recurrentActivation = RECURRENT_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_BIAS_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUseBias() <em>Use Bias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseBias()
	 * @generated
	 * @ordered
	 */
	protected boolean useBias = USE_BIAS_EDEFAULT;

	/**
	 * The default value of the '{@link #getKernelInitializer() <em>Kernel Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final WeightInitializers KERNEL_INITIALIZER_EDEFAULT = WeightInitializers.GLOROT_UNIFORM;

	/**
	 * The cached value of the '{@link #getKernelInitializer() <em>Kernel Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelInitializer()
	 * @generated
	 * @ordered
	 */
	protected WeightInitializers kernelInitializer = KERNEL_INITIALIZER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecurrentInitializer() <em>Recurrent Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrentInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final WeightInitializers RECURRENT_INITIALIZER_EDEFAULT = WeightInitializers.ORTHOGONAL;

	/**
	 * The cached value of the '{@link #getRecurrentInitializer() <em>Recurrent Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecurrentInitializer()
	 * @generated
	 * @ordered
	 */
	protected WeightInitializers recurrentInitializer = RECURRENT_INITIALIZER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBiasInitializer() <em>Bias Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiasInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final WeightInitializers BIAS_INITIALIZER_EDEFAULT = WeightInitializers.ZEROS;

	/**
	 * The cached value of the '{@link #getBiasInitializer() <em>Bias Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBiasInitializer()
	 * @generated
	 * @ordered
	 */
	protected WeightInitializers biasInitializer = BIAS_INITIALIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GRUImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.GRU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getUnits() {
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUnits(int newUnits) {
		int oldUnits = units;
		units = newUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__UNITS, oldUnits, units));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivationFunction getActivationFunction() {
		return activationFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivationFunction(ActivationFunction newActivationFunction) {
		ActivationFunction oldActivationFunction = activationFunction;
		activationFunction = newActivationFunction == null ? ACTIVATION_FUNCTION_EDEFAULT : newActivationFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION,
					oldActivationFunction, activationFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReturnSequences() {
		return returnSequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnSequences(boolean newReturnSequences) {
		boolean oldReturnSequences = returnSequences;
		returnSequences = newReturnSequences;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__RETURN_SEQUENCES,
					oldReturnSequences, returnSequences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject) initialState;
			initialState = (Layer) eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NeuralnetworkPackage.GRU__INITIAL_STATE,
							oldInitialState, initialState));
			}
		}
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetInitialState() {
		return initialState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialState(Layer newInitialState) {
		Layer oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__INITIAL_STATE,
					oldInitialState, initialState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivationFunction getRecurrentActivation() {
		return recurrentActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrentActivation(ActivationFunction newRecurrentActivation) {
		ActivationFunction oldRecurrentActivation = recurrentActivation;
		recurrentActivation = newRecurrentActivation == null ? RECURRENT_ACTIVATION_EDEFAULT : newRecurrentActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION,
					oldRecurrentActivation, recurrentActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseBias() {
		return useBias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseBias(boolean newUseBias) {
		boolean oldUseBias = useBias;
		useBias = newUseBias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__USE_BIAS, oldUseBias,
					useBias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightInitializers getKernelInitializer() {
		return kernelInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernelInitializer(WeightInitializers newKernelInitializer) {
		WeightInitializers oldKernelInitializer = kernelInitializer;
		kernelInitializer = newKernelInitializer == null ? KERNEL_INITIALIZER_EDEFAULT : newKernelInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__KERNEL_INITIALIZER,
					oldKernelInitializer, kernelInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightInitializers getRecurrentInitializer() {
		return recurrentInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecurrentInitializer(WeightInitializers newRecurrentInitializer) {
		WeightInitializers oldRecurrentInitializer = recurrentInitializer;
		recurrentInitializer = newRecurrentInitializer == null ? RECURRENT_INITIALIZER_EDEFAULT
				: newRecurrentInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER,
					oldRecurrentInitializer, recurrentInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightInitializers getBiasInitializer() {
		return biasInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBiasInitializer(WeightInitializers newBiasInitializer) {
		WeightInitializers oldBiasInitializer = biasInitializer;
		biasInitializer = newBiasInitializer == null ? BIAS_INITIALIZER_EDEFAULT : newBiasInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.GRU__BIAS_INITIALIZER,
					oldBiasInitializer, biasInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.GRU__UNITS:
			return getUnits();
		case NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION:
			return getActivationFunction();
		case NeuralnetworkPackage.GRU__RETURN_SEQUENCES:
			return isReturnSequences();
		case NeuralnetworkPackage.GRU__INITIAL_STATE:
			if (resolve)
				return getInitialState();
			return basicGetInitialState();
		case NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION:
			return getRecurrentActivation();
		case NeuralnetworkPackage.GRU__USE_BIAS:
			return isUseBias();
		case NeuralnetworkPackage.GRU__KERNEL_INITIALIZER:
			return getKernelInitializer();
		case NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER:
			return getRecurrentInitializer();
		case NeuralnetworkPackage.GRU__BIAS_INITIALIZER:
			return getBiasInitializer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NeuralnetworkPackage.GRU__UNITS:
			setUnits((Integer) newValue);
			return;
		case NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION:
			setActivationFunction((ActivationFunction) newValue);
			return;
		case NeuralnetworkPackage.GRU__RETURN_SEQUENCES:
			setReturnSequences((Boolean) newValue);
			return;
		case NeuralnetworkPackage.GRU__INITIAL_STATE:
			setInitialState((Layer) newValue);
			return;
		case NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION:
			setRecurrentActivation((ActivationFunction) newValue);
			return;
		case NeuralnetworkPackage.GRU__USE_BIAS:
			setUseBias((Boolean) newValue);
			return;
		case NeuralnetworkPackage.GRU__KERNEL_INITIALIZER:
			setKernelInitializer((WeightInitializers) newValue);
			return;
		case NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER:
			setRecurrentInitializer((WeightInitializers) newValue);
			return;
		case NeuralnetworkPackage.GRU__BIAS_INITIALIZER:
			setBiasInitializer((WeightInitializers) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NeuralnetworkPackage.GRU__UNITS:
			setUnits(UNITS_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION:
			setActivationFunction(ACTIVATION_FUNCTION_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__RETURN_SEQUENCES:
			setReturnSequences(RETURN_SEQUENCES_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__INITIAL_STATE:
			setInitialState((Layer) null);
			return;
		case NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION:
			setRecurrentActivation(RECURRENT_ACTIVATION_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__USE_BIAS:
			setUseBias(USE_BIAS_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__KERNEL_INITIALIZER:
			setKernelInitializer(KERNEL_INITIALIZER_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER:
			setRecurrentInitializer(RECURRENT_INITIALIZER_EDEFAULT);
			return;
		case NeuralnetworkPackage.GRU__BIAS_INITIALIZER:
			setBiasInitializer(BIAS_INITIALIZER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NeuralnetworkPackage.GRU__UNITS:
			return units != UNITS_EDEFAULT;
		case NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION:
			return activationFunction != ACTIVATION_FUNCTION_EDEFAULT;
		case NeuralnetworkPackage.GRU__RETURN_SEQUENCES:
			return returnSequences != RETURN_SEQUENCES_EDEFAULT;
		case NeuralnetworkPackage.GRU__INITIAL_STATE:
			return initialState != null;
		case NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION:
			return recurrentActivation != RECURRENT_ACTIVATION_EDEFAULT;
		case NeuralnetworkPackage.GRU__USE_BIAS:
			return useBias != USE_BIAS_EDEFAULT;
		case NeuralnetworkPackage.GRU__KERNEL_INITIALIZER:
			return kernelInitializer != KERNEL_INITIALIZER_EDEFAULT;
		case NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER:
			return recurrentInitializer != RECURRENT_INITIALIZER_EDEFAULT;
		case NeuralnetworkPackage.GRU__BIAS_INITIALIZER:
			return biasInitializer != BIAS_INITIALIZER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (units: ");
		result.append(units);
		result.append(", activationFunction: ");
		result.append(activationFunction);
		result.append(", returnSequences: ");
		result.append(returnSequences);
		result.append(", recurrentActivation: ");
		result.append(recurrentActivation);
		result.append(", useBias: ");
		result.append(useBias);
		result.append(", kernelInitializer: ");
		result.append(kernelInitializer);
		result.append(", recurrentInitializer: ");
		result.append(recurrentInitializer);
		result.append(", biasInitializer: ");
		result.append(biasInitializer);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Layer> getPreviousLayers() {
		// TODO Auto-generated method stub
		EList<Layer> prevLayers = super.getPreviousLayers();
		Layer initialState = this.getInitialState();
		if (initialState == null)
			return prevLayers;
		prevLayers.add(initialState);
		return prevLayers;
	}
} //GRUImpl
