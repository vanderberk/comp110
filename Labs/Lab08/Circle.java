import java.awt.Color;

public class Circle extends Shape {
	public double x;
	public double y;
	public double r;
	
	public Circle(double x, double y, double r, Color c) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		color = c;
		area = calculateArea();
	}
	
	public void draw() {
		StdDraw.setPenColor(color); 
		StdDraw.filledCircle(x, y, r);
		StdDraw.setPenColor(StdDraw.DARK_GRAY); 
		StdDraw.circle(x, y, r);
	}
	
	
	public boolean isInside(double xcoor, double ycoor) {
		double dist = Math.pow(Math.pow(x-xcoor,2)+Math.pow(y-ycoor,2), 0.5);
		if (dist <= r)
			return true;
		return false;
	}
	
	private double calculateArea() {
		return Math.PI * r * r;
	}
}
