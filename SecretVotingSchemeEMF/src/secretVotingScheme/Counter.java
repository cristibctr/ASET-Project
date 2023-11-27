/**
 */
package secretVotingScheme;

import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.Counter#getBallotsList <em>Ballots List</em>}</li>
 *   <li>{@link secretVotingScheme.Counter#getResults <em>Results</em>}</li>
 *   <li>{@link secretVotingScheme.Counter#getAnonymouschannel <em>Anonymouschannel</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getCounter()
 * @model
 * @generated
 */
public interface Counter extends MessageListener {
	/**
	 * Returns the value of the '<em><b>Ballots List</b></em>' reference list.
	 * The list contents are of type {@link secretVotingScheme.Ballot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ballots List</em>' reference list.
	 * @see secretVotingScheme.SecretVotingSchemePackage#getCounter_BallotsList()
	 * @model
	 * @generated
	 */
	EList<Ballot> getBallotsList();

	/**
	 * Returns the value of the '<em><b>Results</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Results</em>' attribute.
	 * @see #setResults(Map)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getCounter_Results()
	 * @model transient="true"
	 * @generated
	 */
	Map getResults();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Counter#getResults <em>Results</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Results</em>' attribute.
	 * @see #getResults()
	 * @generated
	 */
	void setResults(Map value);

	/**
	 * Returns the value of the '<em><b>Anonymouschannel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anonymouschannel</em>' reference.
	 * @see #setAnonymouschannel(AnonymousChannel)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getCounter_Anonymouschannel()
	 * @model required="true"
	 * @generated
	 */
	AnonymousChannel getAnonymouschannel();

	/**
	 * Sets the value of the '{@link secretVotingScheme.Counter#getAnonymouschannel <em>Anonymouschannel</em>}' reference.
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
	void collectBallots();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void publishBallotsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void openVotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void countVotes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void announceResults();

} // Counter
