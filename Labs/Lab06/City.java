public class City {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private String name;
	private double x;
	private double y;
	public City() {}
	
	public City(String name, double xCoord, double yCoord) {
		this.name=name;
		this.x=xCoord;
		this.y=yCoord;
	}
	public double calculateDistance(City c) {
		return Math.sqrt( (Math.pow(c.x-x, 2))+(Math.pow(c.y-y, 2)));
	}
}
