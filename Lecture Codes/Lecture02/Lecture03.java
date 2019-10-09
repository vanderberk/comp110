import java.util.Arrays;

public class Lecture03 {
	public static void main(String[] args) {
		
		// Non-OOP version
		String brand = "Nike";
		int price = 450;
		int[] sizeArray = {37, 38, 40, 43};
		String seller = "Trendyol";
		// Print product using old Java concepts
		printProduct(brand, price, sizeArray, seller);
		
		// OOP version
		System.out.println("\n\nOOP version:");
		int[] shoeSizes = {37, 38, 39};
		Product myProduct = new Product("Adidas", 300, "Boyner", shoeSizes);
		
		// Print product information
		System.out.println("Brand : " + myProduct.brand);
		System.out.println("Price : " + myProduct.price);
		System.out.println("Seller: " + myProduct.seller);
		System.out.println("Sizes : " + Arrays.toString(myProduct.sizeArray));
		
		// Print product information using a method
		System.out.println("\nPrint Product Information using OOP version");
		printProductOOP(myProduct);
		
		//Print product information using real OOP way
		System.out.println("\nPrint Product Info using real OOP way");
		myProduct.printInfo();
		
		Product p = new Product("Camper", 1350);
		System.out.println("\nPrints second product");
		p.seller = "Hotic";
		p.sizeArray = new int[3];
		p.sizeArray[0] = 34;
		p.sizeArray[1] = 36;
		p.price = 600;
		p.printInfo();
		
		p.makeDiscount(0.8);
		
		p.printInfo();
		
	}

	private static void printProductOOP(Product inputProduct) {
		
		System.out.println("Brand : " + inputProduct.brand);
		System.out.println("Price : " + inputProduct.price);
		System.out.println("Seller: " + inputProduct.seller);
		System.out.println("Sizes : " + Arrays.toString(inputProduct.sizeArray));
		
	}

	private static void printProduct(String brand, int price, int[] sizeArray, String seller) {
		System.out.println("\nProduct Information:");
		System.out.println("Brand: " + brand);
		System.out.println("Price: " + price);
		System.out.println("Available Sizes: " + Arrays.toString(sizeArray));
	}


}
