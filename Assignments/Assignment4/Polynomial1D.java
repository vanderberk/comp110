
/**
 * 
 * Polynomial1D class stores 1st degree polynomial objects
 * 
 * @author BG
 *
 */
public class Polynomial1D extends Polynomial {
	private double a;
	private double b;
	
	public Polynomial1D(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double evaluate(double x) {
		return a + b * x;
	}
	public String toString() {
		return String.format("(%.3f)x^1+(%.3f)",b,a);
	} 
}
