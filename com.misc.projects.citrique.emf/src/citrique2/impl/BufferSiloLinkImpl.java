/**
 */
package citrique2.impl;

import citrique2.Buffer;
import citrique2.BufferSiloLink;
import citrique2.Silo;
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
 * An implementation of the model object '<em><b>Buffer Silo Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique2.impl.BufferSiloLinkImpl#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique2.impl.BufferSiloLinkImpl#getBuffer <em>Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BufferSiloLinkImpl extends PlantLinkImpl implements BufferSiloLink {
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
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected Buffer buffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferSiloLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ctr2Package.Literals.BUFFER_SILO_LINK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ctr2Package.BUFFER_SILO_LINK__SILO, oldSilo, silo));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ctr2Package.BUFFER_SILO_LINK__SILO, oldSilo, newSilo);
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
				msgs = ((InternalEObject)silo).eInverseRemove(this, ctr2Package.SILO__BUFFER_LINKS, Silo.class, msgs);
			if (newSilo != null)
				msgs = ((InternalEObject)newSilo).eInverseAdd(this, ctr2Package.SILO__BUFFER_LINKS, Silo.class, msgs);
			msgs = basicSetSilo(newSilo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ctr2Package.BUFFER_SILO_LINK__SILO, newSilo, newSilo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer getBuffer() {
		if (buffer != null && buffer.eIsProxy()) {
			InternalEObject oldBuffer = (InternalEObject)buffer;
			buffer = (Buffer)eResolveProxy(oldBuffer);
			if (buffer != oldBuffer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ctr2Package.BUFFER_SILO_LINK__BUFFER, oldBuffer, buffer));
			}
		}
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer basicGetBuffer() {
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBuffer(Buffer newBuffer, NotificationChain msgs) {
		Buffer oldBuffer = buffer;
		buffer = newBuffer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ctr2Package.BUFFER_SILO_LINK__BUFFER, oldBuffer, newBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuffer(Buffer newBuffer) {
		if (newBuffer != buffer) {
			NotificationChain msgs = null;
			if (buffer != null)
				msgs = ((InternalEObject)buffer).eInverseRemove(this, ctr2Package.BUFFER__SILO_LINKS, Buffer.class, msgs);
			if (newBuffer != null)
				msgs = ((InternalEObject)newBuffer).eInverseAdd(this, ctr2Package.BUFFER__SILO_LINKS, Buffer.class, msgs);
			msgs = basicSetBuffer(newBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ctr2Package.BUFFER_SILO_LINK__BUFFER, newBuffer, newBuffer));
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				if (silo != null)
					msgs = ((InternalEObject)silo).eInverseRemove(this, ctr2Package.SILO__BUFFER_LINKS, Silo.class, msgs);
				return basicSetSilo((Silo)otherEnd, msgs);
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				if (buffer != null)
					msgs = ((InternalEObject)buffer).eInverseRemove(this, ctr2Package.BUFFER__SILO_LINKS, Buffer.class, msgs);
				return basicSetBuffer((Buffer)otherEnd, msgs);
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				return basicSetSilo(null, msgs);
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				return basicSetBuffer(null, msgs);
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				if (resolve) return getSilo();
				return basicGetSilo();
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				if (resolve) return getBuffer();
				return basicGetBuffer();
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				setSilo((Silo)newValue);
				return;
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				setBuffer((Buffer)newValue);
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				setSilo((Silo)null);
				return;
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				setBuffer((Buffer)null);
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
			case ctr2Package.BUFFER_SILO_LINK__SILO:
				return silo != null;
			case ctr2Package.BUFFER_SILO_LINK__BUFFER:
				return buffer != null;
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
			case ctr2Package.BUFFER_SILO_LINK___REFRESH_DISPOSE:
				refreshDispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void refreshShortType() {
		String type = "B-S";
		this.setShortType(type);
	}
	
} //BufferSiloLinkImpl
