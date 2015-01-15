package robot.controller;

import robot.model.AtonomousCommands;
import lejos.nxt.*;

public class AtonomousController
{
	private UltrasonicSensor mySonar;
	private TouchSensor frontTouch;
	private TouchSensor backTouch;
	private SoundSensor microphone;
	public AtonomousCommands myCommands;
	

	public AtonomousController()
	{
		mySonar = new UltrasonicSensor(SensorPort.S1);
		frontTouch = new TouchSensor(SensorPort.S2);
		backTouch = new TouchSensor(SensorPort.S3);
		microphone = new SoundSensor(SensorPort.S4);

	}
	
	public boolean isRobotOn()
	{
		
	}

	public void start()
	{
		
	}
	
	/**
	 * Uses the SoundSensor Object microphone to dance microphone.readValue()
	 * will be the method used to determine danceness
	 */
	public void danceRobotDance()
	{

	}

	/**
	 * Uses the TouchSensor, specifically the .isPressed() method to move away
	 * from objects and continue moving.
	 */
	public void hasHaphephobia()
	{

	}

	/**
	 * Use this method and the mySonar object to avoid objects and drive around
	 * the room. You should stay about 8-12 inches away from objects and use the
	 * mySonar.getDistance() method to calculate that.
	 * 
	 */
	public void driveAroundRoom()
	{
		if(myCommands.getTooClose()== false)
		{
			while(myCommands.getTooClose())
		}
	}
	
	public double getDistance()
	{
		while()
	}

	/**
	 * 
	 * @param vertexCount
	 * @return
	 */
	private int calculateAngle(int vertexCount)
	{
		int currentAngle = 0;

		if (vertexCount != 0)
		{
			currentAngle = 360 / vertexCount;
		}

		return currentAngle;
	}
}
