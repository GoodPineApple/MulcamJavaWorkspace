
public class Exam09 {

	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c;
		
		System.out.print(a +", " + b);
		
		do {
			c = a + b;
			a = b;			
			b = c;
			System.out.print(", "+ c);
		} while(c<=10000000);
		
	}

}
