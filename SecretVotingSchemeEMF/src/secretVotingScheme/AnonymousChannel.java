/**
 */
package secretVotingScheme;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anonymous Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.AnonymousChannel#getMessagemanager <em>Messagemanager</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getAnonymousChannel()
 * @model
 * @generated
 */
public interface AnonymousChannel extends EObject {
	/**
	 * Returns the value of the '<em><b>Messagemanager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagemanager</em>' containment reference.
	 * @see #setMessagemanager(MessageManager)
	 * @see secretVotingScheme.SecretVotingSchemePackage#getAnonymousChannel_Messagemanager()
	 * @model containment="true"
	 * @generated
	 */
	MessageManager getMessagemanager();

	/**
	 * Sets the value of the '{@link secretVotingScheme.AnonymousChannel#getMessagemanager <em>Messagemanager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messagemanager</em>' containment reference.
	 * @see #getMessagemanager()
	 * @generated
	 */
	void setMessagemanager(MessageManager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sendMessage();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void receiveMessage();

} // AnonymousChannel
