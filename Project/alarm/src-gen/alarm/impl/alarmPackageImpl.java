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
import alarm.NamedElement;
import alarm.Sensor;
import alarm.SimpleAlarm;
import alarm.State;
import alarm.StateBasedAlarm;
import alarm.Transition;
import alarm.Visitor;
import alarm.alarmFactory;
import alarm.alarmPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class alarmPackageImpl extends EPackageImpl implements alarmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brickEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actuatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buzzerAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dualCheckAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateBasedAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiStateAlarmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum signalEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see alarm.alarmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private alarmPackageImpl() {
		super(eNS_URI, alarmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link alarmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static alarmPackage init() {
		if (isInited)
			return (alarmPackage) EPackage.Registry.INSTANCE.getEPackage(alarmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredalarmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		alarmPackageImpl thealarmPackage = registeredalarmPackage instanceof alarmPackageImpl
				? (alarmPackageImpl) registeredalarmPackage
				: new alarmPackageImpl();

		isInited = true;

		// Create package meta-data objects
		thealarmPackage.createPackageContents();

		// Initialize created meta-data
		thealarmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thealarmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(alarmPackage.eNS_URI, thealarmPackage);
		return thealarmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApp() {
		return appEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Bricks() {
		return (EReference) appEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_States() {
		return (EReference) appEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Initial() {
		return (EReference) appEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApp_Alarm() {
		return (EReference) appEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApp__Accept__Visitor() {
		return appEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBrick() {
		return brickEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBrick_Pin() {
		return (EAttribute) brickEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBrick__Accept__Visitor() {
		return brickEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensor() {
		return sensorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensor__Accept__Visitor() {
		return sensorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActuator() {
		return actuatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActuator__Accept__Visitor() {
		return actuatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Actions() {
		return (EReference) stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transition() {
		return (EReference) stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__Accept__Visitor() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Actuator() {
		return (EReference) actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Value() {
		return (EAttribute) actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Accept__Visitor() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Sensor() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Next() {
		return (EReference) transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Value() {
		return (EAttribute) transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__Accept__Visitor() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisitor() {
		return visitorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Action() {
		return visitorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__App() {
		return visitorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Actuator() {
		return visitorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Brick() {
		return visitorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Transition() {
		return visitorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Sensor() {
		return visitorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__State() {
		return visitorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__Alarm() {
		return visitorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__BuzzerAlarm() {
		return visitorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__LEDAlarm() {
		return visitorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__SimpleAlarm() {
		return visitorEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__DualCheckAlarm() {
		return visitorEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__StateBasedAlarm() {
		return visitorEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVisitor__Visit__MultiStateAlarm() {
		return visitorEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlarm() {
		return alarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlarm_Button() {
		return (EReference) alarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAlarm__Accept__Visitor() {
		return alarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLEDAlarm() {
		return ledAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLEDAlarm_Led() {
		return (EReference) ledAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLEDAlarm__Accept__Visitor() {
		return ledAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuzzerAlarm() {
		return buzzerAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuzzerAlarm_Buzzer() {
		return (EReference) buzzerAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBuzzerAlarm__Accept__Visitor() {
		return buzzerAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAlarm() {
		return simpleAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleAlarm__Accept__Visitor() {
		return simpleAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDualCheckAlarm() {
		return dualCheckAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDualCheckAlarm_Button2() {
		return (EReference) dualCheckAlarmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDualCheckAlarm__Accept__Visitor() {
		return dualCheckAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateBasedAlarm() {
		return stateBasedAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateBasedAlarm__Accept__Visitor() {
		return stateBasedAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiStateAlarm() {
		return multiStateAlarmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiStateAlarm__Accept__Visitor() {
		return multiStateAlarmEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSIGNAL() {
		return signalEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public alarmFactory getalarmFactory() {
		return (alarmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		appEClass = createEClass(APP);
		createEReference(appEClass, APP__BRICKS);
		createEReference(appEClass, APP__STATES);
		createEReference(appEClass, APP__INITIAL);
		createEReference(appEClass, APP__ALARM);
		createEOperation(appEClass, APP___ACCEPT__VISITOR);

		brickEClass = createEClass(BRICK);
		createEAttribute(brickEClass, BRICK__PIN);
		createEOperation(brickEClass, BRICK___ACCEPT__VISITOR);

		sensorEClass = createEClass(SENSOR);
		createEOperation(sensorEClass, SENSOR___ACCEPT__VISITOR);

		actuatorEClass = createEClass(ACTUATOR);
		createEOperation(actuatorEClass, ACTUATOR___ACCEPT__VISITOR);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ACTIONS);
		createEReference(stateEClass, STATE__TRANSITION);
		createEOperation(stateEClass, STATE___ACCEPT__VISITOR);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTUATOR);
		createEAttribute(actionEClass, ACTION__VALUE);
		createEOperation(actionEClass, ACTION___ACCEPT__VISITOR);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SENSOR);
		createEReference(transitionEClass, TRANSITION__NEXT);
		createEAttribute(transitionEClass, TRANSITION__VALUE);
		createEOperation(transitionEClass, TRANSITION___ACCEPT__VISITOR);

		visitorEClass = createEClass(VISITOR);
		createEOperation(visitorEClass, VISITOR___VISIT__ACTION);
		createEOperation(visitorEClass, VISITOR___VISIT__APP);
		createEOperation(visitorEClass, VISITOR___VISIT__ACTUATOR);
		createEOperation(visitorEClass, VISITOR___VISIT__BRICK);
		createEOperation(visitorEClass, VISITOR___VISIT__TRANSITION);
		createEOperation(visitorEClass, VISITOR___VISIT__SENSOR);
		createEOperation(visitorEClass, VISITOR___VISIT__STATE);
		createEOperation(visitorEClass, VISITOR___VISIT__ALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__BUZZERALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__LEDALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__SIMPLEALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__DUALCHECKALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__STATEBASEDALARM);
		createEOperation(visitorEClass, VISITOR___VISIT__MULTISTATEALARM);

		alarmEClass = createEClass(ALARM);
		createEReference(alarmEClass, ALARM__BUTTON);
		createEOperation(alarmEClass, ALARM___ACCEPT__VISITOR);

		ledAlarmEClass = createEClass(LED_ALARM);
		createEReference(ledAlarmEClass, LED_ALARM__LED);
		createEOperation(ledAlarmEClass, LED_ALARM___ACCEPT__VISITOR);

		buzzerAlarmEClass = createEClass(BUZZER_ALARM);
		createEReference(buzzerAlarmEClass, BUZZER_ALARM__BUZZER);
		createEOperation(buzzerAlarmEClass, BUZZER_ALARM___ACCEPT__VISITOR);

		simpleAlarmEClass = createEClass(SIMPLE_ALARM);
		createEOperation(simpleAlarmEClass, SIMPLE_ALARM___ACCEPT__VISITOR);

		dualCheckAlarmEClass = createEClass(DUAL_CHECK_ALARM);
		createEReference(dualCheckAlarmEClass, DUAL_CHECK_ALARM__BUTTON2);
		createEOperation(dualCheckAlarmEClass, DUAL_CHECK_ALARM___ACCEPT__VISITOR);

		stateBasedAlarmEClass = createEClass(STATE_BASED_ALARM);
		createEOperation(stateBasedAlarmEClass, STATE_BASED_ALARM___ACCEPT__VISITOR);

		multiStateAlarmEClass = createEClass(MULTI_STATE_ALARM);
		createEOperation(multiStateAlarmEClass, MULTI_STATE_ALARM___ACCEPT__VISITOR);

		// Create enums
		signalEEnum = createEEnum(SIGNAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		appEClass.getESuperTypes().add(this.getNamedElement());
		brickEClass.getESuperTypes().add(this.getNamedElement());
		sensorEClass.getESuperTypes().add(this.getBrick());
		actuatorEClass.getESuperTypes().add(this.getBrick());
		stateEClass.getESuperTypes().add(this.getNamedElement());
		alarmEClass.getESuperTypes().add(this.getNamedElement());
		ledAlarmEClass.getESuperTypes().add(this.getAlarm());
		buzzerAlarmEClass.getESuperTypes().add(this.getAlarm());
		simpleAlarmEClass.getESuperTypes().add(this.getLEDAlarm());
		simpleAlarmEClass.getESuperTypes().add(this.getBuzzerAlarm());
		dualCheckAlarmEClass.getESuperTypes().add(this.getBuzzerAlarm());
		stateBasedAlarmEClass.getESuperTypes().add(this.getLEDAlarm());
		multiStateAlarmEClass.getESuperTypes().add(this.getBuzzerAlarm());
		multiStateAlarmEClass.getESuperTypes().add(this.getLEDAlarm());

		// Initialize classes, features, and operations; add parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appEClass, App.class, "App", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApp_Bricks(), this.getBrick(), null, "bricks", null, 1, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_States(), this.getState(), null, "states", null, 1, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Initial(), this.getState(), null, "initial", null, 1, 1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getApp_Alarm(), this.getAlarm(), null, "alarm", null, 0, -1, App.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		EOperation op = initEOperation(getApp__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(brickEClass, Brick.class, "Brick", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBrick_Pin(), ecorePackage.getEInt(), "pin", null, 1, 1, Brick.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBrick__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorEClass, Sensor.class, "Sensor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSensor__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actuatorEClass, Actuator.class, "Actuator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getActuator__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Actions(), this.getAction(), null, "actions", null, 1, -1, State.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getState_Transition(), this.getTransition(), null, "transition", null, 1, 1, State.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getState__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Actuator(), this.getActuator(), null, "actuator", null, 1, 1, Action.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_Value(), this.getSIGNAL(), "value", "LOW", 1, 1, Action.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAction__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Sensor(), this.getSensor(), null, "sensor", null, 1, 1, Transition.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Next(), this.getState(), null, "next", null, 1, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getTransition_Value(), this.getSIGNAL(), "value", "LOW", 1, 1, Transition.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTransition__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(visitorEClass, Visitor.class, "Visitor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getVisitor__Visit__Action(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAction(), "action", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__App(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getApp(), "app", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__Actuator(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActuator(), "actuator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__Brick(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBrick(), "brick", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__Transition(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransition(), "transition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__Sensor(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSensor(), "sensor", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__State(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getState(), "state", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__Alarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAlarm(), "alarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__BuzzerAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBuzzerAlarm(), "buzzerAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__LEDAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getLEDAlarm(), "ledAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__SimpleAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getSimpleAlarm(), "simpleAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__DualCheckAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDualCheckAlarm(), "dualCheckAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__StateBasedAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getStateBasedAlarm(), "stateBasedAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVisitor__Visit__MultiStateAlarm(), null, "visit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMultiStateAlarm(), "multiStateAlarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(alarmEClass, Alarm.class, "Alarm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlarm_Button(), this.getSensor(), null, "button", null, 1, 1, Alarm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ledAlarmEClass, LEDAlarm.class, "LEDAlarm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLEDAlarm_Led(), this.getActuator(), null, "Led", null, 1, 1, LEDAlarm.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getLEDAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(buzzerAlarmEClass, BuzzerAlarm.class, "BuzzerAlarm", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuzzerAlarm_Buzzer(), this.getActuator(), null, "buzzer", null, 1, 1, BuzzerAlarm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBuzzerAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(simpleAlarmEClass, SimpleAlarm.class, "SimpleAlarm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSimpleAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dualCheckAlarmEClass, DualCheckAlarm.class, "DualCheckAlarm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDualCheckAlarm_Button2(), this.getSensor(), null, "button2", null, 1, 1, DualCheckAlarm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDualCheckAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateBasedAlarmEClass, StateBasedAlarm.class, "StateBasedAlarm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getStateBasedAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(multiStateAlarmEClass, MultiStateAlarm.class, "MultiStateAlarm", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMultiStateAlarm__Accept__Visitor(), null, "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVisitor(), "visitor", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(signalEEnum, alarm.SIGNAL.class, "SIGNAL");
		addEEnumLiteral(signalEEnum, alarm.SIGNAL.HIGH);
		addEEnumLiteral(signalEEnum, alarm.SIGNAL.LOW);

		// Create resource
		createResource(eNS_URI);
	}

} //alarmPackageImpl
