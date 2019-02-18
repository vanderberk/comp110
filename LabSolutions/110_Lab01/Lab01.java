import java.util.Arrays;

/**
 * @author Berk Gokberk
 * @since 24-10-2018
 */
public class Lab01 {
	public static void main(String[] args) {

		// Test Case 1
		int[] inputArray = { 12, 4, 4, 3, 12, 4, 8, 3 };

		// Test Case 2
		//int[] inputArray = { 4, 4, 4 };

		// Test Case 3
		//int[] inputArray = { 8 };

		// Test Case 4
		//int[] inputArray = { 2, 4, 6, 8, 10 };

		System.out.println("Step 1 Finding Bigger Elements");
		int[] bigArray = findBigElements(inputArray);
		System.out.println("Input Array: " + Arrays.toString(inputArray));
		System.out.println("Bigger Array: " + Arrays.toString(bigArray));

		System.out.println("\nStep 2 Finding Unique Elements");
		int[] uniqueArray = findUnique(inputArray);
		System.out.println("Input Array: " + Arrays.toString(inputArray));
		System.out.println("Unique Array: " + Arrays.toString(uniqueArray));
	}

	/**
	 * Finds and returns an array bigger elements in the input array
	 * Big elements are the ones that are larger than the average value
	 * of the input array.
	 * @param inputArray
	 * @return Output array contains bigger elements
	 */
	private static int[] findBigElements(int[] inputArray) {

		// Find the average of the inputArrray contents
		int sum = 0;
		for (int i = 0; i < inputArray.length; i++)
			sum = sum + inputArray[i];
		double averageValue = (double)sum/inputArray.length;
		System.out.printf("Array Average : %.2f\n", averageValue);

		// Find the number of elements bigger than the average
		int counter = 0;
		for (int i = 0; i < inputArray.length; i++)
			if (inputArray[i] > averageValue)
				counter++;

		// Create the output array
		int[] outputArray = null;
		if (counter > 1)
			outputArray = new int[counter];

		// Copy bigger elements into the output array
		int index = 0;
		for (int i = 0; i < inputArray.length; i++)
			if (inputArray[i] > averageValue)
				outputArray[index++] = inputArray[i];

		// return output array
		return outputArray;
	}

	/**
	 * Returns unique integers found in the input array
	 * @param inputArray: Input integer array
	 * @return Output array contains unique integers in the input array
	 */
	private static int[] findUnique(int[] inputArray) {

		// tempArray stores the unique elements. Its size is the 
		// same as the input array
		int[] tempArray = new int[inputArray.length];
		int counter = 0;
		boolean flagFound;
		for (int i = 0; i < inputArray.length; i++) {
			flagFound = false;
			for (int j = 0; j < counter; j++)
				if (inputArray[i] == tempArray[j]) {
					flagFound = true;
					break;
				}
			if (flagFound == false)
				tempArray[counter++] = inputArray[i];
		}

		// create output array which is trimmed version of the tempArray
		int[] outputArray = new int[counter];
		for (int i = 0; i < counter; i++)
			outputArray[i] = tempArray[i];

		return outputArray;
	}
}
