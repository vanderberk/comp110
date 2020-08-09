
public class Circle {
	
	public double radius;
	public double x,y;
	
	Circle() {
		System.out.println("Default constructor. Hello!");
		y = 23.0;
	}
	
	Circle(double r, double x, double y) {
		System.out.println("Second constructor is called.");
		radius =r;
		this.x = x;
		this.y = y;
	}

}
