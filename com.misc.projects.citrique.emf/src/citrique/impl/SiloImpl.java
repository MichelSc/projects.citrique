/**
 */
package citrique.impl;

import citrique.BufferSiloLink;
import citrique.CitriquePackage;
import citrique.Silo;
import citrique.SiloReactorLink;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Silo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique.impl.SiloImpl#getBufferLinks <em>Buffer Links</em>}</li>
 *   <li>{@link citrique.impl.SiloImpl#getReactorLinks <em>Reactor Links</em>}</li>
 *   <li>{@link citrique.impl.SiloImpl#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiloImpl extends PlantNodeImpl implements Silo {
	/**
	 * The cached value of the '{@link #getBufferLinks() <em>Buffer Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<BufferSiloLink> bufferLinks;

	/**
	 * The cached value of the '{@link #getReactorLinks() <em>Reactor Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactorLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SiloReactorLink> reactorLinks;

	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final float CAPACITY_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected float capacity = CAPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiloImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitriquePackage.Literals.SILO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BufferSiloLink> getBufferLinks() {
		if (bufferLinks == null) {
			bufferLinks = new EObjectWithInverseResolvingEList<BufferSiloLink>(BufferSiloLink.class, this, CitriquePackage.SILO__BUFFER_LINKS, CitriquePackage.BUFFER_SILO_LINK__SILO);
		}
		return bufferLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiloReactorLink> getReactorLinks() {
		if (reactorLinks == null) {
			reactorLinks = new EObjectWithInverseResolvingEList<SiloReactorLink>(SiloReactorLink.class, this, CitriquePackage.SILO__REACTOR_LINKS, CitriquePackage.SILO_REACTOR_LINK__SILO);
		}
		return reactorLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(float newCapacity) {
		float oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.SILO__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitriquePackage.SILO__BUFFER_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBufferLinks()).basicAdd(otherEnd, msgs);
			case CitriquePackage.SILO__REACTOR_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getReactorLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitriquePackage.SILO__BUFFER_LINKS:
				return ((InternalEList<?>)getBufferLinks()).basicRemove(otherEnd, msgs);
			case CitriquePackage.SILO__REACTOR_LINKS:
				return ((InternalEList<?>)getReactorLinks()).basicRemove(otherEnd, msgs);
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
			case CitriquePackage.SILO__BUFFER_LINKS:
				return getBufferLinks();
			case CitriquePackage.SILO__REACTOR_LINKS:
				return getReactorLinks();
			case CitriquePackage.SILO__CAPACITY:
				return getCapacity();
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
			case CitriquePackage.SILO__BUFFER_LINKS:
				getBufferLinks().clear();
				getBufferLinks().addAll((Collection<? extends BufferSiloLink>)newValue);
				return;
			case CitriquePackage.SILO__REACTOR_LINKS:
				getReactorLinks().clear();
				getReactorLinks().addAll((Collection<? extends SiloReactorLink>)newValue);
				return;
			case CitriquePackage.SILO__CAPACITY:
				setCapacity((Float)newValue);
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
			case CitriquePackage.SILO__BUFFER_LINKS:
				getBufferLinks().clear();
				return;
			case CitriquePackage.SILO__REACTOR_LINKS:
				getReactorLinks().clear();
				return;
			case CitriquePackage.SILO__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
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
			case CitriquePackage.SILO__BUFFER_LINKS:
				return bufferLinks != null && !bufferLinks.isEmpty();
			case CitriquePackage.SILO__REACTOR_LINKS:
				return reactorLinks != null && !reactorLinks.isEmpty();
			case CitriquePackage.SILO__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //SiloImpl
