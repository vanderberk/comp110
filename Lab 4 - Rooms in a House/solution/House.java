
public class House {
	public int numberOfRooms;
	public Room[] rooms;
	// comment
	// comment
	
	
	House(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
		rooms = new Room[numberOfRooms];
	}
	
	private int calculateArea() {
		int sum = 0;
		for (int i = 0; i < numberOfRooms; i++)
			sum = sum + rooms[i].getHeight()*rooms[i].getWidth();
		return sum;
	}
	
	public void printHouse() {
		System.out.println("\nHouse Information");
		for (int i = 0; i < numberOfRooms; i++)
			System.out.println(rooms[i]);
		System.out.println("House Total Area: " + calculateArea());
	}
}
