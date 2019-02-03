
public class CD extends Product {
	public String artist;
	public int year;

	public CD(String artist, int year) {
		super();
		this.artist = artist;
		this.year = year;
	}

	@Override
	public String toString() {
		return "CD   artist=" + artist + ", year=" + year + " " + super.toString();
	}
	
	@Override
	public void increasePrice() {
		price = price * 2.0;
	}

}
