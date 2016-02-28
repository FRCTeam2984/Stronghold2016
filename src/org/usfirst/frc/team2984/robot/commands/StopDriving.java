package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A command to drive the robot forward for one second
 * 
 * @author max
 */
public class StopDriving extends Command {
	
	public StopDriving(){
		requires(Robot.drive);
		setTimeout(1.0);
	}

	/**
	 * starts the robot driving
	 */
	@Override
	protected void initialize() {
		Robot.drive.drive(0, 0);
	}

	@Override
	protected void execute() {
		
	}

	/**
	 *  @return Returns whether the command has finished or not
	 */
	@Override
	protected boolean isFinished() {
		return isTimedOut();
	}

	/**
	 * stops the robot moving
	 */
	@Override
	protected void end() {
		Robot.drive.drive(0, 0);
	}

	/**
	 * calls end
	 * @see end
	 */
	@Override
	protected void interrupted() {
		end();
	}

}
