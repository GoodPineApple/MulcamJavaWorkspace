package test08;

public class Date {
	private int year;
	private String month;
	private int day;
	
	public void setDate(int y, String m, int d) {
		year = y;
		month = m;
		day = d;
	}
	
	public void pritDate() {
		System.out.println(year + "�� " + month + " " + day + "�� �Դϴ�.");
	}
	
	public String toString() {
		return "��¥�� " + year + "�� " + month + " " + day + "�� �Դϴ�.";
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int y) {
		year = y;
	}
	
	public String getMonth() {
		return month;
	}
	public void setMonth(String m) {
		month = m;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int d) {
		day = d;
	}
	
}
