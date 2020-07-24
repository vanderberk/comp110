
/**
 * Program draws one rectangle and one filled rectangle
 * 
 * @author BG
 */
public class AppGUIRectangle {
	public static void main(String[] args) { 
		
		int canvas_width = 400; // specify canvas width 
		int canvas_height = 400; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]
		
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		StdDraw.filledRectangle(0.5, 0.3, 0.15, 0.25);
		
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.3, 0.6, 0.2, 0.1);
	}
}