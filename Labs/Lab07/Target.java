
/**
 * 
 * Target objects are modeled using the Target class.
 * They are rectangular.
 * 
 * @author BG
 *
 */
public class Target {
	
	public double x;
	public double y;
	public double w;
	public double h;
	
	public Target(double x, double y, double w, double h) {
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
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledRectangle(x+w/2, y+h/2.0, w/2.0, h/2.0);
	}
}
