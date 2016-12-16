package dafault;
import java.util.Scanner;

public class Programming10 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		long a = 0, b = 1, c=0;
		int i;
		
		for(i = 2; i<=10; i++){
			System.out.print(c);
			c = a+b;
			b = a;
			c = b;     // 10_1
		}
			
		
	}

}
