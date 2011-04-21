package org.xtext.lwc.instances.typesystem

import org.eclipse.xtext.xbase.typing.XbaseTypeProvider
import org.eclipse.xtext.xbase.XBlockExpression
import org.xtext.lwc.instances.instances.DateLiteral
import org.xtext.lwc.instances.instances.ObjectLiteral
import java.util.Date

class InstancesTypeProvider extends XbaseTypeProvider {
	
	dispatch type(ObjectLiteral block, boolean rawTypeOnly) {
		val expected = getExpectedType(block, rawTypeOnly)
		if (expected==null) 
			return typeReferences.getTypeForName(typeof(Object),block)
		return expected
	}
	 
	dispatch type(DateLiteral date, boolean rawTypeOnly) {
		return typeReferences.getTypeForName(typeof(Date), date)
	} 
	
	dispatch typeForIdentifiable(ObjectLiteral literal, boolean rawType) {
		return getExpectedType(literal, rawType)
	}
}