import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("����� �̸��� �Է��Ͻÿ� : ");
		String name = Input.nextLine();

		System.out.print("����� ���̸� �Է��Ͻÿ� : ");
		int age = Input.nextInt();
		
		System.out.println(name + "���� " + age + "�� �Դϴ�.");
	
	}

}

