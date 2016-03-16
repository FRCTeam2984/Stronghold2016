package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/*
 * Does nothing particularly interesting
 * 
 * Runs in O(Infinite)for execution
 * 
 * Good bye Dave
 */
public class AutonomousDrive extends Command {

	public AutonomousDrive()
	{
		requires(Robot.drive);
		setTimeout(4.0);
	}

	@Override
	protected void initialize() {
		Robot.drive.drive(0, 0);
		
	}

	@Override
	protected void execute() {
		Robot.drive.drive(0.5, 0);
		
	}

	@Override
	protected boolean isFinished() {
		return this.isTimedOut();
	}

	@Override
	protected void end() {
		Robot.drive.drive(0, 0);
		
	}

	@Override
	protected void interrupted() {
		end();
	}
}