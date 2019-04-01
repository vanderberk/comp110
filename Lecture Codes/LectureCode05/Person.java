
public class Person {
	
	protected String name;
	protected int age;
	
	Person(){ 
		System.out.println("Person's no-arg constructor is called"); 
	}
	
	Person(String name, int age){
		this.name = name;
		//this.age = age; // old way
		setAge(age); // new way
		System.out.println("Person's constructor is called");
	}
	
	public void setAge(int age) {
		if (age >= 0)
			this.age = age;
		else
			System.out.println("Age should be positive");
	}
	
	public String toString() {
		return "Name : " + name + ", Age: " + age;
	}

}
