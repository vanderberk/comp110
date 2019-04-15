
/**
 * Particle class to represent a flying object
 * 
 * @author BG
 *
 */
public class Particle {
	
	public double x;
	public double y;
	public double v;
	public double theta;
	public double radius;
	
	public Particle(double x, double y, double v, double theta, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.v = v;
		this.theta = theta;
		this.radius = radius;
	}
}
