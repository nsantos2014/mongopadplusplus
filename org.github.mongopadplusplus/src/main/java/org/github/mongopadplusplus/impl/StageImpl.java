/**
 */
package org.github.mongopadplusplus.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.github.mongopadplusplus.Connection;
import org.github.mongopadplusplus.CurrentState;
import org.github.mongopadplusplus.MongoPadPPPackage;
import org.github.mongopadplusplus.Stage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.impl.StageImpl#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.impl.StageImpl#getCurrentstate <em>Currentstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StageImpl extends MinimalEObjectImpl.Container implements Stage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongoPadPPPackage.Literals.STAGE;
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
	@SuppressWarnings("unchecked")
	public EList<Connection> getConnections() {
		return (EList<Connection>)eGet(MongoPadPPPackage.Literals.STAGE__CONNECTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentState getCurrentstate() {
		return (CurrentState)eGet(MongoPadPPPackage.Literals.STAGE__CURRENTSTATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentstate(CurrentState newCurrentstate) {
		eSet(MongoPadPPPackage.Literals.STAGE__CURRENTSTATE, newCurrentstate);
	}

} //StageImpl
