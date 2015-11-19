/**
 */
package org.github.mongopadplusplus.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.github.mongopadplusplus.Connection;
import org.github.mongopadplusplus.MongoPadPPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.impl.ConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.impl.ConnectionImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.impl.ConnectionImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends MinimalEObjectImpl.Container implements Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongoPadPPPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(MongoPadPPPackage.Literals.CONNECTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(MongoPadPPPackage.Literals.CONNECTION__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return (String)eGet(MongoPadPPPackage.Literals.CONNECTION__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		eSet(MongoPadPPPackage.Literals.CONNECTION__ADDRESS, newAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return (Integer)eGet(MongoPadPPPackage.Literals.CONNECTION__PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		eSet(MongoPadPPPackage.Literals.CONNECTION__PORT, newPort);
	}

} //ConnectionImpl
