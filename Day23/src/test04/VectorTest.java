package test04;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector vc = new Vector<>();
		
		vc.add("Hello World");
		vc.add(new Integer(10));
		vc.addElement(20);
		
		System.out.println("vector size :" + vc.size());
		
		for(int i = 0; i < vc.size(); i++) {
			System.out.println("vector element " + i + ":" + vc.get(i));
		}
		String s = (String) vc.get(0); //get()�� ObjectŸ���̹Ƿ� ����ȯ�ؼ� ����ؾ���
		
		System.out.println(s);
	}

}
