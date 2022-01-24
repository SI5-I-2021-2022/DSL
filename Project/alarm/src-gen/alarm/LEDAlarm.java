/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LED Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alarm.LEDAlarm#getLed <em>Led</em>}</li>
 * </ul>
 *
 * @see alarm.alarmPackage#getLEDAlarm()
 * @model abstract="true"
 * @generated
 */
public interface LEDAlarm extends Alarm {
	/**
	 * Returns the value of the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Led</em>' reference.
	 * @see #setLed(Actuator)
	 * @see alarm.alarmPackage#getLEDAlarm_Led()
	 * @model required="true"
	 * @generated
	 */
	Actuator getLed();

	/**
	 * Sets the value of the '{@link alarm.LEDAlarm#getLed <em>Led</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Led</em>' reference.
	 * @see #getLed()
	 * @generated
	 */
	void setLed(Actuator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

} // LEDAlarm
