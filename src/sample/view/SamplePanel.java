package sample.view;
import sample.controller.GUIController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
public class SamplePanel extends JPanel
{
	private GUIController appController;
	private JButton colorButton;
	private JLabel textLabel;
	public SamplePanel(GUIController appController) {
		super();
		this.appController = appController;
		colorButton = new JButton("Click to change the color!");
		textLabel = new JLabel("This is a color app");
		setupPanel();
		setupLayout();
		setupListeners();
	}
	private void setupPanel() {
		this.setBackground(Color.CYAN);
		this.add(textLabel);
		this.add(colorButton);
		}
	private void setupLayout() {
		
	}
	private void setupListeners() {
		colorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent mouseClick)
			{
				System.out.println("You clicked a button!");
				changeBackgroundColor();
			}
		});
	}
	public void changeBackgroundColor() {
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red is " + red + " Green is " + green + " Blue is " + blue);
		System.out.println("Red is " + red + " Green is " + green + " Blue is " + blue);
		boolean isBlackorWhite;
		while (isBlackorWhite = true) {
			changeBackgroundColor();
			if(red == 0 && green == 0 && blue == 0) {
				isBlackorWhite = true;
			} else if(red == 255 && green == 255 && blue == 255) {
				isBlackorWhite = true;
			} else {
				isBlackorWhite = false;
			}
		}
		if(red > green && red > blue) {
			textLabel.setText("Hows that reddish color?");
		} else if(green > red && green > blue) {
			textLabel.setText("Hows that greenish color?");
		} else if (green < 10 && red < 10 && blue < 10) {
			System.out.println("you got black!");
		} else if (red == 0 && green == 0 && blue == 0) {
			colorButton.setVisible(false);
			System.out.println("YOU GOT BLACK!!!");
		} else if (red == 255  && green == 255 && blue == 255) {
			colorButton.setVisible(false);
			System.out.print("YOU GOT WHITE!!!!");
		} else {
			textLabel.setText("Hows that blueish color?");
		}
	}
}
