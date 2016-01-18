package org.usfirst.frc.team2984.robot;

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
	public static final CANTalon frontRightMotor = new CANTalon(4);
	public static final CANTalon backLeftMotor = new CANTalon(16);
	public static final CANTalon backRightMotor = new CANTalon(1);
}
