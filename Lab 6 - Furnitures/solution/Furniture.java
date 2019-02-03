
public class Furniture {
	private String furnitureName;
	private int price;
	private Person designer;
	
	public Furniture() {}
	
	public Furniture(String furnitureName, int price, Person designer) {
		this.furnitureName = furnitureName;
		this.price = price;
		this.designer = designer;
	}
	public String getFurnitureName() {
		return furnitureName;
	}
	public void setFurnitureName(String furnitureName) {
		this.furnitureName = furnitureName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Person getDesigner() {
		return designer;
	}
	public void setDesigner(Person designer) {
		this.designer = designer;
	}
	@Override
	public String toString() {
		return "[" + furnitureName + ", " + price + ", designer=" + designer + "]";
	}
	

}
