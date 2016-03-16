// To summon the Candyman, say his name 5 times in the mirror. You can watch the
// movie trailer if you like.
//
// Create a user interface that has a single button labeled “Candyman”.
//
// When the user presses it 5 times, show them a scary picture from the internet
// using the method below.
//
// private void showPictureFromTheInternet(String imageUrl) {
// try {
// URL url = new URL(imageUrl);
// Icon icon = new ImageIcon(url);
// JLabel imageLabel = new JLabel(icon);
// JFrame frame = new JFrame();
// frame.add(imageLabel);
// frame.setVisible(true);
// frame.pack();
// } catch (MalformedURLException e) {
// e.printStackTrace();
// }
 

// And also play a SCARY or CREEPY sound.
//
// static final int CREEPY = 0;
// static final int SCREAM = 1;
//
// public static void playSound(int whichSound) {
// File soundFile = null;
// if (whichSound == CREEPY)
// soundFile = new File(
// "/Users/Guest/Google Drive/league-sounds/creepy-noise.wav");
// else if (whichSound == SCREAM)
// soundFile = new File(
// "/Users/League/Google Drive/league-sounds/scream.wav");
// try {
// AudioInputStream audioInputStream = AudioSystem
// .getAudioInputStream(soundFile);
// Clip clip = AudioSystem.getClip();
// clip.open(audioInputStream);
// clip.start();
// Thread.sleep(3400);
// } catch (Exception ex) {
// ex.printStackTrace();
// }
// }
// }
//
//
///
///
///
 ///
 ///
 ///
 /////
/////////