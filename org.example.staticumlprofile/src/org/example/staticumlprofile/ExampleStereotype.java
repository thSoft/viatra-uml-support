/**
 */
package org.example.staticumlprofile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Example Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.example.staticumlprofile.ExampleStereotype#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.example.staticumlprofile.ExampleStereotype#getExampleProperty <em>Example Property</em>}</li>
 * </ul>
 *
 * @see org.example.staticumlprofile.StaticUmlProfilePackage#getExampleStereotype()
 * @model
 * @generated
 */
public interface ExampleStereotype extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.example.staticumlprofile.StaticUmlProfilePackage#getExampleStereotype_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.example.staticumlprofile.ExampleStereotype#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Example Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example Property</em>' attribute.
	 * @see #setExampleProperty(String)
	 * @see org.example.staticumlprofile.StaticUmlProfilePackage#getExampleStereotype_ExampleProperty()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getExampleProperty();

	/**
	 * Sets the value of the '{@link org.example.staticumlprofile.ExampleStereotype#getExampleProperty <em>Example Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example Property</em>' attribute.
	 * @see #getExampleProperty()
	 * @generated
	 */
	void setExampleProperty(String value);

} // ExampleStereotype
