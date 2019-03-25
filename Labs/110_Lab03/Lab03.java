import java.awt.Color;
import java.util.Random;

public class Lab03 {
	public static void main(String[] args) {
		
		// canvas parameters
		int canvas_width = 500;
		int canvas_height = 500;
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		// circle parameters
		double circle_center_x = 0.5;
		double circle_center_y = 0.5;
		double circle_radius   = 0.499;
		double circle_border_thickness = 0.002;
		Color circle_color = StdDraw.PRINCETON_ORANGE; 

		// draw circle
		StdDraw.setPenColor(circle_color);
		StdDraw.setPenRadius(circle_border_thickness); 
		StdDraw.circle(circle_center_x, circle_center_y, circle_radius);
		
		Random randomGenerator = new Random();
		
		int counter = 0;
		int pointCount = 50000;
		int pointInside = 0;
		while ( counter < pointCount) {
			double x = randomGenerator.nextDouble();
			double y = randomGenerator.nextDouble();
			
			double dist = Math.pow((x-circle_center_x)*(x-circle_center_x)+(y-circle_center_y)*(y-circle_center_y), 0.5);
			if (dist <= circle_radius) {
				StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				pointInside++;
				
			}
			else
				StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
			StdDraw.setPenRadius(0.001); 
			StdDraw.filledCircle(x, y, 0.005);
			counter++;
		}
		double estimatedPI = (4.0 * pointInside) / (double)pointCount;
		System.out.printf("Estimated PI: %.4f\n", estimatedPI);
		// save drawing to a file
		StdDraw.save("output_figure.png"); // in .png or .jpg format
	}
}
