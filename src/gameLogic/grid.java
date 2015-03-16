package gameLogic;

import schiffe.Schiff;

public class grid {
	private field[][] grid = new field [10][10];
	
	public grid() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grid[i][j] = new field('e');
			}
		}
	}
	
	public void addShip(Schiff schiff) {
		
	}
}
