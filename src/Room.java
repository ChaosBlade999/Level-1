import javax.swing.JOptionPane;

public class Room {
	String title;
	String desc;
	String option1;
	String option2;
	String option3;
	String option4;
	String option5;
	int id;
	int i1;
	int i2;
	int i3;
	int i4;
	int i5;
	int ri;
	Room(String t, String d, String o1, String o2, String o3, String o4, String o5, int i1, int i2, int i3, int i4, int i5, int i){
		title=t;
		desc=d;
		option1=o1;
		option1=o2;
		option1=o3;
		option1=o4;
		option1=o5;
		id=i;
	}
	public void display(){
		String input=JOptionPane.showInputDialog(desc);
		if(input.equals(option1)){
			ri=i1;
		}else if(input.equals(option2)){
			ri=i2;
		}else if(input.equals(option3)){
			ri=i3;
		}else if(input.equals(option4)){
			ri=i4;
		}else if(input.equals(option5)){
			ri=i5;
		}else{
			
		}
	}
	public int GetId(){
		
	}
}
