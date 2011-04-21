package org.xtext.lwc.instances.tests

import org.eclipse.xtext.junit.util.ParseHelper
import org.xtext.lwc.instances.instances.Instance
import org.eclipse.xtext.junit.validation.ValidationTestHelper

import static org.junit.Assert.*
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XAssignment

class ValidationTest extends AbstractTestCase {
	
	@Inject ParseHelper<Instance> as parser
	@Inject ValidationTestHelper as validator
	
	testConformanceOfDates() {
		val p = parser.parse('''
			Person p = {
				birthdate = 17.02.1927
			}
		'''.toString)
		
		switch varDecl : p.expressions.head { 
			XVariableDeclaration : 
			switch block : varDecl.right { 
				XBlockExpression : 
				switch ass : block.expressions.head { 
					XAssignment :
					assertEquals('setBirthdate',ass.feature.simpleName)
				}
			} 
		}
	}
}