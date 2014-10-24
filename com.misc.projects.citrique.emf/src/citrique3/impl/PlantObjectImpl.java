/**
 */
package citrique3.impl;

import citrique3.Citrique3Package;
import citrique3.Plant;
import citrique3.PlantObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique3.impl.PlantObjectImpl#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlantObjectImpl extends CitriqueObjectImpl implements PlantObject {
	/**
	 * The cached value of the '{@link #getPlant() <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlant()
	 * @generated
	 * @ordered
	 */
	protected Plant plant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Citrique3Package.Literals.PLANT_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant getPlant() {
		if (plant != null && plant.eIsProxy()) {
			InternalEObject oldPlant = (InternalEObject)plant;
			plant = (Plant)eResolveProxy(oldPlant);
			if (plant != oldPlant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Citrique3Package.PLANT_OBJECT__PLANT, oldPlant, plant));
			}
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant basicGetPlant() {
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlant(Plant newPlant, NotificationChain msgs) {
		Plant oldPlant = plant;
		plant = newPlant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Citrique3Package.PLANT_OBJECT__PLANT, oldPlant, newPlant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlant(Plant newPlant) {
		if (newPlant != plant) {
			NotificationChain msgs = null;
			if (plant != null)
				msgs = ((InternalEObject)plant).eInverseRemove(this, Citrique3Package.PLANT__PLANT_OBJECT, Plant.class, msgs);
			if (newPlant != null)
				msgs = ((InternalEObject)newPlant).eInverseAdd(this, Citrique3Package.PLANT__PLANT_OBJECT, Plant.class, msgs);
			msgs = basicSetPlant(newPlant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Citrique3Package.PLANT_OBJECT__PLANT, newPlant, newPlant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Citrique3Package.PLANT_OBJECT__PLANT:
				if (plant != null)
					msgs = ((InternalEObject)plant).eInverseRemove(this, Citrique3Package.PLANT__PLANT_OBJECT, Plant.class, msgs);
				return basicSetPlant((Plant)otherEnd, msgs);
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
			case Citrique3Package.PLANT_OBJECT__PLANT:
				return basicSetPlant(null, msgs);
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
			case Citrique3Package.PLANT_OBJECT__PLANT:
				if (resolve) return getPlant();
				return basicGetPlant();
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
			case Citrique3Package.PLANT_OBJECT__PLANT:
				setPlant((Plant)newValue);
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
			case Citrique3Package.PLANT_OBJECT__PLANT:
				setPlant((Plant)null);
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
			case Citrique3Package.PLANT_OBJECT__PLANT:
				return plant != null;
		}
		return super.eIsSet(featureID);
	}

} //PlantObjectImpl
