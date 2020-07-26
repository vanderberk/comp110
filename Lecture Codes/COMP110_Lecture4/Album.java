/**
 * 
 * A simple album class
 * 
 * @author BG
 *
 */
public class Album {

	// data fields
	public String albumName;
	public String artist;
	private int year; // private variable is hidden from outside (client code/main)
	private String[] songs;
	private int playCount; // make private in order to prevent negative values

	private int songPosition = 0;
	private int MAX_SONG_COUNT = 1000;
	
	// constructor 1
	Album(String inputArtist, String inputAlbumName) {

		artist = inputArtist;
		albumName = inputAlbumName;
		songs = new String[MAX_SONG_COUNT];
		System.out.printf("Created an album using constructor 1: %s - %s\n", artist, albumName);
	}

	// constructor 2
	Album(String inputArtist, String inputAlbumName, int inputYear) {

		artist = inputArtist;
		albumName = inputAlbumName;
		year = inputYear;
		songs = new String[MAX_SONG_COUNT];
		System.out.printf("Created an album using constructor 2: %s - %s\n", artist, albumName);
	}


	// class methods
	
	// setter method
	public void setYear(int inputYear) {
		if (inputYear > 0)
			year = inputYear;
		else
			System.out.println("Year should be greater than zero.");
	}
	
	// getter method
	public int getYear() {
		return year;
	}

	// setter method for playCount data field
	public void setPlayCount(int i) {
		if (i > 0)
			playCount = i;
		else 
			System.out.println("Play count should be positive!!!");
		
	}

	// getter method for playCount data field
	public int getPlayCount() {
		return playCount;
	}
	
	// toString method: special method to print object information
	public String toString() {
		String tempStr = artist + ", " + albumName + ", " + year + ", Play Count: " + playCount;
		return tempStr;
	}
	
	public void printSongs() {
		System.out.println("Song List:");
		for (int i = 0; i < songs.length; i++) 
			if (songs[i] != null )
				System.out.printf("%2d. %s\n", i+1, songs[i]);
	}

	// adds a new song at the end of the array
	public void addSong(String songTitle) {
		songs[songPosition] = songTitle;
		songPosition++;
	}

	// gets a song 
	public String getSong(int index) {
		return songs[index-1];
	}
	

}
