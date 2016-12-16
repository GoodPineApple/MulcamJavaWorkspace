package programming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String text = new String();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하시오");
		text = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(text);
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
		System.out.println("모두"+"개의 단어가 있습니다");
		
		
	}

}
