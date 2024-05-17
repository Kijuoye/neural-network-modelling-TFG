/**
 */
package neuralnetwork.neuralnetwork.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import neuralnetwork.neuralnetwork.CustomLayer;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.CustomLayerImpl#getInitArguments <em>Init Arguments</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.CustomLayerImpl#getClassName <em>Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomLayerImpl extends LayerImpl implements CustomLayer {
	/**
	 * The default value of the '{@link #getInitArguments() <em>Init Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitArguments()
	 * @generated
	 * @ordered
	 */
	protected static final String INIT_ARGUMENTS_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInitArguments() <em>Init Arguments</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitArguments()
	 * @generated
	 * @ordered
	 */
	protected String initArguments = INIT_ARGUMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomLayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.CUSTOM_LAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInitArguments() {
		return initArguments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitArguments(String newInitArguments) {
		String oldInitArguments = initArguments;
		initArguments = newInitArguments;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.CUSTOM_LAYER__INIT_ARGUMENTS,
					oldInitArguments, initArguments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.CUSTOM_LAYER__CLASS_NAME,
					oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getInitArgumentsParsed() {
		String[] args = this.initArguments.split(",");
		EList<String> argsList = new BasicEList<String>();
		argsList.addAll(Arrays.asList(args));
		for (String arg : argsList) {
			arg.strip();
		}
		return argsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.CUSTOM_LAYER__INIT_ARGUMENTS:
			return getInitArguments();
		case NeuralnetworkPackage.CUSTOM_LAYER__CLASS_NAME:
			return getClassName();
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
		case NeuralnetworkPackage.CUSTOM_LAYER__INIT_ARGUMENTS:
			setInitArguments((String) newValue);
			return;
		case NeuralnetworkPackage.CUSTOM_LAYER__CLASS_NAME:
			setClassName((String) newValue);
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
		case NeuralnetworkPackage.CUSTOM_LAYER__INIT_ARGUMENTS:
			setInitArguments(INIT_ARGUMENTS_EDEFAULT);
			return;
		case NeuralnetworkPackage.CUSTOM_LAYER__CLASS_NAME:
			setClassName(CLASS_NAME_EDEFAULT);
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
		case NeuralnetworkPackage.CUSTOM_LAYER__INIT_ARGUMENTS:
			return INIT_ARGUMENTS_EDEFAULT == null ? initArguments != null
					: !INIT_ARGUMENTS_EDEFAULT.equals(initArguments);
		case NeuralnetworkPackage.CUSTOM_LAYER__CLASS_NAME:
			return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NeuralnetworkPackage.CUSTOM_LAYER___GET_INIT_ARGUMENTS_PARSED:
			return getInitArgumentsParsed();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (initArguments: ");
		result.append(initArguments);
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //CustomLayerImpl
