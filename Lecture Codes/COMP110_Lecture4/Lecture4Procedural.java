import java.util.Arrays;

public class Lecture4Procedural {
	
	public static void main(String[] args) {
		
		String artist;
		String albumName;
		String[] songs;
		int year;
		int playCount;
		
		artist = "Jethro Tull";
		albumName = "Aqualung";
		year = 1971;
		songs = new String[7];
		songs[0] = "Song 1";
		songs[1] = "Song 2";
		songs[2] = "Song 3";
		songs[3] = "Song 4";
		songs[4] = "Song 5";
		songs[5] = "Song 6";
		songs[6] = "Song 7";
		playCount = 3400;
		
		System.out.printf("Artist: %s, Album name: %s, Year: %d\n", artist, albumName, year);
		System.out.println("Songs: " + Arrays.toString(songs));
		
		
		
		String artist2;
		String albumName2;
		String[] songs2;
		int year2;
		int playCount2;
		
		artist2 = "King Crimson";
		albumName2 = "Red";
		year2 = 1974;
		songs2 = new String[5];
		songs2[0] = "Song 1";
		songs2[1] = "Song 2";
		songs2[2] = "Song 3";
		songs2[3] = "Song 4";
		songs2[4] = "Song 5";
		playCount2 = 1200;
		
		System.out.println();
		System.out.printf("Artist: %s, Album name: %s, Year: %d\n", artist2, albumName2, year2);
		System.out.println("Songs: " + Arrays.toString(songs2));
		
		System.out.println();
		displaySong(artist2, albumName2, songs2, 1);
		
	}

	private static void displaySong(String artist, String album, String[] songs, int i) {
		
		System.out.printf("%s - %s - %s\n", artist, album, songs[i-1]);
				
	}

}
