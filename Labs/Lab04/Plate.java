import java.awt.Color;

public class Plate {
	private double x;
	private double y;
	private double radius;
	private Color color;

	public Plate(double x, double y, double radius, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public double distance(Plate p) {
		return Math.pow((x-p.getX())*(x-p.getX())+(y-p.getY())*(y-p.getY()), 0.5);
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void draw() {
		StdDraw.setPenColor(color);
		StdDraw.setPenRadius(0.001); 
		StdDraw.filledCircle(x, y, radius);
		
	}


}
