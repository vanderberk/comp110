import java.util.Arrays;

/**
 * Lecture 03 Code
 * Topics: Classes and objects
 * 
 * @author Berk
 * @since 18/02/2019
 *
 */
public class Lecture03 {
	public static void main(String[] args) {
		
		
		System.out.println("COMP 110 Lecture 3 Code\n");
		
		/**
		 * Part 1 Non-OOP approach (Procedural programming)
		 */
		System.out.println("\nPart 1");
		String name;
		String surname;
		int age;
		double gpa;
		int[] grades;
		
		name = "john";
		surname = "doe";
		age = 12;
		gpa = 2.3;
		grades = new int[5];
		grades[0] = 10;
		grades[1] = 20;
		grades[2] = 30;
		grades[3] = 40;
		grades[4] = 50;
		printStudent(name, surname, age, gpa, grades);
		
		
		/**
		 * Part 2 OOP approach
		 */
		System.out.println("\nPart 2");
		Student s;
		s = new Student();
		s.name = "bob";
		
		//System.out.printf("Name: %s\n", s.name);
		printStudentOOP(s);
		
		
		/**
		 * Part 3 Setter/getter methods
		 */
		System.out.println("\nPart 3 Setters/Getters");
		// s.age = -1; Not a preferred way in OOP
		s.setAge(-1);
		s.setAge(33);
		s.setAge(-2);
		printStudentOOP(s); // Not a good OOP programming practice.
		System.out.printf("Age is: %d\n", s.getAge());

		
		/**
		 * Part 4. Class methods
		 */
		System.out.println("\nPart 4. Class Methods");
		s.printInfo();
		
		Student p = new Student();
		p.printInfo();
		
		
		/**
		 * Part 5 Using multiple constructors
		 */
		System.out.println("\nPart 5 Multiple Constructors");
		int[] examGrades= {10,10,0,90, 99};
		Student m = new Student("Alice", "Caplier", 30, 3.4, examGrades);
		m.printInfo();
		
		
		/**
		 * Part 6 Constructor Chaining
		 */
		System.out.println("\nPart 6 Constructor Chaining");
		Student n = new Student();
		n.name = "bill";
		n.surname = "bruford";
		n.setAge(55);
		n.printInfo();
		
		
		/**
		 * Part 7 Objects and null
		 */
		System.out.println("\nPart 7 Objects and Null");
		n = null;
		//n.printInfo(); // if n is null, this statement produces a run-time error (Null pointer exception)
		
		
		/** 
		 * Part 8 Assigning one object to another
		 * This example is similar to 
		 * int x=4; 
		 * int y=3; 
		 * x=y;
		 */
		System.out.println("\nPart 8 Assigninig an object to another object");
		s = p; 
		p.printInfo();
		s.printInfo();
		
		
		/**
		 * Part 9 Changing an object using another object
		 * 
		 */
		System.out.println("\nPart 9 Changing an object using another object");
		Student t;
		t = m;
		t.name = "lewis";
		t.printInfo();
		m.printInfo();
		
	}

	/**
	 * 
	 * @param inputStudent
	 */
	private static void printStudentOOP(Student inputStudent) {
		
		System.out.printf("Name: %s, Surname: %s, Age: %d, GPA: %5.2f, ", 
				inputStudent.name, inputStudent.surname, inputStudent.getAge(), inputStudent.gpa);
		System.out.printf("Grades: %s\n", Arrays.toString(inputStudent.grades));

		
	}

	/**
	 * Explain the method....
	 * @param name name of the student
	 * @param surname
	 * @param age
	 * @param gpa
	 * @param grades
	 */
	private static void printStudent(String name, String surname, int age, double gpa, int[] grades) {
		System.out.printf("Name: %s, Surname: %s, Age: %d, GPA: %5.2f, ", 
				name, surname, age, gpa);
		System.out.printf("Grades: %s\n", Arrays.toString(grades));
	}
}
