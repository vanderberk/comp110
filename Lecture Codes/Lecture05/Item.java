
public class Item {
	
	public String name;
	public double value;
	
	// default constructor
	Item() { 
		// default name should be "garbage"
		// default values should be 100
		this("garbage",100);
		
	}
	
	Item(String name, double value){
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Prints item information
	 * 
	 */
	public void printInfo() {
		System.out.println("Item name : " + name);
		System.out.println("Item value: " + value);
	}
	
	public String toString() {
		//String myString = "[" + name + ", " + value + "]";
		return "[" + name + ", " + value + "]";
	}

}
