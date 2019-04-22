import java.awt.Color;

public class Rectangle extends Shape {
	
	public double x;
	public double y;
	public double w;
	public double h;
	
	public Rectangle(double x, double y, double w, double h, Color c) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		color = c;
		area = calculateArea();
	}

	public void draw() {
		StdDraw.setPenColor(color); 
		StdDraw.filledRectangle(x+w/2.0, y+h/2.0, w/2.0, h/2.0);
		StdDraw.setPenColor(StdDraw.DARK_GRAY); 
		StdDraw.rectangle(x+w/2.0, y+h/2.0, w/2.0, h/2.0);
	}
	
	public boolean isInside(double xcoor, double ycoor) {
		if ((xcoor>x) && (xcoor<x+w) && (ycoor>y) && (ycoor<y+h))
			return true;
		return false;
	}
	private double calculateArea() {
		return w * h;
	}

}
