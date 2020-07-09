import java.util.ArrayList;

public class Lecture6 {
	
	public static void main(String[] args) {
		Student a = new Student();
		a.name = "Berk";
		a.age = 12;
		
		modify(a);
		
		System.out.println(a.age);
		
		Student b = new Student();
		b.name = "Alice";
		b.age = 18;
		b.decreaseAge();
		System.out.println(b.age);
		
		System.out.println(a);
		System.out.println(b);
		
		Student[] comp110;
		comp110 = new Student[80];
		comp110[0] = new Student("John",20);
		comp110[1] = new Student("Alice",22);
		comp110[5] = new Student("Bob",1);
		comp110[6] = new Student("Albert",8);
		
//		for(int i = 0; i < comp110.length; i++)
//			if (comp110[i] != null)
//				System.out.println(i + ". " + comp110[i]);

		System.out.println("\n\nCOMP110 Student List:");
		// for-each loop
		for (Student cStudent : comp110)
			if (cStudent != null)
				System.out.println(cStudent);
		
		ArrayList<Student> comp109;
		comp109 = new ArrayList<Student>();
		Student m = new Student("Michael",33);
		comp109.add(m);
		comp109.add( new Student("Bill",44));
		comp109.add(2, new Student("Susan",6));
		//comp109.add(26, new Student("Susan",6));
		
		Student temp = comp109.get(39);
		System.out.println(temp);
		
		
		//System.out.println("\nCOMP109 Student List");
		//for (Student x : comp109)
		//	System.out.println(x);
		
		
		
		
		//Student c = new Student("Cecile",34);
		//System.out.println(c);
		//c = null;
		//System.out.println(c);
		
		
	}

	private static void modify(Student x) {
		x.age++;
		
	}

}
