import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	
	private String name;
	private String dept; //Ἱ�
	
	public void insert() throws IOException {
		Scanner console = new Scanner(System.in); 
		PrintStream ps = new PrintStream(new File("employee.txt"));
		String answer;
		do {
			super.header();
			System.out.print("Enter name: ");
			name = console.next();
			System.out.print("Enter department: ");
			dept = console.next();
			ps.println(name + "\t" +dept); // <---------- write all data to File employee.txt �ѹ�֡�����ŷ���Ѻ�Ҩҡ�����ŧ� employee.txt
			System.out.print("Enter data again? ");
			answer = console.next();
		}while(answer.equalsIgnoreCase("y"));
		
	}
	
	public void read() {
		try {
			Scanner in = new Scanner(new File("employee.txt"));
			int i = 0;
			boolean check = false;
			super.header();
			while(in.hasNext()) {
				name = in.next();
				dept = in.next();
				if(dept.equalsIgnoreCase(super.getDept())) { // <---- � Class EmployeeInfo ���觢����� setDept ���� Employee
															 // �������Ǩ��觤�ҡ�Ѻ��������ҹ
					i++;
					System.out.println(i+ ") " +name);
					check = true;
					
				}
				if(check) {
					super.header();
					System.out.println("\nEmployee in department " + super.getDept() + " is " 
					+ i +" person.");
					super.header();
				}else {
					System.out.println("\nSorry, no department: " +super.getDept() + 
							" in file.");
				}
				in.close();
			}
			
		}catch(IOException e) { // <------ ����� IOException ��ͧ�������Դ���������ҹ����͹㹢�͹���� Scanner
			System.out.print("\nSorry, file not found");
		}
	}

}
