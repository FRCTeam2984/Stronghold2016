package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class SpitOut extends Command{

	public SpitOut(){
		requires(Robot.feeder);
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.feeder.spitOut();
	}

	@Override
	protected boolean isFinished() {
		return false;
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
