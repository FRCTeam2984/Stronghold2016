package org.usfirst.frc.team2984.robot.subsystems;

import org.usfirst.frc.team2984.robot.commands.CaptureCamera;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Camera extends Subsystem{

	private int session;
	private Image frame;
	
	public Camera(){
		
		frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);

        // the camera name (ex "cam0") can be found through the roborio web interface
        session = NIVision.IMAQdxOpenCamera("cam0",
                NIVision.IMAQdxCameraControlMode.CameraControlModeController);
        NIVision.IMAQdxConfigureGrab(session);
        NIVision.IMAQdxStartAcquisition(session);
	}
	
	public void capture(){
		

       NIVision.IMAQdxGrab(session, frame, 1);
            
       CameraServer.getInstance().setImage(frame);
        
	}

	public void end(){
		NIVision.IMAQdxStopAcquisition(session);
	}
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new CaptureCamera());
		
	}

}
