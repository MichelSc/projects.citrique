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
 *   <li>{@link citrique.Plant#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link citrique.Plant#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique.Plant#getReactor <em>Reactor</em>}</li>
 *   <li>{@link citrique.Plant#getNode <em>Node</em>}</li>
 *   <li>{@link citrique.Plant#getLinks <em>Links</em>}</li>
 *   <li>{@link citrique.Plant#getBufferSiloLink <em>Buffer Silo Link</em>}</li>
 *   <li>{@link citrique.Plant#getSiloReactorLink <em>Silo Reactor Link</em>}</li>
 *   <li>{@link citrique.Plant#getPlantObject <em>Plant Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getPlant()
 * @model
 * @generated
 */
public interface Plant extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Buffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Buffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buffer> getBuffer();

	/**
	 * Returns the value of the '<em><b>Silo</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Silo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Silo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Silo> getSilo();

	/**
	 * Returns the value of the '<em><b>Reactor</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Reactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_Reactor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Reactor> getReactor();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link citrique.PlantNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see citrique.CitriquePackage#getPlant_Node()
	 * @model
	 * @generated
	 */
	EList<PlantNode> getNode();

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
	 * Returns the value of the '<em><b>Buffer Silo Link</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.BufferSiloLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Silo Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Silo Link</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_BufferSiloLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<BufferSiloLink> getBufferSiloLink();

	/**
	 * Returns the value of the '<em><b>Silo Reactor Link</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.SiloReactorLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Reactor Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Reactor Link</em>' containment reference list.
	 * @see citrique.CitriquePackage#getPlant_SiloReactorLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiloReactorLink> getSiloReactorLink();

	/**
	 * Returns the value of the '<em><b>Plant Object</b></em>' reference list.
	 * The list contents are of type {@link citrique.PlantObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Object</em>' reference list.
	 * @see citrique.CitriquePackage#getPlant_PlantObject()
	 * @model
	 * @generated
	 */
	EList<PlantObject> getPlantObject();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void RefreshChildren();

} // Plant
