/**
 */
package citrique3;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique3.PlantObject#getPlant <em>Plant</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique3.Citrique3Package#getPlantObject()
 * @model
 * @generated
 */
public interface PlantObject extends CitriqueObject {
	/**
	 * Returns the value of the '<em><b>Plant</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique3.Plant#getPlantObject <em>Plant Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plant</em>' reference.
	 * @see #setPlant(Plant)
	 * @see citrique3.Citrique3Package#getPlantObject_Plant()
	 * @see citrique3.Plant#getPlantObject
	 * @model opposite="PlantObject"
	 * @generated
	 */
	Plant getPlant();

	/**
	 * Sets the value of the '{@link citrique3.PlantObject#getPlant <em>Plant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plant</em>' reference.
	 * @see #getPlant()
	 * @generated
	 */
	void setPlant(Plant value);

} // PlantObject
