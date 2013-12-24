/**
 */
package citrique.tests;

import citrique.BufferSiloLink;
import citrique.CitriqueFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Buffer Silo Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BufferSiloLinkTest extends PlantLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BufferSiloLinkTest.class);
	}

	/**
	 * Constructs a new Buffer Silo Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferSiloLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Buffer Silo Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BufferSiloLink getFixture() {
		return (BufferSiloLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CitriqueFactory.eINSTANCE.createBufferSiloLink());
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

} //BufferSiloLinkTest
