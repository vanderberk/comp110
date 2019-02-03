import java.util.Arrays;

/**
 * @author Berk Gokberk
 * @since 24-10-2018
 */
public class UniqueElements {
	public static void main(String[] args) {
		int[] inputArray = {12,4,4,3,12,4,88,3};
		//int[] inputArray = {7,7,7,7,7};
		//int[] inputArray = {};
		//int[] inputArray = {5,8,3,1,7,2,9};
		int[] outputArray = findUnique(inputArray);
		System.out.println(Arrays.toString(inputArray));
		System.out.println(Arrays.toString(outputArray));
	}

	/**
	 * Returns unique integers found in the input array
	 * @param inputArray
	 * @return
	 */
	private static int[] findUnique(int[] inputArray) {
		int[] temp = new int[inputArray.length];
		int counter = 0;
		boolean flagFound;
		for (int i = 0; i < inputArray.length; i++) {
			flagFound = false;
			for (int j = 0; j < counter; j++)
				if (inputArray[i] == temp[j]) {
					flagFound = true;
					break;
				}
			if (flagFound == false) 
				temp[counter++] = inputArray[i];
		}
		int[] outputArray = new int[counter];
		for ( int i = 0; i < counter; i++)
			outputArray[i] = temp[i];
		return outputArray;
	}
}
