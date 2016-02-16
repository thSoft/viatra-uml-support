/**
 */
package org.example.staticumlprofile.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.example.staticumlprofile.ExampleStereotype;
import org.example.staticumlprofile.StaticUmlProfilePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Stereotype</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.example.staticumlprofile.impl.ExampleStereotypeImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.example.staticumlprofile.impl.ExampleStereotypeImpl#getExampleProperty <em>Example Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExampleStereotypeImpl extends MinimalEObjectImpl.Container implements ExampleStereotype {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getExampleProperty() <em>Example Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExampleProperty() <em>Example Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExampleProperty()
	 * @generated
	 * @ordered
	 */
	protected String exampleProperty = EXAMPLE_PROPERTY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleStereotypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaticUmlProfilePackage.Literals.EXAMPLE_STEREOTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExampleProperty() {
		return exampleProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExampleProperty(String newExampleProperty) {
		String oldExampleProperty = exampleProperty;
		exampleProperty = newExampleProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY, oldExampleProperty, exampleProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY:
				return getExampleProperty();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY:
				setExampleProperty((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY:
				setExampleProperty(EXAMPLE_PROPERTY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__BASE_CLASS:
				return base_Class != null;
			case StaticUmlProfilePackage.EXAMPLE_STEREOTYPE__EXAMPLE_PROPERTY:
				return EXAMPLE_PROPERTY_EDEFAULT == null ? exampleProperty != null : !EXAMPLE_PROPERTY_EDEFAULT.equals(exampleProperty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (exampleProperty: ");
		result.append(exampleProperty);
		result.append(')');
		return result.toString();
	}

} //ExampleStereotypeImpl
