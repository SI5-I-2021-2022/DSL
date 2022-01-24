/**
 */
package alarm.impl;

import alarm.Actuator;
import alarm.Brick;
import alarm.Visitor;
import alarm.alarmPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ActuatorImpl extends BrickImpl implements Actuator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.ACTUATOR;
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
		if (baseClass == Brick.class) {
			switch (baseOperationID) {
			case alarmPackage.BRICK___ACCEPT__VISITOR:
				return alarmPackage.ACTUATOR___ACCEPT__VISITOR;
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
		case alarmPackage.ACTUATOR___ACCEPT__VISITOR:
			accept((Visitor) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActuatorImpl
