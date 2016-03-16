import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Restaurant_Reservation {
	JLabel label;
	JFrame frame;
	JPanel panel;
	JTextField textfield1;
	JTextField textfield2;
	JTextField textfield3;

	Restaurant_Reservation() {
		label = new JLabel();
		frame = new JFrame();
		panel = new JPanel();
		textfield1 = new JTextField();
		textfield2 = new JTextField();
		textfield3 = new JTextField();
		frame.add(panel);
		panel.add(textfield1);
		panel.add(label);
		panel.add(textfield2);
		panel.add(textfield3);
		frame.setVisible(true);
		frame.setSize(200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	class Reservation {

	}
}
