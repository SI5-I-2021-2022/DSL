/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi State Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see alarm.alarmPackage#getMultiStateAlarm()
 * @model
 * @generated
 */
public interface MultiStateAlarm extends BuzzerAlarm, LEDAlarm {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);
} // MultiStateAlarm
