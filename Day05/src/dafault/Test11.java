package dafault;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		int num;
		int sum = 0;
	
//		do {
//			System.out.print("양수입력:");
//			num = Input.nextInt();
//			sum += num;
//		} while (num > 0);

		
		while(true){
			System.out.print("양수입력:");
			num = Input.nextInt();
			
			if(num<=0)
				break;
		}
		System.out.println("지금까지 입력한 숫자 총합은 " + sum);

	}

}
