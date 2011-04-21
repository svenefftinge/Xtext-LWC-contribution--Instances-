package org.xtext.lwc.instances.generator;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.compiler.StringBuilderBasedAppendable;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.lwc.instances.generator.ExpressionsCompiler;
import org.xtext.lwc.instances.instances.Instance;
import org.xtext.lwc.instances.instances.ObjectLiteral;

@SuppressWarnings("all")
public class InstancesGenerator implements IGenerator {
  @Inject private ExpressionsCompiler compiler;
  
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) throws IllegalArgumentException {
    {
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      final Instance instance = ((Instance) _head);
      URI _uRI = resource.getURI();
      String _lastSegment = _uRI.lastSegment();
      final String lastSegment = _lastSegment;
      int _indexOf = lastSegment.indexOf(".");
      String _substring = lastSegment.substring(0, _indexOf);
      final String simpleFileName = _substring;
      boolean _operator_notEquals = ObjectExtensions.operator_notEquals(instance, null);
      if (_operator_notEquals) {
        String _operator_plus = StringExtensions.operator_plus(simpleFileName, ".java");
        StringConcatenation _generateJavaFile = this.generateJavaFile(instance, simpleFileName);
        fsa.generateFile(_operator_plus, _generateJavaFile);
      }
    }
  }
  
  public StringConcatenation generateJavaFile(final Instance inst, final String name) throws IllegalArgumentException {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public class ");
    _builder.append(name, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<XExpression> _expressions = inst.getExpressions();
      Iterable<XVariableDeclaration> _filter = IterableExtensions.<XVariableDeclaration>filter(_expressions, org.eclipse.xtext.xbase.XVariableDeclaration.class);
      for(XVariableDeclaration varDecl : _filter) {
        _builder.append("\t");
        _builder.append("private ");
        JvmTypeReference _type = varDecl.getType();
        String _identifier = _type.getIdentifier();
        _builder.append(_identifier, "	");
        _builder.append(" ");
        String _name = varDecl.getName();
        _builder.append(_name, "	");
        _builder.append(" = null;");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public ");
        JvmTypeReference _type_1 = varDecl.getType();
        String _identifier_1 = _type_1.getIdentifier();
        _builder.append(_identifier_1, "	");
        _builder.append(" get");
        String _name_1 = varDecl.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "	");
        _builder.append("() {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("if (");
        String _name_2 = varDecl.getName();
        _builder.append(_name_2, "		");
        _builder.append(" == null) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        String _name_3 = varDecl.getName();
        _builder.append(_name_3, "			");
        _builder.append(" = new ");
        JvmTypeReference _type_2 = varDecl.getType();
        String _identifier_2 = _type_2.getIdentifier();
        _builder.append(_identifier_2, "			");
        _builder.append("();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        XExpression _right = varDecl.getRight();
        String _name_4 = varDecl.getName();
        String _generateExpression = this.generateExpression(_right, _name_4);
        _builder.append(_generateExpression, "			");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return ");
        String _name_5 = varDecl.getName();
        _builder.append(_name_5, "		");
        _builder.append("; ");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String _generateExpression(final XExpression expr, final String name) throws IllegalArgumentException {
    IllegalArgumentException _illegalArgumentException = new IllegalArgumentException();
    throw _illegalArgumentException;
  }
  
  public String _generateExpression(final ObjectLiteral expr, final String name) {
    {
      StringBuilderBasedAppendable _stringBuilderBasedAppendable = new StringBuilderBasedAppendable();
      final StringBuilderBasedAppendable appendable = _stringBuilderBasedAppendable;
      appendable.declareVariable(expr, name);
      EList<XExpression> _expressions = expr.getExpressions();
      for (XExpression e : _expressions) {
        this.compiler.toJavaStatement(e, appendable, false);
      }
      String _string = appendable.toString();
      return _string;
    }
  }
  
  public String generateExpression(final XExpression expr, final String name) throws IllegalArgumentException {
    if ((expr instanceof ObjectLiteral)
         && (name instanceof String)) {
      return _generateExpression((ObjectLiteral)expr, (String)name);
    } else if ((expr instanceof XExpression)
         && (name instanceof String)) {
      return _generateExpression((XExpression)expr, (String)name);
    } else {
      throw new IllegalArgumentException();
    }
  }
}