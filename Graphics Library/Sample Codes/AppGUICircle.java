/**
 * Program draws a circle
 * 
 * @author BG
 */
public class AppGUICircle {

	public static void main(String[] args) {

		int canvas_width = 600; // specify canvas width 
		int canvas_height = 600; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]
		
		double circle_center_x = 0.5; // circle parameters: (x,y) coordinates, radius
		double circle_center_y = 0.5;
		double circle_radius = 0.45;
		StdDraw.circle(circle_center_x, circle_center_y, circle_radius);
	}
}