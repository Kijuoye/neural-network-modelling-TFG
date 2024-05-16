/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.ActivationFunction;
import neuralnetwork.neuralnetwork.Dense;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import neuralnetwork.neuralnetwork.WeightInitializers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dense</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.DenseImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.DenseImpl#getActivationFunction <em>Activation Function</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.DenseImpl#getKernelInitializer <em>Kernel Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.DenseImpl#getBiasInitializer <em>Bias Initializer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.DenseImpl#isUseBias <em>Use Bias</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DenseImpl extends LayerImpl implements Dense {
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
	protected static final ActivationFunction ACTIVATION_FUNCTION_EDEFAULT = ActivationFunction.LINEAR;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DenseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.DENSE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.DENSE__UNITS, oldUnits, units));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION,
					oldActivationFunction, activationFunction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.DENSE__KERNEL_INITIALIZER,
					oldKernelInitializer, kernelInitializer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.DENSE__BIAS_INITIALIZER,
					oldBiasInitializer, biasInitializer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.DENSE__USE_BIAS, oldUseBias,
					useBias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.DENSE__UNITS:
			return getUnits();
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			return getActivationFunction();
		case NeuralnetworkPackage.DENSE__KERNEL_INITIALIZER:
			return getKernelInitializer();
		case NeuralnetworkPackage.DENSE__BIAS_INITIALIZER:
			return getBiasInitializer();
		case NeuralnetworkPackage.DENSE__USE_BIAS:
			return isUseBias();
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
		case NeuralnetworkPackage.DENSE__UNITS:
			setUnits((Integer) newValue);
			return;
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			setActivationFunction((ActivationFunction) newValue);
			return;
		case NeuralnetworkPackage.DENSE__KERNEL_INITIALIZER:
			setKernelInitializer((WeightInitializers) newValue);
			return;
		case NeuralnetworkPackage.DENSE__BIAS_INITIALIZER:
			setBiasInitializer((WeightInitializers) newValue);
			return;
		case NeuralnetworkPackage.DENSE__USE_BIAS:
			setUseBias((Boolean) newValue);
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
		case NeuralnetworkPackage.DENSE__UNITS:
			setUnits(UNITS_EDEFAULT);
			return;
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			setActivationFunction(ACTIVATION_FUNCTION_EDEFAULT);
			return;
		case NeuralnetworkPackage.DENSE__KERNEL_INITIALIZER:
			setKernelInitializer(KERNEL_INITIALIZER_EDEFAULT);
			return;
		case NeuralnetworkPackage.DENSE__BIAS_INITIALIZER:
			setBiasInitializer(BIAS_INITIALIZER_EDEFAULT);
			return;
		case NeuralnetworkPackage.DENSE__USE_BIAS:
			setUseBias(USE_BIAS_EDEFAULT);
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
		case NeuralnetworkPackage.DENSE__UNITS:
			return units != UNITS_EDEFAULT;
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			return activationFunction != ACTIVATION_FUNCTION_EDEFAULT;
		case NeuralnetworkPackage.DENSE__KERNEL_INITIALIZER:
			return kernelInitializer != KERNEL_INITIALIZER_EDEFAULT;
		case NeuralnetworkPackage.DENSE__BIAS_INITIALIZER:
			return biasInitializer != BIAS_INITIALIZER_EDEFAULT;
		case NeuralnetworkPackage.DENSE__USE_BIAS:
			return useBias != USE_BIAS_EDEFAULT;
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
		result.append(", kernelInitializer: ");
		result.append(kernelInitializer);
		result.append(", biasInitializer: ");
		result.append(biasInitializer);
		result.append(", useBias: ");
		result.append(useBias);
		result.append(')');
		return result.toString();
	}

} //DenseImpl
