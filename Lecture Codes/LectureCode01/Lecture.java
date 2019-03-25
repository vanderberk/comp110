import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/**
 * Sample code for COMP 110 Lecture 2
 * 
 * @author Berk Gokberk
 * @since Feb 11, 2016
 */

public class Lecture02 {
	
	/**
	 * Explanation for the main program
	 * 
	 * @param args Not used right now
	 */
	public static void main(String[] args) {

		String filename = "info.txt";

		// opens the text file
		File myFile = new File(filename);
		Scanner myInput = null;
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}
		System.out.println("File is available");

		String[] names = new String[50];

		int c = 1;
		while(myInput.hasNext()) {
			String line = myInput.nextLine();
			String[] parts = line.split(" ");

			names[c-1] = parts[0];
			//System.out.printf("%2d. %s\n", c, line);
			//System.out.println(Arrays.toString(parts));
			//System.out.println();
			c++;
		}
		//System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i++) 
			if (names[i] != null)
				System.out.printf("%s, ", names[i]);

		System.out.println();

		// Convert all names to uppercase using a method
		// Solution 1
		makeUpper(names);
		
		// Solution 2: Do not change the original array
		String[] newNames = makeUpperVersion2(names);

		// Use for-each loop (if you do not modify the array elements)
		for (String s : names)
			if (s != null)
				System.out.printf("%s, ", s);
		System.out.println();
		System.out.println(Arrays.toString(newNames));
	}

	/**
	 * Explanation of the method goes here
	 * @param inputA Meaning of inputA array
	 * @return Uppercase versions of the names
	 */
	public static String[] makeUpperVersion2(String[] inputA) {
		String[] d = new String[inputA.length];
		for (int i = 0; i < d.length; i++) 
			if (inputA[i] != null)
				d[i] = inputA[i].toUpperCase();
		
		return d;
	}

	/**
	 * Example of a Javadoc style comments
	 * Converts all strings to uppercase.
	 * @param inputArray Input array storing names
	 */
	public static void makeUpper(String[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] != null) {
				inputArray[i] = inputArray[i].toUpperCase();
			}
		}
	}
}
