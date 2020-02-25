package project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
	
	private Player player;
	
	public Controller(Player player) {
		this.player = player;
	}
	
	@Override
	public void keyPressed(KeyEvent event) {
		switch(event.getKeyCode()) {
		/*
		case KeyEvent.VK_UP:
			player.moveUp();
			break;
		case KeyEvent.VK_DOWN:
			player.moveDown();
			break;
			*/
		case KeyEvent.VK_SPACE:
			player.jump();
			break;
		case KeyEvent.VK_LEFT:
			player.moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			player.moveRight();
			break;
		}	
	}

	@Override
	public void keyReleased(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent event) {
		// TODO Auto-generated method stub
		
	}

}
