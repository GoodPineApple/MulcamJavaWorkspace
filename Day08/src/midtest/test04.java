package midtest;

public class test04 {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40};
		
		//���� ����
		int[] numbers2 = numbers;
		for(int n : numbers2) {
			System.out.println(n);
		}
		
		//���� ����
		int[] numbers3 = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			numbers3[i] = numbers[i];
			System.out.println(numbers3[i]);
		}
		
		
	}

}
