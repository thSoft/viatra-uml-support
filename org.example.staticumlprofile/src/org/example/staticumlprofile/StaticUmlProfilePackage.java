/**
 */
package org.example.staticumlprofile;

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
 * @see org.example.staticumlprofile.StaticUmlProfileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='StaticUmlProfile'"
 * @generated
 */
public interface StaticUmlProfilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "staticumlprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.example.staticumlprofile/StaticUmlProfile/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "StaticUmlProfile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaticUmlProfilePackage eINSTANCE = org.example.staticumlprofile.impl.StaticUmlProfilePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.example.staticumlprofile.impl.ExampleStereotypeImpl <em>Example Stereotype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.example.staticumlprofile.impl.ExampleStereotypeImpl
	 * @see org.example.staticumlprofile.impl.StaticUmlProfilePackageImpl#getExampleStereotype()
	 * @generated
	 */
	int EXAMPLE_STEREOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_STEREOTYPE__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Example Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Example Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_STEREOTYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Example Stereotype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_STEREOTYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.example.staticumlprofile.ExampleStereotype <em>Example Stereotype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Stereotype</em>'.
	 * @see org.example.staticumlprofile.ExampleStereotype
	 * @generated
	 */
	EClass getExampleStereotype();

	/**
	 * Returns the meta object for the reference '{@link org.example.staticumlprofile.ExampleStereotype#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.example.staticumlprofile.ExampleStereotype#getBase_Class()
	 * @see #getExampleStereotype()
	 * @generated
	 */
	EReference getExampleStereotype_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.example.staticumlprofile.ExampleStereotype#getExampleProperty <em>Example Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example Property</em>'.
	 * @see org.example.staticumlprofile.ExampleStereotype#getExampleProperty()
	 * @see #getExampleStereotype()
	 * @generated
	 */
	EAttribute getExampleStereotype_ExampleProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaticUmlProfileFactory getStaticUmlProfileFactory();

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
		 * The meta object literal for the '{@link org.example.staticumlprofile.impl.ExampleStereotypeImpl <em>Example Stereotype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.example.staticumlprofile.impl.ExampleStereotypeImpl
		 * @see org.example.staticumlprofile.impl.StaticUmlProfilePackageImpl#getExampleStereotype()
		 * @generated
		 */
		EClass EXAMPLE_STEREOTYPE = eINSTANCE.getExampleStereotype();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_STEREOTYPE__BASE_CLASS = eINSTANCE.getExampleStereotype_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Example Property</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY = eINSTANCE.getExampleStereotype_ExampleProperty();

	}

} //StaticUmlProfilePackage
