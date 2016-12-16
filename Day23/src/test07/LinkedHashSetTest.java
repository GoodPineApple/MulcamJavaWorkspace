package test07;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		
		set.add("MILK");
		set.add("BREAD");
		set.add("BUTTER");
		set.add("Cheese");
		set.add("Cheese");
		
		System.out.println(set); // 입력된 순서대로 출력
	}

}
