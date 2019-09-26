public class Lecture01BouncingBall { 
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

		// main animation loop
		while (true)  { 

			// bounce off wall according to law of elastic collision
			if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
			if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;

			// update position
			rx = rx + vx; 
			ry = ry + vy; 

			// clear the background
			StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);

			// draw ball on the screen
			StdDraw.setPenColor(StdDraw.BLACK);
			
			// how to modify this line for multiple balls???
			StdDraw.filledCircle(rx, ry, radius);
			
			// one possible solution
			// assume that balls are stored in balls array
			// double[][] balls = new double[100][3]
			// for (each ball) // in English
			// for (int i = 0; i < balls[0].length; i++) { // In Java :)
			//    StdDraw.filledCircle(balls[i][0], balls[i][1], balls[i][2]);
			// }
			

			// copy offscreen buffer to onscreen
			StdDraw.show();

			if (StdDraw.isMousePressed())  {
				double x = StdDraw.mouseX();
				double y = StdDraw.mouseY();
				System.out.println("mouse pressed in (" + x + ", " + y + ")");
			}

			// pause for 20 ms
			StdDraw.pause(20);

		} 
	} 
} 