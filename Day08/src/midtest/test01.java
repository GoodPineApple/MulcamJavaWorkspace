package midtest;

public class test01 {

	public static void main(String[] args) {

		int[] array = { 10, 20, 30 };

		for (int i = 0 ; i < 3;  i++) {
			array[i] = array[i] * 2;
			System.out.println(array[i]);
		}
	}
}
