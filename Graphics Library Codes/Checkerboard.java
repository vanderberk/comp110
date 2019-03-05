
public class Checkerboard { 
	public static void main(String[] args) { 
		int n = 10;
		
		// initialize graphics 
		StdDraw.enableDoubleBuffering();
		StdDraw.setXscale(0, n);
		StdDraw.setYscale(0, n);
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((i + j) % 2 != 0) 
					StdDraw.setPenColor(StdDraw.BLACK);
				else                  
					StdDraw.setPenColor(StdDraw.WHITE);
				StdDraw.filledSquare(i + 0.5, j + 0.5, 0.5);
			}
		}
		StdDraw.show();
	}
}