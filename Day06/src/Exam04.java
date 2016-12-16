import java.util.Scanner;

public class Exam04 {
	
	public static void main(String[] args) {
		
		Scanner Input = new Scanner(System.in);
		
		System.out.print("당신의 이름을 입력하시오 : ");
		String name = Input.nextLine();

		System.out.print("당신의 나이를 입력하시오 : ");
		int age = Input.nextInt();
		
		System.out.println(name + "씨는 " + age + "세 입니다.");
	
	}

}

