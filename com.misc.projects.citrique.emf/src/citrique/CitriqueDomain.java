/**
 */
package citrique;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.CitriqueDomain#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getCitriqueDomain()
 * @model
 * @generated
 */
public interface CitriqueDomain extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' containment reference list.
	 * The list contents are of type {@link citrique.Plant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' containment reference list.
	 * @see citrique.CitriquePackage#getCitriqueDomain_Plant()
	 * @model containment="true"
	 * @generated
	 */
	EList<Plant> getPlant();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh();

} // CitriqueDomain
