/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lwc.instances.instances.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.xtext.lwc.instances.instances.DateLiteral;
import org.xtext.lwc.instances.instances.InstancesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.lwc.instances.instances.impl.DateLiteralImpl#getDay <em>Day</em>}</li>
 *   <li>{@link org.xtext.lwc.instances.instances.impl.DateLiteralImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.xtext.lwc.instances.instances.impl.DateLiteralImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateLiteralImpl extends XExpressionImpl implements DateLiteral
{
	/**
	 * The default value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected static final int DAY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected int day = DAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateLiteralImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return InstancesPackage.Literals.DATE_LITERAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDay()
	{
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(int newDay)
	{
		int oldDay = day;
		day = newDay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.DATE_LITERAL__DAY, oldDay, day));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth()
	{
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth)
	{
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.DATE_LITERAL__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear()
	{
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear)
	{
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InstancesPackage.DATE_LITERAL__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case InstancesPackage.DATE_LITERAL__DAY:
				return getDay();
			case InstancesPackage.DATE_LITERAL__MONTH:
				return getMonth();
			case InstancesPackage.DATE_LITERAL__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case InstancesPackage.DATE_LITERAL__DAY:
				setDay((Integer)newValue);
				return;
			case InstancesPackage.DATE_LITERAL__MONTH:
				setMonth((Integer)newValue);
				return;
			case InstancesPackage.DATE_LITERAL__YEAR:
				setYear((Integer)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case InstancesPackage.DATE_LITERAL__DAY:
				setDay(DAY_EDEFAULT);
				return;
			case InstancesPackage.DATE_LITERAL__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case InstancesPackage.DATE_LITERAL__YEAR:
				setYear(YEAR_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case InstancesPackage.DATE_LITERAL__DAY:
				return day != DAY_EDEFAULT;
			case InstancesPackage.DATE_LITERAL__MONTH:
				return month != MONTH_EDEFAULT;
			case InstancesPackage.DATE_LITERAL__YEAR:
				return year != YEAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (day: ");
		result.append(day);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //DateLiteralImpl
