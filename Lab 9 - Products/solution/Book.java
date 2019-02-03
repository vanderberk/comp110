
public class Book extends Product {
	public String author;
	public int pageCount;
	
	public Book(String author, int pageCount) {
		super();
		this.author = author;
		this.pageCount = pageCount;
	}
	
	@Override
	public void increasePrice() {
		price = price * 1.1;
	}

	@Override
	public String toString() {
		return "Book author=" + author + ", pageCount=" + pageCount + " " + super.toString();
	}
}
