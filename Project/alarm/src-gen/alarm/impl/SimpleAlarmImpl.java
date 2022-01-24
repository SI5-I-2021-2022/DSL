/**
 */
package alarm.impl;

import alarm.Actuator;
import alarm.Alarm;
import alarm.BuzzerAlarm;
import alarm.LEDAlarm;
import alarm.SimpleAlarm;
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
 * An implementation of the model object '<em><b>Simple Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alarm.impl.SimpleAlarmImpl#getBuzzer <em>Buzzer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleAlarmImpl extends LEDAlarmImpl implements SimpleAlarm {
	/**
	 * The cached value of the '{@link #getBuzzer() <em>Buzzer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuzzer()
	 * @generated
	 * @ordered
	 */
	protected Actuator buzzer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.SIMPLE_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getBuzzer() {
		if (buzzer != null && buzzer.eIsProxy()) {
			InternalEObject oldBuzzer = (InternalEObject) buzzer;
			buzzer = (Actuator) eResolveProxy(oldBuzzer);
			if (buzzer != oldBuzzer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, alarmPackage.SIMPLE_ALARM__BUZZER,
							oldBuzzer, buzzer));
			}
		}
		return buzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetBuzzer() {
		return buzzer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuzzer(Actuator newBuzzer) {
		Actuator oldBuzzer = buzzer;
		buzzer = newBuzzer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, alarmPackage.SIMPLE_ALARM__BUZZER, oldBuzzer,
					buzzer));
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
		case alarmPackage.SIMPLE_ALARM__BUZZER:
			if (resolve)
				return getBuzzer();
			return basicGetBuzzer();
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
		case alarmPackage.SIMPLE_ALARM__BUZZER:
			setBuzzer((Actuator) newValue);
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
		case alarmPackage.SIMPLE_ALARM__BUZZER:
			setBuzzer((Actuator) null);
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
		case alarmPackage.SIMPLE_ALARM__BUZZER:
			return buzzer != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == BuzzerAlarm.class) {
			switch (derivedFeatureID) {
			case alarmPackage.SIMPLE_ALARM__BUZZER:
				return alarmPackage.BUZZER_ALARM__BUZZER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == BuzzerAlarm.class) {
			switch (baseFeatureID) {
			case alarmPackage.BUZZER_ALARM__BUZZER:
				return alarmPackage.SIMPLE_ALARM__BUZZER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
				return alarmPackage.SIMPLE_ALARM___ACCEPT__VISITOR;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LEDAlarm.class) {
			switch (baseOperationID) {
			case alarmPackage.LED_ALARM___ACCEPT__VISITOR:
				return alarmPackage.SIMPLE_ALARM___ACCEPT__VISITOR;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == BuzzerAlarm.class) {
			switch (baseOperationID) {
			case alarmPackage.BUZZER_ALARM___ACCEPT__VISITOR:
				return alarmPackage.SIMPLE_ALARM___ACCEPT__VISITOR;
			default:
				return -1;
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
		case alarmPackage.SIMPLE_ALARM___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleAlarmImpl
