package test04;

public class Test {
	public static void main(String[] args) {
		int[]numbers = {10, 20, 30, 40, 50};
		
		int[]numbers2 = new int[200];
		
		int[]numbers3;
	//  numbers3 = {10, 20};   ��� �ȵ�
		
		for(int i = 0 ; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		// ���ο� ������ for �ݺ���(foreach��� �θ�) ��������
		for(int n : numbers) {
			if(n/3 ==0 ){
					
			}
			
			System.out.println(n);
		}
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Goodbye");
		String s4 = new String("Goodbye");
		boolean b1 = (s1 == s2);
		boolean b2 = (s3 == s4);
		
		System.out.println(b1 +","+b2);
		}

}
