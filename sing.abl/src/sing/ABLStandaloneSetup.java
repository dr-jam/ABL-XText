/*
 * generated by Xtext 2.28.0
 */
package sing;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class ABLStandaloneSetup extends ABLStandaloneSetupGenerated {

	public static void doSetup() {
		new ABLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
