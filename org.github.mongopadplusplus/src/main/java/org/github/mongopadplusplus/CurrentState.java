/**
 */
package org.github.mongopadplusplus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.CurrentState#getCurrentConnection <em>Current Connection</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.CurrentState#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see org.github.mongopadplusplus.MongoPadPPPackage#getCurrentState()
 * @model
 * @generated
 */
public interface CurrentState extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Connection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Connection</em>' reference.
	 * @see #setCurrentConnection(Connection)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getCurrentState_CurrentConnection()
	 * @model required="true"
	 * @generated
	 */
	Connection getCurrentConnection();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.CurrentState#getCurrentConnection <em>Current Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Connection</em>' reference.
	 * @see #getCurrentConnection()
	 * @generated
	 */
	void setCurrentConnection(Connection value);

	/**
	 * Returns the value of the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected</em>' attribute.
	 * @see #setConnected(boolean)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getCurrentState_Connected()
	 * @model required="true"
	 * @generated
	 */
	boolean isConnected();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.CurrentState#isConnected <em>Connected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected</em>' attribute.
	 * @see #isConnected()
	 * @generated
	 */
	void setConnected(boolean value);

} // CurrentState
