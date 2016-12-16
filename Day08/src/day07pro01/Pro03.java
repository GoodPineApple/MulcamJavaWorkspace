package day07pro01;

import java.util.Scanner;

public class Pro03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("문장을 입력하시오. : ");
		String inputString = scan.nextLine();

		int countAlphabet = 0, countNum = 0, countSpace = 0;

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				countAlphabet++;
			} else if (c >= '0' && c <= '9') {
				countNum++;
			} else if (c == ' ') {
				countSpace++;
			}
		} 
		System.out.println("알파뱃의 갯수 : " + countAlphabet);
		System.out.println("숫자의 갯수 : " + countNum);
		System.out.println("공백의 갯수 : " + countSpace);
	}

}
