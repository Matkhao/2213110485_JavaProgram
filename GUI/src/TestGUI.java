import java.awt.*;
import javax.swing.*;

public class TestGUI extends JFrame{

	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;
	//Components
	private JLabel lblLength,lblWidth,lblArea,lblPerimeter;
	private JTextField txtLength,txtWidth,txtArea,txtPerimeter;
	
	//Constructor Method
	public TestGUI() {
		setTitle("Area and Perimeter");
		setSize(WIDTH,HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//Properties for Components
		lblLength = new JLabel("Enter the lenght:",SwingConstants.RIGHT);
		lblWidth = new JLabel("Entter the width:",SwingConstants.RIGHT);
		lblArea = new JLabel("Area:",SwingConstants.RIGHT);
		lblPerimeter = new JLabel("Perimeter:",SwingConstants.RIGHT);
		//TextField
		//txtLength = new JTextField(10);
		
		GridLayout L = new GridLayout(4,1);
		setLayout(L);
		//Add components
		add(lblLength);
		//add(txtLength);
		add(lblWidth);
		add(lblArea);
		add(lblPerimeter);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGUI prog = new TestGUI();

	}

}
