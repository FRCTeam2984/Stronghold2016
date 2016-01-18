package org.usfirst.frc.team2984.robot;

import edu.wpi.first.wpilibj.CANTalon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int joystickChannel = 0;
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
	public static final CANTalon frontLeftMotor = new CANTalon(14);
	public static final CANTalon frontRightMotor = new CANTalon(4);
	public static final CANTalon backLeftMotor = new CANTalon(16);
	public static final CANTalon backRightMotor = new CANTalon(1);
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
