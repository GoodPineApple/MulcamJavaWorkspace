package lab;

public class Box {
	private int width;
	private int length;
	private int height;
	int volume;
	
	public int getVolume() {
		return volume = width * height * length;
	}
	
	void printBox() {
		System.out.println("가로:" + width + " 세로 :" + length + " 높이:" + height + " 부피:" + volume);
	}
	
	void setWidth(int cm) {
		width = cm;
	}
	int getWidth() {
		return width;
	}
	
	void setLength(int cm) {
		length = cm;
	}
	int getLength() {
		return length;
	}
	
	void setHeight(int cm) {
		height = cm;
	}
	int getHeight() {
		return height;
	}

}

