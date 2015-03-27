package gameLogic;

import java.util.ArrayList;
import java.util.List;

import mainLoop.View;
import schiffe.Schiff;

public class Game {
	public grid grid;
	private boolean exit;
	private boolean won;
	private int turn;
	private List<Schiff> schiffe = new ArrayList<Schiff>();
	public View view;
	
	public Game(){
		this.exit = false;
		this.won = false;
		this.grid = new grid();
		
		
		
		this.schiffe.add(new schiffe.Uboot());
		this.grid.addShip(this.schiffe.get(0));
		this.schiffe.add(new schiffe.Uboot());
		this.grid.addShip(this.schiffe.get(1));
		this.schiffe.add(new schiffe.Uboot());
		this.grid.addShip(this.schiffe.get(2));
		this.schiffe.add(new schiffe.Uboot());
		this.grid.addShip(this.schiffe.get(3));
		this.schiffe.add(new schiffe.Schlacht());
		this.grid.addShip(this.schiffe.get(4));
		this.schiffe.add(new schiffe.Schlacht());
		this.grid.addShip(this.schiffe.get(5));
		this.schiffe.add(new schiffe.Kreuzer());
		this.grid.addShip(this.schiffe.get(6));
		this.schiffe.add(new schiffe.Kreuzer());
		this.grid.addShip(this.schiffe.get(7));
		this.schiffe.add(new schiffe.FlugTr());
		this.grid.addShip(this.schiffe.get(8));
		
		this.view = new View(grid);
		
		grid.drawGrid();

			
		
	}
	
	public void runGame() {
		if (view.panel.getSelectedField() != null) {
        	
            this.grid.hitField(view.panel.getSelectedField().y, view.panel.getSelectedField().x);
            this.addTurn();
            view.title = "Turn: " + turn + " - Score: " + grid.getScore();
            view.frame.setTitle(view.title);
            view.panel.setSelectedField(null);
        }
	}
	
	public void addTurn() {
		this.turn++;
	}
	
	public int getTurn() {
		return turn;
	}
	
	private void checkGame() {
		boolean tmp = false;
		for (Schiff schiff : this.schiffe) {
			if (schiff.getAlive()) {
				tmp = true;
			}
		}
		if (!tmp) {
			this.won = true;
		}
	}
	
	public boolean isWon() {
		checkGame();
		return this.won;
	}
	
	public boolean getExit() {
		return this.exit;
	}
}
