/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import secretVotingScheme.Administrator;
import secretVotingScheme.SecretVotingSchemePackage;
import secretVotingScheme.Voter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.impl.AdministratorImpl#getBlindSignatureKey <em>Blind Signature Key</em>}</li>
 *   <li>{@link secretVotingScheme.impl.AdministratorImpl#getVotersList <em>Voters List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdministratorImpl extends MinimalEObjectImpl.Container implements Administrator {
	/**
	 * The default value of the '{@link #getBlindSignatureKey() <em>Blind Signature Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlindSignatureKey()
	 * @generated
	 * @ordered
	 */
	protected static final String BLIND_SIGNATURE_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlindSignatureKey() <em>Blind Signature Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlindSignatureKey()
	 * @generated
	 * @ordered
	 */
	protected String blindSignatureKey = BLIND_SIGNATURE_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVotersList() <em>Voters List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVotersList()
	 * @generated
	 * @ordered
	 */
	protected EList<Voter> votersList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdministratorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.ADMINISTRATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBlindSignatureKey() {
		return blindSignatureKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlindSignatureKey(String newBlindSignatureKey) {
		String oldBlindSignatureKey = blindSignatureKey;
		blindSignatureKey = newBlindSignatureKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SecretVotingSchemePackage.ADMINISTRATOR__BLIND_SIGNATURE_KEY, oldBlindSignatureKey, blindSignatureKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Voter> getVotersList() {
		if (votersList == null) {
			votersList = new EObjectResolvingEList<Voter>(Voter.class, this, SecretVotingSchemePackage.ADMINISTRATOR__VOTERS_LIST);
		}
		return votersList;
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
	public void checkEligibility() {
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
	public void publishVotersList() {
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
			case SecretVotingSchemePackage.ADMINISTRATOR__BLIND_SIGNATURE_KEY:
				return getBlindSignatureKey();
			case SecretVotingSchemePackage.ADMINISTRATOR__VOTERS_LIST:
				return getVotersList();
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
			case SecretVotingSchemePackage.ADMINISTRATOR__BLIND_SIGNATURE_KEY:
				setBlindSignatureKey((String)newValue);
				return;
			case SecretVotingSchemePackage.ADMINISTRATOR__VOTERS_LIST:
				getVotersList().clear();
				getVotersList().addAll((Collection<? extends Voter>)newValue);
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
			case SecretVotingSchemePackage.ADMINISTRATOR__BLIND_SIGNATURE_KEY:
				setBlindSignatureKey(BLIND_SIGNATURE_KEY_EDEFAULT);
				return;
			case SecretVotingSchemePackage.ADMINISTRATOR__VOTERS_LIST:
				getVotersList().clear();
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
			case SecretVotingSchemePackage.ADMINISTRATOR__BLIND_SIGNATURE_KEY:
				return BLIND_SIGNATURE_KEY_EDEFAULT == null ? blindSignatureKey != null : !BLIND_SIGNATURE_KEY_EDEFAULT.equals(blindSignatureKey);
			case SecretVotingSchemePackage.ADMINISTRATOR__VOTERS_LIST:
				return votersList != null && !votersList.isEmpty();
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
			case SecretVotingSchemePackage.ADMINISTRATOR___SIGN_BALLOT:
				signBallot();
				return null;
			case SecretVotingSchemePackage.ADMINISTRATOR___CHECK_ELIGIBILITY:
				checkEligibility();
				return null;
			case SecretVotingSchemePackage.ADMINISTRATOR___PUBLISH_VOTERS_LIST:
				publishVotersList();
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
		result.append(" (blindSignatureKey: ");
		result.append(blindSignatureKey);
		result.append(')');
		return result.toString();
	}

} //AdministratorImpl
