package test05;

public class Car {
	private int speed = 0;
	private String color = "WHITE";
	private String model = "SONATA";
	
	public void speedUp() {
			speed += 10;
	}
	public void speedUp(int s) {
			speed += s;
	}
	
	
	public String toString() {
		return "����:" + color + ", ��:" + model + ", ����ӵ�:" + speed;
	}
	
	
//////////////////////////////////////////////////////////////////////////
	
	public void setcolor(String c){
		color = c;
	}
	public String getcolor(){
		return color;
	}
	
	public void setmodel(String c){
		model = c;
	}
	public String getmodel(){
		return model;
	}
	
	public void setspeed(int c){
		if(c<300 && c>0)
			speed = c;
	}
	public int getspeed(){
		return speed;
	}
}
 // ��125-10���� �簳�� ����258-0846