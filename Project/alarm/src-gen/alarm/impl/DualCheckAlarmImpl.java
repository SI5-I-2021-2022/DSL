/**
 */
package alarm.impl;

import alarm.Alarm;
import alarm.BuzzerAlarm;
import alarm.DualCheckAlarm;
import alarm.Sensor;
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
 * An implementation of the model object '<em><b>Dual Check Alarm</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link alarm.impl.DualCheckAlarmImpl#getButton2 <em>Button2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DualCheckAlarmImpl extends BuzzerAlarmImpl implements DualCheckAlarm {
	/**
	 * The cached value of the '{@link #getButton2() <em>Button2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getButton2()
	 * @generated
	 * @ordered
	 */
	protected Sensor button2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DualCheckAlarmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.DUAL_CHECK_ALARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor getButton2() {
		if (button2 != null && button2.eIsProxy()) {
			InternalEObject oldButton2 = (InternalEObject) button2;
			button2 = (Sensor) eResolveProxy(oldButton2);
			if (button2 != oldButton2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, alarmPackage.DUAL_CHECK_ALARM__BUTTON2,
							oldButton2, button2));
			}
		}
		return button2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor basicGetButton2() {
		return button2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setButton2(Sensor newButton2) {
		Sensor oldButton2 = button2;
		button2 = newButton2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, alarmPackage.DUAL_CHECK_ALARM__BUTTON2, oldButton2,
					button2));
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
		case alarmPackage.DUAL_CHECK_ALARM__BUTTON2:
			if (resolve)
				return getButton2();
			return basicGetButton2();
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
		case alarmPackage.DUAL_CHECK_ALARM__BUTTON2:
			setButton2((Sensor) newValue);
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
		case alarmPackage.DUAL_CHECK_ALARM__BUTTON2:
			setButton2((Sensor) null);
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
		case alarmPackage.DUAL_CHECK_ALARM__BUTTON2:
			return button2 != null;
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
				return alarmPackage.DUAL_CHECK_ALARM___ACCEPT__VISITOR;
			default:
				return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		if (baseClass == BuzzerAlarm.class) {
			switch (baseOperationID) {
			case alarmPackage.BUZZER_ALARM___ACCEPT__VISITOR:
				return alarmPackage.DUAL_CHECK_ALARM___ACCEPT__VISITOR;
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
		case alarmPackage.DUAL_CHECK_ALARM___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //DualCheckAlarmImpl
