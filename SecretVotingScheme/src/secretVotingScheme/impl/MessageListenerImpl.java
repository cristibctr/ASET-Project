/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secretVotingScheme.MessageListener;
import secretVotingScheme.SecretVotingSchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MessageListenerImpl extends MinimalEObjectImpl.Container implements MessageListener {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageListenerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.MESSAGE_LISTENER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecretVotingSchemePackage.MESSAGE_LISTENER___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MessageListenerImpl
