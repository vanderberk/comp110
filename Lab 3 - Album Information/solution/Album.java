
public class Album {
	private String name;
	private String artist;
	private String[] songNames;
	private int[] songDurations;
	private int MAX_SONG_COUNT = 100;
	private int songCount = 0;
	
	Album() {
		songNames = new String[MAX_SONG_COUNT];
		songDurations = new int[MAX_SONG_COUNT];
	}
	
	public void setAlbumName(String name) {
		this.name = name;
	}
	public void setArtistName(String artist) {
		this.artist = artist;
	}
	public String toString() {
		String str = "Album: " + name + ", Artist: " + artist + ", Songs: [";
		for (int i = 0; i < songCount; i++)
			str = str + " " + songNames[i] + ":" + songDurations[i] + " ";
		str = str + "]";
		return str;
	}
	
	public void addSong(String name, int duration) {
		songNames[songCount] = name;
		songDurations[songCount] = duration;
		songCount++;
	}

}
