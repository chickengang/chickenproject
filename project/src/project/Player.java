package project;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JPanel;

public class Player extends JPanel {
	
	private final int step = 5;
	private final int width = 30;
	private final int height = 30;
	private final int jumpHeight = 150;
	private Graphics graphics;
	private int x = Frame.WIDTH - width;
	private int y = Frame.HEIGHT - height;
	private boolean jumped = false;
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		graphics = g;
		graphics.setColor(Color.blue);
		graphics.fillRect(x, y, width, height);
	}
	
	private void moveUp() {
		if(y - step >= 0) {
			System.out.println("Up");
			y -= step;
			this.repaint();
			System.out.println(x + "," + y);
		}
	}
	
	private void moveDown() {
		if(y + step + height <= Frame.HEIGHT) {
			System.out.println("Down");
			y += step;
			this.repaint();
			System.out.println(x + "," + y);
		}
	}
	
	public void moveLeft() {
		if(x - step >= 0) {
			System.out.println("Left");
			x -= step;
			this.repaint();
			System.out.println(x + "," + y);
		}
	}
	
	public void moveRight() {
		if(x + step + width <= Frame.WIDTH) {
			System.out.println("Right");
			x += step;
			this.repaint();
			System.out.println(x + "," + y);
		}
	}
	
	public void jump() {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				if(!jumped) {
					moveUp();
					if(y + height == Frame.HEIGHT - jumpHeight) {
						jumped = true;
					}
				}
				else {
					moveDown();
					if(y + height == Frame.HEIGHT) {
						jumped = false;
						this.cancel();
					}
				}
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000/60);
	}
	
}
