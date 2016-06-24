
public class Minion {
	public String name;
	public int eyes;
	public String color;
	public String master;
	Minion(String n,int e,String c,String m){
		name=n;
		eyes=e;
		color=c;
		master=m;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getEyes() {
		return eyes;
	}
	public void setMaster(String master) {
		this.master = master;
	}
	public String getMaster() {
		return master;
	}
}
