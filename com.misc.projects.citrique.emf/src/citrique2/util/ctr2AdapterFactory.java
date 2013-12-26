/**
 */
package citrique2.util;

import citrique2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see citrique2.ctr2Package
 * @generated
 */
public class ctr2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ctr2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ctr2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ctr2Switch<Adapter> modelSwitch =
		new ctr2Switch<Adapter>() {
			@Override
			public Adapter caseCitriqueObject(CitriqueObject object) {
				return createCitriqueObjectAdapter();
			}
			@Override
			public Adapter caseCitriqueDomain(CitriqueDomain object) {
				return createCitriqueDomainAdapter();
			}
			@Override
			public Adapter casePlantObject(PlantObject object) {
				return createPlantObjectAdapter();
			}
			@Override
			public Adapter casePlant(Plant object) {
				return createPlantAdapter();
			}
			@Override
			public Adapter caseBuffer(Buffer object) {
				return createBufferAdapter();
			}
			@Override
			public Adapter caseSilo(Silo object) {
				return createSiloAdapter();
			}
			@Override
			public Adapter caseReactor(Reactor object) {
				return createReactorAdapter();
			}
			@Override
			public Adapter casePlantNode(PlantNode object) {
				return createPlantNodeAdapter();
			}
			@Override
			public Adapter casePlantLink(PlantLink object) {
				return createPlantLinkAdapter();
			}
			@Override
			public Adapter caseBufferSiloLink(BufferSiloLink object) {
				return createBufferSiloLinkAdapter();
			}
			@Override
			public Adapter caseSiloReactorLink(SiloReactorLink object) {
				return createSiloReactorLinkAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link citrique2.CitriqueObject <em>Citrique Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.CitriqueObject
	 * @generated
	 */
	public Adapter createCitriqueObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.CitriqueDomain <em>Citrique Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.CitriqueDomain
	 * @generated
	 */
	public Adapter createCitriqueDomainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.PlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.PlantObject
	 * @generated
	 */
	public Adapter createPlantObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.Plant
	 * @generated
	 */
	public Adapter createPlantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.Buffer
	 * @generated
	 */
	public Adapter createBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.Silo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.Silo
	 * @generated
	 */
	public Adapter createSiloAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.Reactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.Reactor
	 * @generated
	 */
	public Adapter createReactorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.PlantNode <em>Plant Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.PlantNode
	 * @generated
	 */
	public Adapter createPlantNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.PlantLink <em>Plant Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.PlantLink
	 * @generated
	 */
	public Adapter createPlantLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.BufferSiloLink <em>Buffer Silo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.BufferSiloLink
	 * @generated
	 */
	public Adapter createBufferSiloLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link citrique2.SiloReactorLink <em>Silo Reactor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see citrique2.SiloReactorLink
	 * @generated
	 */
	public Adapter createSiloReactorLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ctr2AdapterFactory