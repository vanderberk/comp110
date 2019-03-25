import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Berk Gokberk
 * @since February 11, 2019
 * 
 * Finds and displays the most frequent number in the input text file
 * 
 */

public class Assignment1 {
	public static void main(String[] args) {

		// loads input numbers into the numbers array from the text file
		int[] numbers = loadNumbers("data1.txt");
		
		// creates frequency array. frequency array stores
		// the frequency of numbers. assume that numbers 
		// are in the range of [0..999]. length of frequency
		// array is 1000.
		int[] frequency = computeFrequency(numbers);	
		
		// finds the maximum frequency value in the frequency array
		int maxFrequency = findMaxFrequency(frequency);
		
		// display most frequent numbers
		for (int i = 0; i < frequency.length; i++)
			if (frequency[i] == maxFrequency)
				System.out.printf("Number: %3d, Frequency: %3d\n", i, frequency[i]);
		
	}

	private static int findMaxFrequency(int[] frequency) {
		int maxValue = 0;
		for (int i = 0; i < frequency.length; i++)
			if (frequency[i] > maxValue)
				maxValue = frequency[i];
		
		return maxValue;
	}

	private static int[] computeFrequency(int[] numbers) {
		int[] frequency = new int[1000];
		for (int i = 0; i < numbers.length; i++)
			frequency[numbers[i]] = frequency[numbers[i]] + 1;
		return frequency;
	}

	private static int[] loadNumbers(String filename) {
		File file = new File(filename);
		Scanner input = null;
		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}

		int[] values = new int[10000];
		int counter = 0;
		while(input.hasNext()) {
			String line = input.nextLine();
			values[counter++] = Integer.parseInt(line.trim());
		} 
		int[] numbers = new int[counter];
		for (int i = 0; i < counter; i++)
			numbers[i] = values[i];
		return numbers;
	}
}
