/**
 */
package citrique2.impl;

import citrique2.Reactor;
import citrique2.Silo;
import citrique2.SiloReactorLink;
import citrique2.ctr2Package;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Silo Reactor Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique2.impl.SiloReactorLinkImpl#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique2.impl.SiloReactorLinkImpl#getReactor <em>Reactor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SiloReactorLinkImpl extends PlantLinkImpl implements SiloReactorLink {
	/**
	 * The cached value of the '{@link #getSilo() <em>Silo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilo()
	 * @generated
	 * @ordered
	 */
	protected Silo silo;

	/**
	 * The cached value of the '{@link #getReactor() <em>Reactor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactor()
	 * @generated
	 * @ordered
	 */
	protected Reactor reactor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SiloReactorLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ctr2Package.Literals.SILO_REACTOR_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Silo getSilo() {
		if (silo != null && silo.eIsProxy()) {
			InternalEObject oldSilo = (InternalEObject)silo;
			silo = (Silo)eResolveProxy(oldSilo);
			if (silo != oldSilo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ctr2Package.SILO_REACTOR_LINK__SILO, oldSilo, silo));
			}
		}
		return silo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Silo basicGetSilo() {
		return silo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSilo(Silo newSilo, NotificationChain msgs) {
		Silo oldSilo = silo;
		silo = newSilo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ctr2Package.SILO_REACTOR_LINK__SILO, oldSilo, newSilo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSilo(Silo newSilo) {
		if (newSilo != silo) {
			NotificationChain msgs = null;
			if (silo != null)
				msgs = ((InternalEObject)silo).eInverseRemove(this, ctr2Package.SILO__REACTOR_LINKS, Silo.class, msgs);
			if (newSilo != null)
				msgs = ((InternalEObject)newSilo).eInverseAdd(this, ctr2Package.SILO__REACTOR_LINKS, Silo.class, msgs);
			msgs = basicSetSilo(newSilo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ctr2Package.SILO_REACTOR_LINK__SILO, newSilo, newSilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reactor getReactor() {
		if (reactor != null && reactor.eIsProxy()) {
			InternalEObject oldReactor = (InternalEObject)reactor;
			reactor = (Reactor)eResolveProxy(oldReactor);
			if (reactor != oldReactor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ctr2Package.SILO_REACTOR_LINK__REACTOR, oldReactor, reactor));
			}
		}
		return reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reactor basicGetReactor() {
		return reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactor(Reactor newReactor, NotificationChain msgs) {
		Reactor oldReactor = reactor;
		reactor = newReactor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ctr2Package.SILO_REACTOR_LINK__REACTOR, oldReactor, newReactor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReactor(Reactor newReactor) {
		if (newReactor != reactor) {
			NotificationChain msgs = null;
			if (reactor != null)
				msgs = ((InternalEObject)reactor).eInverseRemove(this, ctr2Package.REACTOR__SILO_LINKS, Reactor.class, msgs);
			if (newReactor != null)
				msgs = ((InternalEObject)newReactor).eInverseAdd(this, ctr2Package.REACTOR__SILO_LINKS, Reactor.class, msgs);
			msgs = basicSetReactor(newReactor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ctr2Package.SILO_REACTOR_LINK__REACTOR, newReactor, newReactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshDispose() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				if (silo != null)
					msgs = ((InternalEObject)silo).eInverseRemove(this, ctr2Package.SILO__REACTOR_LINKS, Silo.class, msgs);
				return basicSetSilo((Silo)otherEnd, msgs);
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				if (reactor != null)
					msgs = ((InternalEObject)reactor).eInverseRemove(this, ctr2Package.REACTOR__SILO_LINKS, Reactor.class, msgs);
				return basicSetReactor((Reactor)otherEnd, msgs);
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
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				return basicSetSilo(null, msgs);
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				return basicSetReactor(null, msgs);
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
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				if (resolve) return getSilo();
				return basicGetSilo();
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				if (resolve) return getReactor();
				return basicGetReactor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				setSilo((Silo)newValue);
				return;
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				setReactor((Reactor)newValue);
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
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				setSilo((Silo)null);
				return;
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				setReactor((Reactor)null);
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
			case ctr2Package.SILO_REACTOR_LINK__SILO:
				return silo != null;
			case ctr2Package.SILO_REACTOR_LINK__REACTOR:
				return reactor != null;
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
			case ctr2Package.SILO_REACTOR_LINK___REFRESH_DISPOSE:
				refreshDispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void refreshShortType() {
		String type = "S-R";
		this.shortType = type;
	}
	
} //SiloReactorLinkImpl
