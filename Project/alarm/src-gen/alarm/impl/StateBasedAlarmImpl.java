/**
 */
package alarm.impl;

import alarm.Alarm;
import alarm.LEDAlarm;
import alarm.StateBasedAlarm;
import alarm.Visitor;
import alarm.alarmPackage;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Based Alarm</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StateBasedAlarmImpl extends LEDAlarmImpl implements StateBasedAlarm {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateBasedAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.STATE_BASED_ALARM;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Alarm.class) {
			switch (baseOperationID) {
			case alarmPackage.ALARM___ACCEPT__VISITOR:
				return alarmPackage.STATE_BASED_ALARM___ACCEPT__VISITOR;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == LEDAlarm.class) {
			switch (baseOperationID) {
			case alarmPackage.LED_ALARM___ACCEPT__VISITOR:
				return alarmPackage.STATE_BASED_ALARM___ACCEPT__VISITOR;
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
		case alarmPackage.STATE_BASED_ALARM___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StateBasedAlarmImpl
