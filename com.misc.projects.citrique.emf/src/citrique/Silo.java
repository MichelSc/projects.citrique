/**
 */
package citrique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Silo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.Silo#getBufferLinks <em>Buffer Links</em>}</li>
 *   <li>{@link citrique.Silo#getReactorLinks <em>Reactor Links</em>}</li>
 *   <li>{@link citrique.Silo#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getSilo()
 * @model
 * @generated
 */
public interface Silo extends PlantNode {
	/**
	 * Returns the value of the '<em><b>Buffer Links</b></em>' reference list.
	 * The list contents are of type {@link citrique.BufferSiloLink}.
	 * It is bidirectional and its opposite is '{@link citrique.BufferSiloLink#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer Links</em>' reference list.
	 * @see citrique.CitriquePackage#getSilo_BufferLinks()
	 * @see citrique.BufferSiloLink#getSilo
	 * @model opposite="Silo"
	 * @generated
	 */
	EList<BufferSiloLink> getBufferLinks();

	/**
	 * Returns the value of the '<em><b>Reactor Links</b></em>' reference list.
	 * The list contents are of type {@link citrique.LinkSiloReactor}.
	 * It is bidirectional and its opposite is '{@link citrique.LinkSiloReactor#getSilo <em>Silo</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor Links</em>' reference list.
	 * @see citrique.CitriquePackage#getSilo_ReactorLinks()
	 * @see citrique.LinkSiloReactor#getSilo
	 * @model opposite="Silo"
	 * @generated
	 */
	EList<LinkSiloReactor> getReactorLinks();

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
	 * @see citrique.CitriquePackage#getSilo_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link citrique.Silo#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

} // Silo
