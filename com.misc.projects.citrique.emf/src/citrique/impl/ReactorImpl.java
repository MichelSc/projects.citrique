/**
 */
package citrique.impl;

import citrique.CitriquePackage;
import citrique.LinkSiloReactor;
import citrique.Reactor;

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
 *   <li>{@link citrique.impl.ReactorImpl#getSiloLinks <em>Silo Links</em>}</li>
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
	protected EList<LinkSiloReactor> siloLinks;

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
		return CitriquePackage.Literals.REACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkSiloReactor> getSiloLinks() {
		if (siloLinks == null) {
			siloLinks = new EObjectWithInverseResolvingEList<LinkSiloReactor>(LinkSiloReactor.class, this, CitriquePackage.REACTOR__SILO_LINKS, CitriquePackage.LINK_SILO_REACTOR__REACTOR);
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
			case CitriquePackage.REACTOR__SILO_LINKS:
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
			case CitriquePackage.REACTOR__SILO_LINKS:
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
			case CitriquePackage.REACTOR__SILO_LINKS:
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
			case CitriquePackage.REACTOR__SILO_LINKS:
				getSiloLinks().clear();
				getSiloLinks().addAll((Collection<? extends LinkSiloReactor>)newValue);
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
			case CitriquePackage.REACTOR__SILO_LINKS:
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
			case CitriquePackage.REACTOR__SILO_LINKS:
				return siloLinks != null && !siloLinks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReactorImpl
