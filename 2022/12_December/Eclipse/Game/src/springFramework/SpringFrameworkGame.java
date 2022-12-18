package springFramework;

import springFramework.game.Contra;
import springFramework.game.GameRunner;
import springFramework.game.GamingConsole;
import springFramework.game.MarioGame;


public class SpringFrameworkGame {

	public static void main(String[] args) {
		GamingConsole game=new MarioGame();
		GamingConsole game2=new Contra();
		GameRunner runner=new GameRunner(game2);
		runner.run();
	}

}
