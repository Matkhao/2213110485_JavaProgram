import javax.swing.*;
public class BookDemo2 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Input author name:");
		String email = JOptionPane.showInputDialog("Input author e-mail:");
		String title = JOptionPane.showInputDialog("Input book title:");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page:"));
		int confirm = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null , "Is the page correct?","Confirm",confirm);
		
		if(confirm == JOptionPane.NO_OPTION) {
			JOptionPane.showInputDialog("Input book page, again");
		}
		Book1 book = new Book1(title,new Author1(name,email),page);
		JOptionPane.showMessageDialog(null,"Book Title :" +title + "\nAuthor name:"+ name +" (" + page + " page )" 
								+"\nAuthor e-mail:" + email);
	}

}
