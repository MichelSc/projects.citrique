/**
 */
package citrique;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see citrique.CitriquePackage
 * @generated
 */
public interface CitriqueFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CitriqueFactory eINSTANCE = citrique.impl.CitriqueFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	CitriqueObject createCitriqueObject();

	/**
	 * Returns a new object of class '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain</em>'.
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
	CitriquePackage getCitriquePackage();

} //CitriqueFactory
