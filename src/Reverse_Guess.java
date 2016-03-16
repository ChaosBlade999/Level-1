import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reverse_Guess implements ActionListener {
	JButton button;
	JFrame frame;
	JPanel panel;
	JTextField textfield;
	Random r;

	public static void main(String[] args) {
		Reverse_Guess x = new Reverse_Guess();
	}

	Reverse_Guess() {
		r = new Random();
		textfield = new JTextField(2);
		panel = new JPanel();
		button = new JButton("Guess");
		frame = new JFrame();
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100, 100);
		panel.add(textfield);
		panel.add(button);
		frame.add(panel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button) {
			String x = textfield.getText();
			int y = Integer.parseInt(x);
			int z = 0 ;
			for (int i = 0; y != r.nextInt(100)+1 ; i++) {
			z = i;		
			}
			System.out.println(z);
			JOptionPane.showMessageDialog(null, "Computer guessed your number! It was " +  y + ", He guessed it in " + z + " tries!"); 
		}

	}
}