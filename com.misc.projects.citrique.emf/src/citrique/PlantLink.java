/**
 */
package citrique;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plant Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique.PlantLink#getLength <em>Length</em>}</li>
 *   <li>{@link citrique.PlantLink#getHeightFrom <em>Height From</em>}</li>
 *   <li>{@link citrique.PlantLink#getHeightTo <em>Height To</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique.CitriquePackage#getPlantLink()
 * @model
 * @generated
 */
public interface PlantLink extends PlantObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see citrique.CitriquePackage#getPlantLink_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link citrique.PlantLink#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Height From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height From</em>' attribute.
	 * @see #setHeightFrom(float)
	 * @see citrique.CitriquePackage#getPlantLink_HeightFrom()
	 * @model
	 * @generated
	 */
	float getHeightFrom();

	/**
	 * Sets the value of the '{@link citrique.PlantLink#getHeightFrom <em>Height From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height From</em>' attribute.
	 * @see #getHeightFrom()
	 * @generated
	 */
	void setHeightFrom(float value);

	/**
	 * Returns the value of the '<em><b>Height To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height To</em>' attribute.
	 * @see #setHeightTo(float)
	 * @see citrique.CitriquePackage#getPlantLink_HeightTo()
	 * @model
	 * @generated
	 */
	float getHeightTo();

	/**
	 * Sets the value of the '{@link citrique.PlantLink#getHeightTo <em>Height To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height To</em>' attribute.
	 * @see #getHeightTo()
	 * @generated
	 */
	void setHeightTo(float value);

} // PlantLink
