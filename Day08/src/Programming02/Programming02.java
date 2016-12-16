package Programming02;

import java.util.Scanner;

public class Programming02 {
	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);

		System.out.println("정수 10개를 입력하시오");
		int array[] = new int[10];
		int starCount[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			array[i] = Input.nextInt();
			starCount[(array[i] - 1) / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(((10 * i) + 1) + "~" + ((i * 10) + 10) + ":");
			for (int j = 0; j < starCount[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
