
/**
 * This program gets a trip file and calculates distance between each cities
 * and a total distance, by using City class's calculateDistance method, where cities has a name, x coordinate and y coordinate
 * values. While doing this, program asks user whether it is present in the same 
 * directory or is it in a different directory, and acts according to that option.
 * Then program gets the path or file name, and starts making distance calculations.
 * After making calculations, program prints distance between each city trips and at
 * the end, a total distance traveled during that journey.
 * 
 * Program splits each line by using " " (space) character and puts them to an array
 * then assign first index of that array to city's name property, second index to 
 * x coordinate property, and last index to y coordinate property.
 * 
 * @author Mustafa Can Buken
 * @date 17.12.2018
 * @version 1.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class ReadFromFile {
	public static int optionChoose() {
		Scanner optionChooser = new Scanner(System.in);
		System.out.println("Welcome to trip distance calculation app");
		System.out.println("Please enter\n" + "1) If your trip file is in your projects directory \n"
				+ "2) If your trip file is in another directory");
		int option = optionChooser.nextInt();
		boolean flag=false;
		if(option==1 || option==2) {
			flag=true;
		}
		while(!flag) {
			
			System.out.println("Wrong input. Please enter\n"
					+ "1) If your trip file is in your projects directory \n" + 
					"2) If your trip file is in another directory");
			option=optionChooser.nextInt();
			if(option==1 || option==2) {
				flag=true;
			}
			else
				flag=false;
		}
		return option;
	}

	public static String fileChoose(int option) {
		Scanner optionChooser = new Scanner(System.in);
		String fileName = "";
		if (option == 1) {
			System.out.println("Please enter your file name");
			fileName = optionChooser.next();
		} else if (option == 2) {
			System.out.println("Please enter file path");
			fileName = optionChooser.next();
		}
		return fileName;
	}

	public static LinkedList<City> fileRead(File file) throws FileNotFoundException {
		String[] splittedLines = new String[3];
		LinkedList<City> tripCities = new LinkedList<>();
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			splittedLines = sc.nextLine().split(" ");
			City city = new City(splittedLines[0], 
					Double.parseDouble(splittedLines[1]),
					Double.parseDouble(splittedLines[2])
					);
			tripCities.add(city);
		}
		return tripCities;
	}

	public static void tripPrinter(LinkedList<City> tripCities) {
		double totalDistance = 0;
		System.out.println("Trip details");
		for (int i = 0; i < tripCities.size() - 1; i++) {
			double distance = tripCities.get(0).calculateDistance(tripCities.get(i).xCoord, tripCities.get(i).yCoord,
					tripCities.get(i + 1).xCoord, tripCities.get(i + 1).yCoord);
			System.out.printf("%-10s -> %-10s [%-8.2f km]\n", 
					tripCities.get(i).name, 
					tripCities.get(i + 1).name,
					distance);
			totalDistance = totalDistance + distance;

		}
		System.out.printf("Total trip distance: %8.3f km", totalDistance);
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		try {

			int option = optionChoose();
			String fileName = fileChoose(option);
			File file = new File(fileName);
			if (!file.exists()) {
				throw new FileNotFoundException();
			}

			LinkedList<City> tripCities = fileRead(file);
			tripPrinter(tripCities);

		} catch (FileNotFoundException e) {
			e.getMessage();
			System.out.println("File can not be found");
		}

	}

}