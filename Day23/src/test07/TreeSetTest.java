package test07;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		
		
		set.add("MILK");
		set.add("BREAD");
		set.add("BUTTER");
		set.add("Cheese");
		set.add("Cheese");
		
		System.out.println(set); // ���ĺ� ������ ����
	}

}
