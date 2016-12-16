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
		System.out.println(year + "년 " + month + " " + day + "일 입니다.");
	}
	
	public String toString() {
		return "날짜는 " + year + "년 " + month + " " + day + "일 입니다.";
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
