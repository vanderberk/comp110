
/**
 * 
 * Polynomial2D class stores 2nd degree polynomial objects
 * 
 * @author BG
 *
 */
public class Polynomial2D extends Polynomial {
	private double a;
	private double b;
	private double c;
	
	public Polynomial2D(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double evaluate(double x) {
		return a + b * x + c * x * x;
	}
	public String toString() {
		return String.format("(%.3f)x^2+(%.3f)x^1+(%.3f)",c,b,a);
	} 
}
