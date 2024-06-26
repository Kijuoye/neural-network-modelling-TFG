/**
 */
package neuralnetwork.neuralnetwork.provider;

import java.util.Collection;
import java.util.List;

import neuralnetwork.neuralnetwork.Model;
import neuralnetwork.neuralnetwork.NeuralnetworkFactory;
import neuralnetwork.neuralnetwork.NeuralnetworkPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link neuralnetwork.neuralnetwork.Model} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addOptimizerPropertyDescriptor(object);
			addLossPropertyDescriptor(object);
			addOutputLayersPropertyDescriptor(object);
			addInputLayersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_name_feature", "_UI_Model_type"),
						NeuralnetworkPackage.Literals.MODEL__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Optimizer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOptimizerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_optimizer_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_optimizer_feature",
								"_UI_Model_type"),
						NeuralnetworkPackage.Literals.MODEL__OPTIMIZER, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Loss feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLossPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_loss_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_loss_feature", "_UI_Model_type"),
						NeuralnetworkPackage.Literals.MODEL__LOSS, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Output Layers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputLayersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_outputLayers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_outputLayers_feature",
								"_UI_Model_type"),
						NeuralnetworkPackage.Literals.MODEL__OUTPUT_LAYERS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Input Layers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputLayersPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Model_inputLayers_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Model_inputLayers_feature",
								"_UI_Model_type"),
						NeuralnetworkPackage.Literals.MODEL__INPUT_LAYERS, true, false, true, null, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(NeuralnetworkPackage.Literals.MODEL__LAYERS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Model.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Model"));
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
		String label = ((Model) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Model_type")
				: getString("_UI_Model_type") + " " + label;
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

		switch (notification.getFeatureID(Model.class)) {
		case NeuralnetworkPackage.MODEL__NAME:
		case NeuralnetworkPackage.MODEL__OPTIMIZER:
		case NeuralnetworkPackage.MODEL__LOSS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case NeuralnetworkPackage.MODEL__LAYERS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createInput()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createDense()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createConcatenate()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createEmbedding()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createGRU()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createDropout()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createBidirectional()));

		newChildDescriptors.add(createChildParameter(NeuralnetworkPackage.Literals.MODEL__LAYERS,
				NeuralnetworkFactory.eINSTANCE.createCustomLayer()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return NeuralnetworkEditPlugin.INSTANCE;
	}

}
