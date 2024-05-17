/**
 */
package neuralnetwork.neuralnetwork.impl;

import neuralnetwork.neuralnetwork.Embedding;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import neuralnetwork.neuralnetwork.WeightInitializers;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl#getInputDim <em>Input Dim</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl#getOutputDim <em>Output Dim</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl#isMaskZero <em>Mask Zero</em>}</li>
 *   <li>{@link neuralnetwork.neuralnetwork.impl.EmbeddingImpl#getEmbeddingsInitializer <em>Embeddings Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmbeddingImpl extends LayerImpl implements Embedding {
	/**
	 * The default value of the '{@link #getInputDim() <em>Input Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDim()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_DIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputDim() <em>Input Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputDim()
	 * @generated
	 * @ordered
	 */
	protected String inputDim = INPUT_DIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputDim() <em>Output Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDim()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_DIM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputDim() <em>Output Dim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputDim()
	 * @generated
	 * @ordered
	 */
	protected String outputDim = OUTPUT_DIM_EDEFAULT;

	/**
	 * The default value of the '{@link #isMaskZero() <em>Mask Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaskZero()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASK_ZERO_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMaskZero() <em>Mask Zero</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMaskZero()
	 * @generated
	 * @ordered
	 */
	protected boolean maskZero = MASK_ZERO_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmbeddingsInitializer() <em>Embeddings Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingsInitializer()
	 * @generated
	 * @ordered
	 */
	protected static final WeightInitializers EMBEDDINGS_INITIALIZER_EDEFAULT = WeightInitializers.RANDOM_UNIFORM;

	/**
	 * The cached value of the '{@link #getEmbeddingsInitializer() <em>Embeddings Initializer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmbeddingsInitializer()
	 * @generated
	 * @ordered
	 */
	protected WeightInitializers embeddingsInitializer = EMBEDDINGS_INITIALIZER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NeuralnetworkPackage.Literals.EMBEDDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInputDim() {
		return inputDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInputDim(String newInputDim) {
		String oldInputDim = inputDim;
		inputDim = newInputDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.EMBEDDING__INPUT_DIM,
					oldInputDim, inputDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputDim() {
		return outputDim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputDim(String newOutputDim) {
		String oldOutputDim = outputDim;
		outputDim = newOutputDim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.EMBEDDING__OUTPUT_DIM,
					oldOutputDim, outputDim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMaskZero() {
		return maskZero;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaskZero(boolean newMaskZero) {
		boolean oldMaskZero = maskZero;
		maskZero = newMaskZero;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NeuralnetworkPackage.EMBEDDING__MASK_ZERO,
					oldMaskZero, maskZero));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WeightInitializers getEmbeddingsInitializer() {
		return embeddingsInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddingsInitializer(WeightInitializers newEmbeddingsInitializer) {
		WeightInitializers oldEmbeddingsInitializer = embeddingsInitializer;
		embeddingsInitializer = newEmbeddingsInitializer == null ? EMBEDDINGS_INITIALIZER_EDEFAULT
				: newEmbeddingsInitializer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NeuralnetworkPackage.EMBEDDING__EMBEDDINGS_INITIALIZER, oldEmbeddingsInitializer,
					embeddingsInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NeuralnetworkPackage.EMBEDDING__INPUT_DIM:
			return getInputDim();
		case NeuralnetworkPackage.EMBEDDING__OUTPUT_DIM:
			return getOutputDim();
		case NeuralnetworkPackage.EMBEDDING__MASK_ZERO:
			return isMaskZero();
		case NeuralnetworkPackage.EMBEDDING__EMBEDDINGS_INITIALIZER:
			return getEmbeddingsInitializer();
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
		case NeuralnetworkPackage.EMBEDDING__INPUT_DIM:
			setInputDim((String) newValue);
			return;
		case NeuralnetworkPackage.EMBEDDING__OUTPUT_DIM:
			setOutputDim((String) newValue);
			return;
		case NeuralnetworkPackage.EMBEDDING__MASK_ZERO:
			setMaskZero((Boolean) newValue);
			return;
		case NeuralnetworkPackage.EMBEDDING__EMBEDDINGS_INITIALIZER:
			setEmbeddingsInitializer((WeightInitializers) newValue);
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
		case NeuralnetworkPackage.EMBEDDING__INPUT_DIM:
			setInputDim(INPUT_DIM_EDEFAULT);
			return;
		case NeuralnetworkPackage.EMBEDDING__OUTPUT_DIM:
			setOutputDim(OUTPUT_DIM_EDEFAULT);
			return;
		case NeuralnetworkPackage.EMBEDDING__MASK_ZERO:
			setMaskZero(MASK_ZERO_EDEFAULT);
			return;
		case NeuralnetworkPackage.EMBEDDING__EMBEDDINGS_INITIALIZER:
			setEmbeddingsInitializer(EMBEDDINGS_INITIALIZER_EDEFAULT);
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
		case NeuralnetworkPackage.EMBEDDING__INPUT_DIM:
			return INPUT_DIM_EDEFAULT == null ? inputDim != null : !INPUT_DIM_EDEFAULT.equals(inputDim);
		case NeuralnetworkPackage.EMBEDDING__OUTPUT_DIM:
			return OUTPUT_DIM_EDEFAULT == null ? outputDim != null : !OUTPUT_DIM_EDEFAULT.equals(outputDim);
		case NeuralnetworkPackage.EMBEDDING__MASK_ZERO:
			return maskZero != MASK_ZERO_EDEFAULT;
		case NeuralnetworkPackage.EMBEDDING__EMBEDDINGS_INITIALIZER:
			return embeddingsInitializer != EMBEDDINGS_INITIALIZER_EDEFAULT;
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
		result.append(" (inputDim: ");
		result.append(inputDim);
		result.append(", outputDim: ");
		result.append(outputDim);
		result.append(", maskZero: ");
		result.append(maskZero);
		result.append(", embeddingsInitializer: ");
		result.append(embeddingsInitializer);
		result.append(')');
		return result.toString();
	}

} //EmbeddingImpl
