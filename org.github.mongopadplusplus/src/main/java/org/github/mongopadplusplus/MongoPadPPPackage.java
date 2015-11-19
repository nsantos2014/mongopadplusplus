/**
 */
package org.github.mongopadplusplus;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.github.mongopadplusplus.MongoPadPPFactory
 * @model kind="package"
 * @generated
 */
public interface MongoPadPPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mongopadplusplus";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://github.com/nsantos2014/mongopadplusplus";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mppp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MongoPadPPPackage eINSTANCE = org.github.mongopadplusplus.impl.MongoPadPPPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.github.mongopadplusplus.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.github.mongopadplusplus.impl.ConnectionImpl
	 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__ADDRESS = 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__PORT = 2;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.github.mongopadplusplus.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.github.mongopadplusplus.impl.StageImpl
	 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 1;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__CONNECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Currentstate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__CURRENTSTATE = 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.github.mongopadplusplus.impl.CurrentStateImpl <em>Current State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.github.mongopadplusplus.impl.CurrentStateImpl
	 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getCurrentState()
	 * @generated
	 */
	int CURRENT_STATE = 2;

	/**
	 * The feature id for the '<em><b>Current Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE__CURRENT_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Connected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE__CONNECTED = 1;

	/**
	 * The number of structural features of the '<em>Current State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Current State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CURRENT_STATE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.github.mongopadplusplus.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.github.mongopadplusplus.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.github.mongopadplusplus.Connection#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.github.mongopadplusplus.Connection#getName()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.github.mongopadplusplus.Connection#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see org.github.mongopadplusplus.Connection#getAddress()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Address();

	/**
	 * Returns the meta object for the attribute '{@link org.github.mongopadplusplus.Connection#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see org.github.mongopadplusplus.Connection#getPort()
	 * @see #getConnection()
	 * @generated
	 */
	EAttribute getConnection_Port();

	/**
	 * Returns the meta object for class '{@link org.github.mongopadplusplus.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see org.github.mongopadplusplus.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.github.mongopadplusplus.Stage#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.github.mongopadplusplus.Stage#getConnections()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Connections();

	/**
	 * Returns the meta object for the containment reference '{@link org.github.mongopadplusplus.Stage#getCurrentstate <em>Currentstate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Currentstate</em>'.
	 * @see org.github.mongopadplusplus.Stage#getCurrentstate()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Currentstate();

	/**
	 * Returns the meta object for class '{@link org.github.mongopadplusplus.CurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Current State</em>'.
	 * @see org.github.mongopadplusplus.CurrentState
	 * @generated
	 */
	EClass getCurrentState();

	/**
	 * Returns the meta object for the reference '{@link org.github.mongopadplusplus.CurrentState#getCurrentConnection <em>Current Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current Connection</em>'.
	 * @see org.github.mongopadplusplus.CurrentState#getCurrentConnection()
	 * @see #getCurrentState()
	 * @generated
	 */
	EReference getCurrentState_CurrentConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.github.mongopadplusplus.CurrentState#isConnected <em>Connected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connected</em>'.
	 * @see org.github.mongopadplusplus.CurrentState#isConnected()
	 * @see #getCurrentState()
	 * @generated
	 */
	EAttribute getCurrentState_Connected();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MongoPadPPFactory getMongoPadPPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.github.mongopadplusplus.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.github.mongopadplusplus.impl.ConnectionImpl
		 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__NAME = eINSTANCE.getConnection_Name();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__ADDRESS = eINSTANCE.getConnection_Address();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNECTION__PORT = eINSTANCE.getConnection_Port();

		/**
		 * The meta object literal for the '{@link org.github.mongopadplusplus.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.github.mongopadplusplus.impl.StageImpl
		 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__CONNECTIONS = eINSTANCE.getStage_Connections();

		/**
		 * The meta object literal for the '<em><b>Currentstate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__CURRENTSTATE = eINSTANCE.getStage_Currentstate();

		/**
		 * The meta object literal for the '{@link org.github.mongopadplusplus.impl.CurrentStateImpl <em>Current State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.github.mongopadplusplus.impl.CurrentStateImpl
		 * @see org.github.mongopadplusplus.impl.MongoPadPPPackageImpl#getCurrentState()
		 * @generated
		 */
		EClass CURRENT_STATE = eINSTANCE.getCurrentState();

		/**
		 * The meta object literal for the '<em><b>Current Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CURRENT_STATE__CURRENT_CONNECTION = eINSTANCE.getCurrentState_CurrentConnection();

		/**
		 * The meta object literal for the '<em><b>Connected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CURRENT_STATE__CONNECTED = eINSTANCE.getCurrentState_Connected();

	}

} //MongoPadPPPackage
