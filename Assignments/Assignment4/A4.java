import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * Main file for Assignment 4
 * 
 * @author BG
 *
 */
public class A4 {
	public static void main(String[] args) {

		StdDraw.setCanvasSize(800, 800);
		StdDraw.enableDoubleBuffering();
		
		int xmin = -10;
		int xmax = 10;
		int ymin = -10;
		int ymax = 10;
		StdDraw.setXscale(xmin, xmax);
		StdDraw.setYscale(ymin, ymax);
		drawAxes(xmin, xmax, ymin, ymax);
		
		double stepSize = 0.01;
		ArrayList<Double> x = new ArrayList<>();
		double xval = xmin;
		while (xval <= xmax) {
			x.add(xval);
			xval += stepSize;
		}
		
		String filename = "functions1.txt";
		ArrayList<Polynomial> p = readFunctions(filename);
		
		for (int ip = 0; ip < p.size(); ip++) {
			System.out.println("\nFunction: " + p.get(ip));
			ArrayList<Double> y = new ArrayList<>();
			for (int i = 0; i < x.size(); i++)
				y.add(p.get(ip).evaluate(x.get(i)));
			p.get(ip).setX(x);
			p.get(ip).setY(y);
			p.get(ip).draw();
			
			StdDraw.setPenColor(StdDraw.BLACK);
			ArrayList<Double> xx = p.get(ip).derivative(xmin, xmax);
			System.out.println("Points with zero derivatives:");
			
			if (xx.size() == 0) {
				System.out.println("There are no points with zero derivative in the range.");
			}
			else {
				for (int i = 0; i < xx.size(); i++) {
					System.out.printf("%2d. x:%6.2f, y:%6.2f\n", (i+1), xx.get(i), p.get(ip).evaluate(xx.get(i)) );
					StdDraw.filledCircle(xx.get(i), p.get(ip).evaluate(xx.get(i)), 0.2);
				}
			}

			StdDraw.show();
		}

	}
	
	/** 
	 * Reads polynomial functions from a text file
	 * 
	 * @param filename Filename of the input text file
	 * @return Array list of polynomial objects
	 * 
	 */
	private static ArrayList<Polynomial> readFunctions(String filename) {
		ArrayList<Polynomial> p = new ArrayList<>();
		
		File myFile = new File(filename);
		Scanner myInput = null;
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}

		while(myInput.hasNext()) {
			String line = myInput.nextLine();
			String[] parts = line.split(",");
			if (parts.length==2) {
				Polynomial pp = new Polynomial1D(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]));
				p.add(pp);
			} else if (parts.length==3) {
				Polynomial pp = new Polynomial2D(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]));
				p.add(pp);
			} else if (parts.length==4) {
				Polynomial pp = new Polynomial3D(Double.parseDouble(parts[0]),Double.parseDouble(parts[1]),Double.parseDouble(parts[2]),Double.parseDouble(parts[3]));
				p.add(pp);
			}
		}
		
		return p;
	}

	/**
	 * 
	 * Utility to draw x-y axes. Ranges are [xmin...xmax] and [ymin..xymax]
	 * 
	 * @param xmin
	 * @param xmax
	 * @param ymin
	 * @param ymax
	 */
	private static void drawAxes(int xmin, int xmax, int ymin, int ymax) {
		StdDraw.line(0, ymin, 0, ymax);
		StdDraw.line(xmin, 0, xmax, 0);
		for (int i = xmin; i <=xmax; i++)
			StdDraw.filledCircle(i, 0, 0.05);
		for (int i = ymin; i <=ymax; i++)
			StdDraw.filledCircle(0, i, 0.05);
	}
}
