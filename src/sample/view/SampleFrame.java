package sample.view;

import javax.swing.*;
import sample.controller.GUIController;

public class SampleFrame extends JFrame
{
	private GUIController appController;
	private SamplePanel appPanel;

	public SampleFrame(GUIController appController)
	{
		super();
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
		setupFrame();
	}
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(1920, 1080);
		this.setTitle("Minceraft 2");
		this.setResizable(false);
		this.setVisible(true);
	}
}