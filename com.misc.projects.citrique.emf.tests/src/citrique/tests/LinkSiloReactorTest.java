/**
 */
package citrique.tests;

import citrique.CitriqueFactory;
import citrique.LinkSiloReactor;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Link Silo Reactor</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkSiloReactorTest extends PlantLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LinkSiloReactorTest.class);
	}

	/**
	 * Constructs a new Link Silo Reactor test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkSiloReactorTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Link Silo Reactor test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LinkSiloReactor getFixture() {
		return (LinkSiloReactor)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CitriqueFactory.eINSTANCE.createLinkSiloReactor());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //LinkSiloReactorTest
