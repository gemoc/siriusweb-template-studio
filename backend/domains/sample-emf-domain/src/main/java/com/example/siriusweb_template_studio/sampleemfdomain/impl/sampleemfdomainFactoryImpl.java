/**
 */
package com.example.siriusweb_template_studio.sampleemfdomain.impl;

import com.example.siriusweb_template_studio.sampleemfdomain.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class sampleemfdomainFactoryImpl extends EFactoryImpl implements sampleemfdomainFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static sampleemfdomainFactory init() {
		try {
			sampleemfdomainFactory thesampleemfdomainFactory = (sampleemfdomainFactory) EPackage.Registry.INSTANCE
					.getEFactory(sampleemfdomainPackage.eNS_URI);
			if (thesampleemfdomainFactory != null) {
				return thesampleemfdomainFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new sampleemfdomainFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public sampleemfdomainFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case sampleemfdomainPackage.FSM:
			return createFSM();
		case sampleemfdomainPackage.STATE:
			return createState();
		case sampleemfdomainPackage.TRANSITION:
			return createTransition();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FSM createFSM() {
		FSMImpl fsm = new FSMImpl();
		return fsm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public sampleemfdomainPackage getsampleemfdomainPackage() {
		return (sampleemfdomainPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static sampleemfdomainPackage getPackage() {
		return sampleemfdomainPackage.eINSTANCE;
	}

} //sampleemfdomainFactoryImpl
