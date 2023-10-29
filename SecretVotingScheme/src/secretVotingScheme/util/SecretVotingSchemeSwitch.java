/**
 */
package secretVotingScheme.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import secretVotingScheme.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see secretVotingScheme.SecretVotingSchemePackage
 * @generated
 */
public class SecretVotingSchemeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SecretVotingSchemePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretVotingSchemeSwitch() {
		if (modelPackage == null) {
			modelPackage = SecretVotingSchemePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SecretVotingSchemePackage.VOTER: {
				Voter voter = (Voter)theEObject;
				T result = caseVoter(voter);
				if (result == null) result = caseMessageListener(voter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.ADMINISTRATOR: {
				Administrator administrator = (Administrator)theEObject;
				T result = caseAdministrator(administrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.COUNTER: {
				Counter counter = (Counter)theEObject;
				T result = caseCounter(counter);
				if (result == null) result = caseMessageListener(counter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.BALLOT: {
				Ballot ballot = (Ballot)theEObject;
				T result = caseBallot(ballot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.SIGNATURE: {
				Signature signature = (Signature)theEObject;
				T result = caseSignature(signature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL: {
				AnonymousChannel anonymousChannel = (AnonymousChannel)theEObject;
				T result = caseAnonymousChannel(anonymousChannel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.CRYPTO_FACADE: {
				CryptoFacade cryptoFacade = (CryptoFacade)theEObject;
				T result = caseCryptoFacade(cryptoFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.MESSAGE_MANAGER: {
				MessageManager messageManager = (MessageManager)theEObject;
				T result = caseMessageManager(messageManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SecretVotingSchemePackage.MESSAGE_LISTENER: {
				MessageListener messageListener = (MessageListener)theEObject;
				T result = caseMessageListener(messageListener);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Voter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Voter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVoter(Voter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrator(Administrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Counter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCounter(Counter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ballot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ballot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBallot(Ballot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignature(Signature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Channel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Channel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousChannel(AnonymousChannel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Crypto Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Crypto Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCryptoFacade(CryptoFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageManager(MessageManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Listener</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Listener</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageListener(MessageListener object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SecretVotingSchemeSwitch
