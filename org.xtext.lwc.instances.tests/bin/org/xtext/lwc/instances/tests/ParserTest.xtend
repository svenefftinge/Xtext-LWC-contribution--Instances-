package org.xtext.lwc.instances.tests

import org.eclipse.xtext.junit4.util.ParseHelper
import org.xtext.lwc.instances.instances.Instance
import static junit.framework.Assert.*
import java.util.List
import org.eclipse.xtext.xbase.XExpression
import junit.framework.TestCase
import org.eclipse.xtext.xbase.XVariableDeclaration
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XAssignment
import org.xtext.lwc.instances.instances.DateLiteral
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XFeatureCall

class ParserTest extends AbstractTestCase {
	
	@Inject ParseHelper<Instance> as parser
	
	testSimpleParsing() {
		val inst = parser.parse('''
			Person p = {
				this.name = "Voelter"
				firstname = "Markus"
				birthdate = 14.02.1927
				ownedCar = c
			}
			Car c = {
				make = "VW"
				model = "Touran"
			}
		'''.toString)
		
		switch varDecl : inst.expressions.head { 
			XVariableDeclaration : {
				assertEquals("Person",varDecl.type.identifier)
				switch block : varDecl.right { 
					XBlockExpression : {
						switch ass : block.expressions.head { 
							XAssignment : {
								assertSame( block, (ass.assignable as XFeatureCall).feature )
							}
							default : error()
						}
						switch ass : block.expressions.get(2) { 
							XAssignment : {
								switch date : ass.value {
									DateLiteral: {
										assertEquals(14, date.day)
										assertEquals(2, date.month)
										assertEquals(1927, date.year)
									}
									default : error()
								}
								assertEquals('setBirthdate',ass.feature.simpleName)
							}
							default : error()
						}
					}
					default : error()
				} 
			}
			default : error()
		}
	}
	
	void error() {
		throw new AssertionError();
	}
}