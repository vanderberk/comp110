import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rooms in the house: ");
		int numberOfRooms = input.nextInt();
		input.nextLine();
		
		House house = new House(numberOfRooms);
		
		int w;
		int h;
		String rt;
		for (int i = 1; i <= numberOfRooms; i++ ) {
			System.out.println("\nEnter room " + i + " information");
			System.out.print("Enter room type (sitting room, bedroom, kitchen, balcony): ");
			rt = input.nextLine();
			System.out.print("Enter room width: ");
			w = input.nextInt();
			System.out.print("Enter room height: ");
			h = input.nextInt();
			input.nextLine();
			Room r = new Room(rt);
			r.setHeight(h);
			r.setWidth(w);
			house.rooms[i-1] = r;
		}
		house.printHouse();
		input.close();
	}
}
