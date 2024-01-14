/**
 */
package secretVotingScheme.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import secretVotingScheme.Administrator;
import secretVotingScheme.AnonymousChannel;
import secretVotingScheme.Ballot;
import secretVotingScheme.Counter;
import secretVotingScheme.CryptoFacade;
import secretVotingScheme.MessageListener;
import secretVotingScheme.MessageManager;
import secretVotingScheme.SecretVotingSchemeFactory;
import secretVotingScheme.SecretVotingSchemePackage;
import secretVotingScheme.Signature;
import secretVotingScheme.Voter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretVotingSchemePackageImpl extends EPackageImpl implements SecretVotingSchemePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass voterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass counterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ballotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anonymousChannelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cryptoFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageListenerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see secretVotingScheme.SecretVotingSchemePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SecretVotingSchemePackageImpl() {
		super(eNS_URI, SecretVotingSchemeFactory.eINSTANCE);
	}

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SecretVotingSchemePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SecretVotingSchemePackage init() {
		if (isInited) return (SecretVotingSchemePackage)EPackage.Registry.INSTANCE.getEPackage(SecretVotingSchemePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSecretVotingSchemePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SecretVotingSchemePackageImpl theSecretVotingSchemePackage = registeredSecretVotingSchemePackage instanceof SecretVotingSchemePackageImpl ? (SecretVotingSchemePackageImpl)registeredSecretVotingSchemePackage : new SecretVotingSchemePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSecretVotingSchemePackage.createPackageContents();

		// Initialize created meta-data
		theSecretVotingSchemePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSecretVotingSchemePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SecretVotingSchemePackage.eNS_URI, theSecretVotingSchemePackage);
		return theSecretVotingSchemePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVoter() {
		return voterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVoter_ID() {
		return (EAttribute)voterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVoter_Vote() {
		return (EAttribute)voterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVoter_Key() {
		return (EAttribute)voterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVoter_Ballot() {
		return (EReference)voterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVoter_Anonymouschannel() {
		return (EReference)voterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVoter__FillBallot() {
		return voterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVoter__SendBallotToAdmin() {
		return voterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVoter__SendVoteToCounter() {
		return voterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getVoter__OpenVote() {
		return voterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAdministrator_BlindSignatureKey() {
		return (EAttribute)administratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAdministrator_VotersList() {
		return (EReference)administratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdministrator__SignBallot() {
		return administratorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdministrator__CheckEligibility() {
		return administratorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAdministrator__PublishVotersList() {
		return administratorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCounter() {
		return counterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCounter_BallotsList() {
		return (EReference)counterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCounter_Results() {
		return (EAttribute)counterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCounter_Anonymouschannel() {
		return (EReference)counterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCounter__CollectBallots() {
		return counterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCounter__PublishBallotsList() {
		return counterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCounter__OpenVotes() {
		return counterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCounter__CountVotes() {
		return counterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCounter__AnnounceResults() {
		return counterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBallot() {
		return ballotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBallot_EncryptedVote() {
		return (EAttribute)ballotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBallot_Signature() {
		return (EReference)ballotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBallot_Cryptfacade() {
		return (EReference)ballotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBallot__EncryptVote() {
		return ballotEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBallot__SignBallot() {
		return ballotEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignature() {
		return signatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignature_Value() {
		return (EAttribute)signatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSignature__Sign() {
		return signatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getSignature__Verify() {
		return signatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnonymousChannel() {
		return anonymousChannelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnonymousChannel_Messagemanager() {
		return (EReference)anonymousChannelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousChannel__SendMessage() {
		return anonymousChannelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAnonymousChannel__ReceiveMessage() {
		return anonymousChannelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCryptoFacade() {
		return cryptoFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCryptoFacade__Encrypt() {
		return cryptoFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCryptoFacade__Decrypt() {
		return cryptoFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageManager() {
		return messageManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMessageManager_Messagelistener() {
		return (EReference)messageManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMessageManager__Subscribe() {
		return messageManagerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMessageManager__Unsubscribe() {
		return messageManagerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMessageManager__NotifyMessage() {
		return messageManagerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessageListener() {
		return messageListenerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMessageListener__Update() {
		return messageListenerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretVotingSchemeFactory getSecretVotingSchemeFactory() {
		return (SecretVotingSchemeFactory)getEFactoryInstance();
	}

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		voterEClass = createEClass(VOTER);
		createEAttribute(voterEClass, VOTER__ID);
		createEAttribute(voterEClass, VOTER__VOTE);
		createEAttribute(voterEClass, VOTER__KEY);
		createEReference(voterEClass, VOTER__BALLOT);
		createEReference(voterEClass, VOTER__ANONYMOUSCHANNEL);
		createEOperation(voterEClass, VOTER___FILL_BALLOT);
		createEOperation(voterEClass, VOTER___SEND_BALLOT_TO_ADMIN);
		createEOperation(voterEClass, VOTER___SEND_VOTE_TO_COUNTER);
		createEOperation(voterEClass, VOTER___OPEN_VOTE);

		administratorEClass = createEClass(ADMINISTRATOR);
		createEAttribute(administratorEClass, ADMINISTRATOR__BLIND_SIGNATURE_KEY);
		createEReference(administratorEClass, ADMINISTRATOR__VOTERS_LIST);
		createEOperation(administratorEClass, ADMINISTRATOR___SIGN_BALLOT);
		createEOperation(administratorEClass, ADMINISTRATOR___CHECK_ELIGIBILITY);
		createEOperation(administratorEClass, ADMINISTRATOR___PUBLISH_VOTERS_LIST);

		counterEClass = createEClass(COUNTER);
		createEReference(counterEClass, COUNTER__BALLOTS_LIST);
		createEAttribute(counterEClass, COUNTER__RESULTS);
		createEReference(counterEClass, COUNTER__ANONYMOUSCHANNEL);
		createEOperation(counterEClass, COUNTER___COLLECT_BALLOTS);
		createEOperation(counterEClass, COUNTER___PUBLISH_BALLOTS_LIST);
		createEOperation(counterEClass, COUNTER___OPEN_VOTES);
		createEOperation(counterEClass, COUNTER___COUNT_VOTES);
		createEOperation(counterEClass, COUNTER___ANNOUNCE_RESULTS);

		ballotEClass = createEClass(BALLOT);
		createEAttribute(ballotEClass, BALLOT__ENCRYPTED_VOTE);
		createEReference(ballotEClass, BALLOT__SIGNATURE);
		createEReference(ballotEClass, BALLOT__CRYPTFACADE);
		createEOperation(ballotEClass, BALLOT___ENCRYPT_VOTE);
		createEOperation(ballotEClass, BALLOT___SIGN_BALLOT);

		signatureEClass = createEClass(SIGNATURE);
		createEAttribute(signatureEClass, SIGNATURE__VALUE);
		createEOperation(signatureEClass, SIGNATURE___SIGN);
		createEOperation(signatureEClass, SIGNATURE___VERIFY);

		anonymousChannelEClass = createEClass(ANONYMOUS_CHANNEL);
		createEReference(anonymousChannelEClass, ANONYMOUS_CHANNEL__MESSAGEMANAGER);
		createEOperation(anonymousChannelEClass, ANONYMOUS_CHANNEL___SEND_MESSAGE);
		createEOperation(anonymousChannelEClass, ANONYMOUS_CHANNEL___RECEIVE_MESSAGE);

		cryptoFacadeEClass = createEClass(CRYPTO_FACADE);
		createEOperation(cryptoFacadeEClass, CRYPTO_FACADE___ENCRYPT);
		createEOperation(cryptoFacadeEClass, CRYPTO_FACADE___DECRYPT);

		messageManagerEClass = createEClass(MESSAGE_MANAGER);
		createEReference(messageManagerEClass, MESSAGE_MANAGER__MESSAGELISTENER);
		createEOperation(messageManagerEClass, MESSAGE_MANAGER___SUBSCRIBE);
		createEOperation(messageManagerEClass, MESSAGE_MANAGER___UNSUBSCRIBE);
		createEOperation(messageManagerEClass, MESSAGE_MANAGER___NOTIFY_MESSAGE);

		messageListenerEClass = createEClass(MESSAGE_LISTENER);
		createEOperation(messageListenerEClass, MESSAGE_LISTENER___UPDATE);
	}

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		voterEClass.getESuperTypes().add(this.getMessageListener());
		counterEClass.getESuperTypes().add(this.getMessageListener());

		// Initialize classes, features, and operations; add parameters
		initEClass(voterEClass, Voter.class, "Voter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVoter_ID(), ecorePackage.getEString(), "ID", null, 0, 1, Voter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoter_Vote(), ecorePackage.getEString(), "vote", null, 0, 1, Voter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVoter_Key(), ecorePackage.getEString(), "key", null, 0, 1, Voter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter_Ballot(), this.getBallot(), null, "ballot", null, 0, 1, Voter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVoter_Anonymouschannel(), this.getAnonymousChannel(), null, "anonymouschannel", null, 1, 1, Voter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVoter__FillBallot(), null, "fillBallot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVoter__SendBallotToAdmin(), null, "sendBallotToAdmin", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVoter__SendVoteToCounter(), null, "sendVoteToCounter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVoter__OpenVote(), null, "openVote", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdministrator_BlindSignatureKey(), ecorePackage.getEString(), "blindSignatureKey", null, 0, 1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdministrator_VotersList(), this.getVoter(), null, "votersList", null, 0, -1, Administrator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAdministrator__SignBallot(), null, "signBallot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdministrator__CheckEligibility(), null, "checkEligibility", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAdministrator__PublishVotersList(), null, "publishVotersList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(counterEClass, Counter.class, "Counter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCounter_BallotsList(), this.getBallot(), null, "ballotsList", null, 0, -1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCounter_Results(), ecorePackage.getEMap(), "results", null, 0, 1, Counter.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCounter_Anonymouschannel(), this.getAnonymousChannel(), null, "anonymouschannel", null, 1, 1, Counter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCounter__CollectBallots(), null, "collectBallots", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCounter__PublishBallotsList(), null, "publishBallotsList", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCounter__OpenVotes(), null, "openVotes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCounter__CountVotes(), null, "countVotes", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCounter__AnnounceResults(), null, "announceResults", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ballotEClass, Ballot.class, "Ballot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBallot_EncryptedVote(), ecorePackage.getEString(), "encryptedVote", null, 0, 1, Ballot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBallot_Signature(), this.getSignature(), null, "signature", null, 0, 1, Ballot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBallot_Cryptfacade(), this.getCryptoFacade(), null, "cryptfacade", null, 0, 1, Ballot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBallot__EncryptVote(), null, "encryptVote", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBallot__SignBallot(), null, "signBallot", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signatureEClass, Signature.class, "Signature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignature_Value(), ecorePackage.getEString(), "value", null, 0, 1, Signature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSignature__Sign(), null, "sign", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSignature__Verify(), null, "verify", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(anonymousChannelEClass, AnonymousChannel.class, "AnonymousChannel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnonymousChannel_Messagemanager(), this.getMessageManager(), null, "messagemanager", null, 0, 1, AnonymousChannel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAnonymousChannel__SendMessage(), null, "sendMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAnonymousChannel__ReceiveMessage(), null, "receiveMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cryptoFacadeEClass, CryptoFacade.class, "CryptoFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCryptoFacade__Encrypt(), null, "encrypt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCryptoFacade__Decrypt(), null, "decrypt", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageManagerEClass, MessageManager.class, "MessageManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageManager_Messagelistener(), this.getMessageListener(), null, "messagelistener", null, 0, -1, MessageManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessageManager__Subscribe(), null, "subscribe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessageManager__Unsubscribe(), null, "unsubscribe", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessageManager__NotifyMessage(), null, "notifyMessage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageListenerEClass, MessageListener.class, "MessageListener", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getMessageListener__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SecretVotingSchemePackageImpl
