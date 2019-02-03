
public abstract class Product {
	public String name;
	public double price;
	
	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}
	
	public abstract void increasePrice();

}
