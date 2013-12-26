/**
 */
package citrique2.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>citrique2</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ctr2Tests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ctr2Tests("citrique2 Tests");
		suite.addTestSuite(CitriqueObjectTest.class);
		suite.addTestSuite(CitriqueDomainTest.class);
		suite.addTestSuite(PlantObjectTest.class);
		suite.addTestSuite(PlantTest.class);
		suite.addTestSuite(BufferTest.class);
		suite.addTestSuite(SiloTest.class);
		suite.addTestSuite(ReactorTest.class);
		suite.addTestSuite(PlantNodeTest.class);
		suite.addTestSuite(PlantLinkTest.class);
		suite.addTestSuite(BufferSiloLinkTest.class);
		suite.addTestSuite(SiloReactorLinkTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ctr2Tests(String name) {
		super(name);
	}

} //ctr2Tests
