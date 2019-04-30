package innerclassexample;

public class AppInnerClass {
	public static void main(String[] args) {
		
		// Part 1
		System.out.println("Part 1 Inner classes");
		Student s = new Student();
		s.name = "John";
		s.age = 18;
		s.addCourse("COMP101",1); s.addCourse("COMP103",1);
		s.addCourse("COMP105",1); s.addCourse("COMP107",1);
		
		s.addCourse("COMP102",2); s.addCourse("COMP104",2);
		s.addCourse("COMP106",2); s.addCourse("COMP108",2);
		
		s.addCourse("COMP201",3); s.addCourse("COMP203",3);
		s.addCourse("COMP205",3); s.addCourse("COMP207",3);
		
		s.printStudent();
		
		// Part 2 
		// if the inner class is public, you can access it from another class.
		// Student.Transcript t = s.new Transcript(); // note that new operator is used differently.
		// System.out.println(t.courses);
		
		
		// Part 3 Another inner class example: Defining a class in main
		System.out.println("\n\nPart 3. Inner class example #2");
		class GradedCourse {
			String courseName;
			String letterGrade;
			public String toString() { return courseName + ": " + letterGrade;}
		}
		GradedCourse gradedCourse = new GradedCourse();
		gradedCourse.courseName  = "COMP103";
		gradedCourse.letterGrade = "BA";
		System.out.println(gradedCourse);
	}
}
