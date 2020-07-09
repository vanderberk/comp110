/**
 * Program draws a line
 * 
 * @author BG
 */
public class AppGUILine {

	public static void main(String[] args) {

		int canvas_width = 400; 
		int canvas_height = 400; 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); 
		StdDraw.setYscale(0, 1); 
		
		StdDraw.clear(StdDraw.WHITE); // clear the screen
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE); // set pen color
		StdDraw.setPenRadius(0.01);  // set pen size
		
		double x0 = 0.2, y0 = 0.7; // line coordinate: starting position
		double x1 = 0.8, y1 = 0.3; // line coordinate: end position
		StdDraw.line(x0, y0, x1, y1);

		StdDraw.show();
	}
}