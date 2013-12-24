/**
 */
package citrique.impl;

import citrique.CitriqueObject;
import citrique.CitriquePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getChild <em>Child</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getShortType <em>Short Type</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link citrique.impl.CitriqueObjectImpl#getShortName <em>Short Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CitriqueObjectImpl extends MinimalEObjectImpl.Container implements CitriqueObject {
	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<CitriqueObject> child;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected CitriqueObject parent;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortType() <em>Short Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortType()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortType() <em>Short Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortType()
	 * @generated
	 * @ordered
	 */
	protected String shortType = SHORT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortDescription() <em>Short Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortDescription()
	 * @generated
	 * @ordered
	 */
	protected String shortDescription = SHORT_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortName() <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortName()
	 * @generated
	 * @ordered
	 */
	protected String shortName = SHORT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitriqueObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitriquePackage.Literals.CITRIQUE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CitriqueObject> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList<CitriqueObject>(CitriqueObject.class, this, CitriquePackage.CITRIQUE_OBJECT__CHILD, CitriquePackage.CITRIQUE_OBJECT__PARENT);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueObject getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (CitriqueObject)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CitriquePackage.CITRIQUE_OBJECT__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueObject basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(CitriqueObject newParent, NotificationChain msgs) {
		CitriqueObject oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(CitriqueObject newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, CitriquePackage.CITRIQUE_OBJECT__CHILD, CitriqueObject.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, CitriquePackage.CITRIQUE_OBJECT__CHILD, CitriqueObject.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortType() {
		return shortType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortType(String newShortType) {
		String oldShortType = shortType;
		shortType = newShortType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__SHORT_TYPE, oldShortType, shortType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortDescription(String newShortDescription) {
		String oldShortDescription = shortDescription;
		shortDescription = newShortDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__SHORT_DESCRIPTION, oldShortDescription, shortDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortName() {
		return shortName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortName(String newShortName) {
		String oldShortName = shortName;
		shortName = newShortName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.CITRIQUE_OBJECT__SHORT_NAME, oldShortName, shortName));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshDescription() {
		String type = this.getType();
		String name = this.getName();
		String description = type + ": "+name;
		this.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshShortDescription() {
		String type = this.getShortType();
		String name = this.getShortName();
		String description = type + ": "+name;
		this.setShortDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshType() {
		String type = this.eClass().getName();
		this.setType(type);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void refreshShortType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild()).basicAdd(otherEnd, msgs);
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, CitriquePackage.CITRIQUE_OBJECT__CHILD, CitriqueObject.class, msgs);
				return basicSetParent((CitriqueObject)otherEnd, msgs);
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				return basicSetParent(null, msgs);
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				return getChild();
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case CitriquePackage.CITRIQUE_OBJECT__NAME:
				return getName();
			case CitriquePackage.CITRIQUE_OBJECT__TYPE:
				return getType();
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_TYPE:
				return getShortType();
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_DESCRIPTION:
				return getShortDescription();
			case CitriquePackage.CITRIQUE_OBJECT__DESCRIPTION:
				return getDescription();
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_NAME:
				return getShortName();
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends CitriqueObject>)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				setParent((CitriqueObject)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__NAME:
				setName((String)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__TYPE:
				setType((String)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_TYPE:
				setShortType((String)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_DESCRIPTION:
				setShortDescription((String)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_NAME:
				setShortName((String)newValue);
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				getChild().clear();
				return;
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				setParent((CitriqueObject)null);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_TYPE:
				setShortType(SHORT_TYPE_EDEFAULT);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_DESCRIPTION:
				setShortDescription(SHORT_DESCRIPTION_EDEFAULT);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_NAME:
				setShortName(SHORT_NAME_EDEFAULT);
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
			case CitriquePackage.CITRIQUE_OBJECT__CHILD:
				return child != null && !child.isEmpty();
			case CitriquePackage.CITRIQUE_OBJECT__PARENT:
				return parent != null;
			case CitriquePackage.CITRIQUE_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CitriquePackage.CITRIQUE_OBJECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_TYPE:
				return SHORT_TYPE_EDEFAULT == null ? shortType != null : !SHORT_TYPE_EDEFAULT.equals(shortType);
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_DESCRIPTION:
				return SHORT_DESCRIPTION_EDEFAULT == null ? shortDescription != null : !SHORT_DESCRIPTION_EDEFAULT.equals(shortDescription);
			case CitriquePackage.CITRIQUE_OBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CitriquePackage.CITRIQUE_OBJECT__SHORT_NAME:
				return SHORT_NAME_EDEFAULT == null ? shortName != null : !SHORT_NAME_EDEFAULT.equals(shortName);
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
			case CitriquePackage.CITRIQUE_OBJECT___REFRESH_DESCRIPTION:
				refreshDescription();
				return null;
			case CitriquePackage.CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION:
				refreshShortDescription();
				return null;
			case CitriquePackage.CITRIQUE_OBJECT___REFRESH_TYPE:
				refreshType();
				return null;
			case CitriquePackage.CITRIQUE_OBJECT___REFRESH_SHORT_TYPE:
				refreshShortType();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", Type: ");
		result.append(type);
		result.append(", ShortType: ");
		result.append(shortType);
		result.append(", ShortDescription: ");
		result.append(shortDescription);
		result.append(", Description: ");
		result.append(description);
		result.append(", ShortName: ");
		result.append(shortName);
		result.append(')');
		return result.toString();
	}

} //CitriqueObjectImpl
