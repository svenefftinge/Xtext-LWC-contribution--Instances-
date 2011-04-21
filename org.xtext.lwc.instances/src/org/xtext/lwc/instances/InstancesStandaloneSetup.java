
package org.xtext.lwc.instances;

import org.eclipse.emf.ecore.EPackage;
import org.xtext.lwc.instances.instances.InstancesPackage;

import com.google.inject.Injector;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class InstancesStandaloneSetup extends InstancesStandaloneSetupGenerated{

	public static void doSetup() {
		new InstancesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	@Override
	public void register(Injector injector) {
		EPackage.Registry.INSTANCE.put(InstancesPackage.eNS_URI, InstancesPackage.eINSTANCE);
	}
}

