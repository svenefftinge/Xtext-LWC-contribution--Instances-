package org.xtext.lwc.instances.scoping;

import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.xtext.lwc.instances.instances.Instance;

@SuppressWarnings("all")
public class InstancesScopeProvider extends XbaseScopeProvider {
  
  public IScope createLocalVarScopeForBlock(final XBlockExpression block, final int indexOfContextExpressionInBlock, final IScope parentScope) {
    {
      QualifiedName _create = QualifiedName.create("this");
      final QualifiedName qn = _create;
      IEObjectDescription _create_1 = EObjectDescription.create(qn, block);
      final IEObjectDescription desc = _create_1;
      ArrayList<IEObjectDescription> _newArrayList = CollectionLiterals.<IEObjectDescription>newArrayList(desc);
      IScope _createScope = MapBasedScope.createScope(parentScope, _newArrayList);
      return _createScope;
    }
  }
  
  public IScope createLocalVarScope(final EObject context, final EReference reference, final IScope parentScope, final boolean includeCurrentBlock, final int idx) {
    {
      final EObject context_1 = context;
      boolean matched = false;
      if (!matched) {
        if (context_1 instanceof Instance) {
          final Instance context_2 = (Instance) context_1;
          matched=true;
          EList<XExpression> _expressions = context_2.getExpressions();
          Iterable<XVariableDeclaration> _filter = IterableExtensions.<XVariableDeclaration>filter(_expressions, org.eclipse.xtext.xbase.XVariableDeclaration.class);
          final Function1<XVariableDeclaration,IEObjectDescription> _function = new Function1<XVariableDeclaration,IEObjectDescription>() {
              public IEObjectDescription apply(XVariableDeclaration varDecl) {
                String _name = varDecl.getName();
                QualifiedName _create = QualifiedName.create(_name);
                IEObjectDescription _create_1 = EObjectDescription.create(_create, varDecl);
                return _create_1;
              }
            };
          Iterable<IEObjectDescription> _map = IterableExtensions.<XVariableDeclaration, IEObjectDescription>map(_filter, _function);
          IScope _createScope = MapBasedScope.createScope(parentScope, _map);
          return _createScope;
        }
      }
      IScope _createLocalVarScope = super.createLocalVarScope(context, reference, parentScope, includeCurrentBlock, idx);
      return _createLocalVarScope;
    }
  }
}