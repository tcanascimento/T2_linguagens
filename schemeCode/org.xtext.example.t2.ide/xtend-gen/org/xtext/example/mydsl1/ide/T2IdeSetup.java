/**
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl1.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl1.T2RuntimeModule;
import org.xtext.example.mydsl1.T2StandaloneSetup;
import org.xtext.example.mydsl1.ide.T2IdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class T2IdeSetup extends T2StandaloneSetup {
  @Override
  public Injector createInjector() {
    T2RuntimeModule _t2RuntimeModule = new T2RuntimeModule();
    T2IdeModule _t2IdeModule = new T2IdeModule();
    return Guice.createInjector(Modules2.mixin(_t2RuntimeModule, _t2IdeModule));
  }
}
