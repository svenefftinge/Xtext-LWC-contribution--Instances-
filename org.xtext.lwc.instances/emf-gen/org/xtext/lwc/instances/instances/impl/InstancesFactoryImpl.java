/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lwc.instances.instances.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.lwc.instances.instances.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InstancesFactoryImpl extends EFactoryImpl implements InstancesFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstancesFactory init()
	{
		try
		{
			InstancesFactory theInstancesFactory = (InstancesFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/lwc/instances/Instances"); 
			if (theInstancesFactory != null)
			{
				return theInstancesFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new InstancesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case InstancesPackage.INSTANCE: return createInstance();
			case InstancesPackage.IMPORT: return createImport();
			case InstancesPackage.DATE_LITERAL: return createDateLiteral();
			case InstancesPackage.OBJECT_LITERAL: return createObjectLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance()
	{
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport()
	{
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateLiteral createDateLiteral()
	{
		DateLiteralImpl dateLiteral = new DateLiteralImpl();
		return dateLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectLiteral createObjectLiteral()
	{
		ObjectLiteralImplCustom objectLiteral = new ObjectLiteralImplCustom();
		return objectLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstancesPackage getInstancesPackage()
	{
		return (InstancesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static InstancesPackage getPackage()
	{
		return InstancesPackage.eINSTANCE;
	}

} //InstancesFactoryImpl
