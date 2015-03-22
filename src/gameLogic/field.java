package gameLogic;

import java.awt.geom.Rectangle2D;

public class field{
	private char type;
	public Rectangle2D rect;

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
	
	public boolean detectHit() {
		if (this.type == 's') {
			this.setType('h');
			return true;
		}
		else if (this.type == 'e') {
			this.setType('m');
			return false;
		}
		else {
			return false;
		}
	}
}
