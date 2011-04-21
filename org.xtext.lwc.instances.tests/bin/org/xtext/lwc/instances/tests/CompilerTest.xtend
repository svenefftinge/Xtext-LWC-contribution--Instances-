package org.xtext.lwc.instances.tests

import org.eclipse.xtext.junit.util.ParseHelper
import org.xtext.lwc.instances.instances.Instance
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler$EclipseRuntimeDependentJavaCompiler
import org.eclipse.xtext.junit.validation.ValidationTestHelper
import org.xtext.lwc.instances.generator.InstancesGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.InMemoryFileSystemAccess
import junit.framework.Assert
import lwc.testdata.Person
import lwc.testdata.Car
import java.util.Date
import static org.junit.Assert.*

class CompilerTest extends AbstractTestCase {
	
	@Inject ParseHelper<Instance> as parser
	@Inject OnTheFlyJavaCompiler$EclipseRuntimeDependentJavaCompiler as javaCompiler
	@Inject ValidationTestHelper as validationHelper
	@Inject InstancesGenerator as generator
	
	override void setUp() {
		super.setUp
		javaCompiler.addClassPathOfClass(typeof(Person));
		javaCompiler.addClassPathOfClass(typeof(Car));
	}
	
	void testCompilation() {
		val instances = parser.parse('''
			import lwc.testdata.*
			Person p = {
				this.name = "Voelter"
				firstname = "Markus"
				birthdate = 14.02.1927
				ownedCar = c
			}
			Car c = {
				maker = "VW"
				model = "Touran"
			}
		''')
		validationHelper.assertNoErrors(instances)
		val fileAccess = new InMemoryFileSystemAccess()
		generator.doGenerate(instances.eResource, fileAccess)
		val clazz = javaCompiler.compileToClass('__synthetic0', fileAccess.files.get("__synthetic0.java").toString)
		val inst  = clazz.newInstance
		val p = clazz.getDeclaredMethod('getP').invoke(inst) as Person
		val c = clazz.getDeclaredMethod('getC').invoke(inst) as Car
		assertEquals( c, p.ownedCar )
		assertEquals( 14, p.birthdate.date )
		assertEquals( 2, p.birthdate.month )
		assertEquals( 1927, p.birthdate.year )
		
	}
	
}