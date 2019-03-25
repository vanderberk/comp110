import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lecture {
	public static void main(String[] args) {

		// read movie information from a text file
		String filename = "moviedb.txt";

		File myFile = new File(filename);
		Scanner myInput = null;
		try {
			myInput = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			System.out.println(filename + ": Input file can not be found!\nExiting program...");
			System.exit(1);
		}

		// movies array list stores all movies
		ArrayList<Movie> movies = new ArrayList<>();

		while(myInput.hasNext()) {
			String line1 = myInput.nextLine();
			String line2 = myInput.nextLine();
			String line3 = myInput.nextLine();
			String[] parts = line1.split(",");

			// get movie info from a line
			String movieName = parts[0].trim();
			int year = Integer.parseInt(parts[1].trim());
			double metaScore = Double.parseDouble(parts[2].trim());
			double imdbScore = Double.parseDouble(parts[3].trim());
			String directorName = parts[4].trim();
			ArrayList<String> actors = new ArrayList<>();
			for (int i = 5; i < parts.length; i++) 
				if (parts[i].trim() != null) 
					actors.add(parts[i].trim());

			//store movie info in a movie object
			Movie m = new Movie();
			m.setMovieName(movieName);
			m.setYear(year);
			m.setMetaScore(metaScore);
			m.setImdbScore(imdbScore);
			m.setDirectorName(directorName);
			m.setActors(actors);
			
			// print movie information using toString method
			System.out.println(m);
			
			// add movie to the movies array list
			movies.add(m);
		} // end while
		

		// show all movies
		printMovies(movies);

		// search an actor
		String name = "Gary";
		searchActor(movies, name);

		// sort movies by their year in increasing order
		sortMovies(movies);

		System.out.println("\nMovie list after the sort");
		printMovies(movies);
	}

	/**
	 * sorts movies by their year in increasing order
	 * @param inputMovies input movie array list
	 */
	private static void sortMovies(ArrayList<Movie> inputMovies) {
		// sort movies acc. to year?
		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			int ind1 = r.nextInt(inputMovies.size());
			int ind2 = r.nextInt(inputMovies.size());
			if (ind1 < ind2) {
				if (inputMovies.get(ind1).getYear() > inputMovies.get(ind2).getYear()) {
					Movie temp = inputMovies.get(ind1);
					inputMovies.set(ind1, inputMovies.get(ind2));
					inputMovies.set(ind2, temp);
				}
			}
		}
	}

	/**
	 * search for an actor in movie array list
	 * @param movies movie array list
	 * @param name actors name to search for
	 */
	private static void searchActor(ArrayList<Movie> movies, String name) {
		// search an actor? gary oldman?
		//String name = "Jean";
		for (Movie m : movies) 
			if (m.getActors()!=null) 
				for (String a : m.getActors()) 
					if (a.contains(name)) 
						System.out.println(m);
	}

	/**
	 * prints all movies
	 * @param x movie array list
	 */
	public static void printMovies(ArrayList<Movie> x) {
		for(Movie currentMovie : x)
			System.out.println(currentMovie);
	}
}
