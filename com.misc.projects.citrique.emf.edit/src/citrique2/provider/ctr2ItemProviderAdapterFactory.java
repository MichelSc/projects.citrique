/**
 */
package citrique2.provider;

import citrique2.util.ctr2AdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ctr2ItemProviderAdapterFactory extends ctr2AdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.CitriqueObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitriqueObjectItemProvider citriqueObjectItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.CitriqueObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCitriqueObjectAdapter() {
		if (citriqueObjectItemProvider == null) {
			citriqueObjectItemProvider = new CitriqueObjectItemProvider(this);
		}

		return citriqueObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.CitriqueDomain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitriqueDomainItemProvider citriqueDomainItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.CitriqueDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCitriqueDomainAdapter() {
		if (citriqueDomainItemProvider == null) {
			citriqueDomainItemProvider = new CitriqueDomainItemProvider(this);
		}

		return citriqueDomainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.PlantObject} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantObjectItemProvider plantObjectItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.PlantObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantObjectAdapter() {
		if (plantObjectItemProvider == null) {
			plantObjectItemProvider = new PlantObjectItemProvider(this);
		}

		return plantObjectItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.Plant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantItemProvider plantItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.Plant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantAdapter() {
		if (plantItemProvider == null) {
			plantItemProvider = new PlantItemProvider(this);
		}

		return plantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.Buffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferItemProvider bufferItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.Buffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferAdapter() {
		if (bufferItemProvider == null) {
			bufferItemProvider = new BufferItemProvider(this);
		}

		return bufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.Silo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiloItemProvider siloItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.Silo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiloAdapter() {
		if (siloItemProvider == null) {
			siloItemProvider = new SiloItemProvider(this);
		}

		return siloItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.Reactor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactorItemProvider reactorItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.Reactor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReactorAdapter() {
		if (reactorItemProvider == null) {
			reactorItemProvider = new ReactorItemProvider(this);
		}

		return reactorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.PlantNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantNodeItemProvider plantNodeItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.PlantNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantNodeAdapter() {
		if (plantNodeItemProvider == null) {
			plantNodeItemProvider = new PlantNodeItemProvider(this);
		}

		return plantNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.PlantLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantLinkItemProvider plantLinkItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.PlantLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPlantLinkAdapter() {
		if (plantLinkItemProvider == null) {
			plantLinkItemProvider = new PlantLinkItemProvider(this);
		}

		return plantLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.BufferSiloLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferSiloLinkItemProvider bufferSiloLinkItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.BufferSiloLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferSiloLinkAdapter() {
		if (bufferSiloLinkItemProvider == null) {
			bufferSiloLinkItemProvider = new BufferSiloLinkItemProvider(this);
		}

		return bufferSiloLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link citrique2.SiloReactorLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiloReactorLinkItemProvider siloReactorLinkItemProvider;

	/**
	 * This creates an adapter for a {@link citrique2.SiloReactorLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSiloReactorLinkAdapter() {
		if (siloReactorLinkItemProvider == null) {
			siloReactorLinkItemProvider = new SiloReactorLinkItemProvider(this);
		}

		return siloReactorLinkItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (citriqueObjectItemProvider != null) citriqueObjectItemProvider.dispose();
		if (citriqueDomainItemProvider != null) citriqueDomainItemProvider.dispose();
		if (plantObjectItemProvider != null) plantObjectItemProvider.dispose();
		if (plantItemProvider != null) plantItemProvider.dispose();
		if (bufferItemProvider != null) bufferItemProvider.dispose();
		if (siloItemProvider != null) siloItemProvider.dispose();
		if (reactorItemProvider != null) reactorItemProvider.dispose();
		if (plantNodeItemProvider != null) plantNodeItemProvider.dispose();
		if (plantLinkItemProvider != null) plantLinkItemProvider.dispose();
		if (bufferSiloLinkItemProvider != null) bufferSiloLinkItemProvider.dispose();
		if (siloReactorLinkItemProvider != null) siloReactorLinkItemProvider.dispose();
	}

}
