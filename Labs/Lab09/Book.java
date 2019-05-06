
public class Book implements Comparable<Book>{
	
	private String name;
	private int size;
	
	public Book(String name, int size) {
		this.name = name;
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", size=" + size + "]";
	}

	@Override
	public int compareTo(Book o) {
		if (size > o.size)
			return 1;
		else if (size < o.size)
			return -1;
		else
			return 0;
	}	

}
