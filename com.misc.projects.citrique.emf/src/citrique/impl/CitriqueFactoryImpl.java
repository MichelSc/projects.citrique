/**
 */
package citrique.impl;

import citrique.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CitriqueFactoryImpl extends EFactoryImpl implements CitriqueFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CitriqueFactory init() {
		try {
			CitriqueFactory theCitriqueFactory = (CitriqueFactory)EPackage.Registry.INSTANCE.getEFactory(CitriquePackage.eNS_URI);
			if (theCitriqueFactory != null) {
				return theCitriqueFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CitriqueFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CitriquePackage.CITRIQUE_OBJECT: return createCitriqueObject();
			case CitriquePackage.CITRIQUE_DOMAIN: return createCitriqueDomain();
			case CitriquePackage.PLANT_OBJECT: return createPlantObject();
			case CitriquePackage.PLANT: return createPlant();
			case CitriquePackage.BUFFER: return createBuffer();
			case CitriquePackage.SILO: return createSilo();
			case CitriquePackage.REACTOR: return createReactor();
			case CitriquePackage.PLANT_NODE: return createPlantNode();
			case CitriquePackage.PLANT_LINK: return createPlantLink();
			case CitriquePackage.BUFFER_SILO_LINK: return createBufferSiloLink();
			case CitriquePackage.LINK_SILO_REACTOR: return createLinkSiloReactor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueObject createCitriqueObject() {
		CitriqueObjectImpl citriqueObject = new CitriqueObjectImpl();
		return citriqueObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueDomain createCitriqueDomain() {
		CitriqueDomainImpl citriqueDomain = new CitriqueDomainImpl();
		return citriqueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantObject createPlantObject() {
		PlantObjectImpl plantObject = new PlantObjectImpl();
		return plantObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plant createPlant() {
		PlantImpl plant = new PlantImpl();
		return plant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Silo createSilo() {
		SiloImpl silo = new SiloImpl();
		return silo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reactor createReactor() {
		ReactorImpl reactor = new ReactorImpl();
		return reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantNode createPlantNode() {
		PlantNodeImpl plantNode = new PlantNodeImpl();
		return plantNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlantLink createPlantLink() {
		PlantLinkImpl plantLink = new PlantLinkImpl();
		return plantLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferSiloLink createBufferSiloLink() {
		BufferSiloLinkImpl bufferSiloLink = new BufferSiloLinkImpl();
		return bufferSiloLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSiloReactor createLinkSiloReactor() {
		LinkSiloReactorImpl linkSiloReactor = new LinkSiloReactorImpl();
		return linkSiloReactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriquePackage getCitriquePackage() {
		return (CitriquePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CitriquePackage getPackage() {
		return CitriquePackage.eINSTANCE;
	}

} //CitriqueFactoryImpl
