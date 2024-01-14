/**
 */
package secretVotingScheme.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import secretVotingScheme.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SecretVotingSchemeFactoryImpl extends EFactoryImpl implements SecretVotingSchemeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SecretVotingSchemeFactory init() {
		try {
			SecretVotingSchemeFactory theSecretVotingSchemeFactory = (SecretVotingSchemeFactory)EPackage.Registry.INSTANCE.getEFactory(SecretVotingSchemePackage.eNS_URI);
			if (theSecretVotingSchemeFactory != null) {
				return theSecretVotingSchemeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SecretVotingSchemeFactoryImpl();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SecretVotingSchemePackage.VOTER: return createVoter();
			case SecretVotingSchemePackage.ADMINISTRATOR: return createAdministrator();
			case SecretVotingSchemePackage.COUNTER: return createCounter();
			case SecretVotingSchemePackage.BALLOT: return createBallot();
			case SecretVotingSchemePackage.SIGNATURE: return createSignature();
			case SecretVotingSchemePackage.ANONYMOUS_CHANNEL: return createAnonymousChannel();
			case SecretVotingSchemePackage.CRYPTO_FACADE: return createCryptoFacade();
			case SecretVotingSchemePackage.MESSAGE_MANAGER: return createMessageManager();
			case SecretVotingSchemePackage.MESSAGE_LISTENER: return createMessageListener();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Voter createVoter() {
		VoterImpl voter = new VoterImpl();
		return voter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Administrator createAdministrator() {
		AdministratorImpl administrator = new AdministratorImpl();
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Counter createCounter() {
		CounterImpl counter = new CounterImpl();
		return counter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ballot createBallot() {
		BallotImpl ballot = new BallotImpl();
		return ballot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signature createSignature() {
		SignatureImpl signature = new SignatureImpl();
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnonymousChannel createAnonymousChannel() {
		AnonymousChannelImpl anonymousChannel = new AnonymousChannelImpl();
		return anonymousChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CryptoFacade createCryptoFacade() {
		CryptoFacadeImpl cryptoFacade = new CryptoFacadeImpl();
		return cryptoFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageManager createMessageManager() {
		MessageManagerImpl messageManager = new MessageManagerImpl();
		return messageManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageListener createMessageListener() {
		MessageListenerImpl messageListener = new MessageListenerImpl();
		return messageListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecretVotingSchemePackage getSecretVotingSchemePackage() {
		return (SecretVotingSchemePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SecretVotingSchemePackage getPackage() {
		return SecretVotingSchemePackage.eINSTANCE;
	}

} //SecretVotingSchemeFactoryImpl
