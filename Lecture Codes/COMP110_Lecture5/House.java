import java.awt.Font;
import java.util.Arrays;

/**
 * Simple house class
 * 
 * @author BG
 *
 */
public class House {

	// data fields of House class
	public double center_x;
	public double center_y;
	public double w;
	public double h;
	public String name; 
	public String[] rooms;
	private double area = 0.0; // forbid access to area variable from client code

	// constructor
	//	House(double x, double y, double width, double height) {
	//		center_x = x;
	//		center_y = y;
	//		w = width;
	//		h = height;
	//	}

	// constructor 1 
	House(double center_x, double center_y, double w, double h, String name) {

		// this means current object's data field
		this.center_x = center_x;
		this.center_y = center_y;
		this.w = w;
		this.h = h;
		this.name = name;

		area = computeArea(); // area = w * h;
		rooms = new String[5];
	}

	// constructor 2
	House(double center_x, double center_y, double w, double h) {

		// this means current object's data field
		this.center_x = center_x;
		this.center_y = center_y;
		this.w = w;
		this.h = h;

		area = computeArea(); // area = w * h;
		rooms = new String[5];
	}
	
	// constructor 3: no-arg constructor / default constructor
	House() {
		
		// approach 1
		//		this.center_x = 0;
		//		this.center_y = 0;
		//		this.w = 0;
		//		this.h = 0;
		//		this.name = "Empty name";
		//		area = computeArea(); 
		//		rooms = new String[5];
		
		
		// approach 2 (this is recommended)
		// default constructor calls the first constructor using this
		// this(0.0, 0.0, 0.0, 0.0, "Empty name");
		this(0.1, 0.1, 0.02, 0.02, "Empty name");
	}

	/**
	 * plots a house
	 */
	public void plotHouse() {

		// plot house
		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		StdDraw.filledRectangle(center_x, center_y, w, h);

		// draw name and area text on the house
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.setFont( new Font("Serif", Font.PLAIN, 14) );
		//StdDraw.textLeft(center_x, center_y, name + ", Area: " + Double.toString(area));
		StdDraw.textLeft(center_x, center_y, name);

	}

	/**
	 * private method to compute house area
	 * @return House area
	 */
	private double computeArea() {
		return  w * h;
	}


	/**
	 * returns a string to be printed for house information
	 */
	public String toString() {
		return name + ":  x: " + center_x + ", y: " + 
				center_y + ", w: " + w + ", h: " + h + "\nRooms: " + Arrays.toString(rooms) + "\n"; 
	}


}
