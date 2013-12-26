/**
 */
package citrique2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see citrique2.ctr2Factory
 * @model kind="package"
 * @generated
 */
public interface ctr2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "citrique2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.misc.projects.citrique.emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ctr2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ctr2Package eINSTANCE = citrique2.impl.ctr2PackageImpl.init();

	/**
	 * The meta object id for the '{@link citrique2.impl.CitriqueObjectImpl <em>Citrique Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.CitriqueObjectImpl
	 * @see citrique2.impl.ctr2PackageImpl#getCitriqueObject()
	 * @generated
	 */
	int CITRIQUE_OBJECT = 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__CHILD = 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__PARENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__NAME = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__TYPE = 3;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__SHORT_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__SHORT_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__LONG_DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__SHORT_NAME = 8;

	/**
	 * The number of structural features of the '<em>Citrique Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_DESCRIPTION = 0;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION = 1;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION = 2;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_TYPE = 3;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_SHORT_TYPE = 4;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___REFRESH_CHILDREN = 5;

	/**
	 * The number of operations of the '<em>Citrique Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link citrique2.impl.CitriqueDomainImpl <em>Citrique Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.CitriqueDomainImpl
	 * @see citrique2.impl.ctr2PackageImpl#getCitriqueDomain()
	 * @generated
	 */
	int CITRIQUE_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__CHILD = CITRIQUE_OBJECT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__PARENT = CITRIQUE_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__NAME = CITRIQUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__TYPE = CITRIQUE_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__SHORT_TYPE = CITRIQUE_OBJECT__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__SHORT_DESCRIPTION = CITRIQUE_OBJECT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__LONG_DESCRIPTION = CITRIQUE_OBJECT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__DESCRIPTION = CITRIQUE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__SHORT_NAME = CITRIQUE_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__PLANT = CITRIQUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Citrique Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN_FEATURE_COUNT = CITRIQUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_SHORT_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_LONG_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_TYPE = CITRIQUE_OBJECT___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_SHORT_TYPE = CITRIQUE_OBJECT___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH_CHILDREN = CITRIQUE_OBJECT___REFRESH_CHILDREN;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH = CITRIQUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Citrique Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN_OPERATION_COUNT = CITRIQUE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link citrique2.impl.PlantObjectImpl <em>Plant Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.PlantObjectImpl
	 * @see citrique2.impl.ctr2PackageImpl#getPlantObject()
	 * @generated
	 */
	int PLANT_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__CHILD = CITRIQUE_OBJECT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__PARENT = CITRIQUE_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__NAME = CITRIQUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__TYPE = CITRIQUE_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__SHORT_TYPE = CITRIQUE_OBJECT__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__SHORT_DESCRIPTION = CITRIQUE_OBJECT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__LONG_DESCRIPTION = CITRIQUE_OBJECT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__DESCRIPTION = CITRIQUE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__SHORT_NAME = CITRIQUE_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT__PLANT = CITRIQUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Plant Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT_FEATURE_COUNT = CITRIQUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_SHORT_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_LONG_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_TYPE = CITRIQUE_OBJECT___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_SHORT_TYPE = CITRIQUE_OBJECT___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___REFRESH_CHILDREN = CITRIQUE_OBJECT___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Plant Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT_OPERATION_COUNT = CITRIQUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.PlantImpl
	 * @see citrique2.impl.ctr2PackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 3;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__CHILD = CITRIQUE_OBJECT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PARENT = CITRIQUE_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NAME = CITRIQUE_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__TYPE = CITRIQUE_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SHORT_TYPE = CITRIQUE_OBJECT__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SHORT_DESCRIPTION = CITRIQUE_OBJECT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LONG_DESCRIPTION = CITRIQUE_OBJECT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__DESCRIPTION = CITRIQUE_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SHORT_NAME = CITRIQUE_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__BUFFER = CITRIQUE_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Silo</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SILO = CITRIQUE_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reactor</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__REACTOR = CITRIQUE_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__NODE = CITRIQUE_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Link</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LINK = CITRIQUE_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Buffer Silo Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__BUFFER_SILO_LINK = CITRIQUE_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Silo Reactor Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__SILO_REACTOR_LINK = CITRIQUE_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Plant Object</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__PLANT_OBJECT = CITRIQUE_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = CITRIQUE_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_SHORT_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_LONG_DESCRIPTION = CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_TYPE = CITRIQUE_OBJECT___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_SHORT_TYPE = CITRIQUE_OBJECT___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_CHILDREN = CITRIQUE_OBJECT___REFRESH_CHILDREN;

	/**
	 * The operation id for the '<em>Refresh Nodes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_NODES = CITRIQUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Links</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_LINKS = CITRIQUE_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = CITRIQUE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link citrique2.impl.PlantNodeImpl <em>Plant Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.PlantNodeImpl
	 * @see citrique2.impl.ctr2PackageImpl#getPlantNode()
	 * @generated
	 */
	int PLANT_NODE = 7;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__CHILD = PLANT_OBJECT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__PARENT = PLANT_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__NAME = PLANT_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__TYPE = PLANT_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__SHORT_TYPE = PLANT_OBJECT__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__SHORT_DESCRIPTION = PLANT_OBJECT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__LONG_DESCRIPTION = PLANT_OBJECT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__DESCRIPTION = PLANT_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__SHORT_NAME = PLANT_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE__PLANT = PLANT_OBJECT__PLANT;

	/**
	 * The number of structural features of the '<em>Plant Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE_FEATURE_COUNT = PLANT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_DESCRIPTION = PLANT_OBJECT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_SHORT_DESCRIPTION = PLANT_OBJECT___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_LONG_DESCRIPTION = PLANT_OBJECT___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_TYPE = PLANT_OBJECT___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_SHORT_TYPE = PLANT_OBJECT___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___REFRESH_CHILDREN = PLANT_OBJECT___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Plant Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE_OPERATION_COUNT = PLANT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.BufferImpl
	 * @see citrique2.impl.ctr2PackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 4;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__CHILD = PLANT_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__PARENT = PLANT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__NAME = PLANT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__TYPE = PLANT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SHORT_TYPE = PLANT_NODE__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SHORT_DESCRIPTION = PLANT_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__LONG_DESCRIPTION = PLANT_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__DESCRIPTION = PLANT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SHORT_NAME = PLANT_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__PLANT = PLANT_NODE__PLANT;

	/**
	 * The feature id for the '<em><b>Silo Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SILO_LINKS = PLANT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__CAPACITY = PLANT_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = PLANT_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_DESCRIPTION = PLANT_NODE___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_SHORT_DESCRIPTION = PLANT_NODE___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_LONG_DESCRIPTION = PLANT_NODE___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_TYPE = PLANT_NODE___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_SHORT_TYPE = PLANT_NODE___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___REFRESH_CHILDREN = PLANT_NODE___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.SiloImpl <em>Silo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.SiloImpl
	 * @see citrique2.impl.ctr2PackageImpl#getSilo()
	 * @generated
	 */
	int SILO = 5;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__CHILD = PLANT_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__PARENT = PLANT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__NAME = PLANT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__TYPE = PLANT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__SHORT_TYPE = PLANT_NODE__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__SHORT_DESCRIPTION = PLANT_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__LONG_DESCRIPTION = PLANT_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__DESCRIPTION = PLANT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__SHORT_NAME = PLANT_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__PLANT = PLANT_NODE__PLANT;

	/**
	 * The feature id for the '<em><b>Buffer Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__BUFFER_LINKS = PLANT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reactor Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__REACTOR_LINKS = PLANT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO__CAPACITY = PLANT_NODE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Silo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_FEATURE_COUNT = PLANT_NODE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_DESCRIPTION = PLANT_NODE___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_SHORT_DESCRIPTION = PLANT_NODE___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_LONG_DESCRIPTION = PLANT_NODE___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_TYPE = PLANT_NODE___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_SHORT_TYPE = PLANT_NODE___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___REFRESH_CHILDREN = PLANT_NODE___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Silo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.ReactorImpl <em>Reactor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.ReactorImpl
	 * @see citrique2.impl.ctr2PackageImpl#getReactor()
	 * @generated
	 */
	int REACTOR = 6;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__CHILD = PLANT_NODE__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__PARENT = PLANT_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__NAME = PLANT_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__TYPE = PLANT_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__SHORT_TYPE = PLANT_NODE__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__SHORT_DESCRIPTION = PLANT_NODE__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__LONG_DESCRIPTION = PLANT_NODE__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__DESCRIPTION = PLANT_NODE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__SHORT_NAME = PLANT_NODE__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__PLANT = PLANT_NODE__PLANT;

	/**
	 * The feature id for the '<em><b>Silo Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR__SILO_LINKS = PLANT_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR_FEATURE_COUNT = PLANT_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_DESCRIPTION = PLANT_NODE___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_SHORT_DESCRIPTION = PLANT_NODE___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_LONG_DESCRIPTION = PLANT_NODE___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_TYPE = PLANT_NODE___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_SHORT_TYPE = PLANT_NODE___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___REFRESH_CHILDREN = PLANT_NODE___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Reactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.PlantLinkImpl <em>Plant Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.PlantLinkImpl
	 * @see citrique2.impl.ctr2PackageImpl#getPlantLink()
	 * @generated
	 */
	int PLANT_LINK = 8;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__CHILD = PLANT_OBJECT__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__PARENT = PLANT_OBJECT__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__NAME = PLANT_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__TYPE = PLANT_OBJECT__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__SHORT_TYPE = PLANT_OBJECT__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__SHORT_DESCRIPTION = PLANT_OBJECT__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__LONG_DESCRIPTION = PLANT_OBJECT__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__DESCRIPTION = PLANT_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__SHORT_NAME = PLANT_OBJECT__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__PLANT = PLANT_OBJECT__PLANT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__LENGTH = PLANT_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__HEIGHT_FROM = PLANT_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK__HEIGHT_TO = PLANT_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Plant Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK_FEATURE_COUNT = PLANT_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_DESCRIPTION = PLANT_OBJECT___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_SHORT_DESCRIPTION = PLANT_OBJECT___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_LONG_DESCRIPTION = PLANT_OBJECT___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_TYPE = PLANT_OBJECT___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_SHORT_TYPE = PLANT_OBJECT___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___REFRESH_CHILDREN = PLANT_OBJECT___REFRESH_CHILDREN;

	/**
	 * The number of operations of the '<em>Plant Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK_OPERATION_COUNT = PLANT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique2.impl.BufferSiloLinkImpl <em>Buffer Silo Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.BufferSiloLinkImpl
	 * @see citrique2.impl.ctr2PackageImpl#getBufferSiloLink()
	 * @generated
	 */
	int BUFFER_SILO_LINK = 9;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__CHILD = PLANT_LINK__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__PARENT = PLANT_LINK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__NAME = PLANT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__TYPE = PLANT_LINK__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__SHORT_TYPE = PLANT_LINK__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__SHORT_DESCRIPTION = PLANT_LINK__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__LONG_DESCRIPTION = PLANT_LINK__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__DESCRIPTION = PLANT_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__SHORT_NAME = PLANT_LINK__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__PLANT = PLANT_LINK__PLANT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__LENGTH = PLANT_LINK__LENGTH;

	/**
	 * The feature id for the '<em><b>Height From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__HEIGHT_FROM = PLANT_LINK__HEIGHT_FROM;

	/**
	 * The feature id for the '<em><b>Height To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__HEIGHT_TO = PLANT_LINK__HEIGHT_TO;

	/**
	 * The feature id for the '<em><b>Silo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__SILO = PLANT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK__BUFFER = PLANT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buffer Silo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK_FEATURE_COUNT = PLANT_LINK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_DESCRIPTION = PLANT_LINK___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_SHORT_DESCRIPTION = PLANT_LINK___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_LONG_DESCRIPTION = PLANT_LINK___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_TYPE = PLANT_LINK___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_SHORT_TYPE = PLANT_LINK___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_CHILDREN = PLANT_LINK___REFRESH_CHILDREN;

	/**
	 * The operation id for the '<em>Refresh Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___REFRESH_DISPOSE = PLANT_LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buffer Silo Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK_OPERATION_COUNT = PLANT_LINK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link citrique2.impl.SiloReactorLinkImpl <em>Silo Reactor Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique2.impl.SiloReactorLinkImpl
	 * @see citrique2.impl.ctr2PackageImpl#getSiloReactorLink()
	 * @generated
	 */
	int SILO_REACTOR_LINK = 10;

	/**
	 * The feature id for the '<em><b>Child</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__CHILD = PLANT_LINK__CHILD;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__PARENT = PLANT_LINK__PARENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__NAME = PLANT_LINK__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__TYPE = PLANT_LINK__TYPE;

	/**
	 * The feature id for the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__SHORT_TYPE = PLANT_LINK__SHORT_TYPE;

	/**
	 * The feature id for the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__SHORT_DESCRIPTION = PLANT_LINK__SHORT_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__LONG_DESCRIPTION = PLANT_LINK__LONG_DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__DESCRIPTION = PLANT_LINK__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__SHORT_NAME = PLANT_LINK__SHORT_NAME;

	/**
	 * The feature id for the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__PLANT = PLANT_LINK__PLANT;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__LENGTH = PLANT_LINK__LENGTH;

	/**
	 * The feature id for the '<em><b>Height From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__HEIGHT_FROM = PLANT_LINK__HEIGHT_FROM;

	/**
	 * The feature id for the '<em><b>Height To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__HEIGHT_TO = PLANT_LINK__HEIGHT_TO;

	/**
	 * The feature id for the '<em><b>Silo</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__SILO = PLANT_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reactor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK__REACTOR = PLANT_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Silo Reactor Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK_FEATURE_COUNT = PLANT_LINK_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Refresh Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_DESCRIPTION = PLANT_LINK___REFRESH_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Short Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_SHORT_DESCRIPTION = PLANT_LINK___REFRESH_SHORT_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Long Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_LONG_DESCRIPTION = PLANT_LINK___REFRESH_LONG_DESCRIPTION;

	/**
	 * The operation id for the '<em>Refresh Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_TYPE = PLANT_LINK___REFRESH_TYPE;

	/**
	 * The operation id for the '<em>Refresh Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_SHORT_TYPE = PLANT_LINK___REFRESH_SHORT_TYPE;

	/**
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_CHILDREN = PLANT_LINK___REFRESH_CHILDREN;

	/**
	 * The operation id for the '<em>Refresh Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___REFRESH_DISPOSE = PLANT_LINK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Silo Reactor Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK_OPERATION_COUNT = PLANT_LINK_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link citrique2.CitriqueObject <em>Citrique Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citrique Object</em>'.
	 * @see citrique2.CitriqueObject
	 * @generated
	 */
	EClass getCitriqueObject();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.CitriqueObject#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see citrique2.CitriqueObject#getChild()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EReference getCitriqueObject_Child();

	/**
	 * Returns the meta object for the reference '{@link citrique2.CitriqueObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see citrique2.CitriqueObject#getParent()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EReference getCitriqueObject_Parent();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see citrique2.CitriqueObject#getName()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see citrique2.CitriqueObject#getType()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getShortType <em>Short Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Type</em>'.
	 * @see citrique2.CitriqueObject#getShortType()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortType();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see citrique2.CitriqueObject#getShortDescription()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getLongDescription <em>Long Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Description</em>'.
	 * @see citrique2.CitriqueObject#getLongDescription()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_LongDescription();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see citrique2.CitriqueObject#getDescription()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.CitriqueObject#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see citrique2.CitriqueObject#getShortName()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortName();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshDescription() <em>Refresh Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Description</em>' operation.
	 * @see citrique2.CitriqueObject#refreshDescription()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshDescription();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshShortDescription() <em>Refresh Short Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Short Description</em>' operation.
	 * @see citrique2.CitriqueObject#refreshShortDescription()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshShortDescription();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshLongDescription() <em>Refresh Long Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Long Description</em>' operation.
	 * @see citrique2.CitriqueObject#refreshLongDescription()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshLongDescription();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshType() <em>Refresh Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Type</em>' operation.
	 * @see citrique2.CitriqueObject#refreshType()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshType();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshShortType() <em>Refresh Short Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Short Type</em>' operation.
	 * @see citrique2.CitriqueObject#refreshShortType()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshShortType();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueObject#refreshChildren() <em>Refresh Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Children</em>' operation.
	 * @see citrique2.CitriqueObject#refreshChildren()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshChildren();

	/**
	 * Returns the meta object for class '{@link citrique2.CitriqueDomain <em>Citrique Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Citrique Domain</em>'.
	 * @see citrique2.CitriqueDomain
	 * @generated
	 */
	EClass getCitriqueDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.CitriqueDomain#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plant</em>'.
	 * @see citrique2.CitriqueDomain#getPlant()
	 * @see #getCitriqueDomain()
	 * @generated
	 */
	EReference getCitriqueDomain_Plant();

	/**
	 * Returns the meta object for the '{@link citrique2.CitriqueDomain#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see citrique2.CitriqueDomain#refresh()
	 * @generated
	 */
	EOperation getCitriqueDomain__Refresh();

	/**
	 * Returns the meta object for class '{@link citrique2.PlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Object</em>'.
	 * @see citrique2.PlantObject
	 * @generated
	 */
	EClass getPlantObject();

	/**
	 * Returns the meta object for the reference '{@link citrique2.PlantObject#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see citrique2.PlantObject#getPlant()
	 * @see #getPlantObject()
	 * @generated
	 */
	EReference getPlantObject_Plant();

	/**
	 * Returns the meta object for class '{@link citrique2.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see citrique2.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.Plant#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer</em>'.
	 * @see citrique2.Plant#getBuffer()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Buffer();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.Plant#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Silo</em>'.
	 * @see citrique2.Plant#getSilo()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Silo();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.Plant#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactor</em>'.
	 * @see citrique2.Plant#getReactor()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Reactor();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Plant#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see citrique2.Plant#getNode()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Node();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Plant#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Link</em>'.
	 * @see citrique2.Plant#getLink()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.Plant#getBufferSiloLink <em>Buffer Silo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer Silo Link</em>'.
	 * @see citrique2.Plant#getBufferSiloLink()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_BufferSiloLink();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique2.Plant#getSiloReactorLink <em>Silo Reactor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Silo Reactor Link</em>'.
	 * @see citrique2.Plant#getSiloReactorLink()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_SiloReactorLink();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Plant#getPlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plant Object</em>'.
	 * @see citrique2.Plant#getPlantObject()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_PlantObject();

	/**
	 * Returns the meta object for the '{@link citrique2.Plant#refreshNodes() <em>Refresh Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Nodes</em>' operation.
	 * @see citrique2.Plant#refreshNodes()
	 * @generated
	 */
	EOperation getPlant__RefreshNodes();

	/**
	 * Returns the meta object for the '{@link citrique2.Plant#refreshLinks() <em>Refresh Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Links</em>' operation.
	 * @see citrique2.Plant#refreshLinks()
	 * @generated
	 */
	EOperation getPlant__RefreshLinks();

	/**
	 * Returns the meta object for class '{@link citrique2.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see citrique2.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Buffer#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Silo Links</em>'.
	 * @see citrique2.Buffer#getSiloLinks()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_SiloLinks();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.Buffer#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see citrique2.Buffer#getCapacity()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Capacity();

	/**
	 * Returns the meta object for class '{@link citrique2.Silo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silo</em>'.
	 * @see citrique2.Silo
	 * @generated
	 */
	EClass getSilo();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Silo#getBufferLinks <em>Buffer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buffer Links</em>'.
	 * @see citrique2.Silo#getBufferLinks()
	 * @see #getSilo()
	 * @generated
	 */
	EReference getSilo_BufferLinks();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Silo#getReactorLinks <em>Reactor Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reactor Links</em>'.
	 * @see citrique2.Silo#getReactorLinks()
	 * @see #getSilo()
	 * @generated
	 */
	EReference getSilo_ReactorLinks();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.Silo#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see citrique2.Silo#getCapacity()
	 * @see #getSilo()
	 * @generated
	 */
	EAttribute getSilo_Capacity();

	/**
	 * Returns the meta object for class '{@link citrique2.Reactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactor</em>'.
	 * @see citrique2.Reactor
	 * @generated
	 */
	EClass getReactor();

	/**
	 * Returns the meta object for the reference list '{@link citrique2.Reactor#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Silo Links</em>'.
	 * @see citrique2.Reactor#getSiloLinks()
	 * @see #getReactor()
	 * @generated
	 */
	EReference getReactor_SiloLinks();

	/**
	 * Returns the meta object for class '{@link citrique2.PlantNode <em>Plant Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Node</em>'.
	 * @see citrique2.PlantNode
	 * @generated
	 */
	EClass getPlantNode();

	/**
	 * Returns the meta object for class '{@link citrique2.PlantLink <em>Plant Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Link</em>'.
	 * @see citrique2.PlantLink
	 * @generated
	 */
	EClass getPlantLink();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.PlantLink#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see citrique2.PlantLink#getLength()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_Length();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.PlantLink#getHeightFrom <em>Height From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height From</em>'.
	 * @see citrique2.PlantLink#getHeightFrom()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_HeightFrom();

	/**
	 * Returns the meta object for the attribute '{@link citrique2.PlantLink#getHeightTo <em>Height To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height To</em>'.
	 * @see citrique2.PlantLink#getHeightTo()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_HeightTo();

	/**
	 * Returns the meta object for class '{@link citrique2.BufferSiloLink <em>Buffer Silo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Silo Link</em>'.
	 * @see citrique2.BufferSiloLink
	 * @generated
	 */
	EClass getBufferSiloLink();

	/**
	 * Returns the meta object for the reference '{@link citrique2.BufferSiloLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silo</em>'.
	 * @see citrique2.BufferSiloLink#getSilo()
	 * @see #getBufferSiloLink()
	 * @generated
	 */
	EReference getBufferSiloLink_Silo();

	/**
	 * Returns the meta object for the reference '{@link citrique2.BufferSiloLink#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see citrique2.BufferSiloLink#getBuffer()
	 * @see #getBufferSiloLink()
	 * @generated
	 */
	EReference getBufferSiloLink_Buffer();

	/**
	 * Returns the meta object for the '{@link citrique2.BufferSiloLink#refreshDispose() <em>Refresh Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Dispose</em>' operation.
	 * @see citrique2.BufferSiloLink#refreshDispose()
	 * @generated
	 */
	EOperation getBufferSiloLink__RefreshDispose();

	/**
	 * Returns the meta object for class '{@link citrique2.SiloReactorLink <em>Silo Reactor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silo Reactor Link</em>'.
	 * @see citrique2.SiloReactorLink
	 * @generated
	 */
	EClass getSiloReactorLink();

	/**
	 * Returns the meta object for the reference '{@link citrique2.SiloReactorLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silo</em>'.
	 * @see citrique2.SiloReactorLink#getSilo()
	 * @see #getSiloReactorLink()
	 * @generated
	 */
	EReference getSiloReactorLink_Silo();

	/**
	 * Returns the meta object for the reference '{@link citrique2.SiloReactorLink#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactor</em>'.
	 * @see citrique2.SiloReactorLink#getReactor()
	 * @see #getSiloReactorLink()
	 * @generated
	 */
	EReference getSiloReactorLink_Reactor();

	/**
	 * Returns the meta object for the '{@link citrique2.SiloReactorLink#refreshDispose() <em>Refresh Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Dispose</em>' operation.
	 * @see citrique2.SiloReactorLink#refreshDispose()
	 * @generated
	 */
	EOperation getSiloReactorLink__RefreshDispose();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ctr2Factory getctr2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link citrique2.impl.CitriqueObjectImpl <em>Citrique Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.CitriqueObjectImpl
		 * @see citrique2.impl.ctr2PackageImpl#getCitriqueObject()
		 * @generated
		 */
		EClass CITRIQUE_OBJECT = eINSTANCE.getCitriqueObject();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITRIQUE_OBJECT__CHILD = eINSTANCE.getCitriqueObject_Child();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITRIQUE_OBJECT__PARENT = eINSTANCE.getCitriqueObject_Parent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__NAME = eINSTANCE.getCitriqueObject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__TYPE = eINSTANCE.getCitriqueObject_Type();

		/**
		 * The meta object literal for the '<em><b>Short Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__SHORT_TYPE = eINSTANCE.getCitriqueObject_ShortType();

		/**
		 * The meta object literal for the '<em><b>Short Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__SHORT_DESCRIPTION = eINSTANCE.getCitriqueObject_ShortDescription();

		/**
		 * The meta object literal for the '<em><b>Long Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__LONG_DESCRIPTION = eINSTANCE.getCitriqueObject_LongDescription();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__DESCRIPTION = eINSTANCE.getCitriqueObject_Description();

		/**
		 * The meta object literal for the '<em><b>Short Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__SHORT_NAME = eINSTANCE.getCitriqueObject_ShortName();

		/**
		 * The meta object literal for the '<em><b>Refresh Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_DESCRIPTION = eINSTANCE.getCitriqueObject__RefreshDescription();

		/**
		 * The meta object literal for the '<em><b>Refresh Short Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_SHORT_DESCRIPTION = eINSTANCE.getCitriqueObject__RefreshShortDescription();

		/**
		 * The meta object literal for the '<em><b>Refresh Long Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_LONG_DESCRIPTION = eINSTANCE.getCitriqueObject__RefreshLongDescription();

		/**
		 * The meta object literal for the '<em><b>Refresh Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_TYPE = eINSTANCE.getCitriqueObject__RefreshType();

		/**
		 * The meta object literal for the '<em><b>Refresh Short Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_SHORT_TYPE = eINSTANCE.getCitriqueObject__RefreshShortType();

		/**
		 * The meta object literal for the '<em><b>Refresh Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___REFRESH_CHILDREN = eINSTANCE.getCitriqueObject__RefreshChildren();

		/**
		 * The meta object literal for the '{@link citrique2.impl.CitriqueDomainImpl <em>Citrique Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.CitriqueDomainImpl
		 * @see citrique2.impl.ctr2PackageImpl#getCitriqueDomain()
		 * @generated
		 */
		EClass CITRIQUE_DOMAIN = eINSTANCE.getCitriqueDomain();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITRIQUE_DOMAIN__PLANT = eINSTANCE.getCitriqueDomain_Plant();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_DOMAIN___REFRESH = eINSTANCE.getCitriqueDomain__Refresh();

		/**
		 * The meta object literal for the '{@link citrique2.impl.PlantObjectImpl <em>Plant Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.PlantObjectImpl
		 * @see citrique2.impl.ctr2PackageImpl#getPlantObject()
		 * @generated
		 */
		EClass PLANT_OBJECT = eINSTANCE.getPlantObject();

		/**
		 * The meta object literal for the '<em><b>Plant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT_OBJECT__PLANT = eINSTANCE.getPlantObject_Plant();

		/**
		 * The meta object literal for the '{@link citrique2.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.PlantImpl
		 * @see citrique2.impl.ctr2PackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__BUFFER = eINSTANCE.getPlant_Buffer();

		/**
		 * The meta object literal for the '<em><b>Silo</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__SILO = eINSTANCE.getPlant_Silo();

		/**
		 * The meta object literal for the '<em><b>Reactor</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__REACTOR = eINSTANCE.getPlant_Reactor();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__NODE = eINSTANCE.getPlant_Node();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__LINK = eINSTANCE.getPlant_Link();

		/**
		 * The meta object literal for the '<em><b>Buffer Silo Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__BUFFER_SILO_LINK = eINSTANCE.getPlant_BufferSiloLink();

		/**
		 * The meta object literal for the '<em><b>Silo Reactor Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__SILO_REACTOR_LINK = eINSTANCE.getPlant_SiloReactorLink();

		/**
		 * The meta object literal for the '<em><b>Plant Object</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__PLANT_OBJECT = eINSTANCE.getPlant_PlantObject();

		/**
		 * The meta object literal for the '<em><b>Refresh Nodes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLANT___REFRESH_NODES = eINSTANCE.getPlant__RefreshNodes();

		/**
		 * The meta object literal for the '<em><b>Refresh Links</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLANT___REFRESH_LINKS = eINSTANCE.getPlant__RefreshLinks();

		/**
		 * The meta object literal for the '{@link citrique2.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.BufferImpl
		 * @see citrique2.impl.ctr2PackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Silo Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__SILO_LINKS = eINSTANCE.getBuffer_SiloLinks();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__CAPACITY = eINSTANCE.getBuffer_Capacity();

		/**
		 * The meta object literal for the '{@link citrique2.impl.SiloImpl <em>Silo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.SiloImpl
		 * @see citrique2.impl.ctr2PackageImpl#getSilo()
		 * @generated
		 */
		EClass SILO = eINSTANCE.getSilo();

		/**
		 * The meta object literal for the '<em><b>Buffer Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SILO__BUFFER_LINKS = eINSTANCE.getSilo_BufferLinks();

		/**
		 * The meta object literal for the '<em><b>Reactor Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SILO__REACTOR_LINKS = eINSTANCE.getSilo_ReactorLinks();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SILO__CAPACITY = eINSTANCE.getSilo_Capacity();

		/**
		 * The meta object literal for the '{@link citrique2.impl.ReactorImpl <em>Reactor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.ReactorImpl
		 * @see citrique2.impl.ctr2PackageImpl#getReactor()
		 * @generated
		 */
		EClass REACTOR = eINSTANCE.getReactor();

		/**
		 * The meta object literal for the '<em><b>Silo Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REACTOR__SILO_LINKS = eINSTANCE.getReactor_SiloLinks();

		/**
		 * The meta object literal for the '{@link citrique2.impl.PlantNodeImpl <em>Plant Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.PlantNodeImpl
		 * @see citrique2.impl.ctr2PackageImpl#getPlantNode()
		 * @generated
		 */
		EClass PLANT_NODE = eINSTANCE.getPlantNode();

		/**
		 * The meta object literal for the '{@link citrique2.impl.PlantLinkImpl <em>Plant Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.PlantLinkImpl
		 * @see citrique2.impl.ctr2PackageImpl#getPlantLink()
		 * @generated
		 */
		EClass PLANT_LINK = eINSTANCE.getPlantLink();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_LINK__LENGTH = eINSTANCE.getPlantLink_Length();

		/**
		 * The meta object literal for the '<em><b>Height From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_LINK__HEIGHT_FROM = eINSTANCE.getPlantLink_HeightFrom();

		/**
		 * The meta object literal for the '<em><b>Height To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLANT_LINK__HEIGHT_TO = eINSTANCE.getPlantLink_HeightTo();

		/**
		 * The meta object literal for the '{@link citrique2.impl.BufferSiloLinkImpl <em>Buffer Silo Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.BufferSiloLinkImpl
		 * @see citrique2.impl.ctr2PackageImpl#getBufferSiloLink()
		 * @generated
		 */
		EClass BUFFER_SILO_LINK = eINSTANCE.getBufferSiloLink();

		/**
		 * The meta object literal for the '<em><b>Silo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_SILO_LINK__SILO = eINSTANCE.getBufferSiloLink_Silo();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_SILO_LINK__BUFFER = eINSTANCE.getBufferSiloLink_Buffer();

		/**
		 * The meta object literal for the '<em><b>Refresh Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUFFER_SILO_LINK___REFRESH_DISPOSE = eINSTANCE.getBufferSiloLink__RefreshDispose();

		/**
		 * The meta object literal for the '{@link citrique2.impl.SiloReactorLinkImpl <em>Silo Reactor Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique2.impl.SiloReactorLinkImpl
		 * @see citrique2.impl.ctr2PackageImpl#getSiloReactorLink()
		 * @generated
		 */
		EClass SILO_REACTOR_LINK = eINSTANCE.getSiloReactorLink();

		/**
		 * The meta object literal for the '<em><b>Silo</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SILO_REACTOR_LINK__SILO = eINSTANCE.getSiloReactorLink_Silo();

		/**
		 * The meta object literal for the '<em><b>Reactor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SILO_REACTOR_LINK__REACTOR = eINSTANCE.getSiloReactorLink_Reactor();

		/**
		 * The meta object literal for the '<em><b>Refresh Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SILO_REACTOR_LINK___REFRESH_DISPOSE = eINSTANCE.getSiloReactorLink__RefreshDispose();

	}

} //ctr2Package
