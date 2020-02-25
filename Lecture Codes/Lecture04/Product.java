
public class Product {

	// data fields
	public String brand; // Nike
	private int price; // 700
	public String model; // Air 
	public double discountRate; // 0.3 = 30%




	// constructor
	Product(){

		// a constructor can call another constructor
		this("Brand now known", 2, "Model not known", 0.1);


		//System.out.println("1st constructor is called");
		//brand = "Brand is not known yet";
		//price = 2;
		//model = "Model is not specified";
		//discountRate = 0.1;



	}

	// 2nd constructor
	Product(String inputBrand, int inputPrice) {

		this(inputBrand, inputPrice, null, 0.0);

		//System.out.println("2nd constructor called");
		//brand = inputBrand;
		//price = inputPrice;


	}


	// 3rd constructor
	public Product(String brand, int price, String model, double discountRate) {

		System.out.println("3rd constructor called");
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.discountRate = discountRate;
	}

	// class methods
	public void printInfo() {
		System.out.println("\nBrand: " + brand + ", Model: " + model + ", Price: " + price + ", Discount Rate: "  + discountRate);
	}

	public void makeDiscount() {
		price = price - (int)(price * discountRate);

	}

	public void setPrice(int inputPrice) {
		if (inputPrice >= 0)
			price = inputPrice;
		else
			System.out.println("Are you OK??");
	}

}
