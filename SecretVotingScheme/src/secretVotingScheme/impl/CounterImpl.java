/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import secretVotingScheme.AnonymousChannel;
import secretVotingScheme.Ballot;
import secretVotingScheme.Counter;
import secretVotingScheme.SecretVotingSchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.CounterImpl#getBallotsList <em>Ballots List</em>}</li>
 *   <li>{@link secretVotingScheme.impl.CounterImpl#getResults <em>Results</em>}</li>
 *   <li>{@link secretVotingScheme.impl.CounterImpl#getAnonymouschannel <em>Anonymouschannel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CounterImpl extends MessageListenerImpl implements Counter {
	/**
	 * The cached value of the '{@link #getBallotsList() <em>Ballots List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBallotsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Ballot> ballotsList;

	/**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
	protected Map results;

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
	protected CounterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.COUNTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Ballot> getBallotsList() {
		if (ballotsList == null) {
			ballotsList = new EObjectResolvingEList<Ballot>(Ballot.class, this, SecretVotingSchemePackage.COUNTER__BALLOTS_LIST);
		}
		return ballotsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Map getResults() {
		return results;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResults(Map newResults) {
		Map oldResults = results;
		results = newResults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.COUNTER__RESULTS, oldResults, results));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL, oldAnonymouschannel, anonymouschannel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL, oldAnonymouschannel, anonymouschannel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void collectBallots() {
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
	public void publishBallotsList() {
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
	public void openVotes() {
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
	public void countVotes() {
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
	public void announceResults() {
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
			case SecretVotingSchemePackage.COUNTER__BALLOTS_LIST:
				return getBallotsList();
			case SecretVotingSchemePackage.COUNTER__RESULTS:
				return getResults();
			case SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SecretVotingSchemePackage.COUNTER__BALLOTS_LIST:
				getBallotsList().clear();
				getBallotsList().addAll((Collection<? extends Ballot>)newValue);
				return;
			case SecretVotingSchemePackage.COUNTER__RESULTS:
				setResults((Map)newValue);
				return;
			case SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL:
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
			case SecretVotingSchemePackage.COUNTER__BALLOTS_LIST:
				getBallotsList().clear();
				return;
			case SecretVotingSchemePackage.COUNTER__RESULTS:
				setResults((Map)null);
				return;
			case SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL:
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
			case SecretVotingSchemePackage.COUNTER__BALLOTS_LIST:
				return ballotsList != null && !ballotsList.isEmpty();
			case SecretVotingSchemePackage.COUNTER__RESULTS:
				return results != null;
			case SecretVotingSchemePackage.COUNTER__ANONYMOUSCHANNEL:
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
			case SecretVotingSchemePackage.COUNTER___COLLECT_BALLOTS:
				collectBallots();
				return null;
			case SecretVotingSchemePackage.COUNTER___PUBLISH_BALLOTS_LIST:
				publishBallotsList();
				return null;
			case SecretVotingSchemePackage.COUNTER___OPEN_VOTES:
				openVotes();
				return null;
			case SecretVotingSchemePackage.COUNTER___COUNT_VOTES:
				countVotes();
				return null;
			case SecretVotingSchemePackage.COUNTER___ANNOUNCE_RESULTS:
				announceResults();
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
		result.append(" (results: ");
		result.append(results);
		result.append(')');
		return result.toString();
	}

} //CounterImpl
