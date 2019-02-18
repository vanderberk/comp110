import java.util.Arrays;

/**
 * Student class stores name, surname, age, GPA, and grades of a student.
 * 
 * @author Berk
 * @since 18/02/2019
 *
 */
public class Student {

	/**
	 * Data fields (instance variables) of the Student class
	 * 
	 */
	public String name;
	public String surname;
	private int age;
	public double gpa;
	public int[] grades;
	

	/**
	 * Default constructor (No-arg constructor)
	 * 
	 * Explanation: 
	 * Creates an default student
	 */
	Student(){
		
		// Version 1 (See Version 2 for a better OOP approach)
		//name = "berk";
		//surname = "gokberk";
		//age = 2;
		//gpa = 0.67;
		//grades = new int[5];
		
		// Version 2 : Constructor calls another constructor
		// Easier to write default constructor using another constructor (if it is present)
		this("berk", "gokberk",2, 0.67);
		System.out.println("Default constructor is called");

	}
	
	/**
	 * Second Constructor: Initializes a student
	 * 
	 * @param inputName Student name
	 * @param surname Student surname
	 * @param age Student age
	 * @param gpa Student GPA
	 * @param examGrades Student grades stored in an integer array
	 */
	public Student(String inputName, String surname, int age, double gpa, int[] examGrades) {
		System.out.println("2nd constructor is called.");
		name = inputName;
		this.surname = surname;
		this.age = age;
		this.gpa = gpa;
		this.grades = examGrades;
	}

	/**
	 * Third constructor: Explanation is written here
	 * @param inputName Explanation here
	 * @param surname Explanation here
	 * @param age Explanation here
	 * @param gpa Explanation here
	 */
	public Student(String inputName, String surname, int age, double gpa) {
		// 3rd constructor
		System.out.println("3rd constructor is called.");
		name = inputName;
		this.surname = surname;
		this.age = age;
		this.gpa = gpa;

	}


	/**
	 * Sets the age of a student
	 * Age should be a positive integer
	 * @param inputAge Input age of a student
	 */
	public void setAge(int inputAge) {
		if (inputAge > 0)
			age = inputAge;
		else 
			System.out.println("Age should be positive!");
	}

	/**
	 * Gets the age of a student
	 * @return Age of a student
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Prints student information: name, surname, age, gpa and grades
	 */
	public void printInfo() {
		System.out.printf("Name: %s, Surname: %s, Age: %d, GPA: %5.2f, ", 
				name, surname, age, gpa);
		System.out.printf("Grades: %s\n", Arrays.toString(grades));

	}

}
