import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFirstGUI implements ActionListener {
	JFrame Window;
	JPanel Panel;
	JButton up;
	JButton down;
	JButton left;
	JButton right;
	int lastClicked;

	public static void main(String[] args) {
		MyFirstGUI x = new MyFirstGUI();

	}

	MyFirstGUI() {
		Window = new JFrame();
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Window.setSize(500, 100);
		Panel = new JPanel();
		up = new JButton("Up");
		down = new JButton("Down");
		left = new JButton("Left");
		right = new JButton("Right");
		Panel.add(up);
		Panel.add(down);
		Panel.add(left);
		Panel.add(right);
		Window.add(Panel);
		up.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
		right.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == up) {
			if (lastClicked != 5) {

				System.out.println("Up");
				lastClicked = 5;
			}

		} else if (e.getSource() == down) {
			if (lastClicked != 6) {

				System.out.println("Down");
				lastClicked = 6;
			}
		} else if (e.getSource() == left) {
			if (lastClicked != 7) {

				System.out.println("Left");
				lastClicked = 7;
			}
		} else if (e.getSource() == right) {
			if (lastClicked != 8) {

				System.out.println("Right");
				lastClicked = 8;
			}
		}
	}
}