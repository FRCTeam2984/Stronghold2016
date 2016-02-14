package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;
import org.usfirst.frc.team2984.robot.commands.DriveUsingJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * 	A controller for the four wheel drive system using normal wheels.
 * 
 *  The algorithm uses simple adding with out normalization to calculate the motor speeds.
 * 
 * @author max
 */
public class FourWheelDrive extends Subsystem{
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveUsingJoystick());
	}
	
	/**
	 * 	Drives with the given forward speed and rotation
	 * 	@param fwrd the speed at witch to move forward [-1,1]
	 * 	@param rotation the speed at which the robot should rotate where positive is counter clockwise [1,-1]
	 */
	public void drive(double fwrd, double rotation) {
        double wheelSpeeds[] = new double[4];
        wheelSpeeds[0] = fwrd-rotation;
        wheelSpeeds[1] = fwrd+rotation;
        wheelSpeeds[2] = fwrd-rotation;
        wheelSpeeds[3] = fwrd+rotation;
        RobotMap.frontLeftMotor.set(wheelSpeeds[0]);
        RobotMap.frontRightMotor.set(wheelSpeeds[1]);
        RobotMap.backLeftMotor.set(wheelSpeeds[2]);
        RobotMap.backRightMotor.set(wheelSpeeds[3]);
    }

}
