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
		System.out.println("����:" + width + " ���� :" + length + " ����:" + height + " ����:" + volume);
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

