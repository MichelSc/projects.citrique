/**
 */
package citrique2.impl;

import citrique2.CitriqueDomain;
import citrique2.CitriqueObject;
import citrique2.Plant;
import citrique2.ctr2Package;
import citrique2.calc.CitriqueDomainLayerObjectChildren;
import citrique2.calc.CitriqueDomainLayerObjectDescription;
import citrique2.calc.CitriqueDomainLayerObjectInit;
import citrique2.calc.CitriqueDomainScope;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citrique Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique2.impl.CitriqueDomainImpl#getPlant <em>Plant</em>}</li>
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
	 */
	protected CitriqueDomainImpl() {
		super();
		this.eAdapters().add(this.createPropagatorScope());
		this.eAdapters().add(this.createPropagatorLayerInit());
		this.eAdapters().add(this.createPropagatorLayerObjectChildren());
		this.eAdapters().add(this.createPropagatorLayerObjectDescription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ctr2Package.Literals.CITRIQUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getPlant() {
		if (plant == null) {
			plant = new EObjectContainmentEList<Plant>(Plant.class, this, ctr2Package.CITRIQUE_DOMAIN__PLANT);
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		PropagatorFunctionAdapter scope = (PropagatorFunctionAdapter)Util.getAdapter(this, CitriqueDomainScope.class);
		scope.refresh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void resetTouched() {
		 PropagatorFunctionAdapter scope = (PropagatorFunctionAdapter)Util.getAdapter(this, CitriqueDomainScope.class);
			 scope.resetTouched();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ctr2Package.CITRIQUE_DOMAIN__PLANT:
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
			case ctr2Package.CITRIQUE_DOMAIN__PLANT:
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
			case ctr2Package.CITRIQUE_DOMAIN__PLANT:
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
			case ctr2Package.CITRIQUE_DOMAIN__PLANT:
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
			case ctr2Package.CITRIQUE_DOMAIN__PLANT:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ctr2Package.CITRIQUE_DOMAIN___REFRESH:
				refresh();
				return null;
			case ctr2Package.CITRIQUE_DOMAIN___RESET_TOUCHED:
				resetTouched();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshChildren() {
		HashSet<CitriqueObject> objectstobe = new HashSet<CitriqueObject>();
		objectstobe.addAll(this.getPlant());

		HashSet<CitriqueObject> objectsasis = new HashSet<CitriqueObject>(this.getChild());
		
		HashSet<CitriqueObject> objectstoadd = new HashSet<CitriqueObject>(objectstobe); 
		objectstoadd.removeAll(objectsasis);
		
		HashSet<CitriqueObject> objectstoremove = new HashSet<CitriqueObject>(objectsasis); 
		objectstoremove.removeAll(objectstobe);
		
		this.getChild().addAll(objectstoadd);
		this.getChild().removeAll(objectstoremove);
	}

	@Override
	public void refreshShortType() {
		String type = "CI";
		this.setShortType(type);
	}
	
	// propagator create methods ----------------------------------------------
	PropagatorFunctionAdapter createPropagatorScope(){
		return new CitriqueDomainScope();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerObjectChildren(){
		return new CitriqueDomainLayerObjectChildren();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerObjectDescription(){
		return new CitriqueDomainLayerObjectDescription();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerInit(){
		return new CitriqueDomainLayerObjectInit();
	}
	
			
			
} //CitriqueDomainImpl
