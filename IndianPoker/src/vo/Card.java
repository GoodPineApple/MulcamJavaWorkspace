package vo;

public class Card {
	private int num;
	private String color;
	
	public Card(int num, String color) {
		super();
		this.num = num;
		this.color = color;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Card [num=" + num + ", color=" + color + "]";
	}
	
}