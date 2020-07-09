/**
 * Program uses XY scales in the range 0..1
 *	 
 * @author BG
 *
 */
public class AppGUIXYScales1 {

	public static void main(String[] args) {

		int canvas_width = 400; // specify canvas width 
		int canvas_height = 400; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); 
		StdDraw.setYscale(0, 1); 
		
		double circle_center_x = 0.2; // circle parameters: (x,y) coordinates, radius
		double circle_center_y = 0.4;
		double circle_radius = 0.04;
		StdDraw.filledCircle(circle_center_x, circle_center_y, circle_radius);
	}
}