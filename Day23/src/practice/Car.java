package practice;

public class Car {
	public int count1;
	public static int count2;
	
	public Car() {
		super();
		count1++;
		count2++;
	}
	
	public String toString() { 
		return "count1" + count1 + "count2" + count2;
	}
}
