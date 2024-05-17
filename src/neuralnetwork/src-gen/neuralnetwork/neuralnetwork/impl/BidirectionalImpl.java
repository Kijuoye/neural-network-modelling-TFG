/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.Bidirectional;
import neuralnetwork.neuralnetwork.Layer;
import neuralnetwork.neuralnetwork.MergeMode;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bidirectional</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.BidirectionalImpl#getMergeMode <em>Merge Mode</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.BidirectionalImpl#getLayer <em>Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BidirectionalImpl extends LayerImpl implements Bidirectional {
	/**
	 * The default value of the '{@link #getMergeMode() <em>Merge Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeMode()
	 * @generated
	 * @ordered
	 */
	protected static final MergeMode MERGE_MODE_EDEFAULT = MergeMode.SUM;

	/**
	 * The cached value of the '{@link #getMergeMode() <em>Merge Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeMode()
	 * @generated
	 * @ordered
	 */
	protected MergeMode mergeMode = MERGE_MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLayer() <em>Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayer()
	 * @generated
	 * @ordered
	 */
	protected Layer layer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BidirectionalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.BIDIRECTIONAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Layer getLayer() {
		if (layer != null && layer.eIsProxy()) {
			InternalEObject oldLayer = (InternalEObject) layer;
			layer = (Layer) eResolveProxy(oldLayer);
			if (layer != oldLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NeuralnetworkPackage.BIDIRECTIONAL__LAYER,
							oldLayer, layer));
			}
		}
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Layer basicGetLayer() {
		return layer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLayer(Layer newLayer) {
		Layer oldLayer = layer;
		layer = newLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.BIDIRECTIONAL__LAYER, oldLayer,
					layer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MergeMode getMergeMode() {
		return mergeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMergeMode(MergeMode newMergeMode) {
		MergeMode oldMergeMode = mergeMode;
		mergeMode = newMergeMode == null ? MERGE_MODE_EDEFAULT : newMergeMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.BIDIRECTIONAL__MERGE_MODE,
					oldMergeMode, mergeMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.BIDIRECTIONAL__MERGE_MODE:
			return getMergeMode();
		case NeuralnetworkPackage.BIDIRECTIONAL__LAYER:
			if (resolve)
				return getLayer();
			return basicGetLayer();
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
		case NeuralnetworkPackage.BIDIRECTIONAL__MERGE_MODE:
			setMergeMode((MergeMode) newValue);
			return;
		case NeuralnetworkPackage.BIDIRECTIONAL__LAYER:
			setLayer((Layer) newValue);
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
		case NeuralnetworkPackage.BIDIRECTIONAL__MERGE_MODE:
			setMergeMode(MERGE_MODE_EDEFAULT);
			return;
		case NeuralnetworkPackage.BIDIRECTIONAL__LAYER:
			setLayer((Layer) null);
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
		case NeuralnetworkPackage.BIDIRECTIONAL__MERGE_MODE:
			return mergeMode != MERGE_MODE_EDEFAULT;
		case NeuralnetworkPackage.BIDIRECTIONAL__LAYER:
			return layer != null;
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
		result.append(" (mergeMode: ");
		result.append(mergeMode);
		result.append(')');
		return result.toString();
	}

} //BidirectionalImpl
