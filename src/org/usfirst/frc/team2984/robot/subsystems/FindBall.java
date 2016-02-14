package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FindBall extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public double[] findBall(){
		double leftDist = RobotMap.leftDistanceSensor.getAverageVoltage();
		double middleDist = RobotMap.middleDistanceSensor.getAverageVoltage();
		double rightDist = RobotMap.rightDistanceSensor.getAverageVoltage();
		
		return new double[]{rightDist-leftDist, middleDist};
	}

}
