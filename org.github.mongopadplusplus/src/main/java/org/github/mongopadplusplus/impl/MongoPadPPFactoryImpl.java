/**
 */
package org.github.mongopadplusplus.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.github.mongopadplusplus.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MongoPadPPFactoryImpl extends EFactoryImpl implements MongoPadPPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MongoPadPPFactory init() {
		try {
			MongoPadPPFactory theMongoPadPPFactory = (MongoPadPPFactory)EPackage.Registry.INSTANCE.getEFactory(MongoPadPPPackage.eNS_URI);
			if (theMongoPadPPFactory != null) {
				return theMongoPadPPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MongoPadPPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoPadPPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MongoPadPPPackage.CONNECTION: return createConnection();
			case MongoPadPPPackage.STAGE: return createStage();
			case MongoPadPPPackage.CURRENT_STATE: return createCurrentState();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stage createStage() {
		StageImpl stage = new StageImpl();
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CurrentState createCurrentState() {
		CurrentStateImpl currentState = new CurrentStateImpl();
		return currentState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MongoPadPPPackage getMongoPadPPPackage() {
		return (MongoPadPPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MongoPadPPPackage getPackage() {
		return MongoPadPPPackage.eINSTANCE;
	}

} //MongoPadPPFactoryImpl
