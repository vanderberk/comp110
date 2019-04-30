package innerclassexample;

import java.util.ArrayList;

/**
 * Outer class
 */
public class Student {

	public String name;
	public int age;
	public Transcript transcript;

	public Student() {
		transcript = new Transcript();
	}

	/**
	 * Add a course to a semester.
	 * Semesters range from 1 to 8
	 * 
	 * @param courseName Course name. For simplicity, courses are represented by their names only.
	 * @param semesterID Semester ID
	 */
	public void addCourse(String courseName, int semesterID) {
		transcript.addCourse(courseName, semesterID);
	}

	/**
	 * Prints student info
	 */
	public void printStudent() {
		System.out.printf("Student: %s, Age: %s\n", name, age);
		transcript.printTranscript();
	}

	/**
	 * Inner class to store transcript information
	 */
	private static class Transcript {

		/**
		 * Transcript stores all data in an array of array lists.
		 * Each array entry points to a courses in that semester.
		 * semesters[0] -> 1st semester -> Contains courses A, B, C etc.
		 * semesters[1] -> 2nd semester -> Contains courses D, E, F etc.
		 */
		ArrayList<String>[] semesters = new ArrayList[8];

		/**
		 * Adds a course to semester
		 * @param courseName Course name 
		 * @param semesterID Semester ID, e.g., 1, 2, etc.
		 */
		public void addCourse(String courseName, int semesterID) {
			
			// create semester if not created previously
			if (semesters[semesterID-1] == null) 
				semesters[semesterID-1] = new ArrayList<>();

			// add a course to the semester 
			semesters[semesterID-1].add(courseName);
		}

		/** 
		 * Displays transcript details
		 */
		public void printTranscript() {
			for (int i = 0; i < semesters.length; i++) {
				if (semesters[i] != null ) {
					System.out.println("\nSemester " + (i+1));
					for (String courseName: semesters[i])
						System.out.println(courseName);
				}
			}
		}
	}
}
