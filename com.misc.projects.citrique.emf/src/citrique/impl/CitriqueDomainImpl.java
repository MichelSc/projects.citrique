/**
 */
package citrique.impl;

import citrique.CitriqueDomain;
import citrique.CitriqueObject;
import citrique.CitriquePackage;
import citrique.Plant;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.propagator.PropagatorFunctionAdapter;
import com.misc.common.moplaf.propagator.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique.impl.CitriqueDomainImpl#getPlant <em>Plant</em>}</li>
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
		return CitriquePackage.Literals.CITRIQUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Plant> getPlant() {
		if (plant == null) {
			plant = new EObjectContainmentEList<Plant>(Plant.class, this, CitriquePackage.CITRIQUE_DOMAIN__PLANT);
		}
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refresh() {
		CitriqueDomain domain= this;
		PropagatorFunctionAdapter scope = (PropagatorFunctionAdapter)Util.getAdapter(domain, Scope.class);
		scope.refresh();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitriquePackage.CITRIQUE_DOMAIN__PLANT:
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
			case CitriquePackage.CITRIQUE_DOMAIN__PLANT:
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
			case CitriquePackage.CITRIQUE_DOMAIN__PLANT:
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
			case CitriquePackage.CITRIQUE_DOMAIN__PLANT:
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
			case CitriquePackage.CITRIQUE_DOMAIN__PLANT:
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
			case CitriquePackage.CITRIQUE_DOMAIN___REFRESH:
				refresh();
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
		return new Scope();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerObjectChildren(){
		return new LayerObjectChildren();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerObjectDescription(){
		return new LayerObjectDescription();
	}
	
	PropagatorFunctionAdapter createPropagatorLayerInit(){
		return new LayerInit();
	}
	
	// propagator  class definitions ------------------------------------------
	public static class Scope extends PropagatorFunctionAdapter {
	} // class Scope

	public class LayerInit extends PropagatorFunctionAdapter {

		@Override
		protected PropagatorFunctionAdapter getParent() {
			Notifier target = this.target;
			CitriqueDomain domain= (CitriqueDomain)target;
			PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter)Util.getAdapter(domain, Scope.class);
			return parent;
		}
	} // class LayerInit
			
	public class LayerFinalize extends PropagatorFunctionAdapter {

		@Override
		protected PropagatorFunctionAdapter getParent() {
			Notifier target = this.target;
			CitriqueDomain domain= (CitriqueDomain)target;
			PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter)Util.getAdapter(domain, Scope.class);
			return parent;
		}
	} // class FinalizeInit
			
	public class LayerObjectChildren extends PropagatorFunctionAdapter {

		@Override
		protected PropagatorFunctionAdapter getParent() {
			Notifier target = this.target;
			CitriqueDomain domain= (CitriqueDomain)target;
			PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter)Util.getAdapter(domain, Scope.class);
			return parent;
		}
	} // class LayerObjectChildren
			
	public class LayerObjectDescription extends PropagatorFunctionAdapter {

		@Override
		protected PropagatorFunctionAdapter getParent() {
			Notifier target = this.target;
			CitriqueDomain domain= (CitriqueDomain)target;
			PropagatorFunctionAdapter parent = (PropagatorFunctionAdapter)Util.getAdapter(domain, Scope.class);
			return parent;
		}
		@Override
		protected List<PropagatorFunctionAdapter> getAntecedents() {
			Notifier target = this.target;
			CitriqueDomain domain= (CitriqueDomain)target;
			PropagatorFunctionAdapter layerchildren = (PropagatorFunctionAdapter)Util.getAdapter(domain, LayerObjectChildren.class);
			
			ArrayList<PropagatorFunctionAdapter> antecedents = new ArrayList<PropagatorFunctionAdapter>();
			antecedents.add(layerchildren);
			return antecedents;
		}
	} // class LayerObjectDescription
			
} //CitriqueDomainImpl
