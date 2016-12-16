package test01;

import java.util.List;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		String[] words = {"banana", "apple", "tomato", "orage"};
		
		words[0] = "pineapple";
		words[4] = "graps";
		
		List<String> wordsList = Arrays.asList(words);
		wordsList.add("graps");
		
		System.out.println("리스트 크기:" + wordsList);
	}

}
