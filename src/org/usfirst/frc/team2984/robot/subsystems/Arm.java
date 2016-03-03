package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.RobotMap;
import org.usfirst.frc.team2984.robot.commands.ArmViaJoystick;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArmViaJoystick());
	}
	
	public void set(double speed){
		if(this.checkIfCanMoveThatDirection(speed)){
			RobotMap.armMotor.set(speed);
		} else {
			RobotMap.armMotor.set(0);
		}
	}
	
	private boolean checkIfCanMoveThatDirection(double direction){
		boolean fwrd = direction > 0;
		return (fwrd) ? (!RobotMap.fwrdArmLimit.get()) : (!RobotMap.backArmLimit.get());
	}

}
