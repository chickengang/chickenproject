package project;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	private final int width = 300;
	private final int height = 300;
	private final String title = "Test";
	
	public Frame() {
		this.setSize(width, height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(title);
		this.setVisible(true);
	}
	
}
