/*
 * generated by Xtext 2.12.0.M1
 */
package ase


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class QueryDslStandaloneSetup extends QueryDslStandaloneSetupGenerated {

	def static void doSetup() {
		new QueryDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
