package dafault;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.println("구구단 출력기");
		for (int a = 2; a <= 9; a++) {

			for (int i = 1; i <= 9; i++) {
				System.out.print(a + "x" + i + "=" + a * i + '\t');
			}
			
			System.out.print('\n');
		}
	}

}
