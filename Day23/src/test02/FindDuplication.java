package test02;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		String[] sample = {"빠빰빠", "빠밤밤빠", "빠빠빠", "빠빰빠", "따리리따리리따리리"};
		for(String a : sample) {
			if(!s.add(a)) {
				System.out.println("중복된 단어:" + a);
				System.out.println(s.size() + "중복되지 않은 단어:" + s);
			}
		}
		
	}

}
