import java.util.ArrayList;

public class Student extends Person {
	private double GPA;
	private ArrayList<String> coursesTaken;
	
	Student(String name, int age, double GPA) {
		//this.name = name;
		//this.age = age;
		
		// new approach
		super(name,age);
		setAge(age);
		
		this.GPA = GPA;
		coursesTaken = new ArrayList<>();
	}
	
	public void addCourse(String s) {
		coursesTaken.add(s);
	}
	
	// example of overriding
	public String toString() {
		//return "Name: " + name + ", Age: " + age + ", GPA: " + GPA;
		return super.toString() + ", GPA: " + GPA + ", Course: " + coursesTaken;
	}
	

}
