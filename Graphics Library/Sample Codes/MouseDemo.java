import java.awt.Color;
import java.util.Random;

public class MouseDemo { 
	public static void main(String[] args) {

		StdDraw.clear(StdDraw.WHITE);
		StdDraw.setCanvasSize(600, 600);
		StdDraw.setXscale(0.0, 1.0);
		StdDraw.setYscale(0.0, 1.0);
		StdDraw.enableDoubleBuffering();
		Random r = new Random();
		double x = 0.0;
		double y = 0.0;
		
		while (true)  { 
			if (StdDraw.isMousePressed())  {
				x = StdDraw.mouseX();
				y = StdDraw.mouseY();
				System.out.printf("Mouse pressed: x=%.3f, y=%.3f\n",x,y);
				StdDraw.setPenColor(new Color(r.nextFloat(),r.nextFloat(),r.nextFloat())); 
				StdDraw.filledCircle(x, y, 0.02);
				StdDraw.pause(200);
			}
			StdDraw.show();
		} 
	} 
} 