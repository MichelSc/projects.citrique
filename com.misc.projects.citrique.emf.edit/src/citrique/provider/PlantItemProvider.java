/**
 */
package citrique.provider;


import citrique.CitriqueFactory;
import citrique.CitriquePackage;
import citrique.Plant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link citrique.Plant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PlantItemProvider
	extends CitriqueObjectItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantItemProvider(AdapterFactory adapterFactory) {
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

			addNodePropertyDescriptor(object);
			addLinkPropertyDescriptor(object);
			addPlantObjectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plant_Node_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plant_Node_feature", "_UI_Plant_type"),
				 CitriquePackage.Literals.PLANT__NODE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plant_Link_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plant_Link_feature", "_UI_Plant_type"),
				 CitriquePackage.Literals.PLANT__LINK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Plant Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPlantObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Plant_PlantObject_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Plant_PlantObject_feature", "_UI_Plant_type"),
				 CitriquePackage.Literals.PLANT__PLANT_OBJECT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
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
			childrenFeatures.add(CitriquePackage.Literals.PLANT__BUFFER);
			childrenFeatures.add(CitriquePackage.Literals.PLANT__SILO);
			childrenFeatures.add(CitriquePackage.Literals.PLANT__REACTOR);
			childrenFeatures.add(CitriquePackage.Literals.PLANT__BUFFER_SILO_LINK);
			childrenFeatures.add(CitriquePackage.Literals.PLANT__SILO_REACTOR_LINK);
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
	 * This returns Plant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Plant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Plant)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Plant_type") :
			getString("_UI_Plant_type") + " " + label;
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

		switch (notification.getFeatureID(Plant.class)) {
			case CitriquePackage.PLANT__BUFFER:
			case CitriquePackage.PLANT__SILO:
			case CitriquePackage.PLANT__REACTOR:
			case CitriquePackage.PLANT__BUFFER_SILO_LINK:
			case CitriquePackage.PLANT__SILO_REACTOR_LINK:
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

		newChildDescriptors.add
			(createChildParameter
				(CitriquePackage.Literals.PLANT__BUFFER,
				 CitriqueFactory.eINSTANCE.createBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(CitriquePackage.Literals.PLANT__SILO,
				 CitriqueFactory.eINSTANCE.createSilo()));

		newChildDescriptors.add
			(createChildParameter
				(CitriquePackage.Literals.PLANT__REACTOR,
				 CitriqueFactory.eINSTANCE.createReactor()));

		newChildDescriptors.add
			(createChildParameter
				(CitriquePackage.Literals.PLANT__BUFFER_SILO_LINK,
				 CitriqueFactory.eINSTANCE.createBufferSiloLink()));

		newChildDescriptors.add
			(createChildParameter
				(CitriquePackage.Literals.PLANT__SILO_REACTOR_LINK,
				 CitriqueFactory.eINSTANCE.createSiloReactorLink()));
	}

}
