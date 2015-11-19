/**
 */
package org.github.mongopadplusplus;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.github.mongopadplusplus.MongoPadPPPackage
 * @generated
 */
public interface MongoPadPPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongoPadPPFactory eINSTANCE = org.github.mongopadplusplus.impl.MongoPadPPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connection</em>'.
	 * @generated
	 */
	Connection createConnection();

	/**
	 * Returns a new object of class '<em>Stage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stage</em>'.
	 * @generated
	 */
	Stage createStage();

	/**
	 * Returns a new object of class '<em>Current State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Current State</em>'.
	 * @generated
	 */
	CurrentState createCurrentState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MongoPadPPPackage getMongoPadPPPackage();

} //MongoPadPPFactory
