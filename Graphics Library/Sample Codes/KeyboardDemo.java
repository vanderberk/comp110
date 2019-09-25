import java.awt.event.KeyEvent;
import java.util.Random;

public class KeyboardDemo { 
	public static void main(String[] args) {

		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(0.0, 1.0);
		StdDraw.setYscale(0.0, 1.0);
		StdDraw.enableDoubleBuffering();
		double x = 0.5;
		double y = 0.5;
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		StdDraw.setPenRadius(0.02);
		StdDraw.filledCircle(x, y, 0.1);
		
		double stepSize = 0.05;
		int pauseDuration = 100;
		
		while (true)  { 
			
			if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
				System.out.println("left");
				StdDraw.pause(pauseDuration);
				x = x - stepSize;
			} 
			if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
				System.out.println("right");
				StdDraw.pause(pauseDuration);
				x = x + stepSize;
			} 
			if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
				System.out.println("up");
				StdDraw.pause(pauseDuration);
				y = y + stepSize;
			} 
			if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
				System.out.println("down");
				StdDraw.pause(pauseDuration);
				y = y - stepSize;
			}
			StdDraw.clear(StdDraw.WHITE);
			StdDraw.filledCircle(x, y, 0.1);
			StdDraw.show();
		} 
	} 
} 