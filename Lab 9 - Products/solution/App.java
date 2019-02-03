import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		String filename = "products.txt";
		//String filename = "products.txt";
		
		File file = new File(filename);
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}

		ArrayList<Product> products = new ArrayList<>();
		while(input.hasNext()) {
			String line = input.nextLine();
			String[] parts = line.split(";");
			if (parts[0].equals("BOOK")) {
				String bookName = parts[1];
				double price = Integer.parseInt(parts[2]);
				String author = parts[3];
				int pageCount = Integer.parseInt(parts[4]);
				Book temp = new Book(author, pageCount);
				temp.name = bookName;
				temp.price = price;
				products.add(temp);
			}
			else {
				String cdName = parts[1];
				double price = Integer.parseInt(parts[2]);
				int year = Integer.parseInt(parts[3]);
				String artist = parts[4];
				CD temp = new CD(artist, year);
				temp.name = cdName;
				temp.price = price;
				products.add(temp);
			}
		}
		
		System.out.println("Initial prices:");
		for (Product p : products)
			System.out.println(p);
		
		increaseAllPrices(products);
		
		System.out.println("\nAfter price increase:");
		for (Product p : products)
			System.out.println(p);
		
	}

	private static void increaseAllPrices(ArrayList<Product> products) {
		for (int i = 0; i < products.size(); i++) 
			products.get(i).increasePrice();
	}
	
	""
	
}
