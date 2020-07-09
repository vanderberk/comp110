/**
 * 
 * (Javadoc style comment example)
 * Program displays student info
 * 
 * @author BG
 * @since 6.7.2020
 *
 */
public class Lecture1Arrays {
	public static void main(String[] args) {

		String[] names = new String[20]; // stores the names of students
		names[0] = "Berk";
		names[1] = "John";
		names[2] = "Mary";
		names[3] = "Robert";
		names[4] = "Bill";

		int[] grades = new int[20];
		grades[0] = 30;
		grades[1] = 40;
		grades[2] = 70;
		grades[3] = 90;
		grades[4] = 10;

		printStudentInfo(names, grades);

		// finds the maximum grade
		int maxGrade = findMaxGrade(grades);
		System.out.println("\nMaximum grades is: " + maxGrade);

	} // main


	/**
	 * Find the maximum value in the input array
	 * 
	 * @param inputGrades Student grades array
	 * @return Maximum value in the array
	 */
	private static int findMaxGrade(int[] inputGrades) {
		// how to find the maximum grade???
		int result = 0; // how to determine the result? (max value)?

		// Updates the result variable if the current grade is greater
		// than the previos result value
		for (int i = 0; i < inputGrades.length; i++) {
			if (inputGrades[i] > result)
				result = inputGrades[i];
		}
		return result;
	}

	/**
	 * Prints student info
	 * 
	 * @param names names of the students
	 * @param grades grades of the students
	 */
	private static void printStudentInfo(String[] names, int[] grades) {

		// prints the names of students
		for (int i = 0; i < names.length; i++) {
			if (names[i] != null ) {
				//System.out.println( (i+1) + ". " + names[i]);
				//System.out.println( (i+1) + ". " + names[i] + ", " + grades[i]);
				System.out.printf("%2d. %7s, %3d\n", (i+1), names[i], grades[i]);
			} // if
		} // for


	}
} // Lecture1Arrays
