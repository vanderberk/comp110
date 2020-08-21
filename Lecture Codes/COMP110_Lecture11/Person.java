
public class Person {
	
	public String name;
	public int age;
	
	Person() {}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age;
	}
	
	public void increaseAge() { 
		age += 1;
	}

}
