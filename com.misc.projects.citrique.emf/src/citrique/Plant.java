/**
 */
package citrique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.Plant#getBuffers <em>Buffers</em>}</li>
 *   <li>{@link citrique.Plant#getSilos <em>Silos</em>}</li>
 *   <li>{@link citrique.Plant#getReactors <em>Reactors</em>}</li>
 *   <li>{@link citrique.Plant#getNodes <em>Nodes</em>}</li>
 *   <li>{@link citrique.Plant#getLinks <em>Links</em>}</li>
 *   <li>{@link citrique.Plant#getBufferSiloLinks <em>Buffer Silo Links</em>}</li>
 *   <li>{@link citrique.Plant#getSiloReactorLinks <em>Silo Reactor Links</em>}</li>
 *   <li>{@link citrique.Plant#getPlantObjects <em>Plant Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Buffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffers</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Buffers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buffer> getBuffers();

	/**
	 * Returns the value of the '<em><b>Silos</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Silo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silos</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Silos()
	 * @model containment="true"
	 * @generated
	 */
	EList<Silo> getSilos();

	/**
	 * Returns the value of the '<em><b>Reactors</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Reactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactors</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Reactors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reactor> getReactors();

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list.
	 * The list contents are of type {@link citrique.PlantNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see citrique.CitriquePackage#getPlant_Nodes()
	 * @model
	 * @generated
	 */
	EList<PlantNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' reference list.
	 * The list contents are of type {@link citrique.PlantLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' reference list.
	 * @see citrique.CitriquePackage#getPlant_Links()
	 * @model
	 * @generated
	 */
	EList<PlantLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Buffer Silo Links</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.BufferSiloLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Silo Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Silo Links</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_BufferSiloLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<BufferSiloLink> getBufferSiloLinks();

	/**
	 * Returns the value of the '<em><b>Silo Reactor Links</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.LinkSiloReactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Reactor Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Reactor Links</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_SiloReactorLinks()
	 * @model containment="true"
	 * @generated
	 */
	EList<LinkSiloReactor> getSiloReactorLinks();

	/**
	 * Returns the value of the '<em><b>Plant Objects</b></em>' reference list.
	 * The list contents are of type {@link citrique.PlantObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Objects</em>' reference list.
	 * @see citrique.CitriquePackage#getPlant_PlantObjects()
	 * @model
	 * @generated
	 */
	EList<PlantObject> getPlantObjects();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RefreshNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RefreshLinks();

} // Plant
