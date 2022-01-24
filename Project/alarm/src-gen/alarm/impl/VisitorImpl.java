/**
 */
package alarm.impl;

import alarm.Action;
import alarm.Actuator;
import alarm.Alarm;
import alarm.App;
import alarm.Brick;
import alarm.BuzzerAlarm;
import alarm.DualCheckAlarm;
import alarm.LEDAlarm;
import alarm.MultiStateAlarm;
import alarm.Sensor;
import alarm.SimpleAlarm;
import alarm.State;
import alarm.StateBasedAlarm;
import alarm.Transition;
import alarm.Visitor;
import alarm.alarmPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visitor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class VisitorImpl extends MinimalEObjectImpl.Container implements Visitor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisitorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return alarmPackage.Literals.VISITOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Action action) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(App app) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Actuator actuator) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Brick brick) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Transition transition) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Sensor sensor) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(State state) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(Alarm alarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(BuzzerAlarm buzzerAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(LEDAlarm ledAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(SimpleAlarm simpleAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(DualCheckAlarm dualCheckAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(StateBasedAlarm stateBasedAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void visit(MultiStateAlarm multiStateAlarm) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case alarmPackage.VISITOR___VISIT__ACTION:
			visit((Action) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__APP:
			visit((App) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__ACTUATOR:
			visit((Actuator) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__BRICK:
			visit((Brick) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__TRANSITION:
			visit((Transition) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__SENSOR:
			visit((Sensor) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__STATE:
			visit((State) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__ALARM:
			visit((Alarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__BUZZERALARM:
			visit((BuzzerAlarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__LEDALARM:
			visit((LEDAlarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__SIMPLEALARM:
			visit((SimpleAlarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__DUALCHECKALARM:
			visit((DualCheckAlarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__STATEBASEDALARM:
			visit((StateBasedAlarm) arguments.get(0));
			return null;
		case alarmPackage.VISITOR___VISIT__MULTISTATEALARM:
			visit((MultiStateAlarm) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //VisitorImpl
