import java.util.ArrayList;

public class Collections {

	public ArrayList<Product>[] collection;
	//public ArrayList<ArrayList<Product>> macroCollection;
	
	private int MAX_COLLECTIONS = 100;

	public Collections() {
		collection = new ArrayList[MAX_COLLECTIONS];
	}

	public void addItem(int collectionID, Product p) {
		if ((collectionID < 0) || (collectionID >= MAX_COLLECTIONS))
			throw new IllegalArgumentException("addItem: please check collectionID");

		if (collection[collectionID] == null)
			collection[collectionID] = new ArrayList<>();
		
		collection[collectionID].add(p);
	}

	public void printContents() {
		System.out.println("Contents");
		for (int i = 0; i < collection.length; i++) 
			if (collection[i] != null) {
				System.out.printf("Collection.%d\n", (i+1));
				for (Product p : collection[i]) 
					System.out.println(p);
			}
	}
}
