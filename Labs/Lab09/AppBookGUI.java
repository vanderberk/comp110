import java.awt.Font;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class AppBookGUI {
	public static void main(String[] args) {

		//Integer[] bookSizes = {3, 4, 4, 10, 4, 10, 2, 10, 5, 9, 1, 3, 1};
		Integer[] bookSizes = {3, 4, 4, 10, 4, 10, 2, 10, 5, 9, 1, 3, 1, 8, 4, 10, 2, 9, 10, 3};
		
		ArrayList<Book> books = new ArrayList<>();
		for (int i = 0; i < bookSizes.length; i++) 
			books.add(new Book(generateRandomWord(),bookSizes[i]));
		
		printBooks(books);
		//Collections.sort(books);
		ArrayList<Box> boxes = firstFit(books);		
		printBoxes(boxes);
		
		int bookw = 40;
		int bookhScale = 10;
		int yBottom = 30;
		int xMin = 110;
		int xLeft = xMin;
		int xStep = 10;
		
		int width = xLeft + (bookw+xStep)*books.size();
		int height = 600;
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0, width);
		StdDraw.setYscale(0, height);
		
		// plot books
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(60, yBottom+8, "My books");
		for (int i = 0; i < books.size(); i++) {
			double bookh = books.get(i).getSize()*bookhScale;
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledRectangle(xLeft + bookw/2, yBottom + bookh/2.0, bookw/2.0, bookh/2.0);
			StdDraw.text(xLeft + bookw/2, yBottom + bookh + 10, Integer.toString(books.get(i).getSize()));
			StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			StdDraw.text(xLeft + bookw/2, yBottom-15 , Integer.toString(i+1));
			xLeft = xLeft + bookw + xStep;
		}
		
		// plot boxes
		int maxElement = Collections.max(Arrays.asList(bookSizes));
		int yMin = maxElement * bookhScale + 200;
		int yBot = yMin;
		xLeft = xMin;
		int yStep = 1;
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.text(60, yMin+8, "Boxes");
		
		for (int i = 0; i < boxes.size(); i++) {
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.setFont(new Font("Helvetica", Font.PLAIN, 14));
			StdDraw.text(xLeft+bookw/2.0, yMin-15, Integer.toString(i+1) + " [" + Integer.toString(boxes.get(i).getSize()) + "]");
			
			StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			StdDraw.filledRectangle(xLeft+bookw/2, yBot + 20*bookhScale/2.0+yStep*3, bookw/2.0, 20*bookhScale/2.0);
			
			for (int j = 0; j < boxes.get(i).getElementCount(); j++) {
				int bh = boxes.get(i).getElement(j).getSize() * bookhScale;
				StdDraw.setPenColor(StdDraw.BLACK);
				StdDraw.filledRectangle(xLeft+bookw/2, yBot+bh/2.0, bookw/2.0, bh/2.0);
				yBot = yBot + bh + yStep;
			}
			yBot = yMin;
			xLeft = xLeft + bookw + xStep;
		}
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
