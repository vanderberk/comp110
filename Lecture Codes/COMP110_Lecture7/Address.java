
public class Address {
	
	public String street;
	public int postcode;
	public String city;
	
	public Address(String street, int postcode, String city) {
		this.street = street;
		this.postcode = postcode;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + ", city=" + city + "]";
	}
	
}
