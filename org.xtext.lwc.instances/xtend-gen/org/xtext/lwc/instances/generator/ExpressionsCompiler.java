package org.xtext.lwc.instances.generator;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
import org.eclipse.xtext.xbase.XIntLiteral;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.compiler.IAppendable;
import org.eclipse.xtext.xbase.compiler.XbaseCompiler;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;
import org.xtext.lwc.instances.instances.DateLiteral;

@SuppressWarnings("all")
public class ExpressionsCompiler extends XbaseCompiler {
  
  public void _toJavaStatement(final DateLiteral expr, final IAppendable b, final boolean isReferenced) {
    {
      String _declareVariable = b.declareVariable(expr, "_date");
      final String name = _declareVariable;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("java.util.Date ");
      _builder.append(name, "");
      _builder.append(" = new java.util.Date();");
      _builder.newLineIfNotEmpty();
      _builder.append(name, "");
      _builder.append(".setDate(");
      int _day = expr.getDay();
      _builder.append(_day, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(name, "");
      _builder.append(".setMonth(");
      int _month = expr.getMonth();
      _builder.append(_month, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      _builder.append(name, "");
      _builder.append(".setYear(");
      int _year = expr.getYear();
      _builder.append(_year, "");
      _builder.append(");");
      _builder.newLineIfNotEmpty();
      b.append(_builder);
    }
  }
  
  public void _toJavaExpression(final DateLiteral expr, final IAppendable b) {
    String _name = b.getName(expr);
    b.append(_name);
  }
  
  public void appendFeatureCall(final XAbstractFeatureCall call, final IAppendable b) {
    JvmIdentifiableElement _feature = call.getFeature();
    final JvmIdentifiableElement varDecl = _feature;
    boolean matched = false;
    if (!matched) {
      if (varDecl instanceof XVariableDeclaration) {
        final XVariableDeclaration varDecl_1 = (XVariableDeclaration) varDecl;
        matched=true;
        String _name = varDecl_1.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name);
        String _operator_plus = StringExtensions.operator_plus("get", _firstUpper);
        String _operator_plus_1 = StringExtensions.operator_plus(_operator_plus, "()");
        b.append(_operator_plus_1);
      }
    }
    if (!matched) {
      super.appendFeatureCall(call, b);
    }
  }
  
  public void toJavaStatement(final Object arg0, final IAppendable arg1, final Boolean arg2) {
    if ((arg0 instanceof XDoWhileExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XDoWhileExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XWhileExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XWhileExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XAbstractFeatureCall)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XAbstractFeatureCall)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XBlockExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XBlockExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XBooleanLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XBooleanLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XCastedExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XCastedExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XClosure)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XClosure)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XConstructorCall)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XConstructorCall)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XForLoopExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XForLoopExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XIfExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XIfExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XInstanceOfExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XInstanceOfExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XIntLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XIntLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XNullLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XNullLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XReturnExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XReturnExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XStringLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XStringLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XSwitchExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XSwitchExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XThrowExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XThrowExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XTryCatchFinallyExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XTryCatchFinallyExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XTypeLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XTypeLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XVariableDeclaration)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XVariableDeclaration)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof DateLiteral)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((DateLiteral)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 instanceof XExpression)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((XExpression)arg0, (IAppendable)arg1, (Boolean)arg2);
    } else if ((arg0 == null)
         && (arg1 instanceof IAppendable)
         && (arg2 instanceof Boolean)) {
      _toJavaStatement((Void)null, (IAppendable)arg1, (Boolean)arg2);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public void toJavaExpression(final Object arg0, final IAppendable arg1) {
    if ((arg0 instanceof XDoWhileExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XDoWhileExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XWhileExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XWhileExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XAbstractFeatureCall)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XAbstractFeatureCall)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XBlockExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XBlockExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XBooleanLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XBooleanLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XCastedExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XCastedExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XClosure)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XClosure)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XConstructorCall)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XConstructorCall)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XForLoopExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XForLoopExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XIfExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XIfExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XInstanceOfExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XInstanceOfExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XIntLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XIntLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XNullLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XNullLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XReturnExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XReturnExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XStringLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XStringLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XSwitchExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XSwitchExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XThrowExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XThrowExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XTryCatchFinallyExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XTryCatchFinallyExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XTypeLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XTypeLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XVariableDeclaration)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XVariableDeclaration)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof DateLiteral)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((DateLiteral)arg0, (IAppendable)arg1);
    } else if ((arg0 instanceof XExpression)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((XExpression)arg0, (IAppendable)arg1);
    } else if ((arg0 == null)
         && (arg1 instanceof IAppendable)) {
      _toJavaExpression((Void)null, (IAppendable)arg1);
    } else {
      throw new IllegalArgumentException();
    }
  }
}