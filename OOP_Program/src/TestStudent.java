
public class TestStudent {

	public static void main(String[] args) {
		//Test Constructor and toString()
		Student jirapat = new Student("Jirapat Anantasiri","1 Happy Ave");
		System.out.println(jirapat);

		//Test Setters and Getters
		jirapat.setAddress("25 Pattanakarn");
		System.out.println(jirapat); //toString()
		System.out.println(jirapat.getName());
		System.out.println(jirapat.getAddress());
		
		//Test addCourseGrade(),printGrades(), and get AverageGrade()
		
		jirapat.addCourseGrade("INT107", 89);
		jirapat.addCourseGrade("INT108", 79);
		jirapat.addCourseGrade("MSC202", 69);
		jirapat.printGrade();
		
		System.out.printf("The average grade is %.2f%n", jirapat.getAverageGrade());
	}

}
