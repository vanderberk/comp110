import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Album myAlbum = new Album();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter album name: ");
		String albumName = input.nextLine();
		System.out.print("Enter artist name: ");
		String artistName = input.nextLine();
		myAlbum.setAlbumName(albumName);
		myAlbum.setArtistName(artistName);
		System.out.println("Get album song information: song name and duration in seconds\n(assume that there are 3 songs)");
		int maxSongCount = 3;
		String songName;
		int songDuration; // e.g., 304 seconds
		for (int i = 0; i < maxSongCount; i++ ) {
			System.out.print("Enter song " + (i+1) + " name: ");
			songName = input.nextLine();
			System.out.print("Enter song " + (i+1) + " duration (in seconds): ");
			songDuration = input.nextInt();
			input.nextLine();
			myAlbum.addSong(songName, songDuration);
		}
		System.out.println(myAlbum);
	}
}
