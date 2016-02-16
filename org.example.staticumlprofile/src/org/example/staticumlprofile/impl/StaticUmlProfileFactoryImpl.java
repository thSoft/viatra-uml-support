/**
 */
package org.example.staticumlprofile.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.example.staticumlprofile.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaticUmlProfileFactoryImpl extends EFactoryImpl implements StaticUmlProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaticUmlProfileFactory init() {
		try {
			StaticUmlProfileFactory theStaticUmlProfileFactory = (StaticUmlProfileFactory)EPackage.Registry.INSTANCE.getEFactory(StaticUmlProfilePackage.eNS_URI);
			if (theStaticUmlProfileFactory != null) {
				return theStaticUmlProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaticUmlProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUmlProfileFactoryImpl() {
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
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE: return createExampleStereotype();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleStereotype createExampleStereotype() {
		ExampleStereotypeImpl exampleStereotype = new ExampleStereotypeImpl();
		return exampleStereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticUmlProfilePackage getStaticUmlProfilePackage() {
		return (StaticUmlProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StaticUmlProfilePackage getPackage() {
		return StaticUmlProfilePackage.eINSTANCE;
	}

} //StaticUmlProfileFactoryImpl
