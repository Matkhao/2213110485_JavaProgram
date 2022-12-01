import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String fullName = scan.nextLine();
		int space = fullName.indexOf(' ');
		if(space == -1) {
			System.out.println("Incorrect Name");
		}
		else {
			System.out.println("First Name: "+fullName.substring(0, space).toUpperCase());
			System.out.println("Last Name: "+fullName.substring(space).toLowerCase());
		}
		
		
		
	}

}
