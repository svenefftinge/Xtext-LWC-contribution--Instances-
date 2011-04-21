/**
 * <copyright>
 * </copyright>
 *
 */
package org.xtext.lwc.instances.instances;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.common.types.TypesPackage;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.lwc.instances.instances.InstancesFactory
 * @model kind="package"
 * @generated
 */
public interface InstancesPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "instances";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.xtext.org/lwc/instances/Instances";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "instances";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InstancesPackage eINSTANCE = org.xtext.lwc.instances.instances.impl.InstancesPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.xtext.lwc.instances.instances.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.lwc.instances.instances.impl.InstanceImpl
	 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__EXPRESSIONS = 1;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.xtext.lwc.instances.instances.impl.ImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.lwc.instances.instances.impl.ImportImpl
	 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getImport()
	 * @generated
	 */
	int IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.xtext.lwc.instances.instances.impl.DateLiteralImpl <em>Date Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.lwc.instances.instances.impl.DateLiteralImpl
	 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getDateLiteral()
	 * @generated
	 */
	int DATE_LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__DAY = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__MONTH = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL__YEAR = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Date Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_LITERAL_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.xtext.lwc.instances.instances.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtext.lwc.instances.instances.impl.ObjectLiteralImpl
	 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getObjectLiteral()
	 * @generated
	 */
	int OBJECT_LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LITERAL__EXPRESSIONS = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_LITERAL_FEATURE_COUNT = TypesPackage.JVM_IDENTIFIABLE_ELEMENT_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.xtext.lwc.instances.instances.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see org.xtext.lwc.instances.instances.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.lwc.instances.instances.Instance#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.xtext.lwc.instances.instances.Instance#getImports()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtext.lwc.instances.instances.Instance#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.xtext.lwc.instances.instances.Instance#getExpressions()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Expressions();

	/**
	 * Returns the meta object for class '{@link org.xtext.lwc.instances.instances.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.xtext.lwc.instances.instances.Import
	 * @generated
	 */
	EClass getImport();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.lwc.instances.instances.Import#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.xtext.lwc.instances.instances.Import#getImportedNamespace()
	 * @see #getImport()
	 * @generated
	 */
	EAttribute getImport_ImportedNamespace();

	/**
	 * Returns the meta object for class '{@link org.xtext.lwc.instances.instances.DateLiteral <em>Date Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Literal</em>'.
	 * @see org.xtext.lwc.instances.instances.DateLiteral
	 * @generated
	 */
	EClass getDateLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.lwc.instances.instances.DateLiteral#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.xtext.lwc.instances.instances.DateLiteral#getDay()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.lwc.instances.instances.DateLiteral#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.xtext.lwc.instances.instances.DateLiteral#getMonth()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.xtext.lwc.instances.instances.DateLiteral#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see org.xtext.lwc.instances.instances.DateLiteral#getYear()
	 * @see #getDateLiteral()
	 * @generated
	 */
	EAttribute getDateLiteral_Year();

	/**
	 * Returns the meta object for class '{@link org.xtext.lwc.instances.instances.ObjectLiteral <em>Object Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Literal</em>'.
	 * @see org.xtext.lwc.instances.instances.ObjectLiteral
	 * @generated
	 */
	EClass getObjectLiteral();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InstancesFactory getInstancesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.xtext.lwc.instances.instances.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.lwc.instances.instances.impl.InstanceImpl
		 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__IMPORTS = eINSTANCE.getInstance_Imports();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__EXPRESSIONS = eINSTANCE.getInstance_Expressions();

		/**
		 * The meta object literal for the '{@link org.xtext.lwc.instances.instances.impl.ImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.lwc.instances.instances.impl.ImportImpl
		 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getImport()
		 * @generated
		 */
		EClass IMPORT = eINSTANCE.getImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

		/**
		 * The meta object literal for the '{@link org.xtext.lwc.instances.instances.impl.DateLiteralImpl <em>Date Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.lwc.instances.instances.impl.DateLiteralImpl
		 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getDateLiteral()
		 * @generated
		 */
		EClass DATE_LITERAL = eINSTANCE.getDateLiteral();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__DAY = eINSTANCE.getDateLiteral_Day();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__MONTH = eINSTANCE.getDateLiteral_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_LITERAL__YEAR = eINSTANCE.getDateLiteral_Year();

		/**
		 * The meta object literal for the '{@link org.xtext.lwc.instances.instances.impl.ObjectLiteralImpl <em>Object Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtext.lwc.instances.instances.impl.ObjectLiteralImpl
		 * @see org.xtext.lwc.instances.instances.impl.InstancesPackageImpl#getObjectLiteral()
		 * @generated
		 */
		EClass OBJECT_LITERAL = eINSTANCE.getObjectLiteral();

	}

} //InstancesPackage
