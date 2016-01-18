package org.usfirst.frc.team2984.robot.extraOI;

import org.usfirst.frc.team2984.robot.RemoteJoystick;

import edu.wpi.first.wpilibj.buttons.Button;

public class RemoteButton extends Button{
	
	private RemoteJoystick stick;
	private int button;
	
	public RemoteButton(RemoteJoystick remoteJoyStick, int id){
		this.stick = remoteJoyStick;
		this.button = id;
	}

	@Override
	public boolean get() {
		return this.stick.getButton(this.button);
	}

}
