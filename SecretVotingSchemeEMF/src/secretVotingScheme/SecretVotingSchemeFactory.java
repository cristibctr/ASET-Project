/**
 */
package secretVotingScheme;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see secretVotingScheme.SecretVotingSchemePackage
 * @generated
 */
public interface SecretVotingSchemeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecretVotingSchemeFactory eINSTANCE = secretVotingScheme.impl.SecretVotingSchemeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Voter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Voter</em>'.
	 * @generated
	 */
	Voter createVoter();

	/**
	 * Returns a new object of class '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrator</em>'.
	 * @generated
	 */
	Administrator createAdministrator();

	/**
	 * Returns a new object of class '<em>Counter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Counter</em>'.
	 * @generated
	 */
	Counter createCounter();

	/**
	 * Returns a new object of class '<em>Ballot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ballot</em>'.
	 * @generated
	 */
	Ballot createBallot();

	/**
	 * Returns a new object of class '<em>Signature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature</em>'.
	 * @generated
	 */
	Signature createSignature();

	/**
	 * Returns a new object of class '<em>Anonymous Channel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anonymous Channel</em>'.
	 * @generated
	 */
	AnonymousChannel createAnonymousChannel();

	/**
	 * Returns a new object of class '<em>Crypto Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Crypto Facade</em>'.
	 * @generated
	 */
	CryptoFacade createCryptoFacade();

	/**
	 * Returns a new object of class '<em>Message Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Manager</em>'.
	 * @generated
	 */
	MessageManager createMessageManager();

	/**
	 * Returns a new object of class '<em>Message Listener</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Listener</em>'.
	 * @generated
	 */
	MessageListener createMessageListener();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SecretVotingSchemePackage getSecretVotingSchemePackage();

} //SecretVotingSchemeFactory
