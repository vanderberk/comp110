import java.util.Arrays;

public class Product {
	
	// data fields
	public String brand;
	public double price;
	public int[] sizeArray;
	public String seller;
	
	// constructors (special class methods)
	Product(String brandString,  double priceOftheProduct) {
		brand = brandString;
		price = priceOftheProduct;
	}
	
	Product(String b, double p, String s, int[] a) {
		brand = b;
		price = p;
		seller = s;
		sizeArray = a;
	}
	
	// class methods
	public void printInfo() {
		System.out.println();
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Seller: " + seller);
		System.out.println("Sizes : " + Arrays.toString(sizeArray));
	}

	public void makeDiscount(double discountRate) {
		price = price * (1-discountRate);
	}

}
