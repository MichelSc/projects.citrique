/**
 */
package citrique3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique3.Plant#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link citrique3.Plant#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique3.Plant#getReactor <em>Reactor</em>}</li>
 *   <li>{@link citrique3.Plant#getNode <em>Node</em>}</li>
 *   <li>{@link citrique3.Plant#getLink <em>Link</em>}</li>
 *   <li>{@link citrique3.Plant#getBufferSiloLink <em>Buffer Silo Link</em>}</li>
 *   <li>{@link citrique3.Plant#getSiloReactorLink <em>Silo Reactor Link</em>}</li>
 *   <li>{@link citrique3.Plant#getPlantObject <em>Plant Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique3.Citrique3Package#getPlant()
 * @model
 * @generated
 */
public interface Plant extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.Buffer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getPlant_Buffer()
	 * @model containment="true"
	 * @generated
	 */
	EList<Buffer> getBuffer();

	/**
	 * Returns the value of the '<em><b>Silo</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.Silo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getPlant_Silo()
	 * @model containment="true"
	 *        extendedMetaData="name='BufferSiloLink'"
	 * @generated
	 */
	EList<Silo> getSilo();

	/**
	 * Returns the value of the '<em><b>Reactor</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.Reactor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getPlant_Reactor()
	 * @model containment="true"
	 *        extendedMetaData="name='BufferSiloLink'"
	 * @generated
	 */
	EList<Reactor> getReactor();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link citrique3.PlantNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see citrique3.Citrique3Package#getPlant_Node()
	 * @model extendedMetaData="name='BufferSiloLink'"
	 * @generated
	 */
	EList<PlantNode> getNode();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' reference list.
	 * The list contents are of type {@link citrique3.PlantLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' reference list.
	 * @see citrique3.Citrique3Package#getPlant_Link()
	 * @model extendedMetaData="name='BufferSiloLink'"
	 * @generated
	 */
	EList<PlantLink> getLink();

	/**
	 * Returns the value of the '<em><b>Buffer Silo Link</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.BufferSiloLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Silo Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Silo Link</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getPlant_BufferSiloLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<BufferSiloLink> getBufferSiloLink();

	/**
	 * Returns the value of the '<em><b>Silo Reactor Link</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.SiloReactorLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Reactor Link</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Reactor Link</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getPlant_SiloReactorLink()
	 * @model containment="true"
	 * @generated
	 */
	EList<SiloReactorLink> getSiloReactorLink();

	/**
	 * Returns the value of the '<em><b>Plant Object</b></em>' reference list.
	 * The list contents are of type {@link citrique3.PlantObject}.
	 * It is bidirectional and its opposite is '{@link citrique3.PlantObject#getPlant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant Object</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant Object</em>' reference list.
	 * @see citrique3.Citrique3Package#getPlant_PlantObject()
	 * @see citrique3.PlantObject#getPlant
	 * @model opposite="Plant"
	 * @generated
	 */
	EList<PlantObject> getPlantObject();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshNodes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshLinks();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshObjects();

} // Plant
