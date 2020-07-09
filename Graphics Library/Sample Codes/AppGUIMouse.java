/**
 * 
 * Program gets mouse input from user and 
 * displays the clicked coordinates using circles
 * 
 * @author BG
 */

public class AppGUIMouse {

	public static void main(String[] args) {

		int width = 400;
		int height = 400;
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		StdDraw.enableDoubleBuffering();
		
		int pause = 200; // pause duration between mouse clicks
		double x, y;

		while (true) {
			if (StdDraw.isMousePressed()) {
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
				StdDraw.pause(pause);
				System.out.printf("mouse pressed: x= %5.2f, y=%5.2f\n", x, y);
				StdDraw.filledCircle(x, y, 0.01); 
				StdDraw.show();
			} 
		}
	}
}
