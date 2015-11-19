/**
 */
package org.github.mongopadplusplus.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.github.mongopadplusplus.Connection;
import org.github.mongopadplusplus.CurrentState;
import org.github.mongopadplusplus.MongoPadPPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.github.mongopadplusplus.impl.CurrentStateImpl#getCurrentConnection <em>Current Connection</em>}</li>
 *   <li>{@link org.github.mongopadplusplus.impl.CurrentStateImpl#isConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentStateImpl extends MinimalEObjectImpl.Container implements CurrentState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MongoPadPPPackage.Literals.CURRENT_STATE;
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
	public Connection getCurrentConnection() {
		return (Connection)eGet(MongoPadPPPackage.Literals.CURRENT_STATE__CURRENT_CONNECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentConnection(Connection newCurrentConnection) {
		eSet(MongoPadPPPackage.Literals.CURRENT_STATE__CURRENT_CONNECTION, newCurrentConnection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnected() {
		return (Boolean)eGet(MongoPadPPPackage.Literals.CURRENT_STATE__CONNECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnected(boolean newConnected) {
		eSet(MongoPadPPPackage.Literals.CURRENT_STATE__CONNECTED, newConnected);
	}

} //CurrentStateImpl
