import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
public class Candyman implements ActionListener {
	public JFrame frame=new JFrame();
	public JPanel panel=new JPanel();
	public JButton button=new JButton();
	public int p=0;
	static final int CREEPY = 0;
	static final int SCREAM = 1;
	public static void main(String[] args) {
		Candyman c=new Candyman();
		c.Run();
	}
	public void Run(){
		frame.setVisible(true);
		button.setText("Candyman");
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		p++;
		if(p>4){
			Candyman c=new Candyman();
			c.showPictureFromTheInternet("http://i.ytimg.com/vi/L6Z2hkd4uhQ/maxresdefault.jpg");
			c.playSound(SCREAM);
			
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}
	public static void playSound(int whichSound) {
		File soundFile = null;
	   	 if (whichSound == CREEPY)
	   		 soundFile = new File(
	   				 "/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
	   	 else if (whichSound == SCREAM)
	   		 soundFile = new File(
	   				 "/Users/League/Google Drive/league-sounds/scream.wav");
	   	 try {
	   		 AudioInputStream audioInputStream = AudioSystem
	   				 .getAudioInputStream(soundFile);
	   		 Clip clip = AudioSystem.getClip();
	   		 clip.open(audioInputStream);
	   		 clip.start();
	   		 Thread.sleep(3400);
	   	 } catch (Exception ex) {
	   		 ex.printStackTrace();
	   	 }
	    }
	}


