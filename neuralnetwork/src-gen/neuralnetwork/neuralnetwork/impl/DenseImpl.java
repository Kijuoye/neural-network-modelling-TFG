/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.ActivationFunction;
import neuralnetwork.neuralnetwork.Dense;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.DENSE__UNITS:
			return getUnits();
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			return getActivationFunction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NeuralnetworkPackage.DENSE__UNITS:
			setUnits((Integer) newValue);
			return;
		case NeuralnetworkPackage.DENSE__ACTIVATION_FUNCTION:
			setActivationFunction((ActivationFunction) newValue);
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
		result.append(')');
		return result.toString();
	}

} //DenseImpl
