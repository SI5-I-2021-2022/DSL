/*
 * generated by Xtext 2.25.0
 */
package xtext.alarm;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AlarmStandaloneSetup extends AlarmStandaloneSetupGenerated {

	public static void doSetup() {
		new AlarmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}