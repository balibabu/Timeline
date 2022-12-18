package springFramework.game;

public class MarioGame implements GamingConsole {

	public void up() {
		System.out.println("jump");
	}

	public void down() {
		System.out.println("dock");
	}

	public void left() {
		System.out.println("stop");
		
	}

	public void right() {
		System.out.println("accelerate");
		
	}

}
