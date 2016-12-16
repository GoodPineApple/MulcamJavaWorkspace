package test04;

public class Test {
	public static void main(String[] args) {
		
	int i = 10;
	String s1 = i + ""; // 기초자료형을 문자열로 표현
	System.out.println(s1+10); 
	
//////////////////////////////////////////////////

	String s2 = "123";
	System.out.println(s2+10);  
	
	int i2 = Integer.parseInt(s2);
	double i3 = Double.parseDouble(s2); // 문자열을 기초자료형으로 변형
		
	System.out.println(i2*10);
	System.out.println(i3+10); 
	
	}

}
