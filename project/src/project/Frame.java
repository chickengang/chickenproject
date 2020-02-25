package project;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public static final int WIDTH = 300;
	public static final int HEIGHT = 300;
	private final String title = "Test";
	
	public Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setTitle(title);
		this.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
		this.pack();
		this.setVisible(true);
		
	}
	
}
