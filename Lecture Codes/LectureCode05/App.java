
public class App {
	public static void main(String[] args) {
		Person p = new Person("John",-12);
		System.out.println(p);
		
		System.out.println();
		Student s = new Student("Alice",33,3.14);
		
		s.addCourse("COMP001");
		s.addCourse("EE001");
		s.addCourse("COMP002");
		
		System.out.println(s);
		
		
		System.out.println();
		Instructor q = new Instructor("Bob",22, "Room A540");
		System.out.println(q);
		
		System.out.println();
		Instructor r = new Instructor();
		System.out.println(r);
		
		
		
	}
}
