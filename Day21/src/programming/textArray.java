package programming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

import arrarys.arrays;

public class textArray {
	public static void main(String[] args) {

		String text[] = { "a", "cup", "of", "water" };
		Arrays.sort(text);
		Printarrays(text);		
	
		
	
	}	
	private static void Printarrays(String[] text) {
		System.out.println("정렬된 단어는 다음과 같습니다");
		
		for (int i =0; i<text.length; i++){ //for 반복문 사용
			System.out.println(text[i]+" ");
	}
}}
