/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alarm.alarmPackage#getSimpleAlarm()
 * @model
 * @generated
 */
public interface SimpleAlarm extends LEDAlarm, BuzzerAlarm {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);
} // SimpleAlarm
