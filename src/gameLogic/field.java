package gameLogic;

public class field {
	private char type;
	private int x;
	private int y;
	
	public field (char type, int x, int y) {
		this.type = type;
		this.x = x;
		this.y = y;
	}

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}
	
	public int[] getPos() {
		int[] tmp = [this.x, this.y];
		return tmp;
	}
}
