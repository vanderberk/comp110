
/**
 * Program draws one rectangle and one filled rectangle
 * 
 * @author BG
 */
public class AppGUIRectangle {
	public static void main(String[] args) { 		
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		StdDraw.filledRectangle(0.5, 0.3, 0.15, 0.25);
		
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.3, 0.6, 0.2, 0.1);
	}
}