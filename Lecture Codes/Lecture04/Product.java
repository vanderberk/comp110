import java.util.Arrays;

/**
 * Product class 
 * Comments are written using JavaDoc style
 * 
 * @author Berk Gokberk
 *
 */

public class Product {

	// data fields
	
	/**
	 * Brand of the product, e.g., Nike
	 */
	public String brand;
	
	/**
	 * Price of the product
	 */
	private double price;
	
	
	/**
	 * Shoe sizes, e.g., 38, 39, 40
	 */
	public int[] sizeArray;
	
	/**
	 * Seller of the product, e.g., Trendyol
	 */
	public String seller;

	// constructors (special class methods)
	Product() {
		
		// version 1
		//		sizeArray = new int[3];
		//		sizeArray[0] = 38;
		//		sizeArray[1] = 39;
		//		sizeArray[2] = 40;
		//		brand = "berk"; // default brand name
		//		price = 100;
		//		seller = "empty seller";

		// version 2 
		// Product("berk",100);
		//this("berk", 100); // example of a constructor calling another constructor
		this("berk", 100, "empty seller", new int[3]);
	}

	Product(String brandString,  double priceOftheProduct) {
		// version 1
		//brand = brandString;
		//price = priceOftheProduct;
		
		// version 2 with price control
		brand = brandString;
		setPrice(priceOftheProduct); // constructor calling a class method
	}
	
	Product(String inputBrand, double inputPrice, String inputSeller, int[] inputArray) {
		brand = inputBrand;
		price = inputPrice;
		seller = inputSeller;
		sizeArray = inputArray;
	}
	
	/**
	 * Explanation of this constructor
	 * 
	 * @param name Input brand name
	 */
	Product(String name) {
		
		// version 1
		// brand = name;
		// price = 13;
		
		// version 2
		this(name,13); // constructor calling another constructor
		seller = "trendyol";
		price = 1400;
	}

	// class methods
	
	/**
	 * Prints the product information at the command prompt
	 * 
	 */
	public void printInfo() {
		System.out.println();
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Seller: " + seller);
		System.out.println("Sizes : " + Arrays.toString(sizeArray));
	}

	/**
	 * Makes discount
	 * 
	 * @param discountRate Explanation....
	 */
	public void makeDiscount(double discountRate) {
		price = price * (1-discountRate);
	}
	
	/**
	 * Sets the price. Checks if the input price is greater than
	 * or equal to zero.
	 * 
	 * @param price input price
	 * 
	 */
	public void setPrice(double price) {
		if (price >= 0) 
			this.price = price;
		else 
			System.out.println("price should be positive");
	}
	
	/**
	 * Returns the price of the product
	 * 
	 * @return Price
	 */
	public double getPrice() {
		return price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
