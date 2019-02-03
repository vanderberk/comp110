import java.util.Arrays;

/**
 * 
 * @author Oguz Baykut
 *
 */
public class UniqueElementsV2 {

	public static void main(String[] args) {
		int[] inputArray = {12,4,4,3,12,4,88,3};
		int[] uniqueElements = findUnique(inputArray);
		System.out.println("Input Array = "+Arrays.toString(inputArray));
		System.out.println("Unique Elements = "+Arrays.toString(uniqueElements));

	}
	public static int[] findUnique(int[] inputArray) {
		int count = 0;
		for(int i=0;i<inputArray.length;i++) {
			int element=inputArray[i];
			boolean check = true;
			for(int j=i+1;j<inputArray.length;j++) {
				if(inputArray[j]==element) {
					check=false;
					break;
				}

			}
			if(check)
				count++;
		}
		int[] uniqueElements = new int[count];
		int x=0;
		while(x<uniqueElements.length) {
			for(int i=0;i<inputArray.length;i++){

				boolean check = true;
				for(int j=i+1;j<inputArray.length;j++) {
					if((inputArray[j]==inputArray[i])) {
						check = false;
						break;
					}	
				}
				if (check) {
					uniqueElements[x]=inputArray[i];
					x++;
				}
			}

		}
		return uniqueElements;

	}

}
