package org.usfirst.frc.team2984.robot.commands;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.usfirst.frc.team2984.robot.RemoteJoystick;
import org.usfirst.frc.team2984.robot.RobotMap;
import sun.reflect.*;
import java.lang.reflect.*;

public class DriveUsingJoystickTest {
	
	DriveUsingJoystick command;
	RemoteJoystick stick;
	RobotMap map;
	
	@Before
	public void before(){
		//stick = mock(RemoteJoystick.class);
//		try {
//			setFinalStatic(RobotMap.class.getField("frontLeftMotor"), false);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		when(RobotMap.remoteJoystick).thenReturn(null);
//		when(RobotMap.backLeftMotor).thenReturn(null);
//		when(RobotMap.backRightMotor).thenReturn(null);
//		when(RobotMap.frontLeftMotor).thenReturn(null);
//		when(RobotMap.frontRightMotor).thenReturn(null);
//		command = new DriveUsingJoystick();
	}
	
	@Test
	public void noInputDoesNotMove(){
		
	}
}
