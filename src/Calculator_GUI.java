import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator_GUI implements ActionListener {
	JFrame frame;
	JButton add;
	JButton subtract;
	JButton multiply;
	JButton divide;
	JPanel panel;
	JTextField textfield1;
	JTextField textfield2;
	public static void main(String[] args) {
		Calculator_GUI Calculator_GUI = new Calculator_GUI();
	}

	Calculator_GUI() {
		textfield1 = new JTextField(2);
		textfield2 = new JTextField(2);
		frame = new JFrame();
		add = new JButton();
		subtract = new JButton();
		multiply = new JButton();
		divide = new JButton();
		panel = new JPanel();
		add.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		subtract.addActionListener(this);
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(add);	
		panel.add(divide);
		panel.add(multiply);
		panel.add(subtract);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == add){
			JOptionPane.showMessageDialog(null, "Add");
		}
		if(e.getSource() == divide){
			JOptionPane.showMessageDialog(null, "Divide");
		}
		if(e.getSource() == subtract){
			JOptionPane.showMessageDialog(null, "Multiply");
		}
		if(e.getSource() == multiply){
			JOptionPane.showMessageDialog(null, "Subtract");
		}
	}
}
