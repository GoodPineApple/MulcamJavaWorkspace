package arrarys;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		
		int[] array = {1, 3, 9, 7, 5};
		Arrays.sort(array); //�迭�� ���� ������ ū �������� ������ 
		printArrays(array); //��ü �迭 ��� 
		
		System.out.println(Arrays.binarySearch(array, 9));
		//�迭�� �־ �ش� ������ �ε������� ���
		//9�� ��쿡�� 0-4 �ε��� �� 5��°�̹Ƿ� 4 ���
		
		Arrays.fill(array, 7); //��� �迭�� �� 7�� ä��(fill)
		printArrays(array); //��ü �迭 ��� 
	}

	private static void printArrays(int[] array) {//printArrays �޼ҵ�
System.out.print("[");		
for (int i =0; i<array.length; i++){ //for �ݺ��� ���
	System.out.print(array[i]+" ");
}	System.out.print("]");

	}

}
