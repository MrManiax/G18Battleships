package gameLogic;

import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import mainLoop.View;

public class Game {
	public grid arena;
	
	public Game(){
		arena = new grid();
		View view = new View(arena);
	
		schiffe.Uboot uboot1 = new schiffe.Uboot();
		arena.addShip(uboot1);
		schiffe.Uboot uboot2 = new schiffe.Uboot();
		arena.addShip(uboot2);
		schiffe.Uboot uboot3 = new schiffe.Uboot();
		arena.addShip(uboot3);
		schiffe.Uboot uboot4 = new schiffe.Uboot();
		arena.addShip(uboot4);
		schiffe.Schlacht schlacht1 = new schiffe.Schlacht();
		arena.addShip(schlacht1);
		schiffe.Schlacht schlacht2 = new schiffe.Schlacht();
		arena.addShip(schlacht2);
		schiffe.Kreuzer kreuzer1 = new schiffe.Kreuzer();
		arena.addShip(kreuzer1);
		schiffe.Kreuzer kreuzer2 = new schiffe.Kreuzer();
		arena.addShip(kreuzer2);
		schiffe.FlugTr flugTr1 = new schiffe.FlugTr();
		arena.addShip(flugTr1);
		arena.drawGrid();
	}
}
