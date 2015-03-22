package gameLogic;

import schiffe.Schiff;

public class grid{
	public field[][] grid = new field[10][10];
	private int colCount = 10;
	private int rowCount = 10;

	public grid() {
		
		for (int i = 0; i < colCount; i++) {
			for (int j = 0; j < rowCount; j++) {
				grid[i][j] = new field('e');
				
			}
		}
	}
	
	public int getColCount() {
		return colCount;
	}

	public void setColCount(int colCount) {
		this.colCount = colCount;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public void addShip(Schiff schiff) {
		int dir = (int) ((Math.random() * 100) % 2);
		int x = (int) ((Math.random() * 100) % (colCount - 1));
		int y = (int) ((Math.random() * 100) % (rowCount - 1));
		
		if (testPos(schiff, x, y, dir)) {
			
			switch(dir) {
			case 0:
				schiff.setWaage(true);
				schiff.setX(x);
				schiff.setY(y);
				for (int i = x; i < (x + schiff.getLength()); i++) {
					this.grid[i][y].setType('s');
				}
				break;
			
			case 1:
				schiff.setWaage(false);
				schiff.setX(x);
				schiff.setY(y);
				for (int i = y; i < (y + schiff.getLength()); i++) {
					this.grid[x][i].setType('s');
				}
				break;
			}
		}
		else {
			addShip(schiff);
		}
	}
	
	private boolean testPos(Schiff schiff, int x, int y, int dir) {
		if (dir < 1) {
			if (x + schiff.getLength() > (colCount)) {
				return false;
			}
			for (int i = x; i < (x + schiff.getLength()); i++) {
				if (this.grid[i][y].getType() == 's') {
					return false;
				}
			}
		}
		else {
			if (y + schiff.getLength() > (rowCount)) {
				return false;
			}
			for (int i = y; i < (y + schiff.getLength()); i++) {
				if (this.grid[x][i].getType() == 's') {
					return false;
				}
			}
		}
		return true;
	}
	
	
	
	public void drawGrid() {
		char type;
		String cont = "";
		String line = " --------------------------------------------- \n";
		String head = "|   | A | B | C | D | E | F | G | H | I | J | \n";

		cont = line;
		cont += head;
		
		int test = 0;

		for (int i = 0; i < 10; i++) {
			cont += line;
			cont += "| " + (i + 1) + " | ";
			for (int j = 0; j < 10; j++) {
				type = this.grid[i][j].getType();

				switch (type) {
				case 'e':
					cont += "  | ";
					break;
				case 's':
					cont += "D | ";
					test++;
					break;
				case 'h':
					cont += "X | ";
					break;
				case 'm':
					cont += "O | ";
					break;
				default:
					cont += "E | ";
					break;
				}

			}
			cont += "\n";
		}

		System.out.println(cont);
		
		System.out.printf("Gesamtzahl der Schifffelder: %d.    ", test);
		if (test == 27) {
			System.out.printf("Alles OK!");
		}
		else {
			System.out.printf("Irgendetwas ist schief gelaufen!");
		}
	}
}
