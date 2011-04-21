package org.xtext.lwc.instances.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.junit.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.junit.Assert;
import org.xtext.lwc.instances.instances.Instance;
import org.xtext.lwc.instances.tests.AbstractTestCase;

@SuppressWarnings("all")
public class ValidationTest extends AbstractTestCase {
  @Inject private ParseHelper<Instance> parser;
  @Inject private ValidationTestHelper validator;
  
  public void testConformanceOfDates() throws Exception {
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Person p = {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("birthdate = 17.02.1927");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _string = _builder.toString();
      Instance _parse = this.parser.parse(_string);
      final Instance p = _parse;
      EList<XExpression> _expressions = p.getExpressions();
      XExpression _head = IterableExtensions.<XExpression>head(_expressions);
      final XExpression varDecl = _head;
      boolean matched = false;
      if (!matched) {
        if (varDecl instanceof XVariableDeclaration) {
          final XVariableDeclaration varDecl_1 = (XVariableDeclaration) varDecl;
          matched=true;
          XExpression _right = varDecl_1.getRight();
          final XExpression block = _right;
          boolean matched_1 = false;
          if (!matched_1) {
            if (block instanceof XBlockExpression) {
              final XBlockExpression block_1 = (XBlockExpression) block;
              matched_1=true;
              EList<XExpression> _expressions_1 = block_1.getExpressions();
              XExpression _head_1 = IterableExtensions.<XExpression>head(_expressions_1);
              final XExpression ass = _head_1;
              boolean matched_2 = false;
              if (!matched_2) {
                if (ass instanceof XAssignment) {
                  final XAssignment ass_1 = (XAssignment) ass;
                  matched_2=true;
                  JvmIdentifiableElement _feature = ass_1.getFeature();
                  String _simpleName = _feature.getSimpleName();
                  Assert.assertEquals("setBirthdate", _simpleName);
                }
              }
            }
          }
        }
      }
    }
  }
}