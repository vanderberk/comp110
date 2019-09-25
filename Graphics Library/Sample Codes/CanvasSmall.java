import java.awt.Color;

public class CanvasSmall {
	public static void main(String[] args) {
		
		// canvas parameters
		int canvas_width = 400;
		int canvas_height = 400;
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		// circle parameters
		double circle_center_x = 0.5;
		double circle_center_y = 0.5;
		double circle_radius   = 0.45;
		double circle_border_thickness = 0.006;
		Color circle_color = StdDraw.PRINCETON_ORANGE; 

		// draw circle
		StdDraw.setPenColor(circle_color);
		StdDraw.setPenRadius(circle_border_thickness); 
		StdDraw.circle(circle_center_x, circle_center_y, circle_radius);
		
		// save drawing to a file
		StdDraw.save("output_figure.png"); // in .png or .jpg format
		
	}
}
