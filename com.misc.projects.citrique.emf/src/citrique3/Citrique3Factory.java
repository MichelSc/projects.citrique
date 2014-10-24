/**
 */
package citrique3;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see citrique3.Citrique3Package
 * @generated
 */
public interface Citrique3Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Citrique3Factory eINSTANCE = citrique3.impl.Citrique3FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Citrique Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citrique Object</em>'.
	 * @generated
	 */
	CitriqueObject createCitriqueObject();

	/**
	 * Returns a new object of class '<em>Citrique Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Citrique Domain</em>'.
	 * @generated
	 */
	CitriqueDomain createCitriqueDomain();

	/**
	 * Returns a new object of class '<em>Plant Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant Object</em>'.
	 * @generated
	 */
	PlantObject createPlantObject();

	/**
	 * Returns a new object of class '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant</em>'.
	 * @generated
	 */
	Plant createPlant();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns a new object of class '<em>Silo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Silo</em>'.
	 * @generated
	 */
	Silo createSilo();

	/**
	 * Returns a new object of class '<em>Reactor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reactor</em>'.
	 * @generated
	 */
	Reactor createReactor();

	/**
	 * Returns a new object of class '<em>Plant Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant Node</em>'.
	 * @generated
	 */
	PlantNode createPlantNode();

	/**
	 * Returns a new object of class '<em>Plant Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant Link</em>'.
	 * @generated
	 */
	PlantLink createPlantLink();

	/**
	 * Returns a new object of class '<em>Buffer Silo Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer Silo Link</em>'.
	 * @generated
	 */
	BufferSiloLink createBufferSiloLink();

	/**
	 * Returns a new object of class '<em>Silo Reactor Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Silo Reactor Link</em>'.
	 * @generated
	 */
	SiloReactorLink createSiloReactorLink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Citrique3Package getCitrique3Package();

} //Citrique3Factory
