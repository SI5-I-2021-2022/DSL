/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buzzer Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alarm.BuzzerAlarm#getBuzzer <em>Buzzer</em>}</li>
 * </ul>
 *
 * @see alarm.alarmPackage#getBuzzerAlarm()
 * @model abstract="true"
 * @generated
 */
public interface BuzzerAlarm extends Alarm {
	/**
	 * Returns the value of the '<em><b>Buzzer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buzzer</em>' reference.
	 * @see #setBuzzer(Actuator)
	 * @see alarm.alarmPackage#getBuzzerAlarm_Buzzer()
	 * @model required="true"
	 * @generated
	 */
	Actuator getBuzzer();

	/**
	 * Sets the value of the '{@link alarm.BuzzerAlarm#getBuzzer <em>Buzzer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Buzzer</em>' reference.
	 * @see #getBuzzer()
	 * @generated
	 */
	void setBuzzer(Actuator value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

} // BuzzerAlarm
