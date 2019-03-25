import java.util.ArrayList;

/**
 * Movie class
 * 
 * @author BG
 *
 */
public class Movie {
	
	private String movieName;
	private int year;
	private double metaScore;
	private double imdbScore;
	private String directorName;
	private ArrayList<String> actors = new ArrayList<>();
	
	Movie(){}
	
	/**
	 * Generates a string containing movie information
	 */
	public String toString() {
		return movieName + ", " + year + ", metaScore: " + metaScore + ", imdbScore: " + imdbScore + ", director: " + directorName + ", actors: " + actors ;
		
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getMetaScore() {
		return metaScore;
	}

	public void setMetaScore(double metaScore) {
		this.metaScore = metaScore;
	}

	public double getImdbScore() {
		return imdbScore;
	}

	public void setImdbScore(double imdbScore) {
		this.imdbScore = imdbScore;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public ArrayList<String> getActors() {
		return actors;
	}

	public void setActors(ArrayList<String> actors) {
		this.actors = actors;
	};
	
	

}
