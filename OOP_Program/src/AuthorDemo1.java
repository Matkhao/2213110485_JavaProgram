import java.util.*;
public class AuthorDemo1 {

	public static void main(String[] args) {
		String name , email;
		char gender;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input autor name    : ");
		name = scan.nextLine();
		System.out.print("Input autor e-mail  : ");
		email = scan.nextLine();
		System.out.print("Input author gender : ");
		gender = scan.next().toUpperCase().charAt(0);
		
		Author author = new Author(name,email,gender);
		
		System.out.println();
		System.out.println(author);

	}

}
