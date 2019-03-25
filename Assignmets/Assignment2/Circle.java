import java.awt.Color;

public class Circle {
	private double x;
	private double y;
	private double r;
	
	Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void draw(double penRadius, Color c) {
		//StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenColor(c);
		StdDraw.setPenRadius(penRadius); 
		StdDraw.circle(x, y, r);
	}
	
	public double distance(Circle c) {
		return Math.pow((x-c.x)*(x-c.x)+(y-c.y)*(y-c.y), 0.5);
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getR() {
		return r;
	}
	
}
