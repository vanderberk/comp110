
public class Box implements Stack{
	
	private Book[] storage = new Book[1000];
	private int numElements;
	private int capacity;
	private int freeSpace;
	
	Box(int capacity) {
		this.capacity = capacity;
		freeSpace = capacity;
	}

	@Override
	public void push(Book book) {
		if (book.getSize() <= freeSpace) {
			storage[numElements++] = book;
			freeSpace -= book.getSize();
		}
		else
			System.out.println("Box does not have enough free space. Book is not pushed!");
	}

	@Override
	public Book pop() {
		Book book = storage[numElements-1];
		numElements--;
		freeSpace += book.getSize();
		return null;
	}

	@Override
	public int getFreeSpace() {
		return freeSpace;
	}
	
	public int getSize() {
		return capacity - freeSpace;
	}
	
	public void displayBox() {
		System.out.printf("\nBox Info:  [capacity:%d, %d books, occupied space:%d, empty space:%d]\n", capacity, numElements, getSize(), freeSpace);
		for (Book book : storage) 
			if (book != null)
				System.out.println(book);
	}
	
	public Book getElement(int i) {
		return storage[i];
	}
	
	public int getElementCount() {
		return numElements;
	}
	

}
