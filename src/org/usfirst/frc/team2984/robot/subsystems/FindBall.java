package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;
import org.usfirst.frc.team2984.robot.commands.ReportDistances;

import edu.wpi.first.wpilibj.command.Subsystem;

public class FindBall extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		
		setDefaultCommand(new ReportDistances());
		
	}
	
	public double[] findBall(){
		double leftDist = RobotMap.leftDistanceSensor.getAverageVoltage();
		double middleDist = RobotMap.middleDistanceSensor.getAverageVoltage();
		double rightDist = RobotMap.rightDistanceSensor.getAverageVoltage();
		
		return new double[]{rightDist-leftDist, (leftDist+rightDist)/2D};
	}

}
