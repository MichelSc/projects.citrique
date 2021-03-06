/**
 */
package citrique3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Silo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique3.Silo#getBufferLinks <em>Buffer Links</em>}</li>
 *   <li>{@link citrique3.Silo#getReactorLinks <em>Reactor Links</em>}</li>
 *   <li>{@link citrique3.Silo#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique3.Citrique3Package#getSilo()
 * @model
 * @generated
 */
public interface Silo extends PlantNode {
	/**
	 * Returns the value of the '<em><b>Buffer Links</b></em>' reference list.
	 * The list contents are of type {@link citrique3.BufferSiloLink}.
	 * It is bidirectional and its opposite is '{@link citrique3.BufferSiloLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Links</em>' reference list.
	 * @see citrique3.Citrique3Package#getSilo_BufferLinks()
	 * @see citrique3.BufferSiloLink#getSilo
	 * @model opposite="Silo"
	 * @generated
	 */
	EList<BufferSiloLink> getBufferLinks();

	/**
	 * Returns the value of the '<em><b>Reactor Links</b></em>' reference list.
	 * The list contents are of type {@link citrique3.SiloReactorLink}.
	 * It is bidirectional and its opposite is '{@link citrique3.SiloReactorLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor Links</em>' reference list.
	 * @see citrique3.Citrique3Package#getSilo_ReactorLinks()
	 * @see citrique3.SiloReactorLink#getSilo
	 * @model opposite="Silo"
	 * @generated
	 */
	EList<SiloReactorLink> getReactorLinks();

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(float)
	 * @see citrique3.Citrique3Package#getSilo_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link citrique3.Silo#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

} // Silo
