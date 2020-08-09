
public class Circle {
	
	public double x;
	public double y;
	public double radius;
	
	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	

}
