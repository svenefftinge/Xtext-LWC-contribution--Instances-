package org.xtext.lwc.instances.validation;

import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.xtext.lwc.instances.instances.InstancesPackage;
 

public class InstancesJavaValidator extends AbstractInstancesJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = super.getEPackages();
		result.add(InstancesPackage.eINSTANCE);
		return result;
	}
}
