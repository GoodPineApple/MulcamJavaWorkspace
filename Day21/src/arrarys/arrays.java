package arrarys;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		
		int[] array = {1, 3, 9, 7, 5};
		Arrays.sort(array); //배열을 작은 수부터 큰 수순으로 정렬함 
		printArrays(array); //전체 배열 출력 
		
		System.out.println(Arrays.binarySearch(array, 9));
		//배열에 있어서 해당 숫자의 인덱스값을 출력
		//9의 경우에는 0-4 인덱스 중 5번째이므로 4 출력
		
		Arrays.fill(array, 7); //모든 배열을 수 7로 채움(fill)
		printArrays(array); //전체 배열 출력 
	}

	private static void printArrays(int[] array) {//printArrays 메소드
System.out.print("[");		
for (int i =0; i<array.length; i++){ //for 반복문 사용
	System.out.print(array[i]+" ");
}	System.out.print("]");

	}

}
