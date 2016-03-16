
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Quiz1 implements ActionListener {
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Button1");
	JButton button2 = new JButton("Button2");
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		Quiz1 x = new Quiz1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Hello");

		}
		if (button2 == e.getSource()) {
			JOptionPane.showMessageDialog(null, "Goodbye");

		}
	}
	
	Quiz1() {
		frame.setVisible(true);
		frame.setSize(100, 100);
		button1.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
	}

}
