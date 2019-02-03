package Lab01;

import java.util.Arrays;

public class Lab01 {
	public static void main(String[] args) {
		
		double[] prices = {30.4, 100.6, 80.6, 40.4, 70.8, 66.8, 10.2, 2.6, 102.2, 90.0, 50.3, 21.6};
		
		double discountRate = 0.2; // make 20 percent discount 
		double[] discountedPrices = makeDiscount(prices, discountRate);
		
		double cheapLimit = 50.0;
		double[] cheapProducts = getCheapProducts(discountedPrices, cheapLimit);
		
		System.out.println("Prices            : " + Arrays.toString(prices));
		System.out.println("Discounted Prices : " + Arrays.toString(discountedPrices));
		System.out.println("Cheap Products    : " + Arrays.toString(cheapProducts));
	}

	private static double[] makeDiscount(double[] inputPrices, double discountRate) {
		double[] newArray = new double[inputPrices.length];
		for (int i = 0; i < inputPrices.length; i++)
			newArray[i] = inputPrices[i] * (1-discountRate);
		return newArray;
	}
	
	private static double[] getCheapProducts(double[] inputPrices, double cheapLimit) {
		double[] outputArray = null;
		int counter = 0;
		for (int i = 0; i < inputPrices.length; i++)
			if (inputPrices[i] <= cheapLimit)
				counter++;
			
		if (counter != 0) {
			outputArray = new double[counter];
			int currentIndex = 0;
			for (int i = 0; i < inputPrices.length; i++)
				if (inputPrices[i] <= cheapLimit) 
					outputArray[currentIndex++] = inputPrices[i];
		}
		return outputArray;
	}
}
