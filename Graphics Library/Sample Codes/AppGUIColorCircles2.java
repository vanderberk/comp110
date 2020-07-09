import java.awt.Color;

/**
 * Program draws two filled circles
 * 
 * @author BG
 */
public class AppGUIColorCircles2 {
	public static void main(String[] args) { 		
		
		StdDraw.setPenColor(StdDraw.BLACK); // set color for the 1st circle
		StdDraw.filledCircle(0.6, 0.55, 0.3); // x,y, and radius parameters
		Color myColor = new Color(1.0f, 0.0f, 0.0f);
		StdDraw.setPenColor(myColor); // set color for the 2nd circle
		StdDraw.filledCircle(0.3, 0.4, 0.2); // x,y, and radius parameters
	}
}