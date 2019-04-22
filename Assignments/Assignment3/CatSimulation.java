import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CatSimulation {
	public static void main(String[] args) {

		Random r = new Random();
		int eatenFoodCounter = 0;
		
		int simulationTime = 100000;
		
		String filename = "world.txt";

		File myFile = new File(filename);
		Scanner myInput = null;
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}

		String firstLine = myInput.nextLine();
		String[] temp = firstLine.split(" ");
		int rows = Integer.parseInt(temp[0].trim());
		int cols = Integer.parseInt(temp[1].trim());
		System.out.printf("rows: %d, cols: %d\n", rows, cols);

		int[][] world = new int[rows][cols];

		int counter = 0;
		while(myInput.hasNext()) {
			String line = myInput.nextLine();
			String[] parts = line.split(";");
			if (parts.length != cols) {
				System.out.printf("Column size in the world data should be %d. Exiting...\n", cols);
				System.exit(1);
			}
			for (int i = 0; i < cols; i++) {
				world[rows-counter-1][i] = Integer.parseInt(parts[i].trim());
			}
			counter++;
		}
		/// plot world
		StdDraw.enableDoubleBuffering();
		StdDraw.setCanvasSize(800, 800);
		StdDraw.setXscale(0, cols);
		StdDraw.setYscale(0, rows);
		drawWorld(rows, cols, world);
		
		Cat c = new Cat(10,10,StdDraw.BLACK);
		boolean allFoodsEaten = false;
		for (int i = 0; i < simulationTime; i++) {
			
			
			// move the cat
			boolean food = false;
			int mx = 0;
			int my = 0;
			int xcat = c.getX();
			int ycat = c.getY();
			for (int xd=-1; xd<=1; xd++)
				for (int yd=-1; yd<=1; yd++) {
					if ((xd!=0) && (yd!=0) && (food==false)) {
						int nx = c.getX()+xd;
						int ny = c.getY()+yd;
						
						if ((nx>=0) && (nx<cols) && (ny>=0) && (ny<rows)) {

							if (world[ny][nx] == 3) {
								food = true;
								mx = nx;
								my = ny;
								break;
							}
						}

					}
				}
			if (food == true) {
				c.setX(mx);
				c.setY(my);
				world[my][mx] = 0;
				eatenFoodCounter++;
				System.out.printf("Food eaten: %d\n", eatenFoodCounter);
				
				if (eatenFoodCounter >= 20) {
					allFoodsEaten = true;
				}
				
			} else {
				// there is no food in the boundary
				ArrayList<Integer> pmoves = new ArrayList<>();
				
				if ((c.getY() > 0) && (world[c.getY()-1][c.getX()]==0))
					pmoves.add(0);
				
				if ((c.getX() > 0) && (world[c.getY()][c.getX()-1]==0))
					pmoves.add(1);
				
				if ((c.getY() <= rows) && (world[c.getY()+1][c.getX()]==0))
					pmoves.add(2);
				
				if ((c.getX() <= cols) && (world[c.getY()][c.getX()+1]==0))
					pmoves.add(3);
				
				if (pmoves.size()>0){
					int moveDir = pmoves.get(r.nextInt(pmoves.size()));
					c.move(moveDir);
				}
			} // else

			//StdDraw.clear();
			//drawWorld(rows, cols, world);
			c.draw();
			StdDraw.show();
			StdDraw.pause(1);
			if (i%1000==0)
				System.out.println(i);
			
			if (allFoodsEaten == true)
				break;
		}
		System.out.println("Program finished.");
	}

	private static void drawWorld(int rows, int cols, int[][] world) {
		for (int x = 0; x < cols; x++) {
			for (int y = 0; y < rows; y++) {
				if (world[y][x] == 2) 
					StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
				else if (world[y][x] == 1)
					StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
				else if (world[y][x] == 3)
					StdDraw.setPenColor(StdDraw.MAGENTA);
				else
					StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(x + 0.5, y + 0.5, 0.5);
				
				StdDraw.setPenColor(StdDraw.DARK_GRAY);
				StdDraw.square(x + 0.5, y + 0.5, 0.5);
			}
		}
	}
}
