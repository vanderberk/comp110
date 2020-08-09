
public class Student {
	
	private String name;
	private int age;
	public Address address;
	public Student friend;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.address = new Address("empty", 0, "empty");
		this.friend = null;
	}
	
	// second constructor
	public Student(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", age=" + age + "]";
//	}
	
//	@Override
//	public String toString() {
//		return "Student [name=" + name + ", age=" + age + ", city: " + address.city + ", street: " + address.street + ", postcode: " + address.postcode + "]";
//	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", " + address + "]";
	}
	
	
	
}
