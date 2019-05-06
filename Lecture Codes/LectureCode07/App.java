
public class App {
	public static void main(String[] args) {

		try {
			Collections migros = new Collections();
			migros.printContents();
			migros.addItem(0, new Food("Apple",12,300));
			migros.addItem(0, new Food("Orange",14,350));
			migros.addItem(3, new Food("Banana",12,300));
			migros.addItem(3, new Food("Republic",14,350));
			migros.printContents();
		}
		catch (IllegalArgumentException ex) {
			System.out.printf("something wrong! %s \n", ex.getMessage());
			System.out.println("\n\n exiting....");
		}

		// Part 2 Generic Collection
		System.out.println("\n\nGENERIC TYPES:");
		CollectionsGeneric<Product> p = new CollectionsGeneric<>();
		p.addItem(0, new Food("blablabla",0,0));

		//		CollectionsGeneric<String> gc = new CollectionsGeneric<>();
		//		gc.addItem(0, "ABC");
		//		gc.addItem(0, "PQR");
		//		gc.addItem(78, "XYZ");
		//		gc.addItem(78, "KLM");
		//		gc.printContents();
		//		
		//		CollectionsGeneric<Book> b = new CollectionsGeneric<>();
		//		b.addItem(3, new Book("Q",400));
		//		b.printContents();

	}

}
