import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab06 {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "trips.txt";
		try {
			File file = new File(fileName);
			if (!file.exists()) 
				throw new FileNotFoundException();
			ArrayList<City> trip = readTripFile(file);
			printTrip(trip);
		} catch (FileNotFoundException e) {
			System.out.printf("Input file (%s) can not be found", fileName);
		}
	}

	public static ArrayList<City> readTripFile(File file) throws FileNotFoundException {
		String[] parts = new String[3];
		ArrayList<City> tripCities = new ArrayList<>();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			parts = sc.nextLine().split(" ");
			City city = new City(parts[0], Double.parseDouble(parts[1]),Double.parseDouble(parts[2]));
			tripCities.add(city);
		}
		return tripCities;
	}

	public static void printTrip(ArrayList<City> cities) {
		double totalDistance = 0;
		System.out.println("Trip details: ");
		for (int i = 0; i < cities.size() - 1; i++) {
			double distance = cities.get(i).calculateDistance(cities.get(i + 1));
			System.out.printf("%-10s -> %-10s [%8.2f km]\n", cities.get(i).getName(), cities.get(i + 1).getName(), distance);
			totalDistance = totalDistance + distance;
		}
		System.out.printf("\nTotal trip distance: %8.3f km", totalDistance);
	}

}