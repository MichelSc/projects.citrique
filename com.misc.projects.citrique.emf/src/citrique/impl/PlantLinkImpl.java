/**
 */
package citrique.impl;

import citrique.CitriquePackage;
import citrique.PlantLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique.impl.PlantLinkImpl#getLength <em>Length</em>}</li>
 *   <li>{@link citrique.impl.PlantLinkImpl#getHeightFrom <em>Height From</em>}</li>
 *   <li>{@link citrique.impl.PlantLinkImpl#getHeightTo <em>Height To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlantLinkImpl extends PlantObjectImpl implements PlantLink {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightFrom() <em>Height From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightFrom()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_FROM_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeightFrom() <em>Height From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightFrom()
	 * @generated
	 * @ordered
	 */
	protected float heightFrom = HEIGHT_FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightTo() <em>Height To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightTo()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_TO_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeightTo() <em>Height To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightTo()
	 * @generated
	 * @ordered
	 */
	protected float heightTo = HEIGHT_TO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitriquePackage.Literals.PLANT_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.PLANT_LINK__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeightFrom() {
		return heightFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightFrom(float newHeightFrom) {
		float oldHeightFrom = heightFrom;
		heightFrom = newHeightFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.PLANT_LINK__HEIGHT_FROM, oldHeightFrom, heightFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeightTo() {
		return heightTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightTo(float newHeightTo) {
		float oldHeightTo = heightTo;
		heightTo = newHeightTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CitriquePackage.PLANT_LINK__HEIGHT_TO, oldHeightTo, heightTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitriquePackage.PLANT_LINK__LENGTH:
				return getLength();
			case CitriquePackage.PLANT_LINK__HEIGHT_FROM:
				return getHeightFrom();
			case CitriquePackage.PLANT_LINK__HEIGHT_TO:
				return getHeightTo();
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
			case CitriquePackage.PLANT_LINK__LENGTH:
				setLength((Float)newValue);
				return;
			case CitriquePackage.PLANT_LINK__HEIGHT_FROM:
				setHeightFrom((Float)newValue);
				return;
			case CitriquePackage.PLANT_LINK__HEIGHT_TO:
				setHeightTo((Float)newValue);
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
			case CitriquePackage.PLANT_LINK__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case CitriquePackage.PLANT_LINK__HEIGHT_FROM:
				setHeightFrom(HEIGHT_FROM_EDEFAULT);
				return;
			case CitriquePackage.PLANT_LINK__HEIGHT_TO:
				setHeightTo(HEIGHT_TO_EDEFAULT);
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
			case CitriquePackage.PLANT_LINK__LENGTH:
				return length != LENGTH_EDEFAULT;
			case CitriquePackage.PLANT_LINK__HEIGHT_FROM:
				return heightFrom != HEIGHT_FROM_EDEFAULT;
			case CitriquePackage.PLANT_LINK__HEIGHT_TO:
				return heightTo != HEIGHT_TO_EDEFAULT;
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
		result.append(" (Length: ");
		result.append(length);
		result.append(", HeightFrom: ");
		result.append(heightFrom);
		result.append(", HeightTo: ");
		result.append(heightTo);
		result.append(')');
		return result.toString();
	}

} //PlantLinkImpl
