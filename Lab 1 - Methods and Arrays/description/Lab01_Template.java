package Lab01;

import java.util.Arrays;

public class Lab01_Template {
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
		return null;
	}
	
	private static double[] getCheapProducts(double[] inputPrices, double cheapLimit) {
		return null;
	}
}
