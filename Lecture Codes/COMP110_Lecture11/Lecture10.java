import java.util.ArrayList;

public class Lecture10 {
	
	public static void main(String[] args) {
		Person  p = new Person("A",12);
		//System.out.println(p);
		
		Student s = new Student("B",13,3.1);
		//System.out.println(s);
		
		Instructor b = new Instructor("C", 17, 101);
		//System.out.println(b);
		
		// Create few students and two instructors in a single  variable
		
		// Define the array list using Person type (polymorphism)
		ArrayList<Person> members = new ArrayList<>();
		members.add( new Student("A",10,3.0) );
		members.add( new Instructor("B",10,303) );
		members.add( new Instructor("C",10,404) );
		members.add( new Student("D",10,3.0) );
		members.add( new Student("E",10,3.0) );
		
		//printCourseList( members );
		
		//Person a = new Student("S",12,2.3);
		//a.increaseAge();
		//System.out.println(a);
		
		
		// increase age of all course members (students and instructors)
		for (int i = 0; i < members.size(); i++) {
			members.get(i).increaseAge();
			//System.out.println(members.get(i));
		}
		
		// increase GPAs of students
		for (int i = 0; i < members.size(); i++) {
			// members.get(i).improveGPA(); // this is wrong: Person class does not have improveGPA method

			// NEW TOPIC: INSTANCEOF OPERATOR
			if (members.get(i) instanceof Student) { // if the current array list member is student, enter if body
				// type cast array list member to a student
				Student currentStudent = (Student) members.get(i); // NEW TOPIC: TYPE CASTING OBJECTS
				currentStudent.improveGPA();
			}
			System.out.println(members.get(i));
		}
		
		
		// Another simple example for instanceof and type casting
		Person q = new Instructor("Z",19,100);
		System.out.println();
		if (q instanceof Student)
			System.out.println("Z is a student");
		
		if (q instanceof Instructor) {
			System.out.println("Z is an instructor");
			
			// q.changeRoom(); // this is wrong since declared type is Person
			
			// we have to cast the type to Instructor first
			
			// type casting version 1 (in two steps)
			// Instructor tempInstructor = (Instructor) q;
			// tempInstructor.chageRoom();
			
			// type casting version 2 (shorter version: in a single step)
			((Instructor) q).chageRoom();
			
			// after updating tempInstructor, q also changes
			System.out.println(q);
		}
		
		if (q instanceof Person) 
			System.out.println("Z is a person");
		
	}
	
	private static void printCourseList(ArrayList<Person> courseMembers) {
		System.out.println("Course List: ");
		for (Person person : courseMembers) {
			System.out.println(person);
		}
	}
}
