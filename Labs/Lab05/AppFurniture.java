import java.util.ArrayList;
import java.util.Scanner;

public class AppFurniture {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String userInput;
		
		ArrayList<Furniture> furnitureList = new ArrayList<>();

		boolean flagContinue = true;
		while (flagContinue) {
			System.out.println();
			System.out.println("Press a to add furniture");
			System.out.println("Press s to show all furnitures");
			System.out.println("Press q quit program");
			System.out.print("> ");
			userInput = input.nextLine();

			if (userInput.equals("q"))
			{
				System.out.println("Exiting program...");
				flagContinue = false;
			}
			else {

				if (userInput.equals("a")) {
					Furniture f = new Furniture();
					System.out.print("Enter furniture name: ");
					userInput = input.nextLine();
					f.setFurnitureName(userInput);

					System.out.print("Enter furniture price: ");
					int price = input.nextInt();
					f.setPrice(price);
					input.nextLine();

					System.out.print("Enter designer's name: ");
					userInput = input.nextLine();
					f.setDesigner(new Person(userInput));

					furnitureList.add(f);
					System.out.println("Furniture added: " + f);
				}
				else {
					System.out.println("List of furnitures:");
					for (Furniture x : furnitureList)
						System.out.println(x);
					
				}

			}
		}
		input.close();
	}
}
