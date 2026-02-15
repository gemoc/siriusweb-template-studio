/**
 */
package com.example.siriusweb_template_studio.sampleemfdomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getName <em>Name</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getOwnedStates <em>Owned States</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getFinalState <em>Final State</em>}</li>
 * </ul>
 *
 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getFSM()
 * @model
 * @generated
 */
public interface FSM extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getFSM_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owned States</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.siriusweb_template_studio.sampleemfdomain.State}.
	 * It is bidirectional and its opposite is '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned States</em>' containment reference list.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getFSM_OwnedStates()
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM
	 * @model opposite="owningFSM" containment="true"
	 * @generated
	 */
	EList<State> getOwnedStates();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(State)
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
	State getInitialState();

	/**
	 * Sets the value of the '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(State value);

	/**
	 * Returns the value of the '<em><b>Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final State</em>' reference.
	 * @see #setFinalState(State)
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getFSM_FinalState()
	 * @model
	 * @generated
	 */
	State getFinalState();

	/**
	 * Sets the value of the '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getFinalState <em>Final State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final State</em>' reference.
	 * @see #getFinalState()
	 * @generated
	 */
	void setFinalState(State value);

} // FSM
