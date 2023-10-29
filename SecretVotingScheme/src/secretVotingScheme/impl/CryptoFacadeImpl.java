/**
 */
package secretVotingScheme.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import secretVotingScheme.CryptoFacade;
import secretVotingScheme.SecretVotingSchemePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Crypto Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CryptoFacadeImpl extends MinimalEObjectImpl.Container implements CryptoFacade {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CryptoFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SecretVotingSchemePackage.Literals.CRYPTO_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void encrypt() {
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
	public void decrypt() {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SecretVotingSchemePackage.CRYPTO_FACADE___ENCRYPT:
				encrypt();
				return null;
			case SecretVotingSchemePackage.CRYPTO_FACADE___DECRYPT:
				decrypt();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CryptoFacadeImpl
