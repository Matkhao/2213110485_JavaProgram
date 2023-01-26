
public class Student {
	//The private instance variables
	private String name;
	private String address;
	//The course taken and grades for the courses are kept in 2 parallel arrays
	private String[] courses;
	private int[] grades; //valid range is [0-100]
	private int numCourses; //Number of courses taken so far
	private static final int MAX_COURSE = 30; //Maximum number of courses taken
	
	public Student(String name,String address) {
		this.name = name;
		this.address = address;
		courses = new String[MAX_COURSE];
		grades = new int [MAX_COURSE];
		numCourses = 0;
	}
	
	// The public getters and setters.
	// No setters for name as it is not designed to be changed.
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return getName() + " (" + getAddress() + ")";
	}
	
	/**Adds a course and grade*/
	public void addCourseGrade(String course , int grade) {
		courses[numCourses] = course;
		grades[numCourses] = grade;
		++numCourses;
	}
	
	/**Prints all course and their grades*/
	public void printGrade() {
		System.out.print(name);
		for(int i=0;i<numCourses;i++) {
			System.out.print(" " +courses[i]+":"+grades[i]);
		}
		System.out.println();
	}
	
	/** Computes the average grade*/
	public double getAverageGrade() {
		int sum = 0; 
		for(int i=0;i<numCourses;i++) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
	}
	
}
