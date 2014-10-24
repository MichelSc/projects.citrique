/**
 */
package citrique3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reactor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique3.Reactor#getSiloLinks <em>Silo Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique3.Citrique3Package#getReactor()
 * @model
 * @generated
 */
public interface Reactor extends PlantNode {
	/**
	 * Returns the value of the '<em><b>Silo Links</b></em>' reference list.
	 * The list contents are of type {@link citrique3.SiloReactorLink}.
	 * It is bidirectional and its opposite is '{@link citrique3.SiloReactorLink#getReactor <em>Reactor</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Silo Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silo Links</em>' reference list.
	 * @see citrique3.Citrique3Package#getReactor_SiloLinks()
	 * @see citrique3.SiloReactorLink#getReactor
	 * @model opposite="Reactor"
	 * @generated
	 */
	EList<SiloReactorLink> getSiloLinks();

} // Reactor
