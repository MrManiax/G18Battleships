package schiffe;

public class Schiff {
	protected String name;
	protected int length;
	protected int count;
	protected int score;
	protected int width;
	protected int hits;
	protected int x;
	protected int y;
	protected boolean waage;
	protected boolean alive;

	public int addHit() {
		this.hits++;
		if (this.length == this.hits) {
			this.alive = false;
			return this.score;
		}
		else {
			return 0;
		}
	}

	public int getCount() {
		return count;
	}

	public int getHits() {
		return hits;
	}

	public int getLength() {
		return length;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public int getWidth() {
		return width;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void setWaage(boolean b) {
		this.waage = b;
	}
	
	public boolean getWaage() {
		return this.waage;
	}
	
	public boolean getAlive() {
		return this.alive;
	}
}
