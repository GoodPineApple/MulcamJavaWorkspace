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
		System.out.println("������ " + union); //addAll ������
		
		Set<String> intersection = new HashSet<String>(s1);
		intersection.retainAll(s2);
		System.out.println("������ " + intersection); //retainAll ������
		
		Set<String> IsContain = new HashSet<String>(s1);
		IsContain.containsAll(s2);
		System.out.println("�κ����� " + IsContain); //containsAll �κ�����
		
		Set<String> removed = new HashSet<String>(s1);
		removed.removeAll(s2);
		System.out.println("������ " + removed); //removeAll ������
		
		
	}

}
