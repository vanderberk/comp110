import java.awt.Color;
import java.util.Random;

/**
 * Cat class
 * 
 * @author Berk Gokberk
 *
 */
public class Cat {
	
	private int x;
	private int y;
	private Color color;
	
	/**
	 * Constructor for the cat
	 * @param x x location
	 * @param y y location
	 * @param c color of the cat
	 */
	Cat(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		this.color = c;
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

	/**
	 * Draw the cat on the canvas
	 */
	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x+0.5, y+0.5, .2);
	}
	
	/**
	 * Moves the cat
	 * 
	 * Possible directions:
	 * 0: down
	 * 1: left
	 * 2: up
	 * 3: right
	 * @param direction Direction can be 0,1,2, or 3. See the explanations above.
	 */
	public void move(int direction) {
		if (direction == 0)
			y--;
		else if (direction == 1)
			x--;
		else if (direction == 2)
			y++;
		else if (direction == 3)
			x++;
				
	}
	

}
