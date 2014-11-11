/**
 */
package citrique3;

import com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapterScope;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citrique Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique3.CitriqueDomain#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique3.Citrique3Package#getCitriqueDomain()
 * @model
 * @generated
 */
public interface CitriqueDomain extends CitriqueObject, ObjectWithPropagatorFunctionAdapterScope {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' containment reference list.
	 * The list contents are of type {@link citrique3.Plant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' containment reference list.
	 * @see citrique3.Citrique3Package#getCitriqueDomain_Plant()
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
