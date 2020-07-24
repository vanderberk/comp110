import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabCode {
	
	public static void main(String[] args) throws FileNotFoundException   {
		
		String filename = "input.txt";
		
		File fileInput = new File(filename);
		
		if (!fileInput.exists()) {
			System.out.println("File is not found.");
			System.exit(1);
		}
		
		Scanner input = new Scanner(fileInput);
		
		while (input.hasNext()) {
			String str = input.next(); // to read a string/word
			int grade1 = input.nextInt(); // to read an integer
			int grade2 = input.nextInt();
			//double value = input.nextDouble(); // to read a double value 3.26
			
			System.out.printf("Name: %s, Grade1: %d, Grade2: %d\n", str, grade1, grade2);
		}
		
	}

}
