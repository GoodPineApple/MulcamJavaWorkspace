package dafault;

import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("문자판별기" + '\n' + "영문자 하나를 입력하시오:");
		String spelling = Input.nextLine();

		char c = spelling.charAt(0);
	}
}