
public class ShapesColor {
	
	public static void main(String[] args) {
		
		int duration = 400;
		
		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(800, 800);
		StdDraw.setXscale(0, 1);
		StdDraw.setYscale(0, 1);
		
		// square
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.setPenRadius(0.004); // 0.002 is the default value.
		StdDraw.square(.2, .8, .1);
		StdDraw.pause(duration);
		
		// filled square
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledSquare(.8, .8, .15);
		StdDraw.pause(duration);
		
		// circle
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.002); 
		StdDraw.circle(.8, .2, .15);
		StdDraw.pause(duration);
		
		// filled polygon
		StdDraw.setPenColor(StdDraw.MAGENTA);
		double[] xd = { .1, .2, .3, .2 };
		double[] yd = { .2, .3, .2, .1 };
		StdDraw.filledPolygon(xd, yd);
		StdDraw.pause(duration);
		
		// text
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(.2, .5, "black text");
		StdDraw.pause(duration);
		
		// text
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.text(.8, .8, "white text");
		StdDraw.pause(duration);
		
		//line
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setPenRadius(0.004); // 0.002 is the default value.
		double x1 = 0.4;
		double y1 = 0.2;
		double x2 = 0.5;
		double y2 = 0.3;
		StdDraw.line(x1, y1, x2, y2);
		
		// save drawing to a file
		StdDraw.save("output_figure.png"); // png or jpg
		
	}
}
