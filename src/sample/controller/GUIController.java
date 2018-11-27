package sample.controller;

import sample.view.SampleFrame;

public class GUIController
{
	private SampleFrame appFrame;
	public GUIController() 
	{
		this.appFrame = new SampleFrame(this);
	}
	public void start() {
		
	}
}
