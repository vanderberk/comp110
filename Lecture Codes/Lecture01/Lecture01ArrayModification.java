import java.util.Arrays;

public class Lecture01ArrayModification {

	public static void main(String[] args) {

		System.out.println("Testing Array Modification Case:");
		int[] circleRadius = new int[5];

		circleRadius[0] = 99;
		circleRadius[1] = 8;
		circleRadius[2] = 33;

		// shorter version
		System.out.println(Arrays.toString(circleRadius));
		
		// longer version
		//		for (int i = 0; i < circleRadius.length; i++)
		//			System.out.println(circleRadius[i]);

		changeValues(circleRadius);
		System.out.println(Arrays.toString(circleRadius));
		
		
		// test integer case
		System.out.println("\nTesting Integer Case:");
		int b = 8;
		System.out.println(b);
		changeInteger(b);
		System.out.println(b);
	}

	public static void changeValues(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++)
			inputArray[i] = inputArray[i] * 2;
	}
	
	public static void changeInteger(int inputInteger) {
		inputInteger = inputInteger * 2;
	}

}
