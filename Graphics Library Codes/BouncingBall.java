/******************************************************************************
 *  Compilation:  javac BouncingBall.java
 *  Execution:    java BouncingBall
 *  Dependencies: StdDraw.java
 *
 *  Implementation of a 2-d bouncing ball in the box from (-1, -1) to (1, 1).
 *
 *  % java BouncingBall
 *
 ******************************************************************************/

public class BouncingBall { 
	public static void main(String[] args) {

		// set the scale of the coordinate system
		StdDraw.setCanvasSize(500, 500);
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);
		StdDraw.enableDoubleBuffering();

		// initial values
		double rx = 0.480, ry = 0.860;     // position
		double vx = 0.015, vy = 0.017;     // velocity
		double radius = 0.05;              // radius

		boolean ismp; 
		
		// main animation loop
		while (true)  { 

			// bounce off wall according to law of elastic collision
			if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
			if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

			// update position
			rx = rx + vx; 
			ry = ry + vy; 

			// clear the background
			StdDraw.clear(StdDraw.WHITE);

			// draw ball on the screen
			StdDraw.setPenColor(StdDraw.BLACK); 
			StdDraw.filledCircle(rx, ry, radius); 

			// copy offscreen buffer to onscreen
			StdDraw.show();
			
			if (StdDraw.isMousePressed()) 
			{
				
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
				System.out.println("mouse pressed in (" + x + ", " + y + ")");
				
				
			}

			// pause for 20 ms
			StdDraw.pause(50);

		} 
	} 
} 