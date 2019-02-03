/**
 * City class has properties of name, xCoord and yCoord. Also it has a method for
 * calculation distance between two cities.
 * 
 * @author Mustafa Can Buken
 * @date 17.12.2018
 * @version 1.00
 *
 */
public class City {
	String name;
	double xCoord;
	double yCoord;
	public City() {

	}
	public City(String name, double xCoord, double yCoord) {
		this.name=name;
		this.xCoord=xCoord;
		this.yCoord=yCoord;
	}
	public double calculateDistance(double cityOneX, double cityOneY, double cityTwoX, double cityTwoY) {
		double distance= Math.abs(
				Math.sqrt(
						(Math.pow(cityTwoX-cityOneX, 2)*111)+
						(Math.pow(cityTwoY-cityOneY, 2)*111)
						));
		return distance;
	}


}
