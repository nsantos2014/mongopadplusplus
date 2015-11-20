/**
 */
package org.github.mongopadplusplus;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.Connection#getName <em>Name</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.Connection#getAddress <em>Address</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.Connection#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.github.mongopadplusplus.MongoPadPPPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getConnection_Name()
	 * @model default="Localhost" id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.Connection#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getConnection_Address()
	 * @model default="localhost"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.Connection#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"27017"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getConnection_Port()
	 * @model default="27017"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.Connection#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // Connection
