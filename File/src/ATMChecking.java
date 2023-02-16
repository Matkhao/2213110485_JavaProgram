import java.io.*;
import java.util.Scanner;

public class ATMChecking extends ATMData {
	private int money;
	
	public ATMChecking(String accountNumber , String password , int money) {
		super(accountNumber , password);
		this.money = money;
		
	}
	
	public boolean checkBookBank() throws IOException {
		Scanner read = new Scanner(new File("ATMBookBank.txt"));
		while(read.hasNext()) {
			String acn = read.next();
			String pw = read.next();
			int balance = read.nextInt();
			if( ) {
				
			}
		}
		read.close();
		
		return true;
	}
	
	public void show() {
		System.out.println("Your drawing for " +", " +"get");
		System.out.println("Your balance is " + " Baht.");
		System.out.println("Sorry, your id or password is wring, or your amount not enough.");
	}
	
	
}
