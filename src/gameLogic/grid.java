package gameLogic;

import schiffe.Schiff;

public class grid {
	private field[][] grid = new field[10][10];

	public grid() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				grid[i][j] = new field('e');
			}
		}
	}

	public void addShip(Schiff schiff) {

	}

	public void drawGrid() {
		char type;
		String cont = "";
		String line = " --------------------------------------------- \n";
		String head = " |   | A | B | C | D | E | F | G | H | I | J | \n";

		cont = line;
		cont += head;

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
					cont += "  | ";
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
	}
}
