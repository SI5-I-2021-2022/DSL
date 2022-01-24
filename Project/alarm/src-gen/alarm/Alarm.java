/**
 */
package alarm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alarm.Alarm#getButton <em>Button</em>}</li>
 * </ul>
 *
 * @see alarm.alarmPackage#getAlarm()
 * @model abstract="true"
 * @generated
 */
public interface Alarm extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Button</em>' reference.
	 * @see #setButton(Sensor)
	 * @see alarm.alarmPackage#getAlarm_Button()
	 * @model required="true"
	 * @generated
	 */
	Sensor getButton();

	/**
	 * Sets the value of the '{@link alarm.Alarm#getButton <em>Button</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Button</em>' reference.
	 * @see #getButton()
	 * @generated
	 */
	void setButton(Sensor value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

} // Alarm
