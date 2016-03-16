package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;
import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;

public class ArmViaJoystick extends Command{

	private long lastTime;
	private double lastValue;
	
	public ArmViaJoystick(){
		requires(Robot.arm);
	}
	
	@Override
	protected void initialize() {
		this.lastTime = System.currentTimeMillis();
		this.lastValue = 0;
		RobotMap.armMotor.setVoltageRampRate(24);
	}

	/**
	 * sets the arm to move
	 */
	@Override
	protected void execute() {
		if(Math.abs(Robot.oi.stick.getY()-this.lastValue) < RobotMap.lambda){
			if(System.currentTimeMillis()-this.lastTime > 1000){
				Robot.arm.set(0);
			} else {
				Robot.arm.set(Robot.oi.stick.getY());
			}
		} else {
			this.lastTime = System.currentTimeMillis();
			this.lastValue = Robot.oi.stick.getY();	
			Robot.arm.set(Robot.oi.stick.getY());
		}
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		lastValue = 0;
		Robot.arm.set(0);
	}

	@Override
	protected void interrupted() {
		end();
	}

}
