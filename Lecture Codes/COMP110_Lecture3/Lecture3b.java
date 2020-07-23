import java.util.Arrays;

public class Lecture3b {

	public static void main(String[] args) {

		//		int a = 8;
		//		System.out.println(a);
		//		modify_value(a);
		//		System.out.println(a);

		//		int b = 3;
		//		System.out.println(b);
		//		modify_value2(b);
		//		System.out.println(b);

		//		int c = 1;
		//		System.out.println(c);
		//		c = modify_value3(c);
		//		System.out.println(c);
		
		
		int[] grades = {40, 60, 90};
		System.out.println(Arrays.toString(grades));
		modify_grades(grades);
		System.out.println(Arrays.toString(grades));

	}
	
	public static void modify_grades(int[] input_grades) {
		input_grades[0] = 80;
	}
	

	public static void modify_value(int a) {
		a = 12; // local variable defined in method. visible in method.
	}

	public static void modify_value2(int input) {
		input = 12; // local variable defined in method. visible in method.
		// b = 6;
		int b = 5;
	}

	public static int modify_value3(int input_value) {
		input_value = input_value + 1;
		return input_value;
	}



}
