
public class Food extends Product {
	
	public double vitaminLevel;

	public Food(String name, double price, double vitaminLevel) {
		super(name, price);
		this.vitaminLevel = vitaminLevel;
	}

	@Override
	public String toString() {
		return "Food [vitaminLevel=" + vitaminLevel + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
