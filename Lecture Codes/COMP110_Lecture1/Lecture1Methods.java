/**
 * 
 * Program displays a message N times
 * 
 * @author Berk Gokberk, ID=9999999
 * @since 6.7.2020
 * 
 */
public class Lecture1Methods {
	public static void main(String[] args) {

		int number = 10; // number of messages
		String str = "Berk"; // message to be printed

		printMessage(str, number);
	} // main

	/**
	 * Prints the input string number times
	 * @param str Input message string
	 * @param number How many times the message will be printed
	 */
	private static void printMessage(String str, int number) {

		// displays the message N times
		for (int i = 0; i < number; i++) {
			//System.out.println((i+1) + " Berk");
			System.out.printf("%4d. %s\n", (i+1), str);
		} // for
	}
} // Lecture1
