import java.util.*;

public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Cylinder[] cylinder = new Cylinder[5];
		double radius,height;
		for(int i =1 ; i<=cylinder.length ;i++) {
			System.out.print("Input radius : ");
			radius = scan.nextDouble();
			System.out.print("Input height : ");
			height = scan.nextDouble();
			cylinder[i] = new Cylinder(radius,height);
		}
		System.out.println();
		for(int i =1 ; i<=cylinder.length ; i++) {
			System.out.println("Cylinder "+i+","+"volume="+cylinder[i].getVolume());
		}
		scan.close();
	}

}
