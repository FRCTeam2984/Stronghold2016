package org.usfirst.frc.team2984.robot.commands;

import org.usfirst.frc.team2984.robot.Robot;
import org.usfirst.frc.team2984.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 * A command to drive the robot forward for one second
 * 
 * @author max
 */
public class AlingToBall extends Command {
	
	public AlingToBall(){
		requires(Robot.drive);
		requires(Robot.findBall);
	}

	/**
	 * starts the robot driving
	 */
	@Override
	protected void initialize() {
		Robot.drive.drive(0, 0);
	}

	/**
	 * turns the robot to face the ball and moves close to it
	 */
	@Override
	protected void execute() {
		double[] ballLocation = Robot.findBall.findBall();
		if(Math.abs(ballLocation[0]) > 300){
			Robot.drive.drive(0, (ballLocation[0] > 0) ? -1 : 1);
		} else if(ballLocation[1] < 2000){
			Robot.drive.drive(1, 0);
		} else {
			Robot.drive.drive(0, 0);	
		}
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
