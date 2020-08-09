
public class Lecture7a {
	
	public static void main(String[] args) {
		
		//Address a = new Address("Maslak", 34340, "Istanbul");
		//System.out.println(a);
		
		Student a = new Student("John",19);
		a.address.city = "Istanbul";
		a.address.postcode = 34340;
		a.address.street = "Maslak";
		System.out.println(a);
		System.out.println(a.address);

		Student b = new Student("Mary",20);
		b.address = new Address("Kadikoy", 35000, "Istanbul");
		System.out.println(b);
		System.out.println(b.address);

		Student c = new Student("Bob", 12, new Address("Besiktas", 36000, "Istanbul"));
		System.out.println(c);
		
		Student d = new Student("Alice",21);
		d.address = new Address("Sariyer", 32320,"Ist");
		d.friend = new Student("Sarah",22);
		System.out.println(d);
		System.out.println("Friend: " + d.friend);
		
		
		
		
	}

}
