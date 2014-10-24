/**
 */
package citrique3.impl;

import citrique3.*;

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
public class Citrique3FactoryImpl extends EFactoryImpl implements Citrique3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Citrique3Factory init() {
		try {
			Citrique3Factory theCitrique3Factory = (Citrique3Factory)EPackage.Registry.INSTANCE.getEFactory(Citrique3Package.eNS_URI);
			if (theCitrique3Factory != null) {
				return theCitrique3Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Citrique3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Citrique3FactoryImpl() {
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
			case Citrique3Package.CITRIQUE_OBJECT: return createCitriqueObject();
			case Citrique3Package.CITRIQUE_DOMAIN: return createCitriqueDomain();
			case Citrique3Package.PLANT_OBJECT: return createPlantObject();
			case Citrique3Package.PLANT: return createPlant();
			case Citrique3Package.BUFFER: return createBuffer();
			case Citrique3Package.SILO: return createSilo();
			case Citrique3Package.REACTOR: return createReactor();
			case Citrique3Package.PLANT_NODE: return createPlantNode();
			case Citrique3Package.PLANT_LINK: return createPlantLink();
			case Citrique3Package.BUFFER_SILO_LINK: return createBufferSiloLink();
			case Citrique3Package.SILO_REACTOR_LINK: return createSiloReactorLink();
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
	public Citrique3Package getCitrique3Package() {
		return (Citrique3Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Citrique3Package getPackage() {
		return Citrique3Package.eINSTANCE;
	}

} //Citrique3FactoryImpl
