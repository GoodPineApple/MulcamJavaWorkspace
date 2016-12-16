package dafault;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.print("원하는 단수를 입력하시오 :");
		int dan = Input.nextInt();

		for (int i = 9; i > 0; i--) { 
			System.out.print(dan + "x" + i + "=" + dan * i + '\t');

		}
	}

}
