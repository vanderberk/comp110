import java.util.Random;

public class A2 {

	public static void main(String[] args) {

		int circleCount = 100;
		
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		Random rand = new Random();
		Circle[] c = new Circle[circleCount];
		int counter = 0;
		while (counter < circleCount) {
			double x = rand.nextDouble();
			double y = rand.nextDouble();
			double r = rand.nextDouble()/20.0+0.0125;
			if ((x+r<1) &&  (x-r>0) && (y+r<1) && (y-r>0)) {
				c[counter] = new Circle(x,y,r);
				c[counter].draw(0.004, StdDraw.BLACK);
				counter++;
			}
		}
		double maxDist = 0.0;
		int ind1 = 0;
		int ind2 = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				double curDist = c[i].distance(c[j]);
				if (curDist > maxDist) {
					ind1 = i;
					ind2 = j;
					maxDist = curDist;
				}
			}
		}
		// draw final two circles
		c[ind1].draw(0.008, StdDraw.RED);
		c[ind2].draw(0.008, StdDraw.RED);

		// draw longest line
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.004); // 0.002 is the default value.
		StdDraw.line(c[ind1].getX(), c[ind1].getY(),c[ind2].getX(), c[ind2].getY());

		StdDraw.save("output.png"); // save drawing to a file (png/jpg)
	}
}
