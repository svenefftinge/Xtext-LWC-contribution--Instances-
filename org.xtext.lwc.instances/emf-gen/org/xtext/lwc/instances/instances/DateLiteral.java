/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lwc.instances.instances;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.lwc.instances.instances.DateLiteral#getDay <em>Day</em>}</li>
 *   <li>{@link org.xtext.lwc.instances.instances.DateLiteral#getMonth <em>Month</em>}</li>
 *   <li>{@link org.xtext.lwc.instances.instances.DateLiteral#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.lwc.instances.instances.InstancesPackage#getDateLiteral()
 * @model
 * @generated
 */
public interface DateLiteral extends XExpression
{
	/**
	 * Returns the value of the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' attribute.
	 * @see #setDay(int)
	 * @see org.xtext.lwc.instances.instances.InstancesPackage#getDateLiteral_Day()
	 * @model
	 * @generated
	 */
	int getDay();

	/**
	 * Sets the value of the '{@link org.xtext.lwc.instances.instances.DateLiteral#getDay <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' attribute.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(int value);

	/**
	 * Returns the value of the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Month</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Month</em>' attribute.
	 * @see #setMonth(int)
	 * @see org.xtext.lwc.instances.instances.InstancesPackage#getDateLiteral_Month()
	 * @model
	 * @generated
	 */
	int getMonth();

	/**
	 * Sets the value of the '{@link org.xtext.lwc.instances.instances.DateLiteral#getMonth <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Month</em>' attribute.
	 * @see #getMonth()
	 * @generated
	 */
	void setMonth(int value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see org.xtext.lwc.instances.instances.InstancesPackage#getDateLiteral_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link org.xtext.lwc.instances.instances.DateLiteral#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

} // DateLiteral
