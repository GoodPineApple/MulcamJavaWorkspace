package programming;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		
		String text = new String();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��Ͻÿ�");
		text = scan.nextLine();
		
		StringTokenizer st = new StringTokenizer(text);
		
		while (st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		
		
		System.out.println("���"+"���� �ܾ �ֽ��ϴ�");
		
		
	}

}
