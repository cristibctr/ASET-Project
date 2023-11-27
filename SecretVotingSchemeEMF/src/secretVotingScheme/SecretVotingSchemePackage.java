/**
 */
package secretVotingScheme;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
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
 * @see secretVotingScheme.SecretVotingSchemeFactory
 * @model kind="package"
 * @generated
 */
public interface SecretVotingSchemePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "secretVotingScheme";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/secretVotingScheme";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "secretVotingScheme";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SecretVotingSchemePackage eINSTANCE = secretVotingScheme.impl.SecretVotingSchemePackageImpl.init();

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.MessageListenerImpl <em>Message Listener</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.MessageListenerImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getMessageListener()
	 * @generated
	 */
	int MESSAGE_LISTENER = 8;

	/**
	 * The number of structural features of the '<em>Message Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LISTENER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LISTENER___UPDATE = 0;

	/**
	 * The number of operations of the '<em>Message Listener</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_LISTENER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.VoterImpl <em>Voter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.VoterImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getVoter()
	 * @generated
	 */
	int VOTER = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER__ID = MESSAGE_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER__VOTE = MESSAGE_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER__KEY = MESSAGE_LISTENER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ballot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER__BALLOT = MESSAGE_LISTENER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Anonymouschannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER__ANONYMOUSCHANNEL = MESSAGE_LISTENER_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Voter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER_FEATURE_COUNT = MESSAGE_LISTENER_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER___UPDATE = MESSAGE_LISTENER___UPDATE;

	/**
	 * The operation id for the '<em>Fill Ballot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER___FILL_BALLOT = MESSAGE_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Send Ballot To Admin</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER___SEND_BALLOT_TO_ADMIN = MESSAGE_LISTENER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Send Vote To Counter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER___SEND_VOTE_TO_COUNTER = MESSAGE_LISTENER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Open Vote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER___OPEN_VOTE = MESSAGE_LISTENER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Voter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOTER_OPERATION_COUNT = MESSAGE_LISTENER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.AdministratorImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 1;

	/**
	 * The feature id for the '<em><b>Blind Signature Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__BLIND_SIGNATURE_KEY = 0;

	/**
	 * The feature id for the '<em><b>Voters List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__VOTERS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Sign Ballot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___SIGN_BALLOT = 0;

	/**
	 * The operation id for the '<em>Check Eligibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___CHECK_ELIGIBILITY = 1;

	/**
	 * The operation id for the '<em>Publish Voters List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___PUBLISH_VOTERS_LIST = 2;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.CounterImpl <em>Counter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.CounterImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getCounter()
	 * @generated
	 */
	int COUNTER = 2;

	/**
	 * The feature id for the '<em><b>Ballots List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__BALLOTS_LIST = MESSAGE_LISTENER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__RESULTS = MESSAGE_LISTENER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Anonymouschannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER__ANONYMOUSCHANNEL = MESSAGE_LISTENER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_FEATURE_COUNT = MESSAGE_LISTENER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___UPDATE = MESSAGE_LISTENER___UPDATE;

	/**
	 * The operation id for the '<em>Collect Ballots</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___COLLECT_BALLOTS = MESSAGE_LISTENER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Publish Ballots List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___PUBLISH_BALLOTS_LIST = MESSAGE_LISTENER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Open Votes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___OPEN_VOTES = MESSAGE_LISTENER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Count Votes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___COUNT_VOTES = MESSAGE_LISTENER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Announce Results</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER___ANNOUNCE_RESULTS = MESSAGE_LISTENER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Counter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTER_OPERATION_COUNT = MESSAGE_LISTENER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.BallotImpl <em>Ballot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.BallotImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getBallot()
	 * @generated
	 */
	int BALLOT = 3;

	/**
	 * The feature id for the '<em><b>Encrypted Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT__ENCRYPTED_VOTE = 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT__SIGNATURE = 1;

	/**
	 * The feature id for the '<em><b>Cryptfacade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT__CRYPTFACADE = 2;

	/**
	 * The number of structural features of the '<em>Ballot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Encrypt Vote</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT___ENCRYPT_VOTE = 0;

	/**
	 * The operation id for the '<em>Sign Ballot</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT___SIGN_BALLOT = 1;

	/**
	 * The number of operations of the '<em>Ballot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BALLOT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.SignatureImpl <em>Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.SignatureImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getSignature()
	 * @generated
	 */
	int SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Sign</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___SIGN = 0;

	/**
	 * The operation id for the '<em>Verify</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE___VERIFY = 1;

	/**
	 * The number of operations of the '<em>Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.AnonymousChannelImpl <em>Anonymous Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.AnonymousChannelImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getAnonymousChannel()
	 * @generated
	 */
	int ANONYMOUS_CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Messagemanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CHANNEL__MESSAGEMANAGER = 0;

	/**
	 * The number of structural features of the '<em>Anonymous Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CHANNEL_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Send Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CHANNEL___SEND_MESSAGE = 0;

	/**
	 * The operation id for the '<em>Receive Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CHANNEL___RECEIVE_MESSAGE = 1;

	/**
	 * The number of operations of the '<em>Anonymous Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONYMOUS_CHANNEL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.CryptoFacadeImpl <em>Crypto Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.CryptoFacadeImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getCryptoFacade()
	 * @generated
	 */
	int CRYPTO_FACADE = 6;

	/**
	 * The number of structural features of the '<em>Crypto Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Encrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FACADE___ENCRYPT = 0;

	/**
	 * The operation id for the '<em>Decrypt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FACADE___DECRYPT = 1;

	/**
	 * The number of operations of the '<em>Crypto Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRYPTO_FACADE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link secretVotingScheme.impl.MessageManagerImpl <em>Message Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see secretVotingScheme.impl.MessageManagerImpl
	 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getMessageManager()
	 * @generated
	 */
	int MESSAGE_MANAGER = 7;

	/**
	 * The feature id for the '<em><b>Messagelistener</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER__MESSAGELISTENER = 0;

	/**
	 * The number of structural features of the '<em>Message Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Subscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER___SUBSCRIBE = 0;

	/**
	 * The operation id for the '<em>Unsubscribe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER___UNSUBSCRIBE = 1;

	/**
	 * The operation id for the '<em>Notify Message</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER___NOTIFY_MESSAGE = 2;

	/**
	 * The number of operations of the '<em>Message Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_MANAGER_OPERATION_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link secretVotingScheme.Voter <em>Voter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Voter</em>'.
	 * @see secretVotingScheme.Voter
	 * @generated
	 */
	EClass getVoter();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Voter#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see secretVotingScheme.Voter#getID()
	 * @see #getVoter()
	 * @generated
	 */
	EAttribute getVoter_ID();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Voter#getVote <em>Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vote</em>'.
	 * @see secretVotingScheme.Voter#getVote()
	 * @see #getVoter()
	 * @generated
	 */
	EAttribute getVoter_Vote();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Voter#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see secretVotingScheme.Voter#getKey()
	 * @see #getVoter()
	 * @generated
	 */
	EAttribute getVoter_Key();

	/**
	 * Returns the meta object for the containment reference '{@link secretVotingScheme.Voter#getBallot <em>Ballot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ballot</em>'.
	 * @see secretVotingScheme.Voter#getBallot()
	 * @see #getVoter()
	 * @generated
	 */
	EReference getVoter_Ballot();

	/**
	 * Returns the meta object for the reference '{@link secretVotingScheme.Voter#getAnonymouschannel <em>Anonymouschannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anonymouschannel</em>'.
	 * @see secretVotingScheme.Voter#getAnonymouschannel()
	 * @see #getVoter()
	 * @generated
	 */
	EReference getVoter_Anonymouschannel();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Voter#fillBallot() <em>Fill Ballot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Fill Ballot</em>' operation.
	 * @see secretVotingScheme.Voter#fillBallot()
	 * @generated
	 */
	EOperation getVoter__FillBallot();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Voter#sendBallotToAdmin() <em>Send Ballot To Admin</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Ballot To Admin</em>' operation.
	 * @see secretVotingScheme.Voter#sendBallotToAdmin()
	 * @generated
	 */
	EOperation getVoter__SendBallotToAdmin();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Voter#sendVoteToCounter() <em>Send Vote To Counter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Vote To Counter</em>' operation.
	 * @see secretVotingScheme.Voter#sendVoteToCounter()
	 * @generated
	 */
	EOperation getVoter__SendVoteToCounter();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Voter#openVote() <em>Open Vote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Vote</em>' operation.
	 * @see secretVotingScheme.Voter#openVote()
	 * @generated
	 */
	EOperation getVoter__OpenVote();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see secretVotingScheme.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Administrator#getBlindSignatureKey <em>Blind Signature Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blind Signature Key</em>'.
	 * @see secretVotingScheme.Administrator#getBlindSignatureKey()
	 * @see #getAdministrator()
	 * @generated
	 */
	EAttribute getAdministrator_BlindSignatureKey();

	/**
	 * Returns the meta object for the reference list '{@link secretVotingScheme.Administrator#getVotersList <em>Voters List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Voters List</em>'.
	 * @see secretVotingScheme.Administrator#getVotersList()
	 * @see #getAdministrator()
	 * @generated
	 */
	EReference getAdministrator_VotersList();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Administrator#signBallot() <em>Sign Ballot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sign Ballot</em>' operation.
	 * @see secretVotingScheme.Administrator#signBallot()
	 * @generated
	 */
	EOperation getAdministrator__SignBallot();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Administrator#checkEligibility() <em>Check Eligibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Eligibility</em>' operation.
	 * @see secretVotingScheme.Administrator#checkEligibility()
	 * @generated
	 */
	EOperation getAdministrator__CheckEligibility();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Administrator#publishVotersList() <em>Publish Voters List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Voters List</em>' operation.
	 * @see secretVotingScheme.Administrator#publishVotersList()
	 * @generated
	 */
	EOperation getAdministrator__PublishVotersList();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.Counter <em>Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Counter</em>'.
	 * @see secretVotingScheme.Counter
	 * @generated
	 */
	EClass getCounter();

	/**
	 * Returns the meta object for the reference list '{@link secretVotingScheme.Counter#getBallotsList <em>Ballots List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ballots List</em>'.
	 * @see secretVotingScheme.Counter#getBallotsList()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_BallotsList();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Counter#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Results</em>'.
	 * @see secretVotingScheme.Counter#getResults()
	 * @see #getCounter()
	 * @generated
	 */
	EAttribute getCounter_Results();

	/**
	 * Returns the meta object for the reference '{@link secretVotingScheme.Counter#getAnonymouschannel <em>Anonymouschannel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Anonymouschannel</em>'.
	 * @see secretVotingScheme.Counter#getAnonymouschannel()
	 * @see #getCounter()
	 * @generated
	 */
	EReference getCounter_Anonymouschannel();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Counter#collectBallots() <em>Collect Ballots</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Collect Ballots</em>' operation.
	 * @see secretVotingScheme.Counter#collectBallots()
	 * @generated
	 */
	EOperation getCounter__CollectBallots();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Counter#publishBallotsList() <em>Publish Ballots List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Publish Ballots List</em>' operation.
	 * @see secretVotingScheme.Counter#publishBallotsList()
	 * @generated
	 */
	EOperation getCounter__PublishBallotsList();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Counter#openVotes() <em>Open Votes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Votes</em>' operation.
	 * @see secretVotingScheme.Counter#openVotes()
	 * @generated
	 */
	EOperation getCounter__OpenVotes();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Counter#countVotes() <em>Count Votes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Count Votes</em>' operation.
	 * @see secretVotingScheme.Counter#countVotes()
	 * @generated
	 */
	EOperation getCounter__CountVotes();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Counter#announceResults() <em>Announce Results</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Announce Results</em>' operation.
	 * @see secretVotingScheme.Counter#announceResults()
	 * @generated
	 */
	EOperation getCounter__AnnounceResults();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.Ballot <em>Ballot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ballot</em>'.
	 * @see secretVotingScheme.Ballot
	 * @generated
	 */
	EClass getBallot();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Ballot#getEncryptedVote <em>Encrypted Vote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Encrypted Vote</em>'.
	 * @see secretVotingScheme.Ballot#getEncryptedVote()
	 * @see #getBallot()
	 * @generated
	 */
	EAttribute getBallot_EncryptedVote();

	/**
	 * Returns the meta object for the reference '{@link secretVotingScheme.Ballot#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see secretVotingScheme.Ballot#getSignature()
	 * @see #getBallot()
	 * @generated
	 */
	EReference getBallot_Signature();

	/**
	 * Returns the meta object for the reference '{@link secretVotingScheme.Ballot#getCryptfacade <em>Cryptfacade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cryptfacade</em>'.
	 * @see secretVotingScheme.Ballot#getCryptfacade()
	 * @see #getBallot()
	 * @generated
	 */
	EReference getBallot_Cryptfacade();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Ballot#encryptVote() <em>Encrypt Vote</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encrypt Vote</em>' operation.
	 * @see secretVotingScheme.Ballot#encryptVote()
	 * @generated
	 */
	EOperation getBallot__EncryptVote();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Ballot#signBallot() <em>Sign Ballot</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sign Ballot</em>' operation.
	 * @see secretVotingScheme.Ballot#signBallot()
	 * @generated
	 */
	EOperation getBallot__SignBallot();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.Signature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature</em>'.
	 * @see secretVotingScheme.Signature
	 * @generated
	 */
	EClass getSignature();

	/**
	 * Returns the meta object for the attribute '{@link secretVotingScheme.Signature#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see secretVotingScheme.Signature#getValue()
	 * @see #getSignature()
	 * @generated
	 */
	EAttribute getSignature_Value();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Signature#sign() <em>Sign</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sign</em>' operation.
	 * @see secretVotingScheme.Signature#sign()
	 * @generated
	 */
	EOperation getSignature__Sign();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.Signature#verify() <em>Verify</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Verify</em>' operation.
	 * @see secretVotingScheme.Signature#verify()
	 * @generated
	 */
	EOperation getSignature__Verify();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.AnonymousChannel <em>Anonymous Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Anonymous Channel</em>'.
	 * @see secretVotingScheme.AnonymousChannel
	 * @generated
	 */
	EClass getAnonymousChannel();

	/**
	 * Returns the meta object for the containment reference '{@link secretVotingScheme.AnonymousChannel#getMessagemanager <em>Messagemanager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Messagemanager</em>'.
	 * @see secretVotingScheme.AnonymousChannel#getMessagemanager()
	 * @see #getAnonymousChannel()
	 * @generated
	 */
	EReference getAnonymousChannel_Messagemanager();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.AnonymousChannel#sendMessage() <em>Send Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Message</em>' operation.
	 * @see secretVotingScheme.AnonymousChannel#sendMessage()
	 * @generated
	 */
	EOperation getAnonymousChannel__SendMessage();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.AnonymousChannel#receiveMessage() <em>Receive Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive Message</em>' operation.
	 * @see secretVotingScheme.AnonymousChannel#receiveMessage()
	 * @generated
	 */
	EOperation getAnonymousChannel__ReceiveMessage();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.CryptoFacade <em>Crypto Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crypto Facade</em>'.
	 * @see secretVotingScheme.CryptoFacade
	 * @generated
	 */
	EClass getCryptoFacade();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.CryptoFacade#encrypt() <em>Encrypt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Encrypt</em>' operation.
	 * @see secretVotingScheme.CryptoFacade#encrypt()
	 * @generated
	 */
	EOperation getCryptoFacade__Encrypt();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.CryptoFacade#decrypt() <em>Decrypt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Decrypt</em>' operation.
	 * @see secretVotingScheme.CryptoFacade#decrypt()
	 * @generated
	 */
	EOperation getCryptoFacade__Decrypt();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.MessageManager <em>Message Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Manager</em>'.
	 * @see secretVotingScheme.MessageManager
	 * @generated
	 */
	EClass getMessageManager();

	/**
	 * Returns the meta object for the containment reference list '{@link secretVotingScheme.MessageManager#getMessagelistener <em>Messagelistener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Messagelistener</em>'.
	 * @see secretVotingScheme.MessageManager#getMessagelistener()
	 * @see #getMessageManager()
	 * @generated
	 */
	EReference getMessageManager_Messagelistener();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.MessageManager#subscribe() <em>Subscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Subscribe</em>' operation.
	 * @see secretVotingScheme.MessageManager#subscribe()
	 * @generated
	 */
	EOperation getMessageManager__Subscribe();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.MessageManager#unsubscribe() <em>Unsubscribe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unsubscribe</em>' operation.
	 * @see secretVotingScheme.MessageManager#unsubscribe()
	 * @generated
	 */
	EOperation getMessageManager__Unsubscribe();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.MessageManager#notifyMessage() <em>Notify Message</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Notify Message</em>' operation.
	 * @see secretVotingScheme.MessageManager#notifyMessage()
	 * @generated
	 */
	EOperation getMessageManager__NotifyMessage();

	/**
	 * Returns the meta object for class '{@link secretVotingScheme.MessageListener <em>Message Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Listener</em>'.
	 * @see secretVotingScheme.MessageListener
	 * @generated
	 */
	EClass getMessageListener();

	/**
	 * Returns the meta object for the '{@link secretVotingScheme.MessageListener#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see secretVotingScheme.MessageListener#update()
	 * @generated
	 */
	EOperation getMessageListener__Update();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SecretVotingSchemeFactory getSecretVotingSchemeFactory();

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
		 * The meta object literal for the '{@link secretVotingScheme.impl.VoterImpl <em>Voter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.VoterImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getVoter()
		 * @generated
		 */
		EClass VOTER = eINSTANCE.getVoter();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTER__ID = eINSTANCE.getVoter_ID();

		/**
		 * The meta object literal for the '<em><b>Vote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTER__VOTE = eINSTANCE.getVoter_Vote();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOTER__KEY = eINSTANCE.getVoter_Key();

		/**
		 * The meta object literal for the '<em><b>Ballot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTER__BALLOT = eINSTANCE.getVoter_Ballot();

		/**
		 * The meta object literal for the '<em><b>Anonymouschannel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOTER__ANONYMOUSCHANNEL = eINSTANCE.getVoter_Anonymouschannel();

		/**
		 * The meta object literal for the '<em><b>Fill Ballot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOTER___FILL_BALLOT = eINSTANCE.getVoter__FillBallot();

		/**
		 * The meta object literal for the '<em><b>Send Ballot To Admin</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOTER___SEND_BALLOT_TO_ADMIN = eINSTANCE.getVoter__SendBallotToAdmin();

		/**
		 * The meta object literal for the '<em><b>Send Vote To Counter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOTER___SEND_VOTE_TO_COUNTER = eINSTANCE.getVoter__SendVoteToCounter();

		/**
		 * The meta object literal for the '<em><b>Open Vote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VOTER___OPEN_VOTE = eINSTANCE.getVoter__OpenVote();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.AdministratorImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '<em><b>Blind Signature Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINISTRATOR__BLIND_SIGNATURE_KEY = eINSTANCE.getAdministrator_BlindSignatureKey();

		/**
		 * The meta object literal for the '<em><b>Voters List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINISTRATOR__VOTERS_LIST = eINSTANCE.getAdministrator_VotersList();

		/**
		 * The meta object literal for the '<em><b>Sign Ballot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___SIGN_BALLOT = eINSTANCE.getAdministrator__SignBallot();

		/**
		 * The meta object literal for the '<em><b>Check Eligibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___CHECK_ELIGIBILITY = eINSTANCE.getAdministrator__CheckEligibility();

		/**
		 * The meta object literal for the '<em><b>Publish Voters List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR___PUBLISH_VOTERS_LIST = eINSTANCE.getAdministrator__PublishVotersList();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.CounterImpl <em>Counter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.CounterImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getCounter()
		 * @generated
		 */
		EClass COUNTER = eINSTANCE.getCounter();

		/**
		 * The meta object literal for the '<em><b>Ballots List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__BALLOTS_LIST = eINSTANCE.getCounter_BallotsList();

		/**
		 * The meta object literal for the '<em><b>Results</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTER__RESULTS = eINSTANCE.getCounter_Results();

		/**
		 * The meta object literal for the '<em><b>Anonymouschannel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUNTER__ANONYMOUSCHANNEL = eINSTANCE.getCounter_Anonymouschannel();

		/**
		 * The meta object literal for the '<em><b>Collect Ballots</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTER___COLLECT_BALLOTS = eINSTANCE.getCounter__CollectBallots();

		/**
		 * The meta object literal for the '<em><b>Publish Ballots List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTER___PUBLISH_BALLOTS_LIST = eINSTANCE.getCounter__PublishBallotsList();

		/**
		 * The meta object literal for the '<em><b>Open Votes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTER___OPEN_VOTES = eINSTANCE.getCounter__OpenVotes();

		/**
		 * The meta object literal for the '<em><b>Count Votes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTER___COUNT_VOTES = eINSTANCE.getCounter__CountVotes();

		/**
		 * The meta object literal for the '<em><b>Announce Results</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COUNTER___ANNOUNCE_RESULTS = eINSTANCE.getCounter__AnnounceResults();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.BallotImpl <em>Ballot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.BallotImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getBallot()
		 * @generated
		 */
		EClass BALLOT = eINSTANCE.getBallot();

		/**
		 * The meta object literal for the '<em><b>Encrypted Vote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BALLOT__ENCRYPTED_VOTE = eINSTANCE.getBallot_EncryptedVote();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALLOT__SIGNATURE = eINSTANCE.getBallot_Signature();

		/**
		 * The meta object literal for the '<em><b>Cryptfacade</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BALLOT__CRYPTFACADE = eINSTANCE.getBallot_Cryptfacade();

		/**
		 * The meta object literal for the '<em><b>Encrypt Vote</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BALLOT___ENCRYPT_VOTE = eINSTANCE.getBallot__EncryptVote();

		/**
		 * The meta object literal for the '<em><b>Sign Ballot</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BALLOT___SIGN_BALLOT = eINSTANCE.getBallot__SignBallot();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.SignatureImpl <em>Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.SignatureImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getSignature()
		 * @generated
		 */
		EClass SIGNATURE = eINSTANCE.getSignature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIGNATURE__VALUE = eINSTANCE.getSignature_Value();

		/**
		 * The meta object literal for the '<em><b>Sign</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE___SIGN = eINSTANCE.getSignature__Sign();

		/**
		 * The meta object literal for the '<em><b>Verify</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIGNATURE___VERIFY = eINSTANCE.getSignature__Verify();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.AnonymousChannelImpl <em>Anonymous Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.AnonymousChannelImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getAnonymousChannel()
		 * @generated
		 */
		EClass ANONYMOUS_CHANNEL = eINSTANCE.getAnonymousChannel();

		/**
		 * The meta object literal for the '<em><b>Messagemanager</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANONYMOUS_CHANNEL__MESSAGEMANAGER = eINSTANCE.getAnonymousChannel_Messagemanager();

		/**
		 * The meta object literal for the '<em><b>Send Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMOUS_CHANNEL___SEND_MESSAGE = eINSTANCE.getAnonymousChannel__SendMessage();

		/**
		 * The meta object literal for the '<em><b>Receive Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANONYMOUS_CHANNEL___RECEIVE_MESSAGE = eINSTANCE.getAnonymousChannel__ReceiveMessage();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.CryptoFacadeImpl <em>Crypto Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.CryptoFacadeImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getCryptoFacade()
		 * @generated
		 */
		EClass CRYPTO_FACADE = eINSTANCE.getCryptoFacade();

		/**
		 * The meta object literal for the '<em><b>Encrypt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRYPTO_FACADE___ENCRYPT = eINSTANCE.getCryptoFacade__Encrypt();

		/**
		 * The meta object literal for the '<em><b>Decrypt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CRYPTO_FACADE___DECRYPT = eINSTANCE.getCryptoFacade__Decrypt();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.MessageManagerImpl <em>Message Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.MessageManagerImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getMessageManager()
		 * @generated
		 */
		EClass MESSAGE_MANAGER = eINSTANCE.getMessageManager();

		/**
		 * The meta object literal for the '<em><b>Messagelistener</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_MANAGER__MESSAGELISTENER = eINSTANCE.getMessageManager_Messagelistener();

		/**
		 * The meta object literal for the '<em><b>Subscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_MANAGER___SUBSCRIBE = eINSTANCE.getMessageManager__Subscribe();

		/**
		 * The meta object literal for the '<em><b>Unsubscribe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_MANAGER___UNSUBSCRIBE = eINSTANCE.getMessageManager__Unsubscribe();

		/**
		 * The meta object literal for the '<em><b>Notify Message</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_MANAGER___NOTIFY_MESSAGE = eINSTANCE.getMessageManager__NotifyMessage();

		/**
		 * The meta object literal for the '{@link secretVotingScheme.impl.MessageListenerImpl <em>Message Listener</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see secretVotingScheme.impl.MessageListenerImpl
		 * @see secretVotingScheme.impl.SecretVotingSchemePackageImpl#getMessageListener()
		 * @generated
		 */
		EClass MESSAGE_LISTENER = eINSTANCE.getMessageListener();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE_LISTENER___UPDATE = eINSTANCE.getMessageListener__Update();

	}

} //SecretVotingSchemePackage
