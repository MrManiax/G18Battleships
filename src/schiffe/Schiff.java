package schiffe;

public class Schiff {
	protected String name;
	protected int length;
	protected int count;
	protected int score;
	protected int hits = 0;
	protected int x;
	protected int y;
	protected boolean waage;
	
	public String getName() {
		return name;
	}
	public int getLength() {
		return length;
	}
	public int getCount() {
		return count;
	}
	public int getScore() {
		return score;
	}
	public int getWidth() {
		return width;
	}
	public int getHits() {
		return hits;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void addHit() {
		this.hits++;
	}
}