import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lab10Solution {
	

	public static void main(String[] args) {
		
		final int MAX_ITERATION = 10;
		int pauseDuration = 1000;
		
		ArrayList<Color> colors = setColors();
		
		initializeCanvas();
		ArrayList<Point2D> points = generateData();
		plotPoints(points);
		StdDraw.pause(pauseDuration);
		
		int k = 3;
		ArrayList<Point2D> centers = initializeCenters(points, k);
		
		plotCenters(centers,StdDraw.LIGHT_GRAY, 5);
		StdDraw.show();
		
		int iterationCounter = 0;
		while (iterationCounter < MAX_ITERATION){
			System.out.printf("Iteration: %d\n", iterationCounter+1);
			ArrayList<Integer> assignments = findAssignments(points, centers);
			ArrayList<Point2D> newCenters = updateCenters(points, centers, assignments);
			
			plotData(colors, points, centers, assignments, newCenters);
			StdDraw.pause(pauseDuration);
			
			centers = newCenters;
			iterationCounter++;
		}
		plotCenters(centers,StdDraw.BLACK, 8);
		System.out.println("finished");

	}

	private static void plotData(ArrayList<Color> colors, ArrayList<Point2D> points, ArrayList<Point2D> centers,
			ArrayList<Integer> assignments, ArrayList<Point2D> newCenters) {
		plotAssignments(points, assignments, colors);
		plotCenters(centers, StdDraw.DARK_GRAY, 5);
		for (int d = 0; d < newCenters.size(); d++) {
			StdDraw.setPenColor(StdDraw.DARK_GRAY);
			StdDraw.line(centers.get(d).getX(),centers.get(d).getY(),newCenters.get(d).getX(),newCenters.get(d).getY());
		}
		plotCenters(newCenters, StdDraw.DARK_GRAY, 5);
		StdDraw.show();
	}

	private static ArrayList<Point2D> initializeCenters(ArrayList<Point2D> points, int k) {
		ArrayList<Point2D> centers = new ArrayList<>();
		ArrayList<Integer> ind = new ArrayList<>();
		for (int i = 0; i < points.size(); i++)
			ind.add(i);
		Collections.shuffle(ind);
		for (int i = 0; i < k; i++)
			centers.add(points.get(ind.get(i)));
		return centers;
	}

	private static ArrayList<Color> setColors() {
		ArrayList<Color> colors = new ArrayList<>();
		colors.add(StdDraw.BOOK_LIGHT_BLUE);
		colors.add(StdDraw.ORANGE);
		colors.add(StdDraw.CYAN);
		colors.add(StdDraw.MAGENTA);
		colors.add(StdDraw.PINK);
		colors.add(StdDraw.RED);
		colors.add(StdDraw.YELLOW);
		colors.add(StdDraw.GREEN);
		colors.add(StdDraw.GRAY);
		colors.add(StdDraw.BLUE);
		return colors;
	}

	private static ArrayList<Point2D> updateCenters(ArrayList<Point2D> points, ArrayList<Point2D> centers,
			ArrayList<Integer> assignments) {
		ArrayList<Point2D> newCenters = new ArrayList<Point2D>();
		for (int c = 0; c < centers.size(); c++) {
			Point2D p = new Point2D.Double();
			int cc = 0;
			for (int m = 0; m < assignments.size(); m++) {
				if (assignments.get(m) == c) {
					cc++;
					p.setLocation(p.getX()+points.get(m).getX(), p.getY()+points.get(m).getY());
				}
			}
			p.setLocation(p.getX()/cc, p.getY()/cc);
			newCenters.add(p);
		}
		return newCenters;
	}

	private static ArrayList<Integer> findAssignments(ArrayList<Point2D> points, ArrayList<Point2D> centers) {
		ArrayList<Integer> assignments = new ArrayList<Integer>();
		for (int i = 0; i < points.size(); i++) {
			int chosenCenterID = 0;
			double minDist = Double.MAX_VALUE;
			for (int j = 0; j < centers.size(); j++) {
				double dist = points.get(i).distance(centers.get(j)); 
				if (dist < minDist) {
					chosenCenterID = j;
					minDist = dist;
				}
			}
			assignments.add(chosenCenterID);
		}
		return assignments;
	}

	private static void plotAssignments(ArrayList<Point2D> points, ArrayList<Integer> assignments, ArrayList<Color> colors) {
		
		for (int i = 0; i < points.size(); i++) {
			StdDraw.setPenColor(colors.get(assignments.get(i)));
			StdDraw.filledCircle(points.get(i).getX(), points.get(i).getY(), 2);
		}
		StdDraw.show();

	}

	private static void plotCenters(ArrayList<Point2D> centers, Color c, int r) {
		StdDraw.setPenColor(c);
		for (Point2D p : centers)
			StdDraw.filledCircle(p.getX(), p.getY(), r);
		StdDraw.show();
	}

	private static void initializeCanvas() {
		int width = 800;
		int height = 800;
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
	}
	private static ArrayList<Point2D> generateData() {
		ArrayList<Point2D> points = new ArrayList<>();
		// center x, center y, point count, noise level
		double[][] parameters = {
				{300, 100, 200, 40}, 
				{600, 500, 200, 40},
				{100, 700, 200, 20},
				//{100, 400, 200, 20},
				};
		
//		double[][] parameters = {
//				{400, 400, 800, 80}, 
//				{100, 100, 200, 40},
//				{100, 700, 200, 40},
//				{700, 100, 200, 40},
//				{700, 700, 200, 40},
//				};
		
		Random r = new Random();
		for (int j = 0; j < parameters.length; j++) 
			for (int i = 0; i < parameters[j][2]; i++) 
				points.add(new Point2D.Double(parameters[j][0] + r.nextGaussian()*parameters[j][3],
						parameters[j][1] + r.nextGaussian()*parameters[j][3]));
		return points;
	}
	public static void plotPoints(ArrayList<Point2D> points) {
		StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
		for (Point2D p : points) 
			StdDraw.filledCircle(p.getX(), p.getY(), 2);
		StdDraw.show();

	}

}
