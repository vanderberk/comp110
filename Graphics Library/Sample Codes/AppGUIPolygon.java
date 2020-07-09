/**
 * Program draws polygons
 * 
 * @author BG
 *
 */
public class AppGUIPolygon {
	public static void main(String[] args) {
		
		double[] x = {0.1, 0.2, 0.6, 0.8};
		double[] y = {0.2, 0.6, 0.5, 0.3};
		StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
		StdDraw.filledPolygon(x, y);
		
		double[] xx = {0.6, 0.3, 0.7, 0.9};
		double[] yy = {0.6, 0.9, 0.85, 0.7};
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.polygon(xx, yy);
	}
}
