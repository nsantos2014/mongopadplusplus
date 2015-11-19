/**
 */
package org.github.mongopadplusplus.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.github.mongopadplusplus.CurrentState;
import org.github.mongopadplusplus.MongoPadPPFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Current State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CurrentStateTest extends TestCase {

	/**
	 * The fixture for this Current State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CurrentStateTest.class);
	}

	/**
	 * Constructs a new Current State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Current State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CurrentState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Current State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentState getFixture() {
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
		setFixture(MongoPadPPFactory.eINSTANCE.createCurrentState());
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

} //CurrentStateTest
