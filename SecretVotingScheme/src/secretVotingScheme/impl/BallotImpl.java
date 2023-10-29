/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secretVotingScheme.Ballot;
import secretVotingScheme.CryptoFacade;
import secretVotingScheme.SecretVotingSchemePackage;
import secretVotingScheme.Signature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ballot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.BallotImpl#getEncryptedVote <em>Encrypted Vote</em>}</li>
 *   <li>{@link secretVotingScheme.impl.BallotImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link secretVotingScheme.impl.BallotImpl#getCryptfacade <em>Cryptfacade</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BallotImpl extends MinimalEObjectImpl.Container implements Ballot {
	/**
	 * The default value of the '{@link #getEncryptedVote() <em>Encrypted Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedVote()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCRYPTED_VOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncryptedVote() <em>Encrypted Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncryptedVote()
	 * @generated
	 * @ordered
	 */
	protected String encryptedVote = ENCRYPTED_VOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected Signature signature;

	/**
	 * The cached value of the '{@link #getCryptfacade() <em>Cryptfacade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCryptfacade()
	 * @generated
	 * @ordered
	 */
	protected CryptoFacade cryptfacade;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BallotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.BALLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEncryptedVote() {
		return encryptedVote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEncryptedVote(String newEncryptedVote) {
		String oldEncryptedVote = encryptedVote;
		encryptedVote = newEncryptedVote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.BALLOT__ENCRYPTED_VOTE, oldEncryptedVote, encryptedVote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature getSignature() {
		if (signature != null && signature.eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject)signature;
			signature = (Signature)eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecretVotingSchemePackage.BALLOT__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignature(Signature newSignature) {
		Signature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.BALLOT__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoFacade getCryptfacade() {
		if (cryptfacade != null && cryptfacade.eIsProxy()) {
			InternalEObject oldCryptfacade = (InternalEObject)cryptfacade;
			cryptfacade = (CryptoFacade)eResolveProxy(oldCryptfacade);
			if (cryptfacade != oldCryptfacade) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecretVotingSchemePackage.BALLOT__CRYPTFACADE, oldCryptfacade, cryptfacade));
			}
		}
		return cryptfacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CryptoFacade basicGetCryptfacade() {
		return cryptfacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCryptfacade(CryptoFacade newCryptfacade) {
		CryptoFacade oldCryptfacade = cryptfacade;
		cryptfacade = newCryptfacade;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.BALLOT__CRYPTFACADE, oldCryptfacade, cryptfacade));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void encryptVote() {
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
	public void signBallot() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SecretVotingSchemePackage.BALLOT__ENCRYPTED_VOTE:
				return getEncryptedVote();
			case SecretVotingSchemePackage.BALLOT__SIGNATURE:
				if (resolve) return getSignature();
				return basicGetSignature();
			case SecretVotingSchemePackage.BALLOT__CRYPTFACADE:
				if (resolve) return getCryptfacade();
				return basicGetCryptfacade();
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
			case SecretVotingSchemePackage.BALLOT__ENCRYPTED_VOTE:
				setEncryptedVote((String)newValue);
				return;
			case SecretVotingSchemePackage.BALLOT__SIGNATURE:
				setSignature((Signature)newValue);
				return;
			case SecretVotingSchemePackage.BALLOT__CRYPTFACADE:
				setCryptfacade((CryptoFacade)newValue);
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
			case SecretVotingSchemePackage.BALLOT__ENCRYPTED_VOTE:
				setEncryptedVote(ENCRYPTED_VOTE_EDEFAULT);
				return;
			case SecretVotingSchemePackage.BALLOT__SIGNATURE:
				setSignature((Signature)null);
				return;
			case SecretVotingSchemePackage.BALLOT__CRYPTFACADE:
				setCryptfacade((CryptoFacade)null);
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
			case SecretVotingSchemePackage.BALLOT__ENCRYPTED_VOTE:
				return ENCRYPTED_VOTE_EDEFAULT == null ? encryptedVote != null : !ENCRYPTED_VOTE_EDEFAULT.equals(encryptedVote);
			case SecretVotingSchemePackage.BALLOT__SIGNATURE:
				return signature != null;
			case SecretVotingSchemePackage.BALLOT__CRYPTFACADE:
				return cryptfacade != null;
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
			case SecretVotingSchemePackage.BALLOT___ENCRYPT_VOTE:
				encryptVote();
				return null;
			case SecretVotingSchemePackage.BALLOT___SIGN_BALLOT:
				signBallot();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (encryptedVote: ");
		result.append(encryptedVote);
		result.append(')');
		return result.toString();
	}

} //BallotImpl
