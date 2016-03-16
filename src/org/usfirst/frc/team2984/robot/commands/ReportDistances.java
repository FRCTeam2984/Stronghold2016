package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;
import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class ReportDistances extends Command {

	public ReportDistances(){
		requires(Robot.findBall);
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		SmartDashboard.putBoolean("Back Arm Limit Sensor", RobotMap.backArmLimit.get());
		SmartDashboard.putBoolean("Fwrd Arm Limit Sensor", RobotMap.fwrdArmLimit.get());
		SmartDashboard.putNumber("Left Distance Sensor", RobotMap.leftDistanceSensor.getAverageVoltage());
		SmartDashboard.putNumber("Right Distance Sensor", RobotMap.rightDistanceSensor.getAverageVoltage());
		SmartDashboard.putNumber("Arm Pot", RobotMap.armPot.getVoltage()*1000);

	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
