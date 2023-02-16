import java.io.*;
import java.util.*;

public class Example1202 {
	static Scanner input = new Scanner(System.in); // <--------- input data from keyboard
	
	public static void main (String[] args) throws IOException {
		//  <--------- read data from file by BufferedReader class 
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		ShowListStudent(section);
		
	}
	
	public static void ShowListStudent(int sec) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("List107.txt"));
		String temp = "";
		while((temp = read.readLine())!= null) {
			String[] data = temp.split("\t");
			double midTermScore = Double.parseDouble(data[4]); // <--------- array index 4 MidTermScore
			double finalScore = Double.parseDouble(data[5]); // <--------- array index 5 FinalScore
			String gradeResult = findResult(midTermScore,finalScore);
			if(Integer.parseInt(data[3]) == sec) {
				System.out.println(data[0] + " " + data[2] + "\t" + midTermScore + 
						"\t" + finalScore + "\t" + gradeResult);
			}
			read.close();
		}
	}
	
	public static String findResult(double mid,double fin) {
		double totalScore = mid + fin;
		if(totalScore<=40) return "Fail";
		else return "Pass";
	}
	
	public static void Header(int sec) {
		System.out.println("************************************************************************");
		System.out.println("\t\t\tList of Data for Section " +sec);
		System.out.println("************************************************************************");
	}

}
