package org.xtext.lwc.instances.tests;

import com.google.inject.Inject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import lwc.testdata.Car;
import lwc.testdata.Person;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.compiler.OnTheFlyJavaCompiler.EclipseRuntimeDependentJavaCompiler;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.xtext.lwc.instances.generator.InstancesGenerator;
import org.xtext.lwc.instances.instances.Instance;
import org.xtext.lwc.instances.tests.AbstractTestCase;

@SuppressWarnings("all")
public class CompilerTest extends AbstractTestCase {
  @Inject private ParseHelper<Instance> parser;
  @Inject private EclipseRuntimeDependentJavaCompiler javaCompiler;
  @Inject private ValidationTestHelper validationHelper;
  @Inject private InstancesGenerator generator;
  
  public void setUp() {
    {
      super.setUp();
      this.javaCompiler.addClassPathOfClass(lwc.testdata.Person.class);
      this.javaCompiler.addClassPathOfClass(lwc.testdata.Car.class);
    }
  }
  
  public void testCompilation() throws Exception, IllegalAccessException, IllegalArgumentException, InstantiationException, NoSuchMethodException, SecurityException, InvocationTargetException {
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("import lwc.testdata.*");
      _builder.newLine();
      _builder.append("Person p = {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.name = \"Voelter\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("firstname = \"Markus\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("birthdate = 14.02.1927");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("ownedCar = c");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("Car c = {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("maker = \"VW\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("model = \"Touran\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      Instance _parse = this.parser.parse(_builder);
      final Instance instances = _parse;
      this.validationHelper.assertNoErrors(instances);
      InMemoryFileSystemAccess _inMemoryFileSystemAccess = new InMemoryFileSystemAccess();
      final InMemoryFileSystemAccess fileAccess = _inMemoryFileSystemAccess;
      Resource _eResource = instances.eResource();
      this.generator.doGenerate(_eResource, fileAccess);
      Map<String,CharSequence> _files = fileAccess.getFiles();
      CharSequence _get = _files.get("__synthetic0.java");
      String _string = _get.toString();
      Class<? extends Object> _compileToClass = this.javaCompiler.compileToClass("__synthetic0", _string);
      final Class<? extends Object> clazz = _compileToClass;
      final Class<? extends Object> typeConverted_clazz = (Class<? extends Object>)clazz;
      Object _newInstance = typeConverted_clazz.newInstance();
      final Object inst = _newInstance;
      Method _declaredMethod = clazz.getDeclaredMethod("getP");
      Object _invoke = _declaredMethod.invoke(inst);
      final Person p = ((Person) _invoke);
      Method _declaredMethod_1 = clazz.getDeclaredMethod("getC");
      Object _invoke_1 = _declaredMethod_1.invoke(inst);
      final Car c = ((Car) _invoke_1);
      Car _ownedCar = p.getOwnedCar();
      Assert.assertEquals(c, _ownedCar);
      Date _birthdate = p.getBirthdate();
      int _date = _birthdate.getDate();
      Assert.assertEquals(14, _date);
      Date _birthdate_1 = p.getBirthdate();
      int _month = _birthdate_1.getMonth();
      Assert.assertEquals(2, _month);
      Date _birthdate_2 = p.getBirthdate();
      int _year = _birthdate_2.getYear();
      Assert.assertEquals(1927, _year);
    }
  }
}