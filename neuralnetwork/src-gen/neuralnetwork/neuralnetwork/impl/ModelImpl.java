/**
 */
package neuralnetwork.neuralnetwork.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Stack;

import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.Loss;
import neuralnetwork.neuralnetwork.Model;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import neuralnetwork.neuralnetwork.Optimizer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getOptimizer <em>Optimizer</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getOutputLayers <em>Output Layers</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.ModelImpl#getInputLayers <em>Input Layers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayers() <em>Layers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> layers;

	/**
	 * The default value of the '{@link #getOptimizer() <em>Optimizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizer()
	 * @generated
	 * @ordered
	 */
	protected static final Optimizer OPTIMIZER_EDEFAULT = Optimizer.SGD;

	/**
	 * The cached value of the '{@link #getOptimizer() <em>Optimizer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptimizer()
	 * @generated
	 * @ordered
	 */
	protected Optimizer optimizer = OPTIMIZER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss()
	 * @generated
	 * @ordered
	 */
	protected static final Loss LOSS_EDEFAULT = Loss.BINARY_CROSSENTROPY;

	/**
	 * The cached value of the '{@link #getLoss() <em>Loss</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoss()
	 * @generated
	 * @ordered
	 */
	protected Loss loss = LOSS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputLayers() <em>Output Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> outputLayers;

	/**
	 * The cached value of the '{@link #getInputLayers() <em>Input Layers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Layer> inputLayers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getLayers() {
		if (layers == null) {
			layers = new EObjectContainmentEList<Layer>(Layer.class, this, NeuralnetworkPackage.MODEL__LAYERS);
		}
		return layers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Optimizer getOptimizer() {
		return optimizer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOptimizer(Optimizer newOptimizer) {
		Optimizer oldOptimizer = optimizer;
		optimizer = newOptimizer == null ? OPTIMIZER_EDEFAULT : newOptimizer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.MODEL__OPTIMIZER, oldOptimizer,
					optimizer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loss getLoss() {
		return loss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLoss(Loss newLoss) {
		Loss oldLoss = loss;
		loss = newLoss == null ? LOSS_EDEFAULT : newLoss;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.MODEL__LOSS, oldLoss, loss));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getOutputLayers() {
		if (outputLayers == null) {
			outputLayers = new EObjectResolvingEList<Layer>(Layer.class, this,
					NeuralnetworkPackage.MODEL__OUTPUT_LAYERS);
		}
		return outputLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Layer> getInputLayers() {
		if (inputLayers == null) {
			inputLayers = new EObjectResolvingEList<Layer>(Layer.class, this, NeuralnetworkPackage.MODEL__INPUT_LAYERS);
		}
		return inputLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Layer> orderOfLayers() {
		EList<Layer> layers = this.getOutputLayers();
		EList<Layer> orderedLayers = new BasicEList<Layer>();
		Stack<Layer> layersStack = new Stack<Layer>();
		Stack<Layer> orderStack = new Stack<Layer>();
		layersStack.addAll(layers);

		while (!layersStack.empty()) {
			Layer layer = layersStack.pop();
			orderStack.push(layer);
			for (Layer prevLayer : layer.getPreviousLayers()) {
				layersStack.push(prevLayer);
			}
		}
		while (!orderStack.empty()) {
			orderedLayers.add(orderStack.pop());
		}
		return orderedLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NeuralnetworkPackage.MODEL__LAYERS:
			return ((InternalEList<?>) getLayers()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.MODEL__NAME:
			return getName();
		case NeuralnetworkPackage.MODEL__LAYERS:
			return getLayers();
		case NeuralnetworkPackage.MODEL__OPTIMIZER:
			return getOptimizer();
		case NeuralnetworkPackage.MODEL__LOSS:
			return getLoss();
		case NeuralnetworkPackage.MODEL__OUTPUT_LAYERS:
			return getOutputLayers();
		case NeuralnetworkPackage.MODEL__INPUT_LAYERS:
			return getInputLayers();
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
		case NeuralnetworkPackage.MODEL__NAME:
			setName((String) newValue);
			return;
		case NeuralnetworkPackage.MODEL__LAYERS:
			getLayers().clear();
			getLayers().addAll((Collection<? extends Layer>) newValue);
			return;
		case NeuralnetworkPackage.MODEL__OPTIMIZER:
			setOptimizer((Optimizer) newValue);
			return;
		case NeuralnetworkPackage.MODEL__LOSS:
			setLoss((Loss) newValue);
			return;
		case NeuralnetworkPackage.MODEL__OUTPUT_LAYERS:
			getOutputLayers().clear();
			getOutputLayers().addAll((Collection<? extends Layer>) newValue);
			return;
		case NeuralnetworkPackage.MODEL__INPUT_LAYERS:
			getInputLayers().clear();
			getInputLayers().addAll((Collection<? extends Layer>) newValue);
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
		case NeuralnetworkPackage.MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NeuralnetworkPackage.MODEL__LAYERS:
			getLayers().clear();
			return;
		case NeuralnetworkPackage.MODEL__OPTIMIZER:
			setOptimizer(OPTIMIZER_EDEFAULT);
			return;
		case NeuralnetworkPackage.MODEL__LOSS:
			setLoss(LOSS_EDEFAULT);
			return;
		case NeuralnetworkPackage.MODEL__OUTPUT_LAYERS:
			getOutputLayers().clear();
			return;
		case NeuralnetworkPackage.MODEL__INPUT_LAYERS:
			getInputLayers().clear();
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
		case NeuralnetworkPackage.MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NeuralnetworkPackage.MODEL__LAYERS:
			return layers != null && !layers.isEmpty();
		case NeuralnetworkPackage.MODEL__OPTIMIZER:
			return optimizer != OPTIMIZER_EDEFAULT;
		case NeuralnetworkPackage.MODEL__LOSS:
			return loss != LOSS_EDEFAULT;
		case NeuralnetworkPackage.MODEL__OUTPUT_LAYERS:
			return outputLayers != null && !outputLayers.isEmpty();
		case NeuralnetworkPackage.MODEL__INPUT_LAYERS:
			return inputLayers != null && !inputLayers.isEmpty();
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
		case NeuralnetworkPackage.MODEL___ORDER_OF_LAYERS:
			return orderOfLayers();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", optimizer: ");
		result.append(optimizer);
		result.append(", loss: ");
		result.append(loss);
		result.append(')');
		return result.toString();
	}

} //ModelImpl
