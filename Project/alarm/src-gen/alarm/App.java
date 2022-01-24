/**
 */
package alarm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link alarm.App#getBricks <em>Bricks</em>}</li>
 *   <li>{@link alarm.App#getStates <em>States</em>}</li>
 *   <li>{@link alarm.App#getInitial <em>Initial</em>}</li>
 *   <li>{@link alarm.App#getAlarm <em>Alarm</em>}</li>
 * </ul>
 *
 * @see alarm.alarmPackage#getApp()
 * @model
 * @generated
 */
public interface App extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bricks</b></em>' containment reference list.
	 * The list contents are of type {@link alarm.Brick}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bricks</em>' containment reference list.
	 * @see alarm.alarmPackage#getApp_Bricks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Brick> getBricks();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link alarm.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see alarm.alarmPackage#getApp_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see alarm.alarmPackage#getApp_Initial()
	 * @model required="true"
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link alarm.App#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

	/**
	 * Returns the value of the '<em><b>Alarm</b></em>' containment reference list.
	 * The list contents are of type {@link alarm.Alarm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alarm</em>' containment reference list.
	 * @see alarm.alarmPackage#getApp_Alarm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Alarm> getAlarm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void accept(Visitor visitor);

} // App
