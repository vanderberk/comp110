import java.util.Arrays;

/**
 * Lecture 1 Source Code
 * @author Berk Gokberk
 * @since 3.2.2020
 *
 */
public class Lecture01 {

	/**
	 * App for Trendyol (comment for main)
	 * @param args
	 */
	public static void main(String[] args) {

		// good programming practice 1
		// always use variables instead of numbers in array creation

		int numberOfProducts = 10; // number of products in Trendyol
		String[] brand; // Brands in Trendyol
		int[] price = new int[numberOfProducts]; // Prices of items in Trendyol app 

		brand = new String[numberOfProducts];

		brand[0] = "Nike";
		brand[1] = "Beymen";
		brand[2] = "Silk Cashmere";
		brand[3] = "LCW";
		brand[4] = "Adidas";
		brand[5] = "Dutti";


		price[0] = 700;
		price[1] = 3500;
		price[2] = 900;
		price[3] = 50;
		price[4] = 150;
		price[5] = 900;


		printInfo(brand, price);

		int limit = 800;
		String[] cheapProducts = findCheapProducts(brand, price, limit);
		

		System.out.println("\nCheap brands are: " + Arrays.toString(cheapProducts));

		//makeDiscount(price, 40);
		//System.out.println("\nAfter discount: ");
		//printInfo(brand, price);
	}

	// Old style comments:
	// Makes discount in Trendyol products
	// It has two inputs: 
	// inputArray: prices of the products
	// discountPrice: discount price in TL


	/**
	 * Makes discount ..... (Javadoc style comments)
	 * @param inputArray prices of the items ....
	 * @param discountPrice discount price ....
	 */
	private static void makeDiscount(int[] inputArray, int discountPrice) {
		for (int i = 0; i < inputArray.length; i++) 
			inputArray[i] -= discountPrice;
	}



	/**
	 * Prints product information 
	 * @param brand explanation of the brand
	 * @param price explanation of the price variable
	 */
	public static void printInfo(String[] brand, int[] price) {
		for (int i = 0; i < price.length; i++) 
			//System.out.println((i+1) + ". Brand: " + brand[i] + ", Price: " + price[i] + "TL");
			if (brand[i] != null)
				System.out.printf("%2d. Brand: %-20s Price: %5dTL\n", (i+1), brand[i], price[i] );
	}

	private static String[] findCheapProducts(String[] inputBrand, int[] inputPrice, int limit) {
		int counter = 0;
		for (int i = 0; i < inputPrice.length; i++) 
			if ((inputPrice[i] <= limit) && (inputPrice[i] > 0))
				counter++;
		//System.out.println("Counter: " + counter);

		String[] outputArray = new String[counter];

		int k = 0;
		for (int i = 0; i < inputBrand.length; i++) {
			if ( (inputPrice[i] <= limit) && (inputPrice[i] > 0) ){
				outputArray[k] = inputBrand[i];
				k = k + 1;
			}
		}
		return outputArray;
	}

}