import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {

		int[] list = new int[100];
		
		Scanner input = new Scanner(System.in);   
		System.out.print("Enter integers (input ends with 0): ");
		int value;
		int counter = 0;
		do {
			value = input.nextInt(); 
			if (value != 0)
				list[counter++] = value;
		} while (value != 0);
		int[] list2 = new int[counter];
		System.arraycopy(list, 0, list2, 0, counter);
		double average = findAverage(list2);
		
		System.out.println("Numbers are: " + Arrays.toString(list2));
		System.out.printf("Average: %.2f\n", average);
		
		printBigNumbers(list2, average);
		input.close();
	}

	private static void printBigNumbers(int[] list2, double average) {
		
		System.out.print("Big numbers are: [ ");
		for (int i = 0; i < list2.length; i++) 
			if (list2[i] > average)
				System.out.print(list2[i] + " ");
		System.out.println(" ]");
		
	}

	private static double findAverage(int[] list2) {
		double sum = 0.0;
		for (int i = 0; i < list2.length; i++)
			sum += list2[i];
		return sum/list2.length;	
	}
	
}
