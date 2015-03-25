package gameLogic;

import java.awt.geom.Rectangle2D;

import schiffe.Schiff;

public class field{
	private char type;
	public Rectangle2D rect;
	private Schiff schiff;

	public field(char type) {
		
		this.type = type;
	}
	public void initRect( double x, double y, double w, double h) {
		this.rect = new Rectangle2D.Double(x, y, w, h);
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	public void addShip(Schiff schiff) {
		this.schiff = schiff;
	}
	
	public int detectHit() {
		int score = 0;
		if (this.type == 's') {
			this.setType('h');
			score = schiff.addHit();
			return score;
		}
		else if (this.type == 'e') {
			this.setType('m');
			return score;
		}
		else {
			return score;
		}
	}
}
