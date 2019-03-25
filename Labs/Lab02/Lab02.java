import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * COMP110 Lab 2 Solution
 * @author Berk Gokberk
 *
 */
public class Lab02 {
	public static void main(String[] args) {
		
		String filename = "data.txt";

		File myFile = new File(filename);
		Scanner myInput = null;
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}
		
		String[] names = new String[100];
		String[] fathers = new String[100];
		int[] ages = new int[100];

		System.out.println("Family Database: ");
		int counter = 0;
		while(myInput.hasNext()) {
			String line = myInput.nextLine();
			String[] parts = line.split(" ");
			System.out.println(Arrays.toString(parts));
			
			names[counter] = parts[0];
			fathers[counter] = parts[2];
			ages[counter] = Integer.parseInt(parts[4].trim());
			
			counter++;
		}
		int arraySize = counter;
		
		Scanner userInput = new Scanner(System.in);  
		System.out.print("\nEnter father's name: ");
		String fatherName = userInput.nextLine();
		
		System.out.printf("Searching %s's children... \n", fatherName);
		
		int childrenCounter = 0;
		int minAge = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < arraySize; i++) {
			if (fathers[i].equals(fatherName)) {
				childrenCounter++;
				System.out.printf("%s's children [%2d] : %10s [Age:%2d]\n", fatherName, childrenCounter, names[i], ages[i]);
				
				if (ages[i] < minAge) {
					minAge = ages[i];
					minIndex = i;
				}
				
			}
		}
		if (childrenCounter == 0) 
			System.out.printf("%s is not in the family database.\n", fatherName);
		
		if (childrenCounter > 0)
			System.out.printf("\n%s's youngest children is: %s [Age:%2d]\n", fatherName, names[minIndex], ages[minIndex]);
		
		
	}
}
