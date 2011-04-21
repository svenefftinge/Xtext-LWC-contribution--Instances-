package org.xtext.lwc.instances.tests;

import com.google.inject.Injector;
import junit.framework.TestCase;
import org.xtext.lwc.instances.InstancesStandaloneSetup;

@SuppressWarnings("all")
public class AbstractTestCase extends TestCase {
  
  public void setUp() {
    InstancesStandaloneSetup _instancesStandaloneSetup = new InstancesStandaloneSetup();
    Injector _createInjectorAndDoEMFRegistration = _instancesStandaloneSetup.createInjectorAndDoEMFRegistration();
    _createInjectorAndDoEMFRegistration.injectMembers(this);
  }
}