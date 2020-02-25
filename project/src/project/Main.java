package project;

public class Main {

	public static void main(String[] args) {
		
		Frame frame = new Frame();
		Player player = new Player();
		Controller controller = new Controller(player);
		frame.add(player);
		frame.addKeyListener(controller);

	}

}
