/**
 */
package citrique.util;

import citrique.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see citrique.CitriquePackage
 * @generated
 */
public class CitriqueSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CitriquePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CitriqueSwitch() {
		if (modelPackage == null) {
			modelPackage = CitriquePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CitriquePackage.CITRIQUE_OBJECT: {
				CitriqueObject citriqueObject = (CitriqueObject)theEObject;
				T result = caseCitriqueObject(citriqueObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.CITRIQUE_DOMAIN: {
				CitriqueDomain citriqueDomain = (CitriqueDomain)theEObject;
				T result = caseCitriqueDomain(citriqueDomain);
				if (result == null) result = caseCitriqueObject(citriqueDomain);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.PLANT_OBJECT: {
				PlantObject plantObject = (PlantObject)theEObject;
				T result = casePlantObject(plantObject);
				if (result == null) result = caseCitriqueObject(plantObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.PLANT: {
				Plant plant = (Plant)theEObject;
				T result = casePlant(plant);
				if (result == null) result = caseCitriqueObject(plant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.BUFFER: {
				Buffer buffer = (Buffer)theEObject;
				T result = caseBuffer(buffer);
				if (result == null) result = casePlantNode(buffer);
				if (result == null) result = casePlantObject(buffer);
				if (result == null) result = caseCitriqueObject(buffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.SILO: {
				Silo silo = (Silo)theEObject;
				T result = caseSilo(silo);
				if (result == null) result = casePlantNode(silo);
				if (result == null) result = casePlantObject(silo);
				if (result == null) result = caseCitriqueObject(silo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.REACTOR: {
				Reactor reactor = (Reactor)theEObject;
				T result = caseReactor(reactor);
				if (result == null) result = casePlantNode(reactor);
				if (result == null) result = casePlantObject(reactor);
				if (result == null) result = caseCitriqueObject(reactor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.PLANT_NODE: {
				PlantNode plantNode = (PlantNode)theEObject;
				T result = casePlantNode(plantNode);
				if (result == null) result = casePlantObject(plantNode);
				if (result == null) result = caseCitriqueObject(plantNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.PLANT_LINK: {
				PlantLink plantLink = (PlantLink)theEObject;
				T result = casePlantLink(plantLink);
				if (result == null) result = casePlantObject(plantLink);
				if (result == null) result = caseCitriqueObject(plantLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.BUFFER_SILO_LINK: {
				BufferSiloLink bufferSiloLink = (BufferSiloLink)theEObject;
				T result = caseBufferSiloLink(bufferSiloLink);
				if (result == null) result = casePlantLink(bufferSiloLink);
				if (result == null) result = casePlantObject(bufferSiloLink);
				if (result == null) result = caseCitriqueObject(bufferSiloLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CitriquePackage.SILO_REACTOR_LINK: {
				SiloReactorLink siloReactorLink = (SiloReactorLink)theEObject;
				T result = caseSiloReactorLink(siloReactorLink);
				if (result == null) result = casePlantLink(siloReactorLink);
				if (result == null) result = casePlantObject(siloReactorLink);
				if (result == null) result = caseCitriqueObject(siloReactorLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitriqueObject(CitriqueObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCitriqueDomain(CitriqueDomain object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantObject(PlantObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlant(Plant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Silo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSilo(Silo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reactor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reactor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReactor(Reactor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantNode(PlantNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plant Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plant Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlantLink(PlantLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Silo Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Silo Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferSiloLink(BufferSiloLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Silo Reactor Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Silo Reactor Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSiloReactorLink(SiloReactorLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CitriqueSwitch
