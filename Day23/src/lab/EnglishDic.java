package lab;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		Map<String, String> st = new HashMap<String, String>();
		
		st.put("map", "����");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("���� �ܾ �Է��Ͻÿ�.");
			String key = input.next();
			if(key.equals("quit")) {
				break;
			}
			System.out.println("�ܾ��� �ǹ̴� " + st.get(key));
		} while(true);
		
	}

}