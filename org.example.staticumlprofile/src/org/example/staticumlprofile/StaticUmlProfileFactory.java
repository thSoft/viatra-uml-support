/**
 */
package org.example.staticumlprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.example.staticumlprofile.StaticUmlProfilePackage
 * @generated
 */
public interface StaticUmlProfileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticUmlProfileFactory eINSTANCE = org.example.staticumlprofile.impl.StaticUmlProfileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Example Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example Stereotype</em>'.
	 * @generated
	 */
	ExampleStereotype createExampleStereotype();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StaticUmlProfilePackage getStaticUmlProfilePackage();

} //StaticUmlProfileFactory
