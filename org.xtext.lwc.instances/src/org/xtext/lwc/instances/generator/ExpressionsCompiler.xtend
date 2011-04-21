package org.xtext.lwc.instances.generator

import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import org.xtext.lwc.instances.instances.DateLiteral
import org.eclipse.xtext.xbase.compiler.IAppendable
import java.util.Date
import java.util.Calendar
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XVariableDeclaration

class ExpressionsCompiler extends XbaseCompiler {
	
	dispatch void toJavaStatement(DateLiteral expr, IAppendable b, boolean isReferenced) {
		val name = b.declareVariable(expr, '_date')
		b.append('''
			java.util.Date «name» = new java.util.Date();
			«name».setDate(«expr.day»);
			«name».setMonth(«expr.month»);
			«name».setYear(«expr.year»);
		''');
	}
	
	dispatch void toJavaExpression(DateLiteral expr, IAppendable b) {
		b.append(b.getName(expr))
	}
	
	override void appendFeatureCall(XAbstractFeatureCall call, IAppendable b) {
		switch varDecl : call.getFeature() { 
			XVariableDeclaration :
				b.append("get"+ varDecl.name.toFirstUpper +"()")
			default :
				super.appendFeatureCall(call, b)
		}
	}
}