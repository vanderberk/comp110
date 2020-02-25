
public class Lecture04 {
	public static void main(String[] args) {
		
		// declare a product object
		Product p;
		
		// initializing the product
		// creating the product
		p = new Product();
		
		System.out.println("After the constructor");
		System.out.println(p.brand);
		System.out.println(p.model);
		System.out.println(p.discountRate);
		
		
		// Assigning some values
		p.brand = "Nike";
		
		//p.price = 700;
		p.setPrice(700);
		
		p.discountRate = 0.2;
		p.model = "Air";
		
		System.out.println("\nAfter assigning some values");
		System.out.println(p.brand);
		
		// create another product
		Product m = new Product();
		
		System.out.println("\nProduct m is created");
		System.out.println(m.brand);
		
		Product n = new Product("Adidas", 100);
		n.discountRate = 0.8;
		
		System.out.println("\nProduct n is created");
		//System.out.println(n.brand);
		//System.out.println(n.price);
		//System.out.println(n.model);
		//System.out.println(n.discountRate);
		n.printInfo();
		
		n.makeDiscount();
		
		n.printInfo();
		
		Product k = new Product("Eastpak", 400, "Blue", 0.01);
		k.printInfo();
		
		
		Product s = new Product();
		s.setPrice(-300);
		s.printInfo();
		
		
		
		
	}
}
