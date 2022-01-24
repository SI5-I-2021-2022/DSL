/**
 */
package alarm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see alarm.alarmFactory
 * @model kind="package"
 * @generated
 */
public interface alarmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "alarm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/alarm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "alarm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	alarmPackage eINSTANCE = alarm.impl.alarmPackageImpl.init();

	/**
	 * The meta object id for the '{@link alarm.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.NamedElementImpl
	 * @see alarm.impl.alarmPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link alarm.impl.AppImpl <em>App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.AppImpl
	 * @see alarm.impl.alarmPackageImpl#getApp()
	 * @generated
	 */
	int APP = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bricks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__BRICKS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__STATES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Alarm</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP__ALARM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP___ACCEPT__VISITOR = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.BrickImpl <em>Brick</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.BrickImpl
	 * @see alarm.impl.alarmPackageImpl#getBrick()
	 * @generated
	 */
	int BRICK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK__PIN = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK___ACCEPT__VISITOR = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Brick</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRICK_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.SensorImpl
	 * @see alarm.impl.alarmPackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR___ACCEPT__VISITOR = BRICK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.ActuatorImpl
	 * @see alarm.impl.alarmPackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = BRICK__NAME;

	/**
	 * The feature id for the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__PIN = BRICK__PIN;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = BRICK_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR___ACCEPT__VISITOR = BRICK_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = BRICK_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.StateImpl
	 * @see alarm.impl.alarmPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ACTIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSITION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE___ACCEPT__VISITOR = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.ActionImpl
	 * @see alarm.impl.alarmPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTUATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION___ACCEPT__VISITOR = 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alarm.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.TransitionImpl
	 * @see alarm.impl.alarmPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Sensor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SENSOR = 0;

	/**
	 * The feature id for the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NEXT = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION___ACCEPT__VISITOR = 0;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link alarm.impl.VisitorImpl <em>Visitor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.VisitorImpl
	 * @see alarm.impl.alarmPackageImpl#getVisitor()
	 * @generated
	 */
	int VISITOR = 8;

	/**
	 * The number of structural features of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__ACTION = 0;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__APP = 1;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__ACTUATOR = 2;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__BRICK = 3;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__TRANSITION = 4;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__SENSOR = 5;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__STATE = 6;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__ALARM = 7;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__BUZZERALARM = 8;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__LEDALARM = 9;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__SIMPLEALARM = 10;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__DUALCHECKALARM = 11;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__STATEBASEDALARM = 12;

	/**
	 * The operation id for the '<em>Visit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR___VISIT__MULTISTATEALARM = 13;

	/**
	 * The number of operations of the '<em>Visitor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISITOR_OPERATION_COUNT = 14;

	/**
	 * The meta object id for the '{@link alarm.impl.AlarmImpl <em>Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.AlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getAlarm()
	 * @generated
	 */
	int ALARM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM__BUTTON = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM___ACCEPT__VISITOR = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALARM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.LEDAlarmImpl <em>LED Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.LEDAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getLEDAlarm()
	 * @generated
	 */
	int LED_ALARM = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM__NAME = ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM__BUTTON = ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM__LED = ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>LED Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM_FEATURE_COUNT = ALARM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM___ACCEPT__VISITOR = ALARM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>LED Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LED_ALARM_OPERATION_COUNT = ALARM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.BuzzerAlarmImpl <em>Buzzer Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.BuzzerAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getBuzzerAlarm()
	 * @generated
	 */
	int BUZZER_ALARM = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM__NAME = ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM__BUTTON = ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Buzzer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM__BUZZER = ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Buzzer Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM_FEATURE_COUNT = ALARM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM___ACCEPT__VISITOR = ALARM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Buzzer Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUZZER_ALARM_OPERATION_COUNT = ALARM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.SimpleAlarmImpl <em>Simple Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.SimpleAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getSimpleAlarm()
	 * @generated
	 */
	int SIMPLE_ALARM = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__NAME = LED_ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__BUTTON = LED_ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__LED = LED_ALARM__LED;

	/**
	 * The feature id for the '<em><b>Buzzer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM__BUZZER = LED_ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM_FEATURE_COUNT = LED_ALARM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM___ACCEPT__VISITOR = LED_ALARM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ALARM_OPERATION_COUNT = LED_ALARM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link alarm.impl.DualCheckAlarmImpl <em>Dual Check Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.DualCheckAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getDualCheckAlarm()
	 * @generated
	 */
	int DUAL_CHECK_ALARM = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM__NAME = BUZZER_ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM__BUTTON = BUZZER_ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Buzzer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM__BUZZER = BUZZER_ALARM__BUZZER;

	/**
	 * The feature id for the '<em><b>Button2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM__BUTTON2 = BUZZER_ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dual Check Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM_FEATURE_COUNT = BUZZER_ALARM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM___ACCEPT__VISITOR = BUZZER_ALARM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dual Check Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DUAL_CHECK_ALARM_OPERATION_COUNT = BUZZER_ALARM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.StateBasedAlarmImpl <em>State Based Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.StateBasedAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getStateBasedAlarm()
	 * @generated
	 */
	int STATE_BASED_ALARM = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM__NAME = LED_ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM__BUTTON = LED_ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM__LED = LED_ALARM__LED;

	/**
	 * The number of structural features of the '<em>State Based Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM_FEATURE_COUNT = LED_ALARM_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM___ACCEPT__VISITOR = LED_ALARM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>State Based Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_BASED_ALARM_OPERATION_COUNT = LED_ALARM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link alarm.impl.MultiStateAlarmImpl <em>Multi State Alarm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.impl.MultiStateAlarmImpl
	 * @see alarm.impl.alarmPackageImpl#getMultiStateAlarm()
	 * @generated
	 */
	int MULTI_STATE_ALARM = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM__NAME = BUZZER_ALARM__NAME;

	/**
	 * The feature id for the '<em><b>Button</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM__BUTTON = BUZZER_ALARM__BUTTON;

	/**
	 * The feature id for the '<em><b>Buzzer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM__BUZZER = BUZZER_ALARM__BUZZER;

	/**
	 * The feature id for the '<em><b>Led</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM__LED = BUZZER_ALARM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi State Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM_FEATURE_COUNT = BUZZER_ALARM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM___ACCEPT__VISITOR = BUZZER_ALARM_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multi State Alarm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_STATE_ALARM_OPERATION_COUNT = BUZZER_ALARM_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link alarm.SIGNAL <em>SIGNAL</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see alarm.SIGNAL
	 * @see alarm.impl.alarmPackageImpl#getSIGNAL()
	 * @generated
	 */
	int SIGNAL = 16;

	/**
	 * Returns the meta object for class '{@link alarm.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see alarm.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link alarm.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see alarm.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link alarm.App <em>App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App</em>'.
	 * @see alarm.App
	 * @generated
	 */
	EClass getApp();

	/**
	 * Returns the meta object for the containment reference list '{@link alarm.App#getBricks <em>Bricks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bricks</em>'.
	 * @see alarm.App#getBricks()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Bricks();

	/**
	 * Returns the meta object for the containment reference list '{@link alarm.App#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see alarm.App#getStates()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_States();

	/**
	 * Returns the meta object for the reference '{@link alarm.App#getInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial</em>'.
	 * @see alarm.App#getInitial()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Initial();

	/**
	 * Returns the meta object for the containment reference list '{@link alarm.App#getAlarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alarm</em>'.
	 * @see alarm.App#getAlarm()
	 * @see #getApp()
	 * @generated
	 */
	EReference getApp_Alarm();

	/**
	 * Returns the meta object for the '{@link alarm.App#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.App#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getApp__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Brick <em>Brick</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Brick</em>'.
	 * @see alarm.Brick
	 * @generated
	 */
	EClass getBrick();

	/**
	 * Returns the meta object for the attribute '{@link alarm.Brick#getPin <em>Pin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pin</em>'.
	 * @see alarm.Brick#getPin()
	 * @see #getBrick()
	 * @generated
	 */
	EAttribute getBrick_Pin();

	/**
	 * Returns the meta object for the '{@link alarm.Brick#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Brick#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getBrick__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see alarm.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the '{@link alarm.Sensor#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Sensor#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getSensor__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see alarm.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the '{@link alarm.Actuator#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Actuator#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getActuator__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see alarm.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the containment reference list '{@link alarm.State#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actions</em>'.
	 * @see alarm.State#getActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Actions();

	/**
	 * Returns the meta object for the containment reference '{@link alarm.State#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transition</em>'.
	 * @see alarm.State#getTransition()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transition();

	/**
	 * Returns the meta object for the '{@link alarm.State#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.State#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getState__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see alarm.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link alarm.Action#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see alarm.Action#getActuator()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Actuator();

	/**
	 * Returns the meta object for the attribute '{@link alarm.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alarm.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the '{@link alarm.Action#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Action#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getAction__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see alarm.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link alarm.Transition#getSensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sensor</em>'.
	 * @see alarm.Transition#getSensor()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Sensor();

	/**
	 * Returns the meta object for the reference '{@link alarm.Transition#getNext <em>Next</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Next</em>'.
	 * @see alarm.Transition#getNext()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Next();

	/**
	 * Returns the meta object for the attribute '{@link alarm.Transition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see alarm.Transition#getValue()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Value();

	/**
	 * Returns the meta object for the '{@link alarm.Transition#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Transition#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getTransition__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.Visitor <em>Visitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visitor</em>'.
	 * @see alarm.Visitor
	 * @generated
	 */
	EClass getVisitor();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Action) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Action)
	 * @generated
	 */
	EOperation getVisitor__Visit__Action();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.App) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.App)
	 * @generated
	 */
	EOperation getVisitor__Visit__App();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Actuator) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Actuator)
	 * @generated
	 */
	EOperation getVisitor__Visit__Actuator();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Brick) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Brick)
	 * @generated
	 */
	EOperation getVisitor__Visit__Brick();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Transition) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Transition)
	 * @generated
	 */
	EOperation getVisitor__Visit__Transition();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Sensor) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Sensor)
	 * @generated
	 */
	EOperation getVisitor__Visit__Sensor();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.State) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.State)
	 * @generated
	 */
	EOperation getVisitor__Visit__State();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.Alarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.Alarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__Alarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.BuzzerAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.BuzzerAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__BuzzerAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.LEDAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.LEDAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__LEDAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.SimpleAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.SimpleAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__SimpleAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.DualCheckAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.DualCheckAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__DualCheckAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.StateBasedAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.StateBasedAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__StateBasedAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.Visitor#visit(alarm.MultiStateAlarm) <em>Visit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Visit</em>' operation.
	 * @see alarm.Visitor#visit(alarm.MultiStateAlarm)
	 * @generated
	 */
	EOperation getVisitor__Visit__MultiStateAlarm();

	/**
	 * Returns the meta object for class '{@link alarm.Alarm <em>Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alarm</em>'.
	 * @see alarm.Alarm
	 * @generated
	 */
	EClass getAlarm();

	/**
	 * Returns the meta object for the reference '{@link alarm.Alarm#getButton <em>Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Button</em>'.
	 * @see alarm.Alarm#getButton()
	 * @see #getAlarm()
	 * @generated
	 */
	EReference getAlarm_Button();

	/**
	 * Returns the meta object for the '{@link alarm.Alarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.Alarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.LEDAlarm <em>LED Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LED Alarm</em>'.
	 * @see alarm.LEDAlarm
	 * @generated
	 */
	EClass getLEDAlarm();

	/**
	 * Returns the meta object for the reference '{@link alarm.LEDAlarm#getLed <em>Led</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Led</em>'.
	 * @see alarm.LEDAlarm#getLed()
	 * @see #getLEDAlarm()
	 * @generated
	 */
	EReference getLEDAlarm_Led();

	/**
	 * Returns the meta object for the '{@link alarm.LEDAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.LEDAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getLEDAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.BuzzerAlarm <em>Buzzer Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buzzer Alarm</em>'.
	 * @see alarm.BuzzerAlarm
	 * @generated
	 */
	EClass getBuzzerAlarm();

	/**
	 * Returns the meta object for the reference '{@link alarm.BuzzerAlarm#getBuzzer <em>Buzzer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buzzer</em>'.
	 * @see alarm.BuzzerAlarm#getBuzzer()
	 * @see #getBuzzerAlarm()
	 * @generated
	 */
	EReference getBuzzerAlarm_Buzzer();

	/**
	 * Returns the meta object for the '{@link alarm.BuzzerAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.BuzzerAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getBuzzerAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.SimpleAlarm <em>Simple Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Alarm</em>'.
	 * @see alarm.SimpleAlarm
	 * @generated
	 */
	EClass getSimpleAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.SimpleAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.SimpleAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getSimpleAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.DualCheckAlarm <em>Dual Check Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dual Check Alarm</em>'.
	 * @see alarm.DualCheckAlarm
	 * @generated
	 */
	EClass getDualCheckAlarm();

	/**
	 * Returns the meta object for the reference '{@link alarm.DualCheckAlarm#getButton2 <em>Button2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Button2</em>'.
	 * @see alarm.DualCheckAlarm#getButton2()
	 * @see #getDualCheckAlarm()
	 * @generated
	 */
	EReference getDualCheckAlarm_Button2();

	/**
	 * Returns the meta object for the '{@link alarm.DualCheckAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.DualCheckAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getDualCheckAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.StateBasedAlarm <em>State Based Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State Based Alarm</em>'.
	 * @see alarm.StateBasedAlarm
	 * @generated
	 */
	EClass getStateBasedAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.StateBasedAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.StateBasedAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getStateBasedAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for class '{@link alarm.MultiStateAlarm <em>Multi State Alarm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi State Alarm</em>'.
	 * @see alarm.MultiStateAlarm
	 * @generated
	 */
	EClass getMultiStateAlarm();

	/**
	 * Returns the meta object for the '{@link alarm.MultiStateAlarm#accept(alarm.Visitor) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see alarm.MultiStateAlarm#accept(alarm.Visitor)
	 * @generated
	 */
	EOperation getMultiStateAlarm__Accept__Visitor();

	/**
	 * Returns the meta object for enum '{@link alarm.SIGNAL <em>SIGNAL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SIGNAL</em>'.
	 * @see alarm.SIGNAL
	 * @generated
	 */
	EEnum getSIGNAL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	alarmFactory getalarmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link alarm.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.NamedElementImpl
		 * @see alarm.impl.alarmPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link alarm.impl.AppImpl <em>App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.AppImpl
		 * @see alarm.impl.alarmPackageImpl#getApp()
		 * @generated
		 */
		EClass APP = eINSTANCE.getApp();

		/**
		 * The meta object literal for the '<em><b>Bricks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__BRICKS = eINSTANCE.getApp_Bricks();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__STATES = eINSTANCE.getApp_States();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__INITIAL = eINSTANCE.getApp_Initial();

		/**
		 * The meta object literal for the '<em><b>Alarm</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APP__ALARM = eINSTANCE.getApp_Alarm();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APP___ACCEPT__VISITOR = eINSTANCE.getApp__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.BrickImpl <em>Brick</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.BrickImpl
		 * @see alarm.impl.alarmPackageImpl#getBrick()
		 * @generated
		 */
		EClass BRICK = eINSTANCE.getBrick();

		/**
		 * The meta object literal for the '<em><b>Pin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRICK__PIN = eINSTANCE.getBrick_Pin();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BRICK___ACCEPT__VISITOR = eINSTANCE.getBrick__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.SensorImpl
		 * @see alarm.impl.alarmPackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SENSOR___ACCEPT__VISITOR = eINSTANCE.getSensor__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.ActuatorImpl
		 * @see alarm.impl.alarmPackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTUATOR___ACCEPT__VISITOR = eINSTANCE.getActuator__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.StateImpl
		 * @see alarm.impl.alarmPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ACTIONS = eINSTANCE.getState_Actions();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSITION = eINSTANCE.getState_Transition();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE___ACCEPT__VISITOR = eINSTANCE.getState__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.ActionImpl
		 * @see alarm.impl.alarmPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTUATOR = eINSTANCE.getAction_Actuator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION___ACCEPT__VISITOR = eINSTANCE.getAction__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.TransitionImpl
		 * @see alarm.impl.alarmPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Sensor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SENSOR = eINSTANCE.getTransition_Sensor();

		/**
		 * The meta object literal for the '<em><b>Next</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__NEXT = eINSTANCE.getTransition_Next();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__VALUE = eINSTANCE.getTransition_Value();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSITION___ACCEPT__VISITOR = eINSTANCE.getTransition__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.VisitorImpl <em>Visitor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.VisitorImpl
		 * @see alarm.impl.alarmPackageImpl#getVisitor()
		 * @generated
		 */
		EClass VISITOR = eINSTANCE.getVisitor();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__ACTION = eINSTANCE.getVisitor__Visit__Action();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__APP = eINSTANCE.getVisitor__Visit__App();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__ACTUATOR = eINSTANCE.getVisitor__Visit__Actuator();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__BRICK = eINSTANCE.getVisitor__Visit__Brick();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__TRANSITION = eINSTANCE.getVisitor__Visit__Transition();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__SENSOR = eINSTANCE.getVisitor__Visit__Sensor();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__STATE = eINSTANCE.getVisitor__Visit__State();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__ALARM = eINSTANCE.getVisitor__Visit__Alarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__BUZZERALARM = eINSTANCE.getVisitor__Visit__BuzzerAlarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__LEDALARM = eINSTANCE.getVisitor__Visit__LEDAlarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__SIMPLEALARM = eINSTANCE.getVisitor__Visit__SimpleAlarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__DUALCHECKALARM = eINSTANCE.getVisitor__Visit__DualCheckAlarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__STATEBASEDALARM = eINSTANCE.getVisitor__Visit__StateBasedAlarm();

		/**
		 * The meta object literal for the '<em><b>Visit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VISITOR___VISIT__MULTISTATEALARM = eINSTANCE.getVisitor__Visit__MultiStateAlarm();

		/**
		 * The meta object literal for the '{@link alarm.impl.AlarmImpl <em>Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.AlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getAlarm()
		 * @generated
		 */
		EClass ALARM = eINSTANCE.getAlarm();

		/**
		 * The meta object literal for the '<em><b>Button</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALARM__BUTTON = eINSTANCE.getAlarm_Button();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ALARM___ACCEPT__VISITOR = eINSTANCE.getAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.LEDAlarmImpl <em>LED Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.LEDAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getLEDAlarm()
		 * @generated
		 */
		EClass LED_ALARM = eINSTANCE.getLEDAlarm();

		/**
		 * The meta object literal for the '<em><b>Led</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LED_ALARM__LED = eINSTANCE.getLEDAlarm_Led();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LED_ALARM___ACCEPT__VISITOR = eINSTANCE.getLEDAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.BuzzerAlarmImpl <em>Buzzer Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.BuzzerAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getBuzzerAlarm()
		 * @generated
		 */
		EClass BUZZER_ALARM = eINSTANCE.getBuzzerAlarm();

		/**
		 * The meta object literal for the '<em><b>Buzzer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUZZER_ALARM__BUZZER = eINSTANCE.getBuzzerAlarm_Buzzer();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BUZZER_ALARM___ACCEPT__VISITOR = eINSTANCE.getBuzzerAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.SimpleAlarmImpl <em>Simple Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.SimpleAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getSimpleAlarm()
		 * @generated
		 */
		EClass SIMPLE_ALARM = eINSTANCE.getSimpleAlarm();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ALARM___ACCEPT__VISITOR = eINSTANCE.getSimpleAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.DualCheckAlarmImpl <em>Dual Check Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.DualCheckAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getDualCheckAlarm()
		 * @generated
		 */
		EClass DUAL_CHECK_ALARM = eINSTANCE.getDualCheckAlarm();

		/**
		 * The meta object literal for the '<em><b>Button2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DUAL_CHECK_ALARM__BUTTON2 = eINSTANCE.getDualCheckAlarm_Button2();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DUAL_CHECK_ALARM___ACCEPT__VISITOR = eINSTANCE.getDualCheckAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.StateBasedAlarmImpl <em>State Based Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.StateBasedAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getStateBasedAlarm()
		 * @generated
		 */
		EClass STATE_BASED_ALARM = eINSTANCE.getStateBasedAlarm();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STATE_BASED_ALARM___ACCEPT__VISITOR = eINSTANCE.getStateBasedAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.impl.MultiStateAlarmImpl <em>Multi State Alarm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.impl.MultiStateAlarmImpl
		 * @see alarm.impl.alarmPackageImpl#getMultiStateAlarm()
		 * @generated
		 */
		EClass MULTI_STATE_ALARM = eINSTANCE.getMultiStateAlarm();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MULTI_STATE_ALARM___ACCEPT__VISITOR = eINSTANCE.getMultiStateAlarm__Accept__Visitor();

		/**
		 * The meta object literal for the '{@link alarm.SIGNAL <em>SIGNAL</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see alarm.SIGNAL
		 * @see alarm.impl.alarmPackageImpl#getSIGNAL()
		 * @generated
		 */
		EEnum SIGNAL = eINSTANCE.getSIGNAL();

	}

} //alarmPackage
