package test02;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"������", "������", "������", "������", "������������������"};
		for(String a : sample) {
			if(!s.add(a)) {
				System.out.println("�ߺ��� �ܾ�:" + a);
				System.out.println(s.size() + "�ߺ����� ���� �ܾ�:" + s);
			}
		}
		
	}

}
