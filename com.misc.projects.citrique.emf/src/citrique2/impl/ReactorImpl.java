/**
 */
package citrique2.impl;

import citrique2.Reactor;
import citrique2.SiloReactorLink;
import citrique2.ctr2Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reactor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique2.impl.ReactorImpl#getSiloLinks <em>Silo Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactorImpl extends PlantNodeImpl implements Reactor {
	/**
	 * The cached value of the '{@link #getSiloLinks() <em>Silo Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiloLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<SiloReactorLink> siloLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ctr2Package.Literals.REACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiloReactorLink> getSiloLinks() {
		if (siloLinks == null) {
			siloLinks = new EObjectWithInverseResolvingEList<SiloReactorLink>(SiloReactorLink.class, this, ctr2Package.REACTOR__SILO_LINKS, ctr2Package.SILO_REACTOR_LINK__REACTOR);
		}
		return siloLinks;
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
			case ctr2Package.REACTOR__SILO_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSiloLinks()).basicAdd(otherEnd, msgs);
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
			case ctr2Package.REACTOR__SILO_LINKS:
				return ((InternalEList<?>)getSiloLinks()).basicRemove(otherEnd, msgs);
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
			case ctr2Package.REACTOR__SILO_LINKS:
				return getSiloLinks();
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
			case ctr2Package.REACTOR__SILO_LINKS:
				getSiloLinks().clear();
				getSiloLinks().addAll((Collection<? extends SiloReactorLink>)newValue);
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
			case ctr2Package.REACTOR__SILO_LINKS:
				getSiloLinks().clear();
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
			case ctr2Package.REACTOR__SILO_LINKS:
				return siloLinks != null && !siloLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public void refreshShortType() {
		String type = "RE";
		this.setShortType(type);
	}
	
} //ReactorImpl
