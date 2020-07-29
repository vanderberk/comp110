/**
 * 
 * Client code for our house drawing app
 * 
 * @author berk
 *
 */
public class Lecture5a {

	public static void main(String[] args) {

		// prepare drawing canvas/window
		int canvas_width = 600; // specify canvas width 
		int canvas_height = 600; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]
		StdDraw.setYscale(0, 1); // y axis scale is in the range [0,1]

		// create house
		House house1 = new House(0.5, 0.5, 0.05, 0.07);
		house1.name = "Red House";
		// house1.area = 33.3; // area is private. cannot be accessed from outer code/client code

		House house2 = new House(0.7, 0.3, 0.05, 0.05);
		house2.name = "Blue House";
		// how to add kitchen, bath, living room to house2?
		house2.rooms[0] = "Kitchen";
		house2.rooms[1] = "Bathroom";
		house2.rooms[2] = "Living Room";

		House house3 = new House(0.1, 0.9, 0.03, 0.03, "Green House");
		house3.rooms[0] = "Living Room";
		house3.rooms[1] = "Bedroom";
		
		House house4 = new House();
		
		// modify house
		increaseSize(house3);
		

		// print house information using toString method
		System.out.println(house1);
		System.out.println(house2);
		System.out.println(house3);
		System.out.println(house4);

		// plot houses
		house1.plotHouse();
		house2.plotHouse();
		house3.plotHouse();
		house4.plotHouse();

		// old version to plot houses
		//		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		//		StdDraw.filledRectangle(house1.center_x, house1.center_y, house1.w, house1.h);
		//		
		//		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		//		StdDraw.filledRectangle(house2.center_x, house2.center_y, house2.w, house2.h);
		//
		//		StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
		//		StdDraw.filledRectangle(house3.center_x, house3.center_y, house3.w, house3.h);

	}

	/** 
	 * Makes the house larger
	 * 
	 * @param inputHouse Input house object
	 */
	public static void increaseSize(House inputHouse) {
		inputHouse.w = inputHouse.w * 2;
		inputHouse.h = inputHouse.h * 2;
	}


}
