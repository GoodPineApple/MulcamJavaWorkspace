package programming01;

public class Circle {
	private double r, cx, cy;
	double area;
	
	double area(){
		return area = r * r * Math.PI;
	}
	
	public void setR(double n) {
		r = n;
	}
	public double getR(){
		return r;
	}
	
	public void setCx(double n) {
		cx = n;
	}
	public double getCx(){
		return cx;
	}
	
	public void setCy(double n) {
		cy = n;
	}
	public double getCy(){
		return cy;
	}
	
}
