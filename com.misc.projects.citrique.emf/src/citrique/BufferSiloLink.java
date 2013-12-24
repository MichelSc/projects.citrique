/**
 */
package citrique;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer Silo Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.BufferSiloLink#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique.BufferSiloLink#getBuffer <em>Buffer</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getBufferSiloLink()
 * @model
 * @generated
 */
public interface BufferSiloLink extends PlantLink {
	/**
	 * Returns the value of the '<em><b>Silo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique.Silo#getBufferLinks <em>Buffer Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo</em>' reference.
	 * @see #setSilo(Silo)
	 * @see citrique.CitriquePackage#getBufferSiloLink_Silo()
	 * @see citrique.Silo#getBufferLinks
	 * @model opposite="BufferLinks" required="true"
	 * @generated
	 */
	Silo getSilo();

	/**
	 * Sets the value of the '{@link citrique.BufferSiloLink#getSilo <em>Silo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silo</em>' reference.
	 * @see #getSilo()
	 * @generated
	 */
	void setSilo(Silo value);

	/**
	 * Returns the value of the '<em><b>Buffer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique.Buffer#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Buffer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffer</em>' reference.
	 * @see #setBuffer(Buffer)
	 * @see citrique.CitriquePackage#getBufferSiloLink_Buffer()
	 * @see citrique.Buffer#getSiloLinks
	 * @model opposite="SiloLinks" required="true"
	 * @generated
	 */
	Buffer getBuffer();

	/**
	 * Sets the value of the '{@link citrique.BufferSiloLink#getBuffer <em>Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buffer</em>' reference.
	 * @see #getBuffer()
	 * @generated
	 */
	void setBuffer(Buffer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RefreshDispose calculate if the object must be dropped and drop it if so
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refreshDispose();

} // BufferSiloLink
