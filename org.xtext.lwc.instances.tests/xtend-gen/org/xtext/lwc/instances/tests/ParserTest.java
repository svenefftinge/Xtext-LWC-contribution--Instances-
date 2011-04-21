package org.xtext.lwc.instances.tests;

import com.google.inject.Inject;
import junit.framework.Assert;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.lwc.instances.instances.DateLiteral;
import org.xtext.lwc.instances.instances.Instance;
import org.xtext.lwc.instances.tests.AbstractTestCase;

@SuppressWarnings("all")
public class ParserTest extends AbstractTestCase {
  @Inject private ParseHelper<Instance> parser;
  
  public void testSimpleParsing() throws Exception {
    {
      StringConcatenation _builder = new StringConcatenation();
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
      _builder.append("make = \"VW\"");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("model = \"Touran\"");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      String _string = _builder.toString();
      Instance _parse = this.parser.parse(_string);
      final Instance inst = _parse;
      EList<XExpression> _expressions = inst.getExpressions();
      XExpression _head = IterableExtensions.<XExpression>head(_expressions);
      final XExpression varDecl = _head;
      boolean matched = false;
      if (!matched) {
        if (varDecl instanceof XVariableDeclaration) {
          final XVariableDeclaration varDecl_1 = (XVariableDeclaration) varDecl;
          matched=true;
          {
            JvmTypeReference _type = varDecl_1.getType();
            String _identifier = _type.getIdentifier();
            Assert.assertEquals("Person", _identifier);
            XExpression _right = varDecl_1.getRight();
            final XExpression block = _right;
            boolean matched_1 = false;
            if (!matched_1) {
              if (block instanceof XBlockExpression) {
                final XBlockExpression block_1 = (XBlockExpression) block;
                matched_1=true;
                {
                  EList<XExpression> _expressions_1 = block_1.getExpressions();
                  XExpression _head_1 = IterableExtensions.<XExpression>head(_expressions_1);
                  final XExpression ass = _head_1;
                  boolean matched_2 = false;
                  if (!matched_2) {
                    if (ass instanceof XAssignment) {
                      final XAssignment ass_1 = (XAssignment) ass;
                      matched_2=true;
                      XExpression _assignable = ass_1.getAssignable();
                      JvmIdentifiableElement _feature = ((XFeatureCall) _assignable).getFeature();
                      Assert.assertSame(block_1, _feature);
                    }
                  }
                  if (!matched_2) {
                    this.error();
                  }
                  EList<XExpression> _expressions_2 = block_1.getExpressions();
                  XExpression _get = _expressions_2.get(2);
                  final XExpression ass_2 = _get;
                  boolean matched_3 = false;
                  if (!matched_3) {
                    if (ass_2 instanceof XAssignment) {
                      final XAssignment ass_3 = (XAssignment) ass_2;
                      matched_3=true;
                      {
                        XExpression _value = ass_3.getValue();
                        final XExpression date = _value;
                        boolean matched_4 = false;
                        if (!matched_4) {
                          if (date instanceof DateLiteral) {
                            final DateLiteral date_1 = (DateLiteral) date;
                            matched_4=true;
                            {
                              int _day = date_1.getDay();
                              Assert.assertEquals(14, _day);
                              int _month = date_1.getMonth();
                              Assert.assertEquals(2, _month);
                              int _year = date_1.getYear();
                              Assert.assertEquals(1927, _year);
                            }
                          }
                        }
                        if (!matched_4) {
                          this.error();
                        }
                        JvmIdentifiableElement _feature_1 = ass_3.getFeature();
                        String _simpleName = _feature_1.getSimpleName();
                        Assert.assertEquals("setBirthdate", _simpleName);
                      }
                    }
                  }
                  if (!matched_3) {
                    this.error();
                  }
                }
              }
            }
            if (!matched_1) {
              this.error();
            }
          }
        }
      }
      if (!matched) {
        this.error();
      }
    }
  }
  
  public void error() {
    AssertionError _assertionError = new AssertionError();
    throw _assertionError;
  }
}