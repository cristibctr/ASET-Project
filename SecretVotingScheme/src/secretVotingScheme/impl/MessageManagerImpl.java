/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import secretVotingScheme.MessageListener;
import secretVotingScheme.MessageManager;
import secretVotingScheme.SecretVotingSchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.MessageManagerImpl#getMessagelistener <em>Messagelistener</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageManagerImpl extends MinimalEObjectImpl.Container implements MessageManager {
	/**
	 * The cached value of the '{@link #getMessagelistener() <em>Messagelistener</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagelistener()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageListener> messagelistener;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.MESSAGE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MessageListener> getMessagelistener() {
		if (messagelistener == null) {
			messagelistener = new EObjectContainmentEList<MessageListener>(MessageListener.class, this, SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER);
		}
		return messagelistener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void subscribe() {
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
	public void unsubscribe() {
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
	public void notifyMessage() {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER:
				return ((InternalEList<?>)getMessagelistener()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER:
				return getMessagelistener();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER:
				getMessagelistener().clear();
				getMessagelistener().addAll((Collection<? extends MessageListener>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER:
				getMessagelistener().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER__MESSAGELISTENER:
				return messagelistener != null && !messagelistener.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecretVotingSchemePackage.MESSAGE_MANAGER___SUBSCRIBE:
				subscribe();
				return null;
			case SecretVotingSchemePackage.MESSAGE_MANAGER___UNSUBSCRIBE:
				unsubscribe();
				return null;
			case SecretVotingSchemePackage.MESSAGE_MANAGER___NOTIFY_MESSAGE:
				notifyMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MessageManagerImpl
