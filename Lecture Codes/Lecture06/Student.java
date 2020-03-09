
public class Student {
	
	public String name;
	public int age;
	
	Student(){}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}



	public void decreaseAge() {
		age = age - 1;
	}
	
	public String toString() {
		return "Name: " + name + ", Age: " + age;
	}
	
}
