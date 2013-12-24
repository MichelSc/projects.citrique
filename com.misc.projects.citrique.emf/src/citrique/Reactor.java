/**
 */
package citrique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.Reactor#getSiloLinks <em>Silo Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getReactor()
 * @model
 * @generated
 */
public interface Reactor extends PlantNode {
	/**
	 * Returns the value of the '<em><b>Silo Links</b></em>' reference list.
	 * The list contents are of type {@link citrique.SiloReactorLink}.
	 * It is bidirectional and its opposite is '{@link citrique.SiloReactorLink#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Links</em>' reference list.
	 * @see citrique.CitriquePackage#getReactor_SiloLinks()
	 * @see citrique.SiloReactorLink#getReactor
	 * @model opposite="Reactor"
	 * @generated
	 */
	EList<SiloReactorLink> getSiloLinks();

} // Reactor
