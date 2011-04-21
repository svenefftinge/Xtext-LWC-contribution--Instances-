/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lwc.instances.instances;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lwc.instances.instances.Instance#getImports <em>Imports</em>}</li>
 *   <li>{@link org.xtext.lwc.instances.instances.Instance#getExpressions <em>Expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lwc.instances.instances.InstancesPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject
{
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtext.lwc.instances.instances.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.xtext.lwc.instances.instances.InstancesPackage#getInstance_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

	/**
	 * Returns the value of the '<em><b>Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expressions</em>' containment reference list.
	 * @see org.xtext.lwc.instances.instances.InstancesPackage#getInstance_Expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<XExpression> getExpressions();

} // Instance
