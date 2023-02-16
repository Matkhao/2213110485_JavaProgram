import java.io.*;
import java.util.*;

public class ATMBanking {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter account number  : ");
		String ACN = scan.next();
		System.out.print("Enter password : ");
		String PW = scan.next();
		while(PW.length()!=4) {
			System.out.print("Input wrong type, Enter account number  : ");
			PW = scan.next();
		}
		System.out.print("Enter money : ");
		int Money = scan.nextInt();
		while(Money%2!= 0 && Money<=0) {
			System.out.print("Enter money : ");
			Money = scan.nextInt();
		}
		ATMChecking bank = new ATMChecking(ACN , PW , Money);
		System.out.println();
		bank.show(); 
	}

}
