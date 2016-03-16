import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fortune_Cookie implements ActionListener {

	private JFrame Frame;
	private JButton Button;
	private JPanel Panel;

	public Fortune_Cookie() {
		Frame = new JFrame();
		Panel = new JPanel();
		Button = new JButton();
		Frame.setVisible(true);
		Frame.setSize(100, 100);
		int rand = new Random().nextInt(8);
		Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Frame.add(Panel);
		Panel.add(Button);
		Button.addActionListener(this);
	}

	public static void main(String[] args) {
		Fortune_Cookie h = new Fortune_Cookie();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method random = Integer.parseInt(rand);
		int rand = new Random().nextInt(8);
System.out.println(rand);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "About time you got this out of a fortune cookie");

		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Wouldn't it be ironic to die in the living room?");

		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "The fortune you seek will be in another cookie");

		}

		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will be hungry again in one hour");

		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Meh, i'm out of 'em");

		}
		if (rand == 5) {
			JOptionPane.showMessageDialog(null, "People rely on your dependability..... In bed!");

		}
		if (rand == 6) {
			JOptionPane.showMessageDialog(null, "Made in the USA");

		}
		if (rand == 7) {
			JOptionPane.showMessageDialog(null, "Error 404. Fortune not found");

		}



	}

	void showButton() {

	}
}
