import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("10000���� ���� ������ �Է��Ͻÿ� : ");
		int num = Input.nextInt();
		
//		int first = num / 1000;
//		int second = (num % 1000) / 100;
//		int third = (num % 100) / 10;
//		int fourth = num % 10;
	
		for(int i = 1000; i>0; i=i/10){
			System.out.println(i+"�� �ڸ�: "+(num/i));
			num = num%i;
		}
		
		
//		int first = num / 1000;
//		int second = (num - (first * 1000)) / 100;
//		int third = (num - (first * 1000) - (second * 100)) / 10;
//		int fourth = num - (first * 1000) - (second * 100) - (third * 10) ; 

//		System.out.println("õ�� �ڸ� : " + first);
//		System.out.println("���� �ڸ� : " + second);
//		System.out.println("���� �ڸ� : " + third);
//		System.out.println("���� �ڸ� : " + fourth);
//		
	}
}