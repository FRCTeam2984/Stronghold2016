package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem{
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	
	public void drive(double fwrd, double rotation) {

        double wheelSpeeds[] = new double[4];
        wheelSpeeds[0] = fwrd+rotation;
        wheelSpeeds[1] = fwrd-rotation;
        wheelSpeeds[2] = fwrd+rotation;
        wheelSpeeds[3] = fwrd-rotation;
        RobotMap.frontLeftMotor.set(wheelSpeeds[0]);
        RobotMap.frontRightMotor.set(wheelSpeeds[1]);
        RobotMap.backLeftMotor.set(wheelSpeeds[2]);
        RobotMap.backRightMotor.set(wheelSpeeds[3]);
    }

}
