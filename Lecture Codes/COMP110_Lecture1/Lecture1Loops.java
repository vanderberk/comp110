/**
 * 
 * Program displays a message N times
 * 
 * @author Berk Gokberk, ID=9999999
 * @since 6.7.2020
 * 
 */
public class Lecture1Loops {

	public static void main(String[] args) {

		int number = 100; // number of messages
		String str = "Berk"; // message to be printed

		// displays the message N times
		for (int i = 0; i < number; i++) {
			//System.out.println((i+1) + " Berk");
			System.out.printf("%4d. %s\n", (i+1), str);
		} // for

	} // main

} // Lecture1
