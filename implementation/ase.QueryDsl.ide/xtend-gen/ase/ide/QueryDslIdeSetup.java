/**
 * generated by Xtext 2.12.0.M1
 */
package ase.ide;

import ase.QueryDslRuntimeModule;
import ase.QueryDslStandaloneSetup;
import ase.ide.QueryDslIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class QueryDslIdeSetup extends QueryDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    QueryDslRuntimeModule _queryDslRuntimeModule = new QueryDslRuntimeModule();
    QueryDslIdeModule _queryDslIdeModule = new QueryDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_queryDslRuntimeModule, _queryDslIdeModule));
  }
}
