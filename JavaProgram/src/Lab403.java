import java.util.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine().toLowerCase();
		int a = 0;
		if(message.indexOf("nichi")>=0) {
			a++;
		}
		if (a==0) {
			System.out.print(message);
		}
		else {
			System.out.print("Nichi is a sentence");
		}

	}

}
