
/**
 * 
 * Polynomial3D class stores 3rd degree polynomial objects
 * 
 * @author BG
 *
 */
public class Polynomial3D extends Polynomial {
	private double a;
	private double b;
	private double c;
	private double d;
	
	public Polynomial3D(double a, double b, double c, double d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public double evaluate(double x) {
		return a + b * x + c * x * x + d * x * x * x;
	}
	
	public String toString() {
		return String.format("(%.3f)x^3+(%.3f)x^2+(%.3f)x^1+(%.3f)", d,c,b,a);
	} 
}
