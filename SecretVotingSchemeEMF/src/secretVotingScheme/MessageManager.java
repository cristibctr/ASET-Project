/**
 */
package secretVotingScheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link secretVotingScheme.MessageManager#getMessagelistener <em>Messagelistener</em>}</li>
 * </ul>
 *
 * @see secretVotingScheme.SecretVotingSchemePackage#getMessageManager()
 * @model
 * @generated
 */
public interface MessageManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Messagelistener</b></em>' containment reference list.
	 * The list contents are of type {@link secretVotingScheme.MessageListener}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messagelistener</em>' containment reference list.
	 * @see secretVotingScheme.SecretVotingSchemePackage#getMessageManager_Messagelistener()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageListener> getMessagelistener();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void subscribe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void unsubscribe();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void notifyMessage();

} // MessageManager
