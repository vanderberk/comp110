import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class AppBookText {
	public static void main(String[] args) {

		//int[] bookSizes = {2,3,4,1,2,12,1,5,8,6,5,2,5,1,8,5,2,2,6};
		int[] bookSizes = {3, 4, 4, 10, 4, 10, 2, 10, 5, 9, 1, 3, 1, 8, 4, 10, 2, 9, 10, 3};

		ArrayList<Book> books = new ArrayList<>();
		for (int i = 0; i < bookSizes.length; i++) 
			books.add(new Book(generateRandomWord(),bookSizes[i]));
		
		printBooks(books);
		//Collections.sort(books);
		ArrayList<Box> boxes = firstFit(books);		
		printBoxes(boxes);

	}

	private static void printBoxes(ArrayList<Box> boxes) {
		for (Box box : boxes)
			box.displayBox();
		System.out.printf("\n%d boxes are used to store books.\n\n", boxes.size());
	}

	private static ArrayList<Box> firstFit(ArrayList<Book> books) {
		ArrayList<Box> boxes = new ArrayList<>();
		boxes.add(new Box(20));
		int currentBoxId = 0;
		for (int i = 0; i < books.size(); i++) {
			int currentBookSize = books.get(i).getSize();
			if (boxes.get(currentBoxId).getFreeSpace() >= currentBookSize) {
				// add to the current box
				boxes.get(currentBoxId).push(books.get(i));
			}
			else {
				// open a new box and push the book. update the currentBoxId
				boxes.add(new Box(20));
				currentBoxId  += 1;
				boxes.get(currentBoxId).push(books.get(i));
			}
		}
		return boxes;
	}

	private static void printBooks(ArrayList<Book> books) {
		System.out.println("My book collection: ");
		int totalSize = 0;
		int totalBookCount = 0;
		for (Book book : books) {
			System.out.println(book);
			totalSize += book.getSize();
			totalBookCount += 1;
		}
		System.out.printf("Total number of books: %d, total book size: %d\n", totalBookCount, totalSize);
		System.out.println();
		System.out.println();
	}

	private static String generateRandomWord() {
		Random r = new Random();
		int wordLength = 3;
		StringBuilder s = new StringBuilder();
		for (int j = 0; j < wordLength; j++) 
			s.append((char)('A'+r.nextInt(26)));
		return s.toString();

	}
}
