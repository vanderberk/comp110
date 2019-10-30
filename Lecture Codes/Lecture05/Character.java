
public class Character {

	// data fields or instance variables
	private String name;
	private int energy;
	public Item[] inventory;

	/**
	 * Character constructor
	 * 
	 * @param name 
	 * @param energy
	 * @param inventory
	 */
	public Character(String name, int energy, Item[] inventory) {
		this.name = name;
		this.energy = energy;
		this.inventory = inventory;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String takeName() {
		return name;
	}

	public String toString() {
		return "[ " + name + ", " + energy + ", Item 1= (" + inventory[0].name + ", " + inventory[0].value + ") ]"; 
	}

	public void printCharacterInfo() {
		System.out.println("Name  : " + name);
		System.out.println("Energy: " + energy);
		System.out.println("Inventory Items: ");

		//		for (int i = 0; i < inventory.length; i++) 
		//			if (inventory[i] != null) {
		//				// version 1: using data fields
		//				//System.out.println((i+1) + ". [" + inventory[i].name + ", " + inventory[i].value + "]");
		//				
		//				// version 2: using toString
		//				System.out.println(inventory[i]);
		//			}

		// for-each loop
		if (inventory != null)
			for (Item currentItem: inventory) 
				if (currentItem != null)
					System.out.println(currentItem);

	}



}
