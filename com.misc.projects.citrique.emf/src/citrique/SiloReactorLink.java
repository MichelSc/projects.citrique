/**
 */
package citrique;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Silo Reactor Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.SiloReactorLink#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique.SiloReactorLink#getReactor <em>Reactor</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getSiloReactorLink()
 * @model
 * @generated
 */
public interface SiloReactorLink extends PlantLink {
	/**
	 * Returns the value of the '<em><b>Silo</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique.Silo#getReactorLinks <em>Reactor Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo</em>' reference.
	 * @see #setSilo(Silo)
	 * @see citrique.CitriquePackage#getSiloReactorLink_Silo()
	 * @see citrique.Silo#getReactorLinks
	 * @model opposite="ReactorLinks" required="true"
	 * @generated
	 */
	Silo getSilo();

	/**
	 * Sets the value of the '{@link citrique.SiloReactorLink#getSilo <em>Silo</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silo</em>' reference.
	 * @see #getSilo()
	 * @generated
	 */
	void setSilo(Silo value);

	/**
	 * Returns the value of the '<em><b>Reactor</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique.Reactor#getSiloLinks <em>Silo Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reactor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reactor</em>' reference.
	 * @see #setReactor(Reactor)
	 * @see citrique.CitriquePackage#getSiloReactorLink_Reactor()
	 * @see citrique.Reactor#getSiloLinks
	 * @model opposite="SiloLinks" required="true"
	 * @generated
	 */
	Reactor getReactor();

	/**
	 * Sets the value of the '{@link citrique.SiloReactorLink#getReactor <em>Reactor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reactor</em>' reference.
	 * @see #getReactor()
	 * @generated
	 */
	void setReactor(Reactor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshDispose();

} // SiloReactorLink