package programming03;

public class Box {
	private double width;
	private double length;
	private double height;
	private boolean empty = true;

	public Box() {
		
	}
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
}
