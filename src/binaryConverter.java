import javax.swing.*;

public class binaryConverter {
	static JFrame frame=new JFrame();
	static JPanel p=new JPanel();
	static JTextField ascii=new JTextField();
	static JTextField answer=new JTextField();
	static JButton b=new JButton();
	public static void main(String[] args) {
		frame.add(p);
		p.add(ascii);
		p.add(answer);
		p.add(b);
	}
}
