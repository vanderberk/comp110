import java.util.Arrays;

/**
 * 
 * Client code/app for Spotify 
 * Uses Album class
 * 
 * @author berk
 *
 */
public class Lecture4OOP {
	
	public static void main(String[] args) {
		
		
		// a is variable
		// data type of a is integer
		int a = 8;
		
		// b is an object (similar to variable)
		// data type of b is Album (Album is a class)
		
		// in OOP terminonlogy
		// variable -> object
		// data type -> class
		
		
		// what is a class? (Album)
		// what is an object? (album1)
		Album album1 = new Album("Jethro Tull", "Aqualung");
		// Album album1 = new Album("Jethro Tull", "Aqualung", 1971);
		
		//album1.year = 1971;
		// album1.playCount = 3406;
		// album1.songs[0] = "Aqualung";
		// album1.songs[1] = "Cross eyed Mary";
		// album1.songs[2] = "Cheap Day Return";
		// System.out.println(Arrays.toString(album1.songs));
		
		Album album2 = new Album("King Crimson", "Red", 1974);
		// album2.playCount = 1206;
		
		album2.setPlayCount(1206);
		album2.albumName = "Orange"; // just for fun :)
		
		// System.out.println(album2.getPlayCount());
		
		
		// System.out.println();
		//System.out.printf("Artist: %s, Album: %s, Year: %d\n", album2.artist, album2.albumName, album2.year);
		
		// album2.year = -1; // year is now private. access to year is forbidden.
		
		// album2.setYear(1999);
		// album2.setYear(-2);
		
		// System.out.println(album2.getYear()); // using getter method to print year
		// System.out.printf("Artist: %s, Album: %s, Year: %d\n", album2.artist, album2.albumName, album2.getYear());
		
		
		// in order to print object information
		// we use toString method implemented in the class
		System.out.println(album2);
		
		album2.addSong("Song 1");
		album2.addSong("Song 2");
		album2.addSong("Song 3");
		album2.addSong("Song 4");
		album2.addSong("Song 5");

		album2.printSongs();

		// randomly get songs 
		System.out.println(album2.getSong(4));
		System.out.println(album2.getSong(2));
		System.out.println(album2.getSong(1));
		
	}

}
