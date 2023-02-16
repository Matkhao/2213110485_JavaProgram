import java.util.*;
import java.io.*;

public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		String choice , department ;
		System.out.print("Insert or Read data(from file)?: ");
		choice = console.next().toLowerCase();
		while(!choice.equals("insert") && !choice.equals("read")) {
			System.out.print("Please text insert or read data?: ");
			choice = console.next().toLowerCase();
		}
		SaveandOpen file = new SaveandOpen(); // <------ create object to call SaveandOpen Class
		if(choice.equals("insert")) {
			file.insert(); // <----- call insert() method from SaveandOpen Class
		}
		else {
			System.out.print("\nEnter department: ");
			department = console.next(); // <------ �Ѻ������Ἱ��ҡ�����
			file.setDept(department); // <----- send department to setDept() Method ��Ἱ���������Ѻ���ʹ setDept()
			file.read(); // <----- call read() method from SaveandOpen Class ���¡�����ʹ Read � SaveandOpen Class
		}

	}

}
