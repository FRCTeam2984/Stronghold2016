package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SuckIn extends Command{

	public SuckIn(){
		requires(Robot.feeder);
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		if(!Robot.feeder.isBallIn()){
			Robot.feeder.takeIn();
		} else {
			Robot.feeder.stop();
		}
	}

	@Override
	protected boolean isFinished() {
		return Robot.feeder.isBallIn();
	}

	@Override
	protected void end() {
		Robot.feeder.stop();
		
	}

	@Override
	protected void interrupted() {
		end();
	}

}
