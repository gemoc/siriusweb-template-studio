/**
 */
package com.example.siriusweb_template_studio.sampleemfdomain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getName <em>Name</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM <em>Owning FSM</em>}</li>
 * </ul>
 *
 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link com.example.siriusweb_template_studio.sampleemfdomain.Transition}.
	 * It is bidirectional and its opposite is '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getState_OutgoingTransitions()
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link com.example.siriusweb_template_studio.sampleemfdomain.Transition}.
	 * It is bidirectional and its opposite is '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getState_IncomingTransitions()
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Owning FSM</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning FSM</em>' container reference.
	 * @see #setOwningFSM(FSM)
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainPackage#getState_OwningFSM()
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM#getOwnedStates
	 * @model opposite="ownedStates" required="true" transient="false"
	 * @generated
	 */
	FSM getOwningFSM();

	/**
	 * Sets the value of the '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM <em>Owning FSM</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning FSM</em>' container reference.
	 * @see #getOwningFSM()
	 * @generated
	 */
	void setOwningFSM(FSM value);

} // State
