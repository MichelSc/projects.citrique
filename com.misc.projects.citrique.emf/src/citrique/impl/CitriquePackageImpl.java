/**
 */
package citrique.impl;

import citrique.Buffer;
import citrique.BufferSiloLink;
import citrique.CitriqueDomain;
import citrique.CitriqueFactory;
import citrique.CitriqueObject;
import citrique.CitriquePackage;
import citrique.Plant;
import citrique.PlantLink;
import citrique.PlantNode;
import citrique.PlantObject;
import citrique.Reactor;
import citrique.Silo;
import citrique.SiloReactorLink;
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
public class CitriquePackageImpl extends EPackageImpl implements CitriquePackage {
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
	 * @see citrique.CitriquePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CitriquePackageImpl() {
		super(eNS_URI, CitriqueFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CitriquePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CitriquePackage init() {
		if (isInited) return (CitriquePackage)EPackage.Registry.INSTANCE.getEPackage(CitriquePackage.eNS_URI);

		// Obtain or create and register package
		CitriquePackageImpl theCitriquePackage = (CitriquePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CitriquePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CitriquePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCitriquePackage.createPackageContents();

		// Initialize created meta-data
		theCitriquePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCitriquePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CitriquePackage.eNS_URI, theCitriquePackage);
		return theCitriquePackage;
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
	public EAttribute getCitriqueObject_Description() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(6);
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
	public EAttribute getCitriqueObject_ShortName() {
		return (EAttribute)citriqueObjectEClass.getEStructuralFeatures().get(7);
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
	public EOperation getCitriqueObject__RefreshType() {
		return citriqueObjectEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCitriqueObject__RefreshShortType() {
		return citriqueObjectEClass.getEOperations().get(3);
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
	public EReference getCitriqueDomain_Plants() {
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
	public EOperation getPlant__RefreshChildren() {
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
	public EOperation getBufferSiloLink__RefreshDispose_1() {
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
	public EOperation getSiloReactorLink__RefreshDispose_1() {
		return siloReactorLinkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueFactory getCitriqueFactory() {
		return (CitriqueFactory)getEFactoryInstance();
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
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__DESCRIPTION);
		createEAttribute(citriqueObjectEClass, CITRIQUE_OBJECT__SHORT_NAME);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_DESCRIPTION);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_TYPE);
		createEOperation(citriqueObjectEClass, CITRIQUE_OBJECT___REFRESH_SHORT_TYPE);

		citriqueDomainEClass = createEClass(CITRIQUE_DOMAIN);
		createEReference(citriqueDomainEClass, CITRIQUE_DOMAIN__PLANTS);
		createEOperation(citriqueDomainEClass, CITRIQUE_DOMAIN___REFRESH);

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
		createEOperation(plantEClass, PLANT___REFRESH_CHILDREN);

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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
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
		initEAttribute(getCitriqueObject_Description(), ecorePackage.getEString(), "Description", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCitriqueObject_ShortName(), ecorePackage.getEString(), "ShortName", null, 0, 1, CitriqueObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshDescription(), null, "refreshDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshShortDescription(), null, "refreshShortDescription", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshType(), null, "refreshType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCitriqueObject__RefreshShortType(), null, "refreshShortType", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(citriqueDomainEClass, CitriqueDomain.class, "CitriqueDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCitriqueDomain_Plants(), this.getPlant(), null, "Plants", null, 0, -1, CitriqueDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCitriqueDomain__Refresh(), null, "Refresh", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plantObjectEClass, PlantObject.class, "PlantObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlantObject_Plant(), this.getPlant(), null, "Plant", null, 0, 1, PlantObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlant_Buffer(), this.getBuffer(), null, "Buffer", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Silo(), this.getSilo(), null, "Silo", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Reactor(), this.getReactor(), null, "Reactor", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Node(), this.getPlantNode(), null, "Node", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_Link(), this.getPlantLink(), null, "Link", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_BufferSiloLink(), this.getBufferSiloLink(), null, "BufferSiloLink", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_SiloReactorLink(), this.getSiloReactorLink(), null, "SiloReactorLink", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlant_PlantObject(), this.getPlantObject(), null, "PlantObject", null, 0, -1, Plant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPlant__RefreshNodes(), null, "RefreshNodes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__RefreshLinks(), null, "RefreshLinks", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPlant__RefreshChildren(), null, "RefreshChildren", 0, 1, IS_UNIQUE, IS_ORDERED);

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

		initEOperation(getBufferSiloLink__RefreshDispose_1(), null, "refreshDispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(siloReactorLinkEClass, SiloReactorLink.class, "SiloReactorLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSiloReactorLink_Silo(), this.getSilo(), this.getSilo_ReactorLinks(), "Silo", null, 1, 1, SiloReactorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSiloReactorLink_Reactor(), this.getReactor(), this.getReactor_SiloLinks(), "Reactor", null, 1, 1, SiloReactorLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSiloReactorLink__RefreshDispose_1(), null, "refreshDispose", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CitriquePackageImpl