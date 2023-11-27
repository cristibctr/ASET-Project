/**
 */
package secretVotingScheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Administrator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.Administrator#getBlindSignatureKey <em>Blind Signature Key</em>}</li>
 *   <li>{@link secretVotingScheme.Administrator#getVotersList <em>Voters List</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getAdministrator()
 * @model
 * @generated
 */
public interface Administrator extends EObject {
	/**
	 * Returns the value of the '<em><b>Blind Signature Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blind Signature Key</em>' attribute.
	 * @see #setBlindSignatureKey(String)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getAdministrator_BlindSignatureKey()
	 * @model
	 * @generated
	 */
	String getBlindSignatureKey();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Administrator#getBlindSignatureKey <em>Blind Signature Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blind Signature Key</em>' attribute.
	 * @see #getBlindSignatureKey()
	 * @generated
	 */
	void setBlindSignatureKey(String value);

	/**
	 * Returns the value of the '<em><b>Voters List</b></em>' reference list.
	 * The list contents are of type {@link secretVotingScheme.Voter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voters List</em>' reference list.
	 * @see secretVotingScheme.SecretVotingSchemePackage#getAdministrator_VotersList()
	 * @model
	 * @generated
	 */
	EList<Voter> getVotersList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void signBallot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkEligibility();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void publishVotersList();

} // Administrator
