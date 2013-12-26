/**
 */
package citrique2.impl;

import citrique2.*;

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
public class ctr2FactoryImpl extends EFactoryImpl implements ctr2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ctr2Factory init() {
		try {
			ctr2Factory thectr2Factory = (ctr2Factory)EPackage.Registry.INSTANCE.getEFactory(ctr2Package.eNS_URI);
			if (thectr2Factory != null) {
				return thectr2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ctr2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2FactoryImpl() {
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
			case ctr2Package.CITRIQUE_OBJECT: return createCitriqueObject();
			case ctr2Package.CITRIQUE_DOMAIN: return createCitriqueDomain();
			case ctr2Package.PLANT_OBJECT: return createPlantObject();
			case ctr2Package.PLANT: return createPlant();
			case ctr2Package.BUFFER: return createBuffer();
			case ctr2Package.SILO: return createSilo();
			case ctr2Package.REACTOR: return createReactor();
			case ctr2Package.PLANT_NODE: return createPlantNode();
			case ctr2Package.PLANT_LINK: return createPlantLink();
			case ctr2Package.BUFFER_SILO_LINK: return createBufferSiloLink();
			case ctr2Package.SILO_REACTOR_LINK: return createSiloReactorLink();
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
	public SiloReactorLink createSiloReactorLink() {
		SiloReactorLinkImpl siloReactorLink = new SiloReactorLinkImpl();
		return siloReactorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2Package getctr2Package() {
		return (ctr2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ctr2Package getPackage() {
		return ctr2Package.eINSTANCE;
	}

} //ctr2FactoryImpl
