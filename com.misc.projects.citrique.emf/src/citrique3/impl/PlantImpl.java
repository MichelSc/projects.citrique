/**
 */
package citrique3.impl;

import citrique3.Buffer;
import citrique3.BufferSiloLink;
import citrique3.Citrique3Package;
import citrique3.CitriqueObject;
import citrique3.Plant;
import citrique3.PlantLink;
import citrique3.PlantNode;
import citrique3.PlantObject;
import citrique3.Reactor;
import citrique3.Silo;
import citrique3.SiloReactorLink;
import citrique3.calc.PlantCalcChildren;
import citrique3.calc.PlantCalcLinks;
import citrique3.calc.PlantCalcNodes;
import citrique3.calc.PlantCalcObjects;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.misc.common.moplaf.propagator.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link citrique3.impl.PlantImpl#getBuffer <em>Buffer</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getSilo <em>Silo</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getReactor <em>Reactor</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getNode <em>Node</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getLink <em>Link</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getBufferSiloLink <em>Buffer Silo Link</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getSiloReactorLink <em>Silo Reactor Link</em>}</li>
 *   <li>{@link citrique3.impl.PlantImpl#getPlantObject <em>Plant Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlantImpl extends CitriqueObjectImpl implements Plant {
	/**
	 * The cached value of the '{@link #getBuffer() <em>Buffer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuffer()
	 * @generated
	 * @ordered
	 */
	protected EList<Buffer> buffer;

	/**
	 * The cached value of the '{@link #getSilo() <em>Silo</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilo()
	 * @generated
	 * @ordered
	 */
	protected EList<Silo> silo;

	/**
	 * The cached value of the '{@link #getReactor() <em>Reactor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactor()
	 * @generated
	 * @ordered
	 */
	protected EList<Reactor> reactor;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantNode> node;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantLink> link;

	/**
	 * The cached value of the '{@link #getBufferSiloLink() <em>Buffer Silo Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferSiloLink()
	 * @generated
	 * @ordered
	 */
	protected EList<BufferSiloLink> bufferSiloLink;

	/**
	 * The cached value of the '{@link #getSiloReactorLink() <em>Silo Reactor Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSiloReactorLink()
	 * @generated
	 * @ordered
	 */
	protected EList<SiloReactorLink> siloReactorLink;

	/**
	 * The cached value of the '{@link #getPlantObject() <em>Plant Object</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlantObject()
	 * @generated
	 * @ordered
	 */
	protected EList<PlantObject> plantObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlantImpl() {
		super();
	}
	
	public void addPropagatorFunctionAdapter() {
		Util.adapt(this, PlantCalcChildren.class );
		Util.adapt(this, PlantCalcNodes.class );
		Util.adapt(this, PlantCalcLinks.class );
		Util.adapt(this, PlantCalcObjects.class );
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Citrique3Package.Literals.PLANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Buffer> getBuffer() {
		if (buffer == null) {
			buffer = new EObjectContainmentEList<Buffer>(Buffer.class, this, Citrique3Package.PLANT__BUFFER);
		}
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Silo> getSilo() {
		if (silo == null) {
			silo = new EObjectContainmentEList<Silo>(Silo.class, this, Citrique3Package.PLANT__SILO);
		}
		return silo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reactor> getReactor() {
		if (reactor == null) {
			reactor = new EObjectContainmentEList<Reactor>(Reactor.class, this, Citrique3Package.PLANT__REACTOR);
		}
		return reactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantNode> getNode() {
		if (node == null) {
			node = new EObjectResolvingEList<PlantNode>(PlantNode.class, this, Citrique3Package.PLANT__NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantLink> getLink() {
		if (link == null) {
			link = new EObjectResolvingEList<PlantLink>(PlantLink.class, this, Citrique3Package.PLANT__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BufferSiloLink> getBufferSiloLink() {
		if (bufferSiloLink == null) {
			bufferSiloLink = new EObjectContainmentEList<BufferSiloLink>(BufferSiloLink.class, this, Citrique3Package.PLANT__BUFFER_SILO_LINK);
		}
		return bufferSiloLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SiloReactorLink> getSiloReactorLink() {
		if (siloReactorLink == null) {
			siloReactorLink = new EObjectContainmentEList<SiloReactorLink>(SiloReactorLink.class, this, Citrique3Package.PLANT__SILO_REACTOR_LINK);
		}
		return siloReactorLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlantObject> getPlantObject() {
		if (plantObject == null) {
			plantObject = new EObjectWithInverseResolvingEList<PlantObject>(PlantObject.class, this, Citrique3Package.PLANT__PLANT_OBJECT, Citrique3Package.PLANT_OBJECT__PLANT);
		}
		return plantObject;
	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Citrique3Package.PLANT__PLANT_OBJECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlantObject()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Citrique3Package.PLANT__BUFFER:
				return ((InternalEList<?>)getBuffer()).basicRemove(otherEnd, msgs);
			case Citrique3Package.PLANT__SILO:
				return ((InternalEList<?>)getSilo()).basicRemove(otherEnd, msgs);
			case Citrique3Package.PLANT__REACTOR:
				return ((InternalEList<?>)getReactor()).basicRemove(otherEnd, msgs);
			case Citrique3Package.PLANT__BUFFER_SILO_LINK:
				return ((InternalEList<?>)getBufferSiloLink()).basicRemove(otherEnd, msgs);
			case Citrique3Package.PLANT__SILO_REACTOR_LINK:
				return ((InternalEList<?>)getSiloReactorLink()).basicRemove(otherEnd, msgs);
			case Citrique3Package.PLANT__PLANT_OBJECT:
				return ((InternalEList<?>)getPlantObject()).basicRemove(otherEnd, msgs);
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
			case Citrique3Package.PLANT__BUFFER:
				return getBuffer();
			case Citrique3Package.PLANT__SILO:
				return getSilo();
			case Citrique3Package.PLANT__REACTOR:
				return getReactor();
			case Citrique3Package.PLANT__NODE:
				return getNode();
			case Citrique3Package.PLANT__LINK:
				return getLink();
			case Citrique3Package.PLANT__BUFFER_SILO_LINK:
				return getBufferSiloLink();
			case Citrique3Package.PLANT__SILO_REACTOR_LINK:
				return getSiloReactorLink();
			case Citrique3Package.PLANT__PLANT_OBJECT:
				return getPlantObject();
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
			case Citrique3Package.PLANT__BUFFER:
				getBuffer().clear();
				getBuffer().addAll((Collection<? extends Buffer>)newValue);
				return;
			case Citrique3Package.PLANT__SILO:
				getSilo().clear();
				getSilo().addAll((Collection<? extends Silo>)newValue);
				return;
			case Citrique3Package.PLANT__REACTOR:
				getReactor().clear();
				getReactor().addAll((Collection<? extends Reactor>)newValue);
				return;
			case Citrique3Package.PLANT__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends PlantNode>)newValue);
				return;
			case Citrique3Package.PLANT__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends PlantLink>)newValue);
				return;
			case Citrique3Package.PLANT__BUFFER_SILO_LINK:
				getBufferSiloLink().clear();
				getBufferSiloLink().addAll((Collection<? extends BufferSiloLink>)newValue);
				return;
			case Citrique3Package.PLANT__SILO_REACTOR_LINK:
				getSiloReactorLink().clear();
				getSiloReactorLink().addAll((Collection<? extends SiloReactorLink>)newValue);
				return;
			case Citrique3Package.PLANT__PLANT_OBJECT:
				getPlantObject().clear();
				getPlantObject().addAll((Collection<? extends PlantObject>)newValue);
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
			case Citrique3Package.PLANT__BUFFER:
				getBuffer().clear();
				return;
			case Citrique3Package.PLANT__SILO:
				getSilo().clear();
				return;
			case Citrique3Package.PLANT__REACTOR:
				getReactor().clear();
				return;
			case Citrique3Package.PLANT__NODE:
				getNode().clear();
				return;
			case Citrique3Package.PLANT__LINK:
				getLink().clear();
				return;
			case Citrique3Package.PLANT__BUFFER_SILO_LINK:
				getBufferSiloLink().clear();
				return;
			case Citrique3Package.PLANT__SILO_REACTOR_LINK:
				getSiloReactorLink().clear();
				return;
			case Citrique3Package.PLANT__PLANT_OBJECT:
				getPlantObject().clear();
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
			case Citrique3Package.PLANT__BUFFER:
				return buffer != null && !buffer.isEmpty();
			case Citrique3Package.PLANT__SILO:
				return silo != null && !silo.isEmpty();
			case Citrique3Package.PLANT__REACTOR:
				return reactor != null && !reactor.isEmpty();
			case Citrique3Package.PLANT__NODE:
				return node != null && !node.isEmpty();
			case Citrique3Package.PLANT__LINK:
				return link != null && !link.isEmpty();
			case Citrique3Package.PLANT__BUFFER_SILO_LINK:
				return bufferSiloLink != null && !bufferSiloLink.isEmpty();
			case Citrique3Package.PLANT__SILO_REACTOR_LINK:
				return siloReactorLink != null && !siloReactorLink.isEmpty();
			case Citrique3Package.PLANT__PLANT_OBJECT:
				return plantObject != null && !plantObject.isEmpty();
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
			case Citrique3Package.PLANT___REFRESH_NODES:
				refreshNodes();
				return null;
			case Citrique3Package.PLANT___REFRESH_LINKS:
				refreshLinks();
				return null;
			case Citrique3Package.PLANT___REFRESH_OBJECTS:
				refreshObjects();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshNodes() {
		HashSet<PlantNode> nodestobe = new HashSet<PlantNode>();
		nodestobe.addAll(this.getBuffer());
		nodestobe.addAll(this.getSilo());
		nodestobe.addAll(this.getReactor());

		HashSet<PlantNode> nodesasis = new HashSet<PlantNode>(this.getNode());
		
		HashSet<PlantNode> nodestoadd = new HashSet<PlantNode>(nodestobe); 
		nodestoadd.removeAll(nodesasis);
		
		HashSet<PlantNode> nodestoremove = new HashSet<PlantNode>(nodesasis); 
		nodestoremove.removeAll(nodestobe);
		
		this.getNode().addAll(nodestoadd);
		this.getNode().removeAll(nodestoremove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshLinks() {
		HashSet<PlantLink> linkstobe = new HashSet<PlantLink>();
		linkstobe.addAll(this.getBufferSiloLink());
		linkstobe.addAll(this.getSiloReactorLink());

		HashSet<PlantLink> linksasis = new HashSet<PlantLink>(this.getLink());
		
		HashSet<PlantLink> linkstoadd = new HashSet<PlantLink>(linkstobe); 
		linkstoadd.removeAll(linksasis);
		
		HashSet<PlantLink> linkstoremove = new HashSet<PlantLink>(linksasis); 
		linkstoremove.removeAll(linkstobe);
		
		this.getLink().addAll(linkstoadd);
		this.getLink().removeAll(linkstoremove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	public void refreshObjects() {
		HashSet<PlantObject> objectstobe = new HashSet<PlantObject>();
		objectstobe.addAll(this.getNode());
		objectstobe.addAll(this.getLink());

		HashSet<PlantObject> objectsasis = new HashSet<PlantObject>(this.getPlantObject());
		
		HashSet<PlantObject> objectstoadd = new HashSet<PlantObject>(objectstobe); 
		objectstoadd.removeAll(objectsasis);
		
		HashSet<PlantObject> objectstoremove = new HashSet<PlantObject>(objectsasis); 
		objectstoremove.removeAll(objectstobe);
		
		this.getPlantObject().addAll(objectstoadd);
		this.getPlantObject().removeAll(objectstoremove);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 */
	@Override
	public void refreshChildren() {
		HashSet<CitriqueObject> objectstobe = new HashSet<CitriqueObject>();
		objectstobe.addAll(this.getPlantObject());

		HashSet<CitriqueObject> objectsasis = new HashSet<CitriqueObject>(this.getChild());
		
		HashSet<CitriqueObject> objectstoadd = new HashSet<CitriqueObject>(objectstobe); 
		objectstoadd.removeAll(objectsasis);
		
		HashSet<CitriqueObject> objectstoremove = new HashSet<CitriqueObject>(objectsasis); 
		objectstoremove.removeAll(objectstobe);
		
		this.getChild().addAll(objectstoadd);
		this.getChild().removeAll(objectstoremove);
	}


	@Override
	public void refreshShortType() {
		String type = "PL";
		this.setShortType(type);
	}
} //PlantImpl
