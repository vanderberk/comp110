import java.util.Arrays;

public class Lecture2_foreachloop {
	
	public static void main(String[] args) {
		
		
		int[] numbers = new int[20];
		
		numbers[0]= 99;
		numbers[1]= 88;
		numbers[2]= 77;
		numbers[3]= 99;
		numbers[8]= 1;
		numbers[13]= 3;
		numbers[19]= 6789;
		
		System.out.println(Arrays.toString(numbers));

		// standard for loop
		//for (int i = 0; i < numbers.length; i++) {
		//	numbers[i] = numbers[i] * 2;
		//	System.out.println(numbers[i]);
		//}
		
		// for-each loop
		// enhanced for loop
		for (int currentValue : numbers) {
			currentValue = currentValue * 2; // you cannot modify array contents with for-each loop
			System.out.println(currentValue);
		}
		// array contents after for-each loop
		System.out.println(Arrays.toString(numbers));
		
		
		
		System.out.println();
		String[] names = new String[8];
		names[0] = "Berk";
		names[1] = "John";
		names[2] = "Mary";
		for (String name : names) 
			if (name != null)
				System.out.println(name);
		
		System.out.println();
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		System.out.println();
		for (int i = 0; i < names.length; i++) 
			if (names[i] != null)
				System.out.println(names[i]);
		
		
		
			
		
		
		
		
		
		
	}

}
