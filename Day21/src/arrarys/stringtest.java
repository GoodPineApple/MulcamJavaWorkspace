package arrarys;

import java.util.StringTokenizer;

public class stringtest {
	
	public static void main(String[] args) {
		
		String s = "a lot_ of_ sugar"; //���ڿ� ��ü ���� 
		
		StringTokenizer st = new StringTokenizer(s, "_"); //���ڿ� ��ü�� ����ȭ
		//�κ��� _ �������� ����, _ �յڷ� ���ڸ� ����ȭ
		//boolean���� ������ �κ��ڷ� ����ȭ���� ���� 
		
		while(st.hasMoreTokens()){//��� ������ �� ������ ����ȭ
			System.out.println(st.nextToken());
		}
	}

}
