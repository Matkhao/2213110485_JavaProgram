import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder[] cylinder = new Cylinder[5];
		String cld = "";
		for(int i =0;i<cylinder.length;i++) {
		double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input height"));
		cylinder[i] = new Cylinder(radius,height);
		}
		for(int i =0;i<cylinder.length;i++) {
			cld += "Cylinder " +(i+1)+", volume= "+cylinder[i].getVolume()+"\n";
		}
		JOptionPane.showMessageDialog(null, cld);
	}

}
