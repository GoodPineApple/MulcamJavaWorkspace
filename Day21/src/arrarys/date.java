package arrarys;

import java.util.Date;

public class date {
	public static void main(String[] args) {
		

		Date d = new Date( ); //���� ��¥�� Date ��ü�� ���� 
		System.out.println(d);
		
		//get�� ���� ���� ��, ���ο� �ڹٹ������� �� �̻� ������� �ʴ´ٴ� �ǹ�
		System.out.println(1900+d.getYear()); //��ü�κ��� ��,��,�� ���!
		System.out.println(d.getMonth());
		System.out.println(d.getDate());
		
		d.setHours(12);
		d.setMinutes(34);
		d.setSeconds(0);
		System.out.println(d);
		
		
	}

}
