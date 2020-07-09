
/**
 * Program draws two filled circles
 * 
 * @author BG
 */
public class AppGUIColorCircles1 {
	public static void main(String[] args) { 		
		
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE); // set color for the 1st circle
		StdDraw.filledCircle(0.6, 0.55, 0.3); // x,y, and radius parameters
		
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE); // set color for the 2nd circle
		StdDraw.filledCircle(0.3, 0.4, 0.2); // x,y, and radius parameters
	}
}