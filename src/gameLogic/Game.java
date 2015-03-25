package gameLogic;

import java.util.ArrayList;
import java.util.List;
import schiffe.Schiff;

public class Game {
	public grid grid;
	private boolean exit;
	private boolean won;
	private List<Schiff> schiffe = new ArrayList<Schiff>();
	
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
		
		grid.drawGrid();

			
		
	}
	
	public boolean getExit() {
		return this.exit;
	}
}
