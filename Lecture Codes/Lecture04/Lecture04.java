import java.util.Random;

public class Lecture04 { 
	public static void main(String[] args) { 
		// world as a checkerboard.
		// n is the size of the world
		// world is a square grid
		int worldSize = 20;
		int timeCounter = 100;
		
		// initialize graphics 
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(0, worldSize);
		StdDraw.setYscale(0, worldSize);
		
		// draws the world
		drawWorld(worldSize);
		
		Cat[] cats = new Cat[1000];
		cats[0] = new Cat(10,10,StdDraw.BLACK);
		cats[1] = new Cat(8,3,StdDraw.BLUE);
		cats[2] = new Cat(0,0,StdDraw.ORANGE);
		cats[3] = new Cat(19,19,StdDraw.MAGENTA);
		
		Random r = new Random();
		for (int k = 0; k < timeCounter; k++) {
			for (int i = 0; i <cats.length; i++) {
				// if there is a cat, then draw
				if (cats[i] != null) {
					int direction = r.nextInt(4);
					
					// check the world boundaries before moving the cat
					if ((direction == 0) && (cats[i].getY() > 0))
						cats[i].move(direction);
					if ((direction == 1) && (cats[i].getX() > 0))
						cats[i].move(direction);
					if ((direction == 2) && (cats[i].getY() < worldSize))
						cats[i].move(direction);
					if ((direction == 3) && (cats[i].getX() < worldSize))
						cats[i].move(direction);
					
					cats[i].draw();
					StdDraw.pause(10);
				}
			}
		}
	}
	
	/**
	 * Draws checker board pattern as the world
	 * 
	 * @param n size of the square world
	 */
	public static void drawWorld(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 != 0) 
					StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				else                  
					StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
			}
		}
		StdDraw.show();
		
		
	}
}