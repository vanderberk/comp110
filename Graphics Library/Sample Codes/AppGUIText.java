import java.awt.Font;

/**
 * Program displays text 
 * 
 * @author BG
 *
 */
public class AppGUIText {
	public static void main(String[] args) {
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setFont( new Font("Serif", Font.PLAIN, 32) );
		StdDraw.textLeft(0.25, 0.4, "Font Type: Serif, Size: 32");
	
		StdDraw.setPenColor(StdDraw.BOOK_BLUE);
		StdDraw.setFont( new Font("Helvetica", Font.BOLD, 28) );
		StdDraw.textLeft(0.05, 0.7, "Font: Helvetica, Size: 28, Bold");
	}
}
