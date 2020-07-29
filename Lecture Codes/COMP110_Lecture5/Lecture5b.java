
public class Lecture5b {
	
	public static void main(String[] args) {
		
		// prepare drawing canvas/window
		int canvas_width = 600; // specify canvas width 
		int canvas_height = 600; // specify canvas height 
		StdDraw.setCanvasSize(canvas_width, canvas_height);
		StdDraw.setXscale(0, 1); // x axis scale is in the range [0,1]

		
		int[] x = new int[100];
		String[] y = new String[100];
		
		// array of house objects
		House[] houses = new House[100];
		
		// create houses in the house array
		houses[0] = new House(0.1, 0.1, 0.02, 0.02, "A");
		houses[1] = new House(0.2, 0.2, 0.05, 0.05, "B");
		houses[2] = new House(0.3, 0.3, 0.02, 0.02, "C");
		houses[3] = new House(0.4, 0.4, 0.02, 0.02, "D");
		houses[4] = new House(0.5, 0.5, 0.04, 0.04, "E");
		houses[5] = new House(0.6, 0.6, 0.02, 0.02, "F");
		houses[6] = new House(0.7, 0.7, 0.02, 0.02, "G");
		houses[7] = new House(0.8, 0.8, 0.02, 0.02, "H");
		houses[8] = new House(0.9, 0.9, 0.03, 0.03, "I");
		
		houses[8].name = "II";
		houses[1].name = "BB";
		houses[4].name = "EE";
		
		for (House currentHouse: houses)
			if (currentHouse != null)
				currentHouse.plotHouse();
		
		
	}

}
