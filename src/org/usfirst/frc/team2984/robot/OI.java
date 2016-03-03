package org.usfirst.frc.team2984.robot;

import org.usfirst.frc.team2984.robot.commands.AlignToBall;
import org.usfirst.frc.team2984.robot.commands.SpitOut;
import org.usfirst.frc.team2984.robot.commands.SuckIn;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	/**
	 * The Joystick that is used for button input (PS2 controller)
	 */
	public Joystick stick = new Joystick(RobotMap.joystickChannel);
	
	/**
	 * the button that will make the robot drive forward for one second
	 */
	Button suckIn = new JoystickButton(stick, 2);
	Button spitOut = new JoystickButton(stick, 4);
	Button align = new JoystickButton(stick, 8);
    
	/**
	 * initializes the behaviors for each input
	 */
	public OI(){
		suckIn.whileHeld(new SuckIn());
		spitOut.whileHeld(new SpitOut());
		align.whileHeld(new AlignToBall());
	}
}

