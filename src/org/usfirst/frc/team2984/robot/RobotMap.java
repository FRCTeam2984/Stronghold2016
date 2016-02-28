package org.usfirst.frc.team2984.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	/**
	 * The channel for the PS2 controller
	 */
	public static final int joystickChannel = 0;
	
	/**
	 * The four drive train motors
	 */
	public static final CANTalon frontLeftMotor = new CANTalon(14);
	public static final CANTalon frontRightMotor = new CANTalon(1);
	public static final CANTalon backLeftMotor = new CANTalon(10);
	public static final CANTalon backRightMotor = new CANTalon(11); 

	/**
	 * the remove joystick to connect to out custome controller
	 */
	public static final RemoteJoystick remoteJoystick = new RemoteJoystick("CustomData1", false);
	
	/**
	 * the three distance sensores for figuring out where the ball is
	 */
	public static final AnalogInput leftDistanceSensor = new AnalogInput(2);
	public static final AnalogInput middleDistanceSensor = new AnalogInput(1);
	public static final AnalogInput rightDistanceSensor = new AnalogInput(0);
	
	public static final int distanceSensorAverageBit = 3;
	
	public static void init(){
		RobotMap.leftDistanceSensor.setAverageBits(distanceSensorAverageBit);
		RobotMap.leftDistanceSensor.setAverageBits(distanceSensorAverageBit);
		RobotMap.leftDistanceSensor.setAverageBits(distanceSensorAverageBit);
	}
}
