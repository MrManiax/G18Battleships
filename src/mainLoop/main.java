package mainLoop;

import gameLogic.Game;

public class main {
	/**
	 * @param args
	 */   
	public static void main(String[] args) {
		
		Game game = new Game();
		
		do {
			game.runGame();
			game.view.panel.repaint();
		
		} while (!game.isWon());
		
		game.view.frame.setTitle("Game Over!");
	}
}
