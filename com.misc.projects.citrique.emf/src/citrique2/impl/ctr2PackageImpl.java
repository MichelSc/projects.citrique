/**
 */
package citrique2.impl;

import citrique2.Buffer;
import citrique2.BufferSiloLink;
import citrique2.CitriqueDomain;
import citrique2.CitriqueObject;
import citrique2.Plant;
import citrique2.PlantLink;
import citrique2.PlantNode;
import citrique2.PlantObject;
import citrique2.Reactor;
import citrique2.Silo;
import citrique2.SiloReactorLink;
import citrique2.ctr2Factory;
import citrique2.ctr2Package;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ctr2PackageImpl extends EPackageImpl implements ctr2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citriqueObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass citriqueDomainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siloEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reactorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferSiloLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass siloReactorLinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see citrique2.ctr2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ctr2PackageImpl() {
		super(eNS_URI, ctr2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ctr2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ctr2Package init() {
		if (isInited) return (ctr2Package)EPackage.Registry.INSTANCE.getEPackage(ctr2Package.eNS_URI);

		// Obtain or create and register package
		ctr2PackageImpl thectr2Package = (ctr2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ctr2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ctr2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		com.misc.common.moplaf.propagator.PropagatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thectr2Package.createPackageContents();

		// Initialize created meta-data
		thectr2Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thectr2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ctr2Package.eNS_URI, thectr2Package);
		return thectr2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitriqueObject() {
		return citriqueObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitriqueObject_Child() {
		return (EReference)citriqueObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitriqueObject_Parent() {
		return (EReference)citriqueObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_Name() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_Type() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_ShortType() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_ShortDescription() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_LongDescription() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_Description() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCitriqueObject_ShortName() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshDescription() {
		return citriqueObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshShortDescription() {
		return citriqueObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshLongDescription() {
		return citriqueObjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshType() {
		return citriqueObjectEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshShortType() {
		return citriqueObjectEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshChildren() {
		return citriqueObjectEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__Init() {
		return citriqueObjectEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCitriqueDomain() {
		return citriqueDomainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCitriqueDomain_Plant() {
		return (EReference)citriqueDomainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueDomain__Refresh() {
		return citriqueDomainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueDomain__ResetTouched() {
		return citriqueDomainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueDomain__Activate() {
		return citriqueDomainEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantObject() {
		return plantObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlantObject_Plant() {
		return (EReference)plantObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Buffer() {
		return (EReference)plantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Silo() {
		return (EReference)plantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Reactor() {
		return (EReference)plantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Node() {
		return (EReference)plantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_Link() {
		return (EReference)plantEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_BufferSiloLink() {
		return (EReference)plantEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_SiloReactorLink() {
		return (EReference)plantEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlant_PlantObject() {
		return (EReference)plantEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__RefreshNodes() {
		return plantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__RefreshLinks() {
		return plantEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPlant__RefreshObjects() {
		return plantEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_SiloLinks() {
		return (EReference)bufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBuffer_Capacity() {
		return (EAttribute)bufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSilo() {
		return siloEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilo_BufferLinks() {
		return (EReference)siloEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSilo_ReactorLinks() {
		return (EReference)siloEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSilo_Capacity() {
		return (EAttribute)siloEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReactor() {
		return reactorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReactor_SiloLinks() {
		return (EReference)reactorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantNode() {
		return plantNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlantLink() {
		return plantLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantLink_Length() {
		return (EAttribute)plantLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantLink_HeightFrom() {
		return (EAttribute)plantLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlantLink_HeightTo() {
		return (EAttribute)plantLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBufferSiloLink() {
		return bufferSiloLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBufferSiloLink_Silo() {
		return (EReference)bufferSiloLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBufferSiloLink_Buffer() {
		return (EReference)bufferSiloLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBufferSiloLink__RefreshDispose() {
		return bufferSiloLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSiloReactorLink() {
		return siloReactorLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiloReactorLink_Silo() {
		return (EReference)siloReactorLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSiloReactorLink_Reactor() {
		return (EReference)siloReactorLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSiloReactorLink__RefreshDispose() {
		return siloReactorLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2Factory getctr2Factory() {
		return (ctr2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		citriqueObjectEClass = createEClass(CITRIQUE_OBJECT);
		createEReference(citriqueObjectEClass, CITRIQUE_OBJECT__CHILD);
		createEReference(citriqueObjectEClass, CITRIQUE_OBJECT__PARENT);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__NAME);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__TYPE);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__SHORT_TYPE);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__SHORT_DESCRIPTION);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__LONG_DESCRIPTION);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__DESCRIPTION);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__SHORT_NAME);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_DESCRIPTION);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_TYPE);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_SHORT_TYPE);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_CHILDREN);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___INIT);

		citriqueDomainEClass = createEClass(CITRIQUE_DOMAIN);
		createEReference(citriqueDomainEClass, CITRIQUE_DOMAIN__PLANT);
		createEOperation(citriqueDomainEClass, CITRIQUE_DOMAIN___REFRESH);
		createEOperation(citriqueDomainEClass, CITRIQUE_DOMAIN___RESET_TOUCHED);
		createEOperation(citriqueDomainEClass, CITRIQUE_DOMAIN___ACTIVATE);

		plantObjectEClass = createEClass(PLANT_OBJECT);
		createEReference(plantObjectEClass, PLANT_OBJECT__PLANT);

		plantEClass = createEClass(PLANT);
		createEReference(plantEClass, PLANT__BUFFER);
		createEReference(plantEClass, PLANT__SILO);
		createEReference(plantEClass, PLANT__REACTOR);
		createEReference(plantEClass, PLANT__NODE);
		createEReference(plantEClass, PLANT__LINK);
		createEReference(plantEClass, PLANT__BUFFER_SILO_LINK);
		createEReference(plantEClass, PLANT__SILO_REACTOR_LINK);
		createEReference(plantEClass, PLANT__PLANT_OBJECT);
		createEOperation(plantEClass, PLANT___REFRESH_NODES);
		createEOperation(plantEClass, PLANT___REFRESH_LINKS);
		createEOperation(plantEClass, PLANT___REFRESH_OBJECTS);

		bufferEClass = createEClass(BUFFER);
		createEReference(bufferEClass, BUFFER__SILO_LINKS);
		createEAttribute(bufferEClass, BUFFER__CAPACITY);

		siloEClass = createEClass(SILO);
		createEReference(siloEClass, SILO__BUFFER_LINKS);
		createEReference(siloEClass, SILO__REACTOR_LINKS);
		createEAttribute(siloEClass, SILO__CAPACITY);

		reactorEClass = createEClass(REACTOR);
		createEReference(reactorEClass, REACTOR__SILO_LINKS);

		plantNodeEClass = createEClass(PLANT_NODE);

		plantLinkEClass = createEClass(PLANT_LINK);
		createEAttribute(plantLinkEClass, PLANT_LINK__LENGTH);
		createEAttribute(plantLinkEClass, PLANT_LINK__HEIGHT_FROM);
		createEAttribute(plantLinkEClass, PLANT_LINK__HEIGHT_TO);

		bufferSiloLinkEClass = createEClass(BUFFER_SILO_LINK);
		createEReference(bufferSiloLinkEClass, BUFFER_SILO_LINK__SILO);
		createEReference(bufferSiloLinkEClass, BUFFER_SILO_LINK__BUFFER);
		createEOperation(bufferSiloLinkEClass, BUFFER_SILO_LINK___REFRESH_DISPOSE);

		siloReactorLinkEClass = createEClass(SILO_REACTOR_LINK);
		createEReference(siloReactorLinkEClass, SILO_REACTOR_LINK__SILO);
		createEReference(siloReactorLinkEClass, SILO_REACTOR_LINK__REACTOR);
		createEOperation(siloReactorLinkEClass, SILO_REACTOR_LINK___REFRESH_DISPOSE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		com.misc.common.moplaf.propagator.PropagatorPackage thePropagatorPackage = (com.misc.common.moplaf.propagator.PropagatorPackage)EPackage.Registry.INSTANCE.getEPackage(com.misc.common.moplaf.propagator.PropagatorPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		citriqueObjectEClass.getESuperTypes().add(thePropagatorPackage.getObjectWithPropagatorFunctionAdapter());
		citriqueDomainEClass.getESuperTypes().add(this.getCitriqueObject());
		plantObjectEClass.getESuperTypes().add(this.getCitriqueObject());
		plantEClass.getESuperTypes().add(this.getCitriqueObject());
		bufferEClass.getESuperTypes().add(this.getPlantNode());
		siloEClass.getESuperTypes().add(this.getPlantNode());
		reactorEClass.getESuperTypes().add(this.getPlantNode());
		plantNodeEClass.getESuperTypes().add(this.getPlantObject());
		plantLinkEClass.getESuperTypes().add(this.getPlantObject());
		bufferSiloLinkEClass.getESuperTypes().add(this.getPlantLink());
		siloReactorLinkEClass.getESuperTypes().add(this.getPlantLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(citriqueObjectEClass, CitriqueObject.class, "CitriqueObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitriqueObject_Child(), this.getCitriqueObject(), this.getCitriqueObject_Parent(), "Child", null, 0, -1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCitriqueObject_Parent(), this.getCitriqueObject(), this.getCitriqueObject_Child(), "Parent", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_Name(), ecorePackage.getEString(), "Name", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_Type(), ecorePackage.getEString(), "Type", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_ShortType(), ecorePackage.getEString(), "ShortType", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_ShortDescription(), ecorePackage.getEString(), "ShortDescription", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_LongDescription(), ecorePackage.getEString(), "LongDescription", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_Description(), ecorePackage.getEString(), "Description", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_ShortName(), ecorePackage.getEString(), "ShortName", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshDescription(), null, "refreshDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshShortDescription(), null, "refreshShortDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshLongDescription(), null, "refreshLongDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshType(), null, "refreshType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshShortType(), null, "refreshShortType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshChildren(), null, "refreshChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__Init(), null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(citriqueDomainEClass, CitriqueDomain.class, "CitriqueDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitriqueDomain_Plant(), this.getPlant(), null, "Plant", null, 0, -1, CitriqueDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitriqueDomain__Refresh(), null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueDomain__ResetTouched(), null, "resetTouched", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueDomain__Activate(), null, "activate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plantObjectEClass, PlantObject.class, "PlantObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantObject_Plant(), this.getPlant(), this.getPlant_PlantObject(), "Plant", null, 0, 1, PlantObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlant_Buffer(), this.getBuffer(), null, "Buffer", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Silo(), this.getSilo(), null, "Silo", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Reactor(), this.getReactor(), null, "Reactor", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Node(), this.getPlantNode(), null, "Node", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Link(), this.getPlantLink(), null, "Link", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_BufferSiloLink(), this.getBufferSiloLink(), null, "BufferSiloLink", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_SiloReactorLink(), this.getSiloReactorLink(), null, "SiloReactorLink", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_PlantObject(), this.getPlantObject(), this.getPlantObject_Plant(), "PlantObject", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlant__RefreshNodes(), null, "refreshNodes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__RefreshLinks(), null, "refreshLinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__RefreshObjects(), null, "refreshObjects", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuffer_SiloLinks(), this.getBufferSiloLink(), this.getBufferSiloLink_Buffer(), "SiloLinks", null, 0, -1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBuffer_Capacity(), ecorePackage.getEFloat(), "Capacity", null, 0, 1, Buffer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(siloEClass, Silo.class, "Silo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSilo_BufferLinks(), this.getBufferSiloLink(), this.getBufferSiloLink_Silo(), "BufferLinks", null, 0, -1, Silo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSilo_ReactorLinks(), this.getSiloReactorLink(), this.getSiloReactorLink_Silo(), "ReactorLinks", null, 0, -1, Silo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSilo_Capacity(), ecorePackage.getEFloat(), "Capacity", null, 0, 1, Silo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reactorEClass, Reactor.class, "Reactor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReactor_SiloLinks(), this.getSiloReactorLink(), this.getSiloReactorLink_Reactor(), "SiloLinks", null, 0, -1, Reactor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantNodeEClass, PlantNode.class, "PlantNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(plantLinkEClass, PlantLink.class, "PlantLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlantLink_Length(), ecorePackage.getEFloat(), "Length", null, 0, 1, PlantLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantLink_HeightFrom(), ecorePackage.getEFloat(), "HeightFrom", null, 0, 1, PlantLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlantLink_HeightTo(), ecorePackage.getEFloat(), "HeightTo", null, 0, 1, PlantLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferSiloLinkEClass, BufferSiloLink.class, "BufferSiloLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBufferSiloLink_Silo(), this.getSilo(), this.getSilo_BufferLinks(), "Silo", null, 1, 1, BufferSiloLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBufferSiloLink_Buffer(), this.getBuffer(), this.getBuffer_SiloLinks(), "Buffer", null, 1, 1, BufferSiloLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBufferSiloLink__RefreshDispose(), null, "refreshDispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(siloReactorLinkEClass, SiloReactorLink.class, "SiloReactorLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiloReactorLink_Silo(), this.getSilo(), this.getSilo_ReactorLinks(), "Silo", null, 1, 1, SiloReactorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiloReactorLink_Reactor(), this.getReactor(), this.getReactor_SiloLinks(), "Reactor", null, 1, 1, SiloReactorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSiloReactorLink__RefreshDispose(), null, "refreshDispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getPlant_Silo(), 
		   source, 
		   new String[] {
			 "name", "BufferSiloLink"
		   });	
		addAnnotation
		  (getPlant_Reactor(), 
		   source, 
		   new String[] {
			 "name", "BufferSiloLink"
		   });	
		addAnnotation
		  (getPlant_Node(), 
		   source, 
		   new String[] {
			 "name", "BufferSiloLink"
		   });	
		addAnnotation
		  (getPlant_Link(), 
		   source, 
		   new String[] {
			 "name", "BufferSiloLink"
		   });
	}

} //ctr2PackageImpl
