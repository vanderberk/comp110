import java.awt.Font;

/**
 * Program displays text 
 * 
 * @author BG
 *
 */
public class AppGUIText {
	public static void main(String[] args) {
		
		int canvas_width = 600; // specify canvas width 
		int canvas_height = 400; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]
		
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setFont( new Font("Serif", Font.PLAIN, 32) );
		StdDraw.textLeft(0.25, 0.4, "Font Type: Serif, Size: 32");
	
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.setFont( new Font("Helvetica", Font.BOLD, 28) );
		StdDraw.textLeft(0.05, 0.7, "Font: Helvetica, Size: 28, Bold");
	}
}
