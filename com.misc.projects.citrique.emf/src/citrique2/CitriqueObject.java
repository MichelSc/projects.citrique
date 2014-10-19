/**
 */
package citrique2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Citrique Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link citrique2.CitriqueObject#getChild <em>Child</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getParent <em>Parent</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getName <em>Name</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getType <em>Type</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getShortType <em>Short Type</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getShortDescription <em>Short Description</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getDescription <em>Description</em>}</li>
 *   <li>{@link citrique2.CitriqueObject#getShortName <em>Short Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see citrique2.ctr2Package#getCitriqueObject()
 * @model
 * @generated
 */
public interface CitriqueObject extends com.misc.common.moplaf.propagator.ObjectWithPropagatorFunctionAdapter {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link citrique2.CitriqueObject}.
	 * It is bidirectional and its opposite is '{@link citrique2.CitriqueObject#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see citrique2.ctr2Package#getCitriqueObject_Child()
	 * @see citrique2.CitriqueObject#getParent
	 * @model opposite="Parent"
	 * @generated
	 */
	EList<CitriqueObject> getChild();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link citrique2.CitriqueObject#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(CitriqueObject)
	 * @see citrique2.ctr2Package#getCitriqueObject_Parent()
	 * @see citrique2.CitriqueObject#getChild
	 * @model opposite="Child"
	 * @generated
	 */
	CitriqueObject getParent();

	/**
	 * Sets the value of the '{@link citrique2.CitriqueObject#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(CitriqueObject value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see citrique2.ctr2Package#getCitriqueObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link citrique2.CitriqueObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see citrique2.ctr2Package#getCitriqueObject_Type()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Short Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Type</em>' attribute.
	 * @see citrique2.ctr2Package#getCitriqueObject_ShortType()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	String getShortType();

	/**
	 * Returns the value of the '<em><b>Short Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Description</em>' attribute.
	 * @see citrique2.ctr2Package#getCitriqueObject_ShortDescription()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	String getShortDescription();

	/**
	 * Returns the value of the '<em><b>Long Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Description</em>' attribute.
	 * @see citrique2.ctr2Package#getCitriqueObject_LongDescription()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	String getLongDescription();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see citrique2.ctr2Package#getCitriqueObject_Description()
	 * @model suppressedSetVisibility="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Short Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Name</em>' attribute.
	 * @see #setShortName(String)
	 * @see citrique2.ctr2Package#getCitriqueObject_ShortName()
	 * @model
	 * @generated
	 */
	String getShortName();

	/**
	 * Sets the value of the '{@link citrique2.CitriqueObject#getShortName <em>Short Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Name</em>' attribute.
	 * @see #getShortName()
	 * @generated
	 */
	void setShortName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshShortDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshLongDescription();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshShortType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refreshChildren();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // CitriqueObject
