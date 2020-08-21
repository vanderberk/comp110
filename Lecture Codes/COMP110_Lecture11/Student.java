
public class Student extends Person { 
	
	public double GPA;

	public Student(String name, int age, double GPA) {
		super(name,age);
		this.GPA = GPA;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + ", GPA=" + GPA;
	}
	
	public void improveGPA() {
		GPA = GPA * 1.2;
	}
}
