/**
 */
package com.example.siriusweb_template_studio.sampleemfdomain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.example.siriusweb_template_studio.sampleemfdomain.sampleemfdomainFactory
 * @model kind="package"
 * @generated
 */
public interface sampleemfdomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sampleemfdomain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/sampleemfdomain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "sampleemfdomain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	sampleemfdomainPackage eINSTANCE = com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.FSMImpl <em>FSM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.FSMImpl
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getFSM()
	 * @generated
	 */
	int FSM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Owned States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__OWNED_STATES = 1;

	/**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__INITIAL_STATE = 2;

	/**
	 * The feature id for the '<em><b>Final State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM__FINAL_STATE = 3;

	/**
	 * The number of structural features of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>FSM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.StateImpl
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = 2;

	/**
	 * The feature id for the '<em><b>Owning FSM</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OWNING_FSM = 3;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.TransitionImpl
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM <em>FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSM</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM
	 * @generated
	 */
	EClass getFSM();

	/**
	 * Returns the meta object for the attribute '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM#getName()
	 * @see #getFSM()
	 * @generated
	 */
	EAttribute getFSM_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getOwnedStates <em>Owned States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned States</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM#getOwnedStates()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_OwnedStates();

	/**
	 * Returns the meta object for the reference '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM#getInitialState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_InitialState();

	/**
	 * Returns the meta object for the reference '{@link com.example.siriusweb_template_studio.sampleemfdomain.FSM#getFinalState <em>Final State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Final State</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.FSM#getFinalState()
	 * @see #getFSM()
	 * @generated
	 */
	EReference getFSM_FinalState();

	/**
	 * Returns the meta object for class '{@link com.example.siriusweb_template_studio.sampleemfdomain.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State#getOutgoingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OutgoingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State#getIncomingTransitions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_IncomingTransitions();

	/**
	 * Returns the meta object for the container reference '{@link com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM <em>Owning FSM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owning FSM</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.State#getOwningFSM()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_OwningFSM();

	/**
	 * Returns the meta object for class '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getInput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Input();

	/**
	 * Returns the meta object for the reference '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the attribute '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getName()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getOutput()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Output();

	/**
	 * Returns the meta object for the container reference '{@link com.example.siriusweb_template_studio.sampleemfdomain.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see com.example.siriusweb_template_studio.sampleemfdomain.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	sampleemfdomainFactory getsampleemfdomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.FSMImpl <em>FSM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.FSMImpl
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getFSM()
		 * @generated
		 */
		EClass FSM = eINSTANCE.getFSM();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FSM__NAME = eINSTANCE.getFSM_Name();

		/**
		 * The meta object literal for the '<em><b>Owned States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__OWNED_STATES = eINSTANCE.getFSM_OwnedStates();

		/**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__INITIAL_STATE = eINSTANCE.getFSM_InitialState();

		/**
		 * The meta object literal for the '<em><b>Final State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FSM__FINAL_STATE = eINSTANCE.getFSM_FinalState();

		/**
		 * The meta object literal for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.StateImpl
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING_TRANSITIONS = eINSTANCE.getState_OutgoingTransitions();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING_TRANSITIONS = eINSTANCE.getState_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Owning FSM</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OWNING_FSM = eINSTANCE.getState_OwningFSM();

		/**
		 * The meta object literal for the '{@link com.example.siriusweb_template_studio.sampleemfdomain.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.TransitionImpl
		 * @see com.example.siriusweb_template_studio.sampleemfdomain.impl.sampleemfdomainPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__INPUT = eINSTANCE.getTransition_Input();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NAME = eINSTANCE.getTransition_Name();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OUTPUT = eINSTANCE.getTransition_Output();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

	}

} //sampleemfdomainPackage
