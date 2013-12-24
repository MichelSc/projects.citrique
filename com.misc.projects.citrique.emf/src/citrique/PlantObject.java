/**
 */
package citrique;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.PlantObject#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getPlantObject()
 * @model
 * @generated
 */
public interface PlantObject extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see citrique.CitriquePackage#getPlantObject_Plant()
	 * @model
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link citrique.PlantObject#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

} // PlantObject
