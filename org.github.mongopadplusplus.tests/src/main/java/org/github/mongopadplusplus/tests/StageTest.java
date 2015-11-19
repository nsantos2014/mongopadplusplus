/**
 */
package org.github.mongopadplusplus.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.github.mongopadplusplus.MongoPadPPFactory;
import org.github.mongopadplusplus.Stage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StageTest extends TestCase {

	/**
	 * The fixture for this Stage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StageTest.class);
	}

	/**
	 * Constructs a new Stage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Stage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Stage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Stage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stage getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MongoPadPPFactory.eINSTANCE.createStage());
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

} //StageTest
