/**
 */
package neuralnetwork.neuralnetwork.provider;

import java.util.Collection;
import java.util.List;

import neuralnetwork.neuralnetwork.GRU;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link neuralnetwork.neuralnetwork.GRU} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GRUItemProvider extends LayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRUItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addUnitsPropertyDescriptor(object);
			addActivationFunctionPropertyDescriptor(object);
			addReturnSequencesPropertyDescriptor(object);
			addInitialStatePropertyDescriptor(object);
			addRecurrentActivationPropertyDescriptor(object);
			addUseBiasPropertyDescriptor(object);
			addKernelInitializerPropertyDescriptor(object);
			addRecurrentInitializerPropertyDescriptor(object);
			addBiasInitializerPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_units_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_units_feature", "_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__UNITS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Activation Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActivationFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_activationFunction_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_activationFunction_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__ACTIVATION_FUNCTION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Return Sequences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReturnSequencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_returnSequences_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_returnSequences_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__RETURN_SEQUENCES, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Initial State feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitialStatePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_initialState_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_initialState_feature", "_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__INITIAL_STATE, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Recurrent Activation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecurrentActivationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_recurrentActivation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_recurrentActivation_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__RECURRENT_ACTIVATION, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Use Bias feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseBiasPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_useBias_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_useBias_feature", "_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__USE_BIAS, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Kernel Initializer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKernelInitializerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_kernelInitializer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_kernelInitializer_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__KERNEL_INITIALIZER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Recurrent Initializer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecurrentInitializerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_recurrentInitializer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_recurrentInitializer_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__RECURRENT_INITIALIZER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Bias Initializer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBiasInitializerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_GRU_biasInitializer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_GRU_biasInitializer_feature",
								"_UI_GRU_type"),
						NeuralnetworkPackage.Literals.GRU__BIAS_INITIALIZER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns GRU.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GRU"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GRU) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_GRU_type")
				: getString("_UI_GRU_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GRU.class)) {
		case NeuralnetworkPackage.GRU__UNITS:
		case NeuralnetworkPackage.GRU__ACTIVATION_FUNCTION:
		case NeuralnetworkPackage.GRU__RETURN_SEQUENCES:
		case NeuralnetworkPackage.GRU__RECURRENT_ACTIVATION:
		case NeuralnetworkPackage.GRU__USE_BIAS:
		case NeuralnetworkPackage.GRU__KERNEL_INITIALIZER:
		case NeuralnetworkPackage.GRU__RECURRENT_INITIALIZER:
		case NeuralnetworkPackage.GRU__BIAS_INITIALIZER:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
