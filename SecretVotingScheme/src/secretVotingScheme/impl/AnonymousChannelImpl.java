/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secretVotingScheme.AnonymousChannel;
import secretVotingScheme.MessageManager;
import secretVotingScheme.SecretVotingSchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Anonymous Channel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.AnonymousChannelImpl#getMessagemanager <em>Messagemanager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnonymousChannelImpl extends MinimalEObjectImpl.Container implements AnonymousChannel {
	/**
	 * The cached value of the '{@link #getMessagemanager() <em>Messagemanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessagemanager()
	 * @generated
	 * @ordered
	 */
	protected MessageManager messagemanager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnonymousChannelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.ANONYMOUS_CHANNEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageManager getMessagemanager() {
		return messagemanager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagemanager(MessageManager newMessagemanager, NotificationChain msgs) {
		MessageManager oldMessagemanager = messagemanager;
		messagemanager = newMessagemanager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER, oldMessagemanager, newMessagemanager);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessagemanager(MessageManager newMessagemanager) {
		if (newMessagemanager != messagemanager) {
			NotificationChain msgs = null;
			if (messagemanager != null)
				msgs = ((InternalEObject)messagemanager).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER, null, msgs);
			if (newMessagemanager != null)
				msgs = ((InternalEObject)newMessagemanager).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER, null, msgs);
			msgs = basicSetMessagemanager(newMessagemanager, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER, newMessagemanager, newMessagemanager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void sendMessage() {
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
	public void receiveMessage() {
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
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER:
				return basicSetMessagemanager(null, msgs);
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
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER:
				return getMessagemanager();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER:
				setMessagemanager((MessageManager)newValue);
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
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER:
				setMessagemanager((MessageManager)null);
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
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL__MESSAGEMANAGER:
				return messagemanager != null;
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
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL___SEND_MESSAGE:
				sendMessage();
				return null;
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL___RECEIVE_MESSAGE:
				receiveMessage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AnonymousChannelImpl
