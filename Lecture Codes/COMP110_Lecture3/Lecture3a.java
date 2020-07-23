import java.util.Arrays;

public class Lecture3a {
	
	public static void main(String[] args) {
		
		// Method example 1
		String str = "COMP 110";
		int count = 5;
		// printMessage(str, count);
		
		// Method example 2
		int[] grades = {40,50,90,20,10,0};
		double average_grade = computeAverage(grades);
		System.out.println("Average is: " + average_grade);
		
		// Method example 3
		int[] midtermExams = findMidtermExams(grades);
		System.out.println("All grades     : " + Arrays.toString(grades));
		System.out.println("Midterm grades : " + Arrays.toString(midtermExams));
		
	}
	
	/**
	 * Finds the midterms grades which are the first three grades in the input array
	 * @param grades All grades
	 * @return Midterm exams
	 */
	private static int[] findMidtermExams(int[] grades) {
		int[] midtermExams = new int[3]; // stores the midterm grades
		
		// traverses the grades array and stores the first three grades
		// in the midtermExams array
		for (int i = 0; i < 3; i++) 
			midtermExams[i] = grades[i];
		
		return midtermExams;
	}

	/**
	 * Prints a message N times
	 * @param input_string Message text
	 * @param message_count N number of messages to be displayed
	 */
	public static void printMessage(String input_string, int message_count) {
		
		// prints the message multiple times
		for (int i = 0; i < message_count; i++) 
			System.out.printf("%d. %s\n", (i+1), input_string);

	}
	
	/**
	 * Compute the aveage grade
	 * @param input_grades grades of a student
	 * @return average grade
	 */
	public static double computeAverage(int[] input_grades) {
		double average = 0.0; // stores the average grade
		
		double sum = 0.0; // stores the total grade
		for (int value : input_grades) 
			sum = sum + value;
		
		average = sum / input_grades.length;
		return average;
	}
	
	
	

}
