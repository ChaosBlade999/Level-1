import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DateAndTime implements ActionListener {
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JFrame frame;

	public static void main(String[] args) {

		DateAndTime x = new DateAndTime();
	}

	DateAndTime() {
		panel = new JPanel();
		button1 = new JButton("Date");
		frame = new JFrame("Much WOW");
		button2 = new JButton("Time");
		frame.add(panel);
		panel.add(button1);
		button1.addActionListener(this);
		panel.add(button2);
		button2.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(1000, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Calendar cal = Calendar.getInstance();
		String calen = cal.getTime().toString();
		String time = cal.getTime().toString();
		String x = calen.substring(0, 11);
		String y = time.substring(11, 20);
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, x);
		}
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, y);
		}
	}
}