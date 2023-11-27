/**
 */
package secretVotingScheme;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.Voter#getID <em>ID</em>}</li>
 *   <li>{@link secretVotingScheme.Voter#getVote <em>Vote</em>}</li>
 *   <li>{@link secretVotingScheme.Voter#getKey <em>Key</em>}</li>
 *   <li>{@link secretVotingScheme.Voter#getBallot <em>Ballot</em>}</li>
 *   <li>{@link secretVotingScheme.Voter#getAnonymouschannel <em>Anonymouschannel</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter()
 * @model
 * @generated
 */
public interface Voter extends MessageListener {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Voter#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Vote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vote</em>' attribute.
	 * @see #setVote(String)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter_Vote()
	 * @model
	 * @generated
	 */
	String getVote();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Voter#getVote <em>Vote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vote</em>' attribute.
	 * @see #getVote()
	 * @generated
	 */
	void setVote(String value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter_Key()
	 * @model
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Voter#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Ballot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ballot</em>' containment reference.
	 * @see #setBallot(Ballot)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter_Ballot()
	 * @model containment="true"
	 * @generated
	 */
	Ballot getBallot();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Voter#getBallot <em>Ballot</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ballot</em>' containment reference.
	 * @see #getBallot()
	 * @generated
	 */
	void setBallot(Ballot value);

	/**
	 * Returns the value of the '<em><b>Anonymouschannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymouschannel</em>' reference.
	 * @see #setAnonymouschannel(AnonymousChannel)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getVoter_Anonymouschannel()
	 * @model required="true"
	 * @generated
	 */
	AnonymousChannel getAnonymouschannel();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Voter#getAnonymouschannel <em>Anonymouschannel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anonymouschannel</em>' reference.
	 * @see #getAnonymouschannel()
	 * @generated
	 */
	void setAnonymouschannel(AnonymousChannel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void fillBallot();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendBallotToAdmin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendVoteToCounter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openVote();

} // Voter
