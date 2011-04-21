package org.xtext.lwc.instances.typesystem;

import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XAbstractWhileExpression;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
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
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtext.lwc.instances.instances.DateLiteral;
import org.xtext.lwc.instances.instances.ObjectLiteral;

@SuppressWarnings("all")
public class InstancesTypeProvider extends XbaseTypeProvider {
  
  public JvmTypeReference _type(final ObjectLiteral block, final boolean rawTypeOnly) {
    {
      JvmTypeReference _expectedType = this.getExpectedType(block, rawTypeOnly);
      final JvmTypeReference expected = _expectedType;
      boolean _operator_equals = ObjectExtensions.operator_equals(expected, null);
      if (_operator_equals) {
        TypeReferences _typeReferences = this.getTypeReferences();
        JvmTypeReference _typeForName = _typeReferences.getTypeForName(java.lang.Object.class, block);
        return _typeForName;
      }
      return expected;
    }
  }
  
  public JvmTypeReference _type(final DateLiteral date, final boolean rawTypeOnly) {
    TypeReferences _typeReferences = this.getTypeReferences();
    JvmTypeReference _typeForName = _typeReferences.getTypeForName(java.util.Date.class, date);
    return _typeForName;
  }
  
  public JvmTypeReference _typeForIdentifiable(final ObjectLiteral literal, final boolean rawType) {
    JvmTypeReference _expectedType = this.getExpectedType(literal, rawType);
    return _expectedType;
  }
  
  public JvmTypeReference type(final XExpression block, final Boolean rawTypeOnly) {
    if ((block instanceof ObjectLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((ObjectLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XAbstractFeatureCall)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XAbstractFeatureCall)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XAbstractWhileExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XAbstractWhileExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XBlockExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XBlockExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XBooleanLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XBooleanLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XCastedExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XCastedExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XClosure)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XClosure)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XConstructorCall)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XConstructorCall)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XForLoopExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XForLoopExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XIfExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XIfExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XInstanceOfExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XInstanceOfExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XIntLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XIntLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XNullLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XNullLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XReturnExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XReturnExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XStringLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XStringLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XSwitchExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XSwitchExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XThrowExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XThrowExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XTryCatchFinallyExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XTryCatchFinallyExpression)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XTypeLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XTypeLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XVariableDeclaration)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XVariableDeclaration)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof DateLiteral)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((DateLiteral)block, (Boolean)rawTypeOnly);
    } else if ((block instanceof XExpression)
         && (rawTypeOnly instanceof Boolean)) {
      return _type((XExpression)block, (Boolean)rawTypeOnly);
    } else {
      throw new IllegalArgumentException();
    }
  }
  
  public JvmTypeReference typeForIdentifiable(final JvmIdentifiableElement arg0, final Boolean arg1) {
    if ((arg0 instanceof JvmConstructor)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmConstructor)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof JvmOperation)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmOperation)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof JvmField)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmField)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof ObjectLiteral)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((ObjectLiteral)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof JvmFormalParameter)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmFormalParameter)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof JvmType)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmType)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof XCasePart)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((XCasePart)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof XSwitchExpression)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((XSwitchExpression)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof XVariableDeclaration)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((XVariableDeclaration)arg0, (Boolean)arg1);
    } else if ((arg0 instanceof JvmIdentifiableElement)
         && (arg1 instanceof Boolean)) {
      return _typeForIdentifiable((JvmIdentifiableElement)arg0, (Boolean)arg1);
    } else {
      throw new IllegalArgumentException();
    }
  }
}