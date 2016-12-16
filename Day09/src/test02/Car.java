package test02;

public class Car {
	private int speed = 0;
	private String color = "WHITE";
	private String model = "SONATA";
	
	public void speedUp() {
		if(speed < 300)
			speed += 10;
	}
	
	public void speedDown() {
		if(speed >10)
			speed -= 10;
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