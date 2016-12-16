package test08;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		Set<String> s1 = new HashSet<String>();
		Set<String> s2 = new HashSet<String>();
		
		s1.add("A");
		s1.add("B");
		s1.add("C");
		
		s2.add("A");
		s2.add("D");
		
		Set<String> union = new HashSet<String>(s1);
		union.addAll(s2);
		System.out.println("합집합 " + union); //addAll 합집합
		
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);
		System.out.println("교집합 " + intersection); //retainAll 교집합
		
		Set<String> IsContain = new HashSet<String>(s1);
		IsContain.containsAll(s2);
		System.out.println("부분집합 " + IsContain); //containsAll 부분집합
		
		Set<String> removed = new HashSet<String>(s1);
		removed.removeAll(s2);
		System.out.println("차집합 " + removed); //removeAll 차집합
		
		
	}

}
