package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class BallFeeder extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public void takeIn(){
		RobotMap.feederMotorOne.set(1.0);
		RobotMap.feederMotorTwo.set(1.0);
	}
	
	public void spitOut(){
		RobotMap.feederMotorOne.set(-1.0);
		RobotMap.feederMotorTwo.set(-1.0);
	}
	
	public void stop(){
		RobotMap.feederMotorOne.set(0);
		RobotMap.feederMotorTwo.set(0);
	}
	
	public boolean isBallIn(){
		boolean first = RobotMap.ballInLimitOne.get();
		boolean second = RobotMap.ballInLimitTwo.get();
		return !first && !second;
	}

	
}
