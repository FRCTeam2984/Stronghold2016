package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;
import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveUsingJoystick extends Command {
	
	public DriveUsingJoystick(){
		requires(Robot.drive);
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
		Robot.drive.drive(RobotMap.remoteJoystick.getY(), RobotMap.remoteJoystick.getTwist());
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