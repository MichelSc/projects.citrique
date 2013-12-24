/**
 */
package citrique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.Buffer#getSiloLinks <em>Silo Links</em>}</li>
 *   <li>{@link citrique.Buffer#getCapacity <em>Capacity</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getBuffer()
 * @model
 * @generated
 */
public interface Buffer extends PlantNode {
	/**
	 * Returns the value of the '<em><b>Silo Links</b></em>' reference list.
	 * The list contents are of type {@link citrique.BufferSiloLink}.
	 * It is bidirectional and its opposite is '{@link citrique.BufferSiloLink#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Links</em>' reference list.
	 * @see citrique.CitriquePackage#getBuffer_SiloLinks()
	 * @see citrique.BufferSiloLink#getBuffer
	 * @model opposite="Buffer"
	 * @generated
	 */
	EList<BufferSiloLink> getSiloLinks();

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
	 * @see citrique.CitriquePackage#getBuffer_Capacity()
	 * @model
	 * @generated
	 */
	float getCapacity();

	/**
	 * Sets the value of the '{@link citrique.Buffer#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(float value);

} // Buffer
