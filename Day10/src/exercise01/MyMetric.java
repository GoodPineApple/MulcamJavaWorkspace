package exercise01;

public class MyMetric {
	
	public static String kilotoMile(double kilo) {
		double mile;
		mile = kilo*621/1000;
		return kilo + "km�� " + mile + "�����Դϴ�.";
	}
	
	public static String miletoKilo(double mile) {
		double kilo;
		kilo = mile*1609/100;
		return mile + "������ " + kilo + "km�Դϴ�.";
	}
}
