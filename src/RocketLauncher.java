public class RocketLauncher{
	public static void main(String[] args){
		//All code goes here.
		Rocket solace = new Rocket();
		solace.launch();
	}
}

class Rocket{
	Rocket(){
		System.out.println("You’ve just built a new rocket!!");
	}
	public void launch(){
		System.out.println("ZOOOOOOM!");
	} 
}
