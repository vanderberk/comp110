import java.util.ArrayList;

public class CollectionsGeneric<E extends Product> {

	public ArrayList<E>[] collection;
	
	private int MAX_COLLECTIONS = 100;

	public CollectionsGeneric() {
		collection = new ArrayList[MAX_COLLECTIONS];
	}

	public void addItem(int collectionID, E p) {
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
				for (E p : collection[i]) 
					System.out.println(p);
			}
	}
}
