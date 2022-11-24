import javax.swing.*;
import java.text.*;
import java.util.Random;
public class Lab303 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("###,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog(null,"Your balance is : "+frm.format(balance)+
				"\nInput money to withdraw:","Input",JOptionPane.QUESTION_MESSAGE));
		int thousand = withdraw / 1000;
		int fivehundred = (withdraw%1000)/500;
		int hundred = (withdraw%500)/100;
		int check = withdraw%100;
		
		if (withdraw>balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw>20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (check>=1) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw "+check+" baht.","ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw<=balance) {
			JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(withdraw)+" baht."+"\n1,000 = "+thousand+
					"\n500 = "+fivehundred +"\n100 = "+hundred);
			
		}
	}

}
