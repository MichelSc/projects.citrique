/**
 */
package citrique3.impl;

import citrique3.Citrique3Package;
import citrique3.CitriqueDomain;
import citrique3.Plant;
import citrique3.calc.CitriqueDomainLayerObjectChildren;
import citrique3.calc.CitriqueDomainLayerObjectDescription;
import citrique3.calc.CitriqueDomainLayerObjectInit;
import citrique3.calc.CitriqueDomainScope;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import com.misc.common.moplaf.propagator.PropagatorPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.propagator.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citrique Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique3.impl.CitriqueDomainImpl#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CitriqueDomainImpl extends CitriqueObjectImpl implements CitriqueDomain {
	/**
	 * The cached value of the '{@link #getPlant() <em>Plant</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlant()
	 * @generated
	 * @ordered
	 */
	protected EList<Plant> plant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitriqueDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void addPropagatorFunctionAdapter() {
		super.addPropagatorFunctionAdapter();
		Util.adapt(this, CitriqueDomainScope.class );
		Util.adapt(this, CitriqueDomainLayerObjectInit.class );
		Util.adapt(this, CitriqueDomainLayerObjectChildren.class );
		Util.adapt(this, CitriqueDomainLayerObjectDescription.class );
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Citrique3Package.Literals.CITRIQUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getPlant() {
		if (plant == null) {
			plant = new EObjectContainmentEList<Plant>(Plant.class, this, Citrique3Package.CITRIQUE_DOMAIN__PLANT);
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		CommonPlugin.INSTANCE.log( "domain "+ this.toString());

    	CommonPlugin.INSTANCE.log( "..: refresh");
    	CitriqueDomainScope scope = (CitriqueDomainScope)Util.getAdapter(this, CitriqueDomainScope.class);
    	if ( scope!=null){
    		scope.refresh();
    	}
    	CommonPlugin.INSTANCE.log( "..: refresh done");
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Citrique3Package.CITRIQUE_DOMAIN__PLANT:
				return ((InternalEList<?>)getPlant()).basicRemove(otherEnd, msgs);
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
			case Citrique3Package.CITRIQUE_DOMAIN__PLANT:
				return getPlant();
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
			case Citrique3Package.CITRIQUE_DOMAIN__PLANT:
				getPlant().clear();
				getPlant().addAll((Collection<? extends Plant>)newValue);
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
			case Citrique3Package.CITRIQUE_DOMAIN__PLANT:
				getPlant().clear();
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
			case Citrique3Package.CITRIQUE_DOMAIN__PLANT:
				return plant != null && !plant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ObjectWithPropagatorFunctionAdapterScope.class) {
			switch (baseOperationID) {
				case PropagatorPackage.OBJECT_WITH_PROPAGATOR_FUNCTION_ADAPTER_SCOPE___REFRESH: return Citrique3Package.CITRIQUE_DOMAIN___REFRESH;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Citrique3Package.CITRIQUE_DOMAIN___REFRESH:
				refresh();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void refreshShortType() {
		String type = "PL";
		this.setShortType(type);
	}
} //CitriqueDomainImpl
