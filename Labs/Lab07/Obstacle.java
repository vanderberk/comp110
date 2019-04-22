
/**
 * Obstacle class represents the rectangular obstacles
 * 
 * @author BG
 *
 */
public class Obstacle {
	
	public double x;
	public double y;
	public double w;
	public double h;
	
	public Obstacle(double x, double y, double w, double h) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	
	public boolean isInside(double xx, double yy) {
		if ((xx >= x) && (xx <= x+w) && (yy >= y) && (yy <= y + h))
			return true;
		return false;
	}
	
	public void draw() {
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledRectangle(x+w/2, y+h/2.0, w/2.0, h/2.0);
	}
}
