import javax.swing.JOptionPane;

public class IntrotoWritingMethods {

	public static void main(String[] args) {
		IntrotoWritingMethods x = new IntrotoWritingMethods();
	}

	void irock() {
		System.out.println("Nick " + "Rocks");

	}

	void rocker(String z) {
		System.out.println(z + " Rocks");
	}

	void truth(String y) {
		if (y.equals("Rouya Yan")) {

			System.out.println("Rouya Yan is awesome");
		}
		if (y.equals("Justin Bieber")) {
			System.out.println("Justin Bieber sux");
		}
	}

	void echo(String b) {
		if (b.equals("twent")) {
			System.out.println(b + b);
		}
	}

	void repeat(String c, int z) {
		for (int y = 0; y < z; y++) {
			System.out.println("Hello");
		}
	}

	String GetTheBestCoder() {
		return "dave";
	}
	int add(){
	
	}
	

	IntrotoWritingMethods() {
		irock();
		rocker("Shelo");
		truth("Rouya Yan");
		echo("twent");
		repeat("hello", 5);
		System.out.println(GetTheBestCoder());
	}
}
