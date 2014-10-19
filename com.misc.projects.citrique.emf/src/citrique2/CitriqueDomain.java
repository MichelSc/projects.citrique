/**
 */
package citrique2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citrique Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique2.CitriqueDomain#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique2.ctr2Package#getCitriqueDomain()
 * @model
 * @generated
 */
public interface CitriqueDomain extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' containment reference list.
	 * The list contents are of type {@link citrique2.Plant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' containment reference list.
	 * @see citrique2.ctr2Package#getCitriqueDomain_Plant()
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void activate();

} // CitriqueDomain
