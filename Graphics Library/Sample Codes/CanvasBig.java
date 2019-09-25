import java.awt.Color;

public class CanvasBig {
	public static void main(String[] args) {
		
		// canvas parameters
		int canvas_width = 800;
		int canvas_height = 800;
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(-1, 1);
		StdDraw.setYscale(-1, 1);
		
		// circle parameters
		double circle_center_x = 0.0;
		double circle_center_y = 0.0;
		double circle_radius   = 0.95;
		double circle_border_thickness = 0.012;
		Color circle_color = StdDraw.PRINCETON_ORANGE; 

		// draw circle
		StdDraw.setPenColor(circle_color);
		StdDraw.setPenRadius(circle_border_thickness); 
		StdDraw.circle(circle_center_x, circle_center_y, circle_radius);
		
		// save drawing to a file
		StdDraw.save("output_figure.png"); // in .png or .jpg format
		
	}
}
