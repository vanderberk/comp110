import java.awt.Color;
import java.util.Random;

public class Lab04 {
	public static void main(String[] args) {

		int plateCount = 10;
		
		// canvas parameters
		int canvas_width = 600;
		int canvas_height = 600;
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		double rMax = 0.1;
		double rMin = 0.01;
		
		Plate[] plateArray = new Plate[10000];

		Random randomGenerator = new Random();
		int counter = 0;
		while ( counter < plateCount) {
			double x = randomGenerator.nextDouble();
			double y = randomGenerator.nextDouble();
			double r = rMin + (rMax-rMin) * randomGenerator.nextDouble();
			Color c = StdDraw.BOOK_LIGHT_BLUE;
			
			if ((x-r > 0) && (x+r < 1) && (y-r > 0) && (y+r < 1)) {
				Plate p = new Plate(x,y,r,c);
				
				boolean intersect = false;
				for (int i = 0; i<plateArray.length; i++) 
					if (plateArray[i] != null) 
						if (plateArray[i].distance(p) < p.getRadius()+plateArray[i].getRadius()) {
							intersect = true;
							break;
						}
				if ((intersect==false) && (counter < 10000)) {
					plateArray[counter++] = p;
					p.draw();
					StdDraw.pause(1);
				}
			}
		}
		StdDraw.show();
		System.out.println("Program finished.");
		// save drawing to a file
		StdDraw.save("output_figure.png"); // in .png or .jpg format
	}
}
