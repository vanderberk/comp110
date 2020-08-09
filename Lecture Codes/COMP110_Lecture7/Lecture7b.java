import java.util.ArrayList;

public class Lecture7b {

	public static void main(String[] args) {

		// Array lists

		// declaration
		ArrayList<Integer> list;

		// create the list
		list = new ArrayList<Integer>();

		System.out.println(list);

		// adding elements to an array list
		list.add(12);
		list.add(24);
		list.add(3);
		list.add(2);
		
		// printing an array list
		System.out.println(list);
		
		// array list of strings
		System.out.println();
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Istanbul");
		cityNames.add("Izmir");
		cityNames.add("Bursa");
		cityNames.add("Antalya");
		
		System.out.println(cityNames);
		
		// Access an element in an array list
		// e.g., print the second element
		System.out.println("Second city: " + cityNames.get(1));
		
		// Get the size of an array list
		System.out.println("Size of the array list: " + cityNames.size());
		
		// Delete an element using its index
		cityNames.remove(2);
		System.out.println(cityNames);
		System.out.println("Size of the array list: " + cityNames.size());
		
		// Delete an element using content
		cityNames.remove("Antalya");
		System.out.println(cityNames);
		System.out.println("Size of the array list: " + cityNames.size());
		
		// Ankara is not in the array list
		cityNames.remove("Ankara");
		System.out.println(cityNames);
		System.out.println("Size of the array list: " + cityNames.size());

		// Insert Mugla after Istanbul
		cityNames.add(1, "Mugla");
		System.out.println(cityNames);
		System.out.println("Size of the array list: " + cityNames.size());
		
		// Insert Tekirdag at the beginning 
		cityNames.add(0, "Tekirdag");
		System.out.println(cityNames);
		System.out.println("Size of the array list: " + cityNames.size());
		
		// Check if the array list contains a city
		// Check if the array list contains Izmir?
		boolean result = cityNames.contains("Izmir");
		System.out.println("Is Izmir in the list? : " + result);
		System.out.println("Is Samsun in the list? : " + cityNames.contains("Samsun"));
		
		// Find the location Istanbul in the list
		int location = cityNames.indexOf("Istanbul");
		System.out.println("Location of Istanbul in the list? : " + location);
		
		// If you have multiple Istanbuls in the list
		cityNames.add("Istanbul");
		cityNames.add("Adana");
		System.out.println(cityNames);
		System.out.println("Location of Istanbul in the list? (from start) : " + cityNames.indexOf("Istanbul"));
		System.out.println("Location of Istanbul in the list? (from end): " + cityNames.lastIndexOf("Istanbul"));
		System.out.println("Location of Edirne in the list? : " + cityNames.indexOf("Edirne"));
		
		// Check if the array list is empty or not?
		System.out.println(cityNames.isEmpty());
		
		// Print array list contents, at different lines
		System.out.println(cityNames); // prints in the same line
		for (String currentCity : cityNames) 
			System.out.println(currentCity);
		
		// Copy array list into an another array list
		System.out.println("\nCopying array lists");
		ArrayList<String> copyList = new ArrayList<String>(cityNames);
		copyList.add(0,"Canakkale");
		System.out.println(cityNames);
		System.out.println(copyList);
		
		// Clear an array list (delete all elements)
		System.out.println();
		cityNames.clear();
		System.out.println(cityNames);

		// Check if the array list is empty or not?
		System.out.println(cityNames.isEmpty());

		
		// Wrapper Classes
		int x = 4; // primitive type int
		Integer y = 8; // class integer type (wrapper class)
		//System.out.println(x * 2);
		//System.out.println(y * 2);

		double p = 3.14; // primitive type double
		Double q = 4.33; // wrapper class
		//System.out.println(p * 2);
		//System.out.println(q * 2);

		// ArrayList<int> list2; // this is wrong. array lists
		// can only store objects. they can not store primitive types

		// Create an array list to store 3 circles
		ArrayList<Circle> circleList = new ArrayList<Circle>();
		circleList.add( new Circle(0,0,3) );
		circleList.add( new Circle(1,2,4) );
		circleList.add( new Circle(5,2,8) );
		
		System.out.println();
		System.out.println(circleList);
		
		System.out.println();
		for (Circle circle : circleList)  
			System.out.println(circle + ", area: " + circle.getArea());
	}
}
