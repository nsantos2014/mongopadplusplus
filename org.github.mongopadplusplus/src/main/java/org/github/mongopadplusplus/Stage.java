/**
 */
package org.github.mongopadplusplus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.Stage#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.Stage#getCurrentstate <em>Currentstate</em>}</li>
 * </ul>
 *
 * @see org.github.mongopadplusplus.MongoPadPPPackage#getStage()
 * @model
 * @generated
 */
public interface Stage extends EObject {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.github.mongopadplusplus.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getStage_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

	/**
	 * Returns the value of the '<em><b>Currentstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Currentstate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Currentstate</em>' containment reference.
	 * @see #setCurrentstate(CurrentState)
	 * @see org.github.mongopadplusplus.MongoPadPPPackage#getStage_Currentstate()
	 * @model containment="true"
	 * @generated
	 */
	CurrentState getCurrentstate();

	/**
	 * Sets the value of the '{@link org.github.mongopadplusplus.Stage#getCurrentstate <em>Currentstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Currentstate</em>' containment reference.
	 * @see #getCurrentstate()
	 * @generated
	 */
	void setCurrentstate(CurrentState value);

} // Stage
