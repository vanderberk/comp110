
public class Lecture04 {
	public static void main(String[] args) {
		
		Product p = new Product();
		p.printInfo();
		
		Product m = new Product("dutti");
		m.brand = "masssimo";
		m.sizeArray = new int[3];
		m.sizeArray[2] = 88;
		m.brand = "massimo dutti";
		
		m.setPrice(90);
		m.printInfo();
		
		Product n = new Product("adidas",100);
		n.setBrand("new balance");
		n.printInfo();
		System.out.println("Name  of the product: " + n.brand);
		
		// this is wrong since price is private
		// System.out.println("Price of the product: " + n.price);
		
		// correct version using a getter method
		System.out.println(n.getPrice());
	}

}
