package org.xtext.lwc.instances.tests

import junit.framework.TestCase
import org.xtext.lwc.instances.InstancesStandaloneSetup

class AbstractTestCase extends TestCase {
	override void setUp() {
		new InstancesStandaloneSetup().createInjectorAndDoEMFRegistration.injectMembers(this)
	}
}