/**
 */
package alarm.impl;

import alarm.Actuator;
import alarm.Alarm;
import alarm.LEDAlarm;
import alarm.Visitor;
import alarm.alarmPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>LED Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alarm.impl.LEDAlarmImpl#getLed <em>Led</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LEDAlarmImpl extends AlarmImpl implements LEDAlarm {
	/**
	 * The cached value of the '{@link #getLed() <em>Led</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLed()
	 * @generated
	 * @ordered
	 */
	protected Actuator led;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LEDAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.LED_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getLed() {
		if (led != null && led.eIsProxy()) {
			InternalEObject oldLed = (InternalEObject) led;
			led = (Actuator) eResolveProxy(oldLed);
			if (led != oldLed) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, alarmPackage.LED_ALARM__LED, oldLed,
							led));
			}
		}
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetLed() {
		return led;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLed(Actuator newLed) {
		Actuator oldLed = led;
		led = newLed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, alarmPackage.LED_ALARM__LED, oldLed, led));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void accept(final Visitor visitor) {
		visitor.visit(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case alarmPackage.LED_ALARM__LED:
			if (resolve)
				return getLed();
			return basicGetLed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case alarmPackage.LED_ALARM__LED:
			setLed((Actuator) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case alarmPackage.LED_ALARM__LED:
			setLed((Actuator) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case alarmPackage.LED_ALARM__LED:
			return led != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Alarm.class) {
			switch (baseOperationID) {
			case alarmPackage.ALARM___ACCEPT__VISITOR:
				return alarmPackage.LED_ALARM___ACCEPT__VISITOR;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case alarmPackage.LED_ALARM___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //LEDAlarmImpl
