package dafault;
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		int num;
		int sum = 0;
	
//		do {
//			System.out.print("����Է�:");
//			num = Input.nextInt();
//			sum += num;
//		} while (num > 0);

		
		while(true){
			System.out.print("����Է�:");
			num = Input.nextInt();
			
			if(num<=0)
				break;
		}
		System.out.println("���ݱ��� �Է��� ���� ������ " + sum);

	}

}
