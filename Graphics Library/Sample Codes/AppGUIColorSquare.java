/**
 * Program draws a square
 * 
 * @author BG
 */
public class AppGUIColorSquare {
	public static void main(String[] args) { 
		
		int canvas_width = 600; // specify canvas width 
		int canvas_height = 600; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]
		
		StdDraw.setPenColor(StdDraw.PINK); // set color for the 1st circle
		StdDraw.filledSquare(0.5, 0.5, 0.25);
		
	}
}