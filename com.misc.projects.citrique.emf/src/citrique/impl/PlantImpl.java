/**
 */
package citrique.impl;

import citrique.Buffer;
import citrique.BufferSiloLink;
import citrique.CitriquePackage;
import citrique.LinkSiloReactor;
import citrique.Plant;
import citrique.PlantLink;
import citrique.PlantNode;
import citrique.PlantObject;
import citrique.Reactor;
import citrique.Silo;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique.impl.PlantImpl#getBuffers <em>Buffers</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getSilos <em>Silos</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getReactors <em>Reactors</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getBufferSiloLinks <em>Buffer Silo Links</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getSiloReactorLinks <em>Silo Reactor Links</em>}</li>
 *   <li>{@link citrique.impl.PlantImpl#getPlantObjects <em>Plant Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlantImpl extends CitriqueObjectImpl implements Plant {
	/**
	 * The cached value of the '{@link #getBuffers() <em>Buffers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffers()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer> buffers;

	/**
	 * The cached value of the '{@link #getSilos() <em>Silos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilos()
	 * @generated
	 * @ordered
	 */
	protected EList<Silo> silos;

	/**
	 * The cached value of the '{@link #getReactors() <em>Reactors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactors()
	 * @generated
	 * @ordered
	 */
	protected EList<Reactor> reactors;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantNode> nodes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantLink> links;

	/**
	 * The cached value of the '{@link #getBufferSiloLinks() <em>Buffer Silo Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSiloLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<BufferSiloLink> bufferSiloLinks;

	/**
	 * The cached value of the '{@link #getSiloReactorLinks() <em>Silo Reactor Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiloReactorLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkSiloReactor> siloReactorLinks;

	/**
	 * The cached value of the '{@link #getPlantObjects() <em>Plant Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantObject> plantObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CitriquePackage.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer> getBuffers() {
		if (buffers == null) {
			buffers = new EObjectContainmentEList<Buffer>(Buffer.class, this, CitriquePackage.PLANT__BUFFERS);
		}
		return buffers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Silo> getSilos() {
		if (silos == null) {
			silos = new EObjectContainmentEList<Silo>(Silo.class, this, CitriquePackage.PLANT__SILOS);
		}
		return silos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reactor> getReactors() {
		if (reactors == null) {
			reactors = new EObjectContainmentEList<Reactor>(Reactor.class, this, CitriquePackage.PLANT__REACTORS);
		}
		return reactors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<PlantNode>(PlantNode.class, this, CitriquePackage.PLANT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantLink> getLinks() {
		if (links == null) {
			links = new EObjectResolvingEList<PlantLink>(PlantLink.class, this, CitriquePackage.PLANT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BufferSiloLink> getBufferSiloLinks() {
		if (bufferSiloLinks == null) {
			bufferSiloLinks = new EObjectContainmentEList<BufferSiloLink>(BufferSiloLink.class, this, CitriquePackage.PLANT__BUFFER_SILO_LINKS);
		}
		return bufferSiloLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkSiloReactor> getSiloReactorLinks() {
		if (siloReactorLinks == null) {
			siloReactorLinks = new EObjectContainmentEList<LinkSiloReactor>(LinkSiloReactor.class, this, CitriquePackage.PLANT__SILO_REACTOR_LINKS);
		}
		return siloReactorLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantObject> getPlantObjects() {
		if (plantObjects == null) {
			plantObjects = new EObjectResolvingEList<PlantObject>(PlantObject.class, this, CitriquePackage.PLANT__PLANT_OBJECTS);
		}
		return plantObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RefreshNodes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void RefreshLinks() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CitriquePackage.PLANT__BUFFERS:
				return ((InternalEList<?>)getBuffers()).basicRemove(otherEnd, msgs);
			case CitriquePackage.PLANT__SILOS:
				return ((InternalEList<?>)getSilos()).basicRemove(otherEnd, msgs);
			case CitriquePackage.PLANT__REACTORS:
				return ((InternalEList<?>)getReactors()).basicRemove(otherEnd, msgs);
			case CitriquePackage.PLANT__BUFFER_SILO_LINKS:
				return ((InternalEList<?>)getBufferSiloLinks()).basicRemove(otherEnd, msgs);
			case CitriquePackage.PLANT__SILO_REACTOR_LINKS:
				return ((InternalEList<?>)getSiloReactorLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CitriquePackage.PLANT__BUFFERS:
				return getBuffers();
			case CitriquePackage.PLANT__SILOS:
				return getSilos();
			case CitriquePackage.PLANT__REACTORS:
				return getReactors();
			case CitriquePackage.PLANT__NODES:
				return getNodes();
			case CitriquePackage.PLANT__LINKS:
				return getLinks();
			case CitriquePackage.PLANT__BUFFER_SILO_LINKS:
				return getBufferSiloLinks();
			case CitriquePackage.PLANT__SILO_REACTOR_LINKS:
				return getSiloReactorLinks();
			case CitriquePackage.PLANT__PLANT_OBJECTS:
				return getPlantObjects();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CitriquePackage.PLANT__BUFFERS:
				getBuffers().clear();
				getBuffers().addAll((Collection<? extends Buffer>)newValue);
				return;
			case CitriquePackage.PLANT__SILOS:
				getSilos().clear();
				getSilos().addAll((Collection<? extends Silo>)newValue);
				return;
			case CitriquePackage.PLANT__REACTORS:
				getReactors().clear();
				getReactors().addAll((Collection<? extends Reactor>)newValue);
				return;
			case CitriquePackage.PLANT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends PlantNode>)newValue);
				return;
			case CitriquePackage.PLANT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends PlantLink>)newValue);
				return;
			case CitriquePackage.PLANT__BUFFER_SILO_LINKS:
				getBufferSiloLinks().clear();
				getBufferSiloLinks().addAll((Collection<? extends BufferSiloLink>)newValue);
				return;
			case CitriquePackage.PLANT__SILO_REACTOR_LINKS:
				getSiloReactorLinks().clear();
				getSiloReactorLinks().addAll((Collection<? extends LinkSiloReactor>)newValue);
				return;
			case CitriquePackage.PLANT__PLANT_OBJECTS:
				getPlantObjects().clear();
				getPlantObjects().addAll((Collection<? extends PlantObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CitriquePackage.PLANT__BUFFERS:
				getBuffers().clear();
				return;
			case CitriquePackage.PLANT__SILOS:
				getSilos().clear();
				return;
			case CitriquePackage.PLANT__REACTORS:
				getReactors().clear();
				return;
			case CitriquePackage.PLANT__NODES:
				getNodes().clear();
				return;
			case CitriquePackage.PLANT__LINKS:
				getLinks().clear();
				return;
			case CitriquePackage.PLANT__BUFFER_SILO_LINKS:
				getBufferSiloLinks().clear();
				return;
			case CitriquePackage.PLANT__SILO_REACTOR_LINKS:
				getSiloReactorLinks().clear();
				return;
			case CitriquePackage.PLANT__PLANT_OBJECTS:
				getPlantObjects().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CitriquePackage.PLANT__BUFFERS:
				return buffers != null && !buffers.isEmpty();
			case CitriquePackage.PLANT__SILOS:
				return silos != null && !silos.isEmpty();
			case CitriquePackage.PLANT__REACTORS:
				return reactors != null && !reactors.isEmpty();
			case CitriquePackage.PLANT__NODES:
				return nodes != null && !nodes.isEmpty();
			case CitriquePackage.PLANT__LINKS:
				return links != null && !links.isEmpty();
			case CitriquePackage.PLANT__BUFFER_SILO_LINKS:
				return bufferSiloLinks != null && !bufferSiloLinks.isEmpty();
			case CitriquePackage.PLANT__SILO_REACTOR_LINKS:
				return siloReactorLinks != null && !siloReactorLinks.isEmpty();
			case CitriquePackage.PLANT__PLANT_OBJECTS:
				return plantObjects != null && !plantObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CitriquePackage.PLANT___REFRESH_NODES:
				RefreshNodes();
				return null;
			case CitriquePackage.PLANT___REFRESH_LINKS:
				RefreshLinks();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PlantImpl
