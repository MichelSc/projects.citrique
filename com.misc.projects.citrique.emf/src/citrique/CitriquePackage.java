/**
 */
package citrique;

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
 * @see citrique.CitriqueFactory
 * @model kind="package"
 * @generated
 */
public interface CitriquePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "citrique";

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
	String eNS_PREFIX = "citrique";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CitriquePackage eINSTANCE = citrique.impl.CitriquePackageImpl.init();

	/**
	 * The meta object id for the '{@link citrique.impl.CitriqueObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.CitriqueObjectImpl
	 * @see citrique.impl.CitriquePackageImpl#getCitriqueObject()
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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT__SHORT_NAME = 7;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT_FEATURE_COUNT = 8;

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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___GET_TYPE = 2;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT___GET_SHORT_TYPE = 3;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_OBJECT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link citrique.impl.CitriqueDomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.CitriqueDomainImpl
	 * @see citrique.impl.CitriquePackageImpl#getCitriqueDomain()
	 * @generated
	 */
	int CITRIQUE_DOMAIN = 1;

	/**
	 * The feature id for the '<em><b>Plants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN__PLANTS = 0;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN___REFRESH = 0;

	/**
	 * The number of operations of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITRIQUE_DOMAIN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link citrique.impl.PlantObjectImpl <em>Plant Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.PlantObjectImpl
	 * @see citrique.impl.CitriquePackageImpl#getPlantObject()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___GET_TYPE = CITRIQUE_OBJECT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT___GET_SHORT_TYPE = CITRIQUE_OBJECT___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Plant Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OBJECT_OPERATION_COUNT = CITRIQUE_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.PlantImpl
	 * @see citrique.impl.CitriquePackageImpl#getPlant()
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
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__LINKS = CITRIQUE_OBJECT_FEATURE_COUNT + 4;

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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___GET_TYPE = CITRIQUE_OBJECT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___GET_SHORT_TYPE = CITRIQUE_OBJECT___GET_SHORT_TYPE;

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
	 * The operation id for the '<em>Refresh Children</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT___REFRESH_CHILDREN = CITRIQUE_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = CITRIQUE_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link citrique.impl.PlantNodeImpl <em>Plant Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.PlantNodeImpl
	 * @see citrique.impl.CitriquePackageImpl#getPlantNode()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___GET_TYPE = PLANT_OBJECT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE___GET_SHORT_TYPE = PLANT_OBJECT___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Plant Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_NODE_OPERATION_COUNT = PLANT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.BufferImpl
	 * @see citrique.impl.CitriquePackageImpl#getBuffer()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___GET_TYPE = PLANT_NODE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER___GET_SHORT_TYPE = PLANT_NODE___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.SiloImpl <em>Silo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.SiloImpl
	 * @see citrique.impl.CitriquePackageImpl#getSilo()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___GET_TYPE = PLANT_NODE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO___GET_SHORT_TYPE = PLANT_NODE___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Silo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.ReactorImpl <em>Reactor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.ReactorImpl
	 * @see citrique.impl.CitriquePackageImpl#getReactor()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___GET_TYPE = PLANT_NODE___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR___GET_SHORT_TYPE = PLANT_NODE___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Reactor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REACTOR_OPERATION_COUNT = PLANT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.PlantLinkImpl <em>Plant Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.PlantLinkImpl
	 * @see citrique.impl.CitriquePackageImpl#getPlantLink()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___GET_TYPE = PLANT_OBJECT___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK___GET_SHORT_TYPE = PLANT_OBJECT___GET_SHORT_TYPE;

	/**
	 * The number of operations of the '<em>Plant Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_LINK_OPERATION_COUNT = PLANT_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link citrique.impl.BufferSiloLinkImpl <em>Buffer Silo Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.BufferSiloLinkImpl
	 * @see citrique.impl.CitriquePackageImpl#getBufferSiloLink()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___GET_TYPE = PLANT_LINK___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_SILO_LINK___GET_SHORT_TYPE = PLANT_LINK___GET_SHORT_TYPE;

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
	 * The meta object id for the '{@link citrique.impl.SiloReactorLinkImpl <em>Silo Reactor Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see citrique.impl.SiloReactorLinkImpl
	 * @see citrique.impl.CitriquePackageImpl#getSiloReactorLink()
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
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___GET_TYPE = PLANT_LINK___GET_TYPE;

	/**
	 * The operation id for the '<em>Get Short Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SILO_REACTOR_LINK___GET_SHORT_TYPE = PLANT_LINK___GET_SHORT_TYPE;

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
	 * Returns the meta object for class '{@link citrique.CitriqueObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see citrique.CitriqueObject
	 * @generated
	 */
	EClass getCitriqueObject();

	/**
	 * Returns the meta object for the reference list '{@link citrique.CitriqueObject#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Child</em>'.
	 * @see citrique.CitriqueObject#getChild()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EReference getCitriqueObject_Child();

	/**
	 * Returns the meta object for the reference '{@link citrique.CitriqueObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see citrique.CitriqueObject#getParent()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EReference getCitriqueObject_Parent();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see citrique.CitriqueObject#getName()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Name();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see citrique.CitriqueObject#getType()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Type();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see citrique.CitriqueObject#getDescription()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getShortType <em>Short Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Type</em>'.
	 * @see citrique.CitriqueObject#getShortType()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortType();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getShortDescription <em>Short Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Description</em>'.
	 * @see citrique.CitriqueObject#getShortDescription()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortDescription();

	/**
	 * Returns the meta object for the attribute '{@link citrique.CitriqueObject#getShortName <em>Short Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Name</em>'.
	 * @see citrique.CitriqueObject#getShortName()
	 * @see #getCitriqueObject()
	 * @generated
	 */
	EAttribute getCitriqueObject_ShortName();

	/**
	 * Returns the meta object for the '{@link citrique.CitriqueObject#RefreshDescription() <em>Refresh Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Description</em>' operation.
	 * @see citrique.CitriqueObject#RefreshDescription()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshDescription();

	/**
	 * Returns the meta object for the '{@link citrique.CitriqueObject#RefreshShortDescription() <em>Refresh Short Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Short Description</em>' operation.
	 * @see citrique.CitriqueObject#RefreshShortDescription()
	 * @generated
	 */
	EOperation getCitriqueObject__RefreshShortDescription();

	/**
	 * Returns the meta object for the '{@link citrique.CitriqueObject#GetType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see citrique.CitriqueObject#GetType()
	 * @generated
	 */
	EOperation getCitriqueObject__GetType();

	/**
	 * Returns the meta object for the '{@link citrique.CitriqueObject#GetShortType() <em>Get Short Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Short Type</em>' operation.
	 * @see citrique.CitriqueObject#GetShortType()
	 * @generated
	 */
	EOperation getCitriqueObject__GetShortType();

	/**
	 * Returns the meta object for class '{@link citrique.CitriqueDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see citrique.CitriqueDomain
	 * @generated
	 */
	EClass getCitriqueDomain();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.CitriqueDomain#getPlants <em>Plants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plants</em>'.
	 * @see citrique.CitriqueDomain#getPlants()
	 * @see #getCitriqueDomain()
	 * @generated
	 */
	EReference getCitriqueDomain_Plants();

	/**
	 * Returns the meta object for the '{@link citrique.CitriqueDomain#Refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see citrique.CitriqueDomain#Refresh()
	 * @generated
	 */
	EOperation getCitriqueDomain__Refresh();

	/**
	 * Returns the meta object for class '{@link citrique.PlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Object</em>'.
	 * @see citrique.PlantObject
	 * @generated
	 */
	EClass getPlantObject();

	/**
	 * Returns the meta object for the reference '{@link citrique.PlantObject#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Plant</em>'.
	 * @see citrique.PlantObject#getPlant()
	 * @see #getPlantObject()
	 * @generated
	 */
	EReference getPlantObject_Plant();

	/**
	 * Returns the meta object for class '{@link citrique.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see citrique.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.Plant#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer</em>'.
	 * @see citrique.Plant#getBuffer()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Buffer();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.Plant#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Silo</em>'.
	 * @see citrique.Plant#getSilo()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Silo();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.Plant#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reactor</em>'.
	 * @see citrique.Plant#getReactor()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Reactor();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Plant#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Node</em>'.
	 * @see citrique.Plant#getNode()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Node();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Plant#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see citrique.Plant#getLinks()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.Plant#getBufferSiloLink <em>Buffer Silo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Buffer Silo Link</em>'.
	 * @see citrique.Plant#getBufferSiloLink()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_BufferSiloLink();

	/**
	 * Returns the meta object for the containment reference list '{@link citrique.Plant#getSiloReactorLink <em>Silo Reactor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Silo Reactor Link</em>'.
	 * @see citrique.Plant#getSiloReactorLink()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_SiloReactorLink();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Plant#getPlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Plant Object</em>'.
	 * @see citrique.Plant#getPlantObject()
	 * @see #getPlant()
	 * @generated
	 */
	EReference getPlant_PlantObject();

	/**
	 * Returns the meta object for the '{@link citrique.Plant#RefreshNodes() <em>Refresh Nodes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Nodes</em>' operation.
	 * @see citrique.Plant#RefreshNodes()
	 * @generated
	 */
	EOperation getPlant__RefreshNodes();

	/**
	 * Returns the meta object for the '{@link citrique.Plant#RefreshLinks() <em>Refresh Links</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Links</em>' operation.
	 * @see citrique.Plant#RefreshLinks()
	 * @generated
	 */
	EOperation getPlant__RefreshLinks();

	/**
	 * Returns the meta object for the '{@link citrique.Plant#RefreshChildren() <em>Refresh Children</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Children</em>' operation.
	 * @see citrique.Plant#RefreshChildren()
	 * @generated
	 */
	EOperation getPlant__RefreshChildren();

	/**
	 * Returns the meta object for class '{@link citrique.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see citrique.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Buffer#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Silo Links</em>'.
	 * @see citrique.Buffer#getSiloLinks()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_SiloLinks();

	/**
	 * Returns the meta object for the attribute '{@link citrique.Buffer#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see citrique.Buffer#getCapacity()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Capacity();

	/**
	 * Returns the meta object for class '{@link citrique.Silo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silo</em>'.
	 * @see citrique.Silo
	 * @generated
	 */
	EClass getSilo();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Silo#getBufferLinks <em>Buffer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Buffer Links</em>'.
	 * @see citrique.Silo#getBufferLinks()
	 * @see #getSilo()
	 * @generated
	 */
	EReference getSilo_BufferLinks();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Silo#getReactorLinks <em>Reactor Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reactor Links</em>'.
	 * @see citrique.Silo#getReactorLinks()
	 * @see #getSilo()
	 * @generated
	 */
	EReference getSilo_ReactorLinks();

	/**
	 * Returns the meta object for the attribute '{@link citrique.Silo#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see citrique.Silo#getCapacity()
	 * @see #getSilo()
	 * @generated
	 */
	EAttribute getSilo_Capacity();

	/**
	 * Returns the meta object for class '{@link citrique.Reactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reactor</em>'.
	 * @see citrique.Reactor
	 * @generated
	 */
	EClass getReactor();

	/**
	 * Returns the meta object for the reference list '{@link citrique.Reactor#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Silo Links</em>'.
	 * @see citrique.Reactor#getSiloLinks()
	 * @see #getReactor()
	 * @generated
	 */
	EReference getReactor_SiloLinks();

	/**
	 * Returns the meta object for class '{@link citrique.PlantNode <em>Plant Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Node</em>'.
	 * @see citrique.PlantNode
	 * @generated
	 */
	EClass getPlantNode();

	/**
	 * Returns the meta object for class '{@link citrique.PlantLink <em>Plant Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant Link</em>'.
	 * @see citrique.PlantLink
	 * @generated
	 */
	EClass getPlantLink();

	/**
	 * Returns the meta object for the attribute '{@link citrique.PlantLink#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see citrique.PlantLink#getLength()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_Length();

	/**
	 * Returns the meta object for the attribute '{@link citrique.PlantLink#getHeightFrom <em>Height From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height From</em>'.
	 * @see citrique.PlantLink#getHeightFrom()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_HeightFrom();

	/**
	 * Returns the meta object for the attribute '{@link citrique.PlantLink#getHeightTo <em>Height To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height To</em>'.
	 * @see citrique.PlantLink#getHeightTo()
	 * @see #getPlantLink()
	 * @generated
	 */
	EAttribute getPlantLink_HeightTo();

	/**
	 * Returns the meta object for class '{@link citrique.BufferSiloLink <em>Buffer Silo Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Silo Link</em>'.
	 * @see citrique.BufferSiloLink
	 * @generated
	 */
	EClass getBufferSiloLink();

	/**
	 * Returns the meta object for the reference '{@link citrique.BufferSiloLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silo</em>'.
	 * @see citrique.BufferSiloLink#getSilo()
	 * @see #getBufferSiloLink()
	 * @generated
	 */
	EReference getBufferSiloLink_Silo();

	/**
	 * Returns the meta object for the reference '{@link citrique.BufferSiloLink#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see citrique.BufferSiloLink#getBuffer()
	 * @see #getBufferSiloLink()
	 * @generated
	 */
	EReference getBufferSiloLink_Buffer();

	/**
	 * Returns the meta object for the '{@link citrique.BufferSiloLink#RefreshDispose() <em>Refresh Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Dispose</em>' operation.
	 * @see citrique.BufferSiloLink#RefreshDispose()
	 * @generated
	 */
	EOperation getBufferSiloLink__RefreshDispose();

	/**
	 * Returns the meta object for class '{@link citrique.SiloReactorLink <em>Silo Reactor Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Silo Reactor Link</em>'.
	 * @see citrique.SiloReactorLink
	 * @generated
	 */
	EClass getSiloReactorLink();

	/**
	 * Returns the meta object for the reference '{@link citrique.SiloReactorLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silo</em>'.
	 * @see citrique.SiloReactorLink#getSilo()
	 * @see #getSiloReactorLink()
	 * @generated
	 */
	EReference getSiloReactorLink_Silo();

	/**
	 * Returns the meta object for the reference '{@link citrique.SiloReactorLink#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reactor</em>'.
	 * @see citrique.SiloReactorLink#getReactor()
	 * @see #getSiloReactorLink()
	 * @generated
	 */
	EReference getSiloReactorLink_Reactor();

	/**
	 * Returns the meta object for the '{@link citrique.SiloReactorLink#RefreshDispose() <em>Refresh Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh Dispose</em>' operation.
	 * @see citrique.SiloReactorLink#RefreshDispose()
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
	CitriqueFactory getCitriqueFactory();

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
		 * The meta object literal for the '{@link citrique.impl.CitriqueObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.CitriqueObjectImpl
		 * @see citrique.impl.CitriquePackageImpl#getCitriqueObject()
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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITRIQUE_OBJECT__DESCRIPTION = eINSTANCE.getCitriqueObject_Description();

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
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___GET_TYPE = eINSTANCE.getCitriqueObject__GetType();

		/**
		 * The meta object literal for the '<em><b>Get Short Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_OBJECT___GET_SHORT_TYPE = eINSTANCE.getCitriqueObject__GetShortType();

		/**
		 * The meta object literal for the '{@link citrique.impl.CitriqueDomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.CitriqueDomainImpl
		 * @see citrique.impl.CitriquePackageImpl#getCitriqueDomain()
		 * @generated
		 */
		EClass CITRIQUE_DOMAIN = eINSTANCE.getCitriqueDomain();

		/**
		 * The meta object literal for the '<em><b>Plants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CITRIQUE_DOMAIN__PLANTS = eINSTANCE.getCitriqueDomain_Plants();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CITRIQUE_DOMAIN___REFRESH = eINSTANCE.getCitriqueDomain__Refresh();

		/**
		 * The meta object literal for the '{@link citrique.impl.PlantObjectImpl <em>Plant Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.PlantObjectImpl
		 * @see citrique.impl.CitriquePackageImpl#getPlantObject()
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
		 * The meta object literal for the '{@link citrique.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.PlantImpl
		 * @see citrique.impl.CitriquePackageImpl#getPlant()
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
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLANT__LINKS = eINSTANCE.getPlant_Links();

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
		 * The meta object literal for the '<em><b>Refresh Children</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PLANT___REFRESH_CHILDREN = eINSTANCE.getPlant__RefreshChildren();

		/**
		 * The meta object literal for the '{@link citrique.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.BufferImpl
		 * @see citrique.impl.CitriquePackageImpl#getBuffer()
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
		 * The meta object literal for the '{@link citrique.impl.SiloImpl <em>Silo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.SiloImpl
		 * @see citrique.impl.CitriquePackageImpl#getSilo()
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
		 * The meta object literal for the '{@link citrique.impl.ReactorImpl <em>Reactor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.ReactorImpl
		 * @see citrique.impl.CitriquePackageImpl#getReactor()
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
		 * The meta object literal for the '{@link citrique.impl.PlantNodeImpl <em>Plant Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.PlantNodeImpl
		 * @see citrique.impl.CitriquePackageImpl#getPlantNode()
		 * @generated
		 */
		EClass PLANT_NODE = eINSTANCE.getPlantNode();

		/**
		 * The meta object literal for the '{@link citrique.impl.PlantLinkImpl <em>Plant Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.PlantLinkImpl
		 * @see citrique.impl.CitriquePackageImpl#getPlantLink()
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
		 * The meta object literal for the '{@link citrique.impl.BufferSiloLinkImpl <em>Buffer Silo Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.BufferSiloLinkImpl
		 * @see citrique.impl.CitriquePackageImpl#getBufferSiloLink()
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
		 * The meta object literal for the '{@link citrique.impl.SiloReactorLinkImpl <em>Silo Reactor Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see citrique.impl.SiloReactorLinkImpl
		 * @see citrique.impl.CitriquePackageImpl#getSiloReactorLink()
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

} //CitriquePackage
