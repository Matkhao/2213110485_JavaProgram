import java.io.*;
import java.util.*;

public class SaveandOpen extends Employee {
	
	private String name;
	private String dept; //แผนก
	
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
			ps.println(name + "\t" +dept); // <---------- write all data to File employee.txt บันทึกข้อมูลที่รับมาจากผู้ใช้ลงใน employee.txt
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
				if(dept.equalsIgnoreCase(super.getDept())) { // <---- ใน Class EmployeeInfo จะส่งข้อมูล setDept ไปให้ Employee
															 // เสร็จแล้วจะส่งค่ากลับมาแล้วใช้งาน
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
			
		}catch(IOException e) { // <------ การใช้ IOException ต้องใช้คำสั่งเปิดไฟล์หรืออ่านไฟล์ก่อนในข้อนี้ใช้ Scanner
			System.out.print("\nSorry, file not found");
		}
	}

}
