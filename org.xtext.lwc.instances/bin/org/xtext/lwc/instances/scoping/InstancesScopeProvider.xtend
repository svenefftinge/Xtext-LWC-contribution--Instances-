package org.xtext.lwc.instances.scoping

import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.xtext.lwc.instances.instances.Instance
import org.eclipse.xtext.xbase.XVariableDeclaration

class InstancesScopeProvider extends XbaseScopeProvider {
	
	override createLocalVarScopeForBlock(XBlockExpression block, int indexOfContextExpressionInBlock, IScope parentScope) {
		val qn = QualifiedName::^create('this')
		val desc = EObjectDescription::^create( qn , block);
		return MapBasedScope::createScope(parentScope, newArrayList( desc ))
	}
	
	override IScope createLocalVarScope(EObject context, EReference reference, IScope parentScope, boolean includeCurrentBlock, int idx) {
		switch (context) {
			Instance : {
				return MapBasedScope::createScope( parentScope ,
					context.expressions.filter(typeof(XVariableDeclaration)).map(
						varDecl | EObjectDescription::^create( QualifiedName::^create(varDecl.name), varDecl)
					)
				)
			}
		}
		return super.createLocalVarScope(context, reference, parentScope, includeCurrentBlock, idx)
	}
	
}