/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dual Check Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alarm.DualCheckAlarm#getButton2 <em>Button2</em>}</li>
 * </ul>
 *
 * @see alarm.alarmPackage#getDualCheckAlarm()
 * @model
 * @generated
 */
public interface DualCheckAlarm extends BuzzerAlarm {
	/**
	 * Returns the value of the '<em><b>Button2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button2</em>' reference.
	 * @see #setButton2(Sensor)
	 * @see alarm.alarmPackage#getDualCheckAlarm_Button2()
	 * @model required="true"
	 * @generated
	 */
	Sensor getButton2();

	/**
	 * Sets the value of the '{@link alarm.DualCheckAlarm#getButton2 <em>Button2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button2</em>' reference.
	 * @see #getButton2()
	 * @generated
	 */
	void setButton2(Sensor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

} // DualCheckAlarm
