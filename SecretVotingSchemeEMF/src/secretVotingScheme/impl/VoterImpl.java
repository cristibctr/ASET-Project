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

import secretVotingScheme.AnonymousChannel;
import secretVotingScheme.Ballot;
import secretVotingScheme.SecretVotingSchemePackage;
import secretVotingScheme.Voter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Voter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.VoterImpl#getID <em>ID</em>}</li>
 *   <li>{@link secretVotingScheme.impl.VoterImpl#getVote <em>Vote</em>}</li>
 *   <li>{@link secretVotingScheme.impl.VoterImpl#getKey <em>Key</em>}</li>
 *   <li>{@link secretVotingScheme.impl.VoterImpl#getBallot <em>Ballot</em>}</li>
 *   <li>{@link secretVotingScheme.impl.VoterImpl#getAnonymouschannel <em>Anonymouschannel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VoterImpl extends MessageListenerImpl implements Voter {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVote()
	 * @generated
	 * @ordered
	 */
	protected static final String VOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVote() <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVote()
	 * @generated
	 * @ordered
	 */
	protected String vote = VOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBallot() <em>Ballot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallot()
	 * @generated
	 * @ordered
	 */
	protected Ballot ballot;

	/**
	 * The cached value of the '{@link #getAnonymouschannel() <em>Anonymouschannel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnonymouschannel()
	 * @generated
	 * @ordered
	 */
	protected AnonymousChannel anonymouschannel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VoterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.VOTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVote() {
		return vote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVote(String newVote) {
		String oldVote = vote;
		vote = newVote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__VOTE, oldVote, vote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ballot getBallot() {
		return ballot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBallot(Ballot newBallot, NotificationChain msgs) {
		Ballot oldBallot = ballot;
		ballot = newBallot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__BALLOT, oldBallot, newBallot);
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
	public void setBallot(Ballot newBallot) {
		if (newBallot != ballot) {
			NotificationChain msgs = null;
			if (ballot != null)
				msgs = ((InternalEObject)ballot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SecretVotingSchemePackage.VOTER__BALLOT, null, msgs);
			if (newBallot != null)
				msgs = ((InternalEObject)newBallot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SecretVotingSchemePackage.VOTER__BALLOT, null, msgs);
			msgs = basicSetBallot(newBallot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__BALLOT, newBallot, newBallot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousChannel getAnonymouschannel() {
		if (anonymouschannel != null && anonymouschannel.eIsProxy()) {
			InternalEObject oldAnonymouschannel = (InternalEObject)anonymouschannel;
			anonymouschannel = (AnonymousChannel)eResolveProxy(oldAnonymouschannel);
			if (anonymouschannel != oldAnonymouschannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL, oldAnonymouschannel, anonymouschannel));
			}
		}
		return anonymouschannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousChannel basicGetAnonymouschannel() {
		return anonymouschannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnonymouschannel(AnonymousChannel newAnonymouschannel) {
		AnonymousChannel oldAnonymouschannel = anonymouschannel;
		anonymouschannel = newAnonymouschannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL, oldAnonymouschannel, anonymouschannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fillBallot() {
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
	public void sendBallotToAdmin() {
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
	public void sendVoteToCounter() {
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
	public void openVote() {
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
			case SecretVotingSchemePackage.VOTER__BALLOT:
				return basicSetBallot(null, msgs);
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
			case SecretVotingSchemePackage.VOTER__ID:
				return getID();
			case SecretVotingSchemePackage.VOTER__VOTE:
				return getVote();
			case SecretVotingSchemePackage.VOTER__KEY:
				return getKey();
			case SecretVotingSchemePackage.VOTER__BALLOT:
				return getBallot();
			case SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL:
				if (resolve) return getAnonymouschannel();
				return basicGetAnonymouschannel();
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
			case SecretVotingSchemePackage.VOTER__ID:
				setID((String)newValue);
				return;
			case SecretVotingSchemePackage.VOTER__VOTE:
				setVote((String)newValue);
				return;
			case SecretVotingSchemePackage.VOTER__KEY:
				setKey((String)newValue);
				return;
			case SecretVotingSchemePackage.VOTER__BALLOT:
				setBallot((Ballot)newValue);
				return;
			case SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL:
				setAnonymouschannel((AnonymousChannel)newValue);
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
			case SecretVotingSchemePackage.VOTER__ID:
				setID(ID_EDEFAULT);
				return;
			case SecretVotingSchemePackage.VOTER__VOTE:
				setVote(VOTE_EDEFAULT);
				return;
			case SecretVotingSchemePackage.VOTER__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case SecretVotingSchemePackage.VOTER__BALLOT:
				setBallot((Ballot)null);
				return;
			case SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL:
				setAnonymouschannel((AnonymousChannel)null);
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
			case SecretVotingSchemePackage.VOTER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case SecretVotingSchemePackage.VOTER__VOTE:
				return VOTE_EDEFAULT == null ? vote != null : !VOTE_EDEFAULT.equals(vote);
			case SecretVotingSchemePackage.VOTER__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case SecretVotingSchemePackage.VOTER__BALLOT:
				return ballot != null;
			case SecretVotingSchemePackage.VOTER__ANONYMOUSCHANNEL:
				return anonymouschannel != null;
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
			case SecretVotingSchemePackage.VOTER___FILL_BALLOT:
				fillBallot();
				return null;
			case SecretVotingSchemePackage.VOTER___SEND_BALLOT_TO_ADMIN:
				sendBallotToAdmin();
				return null;
			case SecretVotingSchemePackage.VOTER___SEND_VOTE_TO_COUNTER:
				sendVoteToCounter();
				return null;
			case SecretVotingSchemePackage.VOTER___OPEN_VOTE:
				openVote();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", vote: ");
		result.append(vote);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //VoterImpl
