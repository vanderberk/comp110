import java.util.ArrayList;

/**
 * 
 * Polynomial super class
 * 
 * @author BG
 *
 */
public class Polynomial {
	
	private ArrayList<Double> x;
	private ArrayList<Double> y;

	private double stepSize = 0.0001;
	private double h = 0.00001;
	private double threshold = 0.0001;

	/**
	 * 
	 * Evaluates the function at a given x point
	 * It is implemented in subclasses
	 * 
	 * @param x x coordinate
	 * @return y coordinate
	 */
	public double evaluate(double x) {
		return 0.0;
	}
	
	/**
	 * Draws the polynomial on the canvas
	 */
	public void draw() {
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.setPenRadius(0.004);
		for (int i = 0; i < x.size()-1; i++)
			StdDraw.line(x.get(i), y.get(i), x.get(i+1), y.get(i+1));
		StdDraw.show();
	}

	/** 
	 * Finds the zero derivative points in an interval [xmin...xmax] 
	 * and stores their x coordinates in an array list
	 * 
	 * @param xmin Minimum x coordinate
	 * @param xmax Maximum x coordinate
	 * @return x coordinates of zero derivative points
	 */
	public ArrayList<Double> derivative(double xmin, double xmax) {
		ArrayList<Double> derivativeValues = new ArrayList<>();
		
		double xval = xmin;
		while(xval <= xmax) {
			double d = (evaluate(xval+h)-evaluate(xval))/h;
			if (Math.abs(d) < threshold ) {
				if (derivativeValues.size() > 0) {
					boolean found = false;
					for (int i = 0; i < derivativeValues.size(); i++) 
						if (Math.abs(derivativeValues.get(i)-xval) < 0.1) {
							found = true;
							break;
						}
					if (found == false) 
						derivativeValues.add(xval);
				}
				else 
					derivativeValues.add(xval);
			}
			xval += stepSize;
		}
		return derivativeValues;
	}

	public void setX(ArrayList<Double> x) {
		this.x = x;
	}

	public void setY(ArrayList<Double> y) {
		this.y = y;
	}
	

}
