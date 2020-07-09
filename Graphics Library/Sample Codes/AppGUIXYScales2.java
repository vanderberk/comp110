/**
 * Program uses XY scales according to canvas size, instead of using 0..1 range
 * 
 * @author BG
 *
 */
public class AppGUIXYScales2 {

	public static void main(String[] args) {

		int canvas_width = 400; // specify canvas width 
		int canvas_height = 400; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, canvas_width); 
		StdDraw.setYscale(0, canvas_height); 
		
		double circle_center_x = 80; // circle parameters: (x,y) coordinates, radius
		double circle_center_y = 160;
		double circle_radius = 16;
		StdDraw.filledCircle(circle_center_x, circle_center_y, circle_radius);
	}
}