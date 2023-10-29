/**
 */
package secretVotingScheme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ballot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.Ballot#getEncryptedVote <em>Encrypted Vote</em>}</li>
 *   <li>{@link secretVotingScheme.Ballot#getSignature <em>Signature</em>}</li>
 *   <li>{@link secretVotingScheme.Ballot#getCryptfacade <em>Cryptfacade</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getBallot()
 * @model
 * @generated
 */
public interface Ballot extends EObject {
	/**
	 * Returns the value of the '<em><b>Encrypted Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypted Vote</em>' attribute.
	 * @see #setEncryptedVote(String)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getBallot_EncryptedVote()
	 * @model
	 * @generated
	 */
	String getEncryptedVote();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Ballot#getEncryptedVote <em>Encrypted Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypted Vote</em>' attribute.
	 * @see #getEncryptedVote()
	 * @generated
	 */
	void setEncryptedVote(String value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(Signature)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getBallot_Signature()
	 * @model
	 * @generated
	 */
	Signature getSignature();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Ballot#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(Signature value);

	/**
	 * Returns the value of the '<em><b>Cryptfacade</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cryptfacade</em>' reference.
	 * @see #setCryptfacade(CryptoFacade)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getBallot_Cryptfacade()
	 * @model
	 * @generated
	 */
	CryptoFacade getCryptfacade();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Ballot#getCryptfacade <em>Cryptfacade</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cryptfacade</em>' reference.
	 * @see #getCryptfacade()
	 * @generated
	 */
	void setCryptfacade(CryptoFacade value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void encryptVote();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void signBallot();

} // Ballot
