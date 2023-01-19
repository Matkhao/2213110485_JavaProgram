import java.util.*;
public class AuthorDemo2 {
	
	public static void main(String[] args) {
		String author[] = new String[4];
		String email[] = new String[4];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<author.length;i++) {
			System.out.println("Information Author "+(i+1));
			System.out.println("-------------------------------------------");
			System.out.print("Input author name   : ");
			author[i] = scan.nextLine();
			System.out.print("Input author e-mail : ");
			email[i] = scan.nextLine();
			System.out.println("-------------------------------------------");
		}
		
		System.out.println();
		int num =1;
		for(Author _author:author) {
			System.out.println();
		}
	}

}
